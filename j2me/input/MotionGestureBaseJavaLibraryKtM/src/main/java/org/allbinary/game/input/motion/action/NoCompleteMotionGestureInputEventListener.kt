
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
        package org.allbinary.game.input.motion.action




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.CompleteMotionGestureInputEvent
import org.allbinary.game.input.CompleteMotionGestureInputEventListener
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventStrings

open public class NoCompleteMotionGestureInputEventListener : CompleteMotionGestureInputEventListener {
        
companion object {
            
    private val instance: NoCompleteMotionGestureInputEventListener = NoCompleteMotionGestureInputEventListener()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: NoCompleteMotionGestureInputEventListener{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor (){
}


    override fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{
var eventObject = eventObject
ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}


    override fun onCompleteMotionGestureInputEvent(completeMotionGestureInputEvent: CompleteMotionGestureInputEvent)
        //nullable = true from not(false or (false and false)) = true
{
var completeMotionGestureInputEvent = completeMotionGestureInputEvent
}


}
                
            

