
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
        package org.allbinary.business.user.commerce.inventory.order



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.user.address.StreetAddress
import org.allbinary.business.user.commerce.money.Money
import org.allbinary.business.user.commerce.money.payment.Payment
interface OrderHistoryInterface {
        

open fun setUserName(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setDefaultShippingAddress(shippingAddress: StreetAddress)
        //nullable = true from not(false or (false and false)) = true


open fun setBillingAddress(billingAddress: StreetAddress)
        //nullable = true from not(false or (false and false)) = true


open fun setPaymentInfo(payment: Payment)
        //nullable = true from not(false or (false and false)) = true


open fun setShipDate(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setOrderDate(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setTransDate(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setCancelDate(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setStatus(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setSubTotal(value: Money)
        //nullable = true from not(false or (false and false)) = true


open fun setShippingCost(value: Money)
        //nullable = true from not(false or (false and false)) = true


open fun setTaxes(value: Money)
        //nullable = true from not(false or (false and false)) = true


open fun setTotal(value: Money)
        //nullable = true from not(false or (false and false)) = true


open fun getUserName()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getShippingAddress()
        //nullable = true from not(false or (false and true)) = true
: StreetAddress

open fun getBillingAddress()
        //nullable = true from not(false or (false and true)) = true
: StreetAddress

open fun getPaymentInfo()
        //nullable = true from not(false or (false and true)) = true
: Payment

open fun getShipDate()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getOrderDate()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getTransDate()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getCancelDate()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getStatus()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getSubTotal()
        //nullable = true from not(false or (false and true)) = true
: Money

open fun getShippingCost()
        //nullable = true from not(false or (false and true)) = true
: Money

open fun getTaxes()
        //nullable = true from not(false or (false and true)) = true
: Money

open fun getTotal()
        //nullable = true from not(false or (false and true)) = true
: Money

open fun getPaymentMethod()
        //nullable = true from not(false or (false and true)) = true
: String

}
                
            

