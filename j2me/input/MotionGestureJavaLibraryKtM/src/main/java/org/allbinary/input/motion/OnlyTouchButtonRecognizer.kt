
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
        package org.allbinary.input.motion




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.input.motion.button.TouchButtonRecognizer

open public class OnlyTouchButtonRecognizer : MotionRecognizer {
        

    private val touchButtonRecognizer: TouchButtonRecognizer

    private var touchButtonProcessing: Boolean = false
public constructor (){
this.touchButtonRecognizer= TouchButtonRecognizer()
}


                @Throws(Exception::class)
            
    override fun processStartMotionEvent(x: Int, y: Int, deviceId: Int, modifiers: Int)
        //nullable = true from not(false or (false and false)) = true
{
var x = x
var y = y
var deviceId = deviceId
var modifiers = modifiers

    
                        if(this.touchButtonRecognizer!!.pressTouchButtonInput(x, y, deviceId))
                        
                                    {
                                    touchButtonProcessing= true

                                    }
                                
}


                @Throws(Exception::class)
            
    override fun processEndMotionEvent(x: Int, y: Int, deviceId: Int, modifiers: Int)
        //nullable = true from not(false or (false and false)) = true
{
var x = x
var y = y
var deviceId = deviceId
var modifiers = modifiers

    
                        if(touchButtonProcessing)
                        
                                    {
                                    touchButtonProcessing= false

                                    }
                                

    
                        if(this.touchButtonRecognizer!!.releaseTouchButtonInput(x, y, deviceId))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                
}


                @Throws(Exception::class)
            
    override fun processDraggedMotionEvent(x: Int, y: Int, deviceId: Int, modifiers: Int)
        //nullable = true from not(false or (false and false)) = true
{
var x = x
var y = y
var deviceId = deviceId
var modifiers = modifiers

    
                        if(touchButtonProcessing)
                        
                                    {
                                    this.touchButtonRecognizer!!.pressTouchButtonInput(x, y, deviceId)

                                    }
                                
}


}
                
            

