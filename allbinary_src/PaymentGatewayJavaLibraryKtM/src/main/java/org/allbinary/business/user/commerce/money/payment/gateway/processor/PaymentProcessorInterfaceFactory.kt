
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.user.commerce.money.payment.gateway.transaction.PaymentTransactionInterface
import org.allbinary.business.user.commerce.money.payment.gateway.transaction.PaymentTransactionInterfaceRequestFactory
import org.allbinary.business.user.commerce.money.payment.types.PaymentType
import org.allbinary.business.user.commerce.money.payment.types.PaymentTypeUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.string.CommonStrings

open public class PaymentProcessorInterfaceFactory
            : Object
         {
        

        companion object {


    private val instance: PaymentProcessorInterfaceFactory = PaymentProcessorInterfaceFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PaymentProcessorInterfaceFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            
private constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun getInstance(transformInfoInterface: TransformInfoInterface)
        //nullable =  from not(true or (false and false)) = 
: PaymentProcessorInterface{

                    var transformInfoInterface = transformInfoInterface

        try {
            
    var paymentTransactionInterface: PaymentTransactionInterface = PaymentTransactionInterfaceRequestFactory.getInstance()!!.getInstance(transformInfoInterface)!!
            


    var gatewayName: String = paymentTransactionInterface!!.getOrderHistory()!!.getPaymentMethod()!!
            


    
                        if(!StringValidationUtil.getInstance()!!.isEmpty(gatewayName))
                        
                                    {
                                    
    var paymentType: PaymentType = PaymentTypeUtil.getInstance()!!.get(gatewayName)!!
            


    var paymentProcessorInterfaceFactoryInterface: PaymentProcessorInterfaceFactoryInterface = paymentType!!.getPaymentProcessorInterfaceFactoryInterface()!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return paymentProcessorInterfaceFactoryInterface!!.getInstance(transformInfoInterface, paymentTransactionInterface) as PaymentProcessorInterface

                                    }
                                



                            throw Exception(
                            "Error Getting PaymentProcessorInterface")
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.PAYMENTERROR))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.GET_INSTANCE, e)

                                    }
                                



                            throw e
}

}


}
                
            

