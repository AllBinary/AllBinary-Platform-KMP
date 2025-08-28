
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
        package views.generic.order




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.servlet.http.HttpServletRequest
import org.allbinary.business.user.commerce.inventory.basket.Basket
import org.allbinary.business.user.commerce.inventory.basket.BasketReview
import org.allbinary.business.user.commerce.inventory.order.Order
import org.allbinary.business.user.commerce.inventory.order.OrderData
import org.allbinary.business.user.commerce.inventory.order.OrderHistory
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.w3c.dom.Document
import org.w3c.dom.Node
import views.business.context.modules.storefront.HttpStoreComponentView

open public class OrderView : HttpStoreComponentView
                , DomNodeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var request: HttpServletRequest

    var order: Order

    var orderHistory: OrderHistory

    var basketReview: BasketReview
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface)

        Updates for KMP build        
        {
var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
this.request= this.getPageContext()!!.getRequest() as HttpServletRequest
this.getFormData()
}


                @Throws(Exception::class)
            
open fun getFormData()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    var id: String = request.getParameter(OrderData.ID)!!


    
                        if(id == 
                                    null
                                )
                        
                                    {
                                    id= this.getWeblisketSession()!!.getOrder()!!.getId()

                                    }
                                
this.order= Order(Basket())
this.order.setId(id)
}


open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node

        Updates for KMP build        
        {
var document = document

        try {
            
    var orderHistoryNode: Node = orderHistory!!.toXmlNode(document)!!


    var node: Node = document.createElement(orderHistory!!.getPaymentMethod())!!

orderHistoryNode!!.appendChild(basketReview!!.toXmlNode(document))
node.appendChild(orderHistoryNode)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.XSLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, "toXmlNode", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun addDomNodeInterfaces()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.addDomNodeInterface(this as DomNodeInterface)
}


                @Throws(Exception::class)
            
open fun view()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            this.addDomNodeInterfaces()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.view()
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "view()", e)

                                    }
                                



                            throw e
}

}


}
                
            

