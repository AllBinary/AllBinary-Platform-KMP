
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
        package org.allbinary.input.motion.gesture.observer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.InputFactory
import org.allbinary.input.motion.gesture.MotionGestureInput
import org.allbinary.input.motion.gesture.TouchMotionGestureFactory
import org.allbinary.logic.util.event.AllBinaryEventCircularPool

open public class MotionEventCircularPool
            : Object
         {
        
companion object {
            
    open fun getInstance(id: Int)
        //nullable =  from not(true or (false and false)) = 
: MotionEventCircularPool{
var id = id



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return MotionEventCircularPool(id)
}


    private val MIN: Int = TouchMotionGestureFactory.getInstance()!!.LAST_MOTION.getId()!!

        }
            
    private var eventPool: AllBinaryEventCircularPool = AllBinaryEventCircularPool((InputFactory.getInstance()!!.MAX -1) -MIN)
private constructor ()
            : super()
        {
}

private constructor (id: Int)
            : super()
        {
var id = id
eventPool!!.init(MotionEventFactory(eventPool, id))
}


                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun getInstance(motionGestureInput: MotionGestureInput)
        //nullable =  from not(true or (false and false)) = 
: MotionGestureEvent{
var motionGestureInput = motionGestureInput



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return eventPool!!.getInstance(motionGestureInput!!.getId() -MIN) as MotionGestureEvent
}


}
                
            

