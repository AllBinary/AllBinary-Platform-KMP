
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

open public class TrackballMotionGestureFactory
            : Object
         {
        
companion object {
            
    private val MOTION: TrackballMotionGestureFactory = TrackballMotionGestureFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TrackballMotionGestureFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return MOTION
}


        }
            
    val LEFT: MotionGestureInput

    val RIGHT: MotionGestureInput

    val UP: MotionGestureInput

    val DOWN: MotionGestureInput
private constructor ()
            : super()
        {

    var MAX: Int = InputFactory.getInstance()!!.MAX

LEFT= MotionGestureInput(MAX -26, "L Trackball")
RIGHT= MotionGestureInput(MAX -27, "R Trackball")
UP= MotionGestureInput(MAX -28, "Up Trackball")
DOWN= MotionGestureInput(MAX -29, "D Trackball")
}


}
                
            

