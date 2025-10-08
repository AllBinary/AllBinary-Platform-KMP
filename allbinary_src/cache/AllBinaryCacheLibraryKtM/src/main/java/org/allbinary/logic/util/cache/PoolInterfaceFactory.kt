
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
        

open public class PoolInterfaceFactory
            : Object
         {
        
companion object {
            
                @Throws(Exception::class)
            
    open fun getInstance(cacheableInterfaceFactoryInterface: CacheableInterfaceFactoryInterface, poolType: PoolType, cachePolicy: CachePolicy)
        //nullable =  from not(true or (false and false)) = 
: PoolInterface{
var cacheableInterfaceFactoryInterface = cacheableInterfaceFactoryInterface
var poolType = poolType
var cachePolicy = cachePolicy



                            throw Exception("No Such PoolType: " +poolType!!.toString())
}


        }
            private constructor ()
            : super()
        {
}


}
                
            

