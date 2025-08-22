
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
        
import org.allbinary.string.CommonStrings

open public class LayerProcessor
            : Object
        
                , LayerProcessorInterface {
        

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val layerManager: LayerManager
public constructor        (layerManager: LayerManager)
            : super()
        {

                    var layerManager = layerManager
this.layerManager= layerManager
}


                @Throws(Exception::class)
            override fun process(allBinaryLayerManager: AllBinaryLayerManager, layerInterface: AllBinaryLayer, index: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryLayerManager = allBinaryLayerManager


                    var layerInterface = layerInterface


                    var index = index



                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


                @Throws(Exception::class)
            override fun isProcessorLayer(layerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var layerInterface = layerInterface



                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}

override fun getLayerManager()
        //nullable = true from not(false or (false and true)) = true
: LayerManager{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return layerManager
}


                @Throws(Exception::class)
            override fun process(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryLayerManager = allBinaryLayerManager

    var layerManager: LayerManager = this.getLayerManager()!!


    var size: Int = layerManager!!.getSize()!!





                        for (index in 0 until size)


        {this.process(allBinaryLayerManager, layerManager!!.getLayerAt(index) as AllBinaryLayer, index)
}

}


}
                
            

