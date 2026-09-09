
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
        

interface MotionGestureEventListener : BaseMotionGestureEventListener {
        

    open fun onPressedMotionGestureEvent(ev: MotionGestureEvent)
        //nullable = true from not(false or (false and false)) = true


    open fun onUpMotionGestureEvent(ev: MotionGestureEvent)
        //nullable = true from not(false or (false and false)) = true


    open fun onDownMotionGestureEvent(ev: MotionGestureEvent)
        //nullable = true from not(false or (false and false)) = true


    open fun onLeftMotionGestureEvent(ev: MotionGestureEvent)
        //nullable = true from not(false or (false and false)) = true


    open fun onRightMotionGestureEvent(ev: MotionGestureEvent)
        //nullable = true from not(false or (false and false)) = true


    open fun onDiagonalDownRightMotionGestureEvent(ev: MotionGestureEvent)
        //nullable = true from not(false or (false and false)) = true


    open fun onDiagonalDownLeftMotionGestureEvent(ev: MotionGestureEvent)
        //nullable = true from not(false or (false and false)) = true


    open fun onDiagonalUpRightMotionGestureEvent(ev: MotionGestureEvent)
        //nullable = true from not(false or (false and false)) = true


    open fun onDiagonalUpLeftMotionGestureEvent(ev: MotionGestureEvent)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
    open fun released(ev: MotionGestureEvent)
        //nullable = true from not(false or (false and false)) = true


}
                
            

