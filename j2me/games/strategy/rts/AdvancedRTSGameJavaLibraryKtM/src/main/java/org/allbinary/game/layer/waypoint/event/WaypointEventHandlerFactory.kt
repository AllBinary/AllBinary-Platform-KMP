
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2006 AllBinary 
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
        package org.allbinary.game.layer.waypoint.event



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.identification.Group

open public class WaypointEventHandlerFactory
            : Object
         {
        

        companion object {


    private val eventHandlerArray: Array<WaypointEventHandler?> = arrayOf(WaypointEventHandler(),WaypointEventHandler(),WaypointEventHandler(),WaypointEventHandler(),WaypointEventHandler(),WaypointEventHandler(),WaypointEventHandler(),WaypointEventHandler(),WaypointEventHandler(),WaypointEventHandler())

open fun getInstance(groupInterface: Group)
        //nullable =  from not(true or (false and false)) = 
: WaypointEventHandler{

                    var groupInterface = groupInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return eventHandlerArray[groupInterface!!.getGroupId()]!!
}


open fun removeAll()
        //nullable = true from not(false or (false and true)) = true
{



                        for (index in eventHandlerArray!!.size -1 downTo 0)


        {eventHandlerArray[index]!!.removeAllListeners()
}

}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

