
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
        package org.allbinary.game.ai.sequence




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.ai.ArtificialIntelligenceInterface
import org.allbinary.game.input.GameInput
import org.allbinary.layer.AllBinaryLayer

open public class NumberLayersSequenceAIFactory
            : Object
         {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun getInstance(numberOfEnemiesLeft: Int, artificialIntelligenceInterface: Array<ArtificialIntelligenceInterface?>, ownerLayerInterface: AllBinaryLayer, gameInput: GameInput)
        //nullable =  from not(true or (false and false)) = 
: ArtificialIntelligenceInterface{

                    var numberOfEnemiesLeft = numberOfEnemiesLeft


                    var artificialIntelligenceInterface = artificialIntelligenceInterface


                    var ownerLayerInterface = ownerLayerInterface


                    var gameInput = gameInput



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NumberLayersSequenceAI(numberOfEnemiesLeft, artificialIntelligenceInterface, ownerLayerInterface, gameInput)
}


}
                
            

