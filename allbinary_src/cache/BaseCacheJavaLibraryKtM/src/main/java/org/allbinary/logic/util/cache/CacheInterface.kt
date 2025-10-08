
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
        package org.allbinary.logic.util.cache




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

interface CacheInterface {
        

                @Throws(Exception::class)
            
    open fun add(cacheableInterface: CacheableInterface)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
    open fun add(cacheableInterfaces: Array<CacheableInterface?>)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
    open fun clear()
        //nullable = true from not(false or (false and true)) = true


}
                
            

