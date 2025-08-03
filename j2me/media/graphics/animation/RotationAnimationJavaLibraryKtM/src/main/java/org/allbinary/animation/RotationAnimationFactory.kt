
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
        
import org.allbinary.game.configuration.GameConfigurationCentral
import org.allbinary.math.AngleFactory
import org.allbinary.math.AngleInfo
import org.allbinary.media.ScaleProperties

open public class RotationAnimationFactory
            : Object
        
                , AnimationInterfaceFactoryInterface
                , ProceduralAnimationInterfaceFactoryInterface {
        

    private var totalAngle: Short

    private var angleIncrement: Short
public constructor        ()
            : super()
        {this.totalAngle= AngleFactory.getInstance()!!.TOTAL_ANGLE
this.angleIncrement= (totalAngle /GameConfigurationCentral.getInstance()!!.getGameControlFidelity()).toShort()
}

public constructor        (totalAngle: Short, angleIncrement: Short)
            : super()
        {

                    var totalAngle = totalAngle


                    var angleIncrement = angleIncrement
this.totalAngle= totalAngle
this.angleIncrement= angleIncrement
}


                @Throws(Exception::class)
            override fun getInstance(instanceId: Int)
        //nullable =  from not(true or (false and false)) = 
: Animation{

                    var instanceId = instanceId



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullRotationAnimation(AngleInfo.getInstance(this.angleIncrement), this.totalAngle, AnimationBehavior.getInstance())
}


                @Throws(Exception::class)
            override fun getInstance(animationInterface: Animation)
        //nullable =  from not(true or (false and false)) = 
: Animation{

                    var animationInterface = animationInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullRotationAnimation(AngleInfo.getInstance(this.angleIncrement), this.totalAngle, AnimationBehavior.getInstance())
}

override fun setInitialScale(scaleProperties: ScaleProperties)
        //nullable = true from not(false or (false and false)) = true
{

                    var scaleProperties = scaleProperties
}


}
                
            

