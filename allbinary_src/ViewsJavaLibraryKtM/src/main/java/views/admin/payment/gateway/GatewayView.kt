
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
import org.allbinary.business.user.commerce.money.payment.gateway.PaymentGatewayInterface
import org.allbinary.business.user.commerce.money.payment.types.BasicPaymentTypeUtil
import org.allbinary.data.tables.user.commerce.money.payment.gateway.PaymentGatewayEntityFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.visual.transform.info.TransformInfoInterface

open public class GatewayView : PaymentGatewayViewAbstract {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface){

                    var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
}


open fun getFormData(request: HttpServletRequest)
        //nullable = true from not(false or (false and false)) = true
{

                    var request = request
super.getFormData(request)

    
                        if(StringValidationUtil.getInstance()!!.isEmpty(this.getPaymentGatewayPrimaryKey()!!.getName()))
                        
                                    {
                                    this.getPaymentGatewayPrimaryKey()!!.setName(this.getWeblisketSession()!!.getPaymentMethod())

                                    }
                                
}


                @Throws(Exception::class)
            
open fun view()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var paymentGatewayInterface: PaymentGatewayInterface = PaymentGatewayEntityFactory.getInstance()!!.getPaymentGatewayInterface(this.getPaymentGatewayPrimaryKey()!!.getStoreName(), BasicPaymentTypeUtil.getInstance()!!.get(this.getPaymentGatewayPrimaryKey()!!.getName()))!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PaymentGatewayComponent(this.getTransformInfoInterface(), paymentGatewayInterface).
                            view()
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "edit()", e)

                                    }
                                



                            throw e
}

}


}
                
            

