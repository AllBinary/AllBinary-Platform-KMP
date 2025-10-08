
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
        package org.allbinary.media.image.comparison.motion




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStrings
import org.allbinary.time.TimeDelayHelper

open public class SaveMotionRectanglesResultsWorker
            : Object
        
                , MotionRectanglesResultsListener {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var running: Boolean= false

    private var motionRectanglesVector: Vector
public constructor ()
            : super()
        {
this.motionRectanglesVector= Vector()
}


    open fun getMotionRectanglesVector()
        //nullable = true from not(false or (false and true)) = true
: Vector{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.motionRectanglesVector
}


    open fun onMotionRectanglesImageComparisonResultsEvent(motionRectanglesResultsEvent: MotionRectanglesResultsEvent)
        //nullable = true from not(false or (false and false)) = true
{
var motionRectanglesResultsEvent = motionRectanglesResultsEvent
this.getMotionRectanglesVector()!!.add(motionRectanglesResultsEvent)
this.run()
}


    open fun onEvent(allBinaryEventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{
var allBinaryEventObject = allBinaryEventObject
this.onMotionRectanglesImageComparisonResultsEvent(allBinaryEventObject as MotionRectanglesResultsEvent)
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun isRunning()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return running
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun setRunning(running: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var running = running
this.running= running
}


    open fun run()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.RUN)
this.setRunning(true)

    var timeHelper: TimeDelayHelper = TimeDelayHelper(1000)

timeHelper!!.setStartTime()

    var motionRectanglesResultsEvent: MotionRectanglesResultsEvent = this.getMotionRectanglesVector()!!.get(0) as MotionRectanglesResultsEvent


    var motionRectangles: MotionRectangles = motionRectanglesResultsEvent!!.getMotionRectangles()!!

MotionRectanglesImageInputOutput().
                            save(motionRectangles, motionRectanglesResultsEvent!!.getFrame())
this.getMotionRectanglesVector()!!.remove(motionRectangles)
logUtil!!.put(CommonLabels.getInstance()!!.ELAPSED +timeHelper!!.getElapsed(), this, this.commonStrings!!.RUN)
logUtil!!.put(this.commonStrings!!.END, this, this.commonStrings!!.RUN)
} catch(e: Exception)
            {
logUtil!!.put(this.commonStrings!!.EXCEPTION, this, this.commonStrings!!.RUN, e)
}

}


}
                
            

