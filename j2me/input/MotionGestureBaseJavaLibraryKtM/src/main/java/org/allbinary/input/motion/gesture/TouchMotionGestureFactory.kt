
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.InputFactory

open public class TouchMotionGestureFactory
            : Object
         {
        
companion object {
            
    private val instance: TouchMotionGestureFactory = TouchMotionGestureFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TouchMotionGestureFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val LEFT: MotionGestureInput

    val RIGHT: MotionGestureInput

    val UP: MotionGestureInput

    val DOWN: MotionGestureInput

    val PRESSED: MotionGestureInput

    val RELEASED: MotionGestureInput

    val DIAGONAL_DOWN_RIGHT: MotionGestureInput

    val DIAGONAL_DOWN_LEFT: MotionGestureInput

    val DIAGONAL_UP_RIGHT: MotionGestureInput

    val DIAGONAL_UP_LEFT: MotionGestureInput

    val NO_MOTION: MotionGestureInput

    val LAST_MOTION: MotionGestureInput
public constructor ()
            : super()
        {

    var MAX: Int = InputFactory.getInstance()!!.MAX

LEFT= MotionGestureInput(MAX -3, "Left Touch")
RIGHT= MotionGestureInput(MAX -4, "Right Touch")
UP= MotionGestureInput(MAX -5, "Up Touch")
DOWN= MotionGestureInput(MAX -6, "Down Touch")
PRESSED= MotionGestureInput(MAX -7, "Screen Press")
RELEASED= MotionGestureInput(MAX -8, "Released")
DIAGONAL_DOWN_RIGHT= MotionGestureInput(MAX -9, "Diagonal Dn R")
DIAGONAL_DOWN_LEFT= MotionGestureInput(MAX -10, "Diagonal Dn L")
DIAGONAL_UP_RIGHT= MotionGestureInput(MAX -11, "Diagonal Up R")
DIAGONAL_UP_LEFT= MotionGestureInput(MAX -12, "Diagonal Up L")
NO_MOTION= MotionGestureInput(MAX -2, "No Motion")
LAST_MOTION= MotionGestureInput(MAX -19, "Last Motion")
}


}
                
            

