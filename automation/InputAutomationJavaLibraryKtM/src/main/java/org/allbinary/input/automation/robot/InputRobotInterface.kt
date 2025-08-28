
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
interface InputRobotInterface {
        

open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getHelpSet()
        //nullable = true from not(false or (false and true)) = true
: HelpSet

        Updates for KMP build        
        

open fun createScreenCapture(screenRect: Rectangle)
        //nullable = true from not(false or (false and false)) = true
: BufferedImage

        Updates for KMP build        
        

open fun delay(ms: Integer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun getAutoDelay()
        //nullable = true from not(false or (false and true)) = true
: Integer

        Updates for KMP build        
        

open fun getPixelColor(x: Integer, y: Integer)
        //nullable = true from not(false or (false and false)) = true
: Color

        Updates for KMP build        
        

open fun isAutoWaitForIdle()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        

open fun keyPress(keycode: Integer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun keyRelease(keycode: Integer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun getMousePoint()
        //nullable = true from not(false or (false and true)) = true
: Point

        Updates for KMP build        
        

open fun mouseMove(x: Integer, y: Integer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun mousePress(buttons: Integer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun mouseRelease(buttons: Integer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun mouseWheel(wheelAmt: Integer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setAutoDelay(ms: Integer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setAutoWaitForIdle(isOn: Boolean)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        
override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        

open fun waitForIdle()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        

open fun mouseMove(point: Point)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun mouseMoveToTarget(rectangle: Rectangle)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun mouseMoveToTarget(rectangle: Rectangle, x: Integer, y: Integer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

}
                
            

