
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt.image.BufferedImage
import java.util.Vector
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.handler.BasicEventHandler
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStrings
import org.allbinary.time.TimeDelayHelper

open public class SaveCapturedImageWorker : BasicEventHandler
                , CapturedImageWorkerResultsListener {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var running: Boolean= false

    private var capturedImageWorkerResultsEventVector: Vector = Vector()
public constructor        (){}


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


open fun onCaptureEvent(capturedImageEvent: CapturedImageWorkerResultsEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var capturedImageEvent = capturedImageEvent
capturedImageWorkerResultsEventVector!!.add(capturedImageEvent)
run()
}


open fun onEvent(allBinaryEventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryEventObject = allBinaryEventObject
onCaptureEvent(allBinaryEventObject as CapturedImageWorkerResultsEvent)
}


open fun run()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.RUN)
setRunning(true)

    var timeHelper: TimeDelayHelper = TimeDelayHelper(1000)

timeHelper!!.setStartTime()

    var capturedImageWorkerResultsEvent: CapturedImageWorkerResultsEvent = (capturedImageWorkerResultsEventVector!!.get(0) as CapturedImageWorkerResultsEvent)


    var screenBufferedImage: BufferedImage = capturedImageWorkerResultsEvent!!.getBufferedImage()!!
            

CapturedImageInputOutput().
                            save(screenBufferedImage, capturedImageWorkerResultsEvent!!.getFrame())
capturedImageWorkerResultsEventVector!!.remove(capturedImageWorkerResultsEvent)
logUtil!!.put(CommonLabels.getInstance()!!.ELAPSED +timeHelper!!.getElapsed(), this, this.commonStrings!!.RUN)
setRunning(false)
logUtil!!.put(this.commonStrings!!.END, this, this.commonStrings!!.RUN)
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, this.commonStrings!!.RUN, e)
}

}


}
                
            

