
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
        package views.admin.payment




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.user.commerce.money.payment.gateway.processor.PaymentProcessorInterface
import org.allbinary.business.user.commerce.money.payment.gateway.processor.PaymentProcessorInterfaceFactory
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.visual.transform.info.TransformInfoHttpInterface
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import views.business.context.modules.storefront.HttpStoreComponentView

open public class PaymentProcessorComponent : HttpStoreComponentView {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface){

                    var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
open fun addDomNodeInterfaces()
        //nullable = true from not(false or (false and true)) = true
{
    var paymentProcessorInterface: PaymentProcessorInterface = PaymentProcessorInterfaceFactory.getInstance()!!.getInstance(this.getTransformInfoInterface())!!
            

paymentProcessorInterface!!.process()

    var httpTransformInfoInterface: TransformInfoHttpInterface = this.getTransformInfoInterface() as TransformInfoHttpInterface

httpTransformInfoInterface!!.getWeblisketSession()!!.removeBasket()
this.addDomNodeInterface(paymentProcessorInterface as DomNodeInterface)
}


                @Throws(Exception::class)
            
open fun view()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            this.addDomNodeInterfaces()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.view()
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "view()", e)

                                    }
                                



                            throw e
}

}


}
                
            

