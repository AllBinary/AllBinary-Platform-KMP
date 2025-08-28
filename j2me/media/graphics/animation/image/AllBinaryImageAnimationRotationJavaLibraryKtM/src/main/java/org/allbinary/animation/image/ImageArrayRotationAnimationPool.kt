
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
        
import org.allbinary.logic.util.cache.BasicArrayListResetablePool
import org.allbinary.logic.util.cache.CacheableInterface
import org.allbinary.logic.util.cache.CacheableInterfaceFactoryInterface
import org.allbinary.logic.util.cache.PoolInterface

open public class ImageArrayRotationAnimationPool : BasicArrayListResetablePool {
        

        companion object {
            
    private var IMAGE_ROTATION_ANIMATION_POOL: PoolInterface = ImageArrayRotationAnimationPool(ImageArrayRotationAnimationCacheableInterfaceFactory())

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PoolInterface

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ImageArrayRotationAnimationPool.IMAGE_ROTATION_ANIMATION_POOL
}


        }
            public constructor        (cacheableInterfaceFactoryInterface: CacheableInterfaceFactoryInterface)                        

                            : super(cacheableInterfaceFactoryInterface)

        Updates for KMP build        
        {
var cacheableInterfaceFactoryInterface = cacheableInterfaceFactoryInterface


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
open fun remove(key: Any)
        //nullable = true from not(false or (false and false)) = true
: CacheableInterface

        Updates for KMP build        
        {
var key = key

    var cacheableInterface: CacheableInterface = super.remove(key)!!


    var allBinaryImageRotationAnimationInfo: ImageArrayRotationAnimationInfo = key as ImageArrayRotationAnimationInfo

cacheableInterface = cacheableInterfacecacheableInterface as ImageArrayRotationAnimationCacheable
cacheableInterface.
                    setImageArray(allBinaryImageRotationAnimationInfo!!.getImageArray())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cacheableInterface
}


}
                
            

