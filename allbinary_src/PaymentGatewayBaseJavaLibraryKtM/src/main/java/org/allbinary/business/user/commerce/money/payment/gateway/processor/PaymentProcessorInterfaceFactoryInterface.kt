
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
        package org.allbinary.business.user.commerce.money.payment.gateway.processor




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.user.commerce.money.payment.gateway.transaction.PaymentTransactionInterface
import org.allbinary.logic.visual.transform.info.TransformInfoInterface

interface PaymentProcessorInterfaceFactoryInterface {
        

                @Throws(Exception::class)
            
    open fun getInstance(transformInfoInterface: TransformInfoInterface, paymentTransactionInterface: PaymentTransactionInterface)
        //nullable =  from not(true or (false and false)) = 
: PaymentProcessorInterface

}
                
            

