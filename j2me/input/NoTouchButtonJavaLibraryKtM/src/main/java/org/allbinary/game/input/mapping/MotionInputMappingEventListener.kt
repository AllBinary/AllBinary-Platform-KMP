
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
        package org.allbinary.game.input.mapping




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.mapping.event.InputMappingEvent
import org.allbinary.game.input.mapping.event.InputMappingEventListenerInterface
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventStrings

open public class MotionInputMappingEventListener
            : Object
        
                , InputMappingEventListenerInterface {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        override fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var eventObject = eventObject
ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}


                @Throws(Exception::class)
            override fun onInputMappingEvent(inputMappingEvent: InputMappingEvent)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var inputMappingEvent = inputMappingEvent
}


}
                
            

