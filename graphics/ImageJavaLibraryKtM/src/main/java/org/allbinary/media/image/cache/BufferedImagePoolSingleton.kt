
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
        package org.allbinary.media.image.cache



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.util.cache.CachePolicyFactory
import org.allbinary.logic.util.cache.PoolInterface
import org.allbinary.logic.util.cache.PoolInterfaceFactory
import org.allbinary.logic.util.cache.PoolTypeFactory
import org.allbinary.string.CommonStrings

open public class BufferedImagePoolSingleton
            : Object
         {
        

        companion object {


    private var poolInterface: PoolInterface = 
                null
            

                init{
    var logUtil: LogUtil = LogUtil.getInstance()!!
            


    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            


    var STATIC_BLOCK: String = "Static Block"


    var instance: String = "BufferedImagePoolSingleton"


        try {
            logUtil!!.put(commonStrings!!.START, instance, STATIC_BLOCK)
poolInterface= PoolInterfaceFactory.getInstance(BufferedImageCacheableFactory(), PoolTypeFactory.getInstance()!!.VECTOR_POOL, CachePolicyFactory.getInstance()!!.MAX_TIME_THOUSAND_MAX)
logUtil!!.put(commonStrings!!.END, instance, STATIC_BLOCK)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, instance, STATIC_BLOCK, e)
}

}

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PoolInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return poolInterface
}



        }
            private constructor        ()
            : super()
        {}


}
                
            

