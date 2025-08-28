
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.user.commerce.inventory.basket.BasketInterface
interface OrderInterface {
        

open fun setShippingMethod(shippingType: String)
        //nullable = true from not(false or (false and false)) = true


open fun setPaymentMethod(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setSpecial(special: String)
        //nullable = true from not(false or (false and false)) = true


open fun setStoreName(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setUserComments(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setUserCancelComments(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setStoreComments(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setStoreCancelComments(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun getBasket()
        //nullable = true from not(false or (false and true)) = true
: BasketInterface

open fun getShippingMethod()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getPaymentMethod()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getSpecial()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getId()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getStoreName()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getUserComments()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getUserCancelComments()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getStoreComments()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getStoreCancelComments()
        //nullable = true from not(false or (false and true)) = true
: String

}
                
            

