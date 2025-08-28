
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
        package org.allbinary.business.user.commerce.inventory.item




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.user.address.StreetAddress
interface OrderItemInterface : ItemInterface {
        

open fun setGroup(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setTax(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setShippingType(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setShippingCost(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setShippingAddress(value: StreetAddress)
        //nullable = true from not(false or (false and false)) = true


open fun setSpecial(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun getGroup()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getTax()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getShippingType()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getShippingCost()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getShippingAddress()
        //nullable = true from not(false or (false and true)) = true
: StreetAddress

open fun getSpecial()
        //nullable = true from not(false or (false and true)) = true
: String

}
                
            

