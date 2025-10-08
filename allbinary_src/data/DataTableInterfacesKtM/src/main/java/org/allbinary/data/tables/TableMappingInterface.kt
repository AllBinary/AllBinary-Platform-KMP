
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
        package org.allbinary.data.tables




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector

interface TableMappingInterface {
        

                @Throws(Exception::class)
            
    open fun getKey()
        //nullable = true from not(false or (false and true)) = true
: Any

                @Throws(Exception::class)
            
    open fun toVector()
        //nullable = true from not(false or (false and true)) = true
: Vector

                @Throws(Exception::class)
            
    open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>

}
                
            

