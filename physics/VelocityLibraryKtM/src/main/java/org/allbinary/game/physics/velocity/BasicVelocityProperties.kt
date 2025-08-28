
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
        package org.allbinary.game.physics.velocity




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.direction.Direction
import org.allbinary.direction.DirectionUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.math.BasicDecimal
import org.allbinary.logic.math.vector.AxisMathVectorUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.math.Angle
import org.allbinary.math.PositionStrings
import org.allbinary.string.CommonSeps

open public class BasicVelocityProperties
            : Object
        
                , BasicVelocityInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val velocityXBasicDecimal: BasicDecimal

    val velocityYBasicDecimal: BasicDecimal

    val velocityZBasicDecimal: BasicDecimal

    private val axisMathVectorUtil: AxisMathVectorUtil = AxisMathVectorUtil.getInstance()!!
public constructor        ()
            : super()
        {
this.velocityXBasicDecimal= BasicDecimal()
this.velocityYBasicDecimal= BasicDecimal()
this.velocityZBasicDecimal= BasicDecimal()
}

override fun zero()
        //nullable = true from not(false or (false and true)) = true
{
this.velocityXBasicDecimal!!.set(0)
this.velocityYBasicDecimal!!.set(0)
this.velocityZBasicDecimal!!.set(0)
}

override fun getVelocityXBasicDecimalP()
        //nullable = true from not(false or (false and true)) = true
: BasicDecimal{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return velocityXBasicDecimal
}

override fun getVelocityYBasicDecimalP()
        //nullable = true from not(false or (false and true)) = true
: BasicDecimal{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return velocityYBasicDecimal
}


open fun getVelocityZBasicDecimalP()
        //nullable = true from not(false or (false and true)) = true
: BasicDecimal{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return velocityXBasicDecimal
}


    val directionUtil: DirectionUtil = DirectionUtil.getInstance()!!
override fun setVelocity(magnitudeBasicDecimal: BasicDecimal, direction: Direction, otherDirection: Direction)
        //nullable = true from not(false or (false and false)) = true
{
    //var magnitudeBasicDecimal = magnitudeBasicDecimal
    //var direction = direction
    //var otherDirection = otherDirection

    var angle: Angle = directionUtil!!.getAngle(direction)!!


    var otherAngle: Angle = directionUtil!!.getAngle(otherDirection)!!

this.setVelocity(magnitudeBasicDecimal, angle, otherAngle)
}

override fun setVelocity(magnitude: Long, direction: Direction, otherDirection: Direction)
        //nullable = true from not(false or (false and false)) = true
{
    //var magnitude = magnitude
    //var direction = direction
    //var otherDirection = otherDirection

    var angle: Angle = directionUtil!!.getAngle(direction)!!


    var otherAngle: Angle = directionUtil!!.getAngle(otherDirection)!!

this.setVelocity(magnitude, angle, otherAngle)
}

override fun addVelocity(magnitudeBasicDecimal: BasicDecimal, direction: Direction, otherDirection: Direction)
        //nullable = true from not(false or (false and false)) = true
{
    //var magnitudeBasicDecimal = magnitudeBasicDecimal
    //var direction = direction
    //var otherDirection = otherDirection

    var angle: Angle = directionUtil!!.getAngle(direction)!!


    var otherAngle: Angle = directionUtil!!.getAngle(otherDirection)!!

this.addVelocity(magnitudeBasicDecimal, angle, otherAngle)
}

override fun addVelocity(magnitude: Long, direction: Direction, otherDirection: Direction)
        //nullable = true from not(false or (false and false)) = true
{
    //var magnitude = magnitude
    //var direction = direction
    //var otherDirection = otherDirection

    var angle: Angle = directionUtil!!.getAngle(direction)!!


    var otherAngle: Angle = directionUtil!!.getAngle(otherDirection)!!

this.addVelocity(magnitude, angle, otherAngle)
}

