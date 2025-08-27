
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
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.entry.EntryData
import org.allbinary.business.user.commerce.money.payment.gateway.PaymentGatewayData
import org.allbinary.business.user.commerce.money.payment.gateway.PaymentGatewaysData
import org.allbinary.business.user.commerce.money.payment.types.BasicPaymentType
import org.allbinary.business.user.commerce.money.payment.types.PaymentTypeUtil
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.w3c.dom.Document
import org.w3c.dom.Node
import views.business.context.modules.storefront.HttpStoreComponentView

open public class PaymentGatewaysView : HttpStoreComponentView
                , DomNodeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var paymentGatewayVector: Vector
public constructor        (transformInfoInterface: TransformInfoInterface, gatewayVector: Vector)                        

                            : super(transformInfoInterface){

                    var transformInfoInterface = transformInfoInterface


                    var gatewayVector = gatewayVector


                            //For kotlin this is before the body of the constructor.
                    
this.paymentGatewayVector= gatewayVector
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

        try {
            
    var storeName: String = this.getTransformInfoInterface()!!.getStoreName()!!


    var paymentGatewaysNode: Node = document.createElement(PaymentGatewaysData.NAME)!!


    var size: Int = this.paymentGatewayVector!!.size!!





                        for (index in 0 until size)

        {
    var paymentType: BasicPaymentType = this.paymentGatewayVector!!.get(index) as BasicPaymentType


    var hashMap: HashMap<Any, Any> = paymentType!!.toHashMap()!!

hashMap!!.put(EntryData.getInstance()!!.DEFAULT, PaymentTypeUtil.getInstance()!!.getDefault(storeName)!!.getBasicPaymentType()!!.getName())

    var paymentGatewayNode: Node = ModDomHelper.createNodeWithValueNodes(document, PaymentGatewayData.NAME.toString(), hashMap)!!

paymentGatewaysNode!!.appendChild(paymentGatewayNode)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return paymentGatewaysNode
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.XSLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, "toXmlNode", e)

                                    }
                                



                            throw e
}

}


open fun addDomNodeInterfaces()
        //nullable = true from not(false or (false and true)) = true
{this.addDomNodeInterface(this as DomNodeInterface)
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
    var error: String = "Failed to view payment gateways"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "view()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


}
                
            

