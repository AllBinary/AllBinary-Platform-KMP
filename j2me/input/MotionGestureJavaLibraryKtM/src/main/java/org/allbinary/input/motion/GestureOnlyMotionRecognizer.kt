
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
import org.allbinary.input.motion.gesture.MotionGestureRecognizer

open public class GestureOnlyMotionRecognizer : MotionRecognizer {
        
companion object {
            
    private var index: Int = 0

    private val pointCircularPool: GPointCircularPool = GPointCircularPool(40)

        }
            
    private val motionGestureRecognizer: MotionGestureRecognizer

    private val id: Int
public constructor (){
this.id= index++
this.motionGestureRecognizer= MotionGestureRecognizer(id)
}


                @Throws(Exception::class)
            
    override fun processStartMotionEvent(x: Int, y: Int, deviceId: Int, modifiers: Int)
        //nullable = true from not(false or (false and false)) = true
{
var x = x
var y = y
var deviceId = deviceId
var modifiers = modifiers

    var point: CustomGPoint = pointCircularPool!!.getNextInstance() as CustomGPoint

point.setX(x)
point.setY(y)
this.motionGestureRecognizer!!.processPressedMotionEvent(point, deviceId, modifiers)
}


                @Throws(Exception::class)
            
    override fun processEndMotionEvent(x: Int, y: Int, deviceId: Int, modifiers: Int)
        //nullable = true from not(false or (false and false)) = true
{
var x = x
var y = y
var deviceId = deviceId
var modifiers = modifiers

    var point: CustomGPoint = pointCircularPool!!.getNextInstance() as CustomGPoint

point.setX(x)
point.setY(y)
this.motionGestureRecognizer!!.processReleasedMotionEvent(point, deviceId, modifiers)
}


                @Throws(Exception::class)
            
    override fun processDraggedMotionEvent(x: Int, y: Int, deviceId: Int, modifiers: Int)
        //nullable = true from not(false or (false and false)) = true
{
var x = x
var y = y
var deviceId = deviceId
var modifiers = modifiers

    var point: CustomGPoint = pointCircularPool!!.getNextInstance() as CustomGPoint

point.setX(x)
point.setY(y)
this.motionGestureRecognizer!!.processDraggedMotionEvent(point, deviceId, modifiers)
}


}
                
            

