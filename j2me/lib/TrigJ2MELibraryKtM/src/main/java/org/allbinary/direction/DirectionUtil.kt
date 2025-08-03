
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
        package org.allbinary.direction



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.math.Angle
import org.allbinary.math.AngleFactory

open public class DirectionUtil
            : Object
         {
        

        companion object {


    private val instance: DirectionUtil = DirectionUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: DirectionUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
    private var directionArray: Array<Angle?> = arrayOfNulls(10)

    private var directionArray2: Array<Angle?> = arrayOfNulls(10)
private constructor        ()
            : super()
        {
    var angleFactory: AngleFactory = AngleFactory.getInstance()!!
            


    var directionFactory: DirectionFactory = DirectionFactory.getInstance()!!
            

directionArray[directionFactory!!.LEFT.getValue()]= angleFactory!!.LEFT
directionArray[directionFactory!!.RIGHT.getValue()]= angleFactory!!.RIGHT
directionArray[directionFactory!!.UP.getValue()]= angleFactory!!.UP
directionArray[directionFactory!!.DOWN.getValue()]= angleFactory!!.DOWN
directionArray2[directionFactory!!.LEFT.getValue()]= angleFactory!!.LEFT
directionArray2[directionFactory!!.RIGHT.getValue()]= angleFactory!!.RIGHT
directionArray2[directionFactory!!.UP.getValue()]= angleFactory!!.UP
directionArray2[directionFactory!!.DOWN.getValue()]= angleFactory!!.DOWN
}


open fun getAngle(direction: Direction)
        //nullable = true from not(false or (false and false)) = true
: Angle{

                    var direction = direction



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionArray2[direction!!.getValue()]!!
}


open fun getFrameAngle(direction: Direction)
        //nullable = true from not(false or (false and false)) = true
: Angle{

                    var direction = direction



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionArray[direction!!.getValue()]!!
}


}
                
            

