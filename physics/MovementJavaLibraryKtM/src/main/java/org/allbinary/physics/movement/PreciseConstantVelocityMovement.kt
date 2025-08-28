
        /* Generated Code Do Not Modify */
        package org.allbinary.physics.movement




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.AllBinaryGameLayer
import org.allbinary.game.physics.velocity.BasicVelocityProperties
import org.allbinary.logic.math.BasicDecimal
import org.allbinary.logic.math.MathUtil
import org.allbinary.logic.math.ScaleFactorFactory

open public class PreciseConstantVelocityMovement : BasicConstantVelocityMovement {
        

    private var accumulatedX: Int= 0

    private var accumulatedY: Int= 0

    private var accumulatedZ: Int= 0
public constructor        (basicDecimal: BasicDecimal, velocityProperties: BasicVelocityProperties)                        

                            : super(basicDecimal, velocityProperties){
    //var basicDecimal = basicDecimal
    //var velocityProperties = velocityProperties


                            //For kotlin this is before the body of the constructor.
                    
}

override fun init(speedBasicDecimal: BasicDecimal, angle: Int, otherAngle: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var speedBasicDecimal = speedBasicDecimal
    //var angle = angle
    //var otherAngle = otherAngle
}


    private val factorValue: Int = ScaleFactorFactory.getInstance()!!.DEFAULT_SCALE_VALUE

                @Throws(Exception::class)
            override fun process(layer: AllBinaryGameLayer)
        //nullable = true from not(false or (false and false)) = true
{
    //var layer = layer

    var mathUtil: MathUtil = MathUtil.getInstance()!!


    var velocityProperties: BasicVelocityProperties = this.getVelocityProperties()!!

accumulatedX= (accumulatedX +velocityProperties!!.getVelocityXBasicDecimalP()!!.getUnscaled()).toInt()
accumulatedY= (accumulatedY +velocityProperties!!.getVelocityYBasicDecimalP()!!.getUnscaled()).toInt()
accumulatedZ= (accumulatedZ +velocityProperties!!.getVelocityZBasicDecimalP()!!.getUnscaled()).toInt()
layer.move(accumulatedX /factorValue, accumulatedY /factorValue, accumulatedZ /factorValue)

    
                        if(mathUtil!!.abs(accumulatedX) > factorValue)
                        
                                    {
                                    accumulatedX= 0

                                    }
                                

    
                        if(mathUtil!!.abs(accumulatedY) > factorValue)
                        
                                    {
                                    accumulatedY= 0

                                    }
                                

    
                        if(mathUtil!!.abs(accumulatedZ) > factorValue)
                        
                                    {
                                    accumulatedZ= 0

                                    }
                                
}


}
                
            

