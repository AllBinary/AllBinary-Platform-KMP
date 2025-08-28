
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
        package org.allbinary.business.user.commerce.shipping.modules




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.user.commerce.inventory.order.OrderInterface
import org.allbinary.business.user.commerce.money.Money
import org.allbinary.string.CommonStrings

open public class PickUpShippingModule
            : Object
        
                , ShippingInterface {
        

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val name: String = "No Shipping (For Pickup Orders Only)"

    private val description: String = "This shipping method is for pickup orders only."
public constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


open fun getCost(order: OrderInterface)
        //nullable = true from not(false or (false and false)) = true
: Money

        Updates for KMP build        
        {
var order = order



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Money()
}


open fun getDescription()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.description
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.name
}


}
                
            

