
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
        package org.allbinary.input.automation.module.generic




        import java.lang.Object        
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO
import org.allbinary.input.automation.module.generic.configuration.profile.SavedCaptureGenericProfileDataWorkerType
import org.allbinary.input.media.image.capture.CaptureWorkerInterface
import org.allbinary.input.media.image.capture.CapturedBufferedImagesCacheSingleton
import org.allbinary.input.media.image.capture.CapturedImageWorkerResultsEvent
import org.allbinary.input.media.image.capture.ProcessingFrameIndexFactory
import org.allbinary.input.media.image.capture.ScreenScavangerRobot
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.java.number.LongUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.util.event.handler.BasicEventHandler
import org.allbinary.logic.visual.media.MediaDataFactory
import org.allbinary.media.image.cache.BufferedImageFrameCacheable
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStrings
import org.allbinary.time.TimeDelayHelper

open public class SavedCaptureImagesWorker : BasicEventHandler
                , CaptureWorkerInterface {
        

        companion object {
            
    private var index: Long

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var running: Boolean= false

    private var screenScavangerRobot: ScreenScavangerRobot

    private var savedCaptureGenericProfileDataWorkerType: SavedCaptureGenericProfileDataWorkerType
public constructor        (savedCaptureGenericProfileDataWorkerType: SavedCaptureGenericProfileDataWorkerType){

                    var savedCaptureGenericProfileDataWorkerType = savedCaptureGenericProfileDataWorkerType
this.savedCaptureGenericProfileDataWorkerType= savedCaptureGenericProfileDataWorkerType
this.screenScavangerRobot= ScreenScavangerRobot()
index= ProcessingFrameIndexFactory.next()
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


open fun run()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.RUN)
this.setRunning(true)

    var timeHelper: TimeDelayHelper = TimeDelayHelper(1000)


        while(this.isRunning())
        {timeHelper!!.setStartTime()

    var frame: Long = index as Long


    var filePathStringBuffer: StringMaker = StringMaker()

filePathStringBuffer!!.append(this.savedCaptureGenericProfileDataWorkerType!!.getPath())
filePathStringBuffer!!.append(LongUtil.fillIn(frame.toString()))
filePathStringBuffer!!.append(MediaDataFactory.getInstance()!!.JPG.getExtension())

    var filePath: String = filePathStringBuffer!!.toString()!!

logUtil!!.put("Loading Image File Path: " +filePath, this, this.commonStrings!!.RUN)

    var file: File = File(filePath)


    
                        if(file.isFile())
                        
                                    {
                                    
    var bufferedImage: BufferedImage = ImageIO.read(file)!!

index++
CapturedBufferedImagesCacheSingleton.getInstance()!!.add(BufferedImageFrameCacheable(bufferedImage, frame))

    var capturedImageEvent: CapturedImageWorkerResultsEvent = CapturedImageWorkerResultsEvent(this, frame, bufferedImage)

this.fireEvent(capturedImageEvent)

                                    }
                                
                        else {
                            logUtil!!.put("Could Not Load File: " +filePath, this, this.commonStrings!!.RUN)

                        }
                            
logUtil!!.put(CommonLabels.getInstance()!!.ELAPSED +timeHelper!!.getElapsed(), this, this.commonStrings!!.RUN)
this.setRunning(false)
}

logUtil!!.put(this.commonStrings!!.END, this, this.commonStrings!!.RUN)
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, this.commonStrings!!.RUN, e)
}

}


}
                
            

