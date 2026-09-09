
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
        
import java.awt.Dimension
import java.awt.Rectangle
import java.awt.Toolkit
import java.awt.image.BufferedImage
import org.allbinary.input.automation.robot.InputRobotFactory
import org.allbinary.input.automation.robot.InputRobotInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.allbinary.util.ABHashtable

open public class ScreenScavangerRobot
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
public constructor ()
            : super()
        {
}


                @Throws(Exception::class)
            
    open fun getScreenAsBufferedImages()
        //nullable = true from not(false or (false and true)) = true
: Array<BufferedImage?>{
this.logUtil!!.putF(this.commonStrings!!.START, this, "getScreenAsBufferedImages")

    var dimScreenSize: Dimension = Toolkit.getDefaultToolkit()!!.getScreenSize()!!


    var rectScreenSize: Rectangle = Rectangle(dimScreenSize)


    var robotHashtable: ABHashtable<Any, Any> = InputRobotFactory.getInstance()!!.get()!!


    var bufferedImageArray: Array<BufferedImage?> = arrayOfNulls(1)


    var index: Int = 0


    var inputRobotInterface: InputRobotInterface = robotHashtable!!.get("Java Robot") as InputRobotInterface

bufferedImageArray[index]= inputRobotInterface!!.createScreenCapture(rectScreenSize)
this.logUtil!!.putF("Finish", this, "getScreenAsBufferedImages")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return bufferedImageArray
}


}
                
            

