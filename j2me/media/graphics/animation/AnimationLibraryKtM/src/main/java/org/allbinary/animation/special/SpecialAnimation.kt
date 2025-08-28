
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
        package org.allbinary.animation.special




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.animation.AnimationBehavior
import org.allbinary.animation.IndexedAnimation
import org.allbinary.animation.IndexedAnimationBehavior

open public class SpecialAnimation : IndexedAnimation
                , SpecialAnimationInterface {
        

        companion object {
            
    private val NULL_SPECIAL_ANIMATION: SpecialAnimation = SpecialAnimation(IndexedAnimationBehavior(1, 250))

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: SpecialAnimation

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NULL_SPECIAL_ANIMATION
}


        }
            public constructor        (animationBehavior: AnimationBehavior)                        

                            : super(animationBehavior)

        Updates for KMP build        
        {
    //var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
}

override fun nextFrame()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    var indexedAnimationBehavior: IndexedAnimationBehavior = (this.animationBehaviorP as IndexedAnimationBehavior)

indexedAnimationBehavior!!.loopIndex++
}

override fun setLastFrame()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}

override fun isComplete()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun open()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


open fun close()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


open fun process()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


}
                
            

