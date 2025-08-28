
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
        package org.allbinary.logic.system.security.licensing




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.util.BasicArrayList
interface AbeLicenseInterface {
        

open fun hasKey()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        

open fun getKey(keyName: String)
        //nullable = true from not(false or (false and false)) = true
: String

        Updates for KMP build        
        

open fun getLicenseId()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getServers()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList

        Updates for KMP build        
        

open fun getSpecial()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getLicenseType()
        //nullable = true from not(false or (false and true)) = true
: LicenseType

        Updates for KMP build        
        

open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        
override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        

}
                
            

