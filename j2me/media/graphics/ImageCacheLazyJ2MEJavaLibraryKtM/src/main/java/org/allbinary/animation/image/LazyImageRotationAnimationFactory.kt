
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        package org.allbinary.animation.image




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.animation.Animation
import org.allbinary.animation.AnimationInterfaceFactoryInterface
import org.allbinary.image.ImageCacheFactory
import org.allbinary.media.ScaleProperties

open public class LazyImageRotationAnimationFactory
            : Object
        
                , AnimationInterfaceFactoryInterface {
        

    private val layoutIndex: Int

    private val animationInterfaceFactoryInterface: BaseImageAnimationFactory

    var scaleProperties: ScaleProperties = ScaleProperties.instance
public constructor        (layoutIndex: Int, associatedLazyAnimationId: Int, animationInterfaceFactoryInterface: BaseImageAnimationFactory)
            : super()
        {

                    var layoutIndex = layoutIndex


                    var associatedLazyAnimationId = associatedLazyAnimationId


                    var animationInterfaceFactoryInterface = animationInterfaceFactoryInterface
this.layoutIndex= layoutIndex
this.animationInterfaceFactoryInterface= animationInterfaceFactoryInterface
ImageCacheFactory.getInstance()!!.hasAnyLazyAnimationFactories= true
}


                @Throws(Exception::class)
            
open fun getInstance(instanceId: Int)
        //nullable =  from not(true or (false and false)) = 
: Animation{

                    var instanceId = instanceId

    
                        if(this.animationInterfaceFactoryInterface!!.getImage()!!.isReady())
                        
                                    {
                                    this.animationInterfaceFactoryInterface!!.setInitialScale(scaleProperties)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.animationInterfaceFactoryInterface!!.getInstance(instanceId)

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return LazyImageRotationAnimation(this.layoutIndex, instanceId, scaleProperties, this.animationInterfaceFactoryInterface, this.animationInterfaceFactoryInterface!!.animationBehaviorFactory!!.getOrCreateInstance())

                        }
                            
}


open fun setInitialScale(scaleProperties: ScaleProperties)
        //nullable = true from not(false or (false and false)) = true
{

                    var scaleProperties = scaleProperties
this.scaleProperties= scaleProperties
}


}
                
            

