
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
        

open public class NoCacheableFactory
            : Object
        
                , CacheableInterfaceFactoryInterface {
        
public constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun getInstance(key: Any)
        //nullable =  from not(true or (false and false)) = 
: CacheableInterface{

                    var key = key



                            throw Exception(
                            "This Factory Does Not")
}


}
                
            

