
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
        package org.allbinary.logic.control.validate




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.util.BasicArrayList
interface ValidatorBaseInterface {
        

open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean

open fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String

open fun toHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>

open fun toList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList

}
                
            

