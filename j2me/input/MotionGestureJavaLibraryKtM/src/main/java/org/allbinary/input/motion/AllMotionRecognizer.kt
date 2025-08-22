
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
        
import org.allbinary.graphics.CustomGPoint
import org.allbinary.graphics.GPointCircularPool
import org.allbinary.input.motion.button.TouchButtonRecognizer
import org.allbinary.input.motion.gesture.MotionGestureRecognizer
import org.allbinary.logic.communication.log.LogUtil

open public class AllMotionRecognizer : MotionRecognizer {
        

        companion object {
            
    private var index: Int = 0

    private val pointCircularPool: GPointCircularPool = GPointCircularPool(40)

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val motionGestureRecognizer: MotionGestureRecognizer

    private var touchButtonProcessing: Boolean = false

    private val touchButtonRecognizer: TouchButtonRecognizer

    private val id: Int
public constructor        (){this.id= index++
this.motionGestureRecognizer= MotionGestureRecognizer(id)
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
                                

    
                        if(!touchButtonProcessing)
                        
                                    {
                                    
    var point: CustomGPoint = pointCircularPool!!.getNextInstance() as CustomGPoint

point.setX(x)
point.setY(y)
this.motionGestureRecognizer!!.processPressedMotionEvent(point, deviceId, modifiers)

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

    
                        if(this.touchButtonRecognizer!!.releaseTouchButtonInput(x, y, deviceId))
                        
                                    {
                                    
                                    }
                                

    
                        if(!touchButtonProcessing)
                        
                                    {
                                    
    var point: CustomGPoint = pointCircularPool!!.getNextInstance() as CustomGPoint

point.setX(x)
point.setY(y)
this.motionGestureRecognizer!!.processReleasedMotionEvent(point, deviceId, modifiers)

                                    }
                                

    
                        if(touchButtonProcessing)
                        
                                    {
                                    touchButtonProcessing= false

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
                                

    
                        if(!touchButtonProcessing)
                        
                                    {
                                    
    var point: CustomGPoint = pointCircularPool!!.getNextInstance() as CustomGPoint

point.setX(x)
point.setY(y)
this.motionGestureRecognizer!!.processDraggedMotionEvent(point, deviceId, modifiers)

                                    }
                                
}


    private var lastX: Int= 0

    private var lastY: Int= 0

                @Throws(Exception::class)
            
open fun processMovedMotionEvent(x: Int, y: Int, deviceId: Int, modifiers: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var x = x


                    var y = y


                    var deviceId = deviceId


                    var modifiers = modifiers

    
                        if(x != lastX || y != lastY)
                        
                                    {
                                    this.lastX= x
this.lastY= y

    var point: CustomGPoint = pointCircularPool!!.getNextInstance() as CustomGPoint

point.setX(x)
point.setY(y)
this.motionGestureRecognizer!!.processMovedMotionEvent(point, deviceId, modifiers)

                                    }
                                
}


open fun getMotionGestureRecognizer()
        //nullable = true from not(false or (false and true)) = true
: MotionGestureRecognizer{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return motionGestureRecognizer
}


}
                
            

