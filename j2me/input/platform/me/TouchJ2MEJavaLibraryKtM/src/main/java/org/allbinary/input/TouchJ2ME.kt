
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
        package org.allbinary.input




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.input.motion.AllMotionRecognizer
import org.allbinary.input.motion.gesture.observer.BasicMotionGesturesHandler
import org.allbinary.input.motion.gesture.observer.GameMotionGestureListener
import org.allbinary.input.motion.gesture.observer.MotionGestureReceiveInterfaceFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class TouchJ2ME
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val DEVICE_ID: Int = 0

    private var motionRecognizer: AllMotionRecognizer = AllMotionRecognizer()
public constructor ()
            : super()
        {

    var motionGesturesHandler: BasicMotionGesturesHandler = motionRecognizer!!.getMotionGestureRecognizer()!!.getMotionGesturesHandler()!!

motionGesturesHandler!!.addListener(GameMotionGestureListener(MotionGestureReceiveInterfaceFactory.getInstance()))
}


    open fun pointerDragged(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{
var x = x
var y = y

        try {
            motionRecognizer!!.processDraggedMotionEvent(x, y, DEVICE_ID, 0)
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, "pointerDragged", e)
}

}


    open fun pointerPressed(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{
var x = x
var y = y

        try {
            motionRecognizer!!.processStartMotionEvent(x, y, DEVICE_ID, 0)
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, "pointerPressed", e)
}

}


    open fun pointerReleased(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{
var x = x
var y = y

        try {
            motionRecognizer!!.processEndMotionEvent(x, y, DEVICE_ID, 0)
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, "pointerReleased", e)
}

}


}
                
            

