
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
        

open public class CacheInterfaceFactory
            : Object
         {
        

        companion object {
            
                @Throws(Exception::class)
            
open fun getInstance(cacheType: CacheType, cachePolicy: CachePolicy)
        //nullable =  from not(true or (false and false)) = 
: CacheInterface{
var cacheType = cacheType
var cachePolicy = cachePolicy



                            throw Exception("No such " +cacheType!!.toString())
}


        }
            private constructor        ()
            : super()
        {
}


}
                
            

