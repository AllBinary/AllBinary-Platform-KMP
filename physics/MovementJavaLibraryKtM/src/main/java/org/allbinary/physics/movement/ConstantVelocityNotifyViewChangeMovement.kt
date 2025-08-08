
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.AllBinaryGameLayer
import org.allbinary.game.physics.velocity.BasicVelocityProperties
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.logic.math.BasicDecimal
import org.allbinary.logic.math.vector.AxisMathVectorUtil
import org.allbinary.math.AngleFactory

open public class ConstantVelocityNotifyViewChangeMovement : Movement {
        

    var basicVelocityProperties: BasicVelocityProperties

    private var speedBasicDecimal: BasicDecimal

    private val axisMathVectorUtil: AxisMathVectorUtil = AxisMathVectorUtil.getInstance()!!
            
public constructor        (){this.speedBasicDecimal= BasicDecimal.ZERO_BIGDECIMAL
this.basicVelocityProperties= BasicVelocityProperties()
}

override fun init(speedBasicDecimal: BasicDecimal, angle: Int, otherAngle: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var speedBasicDecimal = speedBasicDecimal


                    var angle = angle


                    var otherAngle = otherAngle
this.speedBasicDecimal= speedBasicDecimal

    var angleFactory: AngleFactory = AngleFactory.getInstance()!!
            

basicVelocityProperties!!.setVelocity(speedBasicDecimal, angleFactory!!.getInstance(angle), angleFactory!!.getInstance(otherAngle))
}


open fun moveOutsideRadius(layer: AllBinaryLayer, radius: Long, angle: Int, otherAngle: Int)
        //nullable = true from not(false or (false and false)) = true
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
{

                    var layer = layer

    var x: Int = this.basicVelocityProperties!!.getVelocityXBasicDecimalP()!!.getScaled()!!
            


    var y: Int = this.basicVelocityProperties!!.getVelocityYBasicDecimalP()!!.getScaled()!!
            


    var z: Int = this.basicVelocityProperties!!.getVelocityZBasicDecimalP()!!.getScaled()!!
            

layer.move(x, y, z)

    
                        if(x != 0 || y != 0 || z != 0)
                        
                                    {
                                    layer.onViewPositionChangeEvent()

                                    }
                                
}

override fun stop()
        //nullable = true from not(false or (false and true)) = true
{this.basicVelocityProperties!!.zero()
}


}
                
            

