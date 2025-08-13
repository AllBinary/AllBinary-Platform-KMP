
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
        package org.allbinary.business.user.commerce.money.payment.types



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class TransactionTypeFactory
            : Object
         {
        

        companion object {
            
    private val instance: TransactionTypeFactory = TransactionTypeFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TransactionTypeFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val SALE: TransactionType = TransactionType(
                            "Sale")

    val CREDIT: TransactionType = TransactionType(
                            "Credit")

    val AUTHORIZATION: TransactionType = TransactionType(
                            "Authorization")

    val DELAYEDCAPTURE: TransactionType = TransactionType(
                            "Delayed Capture")

    val VOID: TransactionType = TransactionType(
                            "Void")

    val INQUIRY: TransactionType = TransactionType(
                            "Inquiry")

}
                
            

