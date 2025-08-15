
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
        package org.allbinary.input.automation.robot




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import java.awt.image.BufferedImage
import javax.help.HelpSet
import org.allbinary.input.automation.PointHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil

open public class InputRobot
            : Object
        
                , InputRobotInterface {
        

        companion object {
            
    val NAME: String = "Java Robot"

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var robot: Robot
public constructor        (graphicsDevice: GraphicsDevice)
            : super()
        {

                    var graphicsDevice = graphicsDevice
this.robot= Robot(graphicsDevice)
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return InputRobot.NAME
}


open fun getHelpSet()
        //nullable = true from not(false or (false and true)) = true
: HelpSet{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun getMousePoint()
        //nullable = true from not(false or (false and true)) = true
: Point{
    var point: Point = MouseInfo.getPointerInfo()!!.getLocation()!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return point
}


                @Throws(Exception::class)
            
open fun mouseMoveToTarget(rectangle: Rectangle, x: Integer, y: Integer)
        //nullable = true from not(false or (false and false)) = true
{

                    var rectangle = rectangle


                    var x = x


                    var y = y

    var point: Point = PointHelper.getCenterPoint(rectangle)!!
            

this.robot.mouseMove(point.x +x, point.y +y)

    var message: String = StringMaker().
                            append("Moved Mouse To: x: ")!!.append(point.x)!!.append(" y: ")!!.append(point.y)!!.append(" in the middle of: ")!!.append(StringUtil.getInstance()!!.toString(rectangle))!!.toString()!!
            

logUtil!!.put(message, this, "moveMouseToTarget")
}


open fun mouseMove(point: Point)
        //nullable = true from not(false or (false and false)) = true
{

                    var point = point
this.mouseMove(point.x, point.y)
}


open fun mouseMove(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var x = x


                    var y = y
this.robot.mouseMove(x, y)

    var message: String = StringMaker().
                            append("Moved Mouse To: x: ")!!.append(x)!!.append(" y: ")!!.append(y)!!.toString()!!
            

logUtil!!.put(message, this, "moveMouse")
}


                @Throws(Exception::class)
            
open fun mouseMoveToTarget(rectangle: Rectangle)
        //nullable = true from not(false or (false and false)) = true
{

                    var rectangle = rectangle
this.mouseMoveToTarget(rectangle, 0, 0)
}


open fun createScreenCapture(screenRect: Rectangle)
        //nullable = true from not(false or (false and false)) = true
: BufferedImage{

                    var screenRect = screenRect



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.robot.createScreenCapture(screenRect)
}


open fun delay(ms: Integer)
        //nullable = true from not(false or (false and false)) = true
{

                    var ms = ms
this.robot.delay(ms)
}


open fun getAutoDelay()
        //nullable = true from not(false or (false and true)) = true
: Integer{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.robot.getAutoDelay()
}


open fun getPixelColor(x: Integer, y: Integer)
        //nullable = true from not(false or (false and false)) = true
: Color{

                    var x = x


                    var y = y



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.robot.getPixelColor(x, y)
}


open fun isAutoWaitForIdle()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.robot.isAutoWaitForIdle()
}


open fun keyPress(keycode: Integer)
        //nullable = true from not(false or (false and false)) = true
{

                    var keycode = keycode
this.robot.keyPress(keycode)
}


open fun keyRelease(keycode: Integer)
        //nullable = true from not(false or (false and false)) = true
{

                    var keycode = keycode
this.robot.keyRelease(keycode)
}


open fun mouseMove(x: Integer, y: Integer)
        //nullable = true from not(false or (false and false)) = true
{

                    var x = x


                    var y = y
this.robot.mouseMove(x, y)
}


open fun mousePress(buttons: Integer)
        //nullable = true from not(false or (false and false)) = true
{

                    var buttons = buttons
this.robot.mousePress(buttons)
}


open fun mouseRelease(buttons: Integer)
        //nullable = true from not(false or (false and false)) = true
{

                    var buttons = buttons
this.robot.mouseRelease(buttons)
}


open fun mouseWheel(wheelAmt: Integer)
        //nullable = true from not(false or (false and false)) = true
{

                    var wheelAmt = wheelAmt
this.robot.mouseWheel(wheelAmt)
}


open fun setAutoDelay(ms: Integer)
        //nullable = true from not(false or (false and false)) = true
{

                    var ms = ms
this.robot.setAutoDelay(ms)
}


open fun setAutoWaitForIdle(isOn: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var isOn = isOn
this.robot.setAutoWaitForIdle(isOn)
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.robot.toString()
}


open fun waitForIdle()
        //nullable = true from not(false or (false and true)) = true
{this.robot.waitForIdle()
}


open fun on()
        //nullable = true from not(false or (false and true)) = true
{}


open fun off()
        //nullable = true from not(false or (false and true)) = true
{}


}
                
            

