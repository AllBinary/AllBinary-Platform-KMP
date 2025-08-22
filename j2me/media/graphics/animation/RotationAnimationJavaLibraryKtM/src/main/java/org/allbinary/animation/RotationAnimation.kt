
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.direction.Direction
import org.allbinary.direction.DirectionUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.math.Angle
import org.allbinary.math.AngleFactory
import org.allbinary.math.AngleInfo
import org.allbinary.math.FrameUtil
import org.allbinary.util.CircularIndexUtil

open public class RotationAnimation : IndexedAnimation
                , RotationAnimationInterface {
        

    private val frameUtil: FrameUtil = FrameUtil.getInstance()!!

    val directionUtil: DirectionUtil = DirectionUtil.getInstance()!!

    val angleInfo: AngleInfo

    var circularIndexUtil: CircularIndexUtil
protected constructor        (angleInfo: AngleInfo, animationBehavior: AnimationBehavior)                        

                            : super(animationBehavior){

                    var angleInfo = angleInfo


                    var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.angleInfo= angleInfo
this.circularIndexUtil= CircularIndexUtil.getInstance(360 /angleInfo!!.getAngleIncrementInfo()!!.getAngleIncrement())
}

protected constructor        (angleInfo: AngleInfo, totalAngle: Short, animationBehavior: AnimationBehavior)                        

                            : super(animationBehavior){

                    var angleInfo = angleInfo


                    var totalAngle = totalAngle


                    var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.angleInfo= angleInfo
this.circularIndexUtil= CircularIndexUtil.getInstance(totalAngle /angleInfo!!.getAngleIncrementInfo()!!.getAngleIncrement())
}

protected constructor        (animationBehavior: AnimationBehavior)                        

                            : super(animationBehavior){

                    var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.angleInfo= AngleInfo.getInstance(AngleFactory.getInstance()!!.QUARTER_TOTAL_ANGLE)
this.circularIndexUtil= CircularIndexUtil.getInstance(4)
}

override fun nextRotation()
        //nullable = true from not(false or (false and true)) = true
{this.angleInfo!!.adjustAngle(this.circularIndexUtil!!.next())
}

override fun previousRotation()
        //nullable = true from not(false or (false and true)) = true
{this.angleInfo!!.adjustAngle(this.circularIndexUtil!!.previous())
}


open fun nextRotationZ()
        //nullable = true from not(false or (false and true)) = true
{}


open fun previousRotationZ()
        //nullable = true from not(false or (false and true)) = true
{}

override fun setFrame(index: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var index = index
this.circularIndexUtil!!.setIndex(index)

    var newFrame: Int = this.circularIndexUtil!!.getIndex()!!

this.angleInfo!!.adjustAngle(newFrame)
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

override fun adjustFrame(angle: Angle)
        //nullable = true from not(false or (false and false)) = true
{

                    var angle = angle
this.adjustFrame(angle.getValue())
}

override fun adjustFrame(angle: Short)
        //nullable = true from not(false or (false and false)) = true
{

                    var angle = angle
this.setFrame(this.frameUtil!!.getFrameForAngle(angle, this.angleInfo!!.getAngleIncrementInfo()!!.getAngleIncrement().toInt()))
}

override fun getFrame()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.circularIndexUtil!!.getIndex()
}

override fun getSize()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.circularIndexUtil!!.getSize()
}

override fun getAngleInfoP()
        //nullable = true from not(false or (false and true)) = true
: AngleInfo{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.angleInfo
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringMaker().
                            append(super.toString())!!.append("circularIndexUtil: ")!!.append(this.circularIndexUtil!!.toString())!!.append("angleInfo: ")!!.append(this.angleInfo!!.toString())!!.toString()
}


}
                
            

