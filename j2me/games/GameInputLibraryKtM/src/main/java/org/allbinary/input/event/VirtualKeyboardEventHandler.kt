
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
        package org.allbinary.input.event




        import java.lang.Object        
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.java.bool.BooleanFactory
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventListenerInterface
import org.allbinary.logic.util.event.handler.BasicEventHandler
import org.allbinary.string.CommonStrings

open public class VirtualKeyboardEventHandler : BasicEventHandler {
        

        companion object {
            
    private val gameKeyEventHandler: VirtualKeyboardEventHandler = VirtualKeyboardEventHandler()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: VirtualKeyboardEventHandler{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return VirtualKeyboardEventHandler.gameKeyEventHandler
}


        }
            private constructor        (){}


    val SHOW_EVENT: VirtualKeyboardEvent = VirtualKeyboardEvent(BooleanFactory.getInstance()!!.TRUE)

    val HIDE_EVENT: VirtualKeyboardEvent = VirtualKeyboardEvent(BooleanFactory.getInstance()!!.FALSE)

                @Throws(Exception::class)
            override fun process(eventObject: AllBinaryEventObject, eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var eventObject = eventObject


                    var eventListenerInterface = eventListenerInterface

    var virtualKeyboardEventListenerInterface: VirtualKeyboardEventListenerInterface = eventListenerInterface as VirtualKeyboardEventListenerInterface

virtualKeyboardEventListenerInterface!!.onVirtualKeyboardEvent(eventObject as VirtualKeyboardEvent)
}


open fun open()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            Thread.sleep(120)
this.fireEvent(this.SHOW_EVENT)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, "open", e)
}

}


open fun close()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            Thread.sleep(120)
this.fireEvent(this.HIDE_EVENT)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CLOSE, e)
}

}


}
                
            

