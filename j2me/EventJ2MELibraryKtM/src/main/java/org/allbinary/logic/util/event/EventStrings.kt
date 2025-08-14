
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        package org.allbinary.logic.util.event




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class EventStrings
            : Object
         {
        

        companion object {
            
    private val instance: EventStrings = EventStrings()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: EventStrings{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val PERFORMANCE_MESSAGE: String = "Use Custom onEvent Methods for needed optimization"

    val TOTAL_LISTENERS: String = "Total Listeners: "

    val LISTENER_LABEL: String = " Listener: "

    val FIRE_EVENT: String = "fireEvent"

}
                
            

