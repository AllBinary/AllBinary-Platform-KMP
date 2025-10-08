
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
        package org.allbinary.data.tables.user.commerce.inventory.order




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.business.user.commerce.inventory.basket.BasketReview
import org.allbinary.business.user.commerce.inventory.order.OrderInterface
import org.allbinary.data.tables.BasicDataTableInterface

interface OrderItemsEntityInterface : BasicDataTableInterface {
        

    open fun setStatus(orderId: String, groupId: String, status: String)
        //nullable = true from not(false or (false and false)) = true


    open fun isEverythingShipped(orderId: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean

    open fun getBasketReview(orderId: String)
        //nullable = true from not(false or (false and false)) = true
: BasketReview

    open fun insert(userName: String, order: OrderInterface)
        //nullable = true from not(false or (false and false)) = true


    open fun insert(values: Vector)
        //nullable = true from not(false or (false and false)) = true


}
                
            

