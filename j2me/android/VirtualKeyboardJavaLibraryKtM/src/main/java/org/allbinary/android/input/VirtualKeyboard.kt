
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
        package org.allbinary.android.input



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.input.event.VirtualKeyboardEvent
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventStrings

open public class VirtualKeyboard
            : Object
         {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{

                    var eventObject = eventObject
ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}


open fun onVirtualKeyboardEvent(virtualKeyboardEvent: VirtualKeyboardEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var virtualKeyboardEvent = virtualKeyboardEvent
}


open fun forceHide()
        //nullable = true from not(false or (false and true)) = true
{}


open fun hide()
        //nullable = true from not(false or (false and true)) = true
{}


}
                
            

