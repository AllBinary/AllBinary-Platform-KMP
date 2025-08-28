
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
        package org.allbinary.business.user.commerce.money.payment.gateway




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.data.tables.TableMappingInterface

open public class PaymentGatewayEncryptedMapping
            : Object
        
                , TableMappingInterface {
        

    private var paymentGatewayInterface: PaymentGatewayInterface
public constructor        (paymentGatewayInterface: PaymentGatewayInterface)
            : super()
        

        Updates for KMP build        
        {
var paymentGatewayInterface = paymentGatewayInterface
this.paymentGatewayInterface= paymentGatewayInterface
}


                @Throws(Exception::class)
            
open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.paymentGatewayInterface!!.toHashMap(true)
}


open fun toVector()
        //nullable = true from not(false or (false and true)) = true
: Vector

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.paymentGatewayInterface!!.toVector(true)
}


                @Throws(Exception::class)
            
open fun getKey()
        //nullable = true from not(false or (false and true)) = true
: Any

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.paymentGatewayInterface!!.getKey() as Object
}


}
                
            

