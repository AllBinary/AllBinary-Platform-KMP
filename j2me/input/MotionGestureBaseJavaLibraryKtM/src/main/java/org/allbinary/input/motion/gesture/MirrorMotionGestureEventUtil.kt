
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.PointFactory
import org.allbinary.input.motion.gesture.observer.MotionEventCircularPool
import org.allbinary.input.motion.gesture.observer.MotionGestureEvent

open public class MirrorMotionGestureEventUtil
            : Object
         {
        

        companion object {
            
    private val instance: MirrorMotionGestureEventUtil = MirrorMotionGestureEventUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: MirrorMotionGestureEventUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private val motionEventCircularPool: MotionEventCircularPool
private constructor        ()
            : super()
        {this.motionEventCircularPool= MotionEventCircularPool.getInstance(Integer.MAX_VALUE)
}


                @Throws(Exception::class)
            
open fun mirrorVerticle(motionGestureEvent: MotionGestureEvent, halfWidth: Int)
        //nullable = true from not(false or (false and false)) = true
: MotionGestureEvent{

                    var motionGestureEvent = motionGestureEvent


                    var halfWidth = halfWidth

    var event: MotionGestureEvent = this.motionEventCircularPool!!.getInstance(motionGestureEvent!!.getMotionGesture())!!
            


    var previousNewX: Int = this.getNewX(motionGestureEvent!!.getPreviousPoint()!!.getX(), halfWidth)!!
            


    var currentNewX: Int = this.getNewX(motionGestureEvent!!.getCurrentPoint()!!.getX(), halfWidth)!!
            


    var pointFactory: PointFactory = PointFactory.getInstance()!!
            


    var mirroredPreviousPoint: GPoint = pointFactory!!.getInstance(previousNewX, motionGestureEvent!!.getPreviousPoint()!!.getY())!!
            


    var mirroredCurrentPoint: GPoint = pointFactory!!.getInstance(currentNewX, motionGestureEvent!!.getCurrentPoint()!!.getY())!!
            

event.setPreviousPoint(mirroredPreviousPoint)
event.setCurrentPoint(mirroredCurrentPoint)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return event
}


open fun getNewX(x: Int, halfWidth: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var x = x


                    var halfWidth = halfWidth

    var newX: Int= 0


    
                        if(x > halfWidth)
                        
                                    {
                                    newX= halfWidth -(x -halfWidth)

                                    }
                                
                        else {
                            newX= halfWidth +(halfWidth -x)

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newX
}


}
                
            

