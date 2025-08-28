
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
import org.allbinary.animation.IndexedAnimation

open public class CompoundIndexedAnimationInterfaceFactory : CompoundAnimationInterfaceFactory {
        
public constructor        (basicAnimationInterfaceFactoryInterfaceArray: Array<AnimationInterfaceFactoryInterface?>)                        

                            : this(basicAnimationInterfaceFactoryInterfaceArray, AnimationBehaviorFactory.getInstance()){
    //var basicAnimationInterfaceFactoryInterfaceArray = basicAnimationInterfaceFactoryInterfaceArray


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (basicAnimationInterfaceFactoryInterfaceArray: Array<AnimationInterfaceFactoryInterface?>, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : super(basicAnimationInterfaceFactoryInterfaceArray, animationBehaviorFactory){
    //var basicAnimationInterfaceFactoryInterfaceArray = basicAnimationInterfaceFactoryInterfaceArray
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
}

override fun createArray(size: Int)
        //nullable = true from not(false or (false and false)) = true
: Array<Animation?>{
    //var size = size



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return arrayOfNulls(size)
}

override fun getInstance(animationArray: Array<Animation?>)
        //nullable =  from not(true or (false and false)) = 
: Animation{
    //var animationArray = animationArray



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CompoundIndexedAnimation(animationArray, this.animationBehaviorFactory!!.getOrCreateInstance())
}


}
                
            

