
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
        package org.allbinary.media.graphics.geography.map.event




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.util.BasicArrayList
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.game.layer.geographic.map.MiniMapLayer
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventListenerInterface
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.logic.util.event.handler.BasicEventHandler

open public class GeographicMapCellPositionEventHandler : BasicEventHandler {
        

        companion object {
            
    private var instance: GeographicMapCellPositionEventHandler = GeographicMapCellPositionEventHandler()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GeographicMapCellPositionEventHandler{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GeographicMapCellPositionEventHandler.instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val list: BasicArrayList = BasicArrayList()
private constructor        (){
}


open fun addListener(miniMapLayer: MiniMapLayer)
        //nullable = true from not(false or (false and false)) = true
{
var miniMapLayer = miniMapLayer

    
                        if(!list.contains(miniMapLayer))
                        
                                    {
                                    list.add(miniMapLayer)

                                    }
                                
}


open fun removeAllListeners()
        //nullable = true from not(false or (false and true)) = true
{
this.list.clear()
super.removeAllListeners()
}


open fun removeListener(eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{
var eventListenerInterface = eventListenerInterface
this.list.remove(eventListenerInterface)
super.removeListener(eventListenerInterface)
}


                @Throws(Exception::class)
            
open fun fireEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{
var eventObject = eventObject




                        for (index in this.list.size()!!  - 1  downTo 0)

        {

        try {
            
    var miniMapLayer: MiniMapLayer = this.list.get(index) as MiniMapLayer

miniMapLayer!!.onGeographicMapCellPositionEvent(eventObject as GeographicMapCellPositionEvent)
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, EventStrings.getInstance()!!.FIRE_EVENT, e)
}

}

super.fireEvent(eventObject)
}


                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun fireRemoveEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{
var eventObject = eventObject

    var list: BasicArrayList = this.eventListenerInterfaceList





                        for (index in this.list.size()!!  - 1  downTo 0)

        {

        try {
            
    var miniMapLayer: MiniMapLayer = this.list.get(index) as MiniMapLayer

miniMapLayer!!.onRemoveGeographicMapCellPositionEvent(eventObject as GeographicMapCellPositionEvent)
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, EventStrings.getInstance()!!.FIRE_EVENT, e)
}

}


    var eventListenerInterface: EventListenerInterface


    var geographicMapCellPositionEventListenerInterface: GeographicMapCellPositionEventListenerInterface


    var size: Int = list.size()!!





                        for (index in 0 until size)

        {

        try {
            eventListenerInterface= list.get(index) as EventListenerInterface
geographicMapCellPositionEventListenerInterface= (eventListenerInterface as GeographicMapCellPositionEventListenerInterface)
geographicMapCellPositionEventListenerInterface!!.onRemoveGeographicMapCellPositionEvent(eventObject as GeographicMapCellPositionEvent)
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, EventStrings.getInstance()!!.FIRE_EVENT, e)
}

}

}


                @Throws(Exception::class)
            
open fun process(eventObject: AllBinaryEventObject, eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{
var eventObject = eventObject
var eventListenerInterface = eventListenerInterface
eventListenerInterface = eventListenerInterfaceeventListenerInterface as GeographicMapCellPositionEventListenerInterface
eventListenerInterface.
                    onGeographicMapCellPositionEvent(eventObject as GeographicMapCellPositionEvent)
}


}
                
            

