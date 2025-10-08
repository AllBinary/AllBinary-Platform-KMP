
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
import org.allbinary.logic.math.BasicDecimal
import org.allbinary.time.GameTickTimeDelayHelperFactory
import org.allbinary.time.TimeDelayHelper

open public class DelayedConstantVelocityMovement : BasicConstantVelocityMovement {
        

    private val timeDelayHelper: TimeDelayHelper = TimeDelayHelper(60)
public constructor (basicDecimal: BasicDecimal, velocityProperties: BasicVelocityProperties)                        

                            : super(basicDecimal, velocityProperties){
var basicDecimal = basicDecimal
var velocityProperties = velocityProperties


                            //For kotlin this is before the body of the constructor.
                    
}


    override fun init(speedBasicDecimal: BasicDecimal, angle: Int, otherAngle: Int)
        //nullable = true from not(false or (false and false)) = true
{
var speedBasicDecimal = speedBasicDecimal
var angle = angle
var otherAngle = otherAngle
}


                @Throws(Exception::class)
            
    override fun process(layer: AllBinaryGameLayer)
        //nullable = true from not(false or (false and false)) = true
{
var layer = layer

    
                        if(timeDelayHelper!!.isTime(GameTickTimeDelayHelperFactory.getInstance()!!.startTime))
                        
                                    {
                                    super.process(layer)

                                    }
                                
}


}
                
            

