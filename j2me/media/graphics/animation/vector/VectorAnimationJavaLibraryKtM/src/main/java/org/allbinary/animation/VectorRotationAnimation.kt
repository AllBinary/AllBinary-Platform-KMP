
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
        package org.allbinary.animation



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.direction.Direction
import org.allbinary.graphics.color.BasicColor
import org.allbinary.math.Angle
import org.allbinary.math.AngleFactory
import org.allbinary.math.AngleInfo
import org.allbinary.math.FrameUtil

open public class VectorRotationAnimation : VectorBaseRotationAnimation {
        
public constructor        (currentPoints: Array<Array<IntArray?>?>, basicColor: BasicColor, animationBehavior: AnimationBehavior)                        

                            : super(AngleInfo.getInstance((AngleFactory.getInstance()!!.TOTAL_ANGLE /currentPoints!!.size).toShort()), currentPoints, basicColor, animationBehavior){

                    var currentPoints = currentPoints


                    var basicColor = basicColor


                    var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.angleInfo!!.adjustAngle(this.getFrame())
}

override fun setFrame(direction: Direction)
        //nullable = true from not(false or (false and false)) = true
{

                    var direction = direction

    var angle: Angle = directionUtil!!.getFrameAngle(direction)!!
            

this.adjustFrame(angle)
}

override fun setFrame(angle: Angle)
        //nullable = true from not(false or (false and false)) = true
{

                    var angle = angle
this.adjustFrame(angle)
}

override fun setFrame(index: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var index = index
super.setFrame(index)
this.angleInfo!!.adjustAngle(this.getFrame())
}


    private val frameUtil: FrameUtil = FrameUtil.getInstance()!!
            
override fun adjustFrame(newAngle: Short)
        //nullable = true from not(false or (false and false)) = true
{

                    var newAngle = newAngle
this.setFrame(frameUtil!!.getFrameForAngle(newAngle, this.angleInfo!!.getAngleIncrementInfo()!!.getAngleIncrement().toInt()))
}

override fun adjustFrame(newAngle: Angle)
        //nullable = true from not(false or (false and false)) = true
{

                    var newAngle = newAngle
this.adjustFrame(newAngle!!.getValue())
}


}
                
            

