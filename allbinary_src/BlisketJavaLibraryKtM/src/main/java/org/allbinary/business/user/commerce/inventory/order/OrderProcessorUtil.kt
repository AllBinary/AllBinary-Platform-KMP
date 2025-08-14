
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
        
import org.allbinary.data.generator.OrderIdGenerator
import org.allbinary.data.tables.user.commerce.inventory.order.OrderHistoryEntity
import org.allbinary.data.tables.user.commerce.inventory.order.OrderItemsEntity

open public class OrderProcessorUtil
            : Object
         {
        

        companion object {
            
    private val instance: OrderProcessorUtil = OrderProcessorUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: OrderProcessorUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val ORDER_PROCESSED: String = "Order Processed"

                @Throws(Exception::class)
            
open fun process(userName: String, order: Order)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var userName = userName


                    var order = order

    var orderItems: OrderItemsEntity = OrderItemsEntity()


    var orderHistory: OrderHistoryEntity = OrderHistoryEntity()

order.setId(OrderIdGenerator().
                            getNext())
orderItems!!.insert(userName, order)
orderHistory!!.insert(userName, order)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ORDER_PROCESSED
}


}
                
            

