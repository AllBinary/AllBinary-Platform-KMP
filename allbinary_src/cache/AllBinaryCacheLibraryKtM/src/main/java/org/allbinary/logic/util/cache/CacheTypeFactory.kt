
        /* Generated Code Do Not Modify */
        package org.allbinary.logic.util.cache




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringUtil

open public class CacheTypeFactory
            : Object
         {
        
companion object {
            
    private val instance: CacheTypeFactory = CacheTypeFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CacheTypeFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    var NO_CACHE: CacheType = CacheType(StringUtil.getInstance()!!.EMPTY_STRING, StringUtil.getInstance()!!.EMPTY_STRING)

    var CACHE: CacheType = CacheType(StringUtil.getInstance()!!.EMPTY_STRING, StringUtil.getInstance()!!.EMPTY_STRING)

    var SET: CacheType = CacheType(StringUtil.getInstance()!!.EMPTY_STRING, "Set")

    var CACHE_VECTOR: CacheType = CacheType(StringUtil.getInstance()!!.EMPTY_STRING, StringUtil.getInstance()!!.EMPTY_STRING)

}
                
            

