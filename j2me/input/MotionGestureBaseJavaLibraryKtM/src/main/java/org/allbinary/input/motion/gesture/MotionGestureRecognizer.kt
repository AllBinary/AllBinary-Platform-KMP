
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
        package org.allbinary.input.motion.gesture




        import java.lang.Object        
        
        import java.lang.Math
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.Line
import org.allbinary.graphics.PointFactory
import org.allbinary.input.motion.gesture.configuration.MotionGestureConfiguration
import org.allbinary.input.motion.gesture.configuration.MotionGestureConfigurationFactory
import org.allbinary.input.motion.gesture.observer.BasicMotionGesturesHandler
import org.allbinary.input.motion.gesture.observer.MotionEventCircularPool
import org.allbinary.input.motion.gesture.observer.MotionGestureEvent
import org.allbinary.input.motion.gesture.observer.MovedMotionGesturesHandler
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.math.J2SEMath
import org.allbinary.logic.util.event.handler.BasicEventHandler
import org.allbinary.string.CommonStrings

open public class MotionGestureRecognizer
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val j2seMath: J2SEMath = J2SEMath.getInstance()!!

    private val origin: GPoint = PointFactory.getInstance()!!.ZERO_ZERO

    private var previous: GPoint = origin

    private var intermediate: GPoint = origin

    private val line: Line = Line(origin, origin)

    private val motionGesturesHandler: BasicMotionGesturesHandler

    private val movedMotionGesturesHandler: BasicEventHandler

    private val motionEventCircularPool: MotionEventCircularPool
public constructor (id: Int)
            : super()
        {
    //var id = id
this.motionEventCircularPool= MotionEventCircularPool.getInstance(id)

    var motionGesturesHandler: BasicEventHandler = BasicEventHandler()


    var movedMotionGesturesHandler: BasicEventHandler = motionGesturesHandler


        try {
            motionGesturesHandler= BasicMotionGesturesHandler.getInstance()
movedMotionGesturesHandler= MovedMotionGesturesHandler.getInstance()
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

this.logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CONSTRUCTOR, e)
}

this.motionGesturesHandler= motionGesturesHandler as BasicMotionGesturesHandler
this.movedMotionGesturesHandler= movedMotionGesturesHandler
}


                @Throws(Exception::class)
            
    open fun processPressedMotionEvent(current: GPoint, deviceId: Int, button: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var current = current
    //var deviceId = deviceId
    //var button = button
this.intermediate= this.origin
this.previous= this.origin

    var event: MotionGestureEvent = this.motionEventCircularPool!!.getInstance(TouchMotionGestureFactory.getInstance()!!.PRESSED)!!

event.setPreviousPoint(this.previous)
event.setCurrentPoint(current)
this.motionGesturesHandler!!.fireEvent(event)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


                @Throws(Exception::class)
            
    open fun processReleasedMotionEvent(current: GPoint, deviceId: Int, button: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var current = current
    //var deviceId = deviceId
    //var button = button

    var event: MotionGestureEvent = this.motionEventCircularPool!!.getInstance(TouchMotionGestureFactory.getInstance()!!.RELEASED)!!

event.setPreviousPoint(this.previous)
event.setCurrentPoint(current)
this.motionGesturesHandler!!.fireEvent(event)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


                @Throws(Exception::class)
            
    open fun processDraggedMotionEvent(current: GPoint, deviceId: Int, buttonMask: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var current = current
    //var deviceId = deviceId
    //var buttonMask = buttonMask

    
                        if(this.previous == this.origin || this.intermediate == this.origin)
                        
                                    {
                                    this.previous= current
this.intermediate= current



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                
this.line.setP1(this.previous)
this.line.setP2(current)

    var minimumMotionGesture: Int = MotionGestureConfigurationFactory.getInstance()!!.getMinimumMotionGesture()!!


    
                        if(this.j2seMath!!.abs(this.line.getDeltaX().toFloat()) < minimumMotionGesture && j2seMath!!.abs(line.getDeltaY().toFloat()) < minimumMotionGesture)
                        
                                    {
                                    this.intermediate= current



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    var gradient: Double = this.line.getGradient()!!


    var absGradient: Double = this.j2seMath!!.abs(gradient.toFloat()).toDouble()


    var conf: MotionGestureConfiguration = MotionGestureConfigurationFactory.getInstance()!!


    var touchMotionGestureFactory: TouchMotionGestureFactory = TouchMotionGestureFactory.getInstance()!!


    var newMotionGesture: MotionGestureInput = touchMotionGestureFactory!!.NO_MOTION


    var diagonalToleranceHigher: Double = 12.0


    var diagonalToleranceLower: Double = 12.0


    
                        if(conf.isDiagonalMotionGestureAllowed())
                        
                                    {
                                    diagonalToleranceHigher= (90 -conf.getDiagonalTolerance()).toDouble()
diagonalToleranceLower= conf.getDiagonalTolerance().toDouble()

                                    }
                                

    
                        if(absGradient > Math.tan(Math.toRadians(diagonalToleranceHigher)))
                        
                                    {
                                    
    
                        if(this.line.getDeltaY() > 0)
                        
                                    {
                                    newMotionGesture= touchMotionGestureFactory!!.UP

                                    }
                                
                        else {
                            newMotionGesture= touchMotionGestureFactory!!.DOWN

                        }
                            

                                    }
                                
                        else {
                            
    
                        if(absGradient < Math.tan(Math.toRadians(diagonalToleranceLower)))
                        
                                    {
                                    
    
                        if(this.line.getDeltaX() > 0)
                        
                                    {
                                    newMotionGesture= touchMotionGestureFactory!!.LEFT

                                    }
                                
                        else {
                            newMotionGesture= touchMotionGestureFactory!!.RIGHT

                        }
                            

                                    }
                                
                        else {
                            
    
                        if(gradient > 0)
                        
                                    {
                                    
    
                        if(this.line.getDeltaX() > 0)
                        
                                    {
                                    newMotionGesture= touchMotionGestureFactory!!.DIAGONAL_UP_LEFT

                                    }
                                
                        else {
                            newMotionGesture= touchMotionGestureFactory!!.DIAGONAL_DOWN_RIGHT

                        }
                            

                                    }
                                
                        else {
                            
    
                        if(this.line.getDeltaX() > 0)
                        
                                    {
                                    newMotionGesture= touchMotionGestureFactory!!.DIAGONAL_DOWN_LEFT

                                    }
                                
                        else {
                            newMotionGesture= touchMotionGestureFactory!!.DIAGONAL_UP_RIGHT

                        }
                            

                        }
                            

                        }
                            

                        }
                            
this.previous= current
this.intermediate= current

    var event: MotionGestureEvent = this.motionEventCircularPool!!.getInstance(newMotionGesture)!!

event.setPreviousPoint(this.previous)
event.setCurrentPoint(current)
this.motionGesturesHandler!!.fireEvent(event)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 
}


                @Throws(Exception::class)
            
    open fun processMovedMotionEvent(current: GPoint, deviceId: Int, button: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var current = current
    //var deviceId = deviceId
    //var button = button

    var event: MotionGestureEvent = this.motionEventCircularPool!!.getInstance(TouchMotionGestureFactory.getInstance()!!.NO_MOTION)!!

event.setPreviousPoint(this.previous)
event.setCurrentPoint(current)
this.movedMotionGesturesHandler!!.fireEvent(event)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


    open fun getMotionGesturesHandler()
        //nullable = true from not(false or (false and true)) = true
: BasicMotionGesturesHandler{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return motionGesturesHandler
}


}
                
            

