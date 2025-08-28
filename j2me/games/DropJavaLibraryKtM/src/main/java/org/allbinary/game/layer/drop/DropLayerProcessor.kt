
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
        package org.allbinary.game.layer.drop




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.layer.BasicLayerProcessor
import org.allbinary.util.BasicArrayList

open public class DropLayerProcessor : BasicLayerProcessor {
        

        companion object {
            
    private val LAYER_PROCESSOR: BasicLayerProcessor = DropLayerProcessor()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BasicLayerProcessor

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return LAYER_PROCESSOR
}


        }
            private constructor        ()

        Updates for KMP build        
        {
}


                @Throws(Exception::class)
            override fun process(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var allBinaryLayerManager = allBinaryLayerManager

    var list: BasicArrayList = this.getList()!!


    var size: Int = list.size()!!





                        for (index in 0 until size)

        

        Updates for KMP build        
        {

    var layerInterface: AllBinaryLayer = list.objectArray[index]!! as AllBinaryLayer


    var dropLayerInterface: DropLayerInterface = layerInterface as DropLayerInterface

allBinaryLayerManager!!.append(dropLayerInterface!!.getDroppedLayer() as AllBinaryLayer)
}

list.clear()
}


}
                
            

