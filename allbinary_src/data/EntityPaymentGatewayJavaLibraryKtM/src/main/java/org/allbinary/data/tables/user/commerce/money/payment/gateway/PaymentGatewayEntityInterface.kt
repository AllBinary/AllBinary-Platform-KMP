
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
        package org.allbinary.data.tables.user.commerce.money.payment.gateway



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.business.user.commerce.money.payment.gateway.PaymentGatewayInterface
import org.allbinary.business.user.commerce.money.payment.types.BasicPaymentType
import org.allbinary.data.tables.BasicDataTableInterface
interface PaymentGatewayEntityInterface : BasicDataTableInterface {
        

open fun getPaymentGatewayInterface(storeName: String, paymentType: BasicPaymentType)
        //nullable = true from not(false or (false and false)) = true
: PaymentGatewayInterface

open fun findPaymentTypeVectorByStore(storeName: String)
        //nullable = true from not(false or (false and false)) = true
: Vector

open fun remove(storeName: String, paymentType: BasicPaymentType)
        //nullable = true from not(false or (false and false)) = true


open fun add(paymentGatewayInterface: PaymentGatewayInterface)
        //nullable = true from not(false or (false and false)) = true


open fun update(paymentGatewayInterface: PaymentGatewayInterface)
        //nullable = true from not(false or (false and false)) = true


}
                
            

