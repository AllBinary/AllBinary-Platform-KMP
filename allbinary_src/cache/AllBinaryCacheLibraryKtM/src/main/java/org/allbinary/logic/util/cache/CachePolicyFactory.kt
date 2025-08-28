
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
        

open public class CachePolicyFactory
            : Object
         {
        

        companion object {
            
    private val instance: CachePolicyFactory = CachePolicyFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CachePolicyFactory

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val NAME: String = "lru"

    var MAX_TIME_THOUSAND_MAX: CachePolicy = CachePolicy(NAME, Long.MAX_VALUE, 1000)

    var THIRTY_MINUTES_TEN_THOUSAND_MAX: CachePolicy = CachePolicy(NAME, 1000 *60 *30, 10000)

    var THIRTY_MINUTES_FIFTY_THOUSAND_MAX: CachePolicy = CachePolicy(NAME, 1000 *60 *30, 100000)

    var ONE_MINUTE_FIVE_MAX: CachePolicy = CachePolicy(NAME, 1000 *60 *1, 5)

    var ONE_MINUTE_TEN_MAX: CachePolicy = CachePolicy(NAME, 1000 *60 *1, 10)

    var ONE_MINUTE_ONE_HUNDRED_MAX: CachePolicy = CachePolicy(NAME, 1000 *60 *1, 100)

}
                
            

