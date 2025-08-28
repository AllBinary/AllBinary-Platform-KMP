
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
        package org.allbinary.game.tick




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.AllBinaryGameLayer
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.layer.LayerProcessor

open public class OptimizedTickableLayerProcessor : LayerProcessor {
        
public constructor        ()                        

                            : super(OptimizedTickableLayerManager()){


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            override fun process(allBinaryLayerManager: AllBinaryLayerManager, layerInterface: AllBinaryLayer, index: Int)
        //nullable = true from not(false or (false and false)) = true
{
var allBinaryLayerManager = allBinaryLayerManager
var layerInterface = layerInterface
var index = index

    var tickableInterface: AllBinaryGameLayer = layerInterface as AllBinaryGameLayer

tickableInterface!!.processTick(allBinaryLayerManager)
}

override fun isProcessorLayer(layerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var layerInterface = layerInterface

    
                        if(layerInterface!!.implmentsTickableInterface())
                        
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
                
            

