
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
        package org.allbinary.input.media.image.capture




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.util.cache.AutomaticCacheInterface
import org.allbinary.logic.util.cache.CacheInterface
import org.allbinary.logic.util.cache.CacheInterfaceFactory
import org.allbinary.logic.util.cache.CachePolicyFactory
import org.allbinary.logic.util.cache.CacheTypeFactory
import org.allbinary.string.CommonStrings

open public class CapturedBufferedImagesCacheSingleton
            : Object
         {
        

        companion object {
            
    private var cacheInterface: AutomaticCacheInterface = 
                null
            

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CacheInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cacheInterface
}


                init{
    var logUtil: LogUtil = LogUtil.getInstance()!!


    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


    var STATIC_BLOCK: String = "Static Block"


    var instance: String = "CapturedBufferedImagesCacheSingleton"


        try {
            logUtil!!.put(commonStrings!!.START, instance, STATIC_BLOCK)
cacheInterface= CacheInterfaceFactory.getInstance((), ()) as AutomaticCacheInterface
logUtil!!.put(commonStrings!!.END, instance, STATIC_BLOCK)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, instance, STATIC_BLOCK, e)
}

}

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
private constructor        ()
            : super()
        {}


}
                
            

