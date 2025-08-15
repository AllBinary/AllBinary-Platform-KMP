
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
        package views.generic.order.history




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import javax.servlet.http.HttpServletRequest
import org.allbinary.business.user.commerce.inventory.order.OrderData
import org.allbinary.business.user.commerce.inventory.order.OrderHistory
import org.allbinary.business.user.commerce.inventory.order.OrderHistoryData
import org.allbinary.data.tables.user.commerce.inventory.order.OrderHistoryEntity
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.globals.GLOBALS2
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.w3c.dom.Document
import org.w3c.dom.Node
import views.business.context.modules.storefront.HttpStoreComponentView

open public class OrderHistoryView : HttpStoreComponentView
                , DomNodeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var request: HttpServletRequest

    private var shipped: String

    private var partiallyShipped: String

    private var processing: String

    private var preprocessing: String

    private var cancelled: String
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface){

                    var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
this.request= this.getPageContext()!!.getRequest() as HttpServletRequest
this.preprocessing= request.getParameter(OrderHistoryData.PREPROCESSINGNAME)
this.shipped= request.getParameter(OrderHistoryData.SHIPPEDNAME)
this.partiallyShipped= request.getParameter(OrderHistoryData.PARTIALLYSHIPPEDNAME)
this.processing= request.getParameter(OrderHistoryData.PROCESSINGNAME)
this.cancelled= request.getParameter(OrderHistoryData.CANCELLEDNAME)
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

        try {
            
    var node: Node = document.createElement(OrderData.ORDERS)!!
            


    var orderHistoryEntity: OrderHistoryEntity = OrderHistoryEntity()


    var orderReviewVector: Vector = orderHistoryEntity!!.getOrders(this.getWeblisketSession()!!.getUserName())!!
            


    var size: Int = orderReviewVector!!.size!!
            





                        for (index in 0 until size)


        {
    var orderHistory: OrderHistory = orderReviewVector!!.get(index) as OrderHistory


    var orderHistoryNode: Node = orderHistory!!.toXmlNode(document)!!
            


    var orderNode: Node = document.createElement(orderHistory!!.getPaymentMethod())!!
            

node.appendChild(orderHistory!!.toXmlNode(document))
}


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Attempt to View a users order history", this, "view")

                                    }
                                
node.appendChild(ModDomHelper.createNameValueNodes(document, OrderHistoryData.PREPROCESSINGNAME, OrderHistoryData.PREPROCESSING))
node.appendChild(ModDomHelper.createNameValueNodes(document, OrderHistoryData.PROCESSINGNAME, OrderHistoryData.PROCESSING))
node.appendChild(ModDomHelper.createNameValueNodes(document, OrderHistoryData.CANCELLEDNAME, OrderHistoryData.CANCELLED))
node.appendChild(ModDomHelper.createNameValueNodes(document, OrderHistoryData.PARTIALLYSHIPPEDNAME, OrderHistoryData.PARTIALLYSHIPPED))
node.appendChild(ModDomHelper.createNameValueNodes(document, OrderHistoryData.SHIPPEDNAME, OrderHistoryData.SHIPPED))
node.appendChild(ModDomHelper.createNameValueNodes(document, GLOBALS2.VIEWNAME, GLOBALS2.VIEW))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
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
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "view()", e)

                                    }
                                



                            throw e
}

}


}
                
            

