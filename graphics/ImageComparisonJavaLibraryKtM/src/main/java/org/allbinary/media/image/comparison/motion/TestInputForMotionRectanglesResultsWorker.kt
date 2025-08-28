
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
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import java.awt.event.InputEvent
import java.awt.event.KeyEvent
import java.util.Hashtable
import java.util.Vector
import org.allbinary.input.automation.robot.InputRobotFactory
import org.allbinary.input.automation.robot.InputRobotInterface
import org.allbinary.input.automation.robot.TempInputRobotNames
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStrings
import org.allbinary.time.TimeDelayHelper

open public class TestInputForMotionRectanglesResultsWorker
            : Object
        
                , MotionRectanglesResultsListener {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var index: Long= 0

    private var running: Boolean= false

    private var motionRectanglesVector: Vector
public constructor        ()
            : super()
        

        Updates for KMP build        
        {
this.motionRectanglesVector= Vector()
}


open fun getMotionRectanglesVector()
        //nullable = true from not(false or (false and true)) = true
: Vector

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.motionRectanglesVector
}


open fun onMotionRectanglesImageComparisonResultsEvent(motionRectanglesImageComparisonResultsEvent: MotionRectanglesResultsEvent)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var motionRectanglesImageComparisonResultsEvent = motionRectanglesImageComparisonResultsEvent
this.getMotionRectanglesVector()!!.add(motionRectanglesImageComparisonResultsEvent!!.getMotionRectangles())
this.run()
}


open fun onEvent(allBinaryEventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var allBinaryEventObject = allBinaryEventObject
this.onMotionRectanglesImageComparisonResultsEvent(allBinaryEventObject as MotionRectanglesResultsEvent)
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
var running = running
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

    var motionRectangles: MotionRectangles = this.getMotionRectanglesVector()!!.get(0) as MotionRectangles


    var motionRectangleVector: Vector = motionRectangles!!.getVector()!!


    
                        if(motionRectangleVector!!.size > 0)
                        
                                    {
                                    
    var rectangle: Rectangle = motionRectangleVector!!.get(0) as Rectangle


    var robotHashtable: Hashtable<Any, Any> = InputRobotFactory.getInstance()!!.get()!!


    var inputTypeNameArray: Array<Any?> = robotHashtable!!.keys.toTypedArray()!!


    var size: Int = inputTypeNameArray!!.size
                





                        for (index in 0 until size)

        

        Updates for KMP build        
        {

    var inputTypeNameString: String = inputTypeNameArray[index]!! as String


    var inputRobotInterface: InputRobotInterface = robotHashtable!!.get(inputTypeNameString as Object) as InputRobotInterface

inputRobotInterface!!.mouseMoveToTarget(rectangle)

    
                        if(inputRobotInterface!!.getName()!!.compareTo(TempInputRobotNames.DX_NAME) == 0)
                        
                                    {
                                    inputRobotInterface!!.mousePress(InputEvent.BUTTON1_MASK)
Thread.sleep(300)
inputRobotInterface!!.mouseRelease(InputEvent.BUTTON1_MASK)
inputRobotInterface!!.mousePress(InputEvent.BUTTON2_MASK)
Thread.sleep(300)
inputRobotInterface!!.mouseRelease(InputEvent.BUTTON2_MASK)
inputRobotInterface!!.mousePress(InputEvent.BUTTON3_MASK)
Thread.sleep(300)
inputRobotInterface!!.mouseRelease(InputEvent.BUTTON3_MASK)
inputRobotInterface!!.keyPress(KeyEvent.VK_1)
Thread.sleep(300)
inputRobotInterface!!.keyRelease(KeyEvent.VK_1)
inputRobotInterface!!.keyPress(KeyEvent.VK_2)
Thread.sleep(300)
inputRobotInterface!!.keyRelease(KeyEvent.VK_2)
inputRobotInterface!!.keyPress(KeyEvent.VK_3)
Thread.sleep(300)
inputRobotInterface!!.keyRelease(KeyEvent.VK_3)
inputRobotInterface!!.keyPress(KeyEvent.VK_4)
Thread.sleep(300)
inputRobotInterface!!.keyRelease(KeyEvent.VK_4)
inputRobotInterface!!.keyPress(KeyEvent.VK_F1)
Thread.sleep(300)
inputRobotInterface!!.keyRelease(KeyEvent.VK_F1)

                                    }
                                
}


                                    }
                                
this.index++
this.getMotionRectanglesVector()!!.remove(motionRectangles)
logUtil!!.put(CommonLabels.getInstance()!!.ELAPSED +timeHelper!!.getElapsed(), this, this.commonStrings!!.RUN)
logUtil!!.put(this.commonStrings!!.END, this, this.commonStrings!!.RUN)
} catch(e: Exception)
            

        Updates for KMP build        
        {
logUtil!!.put(this.commonStrings!!.EXCEPTION, this, this.commonStrings!!.RUN, e)
}

}


}
                
            

