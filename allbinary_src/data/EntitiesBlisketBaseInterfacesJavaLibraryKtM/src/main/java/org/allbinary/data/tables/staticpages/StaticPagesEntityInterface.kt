
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
        package org.allbinary.data.tables.staticpages




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.data.tables.BasicDataTableInterface
interface StaticPagesEntityInterface : BasicDataTableInterface {
        

open fun getFile(store: String, keywords: String)
        //nullable = true from not(false or (false and false)) = true
: String

open fun delete(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun insert(values: Vector)
        //nullable = true from not(false or (false and false)) = true


open fun update(updatedValues: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true


}
                
            

