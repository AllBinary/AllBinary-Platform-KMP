
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
        package org.allbinary.input.automation.module




        import java.lang.Object        
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.input.media.image.capture.CaptureWorkerInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.media.image.comparison.ImageComparisonWorker
import org.allbinary.media.image.comparison.motion.MotionRectanglesWorker
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStrings
import org.allbinary.thread.RunnableInterface
import org.allbinary.time.TimeDelayHelper

open public class AbstractInputAutomationWorker
            : Object
        
                , RunnableInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var index: Long= 0

    private var running: Boolean= false

    private var inputAutomationActionInterface: InputAutomationActionInterface

    private var captureWorkerInterface: CaptureWorkerInterface

    private var imageComparisonWorker: ImageComparisonWorker

    private var motionRectanglesWorker: MotionRectanglesWorker

    private var captureThread: Thread
public constructor        (inputAutomationActionInterface: InputAutomationActionInterface)
            : super()
        {

                    var inputAutomationActionInterface = inputAutomationActionInterface
}


                @Throws(Exception::class)
            
open fun setThread(thread: Thread)
        //nullable = true from not(false or (false and false)) = true
{

                    var thread = thread
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


open fun isAnyDataWorkerRunning()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
                        if(captureThread != 
                                    null
                                 && (captureThread!!.isAlive() || this.getCaptureWorker()!!.isRunning() || this.getMotionRectanglesWorker()!!.isRunning() || this.getImageComparisonWorker()!!.isRunning()))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            
open fun startDataWorkers()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(!isAnyDataWorkerRunning())
                        
                                    {
                                    captureThread= Thread(this.getCaptureWorker())
logUtil!!.put("Starting CaptureWorkers - Need more images - Thread State: " +captureThread!!.getState()!!.toString(), this, "startCaptureWorkers")
captureThread!!.start()

                                    }
                                
}


                @Throws(Exception::class)
            
open fun waitForDataWorkers()
        //nullable = true from not(false or (false and true)) = true
{
        while(isAnyDataWorkerRunning())
        {logUtil!!.put("Waiting", this, this.commonStrings!!.RUN)
Thread.sleep(250)
}

}


                @Throws(Exception::class)
            
open fun stopDataWorkers()
        //nullable = true from not(false or (false and true)) = true
{this.getCaptureWorker()!!.setRunning(false)
}


                @Throws(Exception::class)
            
open fun process()
        //nullable = true from not(false or (false and true)) = true
{


                            throw RuntimeException()
}


open fun run()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.RUN)
this.setRunning(true)

    var timeHelper: TimeDelayHelper = TimeDelayHelper(1000)


        while(this.isRunning())
        {timeHelper!!.setStartTime()
this.process()
this.index++
logUtil!!.put(CommonLabels.getInstance()!!.ELAPSED +timeHelper!!.getElapsed() +" Index: " +this.index, this, this.commonStrings!!.RUN)
}

this.stopDataWorkers()
this.waitForDataWorkers()
logUtil!!.put(this.commonStrings!!.END, this, this.commonStrings!!.RUN)
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, this.commonStrings!!.RUN, e)
}

}


open fun getInputAutomationActionInterface()
        //nullable = true from not(false or (false and true)) = true
: InputAutomationActionInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputAutomationActionInterface
}


open fun setInputAutomationActionInterface(inputAutomationActionInterface: InputAutomationActionInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var inputAutomationActionInterface = inputAutomationActionInterface
this.inputAutomationActionInterface= inputAutomationActionInterface
}


open fun getCaptureWorker()
        //nullable = true from not(false or (false and true)) = true
: CaptureWorkerInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return captureWorkerInterface
}


open fun setCaptureWorker(captureWorkerInterface: CaptureWorkerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var captureWorkerInterface = captureWorkerInterface
this.captureWorkerInterface= captureWorkerInterface
}


open fun getImageComparisonWorker()
        //nullable = true from not(false or (false and true)) = true
: ImageComparisonWorker{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return imageComparisonWorker
}


open fun setImageComparisonWorker(imageComparisonWorker: ImageComparisonWorker)
        //nullable = true from not(false or (false and false)) = true
{

                    var imageComparisonWorker = imageComparisonWorker
this.imageComparisonWorker= imageComparisonWorker
}


open fun getMotionRectanglesWorker()
        //nullable = true from not(false or (false and true)) = true
: MotionRectanglesWorker{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return motionRectanglesWorker
}


open fun setMotionRectanglesWorker(motionRectanglesWorker: MotionRectanglesWorker)
        //nullable = true from not(false or (false and false)) = true
{

                    var motionRectanglesWorker = motionRectanglesWorker
this.motionRectanglesWorker= motionRectanglesWorker
}


}
                
            

