
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
        package org.allbinary.business.user.commerce.inventory.basket




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Set
import org.allbinary.business.user.commerce.money.Money
import org.allbinary.business.user.commerce.money.MoneyException
interface BasketInterface {
        

open fun addItem(id: String, num: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun removeItem(id: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun adjustItem(id: String, num: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun getTotalWeight()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getNumberOfItems()
        //nullable = true from not(false or (false and true)) = true
: Integer

        Updates for KMP build        
        

open fun getIds()
        //nullable = true from not(false or (false and true)) = true
: Set

        Updates for KMP build        
        

open fun getItems()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>

        Updates for KMP build        
        

open fun getNumberOf(product: String)
        //nullable = true from not(false or (false and false)) = true
: Integer

        Updates for KMP build        
        

                @Throws(MoneyException::class)
            
open fun getSubTotal()
        //nullable = true from not(false or (false and true)) = true
: Money

        Updates for KMP build        
        

}
                
            

