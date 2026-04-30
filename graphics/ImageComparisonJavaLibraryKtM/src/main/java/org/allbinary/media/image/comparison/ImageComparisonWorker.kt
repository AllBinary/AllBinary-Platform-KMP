
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
        package org.allbinary.media.image.comparison




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.input.media.image.capture.CapturedImageWorkerResultsEvent
import org.allbinary.input.media.image.capture.CapturedImageWorkerResultsListener
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.handler.BasicEventHandler
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStrings
import org.allbinary.time.TimeDelayHelper

open public class ImageComparisonWorker : BasicEventHandler
                , CapturedImageWorkerResultsListener {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val bufferedImageVector: Vector = Vector()

    private val imageComparatorConstraintsInterface: ImageComparatorConstraintsInterface

    private val imageComparator: ImageComparator

    private var running: Boolean= false

    private var index2: Int= 0
public constructor (imageComparatorConstraintsInterface: ImageComparatorConstraintsInterface){
    //var imageComparatorConstraintsInterface = imageComparatorConstraintsInterface
this.imageComparatorConstraintsInterface= imageComparatorConstraintsInterface
this.imageComparator= ImageComparator(imageComparatorConstraintsInterface)
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun isRunning()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.running
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun setRunning(running: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var running = running
this.running= running
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun onCaptureEvent(capturedImageWorkerResultsEvent: CapturedImageWorkerResultsEvent)
        //nullable = true from not(false or (false and false)) = true
{
    //var capturedImageWorkerResultsEvent = capturedImageWorkerResultsEvent
this.bufferedImageVector!!.add(capturedImageWorkerResultsEvent)

    
                        if(this.bufferedImageVector!!.size > 1)
                        
                                    {
                                    this.run()

                                    }
                                
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun onEvent(allBinaryEventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{
    //var allBinaryEventObject = allBinaryEventObject
this.onCaptureEvent(allBinaryEventObject as CapturedImageWorkerResultsEvent)
}


    open fun run()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            this.logUtil!!.putF(this.commonStrings!!.START, this, this.commonStrings!!.RUN)
this.setRunning(true)

    var timeHelper: TimeDelayHelper = TimeDelayHelper(1000)

timeHelper!!.setStartTimeTNT()

    
                        if(this.imageComparatorConstraintsInterface!!.isFrameAllowed(this.index2))
                        
                                    {
                                    
    var capturedImageWorkerResultsEvent: Array<CapturedImageWorkerResultsEvent?> = arrayOfNulls(2)

capturedImageWorkerResultsEvent[0]= this.bufferedImageVector!!.get(0) as CapturedImageWorkerResultsEvent
capturedImageWorkerResultsEvent[1]= this.bufferedImageVector!!.get(1) as CapturedImageWorkerResultsEvent

    
                        if(this.imageComparatorConstraintsInterface!!.isImageValid(capturedImageWorkerResultsEvent[0]!!.getBufferedImage()) && this.imageComparatorConstraintsInterface!!.isImageValid(capturedImageWorkerResultsEvent[1]!!.getBufferedImage()))
                        
                                    {
                                    
    var imageComparisonResult: ImageComparisonResult = this.imageComparator!!.compare(capturedImageWorkerResultsEvent[0]!!.getBufferedImage(), capturedImageWorkerResultsEvent[1]!!.getBufferedImage(), capturedImageWorkerResultsEvent[0]!!.getFrame(), capturedImageWorkerResultsEvent[1]!!.getFrame(), 0)!!


    var frame: Long = capturedImageWorkerResultsEvent[1]!!.getFrame()!!


    var imageComparisonResultFrameCacheable: ImageComparisonResultFrameCacheable = ImageComparisonResultFrameCacheable(imageComparisonResult, frame)

ImageComparisonResultCacheSingleton.getInstance()!!.add(imageComparisonResultFrameCacheable)
this.fireEvent(ImageComparisonResultsEvent(this, imageComparisonResult))
this.logUtil!!.putF(StringMaker().
                            append("Image Comparison Result: ")!!.append(imageComparisonResult!!.toString())!!.append(" for frame: ")!!.appendlong(frame)!!.toString(), this, this.commonStrings!!.RUN)

                                    }
                                
                        else {
                            this.logUtil!!.putF("An Image Was Not Valid: Image Worker Event Processing terminated", this, this.commonStrings!!.RUN)

                        }
                            

                                    }
                                
this.bufferedImageVector!!.remove(0)
this.index2++

    var message: String = StringMaker().
                            append("Frame: ")!!.appendint(this.index2)!!.append(CommonLabels.getInstance()!!.ELAPSED)!!.appendlong(timeHelper!!.getElapsedTNT())!!.toString()!!

this.logUtil!!.putF(message, this, this.commonStrings!!.RUN)
this.setRunning(false)
this.logUtil!!.putF(this.commonStrings!!.END, this, this.commonStrings!!.RUN)
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, this.commonStrings!!.RUN, e)
}

}


}
                
            

