
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
        
import org.allbinary.business.user.commerce.money.payment.gateway.PaymentGatewayInterface
import org.allbinary.business.user.commerce.money.payment.gateway.modules.gateway.PaymentGatewayDomNodeFactoryInterface
import org.allbinary.business.user.commerce.money.payment.types.BasicPaymentType
import org.allbinary.business.user.commerce.money.payment.types.BasicPaymentTypeUtil
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import views.business.context.modules.storefront.HttpStoreComponentView

open public class PaymentGatewayComponent : HttpStoreComponentView {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var paymentGatewayInterface: PaymentGatewayInterface
public constructor        (transformInfoInterface: TransformInfoInterface, paymentGatewayInterface: PaymentGatewayInterface)                        

                            : super(transformInfoInterface){

                    var transformInfoInterface = transformInfoInterface


                    var paymentGatewayInterface = paymentGatewayInterface


                            //For kotlin this is before the body of the constructor.
                    
this.paymentGatewayInterface= paymentGatewayInterface
}


                @Throws(Exception::class)
            
open fun addDomNodeInterfaces()
        //nullable = true from not(false or (false and true)) = true
{
    var paymentType: BasicPaymentType = BasicPaymentTypeUtil.getInstance()!!.get(this.paymentGatewayInterface!!.getName())!!
            


    var paymentGatewayDomNodeFactoryInterface: PaymentGatewayDomNodeFactoryInterface = paymentType!!.getPaymentGatewayDomNodeFactoryInterface()!!
            


    var domNodeInterface: DomNodeInterface = paymentGatewayDomNodeFactoryInterface!!.getInstance(this.paymentGatewayInterface) as DomNodeInterface

this.addDomNodeInterface(domNodeInterface)
}


open fun view()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            this.addDomNodeInterfaces()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.view()
} catch(e: Exception)
            {
    var error: String = "Failed to view payment gateway"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "view()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


}
                
            

