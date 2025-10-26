
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2002 AllBinary 
                *   
                *  By agreeing to this license you and any business entity you represent are 
                *  legally bound to the AllBinary Open License Version 1 legal agreement. 
                *   
                *  You may obtain the AllBinary Open License Version 1 legal agreement from 
                *  AllBinary or the root directory of AllBinary's AllBinary Platform repository. 
                *    Created By: Travis Berthelot  
        */
        
        /* Generated Code Do Not Modify */
        package org.allbinary.game.layer.waypoint.event




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.RTSLayerEvent
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventListenerInterface
import org.allbinary.logic.util.event.handler.BasicEventHandler

open public class WaypointEventHandler : BasicEventHandler {
        
public constructor (){
}


                @Throws(Exception::class)
            
    override fun process(eventObject: AllBinaryEventObject, eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{
var eventObject = eventObject
var eventListenerInterface = eventListenerInterface

    var waypointEventListenerInterface: WaypointEventListenerInterface = (eventListenerInterface as WaypointEventListenerInterface)

waypointEventListenerInterface!!.onWaypointEvent(eventObject as RTSLayerEvent)
}


}
                
            

