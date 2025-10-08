
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
        package org.allbinary.input.gyro




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.InputFactory
import org.allbinary.input.motion.gesture.MotionGestureInput

open public class OrientationMotionGestureFactory
            : Object
         {
        
companion object {
            
    private val instance: OrientationMotionGestureFactory = OrientationMotionGestureFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: OrientationMotionGestureFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val LEFT: MotionGestureInput

    val RIGHT: MotionGestureInput

    val UP: MotionGestureInput

    val DOWN: MotionGestureInput

    val ROLL_LEFT: MotionGestureInput

    val ROLL_RIGHT: MotionGestureInput
private constructor ()
            : super()
        {

    var MAX: Int = InputFactory.getInstance()!!.MAX

LEFT= MotionGestureInput(MAX -20, "Left Orient")
RIGHT= MotionGestureInput(MAX -21, "Right Orient")
UP= MotionGestureInput(MAX -22, "Up Orient")
DOWN= MotionGestureInput(MAX -23, "Down Orient")
ROLL_LEFT= MotionGestureInput(MAX -24, "Roll Left")
ROLL_RIGHT= MotionGestureInput(MAX -25, "Roll Right")
}


}
                
            

