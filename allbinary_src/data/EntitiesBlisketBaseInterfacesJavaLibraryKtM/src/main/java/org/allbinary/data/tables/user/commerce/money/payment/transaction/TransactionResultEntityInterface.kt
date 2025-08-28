
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
        package org.allbinary.data.tables.user.commerce.money.payment.transaction




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.user.commerce.money.payment.gateway.transaction.TransactionResultInterface
import org.allbinary.data.tables.BasicDataTableInterface
interface TransactionResultEntityInterface : BasicDataTableInterface {
        

open fun getTransactionResultInterface(orderNumber: String)
        //nullable = true from not(false or (false and false)) = true
: TransactionResultInterface

open fun remove(userName: String, orderNumber: String)
        //nullable = true from not(false or (false and false)) = true


open fun add(userName: String, orderNumber: String, resultInterface: TransactionResultInterface)
        //nullable = true from not(false or (false and false)) = true


}
                
            

