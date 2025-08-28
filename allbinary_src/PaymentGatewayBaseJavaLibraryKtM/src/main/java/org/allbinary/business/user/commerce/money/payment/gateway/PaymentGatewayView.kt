
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
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class PaymentGatewayView
            : Object
        
                , DomNodeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var paymentGatewayInterface: PaymentGatewayInterface
public constructor        (paymentGatewayInterface: PaymentGatewayInterface)
            : super()
        

        Updates for KMP build        
        {
    //var paymentGatewayInterface = paymentGatewayInterface
this.paymentGatewayInterface= paymentGatewayInterface
}


open fun getPaymentGatewayInterface()
        //nullable = true from not(false or (false and true)) = true
: PaymentGatewayInterface

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.paymentGatewayInterface
}


                @Throws(Exception::class)
            
open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>

        Updates for KMP build        
        {

    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node

        Updates for KMP build        
        {
    //var document = document

        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.START, this, "toXmlNode")

                                    }
                                

    var hashMap: HashMap<Any, Any> = PaymentGatewayMapping(this.paymentGatewayInterface).
                            toHashMap()!!

hashMap!!.putAll(this.toHashMap())

    var paymentGatewayNode: Node = ModDomHelper.createNodeWithValueNodes(document, PaymentGatewayData.NAME.toString(), hashMap)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return paymentGatewayNode
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.XSLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "toXmlNode", e)

                                    }
                                



                            throw e
}

}


}
                
            

