
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
        
import org.allbinary.logic.math.PrimitiveIntUtil
import org.allbinary.string.CommonStrings

open public class IndexedAnimation : Animation
                , IndexedAnimationInterface {
        

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    val animationBehaviorP: AnimationBehavior
private constructor        ()

        Updates for KMP build        
        {
this.animationBehaviorP= AnimationBehavior.getInstance()
}

protected constructor        (animationBehavior: AnimationBehavior)

        Updates for KMP build        
        {
    //var animationBehavior = animationBehavior
this.animationBehaviorP= animationBehavior
}


open fun getAnimationBehavior()
        //nullable = true from not(false or (false and true)) = true
: AnimationBehavior

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return animationBehaviorP
}

override fun reset()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.animationBehaviorP!!.reset()
this.setFrame(0)
}

override fun setFrame(index: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var index = index
}

override fun getFrame()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


                @Throws(Exception::class)
            
open fun getAnimationSize()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}

override fun getSize()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}

override fun previousFrame()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


open fun isLastFrame()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {

    
                        if(this.getFrame() == this.getSize() -1)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}

override fun setSequence(sequence: IntArray)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var sequence = sequence
}

override fun getSequence()
        //nullable = true from not(false or (false and true)) = true
: IntArray

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PrimitiveIntUtil.getArrayInstance()
}


open fun setState(indexedAnimation: IndexedAnimation)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var indexedAnimation = indexedAnimation
this.setFrame(indexedAnimation!!.getFrame())
this.setDx(indexedAnimation!!.getDx())
this.setDy(indexedAnimation!!.getDy())
}


open fun getWidth()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


}
                
            

