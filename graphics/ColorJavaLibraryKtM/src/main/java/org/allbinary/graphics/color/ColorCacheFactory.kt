
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
        package org.allbinary.graphics.color




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.util.cache.AutomaticCacheInterface
import org.allbinary.logic.util.cache.AutomaticCacheInterfaceFactory
import org.allbinary.logic.util.cache.CachePolicyFactory
import org.allbinary.logic.util.cache.CacheTypeFactory
import org.allbinary.string.CommonStrings

open public class ColorCacheFactory
            : Object
         {
        
companion object {
            
    private var cacheInterface: AutomaticCacheInterface = 
                null
            

                init{

    var logUtil: LogUtil = LogUtil.getInstance()!!


    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


    var STATIC_BLOCK: String = "Static Block"


        try {
            logUtil!!.put(commonStrings!!.START, ColorCacheFactory::class, STATIC_BLOCK)
cacheInterface= AutomaticCacheInterfaceFactory.getInstance(ColorCacheableFactory(), CacheTypeFactory.getInstance()!!.CACHE, CachePolicyFactory.getInstance()!!.THIRTY_MINUTES_TEN_THOUSAND_MAX)
logUtil!!.put(commonStrings!!.END, ColorCacheFactory::class, STATIC_BLOCK)
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, ColorCacheFactory::class, STATIC_BLOCK, e)
}

}

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AutomaticCacheInterface{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cacheInterface
}


        }
            private constructor ()
            : super()
        {
}


}
                
            

