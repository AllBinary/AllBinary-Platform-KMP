
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
        package org.allbinary.game.ai.scroller




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.ai.ArtificialIntelligenceInterface
import org.allbinary.game.ai.ArtificialIntelligenceInterfaceFactoryInterface
import org.allbinary.game.input.GameInput
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.logic.math.SmallIntegerSingletonFactory

open public class TerrainPatrolAIFactory
            : Object
        
                , ArtificialIntelligenceInterfaceFactoryInterface {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            override fun getInstance(hashtable: Hashtable<Any, Any>, ownerLayerInterface: AllBinaryLayer, gameInput: GameInput)
        //nullable =  from not(true or (false and false)) = 
: ArtificialIntelligenceInterface

        Updates for KMP build        
        {
    //var hashtable = hashtable
    //var ownerLayerInterface = ownerLayerInterface
    //var gameInput = gameInput
hashtable.put(BasePatrolAI.MAX_DISTANCE, SmallIntegerSingletonFactory.getInstance()!!.getInstance(220))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TerrainPatrolAI(hashtable, ownerLayerInterface, gameInput)
}


}
                
            

