
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
        package views.admin.payment.gateways




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.data.tables.user.commerce.money.payment.gateway.PaymentGatewayEntityFactory
import org.allbinary.data.tables.user.commerce.money.payment.gateway.PaymentGatewayEntityInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import views.admin.payment.gateway.PaymentGatewayViewAbstract

open public class SelectExistingView : PaymentGatewayViewAbstract {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface){

                    var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
open fun view()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var paymentGatewayEntityInterface: PaymentGatewayEntityInterface = PaymentGatewayEntityFactory.getInstance()!!
            


    var existingGateways: Vector = paymentGatewayEntityInterface!!.findPaymentTypeVectorByStore(this.getPaymentGatewayPrimaryKey()!!.getStoreName())!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PaymentGatewaysView(this.getTransformInfoInterface(), existingGateways).
                            view()
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "view", e)

                                    }
                                



                            throw e
}

}


}
                
            

