
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStrings
import org.allbinary.time.TimeDelayHelper

open public class SaveImageComparisonWorker
            : Object
        
                , ImageComparisonResultsListener {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var running: Boolean= false

    private val imageComparisonInfoVector: Vector = Vector()
public constructor        ()
            : super()
        {}


open fun onImageComparisonResultsEvent(imageComparisonResultsEvent: ImageComparisonResultsEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var imageComparisonResultsEvent = imageComparisonResultsEvent
this.imageComparisonInfoVector!!.add(imageComparisonResultsEvent)
this.run()
}


open fun onEvent(allBinaryEventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryEventObject = allBinaryEventObject
this.onImageComparisonResultsEvent(allBinaryEventObject as ImageComparisonResultsEvent)
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

timeHelper!!.setStartTime()

    var imageComparisonResultsEvent: ImageComparisonResultsEvent = this.imageComparisonInfoVector!!.get(0) as ImageComparisonResultsEvent


    var imageComparisonInfo: ImageComparisonResult = imageComparisonResultsEvent!!.getImageComparisonResult()!!
            

logUtil!!.put(imageComparisonInfo!!.toString(), this, this.commonStrings!!.RUN)
ComparisonImageInputOutput().
                            save(imageComparisonInfo, imageComparisonInfo!!.getFrameTwo())
this.imageComparisonInfoVector!!.remove(imageComparisonInfo)
logUtil!!.put(CommonLabels.getInstance()!!.ELAPSED +timeHelper!!.getElapsed(), this, this.commonStrings!!.RUN)
logUtil!!.put(this.commonStrings!!.END, this, this.commonStrings!!.RUN)
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, this.commonStrings!!.RUN, e)
}

}


}
                
            

