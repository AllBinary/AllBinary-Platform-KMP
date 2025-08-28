
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
        package org.allbinary.layer.event




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventListenerInterface
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.logic.util.event.handler.BasicEventHandler
import org.allbinary.util.BasicArrayList

open public class LayerManagerEventHandler : BasicEventHandler {
        

        companion object {
            
    private var instance: LayerManagerEventHandler = LayerManagerEventHandler()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: LayerManagerEventHandler

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return LayerManagerEventHandler.instance
}


        }
            
    private val list: BasicArrayList = BasicArrayList()
private constructor        ()

        Updates for KMP build        
        {
}


open fun addListener(layerManagerEventListener: LayerManagerEventListener)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var layerManagerEventListener = layerManagerEventListener

    
                        if(!list.contains(layerManagerEventListener))
                        
                                    {
                                    list.add(layerManagerEventListener)

                                    }
                                
}

override fun removeAllListeners()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.list.clear()
super.removeAllListeners()
}

override fun removeListener(eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var eventListenerInterface = eventListenerInterface
this.list.remove(eventListenerInterface)
super.removeListener(eventListenerInterface)
}


                @Throws(Exception::class)
            override fun fireEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var eventObject = eventObject




                        for (index in this.list.size()!!  - 1  downTo 0)

        

        Updates for KMP build        
        {

        try {
            
    var layerManagerEventListener: LayerManagerEventListener = this.list.objectArray[index]!! as LayerManagerEventListener

layerManagerEventListener!!.onCreateLayerManagerEvent(eventObject as LayerManagerEvent)
} catch(e: Exception)
            

        Updates for KMP build        
        {
logUtil!!.put(commonStrings!!.EXCEPTION, this, EventStrings.getInstance()!!.FIRE_EVENT, e)
}

}

super.fireEvent(eventObject)
}


    val CREATE: String = "Create"

    val DELETE: String = "Delete"

                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun fireDeleteEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var eventObject = eventObject




                        for (index in this.list.size()!!  - 1  downTo 0)

        

        Updates for KMP build        
        {

        try {
            
    var layerManagerEventListener: LayerManagerEventListener = this.list.objectArray[index]!! as LayerManagerEventListener

layerManagerEventListener!!.onDeleteLayerManagerEvent(eventObject as LayerManagerEvent)
} catch(e: Exception)
            

        Updates for KMP build        
        {
logUtil!!.put(commonStrings!!.EXCEPTION, this, EventStrings.getInstance()!!.FIRE_EVENT, e)
}

}


    var eventListenerInterfaceList: BasicArrayList = this.eventListenerInterfaceList


    var eventListenerInterface: EventListenerInterface


    var layerManagerEventListenerInterface: LayerManagerEventListenerInterface


    var index: Int = 0


        while(index < eventListenerInterfaceList!!.size())
        

        Updates for KMP build        
        {

        try {
            eventListenerInterface= eventListenerInterfaceList!!.objectArray[index]!! as EventListenerInterface
layerManagerEventListenerInterface= (eventListenerInterface as LayerManagerEventListenerInterface)
layerManagerEventListenerInterface!!.onDeleteLayerManagerEvent(eventObject as LayerManagerEvent)
} catch(e: Exception)
            

        Updates for KMP build        
        {
logUtil!!.put(commonStrings!!.EXCEPTION, this, EventStrings.getInstance()!!.FIRE_EVENT, e)
}

index++
}

}


                @Throws(Exception::class)
            override fun process(eventObject: AllBinaryEventObject, eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var eventObject = eventObject
    //var eventListenerInterface = eventListenerInterface

    var layerManagerEventListenerInterface: LayerManagerEventListenerInterface = (eventListenerInterface as LayerManagerEventListenerInterface)

layerManagerEventListenerInterface!!.onCreateLayerManagerEvent(eventObject as LayerManagerEvent)
}


}
                
            

