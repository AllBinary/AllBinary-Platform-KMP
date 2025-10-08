
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
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.user.commerce.inventory.order.Order
import org.allbinary.business.user.commerce.inventory.order.OrderHistory
import org.allbinary.data.tables.BasicDataTableInterface

interface OrderHistoryEntityInterface : BasicDataTableInterface {
        

    open fun insert(userName: String, order: Order)
        //nullable = true from not(false or (false and false)) = true


    open fun setStatus(orderId: String, status: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setPaymentMethod(orderId: String, status: String)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
    open fun getStoreOrders(storeFrontInterface: StoreFrontInterface)
        //nullable = true from not(false or (false and false)) = true
: Vector

                @Throws(Exception::class)
            
    open fun getOrders(userName: String)
        //nullable = true from not(false or (false and false)) = true
: Vector

                @Throws(Exception::class)
            
    open fun getOrders(status: String, fromDate: String, toDate: String)
        //nullable = true from not(false or (false and false)) = true
: Vector

                @Throws(Exception::class)
            
    open fun getOrder(id: String)
        //nullable = true from not(false or (false and false)) = true
: OrderHistory

                @Throws(Exception::class)
            
    open fun update(whereHashMap: HashMap<Any, Any>, orderHashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true


}
                
            

