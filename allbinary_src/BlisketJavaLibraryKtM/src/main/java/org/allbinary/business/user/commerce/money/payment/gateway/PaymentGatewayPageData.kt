
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
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil

open public class PaymentGatewayPageData
            : Object
         {
        

        companion object {
            
    private val EXTENSION: String = ".jsp"

    private val NAME: String = StringUtil.getInstance()!!.EMPTY_STRING

    val FORWARDMAKEPAYMENT: String = "MakePayment.jsp"

    val PAYMENTOPTIONS: String = "PaymentOptions" +EXTENSION

    val STARTCHECKOUT: String = "StartCheckout" +EXTENSION

        }
            
    val MAKEPAYMENT: String

    val CHECKOUT: String

    val SHIPPING: String

    val SHIPPINGADDRESS: String

    val SHIPPINGADDRESSACTION: String

    val BILLINGADDRESS: String

    val PAYMENT: String

    val AUTHORIZE: String

    val FINISH: String
public constructor        (location: String, paymentMethod: String)
            : super()
        

        Updates for KMP build        
        {
var location = location
var paymentMethod = paymentMethod

    var paymentMethodString: String = PaymentGatewayPageData.NAME +paymentMethod


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(location)
stringBuffer!!.append("MakePayment")
stringBuffer!!.append(EXTENSION)
MAKEPAYMENT= stringBuffer!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(paymentMethodString)
stringBuffer!!.append("Checkout")
stringBuffer!!.append(EXTENSION)
CHECKOUT= stringBuffer!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(paymentMethodString)
stringBuffer!!.append("Shipping")
stringBuffer!!.append(EXTENSION)
SHIPPING= stringBuffer!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(paymentMethodString)
stringBuffer!!.append("ShippingAddress")
stringBuffer!!.append(EXTENSION)
SHIPPINGADDRESS= stringBuffer!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(paymentMethodString)
stringBuffer!!.append("ShippingAddressAction")
stringBuffer!!.append(EXTENSION)
SHIPPINGADDRESSACTION= stringBuffer!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(paymentMethodString)
stringBuffer!!.append("BillingAddress")
stringBuffer!!.append(EXTENSION)
BILLINGADDRESS= stringBuffer!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(paymentMethodString)
stringBuffer!!.append("Payment")
stringBuffer!!.append(EXTENSION)
PAYMENT= stringBuffer!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(paymentMethodString)
stringBuffer!!.append("Authorize")
stringBuffer!!.append(EXTENSION)
AUTHORIZE= stringBuffer!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(paymentMethodString)
stringBuffer!!.append("PaymentFinish")
stringBuffer!!.append(EXTENSION)
FINISH= stringBuffer!!.toString()
}


}
                
            

