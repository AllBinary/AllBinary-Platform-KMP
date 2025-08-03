
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
import org.allbinary.game.physics.acceleration.GravityUtil
import org.allbinary.game.physics.velocity.VelocityProperties
import org.allbinary.logic.math.BasicDecimal

open public class BasicGravityConstantVelocityMovement : BasicConstantVelocityMovement {
        
public constructor        (speedBasicDecimal: BasicDecimal)                        

                            : super(speedBasicDecimal, VelocityProperties(speedBasicDecimal!!.getUnscaled().toInt(), speedBasicDecimal!!.getUnscaled().toInt())){

                    var speedBasicDecimal = speedBasicDecimal


                            //For kotlin this is before the body of the constructor.
                    
}


    private val gravityUtil: GravityUtil = GravityUtil.getInstance()!!
            

                @Throws(Exception::class)
            override fun process(layer: AllBinaryGameLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var layer = layer
super.process(layer)
gravityUtil!!.process(this.getVelocityProperties())
}


}
                
            

