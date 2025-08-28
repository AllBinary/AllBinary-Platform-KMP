
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
        package org.allbinary.game.input




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.layer.LayerProcessor

open public class GameInputLayerProcessor : LayerProcessor {
        
public constructor        ()                        

                            : super(GameInputLayerManager())

        Updates for KMP build        
        {


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            override fun process(allBinaryLayerManager: AllBinaryLayerManager, layerInterface: AllBinaryLayer, index: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var allBinaryLayerManager = allBinaryLayerManager
    //var layerInterface = layerInterface
    //var index = index

    var gameInputInterface: GameInputInterface = layerInterface as GameInputInterface

gameInputInterface!!.processInput(allBinaryLayerManager)
}

override fun isProcessorLayer(layerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
    //var layerInterface = layerInterface

    
                        if(layerInterface!!.implmentsGameInputInterface())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


}
                
            

