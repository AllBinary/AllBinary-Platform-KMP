
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
import javax.servlet.http.HttpServletRequest
import org.allbinary.business.user.commerce.money.payment.types.BasicPaymentType
import org.allbinary.business.user.commerce.money.payment.types.BasicPaymentTypeUtil
import org.allbinary.logic.communication.http.request.RequestParams
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class PaymentGatewayInterfaceFactory
            : Object
        
                , PaymentGatewayInterfaceFactoryInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
public constructor ()
            : super()
        {
}


                @Throws(Exception::class)
            
    open fun getInstance(httpServletRequest: HttpServletRequest)
        //nullable =  from not(true or (false and false)) = 
: PaymentGatewayInterface{
var httpServletRequest = httpServletRequest

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.PAYMENT))
                        
                                    {
                                    logUtil!!.put("Getting", this, commonStrings!!.GET_INSTANCE)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getInstance(RequestParams(httpServletRequest).
                            toHashMap())
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.PAYMENTERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "getInstance(HttpServletRequest)", e)

                                    }
                                



                            throw e
}

}


                @Throws(Exception::class)
            
    open fun getInstance(paymentType: BasicPaymentType)
        //nullable =  from not(true or (false and false)) = 
: PaymentGatewayInterface{
var paymentType = paymentType

    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(PaymentGatewayData.NAME.toString(), paymentType!!.getName())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getInstance(hashMap)
}


                @Throws(Exception::class)
            
    open fun getInstance(hashMap: HashMap<Any, Any>)
        //nullable =  from not(true or (false and false)) = 
: PaymentGatewayInterface{
var hashMap = hashMap

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


        try {
            
    var gatewayName: String = hashMap!!.get(PaymentGatewayData.NAME.toString()) as String


    var paymentType: BasicPaymentType = BasicPaymentTypeUtil.getInstance()!!.get(gatewayName)!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.PAYMENT))
                        
                                    {
                                    logUtil!!.put("Getting PaymentGatewayInterface for PaymentType: " +paymentType!!.getName() +" with: " +hashMap, this, commonStrings!!.GET_INSTANCE)

                                    }
                                

    var paymentGatewayInterfaceFactoryInterface: PaymentGatewayInterfaceFactoryInterface = paymentType!!.getPaymentGatewayInterfaceFactoryInterface()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return paymentGatewayInterfaceFactoryInterface!!.getInstance(hashMap)
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.PAYMENTERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.GET_INSTANCE, e)

                                    }
                                



                            throw e
}

}


}
                
            

