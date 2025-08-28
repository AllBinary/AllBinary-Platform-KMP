
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
        package org.allbinary.layer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
interface LayerProcessorInterface : BasicLayerProcessorInterface {
        

open fun getLayerManager()
        //nullable = true from not(false or (false and true)) = true
: LayerManager

        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun process(allBinaryLayerManager: AllBinaryLayerManager, layerInterface: AllBinaryLayer, index: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun isProcessorLayer(layerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        

}
                
            

