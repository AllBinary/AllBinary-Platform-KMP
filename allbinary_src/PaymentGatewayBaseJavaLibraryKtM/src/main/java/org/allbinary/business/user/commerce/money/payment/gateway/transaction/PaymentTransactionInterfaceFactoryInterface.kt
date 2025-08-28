
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
        package org.allbinary.business.user.commerce.money.payment.gateway.transaction




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.user.commerce.inventory.order.OrderHistory
import org.allbinary.business.user.commerce.money.payment.types.TenderType
interface PaymentTransactionInterfaceFactoryInterface {
        

                @Throws(Exception::class)
            
open fun getInstance(orderHistory: OrderHistory)
        //nullable =  from not(true or (false and false)) = 
: PaymentTransactionInterface

        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun getSaleTransaction(tenderType: TenderType)
        //nullable = true from not(false or (false and false)) = true
: PaymentTransactionInterface

        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun getCreditTransaction(tenderType: TenderType)
        //nullable = true from not(false or (false and false)) = true
: PaymentTransactionInterface

        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun getAuthorizationTransaction(tenderType: TenderType)
        //nullable = true from not(false or (false and false)) = true
: PaymentTransactionInterface

        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun getCaptureDelayedTransaction(tenderType: TenderType)
        //nullable = true from not(false or (false and false)) = true
: PaymentTransactionInterface

        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun getVoidTransaction(tenderType: TenderType)
        //nullable = true from not(false or (false and false)) = true
: PaymentTransactionInterface

        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun getInquiryTransaction(tenderType: TenderType)
        //nullable = true from not(false or (false and false)) = true
: PaymentTransactionInterface

        Updates for KMP build        
        

}
                
            

