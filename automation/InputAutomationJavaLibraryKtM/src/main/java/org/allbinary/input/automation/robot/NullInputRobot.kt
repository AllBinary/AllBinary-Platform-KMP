
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
import org.allbinary.input.automation.AbstractInputRobot
import org.allbinary.input.automation.PointFactory
import org.allbinary.logic.communication.log.LogUtil

open public class NullInputRobot : AbstractInputRobot
                , InputRobotInterface {
        

        companion object {
            
    val LIBRARY_NAME: String = "null"

    val NAME: String = "NULL"

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
public constructor        ()                        

                            : super(
                            null){


                            //For kotlin this is before the body of the constructor.
                    
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullInputRobot.NAME
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



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PointFactory.getInstance(0, 0)
}


open fun keyPress(keycode: Integer)
        //nullable = true from not(false or (false and false)) = true
{
var keycode = keycode
logUtil!!.put("KeyCode: " +keycode, this, "keyPress")
}


open fun keyRelease(keycode: Integer)
        //nullable = true from not(false or (false and false)) = true
{
var keycode = keycode
logUtil!!.put("KeyCode: " +keycode, this, "keyRelease")
}


open fun mouseMove(x: Integer, y: Integer)
        //nullable = true from not(false or (false and false)) = true
{
var x = x
var y = y
logUtil!!.put("X: " +x +" Y: " +y, this, "mouseMove")
}


open fun mousePress(buttons: Integer)
        //nullable = true from not(false or (false and false)) = true
{
var buttons = buttons
logUtil!!.put("Buttons: " +buttons, this, "mousePress")
}


open fun mouseRelease(buttons: Integer)
        //nullable = true from not(false or (false and false)) = true
{
var buttons = buttons
logUtil!!.put("Buttons: " +buttons, this, "mouseRelease")
}


open fun createScreenCapture(screenRect: Rectangle)
        //nullable = true from not(false or (false and false)) = true
: BufferedImage{
var screenRect = screenRect



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun delay(ms: Integer)
        //nullable = true from not(false or (false and false)) = true
{
var ms = ms
}


open fun getAutoDelay()
        //nullable = true from not(false or (false and true)) = true
: Integer{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}


open fun getPixelColor(x: Integer, y: Integer)
        //nullable = true from not(false or (false and false)) = true
: Color{
var x = x
var y = y



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun isAutoWaitForIdle()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun mouseWheel(wheelAmt: Integer)
        //nullable = true from not(false or (false and false)) = true
{
var wheelAmt = wheelAmt
}


open fun setAutoDelay(ms: Integer)
        //nullable = true from not(false or (false and false)) = true
{
var ms = ms
}


open fun setAutoWaitForIdle(isOn: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var isOn = isOn
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "DirectXWindowsInputRobot"
}


open fun waitForIdle()
        //nullable = true from not(false or (false and true)) = true
{
}


}
                
            

