
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
        package org.allbinary.animation.image




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.animation.AnimationBehavior
import org.allbinary.logic.NullUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.util.cache.CacheableInterface

open public class ImageArrayRotationAnimationCacheable : AdjustedImageArrayRotationAnimation
                , CacheableInterface {
        
public constructor (anyType: Any, animationBehavior: AnimationBehavior)                        

                            : super(anyType, animationBehavior){
    //var anyType = anyType
    //var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
}


    override fun getKey()
        //nullable = true from not(false or (false and true)) = true
: Any{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullUtil.getInstance()!!.NULL_OBJECT
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING
}


}
                
            

