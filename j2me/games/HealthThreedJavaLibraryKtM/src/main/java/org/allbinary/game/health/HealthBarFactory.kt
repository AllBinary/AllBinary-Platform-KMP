
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
        
import org.allbinary.graphics.opengles.OpenGLFeatureUtil
import org.allbinary.animation.FeaturedAnimationInterfaceFactoryInterfaceFactory
import org.allbinary.layer.AllBinaryLayer

open public class HealthBarFactory
            : Object
         {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            
open fun getInstance(layerInterface: AllBinaryLayer, healthInterface: Health, location: Int, direction: Int)
        //nullable =  from not(true or (false and false)) = 
: HealthBar{
var layerInterface = layerInterface
var healthInterface = healthInterface
var location = location
var direction = direction

    
                        if(OpenGLFeatureUtil.getInstance()!!.isAnyThreed())
                        
                                    {
                                    
    var featuredAnimationInterfaceFactoryInterfaceFactory: FeaturedAnimationInterfaceFactoryInterfaceFactory = FeaturedAnimationInterfaceFactoryInterfaceFactory.getInstance()!!


    var healthBarAnimationInterfaceFactory: HealthBarAnimationInterfaceFactory = featuredAnimationInterfaceFactoryInterfaceFactory!!.get(Health.NAME) as HealthBarAnimationInterfaceFactory




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return HealthBar(layerInterface, healthInterface, healthBarAnimationInterfaceFactory!!.getInstance(layerInterface, location), direction)

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return HealthBar(layerInterface, healthInterface, HealthBarTwodAnimation(layerInterface, location), direction)

                        }
                            
}


}
                
            

