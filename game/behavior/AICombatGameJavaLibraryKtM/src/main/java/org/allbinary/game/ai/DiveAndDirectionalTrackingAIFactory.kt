
        /*
                * 
                *  AllBinary Open License Version 1
                *  Copyright (c) 2011 AllBinary
                *  
                *  By agreeing to this license you and any business entity you represent are
                *  legally bound to the AllBinary Open License Version 1 legal agreement.
                *  
                *  You may obtain the AllBinary Open License Version 1 legal agreement from
                *  AllBinary or the root directory of AllBinary's AllBinary Platform repository.
                *  
                *  Created By: Travis Berthelot  
        */
        
        /* Generated Code Do Not Modify */
        package org.allbinary.game.ai



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.ai.ArtificialIntelligenceInterface
import org.allbinary.game.ai.tactical.BasicRandomAIFactory
import org.allbinary.game.input.GameInput
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.logic.util.visitor.Visitor

open public class DiveAndDirectionalTrackingAIFactory
            : Object
        
                , ArtificialIntelligenceInterfaceFactoryInterface {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            
open fun getInstance(hashtable: Hashtable<Any, Any>, ownerLayerInterface: AllBinaryLayer, gameInput: GameInput)
        //nullable =  from not(true or (false and false)) = 
: ArtificialIntelligenceInterface{

                    var hashtable = hashtable


                    var ownerLayerInterface = ownerLayerInterface


                    var gameInput = gameInput

    var visitor: Visitor = hashtable!!.get(BasicAI.AI_VISITOR) as Visitor


    
                        if(visitor == 
                                    null
                                )
                        
                                    {
                                    visitor= ThrustAIVisitorFactory.getInstance()

                                    }
                                

    var hashtable2: Hashtable<Any, Any> = BasicProbabilityAIDataFactory().
                            getInstance()!!
            

hashtable2!!.put(BasicAI.AI_VISITOR, LastKeyAIVisitorFactory.getInstance())

    var artificialIntelligenceInterface: ArtificialIntelligenceInterface = BasicRandomAIFactory().
                            getInstance(hashtable2, ownerLayerInterface, gameInput)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DiveAndDirectionalTrackingAI(ownerLayerInterface, artificialIntelligenceInterface, gameInput, visitor)
}


}
                
            

