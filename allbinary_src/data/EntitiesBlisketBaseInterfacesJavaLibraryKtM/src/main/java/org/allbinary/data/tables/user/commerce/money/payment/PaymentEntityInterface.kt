
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
        package org.allbinary.data.tables.user.commerce.money.payment




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.business.user.commerce.money.payment.PaymentInterface
import org.allbinary.data.tables.BasicDataTableInterface
interface PaymentEntityInterface : BasicDataTableInterface {
        

open fun getLastId(userName: String)
        //nullable = true from not(false or (false and false)) = true
: String

        Updates for KMP build        
        

open fun setDefault(userName: String, index: Integer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun getDefault(userName: String)
        //nullable = true from not(false or (false and false)) = true
: PaymentInterface

        Updates for KMP build        
        

open fun get(userName: String)
        //nullable = true from not(false or (false and false)) = true
: Vector

        Updates for KMP build        
        

open fun add(userName: String, paymentInterface: PaymentInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun remove(userName: String, index: Integer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun insert(values: Vector)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

}
                
            

