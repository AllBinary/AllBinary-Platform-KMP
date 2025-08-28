
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
        package org.allbinary.game.input




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.input.motion.gesture.MotionGestureInput
import org.allbinary.input.motion.gesture.TouchMotionGestureFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.string.CommonStrings

open public class CompleteMotionGestureInputEvent : AllBinaryEventObject
                , CompleteMotionGestureInputInterface {
        

        companion object {
            
    val NULL_COMPLETE_MOTION_GESTURE_INPUT_EVENT: CompleteMotionGestureInputEvent = CompleteMotionGestureInputEvent(StringUtil.getInstance()!!.EMPTY_STRING, TouchMotionGestureFactory.getInstance()!!.NO_MOTION)

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var name: String = StringUtil.getInstance()!!.EMPTY_STRING

    private var motionGestureInput: MotionGestureInput = TouchMotionGestureFactory.getInstance()!!.NO_MOTION
public constructor        (name: String, motionGestureInput: MotionGestureInput)                        

                            : super(motionGestureInput){
var name = name
var motionGestureInput = motionGestureInput


                            //For kotlin this is before the body of the constructor.
                    
this.setName(name)

        try {
            this.setMotionGestureInput(motionGestureInput)
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, "InputToGameKeyEventAction", e)
}

}


open fun setName(name: String)
        //nullable = true from not(false or (false and false)) = true
{
var name = name
this.name= name
}

override fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return name
}


open fun setMotionGestureInput(motionGestureInput: MotionGestureInput)
        //nullable = true from not(false or (false and false)) = true
{
var motionGestureInput = motionGestureInput
this.motionGestureInput= motionGestureInput
}


open fun getMotionGestureInput()
        //nullable = true from not(false or (false and true)) = true
: MotionGestureInput{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return motionGestureInput
}


}
                
            