override fun setVelocity(magnitudeBasicDecimal: BasicDecimal, angle: Angle, otherAngle: Angle)
        //nullable = true from not(false or (false and false)) = true
{
    //var magnitudeBasicDecimal = magnitudeBasicDecimal
    //var angle = angle
    //var otherAngle = otherAngle

    var magnitude: Long = magnitudeBasicDecimal!!.getUnscaled()!!

this.setVelocity(magnitude, angle, otherAngle)
}

override fun addVelocity(magnitudeBasicDecimal: BasicDecimal, angle: Angle, otherAngle: Angle)
        //nullable = true from not(false or (false and false)) = true
{
    //var magnitudeBasicDecimal = magnitudeBasicDecimal
    //var angle = angle
    //var otherAngle = otherAngle

    var magnitude: Long = magnitudeBasicDecimal!!.getUnscaled()!!

this.addVelocity(magnitude, angle, otherAngle)
}

override fun setVelocity(magnitude: Long, angle: Angle, otherAngle: Angle)
        //nullable = true from not(false or (false and false)) = true
{
    //var magnitude = magnitude
    //var angle = angle
    //var otherAngle = otherAngle
this.setVelocity(magnitude, angle.getValue().toInt(), otherAngle!!.getValue().toInt())
}

override fun addVelocity(magnitude: Long, angle: Angle, otherAngle: Angle)
        //nullable = true from not(false or (false and false)) = true
{
    //var magnitude = magnitude
    //var angle = angle
    //var otherAngle = otherAngle
this.addVelocity(magnitude, angle.getValue().toInt(), otherAngle!!.getValue().toInt())
}


open fun setVelocity(magnitude: Long, angle: Int, otherAngle: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var magnitude = magnitude
    //var angle = angle
    //var otherAngle = otherAngle

    var xVector: Long = (axisMathVectorUtil!!.calculateX(magnitude, angle) /velocityXBasicDecimal!!.getScaledFactorValue())


    var yVector: Long = (axisMathVectorUtil!!.calculateY(magnitude, angle) /velocityYBasicDecimal!!.getScaledFactorValue())


    var zVector: Long = (axisMathVectorUtil!!.calculateZ(magnitude, otherAngle) /velocityZBasicDecimal!!.getScaledFactorValue())

velocityXBasicDecimal!!.set(xVector)
velocityYBasicDecimal!!.set(yVector)
velocityZBasicDecimal!!.set(zVector)
}

override fun addVelocity(magnitude: Long, angle: Int, otherAngle: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var magnitude = magnitude
    //var angle = angle
    //var otherAngle = otherAngle

    var xVector: Long = (axisMathVectorUtil!!.calculateX(magnitude, angle) /velocityXBasicDecimal!!.getScaledFactorValue())


    var yVector: Long = (axisMathVectorUtil!!.calculateY(magnitude, angle) /velocityYBasicDecimal!!.getScaledFactorValue())


    var zVector: Long = (axisMathVectorUtil!!.calculateZ(magnitude, otherAngle) /velocityZBasicDecimal!!.getScaledFactorValue())

velocityXBasicDecimal!!.add(xVector)
velocityYBasicDecimal!!.add(yVector)
velocityZBasicDecimal!!.add(zVector)
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var commonSeps: CommonSeps = CommonSeps.getInstance()!!


    var positionStrings: PositionStrings = PositionStrings.getInstance()!!


    var stringBuffer: StringMaker = StringMaker()


    var stringUtil: StringUtil = StringUtil.getInstance()!!

stringBuffer!!.append("Velocity ")
stringBuffer!!.append(positionStrings!!.X_LABEL)
stringBuffer!!.append(stringUtil!!.toString(this.velocityXBasicDecimal))
stringBuffer!!.append(commonSeps!!.SPACE)
stringBuffer!!.append(positionStrings!!.Y_LABEL)
stringBuffer!!.append(stringUtil!!.toString(this.velocityYBasicDecimal))
stringBuffer!!.append(commonSeps!!.SPACE)
stringBuffer!!.append(positionStrings!!.Z_LABEL)
stringBuffer!!.append(stringUtil!!.toString(this.velocityZBasicDecimal))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

