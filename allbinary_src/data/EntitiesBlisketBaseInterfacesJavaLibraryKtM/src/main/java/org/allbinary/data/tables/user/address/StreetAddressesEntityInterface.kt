
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
        package org.allbinary.data.tables.user.address




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.user.address.StreetAddress
import org.allbinary.data.tables.BasicDataTableInterface
interface StreetAddressesEntityInterface : BasicDataTableInterface {
        

open fun remove(index: Integer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun add(address: StreetAddress)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun update(address: StreetAddress)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun getLastId()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getDefault()
        //nullable = true from not(false or (false and true)) = true
: StreetAddress

        Updates for KMP build        
        

open fun setDefault(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

}
                
            

