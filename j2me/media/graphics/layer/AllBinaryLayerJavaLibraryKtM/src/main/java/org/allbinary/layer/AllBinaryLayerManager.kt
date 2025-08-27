
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
        
import org.allbinary.layer.event.LayerManagerEvent
import org.allbinary.layer.event.LayerManagerEventHandler
import org.allbinary.logic.communication.log.LogUtil

open public class AllBinaryLayerManager : LayerManager {
        

    private val layerManagerEventHandler: LayerManagerEventHandler = LayerManagerEventHandler.getInstance()!!

    private val createLayerManagerEvent: LayerManagerEvent = LayerManagerEvent(this, this.layerManagerEventHandler!!.CREATE)

    private val deleteLayerManagerEvent: LayerManagerEvent = LayerManagerEvent(this, this.layerManagerEventHandler!!.DELETE)

    private var basicLayerProcessorArray: Array<LayerProcessor?> = arrayOfNulls(0)
protected constructor        (){}


open fun getLayerProcessorArray()
        //nullable = true from not(false or (false and true)) = true
: Array<LayerProcessor?>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return basicLayerProcessorArray
}


open fun setLayerProcessorArray(layerProcessorArray: Array<LayerProcessor?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var layerProcessorArray = layerProcessorArray
this.basicLayerProcessorArray= layerProcessorArray
}


open fun log()
        //nullable = true from not(false or (false and true)) = true
{
    var size: Int = this.basicLayerProcessorArray!!.size
                





                        for (index in 0 until size)

        {
    var layerProcessorInterface: LayerProcessor = basicLayerProcessorArray[index]!!

}

}


                @Throws(Exception::class)
            override fun append(layerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var layerInterface = layerInterface

    
                        if(!this.contains(layerInterface))
                        
                                    {
                                    this.appendProcessors(layerInterface)
super.append(layerInterface)

                                    }
                                
}


                @Throws(Exception::class)
            override fun append(layerInterface: AllBinaryLayer, index: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var layerInterface = layerInterface


                    var index = index

    
                        if(!this.contains(layerInterface))
                        
                                    {
                                    this.appendProcessors(layerInterface)
super.append(layerInterface, index)

                                    }
                                
}


                @Throws(Exception::class)
            
open fun appendProcessors(layerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var layerInterface = layerInterface
this.createLayerManagerEvent!!.setLayerInterface(layerInterface)
layerManagerEventHandler!!.fireEvent(this.createLayerManagerEvent)

    var layerProcessorInterface: LayerProcessor





                        for (index in this.basicLayerProcessorArray!!.size  - 1  downTo 0)

        {layerProcessorInterface= basicLayerProcessorArray[index]!!

    
                        if(layerProcessorInterface!!.isProcessorLayer(layerInterface))
                        
                                    {
                                    layerProcessorInterface!!.getLayerManager()!!.append(layerInterface)

                                    }
                                
}

}


                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
override fun remove(layerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var layerInterface = layerInterface
deleteLayerManagerEvent!!.setLayerInterface(layerInterface)
layerManagerEventHandler!!.fireDeleteEvent(this.deleteLayerManagerEvent)

    var layerProcessorInterface: LayerProcessor





                        for (index in this.basicLayerProcessorArray!!.size  - 1  downTo 0)

        {layerProcessorInterface= basicLayerProcessorArray[index]!!
layerProcessorInterface!!.getLayerManager()!!.remove(layerInterface)
}

super.remove(layerInterface)
}


                @Throws(Exception::class)
            
open fun process()
        //nullable = true from not(false or (false and true)) = true
{
    var layerProcessorInterface: LayerProcessor


    var size: Int = this.basicLayerProcessorArray!!.size
                





                        for (index in 0 until size)

        {layerProcessorInterface= basicLayerProcessorArray[index]!!
layerProcessorInterface!!.process(this)
}

}


                @Throws(Exception::class)
            override fun cleanup()
        //nullable = true from not(false or (false and true)) = true
{
    var layerProcessorInterface: LayerProcessor


    var size: Int = this.basicLayerProcessorArray!!.size
                





                        for (index in 0 until size)

        {layerProcessorInterface= basicLayerProcessorArray[index]!!
layerProcessorInterface!!.getLayerManager()!!.cleanup()
}

super.cleanup()
}


}
                
            

