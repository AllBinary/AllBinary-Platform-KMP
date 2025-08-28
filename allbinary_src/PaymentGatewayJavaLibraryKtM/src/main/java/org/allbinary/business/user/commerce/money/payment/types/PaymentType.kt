
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.user.commerce.money.payment.gateway.PaymentGatewayData
import org.allbinary.business.user.commerce.money.payment.gateway.processor.PaymentProcessorInterfaceFactoryInterface
import org.allbinary.business.user.commerce.money.payment.gateway.transaction.PaymentTransactionInterfaceFactoryInterface

open public class PaymentType
            : Object
         {
        

    private val basicPaymentType: BasicPaymentType

    private val paymentTransactionInterfaceFactoryInterface: PaymentTransactionInterfaceFactoryInterface

    private val paymentProcessorInterfaceFactoryInterface: PaymentProcessorInterfaceFactoryInterface
protected constructor        (basicPaymentType: BasicPaymentType)
            : super()
        

        Updates for KMP build        
        {
var basicPaymentType = basicPaymentType
this.basicPaymentType= basicPaymentType
this.paymentTransactionInterfaceFactoryInterface= 
                                        null
                                    
this.paymentProcessorInterfaceFactoryInterface= 
                                        null
                                    
PaymentTypeUtil.getInstance()!!.add(this)
}

protected constructor        (basicPaymentType: BasicPaymentType, paymentTransactionInterfaceFactoryInterface: PaymentTransactionInterfaceFactoryInterface, paymentProcessorInterfaceFactoryInterface: PaymentProcessorInterfaceFactoryInterface)
            : super()
        

        Updates for KMP build        
        {
var basicPaymentType = basicPaymentType
var paymentTransactionInterfaceFactoryInterface = paymentTransactionInterfaceFactoryInterface
var paymentProcessorInterfaceFactoryInterface = paymentProcessorInterfaceFactoryInterface
this.basicPaymentType= basicPaymentType
this.paymentTransactionInterfaceFactoryInterface= paymentTransactionInterfaceFactoryInterface
this.paymentProcessorInterfaceFactoryInterface= paymentProcessorInterfaceFactoryInterface
PaymentTypeUtil.getInstance()!!.add(this)
}


                @Throws(Exception::class)
            
open fun getPaymentTransactionInterfaceFactoryInterface()
        //nullable = true from not(false or (false and true)) = true
: PaymentTransactionInterfaceFactoryInterface

        Updates for KMP build        
        {

    
                        if(this.paymentTransactionInterfaceFactoryInterface == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception("PaymentTransactionInterfaceFactoryInterface is Null")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.paymentTransactionInterfaceFactoryInterface
}


                @Throws(Exception::class)
            
open fun getPaymentProcessorInterfaceFactoryInterface()
        //nullable = true from not(false or (false and true)) = true
: PaymentProcessorInterfaceFactoryInterface

        Updates for KMP build        
        {

    
                        if(this.paymentProcessorInterfaceFactoryInterface == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception("PaymentProcessorInterfaceFactoryInterface is Null")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.paymentProcessorInterfaceFactoryInterface
}


open fun toVector()
        //nullable = true from not(false or (false and true)) = true
: Vector

        Updates for KMP build        
        {

    var vector: Vector = Vector()

vector.addAll(this.getBasicPaymentType()!!.toVector())

    
                        if(this.paymentTransactionInterfaceFactoryInterface != 
                                    null
                                )
                        
                                    {
                                    vector.add(this.paymentTransactionInterfaceFactoryInterface!!.::class.toString()!!)

                                    }
                                

    
                        if(this.paymentProcessorInterfaceFactoryInterface != 
                                    null
                                )
                        
                                    {
                                    vector.add(this.paymentProcessorInterfaceFactoryInterface!!.::class.toString()!!)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return vector
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>

        Updates for KMP build        
        {

    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.putAll(this.getBasicPaymentType()!!.toHashMap())

    
                        if(this.paymentTransactionInterfaceFactoryInterface != 
                                    null
                                )
                        
                                    {
                                    hashMap!!.put(PaymentGatewayData.PAYMENTTRANSACTIONINTERFACEFACTORYINTERFACE.toString(), this.paymentTransactionInterfaceFactoryInterface!!.::class.toString()!!)

                                    }
                                

    
                        if(this.paymentProcessorInterfaceFactoryInterface != 
                                    null
                                )
                        
                                    {
                                    hashMap!!.put(PaymentGatewayData.PAYMENTPROCESSORINTERFACEFACTORYINTERFACE.toString(), this.paymentProcessorInterfaceFactoryInterface!!.::class.toString()!!)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


open fun getBasicPaymentType()
        //nullable = true from not(false or (false and true)) = true
: BasicPaymentType

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return basicPaymentType
}


}
                
            

