
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
        package org.allbinary.input.motion.gesture.observer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.input.motion.gesture.MotionGestureInput
import org.allbinary.input.motion.gesture.TouchMotionGestureFactory
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListD

open public class GameMotionGestureListener
            : Object
        
                , MotionGestureEventListener {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var motionGestureCollection: BasicArrayList = BasicArrayListD()

    private var touchGestureCollection: BasicArrayList = BasicArrayListD()

    private var signed: CompleteMotionGestureListenerInterface
public constructor (signed: CompleteMotionGestureListenerInterface)
            : super()
        {
var signed = signed
this.logUtil!!.putF(commonStrings!!.START, this, commonStrings!!.CONSTRUCTOR)
this.signed= signed
}


    override fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{
var eventObject = eventObject
ForcedLogUtil.log(this.commonStrings!!.NOT_IMPLEMENTED, this)
}


    override fun onUpMotionGestureEvent(ev: MotionGestureEvent)
        //nullable = true from not(false or (false and false)) = true
{
var ev = ev
this.onMotionGestureEvent(ev)
}


    override fun onDownMotionGestureEvent(ev: MotionGestureEvent)
        //nullable = true from not(false or (false and false)) = true
{
var ev = ev
this.onMotionGestureEvent(ev)
}


    override fun onLeftMotionGestureEvent(ev: MotionGestureEvent)
        //nullable = true from not(false or (false and false)) = true
{
var ev = ev
this.onMotionGestureEvent(ev)
}


    override fun onRightMotionGestureEvent(ev: MotionGestureEvent)
        //nullable = true from not(false or (false and false)) = true
{
var ev = ev
this.onMotionGestureEvent(ev)
}


    override fun onDiagonalDownRightMotionGestureEvent(ev: MotionGestureEvent)
        //nullable = true from not(false or (false and false)) = true
{
var ev = ev
this.onMotionGestureEvent(ev)
}


    override fun onDiagonalDownLeftMotionGestureEvent(ev: MotionGestureEvent)
        //nullable = true from not(false or (false and false)) = true
{
var ev = ev
this.onMotionGestureEvent(ev)
}


    override fun onDiagonalUpRightMotionGestureEvent(ev: MotionGestureEvent)
        //nullable = true from not(false or (false and false)) = true
{
var ev = ev
this.onMotionGestureEvent(ev)
}


    override fun onDiagonalUpLeftMotionGestureEvent(ev: MotionGestureEvent)
        //nullable = true from not(false or (false and false)) = true
{
var ev = ev
this.onMotionGestureEvent(ev)
}


    override fun onPressedMotionGestureEvent(ev: MotionGestureEvent)
        //nullable = true from not(false or (false and false)) = true
{
var ev = ev
this.touchGestureCollection!!.add(ev.getMotionGesture())
}


    override fun released(ev: MotionGestureEvent)
        //nullable = true from not(false or (false and false)) = true
{
var ev = ev

        try {
            this.touchGestureCollection!!.add(ev.getMotionGesture())
this.signed.onMotionGestureCompleted(this.touchGestureCollection)
this.touchGestureCollection!!.clear()
} catch(e: Exception)
            {

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.commonStrings!!.EXCEPTION_LABEL)
stringBuffer!!.append(StringUtil.getInstance()!!.toString(ev.getMotionGesture()))
this.logUtil!!.put(stringBuffer!!.toString(), this, "release", e)
}

}


    override fun onMotionGestureEvent(ev: MotionGestureEvent)
        //nullable = true from not(false or (false and false)) = true
{
var ev = ev

        try {
            
    var motionGestureInput: MotionGestureInput = ev.getMotionGesture()!!


    
                        if(motionGestureInput == TouchMotionGestureFactory.getInstance()!!.PRESSED)
                        
                                    {
                                    this.onPressedMotionGestureEvent(ev)

                                    }
                                
                             else 
    
                        if(motionGestureInput == TouchMotionGestureFactory.getInstance()!!.RELEASED)
                        
                                    {
                                    this.released(ev)

                                    }
                                
                        else {
                            this.motionGestureCollection!!.add(motionGestureInput)
this.signed.onMotionGestureCompleted(this.motionGestureCollection)
this.motionGestureCollection!!.clear()
this.touchGestureCollection!!.clear()

                        }
                            
} catch(e: Exception)
            {

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.commonStrings!!.EXCEPTION_LABEL)
stringBuffer!!.append(StringUtil.getInstance()!!.toString(ev.getMotionGesture()))
this.logUtil!!.put(stringBuffer!!.toString(), this, "onMotionGestureEvent", e)
}

}


}
                
            

