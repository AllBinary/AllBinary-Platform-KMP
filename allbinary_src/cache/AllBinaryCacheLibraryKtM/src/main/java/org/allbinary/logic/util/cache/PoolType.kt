
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2007 AllBinary 
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
        

open public class PoolType
            : Object
         {
        

    private var cacheType: CacheType
public constructor        (cacheType: CacheType)
            : super()
        {
var cacheType = cacheType
this.setCacheType(cacheType)
}


open fun getCacheType()
        //nullable = true from not(false or (false and true)) = true
: CacheType{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cacheType
}


open fun setCacheType(cacheType: CacheType)
        //nullable = true from not(false or (false and false)) = true
{
var cacheType = cacheType
this.cacheType= cacheType
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var POOL_TYPE: String = "PoolType: "




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return POOL_TYPE +this.getCacheType()!!.toString()
}


}
                
            

