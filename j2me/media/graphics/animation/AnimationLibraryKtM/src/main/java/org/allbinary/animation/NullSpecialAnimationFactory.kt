
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.animation.special.SpecialAnimation
import org.allbinary.media.ScaleProperties

open public class NullSpecialAnimationFactory
            : Object
        
                , AnimationInterfaceFactoryInterface
                , ProceduralAnimationInterfaceFactoryInterface {
        
companion object {
            
    private var NULL_SPECIAL_ANIMATION_FACTORY: NullSpecialAnimationFactory = NullSpecialAnimationFactory()

    open fun getFactoryInstance()
        //nullable = true from not(false or (false and true)) = true
: NullSpecialAnimationFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NULL_SPECIAL_ANIMATION_FACTORY
}


        }
            private constructor ()
            : super()
        {
}


                @Throws(Exception::class)
            
    override fun getInstance(instanceId: Int)
        //nullable =  from not(true or (false and false)) = 
: Animation{
    //var instanceId = instanceId



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SpecialAnimation.getInstance()
}


                @Throws(Exception::class)
            
    override fun getInstance(animationInterface: Animation)
        //nullable =  from not(true or (false and false)) = 
: Animation{
    //var animationInterface = animationInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SpecialAnimation.getInstance()
}


    override fun setInitialScale(scaleProperties: ScaleProperties)
        //nullable = true from not(false or (false and false)) = true
{
    //var scaleProperties = scaleProperties
}


}
                
            

