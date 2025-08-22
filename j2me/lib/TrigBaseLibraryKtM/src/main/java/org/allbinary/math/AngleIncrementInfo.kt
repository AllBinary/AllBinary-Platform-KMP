
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
        package org.allbinary.math




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.logic.string.StringMaker

open public class AngleIncrementInfo
            : Object
         {
        

        companion object {
            
    private val INCREMENT: String = "Inc: "

        }
            
    private val angleIncrement: Short

    val DOWN_FRAME: Integer

    val UP_FRAME: Integer

    val LEFT_FRAME: Integer

    val RIGHT_FRAME: Integer
public constructor        (angleIncrement: Short)
            : super()
        {

                    var angleIncrement = angleIncrement
this.angleIncrement= angleIncrement

    var angleFactory: AngleFactory = AngleFactory.getInstance()!!


    var smallIntegerSingletonFactory: SmallIntegerSingletonFactory = SmallIntegerSingletonFactory.getInstance()!!

this.DOWN_FRAME= smallIntegerSingletonFactory!!.getInstance(angleFactory!!.DOWN.getValue() /this.angleIncrement)
this.UP_FRAME= smallIntegerSingletonFactory!!.getInstance(angleFactory!!.UP.getValue().toInt())
this.LEFT_FRAME= smallIntegerSingletonFactory!!.getInstance(angleFactory!!.LEFT.getValue() /this.angleIncrement)
this.RIGHT_FRAME= smallIntegerSingletonFactory!!.getInstance(angleFactory!!.RIGHT.getValue() /this.angleIncrement)
}


    private val frameUtil: FrameUtil = FrameUtil.getInstance()!!

open fun getFrameAngle(frame: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var frame = frame



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return frameUtil!!.getFrameAngle(frame, this.angleIncrement.toInt())
}


open fun getAngleIncrement()
        //nullable = true from not(false or (false and true)) = true
: Short{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return angleIncrement
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringMaker().
                            append(INCREMENT)!!.append(this.angleIncrement)!!.toString()
}


open fun getClosestGeneralDirection(angle: Short)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var angle = angle

    var closestDirection: Integer = SmallIntegerSingletonFactory.getInstance()!!.getInstance(360)!!


    
                        if(UP_FRAME.toInt() -angle < closestDirection!!.toInt() -angle)
                        
                                    {
                                    closestDirection= UP_FRAME

                                    }
                                

    
                        if(DOWN_FRAME.toInt() -angle < closestDirection!!.toInt() -angle)
                        
                                    {
                                    closestDirection= DOWN_FRAME

                                    }
                                

    
                        if(LEFT_FRAME.toInt() -angle < closestDirection!!.toInt() -angle)
                        
                                    {
                                    closestDirection= LEFT_FRAME

                                    }
                                

    
                        if(RIGHT_FRAME.toInt() -angle < closestDirection!!.toInt() -angle)
                        
                                    {
                                    closestDirection= RIGHT_FRAME

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return closestDirection!!.toInt()
}


}
                
            

