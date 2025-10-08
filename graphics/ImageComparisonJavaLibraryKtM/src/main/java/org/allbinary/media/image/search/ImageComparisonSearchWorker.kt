
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
        package org.allbinary.media.image.search




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt.image.BufferedImage
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

open public class ImageComparisonSearchWorker : BasicEventHandler
                , ImageComparisonResultsListener {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val imageComparisonInfoVector: Vector

    private var index: Long= 0

    private var running: Boolean= false

    private var imageSearchConstraintsInterface: ImageComparisonSearchConstraintsInterface
public constructor (imageSearchConstraintsInterface: ImageComparisonSearchConstraintsInterface){
var imageSearchConstraintsInterface = imageSearchConstraintsInterface
this.imageComparisonInfoVector= Vector()
this.imageSearchConstraintsInterface= imageSearchConstraintsInterface
}


    open fun onImageComparisonResultsEvent(imageComparisonResultsEvent: ImageComparisonResultsEvent)
        //nullable = true from not(false or (false and false)) = true
{
var imageComparisonResultsEvent = imageComparisonResultsEvent
this.imageComparisonInfoVector!!.add(imageComparisonResultsEvent!!.getImageComparisonResult())
this.run()
}


    open fun onEvent(allBinaryEventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{
var allBinaryEventObject = allBinaryEventObject
this.onImageComparisonResultsEvent(allBinaryEventObject as ImageComparisonResultsEvent)
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

    var imageComparisonInfo: ImageComparisonResult = this.imageComparisonInfoVector!!.get(0) as ImageComparisonResult

logUtil!!.put(imageComparisonInfo!!.toString(), this, this.commonStrings!!.RUN)

    var latestBufferedImage: BufferedImage = imageComparisonInfo!!.getBufferedImages()[1]!!

this.imageComparisonInfoVector!!.remove(imageComparisonInfo)
this.index++
logUtil!!.put(CommonLabels.getInstance()!!.ELAPSED +timeHelper!!.getElapsed(), this, this.commonStrings!!.RUN)
this.setRunning(false)
logUtil!!.put(this.commonStrings!!.END, this, this.commonStrings!!.RUN)
} catch(e: Exception)
            {
logUtil!!.put(this.commonStrings!!.EXCEPTION, this, this.commonStrings!!.RUN, e)
}

}


}
                
            

