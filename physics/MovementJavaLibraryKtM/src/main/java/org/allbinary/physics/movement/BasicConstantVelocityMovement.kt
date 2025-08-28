
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
        package org.allbinary.physics.movement




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.AllBinaryGameLayer
import org.allbinary.game.physics.velocity.BasicVelocityProperties
import org.allbinary.game.physics.velocity.VelocityInterfaceCompositeInterface
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.logic.math.BasicDecimal
import org.allbinary.logic.math.vector.AxisMathVectorUtil
import org.allbinary.math.AngleFactory

open public class BasicConstantVelocityMovement : Movement
                , VelocityInterfaceCompositeInterface {
        

    private var velocityProperties: BasicVelocityProperties

    private var speedBasicDecimal: BasicDecimal = BasicDecimal.ZERO_BIGDECIMAL

    private val axisMathVectorUtil: AxisMathVectorUtil = AxisMathVectorUtil.getInstance()!!
public constructor        (basicDecimal: BasicDecimal, velocityProperties: BasicVelocityProperties)

        Updates for KMP build        
        {
var basicDecimal = basicDecimal
var velocityProperties = velocityProperties
this.setSpeedBasicDecimal(basicDecimal)
this.velocityProperties= velocityProperties
}

public constructor        ()

        Updates for KMP build        
        {
this.setSpeedBasicDecimal(BasicDecimal.ZERO_BIGDECIMAL)
this.velocityProperties= BasicVelocityProperties()
}

override fun init(speedBasicDecimal: BasicDecimal, angle: Int, otherAngle: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var speedBasicDecimal = speedBasicDecimal
var angle = angle
var otherAngle = otherAngle
this.speedBasicDecimal= speedBasicDecimal

    var angleFactory: AngleFactory = AngleFactory.getInstance()!!

this.velocityProperties!!.setVelocity(speedBasicDecimal, angleFactory!!.getInstance(angle), angleFactory!!.getInstance(otherAngle))
}


open fun moveOutsideRadius(layer: AllBinaryLayer, radius: Long, angle: Int, otherAngle: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var layer = layer
var radius = radius
var angle = angle
var otherAngle = otherAngle

    var scaleFactorValue: Int = this.speedBasicDecimal!!.getScaledFactorValue()!!


    var xVector: Int = (axisMathVectorUtil!!.calculateX(radius, angle) /scaleFactorValue).toInt()


    var yVector: Int = (axisMathVectorUtil!!.calculateY(radius, angle) /scaleFactorValue).toInt()


    var zVector: Int = (axisMathVectorUtil!!.calculateZ(radius, otherAngle) /scaleFactorValue).toInt()

layer.move(xVector, yVector, zVector)
}


                @Throws(Exception::class)
            override fun process(layer: AllBinaryGameLayer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var layer = layer
layer.move(this.velocityProperties!!.getVelocityXBasicDecimalP()!!.getScaled(), this.velocityProperties!!.getVelocityYBasicDecimalP()!!.getScaled(), this.velocityProperties!!.getVelocityZBasicDecimalP()!!.getScaled())
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.velocityProperties!!.toString()
}

override fun stop()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.velocityProperties!!.zero()
}

override fun getVelocityProperties()
        //nullable = true from not(false or (false and true)) = true
: BasicVelocityProperties

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return velocityProperties
}


open fun setVelocityProperties(velocityProperties: BasicVelocityProperties)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var velocityProperties = velocityProperties
this.velocityProperties= velocityProperties
}


open fun setSpeedBasicDecimal(speedBasicDecimal: BasicDecimal)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var speedBasicDecimal = speedBasicDecimal
this.speedBasicDecimal= speedBasicDecimal
}


open fun getSpeedBasicDecimal()
        //nullable = true from not(false or (false and true)) = true
: BasicDecimal

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return speedBasicDecimal
}


}
                
            

