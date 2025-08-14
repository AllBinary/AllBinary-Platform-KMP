
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
        package org.allbinary.game.health




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.animation.Animation
import org.allbinary.animation.AnimationInterfaceFactoryInterface
import org.allbinary.animation.ProceduralAnimationInterfaceFactoryInterface
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.media.ScaleProperties

open public class HealthBarAnimationInterfaceFactory
            : Object
        
                , AnimationInterfaceFactoryInterface
                , ProceduralAnimationInterfaceFactoryInterface {
        
public constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun getInstance(layerInterface: AllBinaryLayer, location: Int)
        //nullable =  from not(true or (false and false)) = 
: HealthBarAnimation{

                    var layerInterface = layerInterface


                    var location = location



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return HealthBarThreedAnimation(layerInterface, location)
}


                @Throws(Exception::class)
            
open fun getInstance(instanceId: Int)
        //nullable =  from not(true or (false and false)) = 
: Animation{

                    var instanceId = instanceId



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


                @Throws(Exception::class)
            
open fun getInstance(animationInterface: Animation)
        //nullable =  from not(true or (false and false)) = 
: Animation{

                    var animationInterface = animationInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun setInitialScale(scaleProperties: ScaleProperties)
        //nullable = true from not(false or (false and false)) = true
{

                    var scaleProperties = scaleProperties
}


}
                
            

