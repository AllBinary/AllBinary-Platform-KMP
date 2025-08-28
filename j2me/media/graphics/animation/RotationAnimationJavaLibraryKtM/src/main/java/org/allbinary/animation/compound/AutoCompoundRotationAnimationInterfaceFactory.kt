
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
        package org.allbinary.animation.compound




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.animation.Animation
import org.allbinary.animation.AnimationBehaviorFactory
import org.allbinary.animation.AnimationInterfaceFactoryInterface
import org.allbinary.animation.RotationAnimation

open public class AutoCompoundRotationAnimationInterfaceFactory : CompoundAnimationInterfaceFactory {
        
public constructor        (basicAnimationInterfaceFactoryInterfaceArray: Array<AnimationInterfaceFactoryInterface?>, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : super(basicAnimationInterfaceFactoryInterfaceArray, animationBehaviorFactory)

        Updates for KMP build        
        {
    //var basicAnimationInterfaceFactoryInterfaceArray = basicAnimationInterfaceFactoryInterfaceArray
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
}

override fun createArray(size: Int)
        //nullable = true from not(false or (false and false)) = true
: Array<Animation?>

        Updates for KMP build        
        {
    //var size = size



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return arrayOfNulls(size)
}

override fun getInstance(animationInterfaceArray: Array<Animation?>)
        //nullable =  from not(true or (false and false)) = 
: Animation

        Updates for KMP build        
        {
    //var animationInterfaceArray = animationInterfaceArray



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AutoCompoundRotationAnimation(animationInterfaceArray as Array<RotationAnimation?>, this.animationBehaviorFactory!!.getOrCreateInstance())
}


}
                
            

