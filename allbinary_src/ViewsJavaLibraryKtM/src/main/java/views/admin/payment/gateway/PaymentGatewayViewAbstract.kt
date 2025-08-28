
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
        package views.admin.payment.gateway




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.servlet.http.HttpServletRequest
import org.allbinary.business.user.commerce.money.payment.gateway.PaymentGatewayData
import org.allbinary.business.user.commerce.money.payment.gateway.PaymentGatewayPrimaryKey
import org.allbinary.logic.visual.transform.info.TransformInfoHttpComposite
import org.allbinary.logic.visual.transform.info.TransformInfoInterface

open public class PaymentGatewayViewAbstract : TransformInfoHttpComposite {
        

    private var paymentGatewayPrimaryKey: PaymentGatewayPrimaryKey
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface){
var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
this.getFormData(this.getPageContext()!!.getRequest() as HttpServletRequest)
}


open fun getFormData(request: HttpServletRequest)
        //nullable = true from not(false or (false and false)) = true
{
var request = request

    var storeName: String = this.getWeblisketSession()!!.getStoreName()!!


    var gatewayName: String = request.getParameter(PaymentGatewayData.NAME.toString())!!

this.setPaymentGatewayPrimaryKey(PaymentGatewayPrimaryKey(storeName, gatewayName))
}


open fun getPaymentGatewayPrimaryKey()
        //nullable = true from not(false or (false and true)) = true
: PaymentGatewayPrimaryKey{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return paymentGatewayPrimaryKey
}


open fun setPaymentGatewayPrimaryKey(paymentGatewayPrimaryKey: PaymentGatewayPrimaryKey)
        //nullable = true from not(false or (false and false)) = true
{
var paymentGatewayPrimaryKey = paymentGatewayPrimaryKey
this.paymentGatewayPrimaryKey= paymentGatewayPrimaryKey
}


}
                
            

