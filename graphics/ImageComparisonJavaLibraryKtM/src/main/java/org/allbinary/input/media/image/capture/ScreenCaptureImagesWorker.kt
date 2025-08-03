
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
        package org.allbinary.input.media.image.capture



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt.image.BufferedImage
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.util.event.handler.BasicEventHandler
import org.allbinary.media.image.cache.BufferedImageFrameCacheable
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStrings
import org.allbinary.time.TimeDelayHelper

open public class ScreenCaptureImagesWorker : BasicEventHandler
                , CaptureWorkerInterface {
        

        companion object {


    private var index: Long


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var running: Boolean= false

    private var screenScavangerRobot: ScreenScavangerRobot
public constructor        (){screenScavangerRobot= ScreenScavangerRobot()
index= ProcessingFrameIndexFactory.next()
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


                @Throws(Exception::class)
            
open fun setThread(thread: Thread)
        //nullable = true from not(false or (false and false)) = true
{

                    var thread = thread
}


open fun run()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.RUN)
setRunning(true)

    var timeHelper: TimeDelayHelper = TimeDelayHelper(1000)


        while(isRunning())
        {timeHelper!!.setStartTime()

    var bufferedImage: BufferedImage = screenScavangerRobot!!.getScreenAsBufferedImages()[0]!!


    var frame: Long = index as Long

index++
CapturedBufferedImagesCacheSingleton.getInstance()!!.add(BufferedImageFrameCacheable(bufferedImage, frame))

    var capturedImageEvent: CapturedImageWorkerResultsEvent = CapturedImageWorkerResultsEvent(this, frame, bufferedImage)

fireEvent(capturedImageEvent)
logUtil!!.put(CommonLabels.getInstance()!!.ELAPSED +timeHelper!!.getElapsed(), this, this.commonStrings!!.RUN)
setRunning(false)
}

logUtil!!.put(this.commonStrings!!.END, this, this.commonStrings!!.RUN)
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, this.commonStrings!!.RUN, e)
}

}


}
                
            

