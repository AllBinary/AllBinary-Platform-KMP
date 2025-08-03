
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.user.commerce.inventory.order.OrderInterface
import org.allbinary.business.user.commerce.money.Money

open public class FedExShippingModule
            : Object
        
                , ShippingInterface {
        

    private val name: String = "FedEx"

    private val description: String = "Fast Mail"
public constructor        ()
            : super()
        {}


open fun getCost(order: OrderInterface)
        //nullable = true from not(false or (false and false)) = true
: Money{

                    var order = order



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Money()
}


open fun getDescription()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.description
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.name
}


}
                
            

