
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

    val PAYMENTOPTIONS: String = "PaymentOptions" +PaymentGatewayPageData.EXTENSION

    val STARTCHECKOUT: String = "StartCheckout" +PaymentGatewayPageData.EXTENSION

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
public constructor (location: String, paymentMethod: String)
            : super()
        {
var location = location
var paymentMethod = paymentMethod

    var paymentMethodString: String = PaymentGatewayPageData.NAME +paymentMethod


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(location)
stringBuffer!!.append("MakePayment")
stringBuffer!!.append(PaymentGatewayPageData.EXTENSION)
MAKEPAYMENT= stringBuffer!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(paymentMethodString)
stringBuffer!!.append("Checkout")
stringBuffer!!.append(PaymentGatewayPageData.EXTENSION)
CHECKOUT= stringBuffer!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(paymentMethodString)
stringBuffer!!.append("Shipping")
stringBuffer!!.append(PaymentGatewayPageData.EXTENSION)
SHIPPING= stringBuffer!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(paymentMethodString)
stringBuffer!!.append("ShippingAddress")
stringBuffer!!.append(PaymentGatewayPageData.EXTENSION)
SHIPPINGADDRESS= stringBuffer!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(paymentMethodString)
stringBuffer!!.append("ShippingAddressAction")
stringBuffer!!.append(PaymentGatewayPageData.EXTENSION)
SHIPPINGADDRESSACTION= stringBuffer!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(paymentMethodString)
stringBuffer!!.append("BillingAddress")
stringBuffer!!.append(PaymentGatewayPageData.EXTENSION)
BILLINGADDRESS= stringBuffer!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(paymentMethodString)
stringBuffer!!.append("Payment")
stringBuffer!!.append(PaymentGatewayPageData.EXTENSION)
PAYMENT= stringBuffer!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(paymentMethodString)
stringBuffer!!.append("Authorize")
stringBuffer!!.append(PaymentGatewayPageData.EXTENSION)
AUTHORIZE= stringBuffer!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(paymentMethodString)
stringBuffer!!.append("PaymentFinish")
stringBuffer!!.append(PaymentGatewayPageData.EXTENSION)
FINISH= stringBuffer!!.toString()
}


}
                
            

