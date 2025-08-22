
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
public constructor        (imageComparatorConstraintsInterface: ImageComparatorConstraintsInterface){

                    var imageComparatorConstraintsInterface = imageComparatorConstraintsInterface
this.imageComparatorConstraintsInterface= imageComparatorConstraintsInterface
this.imageComparator= ImageComparator(imageComparatorConstraintsInterface)
}


open fun isRunning()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return running
}


open fun setRunning(running: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var running = running
this.running= running
}


open fun onCaptureEvent(capturedImageWorkerResultsEvent: CapturedImageWorkerResultsEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var capturedImageWorkerResultsEvent = capturedImageWorkerResultsEvent
this.bufferedImageVector!!.add(capturedImageWorkerResultsEvent)

    
                        if(this.bufferedImageVector!!.size > 1)
                        
                                    {
                                    this.run()

                                    }
                                
}


open fun onEvent(allBinaryEventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryEventObject = allBinaryEventObject
this.onCaptureEvent(allBinaryEventObject as CapturedImageWorkerResultsEvent)
}


open fun run()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.RUN)
this.setRunning(true)

    var timeHelper: TimeDelayHelper = TimeDelayHelper(1000)

timeHelper!!.setStartTime()

    
                        if(this.imageComparatorConstraintsInterface!!.isFrameAllowed(index2))
                        
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
logUtil!!.put(StringMaker().
                            append("Image Comparison Result: ")!!.append(imageComparisonResult!!.toString())!!.append(" for frame: ")!!.append(frame)!!.toString(), this, this.commonStrings!!.RUN)

                                    }
                                
                        else {
                            logUtil!!.put("An Image Was Not Valid: Image Worker Event Processing terminated", this, this.commonStrings!!.RUN)

                        }
                            

                                    }
                                
this.bufferedImageVector!!.remove(0)
index2++

    var message: String = StringMaker().
                            append("Frame: ")!!.append(index2)!!.append(CommonLabels.getInstance()!!.ELAPSED)!!.append(timeHelper!!.getElapsed())!!.toString()!!

logUtil!!.put(message, this, this.commonStrings!!.RUN)
this.setRunning(false)
logUtil!!.put(this.commonStrings!!.END, this, this.commonStrings!!.RUN)
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, this.commonStrings!!.RUN, e)
}

}


}
                
            

