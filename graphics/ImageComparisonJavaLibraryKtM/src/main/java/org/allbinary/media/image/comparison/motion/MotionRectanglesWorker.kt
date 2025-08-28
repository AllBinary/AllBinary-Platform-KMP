
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
import org.allbinary.logic.util.event.handler.BasicEventHandler
import org.allbinary.media.image.comparison.ImageComparisonResult
import org.allbinary.media.image.comparison.ImageComparisonResultsEvent
import org.allbinary.media.image.comparison.ImageComparisonResultsListener
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStrings
import org.allbinary.time.TimeDelayHelper

open public class MotionRectanglesWorker : BasicEventHandler
                , ImageComparisonResultsListener {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val imageComparisonInfoVector: Vector = Vector()

    private val motionRectangleConstraintsInterface: MotionRectangleConstraintsInterface

    private var index: Long= 0

    private var running: Boolean= false
public constructor        (motionRectangleConstraintsInterface: MotionRectangleConstraintsInterface)

        Updates for KMP build        
        {
    //var motionRectangleConstraintsInterface = motionRectangleConstraintsInterface
this.motionRectangleConstraintsInterface= motionRectangleConstraintsInterface
}


open fun onImageComparisonResultsEvent(imageComparisonResultsEvent: ImageComparisonResultsEvent)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var imageComparisonResultsEvent = imageComparisonResultsEvent
this.imageComparisonInfoVector!!.add(imageComparisonResultsEvent)
this.run()
}


open fun onEvent(allBinaryEventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var allBinaryEventObject = allBinaryEventObject
this.onImageComparisonResultsEvent(allBinaryEventObject as ImageComparisonResultsEvent)
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun isRunning()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return running
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun setRunning(running: Boolean)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var running = running
this.running= running
}


open fun run()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

        try {
            logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.RUN)
this.setRunning(true)

    var timeHelper: TimeDelayHelper = TimeDelayHelper(1000)

timeHelper!!.setStartTime()

    var imageComparisonResultsEvent: ImageComparisonResultsEvent = this.imageComparisonInfoVector!!.get(0) as ImageComparisonResultsEvent


    var imageComparisonInfo: ImageComparisonResult = imageComparisonResultsEvent!!.getImageComparisonResult() as ImageComparisonResult

logUtil!!.put(imageComparisonInfo!!.toString(), this, this.commonStrings!!.RUN)

    var allMotionRectangles: AllMotionRectangles = AllMotionRectangles(imageComparisonInfo)

AllMotionRectanglesResultsCacheSingleton.getInstance()!!.add(MotionRectanglesResultsFrameCacheable(allMotionRectangles, imageComparisonInfo!!.getFrameTwo()))

    var consolidatedMotionRectangles: ConsolidateMotionRectangles = ConsolidateMotionRectangles(allMotionRectangles)

ConsolidatedMotionRectanglesResultsCacheSingleton.getInstance()!!.add(MotionRectanglesResultsFrameCacheable(consolidatedMotionRectangles, imageComparisonInfo!!.getFrameTwo()))

    var constrainedMotionRectangles: ConstrainedMotionRectangles = ConstrainedMotionRectangles(this.motionRectangleConstraintsInterface, consolidatedMotionRectangles)

constrainedMotionRectangles!!.applyMotionRectangleConstraints(consolidatedMotionRectangles)
ConstrainedMotionRectanglesResultsCacheSingleton.getInstance()!!.add(MotionRectanglesResultsFrameCacheable(constrainedMotionRectangles, imageComparisonInfo!!.getFrameTwo()))
this.fireEvent(MotionRectanglesResultsEvent(this, imageComparisonInfo!!.getFrameTwo(), constrainedMotionRectangles as MotionRectangles))
this.imageComparisonInfoVector!!.remove(imageComparisonResultsEvent)
this.index++
logUtil!!.put(CommonLabels.getInstance()!!.ELAPSED +timeHelper!!.getElapsed(), this, this.commonStrings!!.RUN)
this.setRunning(false)
logUtil!!.put(this.commonStrings!!.END, this, this.commonStrings!!.RUN)
} catch(e: Exception)
            

        Updates for KMP build        
        {
logUtil!!.put(this.commonStrings!!.EXCEPTION, this, this.commonStrings!!.RUN, e)
}

}


}
                
            

