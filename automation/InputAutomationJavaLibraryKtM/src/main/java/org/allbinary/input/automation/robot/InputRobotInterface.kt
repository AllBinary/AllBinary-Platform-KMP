
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import java.awt.image.BufferedImage
import javax.help.HelpSet
interface InputRobotInterface {
        

open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getHelpSet()
        //nullable = true from not(false or (false and true)) = true
: HelpSet

open fun createScreenCapture(screenRect: Rectangle)
        //nullable = true from not(false or (false and false)) = true
: BufferedImage

open fun delay(ms: Integer)
        //nullable = true from not(false or (false and false)) = true


open fun getAutoDelay()
        //nullable = true from not(false or (false and true)) = true
: Integer

open fun getPixelColor(x: Integer, y: Integer)
        //nullable = true from not(false or (false and false)) = true
: Color

open fun isAutoWaitForIdle()
        //nullable = true from not(false or (false and true)) = true
: Boolean

open fun keyPress(keycode: Integer)
        //nullable = true from not(false or (false and false)) = true


open fun keyRelease(keycode: Integer)
        //nullable = true from not(false or (false and false)) = true


open fun getMousePoint()
        //nullable = true from not(false or (false and true)) = true
: Point

open fun mouseMove(x: Integer, y: Integer)
        //nullable = true from not(false or (false and false)) = true


open fun mousePress(buttons: Integer)
        //nullable = true from not(false or (false and false)) = true


open fun mouseRelease(buttons: Integer)
        //nullable = true from not(false or (false and false)) = true


open fun mouseWheel(wheelAmt: Integer)
        //nullable = true from not(false or (false and false)) = true


open fun setAutoDelay(ms: Integer)
        //nullable = true from not(false or (false and false)) = true


open fun setAutoWaitForIdle(isOn: Boolean)
        //nullable = true from not(false or (false and false)) = true

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

open fun waitForIdle()
        //nullable = true from not(false or (false and true)) = true


open fun mouseMove(point: Point)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
open fun mouseMoveToTarget(rectangle: Rectangle)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
open fun mouseMoveToTarget(rectangle: Rectangle, x: Integer, y: Integer)
        //nullable = true from not(false or (false and false)) = true


}
                
            

