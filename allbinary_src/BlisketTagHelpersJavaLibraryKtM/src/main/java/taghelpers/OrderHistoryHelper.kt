
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
        package taghelpers



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.servlet.http.HttpServletRequest
import javax.servlet.jsp.PageContext
import admin.taghelpers.TagHelper
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.context.modules.storefront.StoreFrontFactory
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.user.address.StreetAddress
import org.allbinary.business.user.commerce.inventory.order.OrderData
import org.allbinary.business.user.commerce.inventory.order.OrderHistoryData
import org.allbinary.business.user.commerce.inventory.order.OrderHistoryFactory
import org.allbinary.business.user.commerce.inventory.order.OrderHistoryInterface
import org.allbinary.business.user.commerce.shipping.ShippingMethodData
import org.allbinary.data.tables.user.commerce.inventory.order.OrderHistoryEntityFactory
import org.allbinary.data.tables.user.commerce.inventory.order.OrderHistoryEntityInterface
import org.allbinary.logic.communication.http.request.session.WeblisketSession
import org.allbinary.logic.communication.log.LogUtil

open public class OrderHistoryHelper : TagHelper {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var weblisketSession: WeblisketSession

    private var storeFrontInterface: StoreFrontInterface

    private val propertiesHashMap: HashMap<Any, Any>

    private val pageContext: PageContext

    private val request: HttpServletRequest

    private var streetAddress: StreetAddress

    private var id: String

    private var groupId: String

    private var status: String

    private var newStatus: String
public constructor        (propertiesHashMap: HashMap<Any, Any>, pageContext: PageContext){

                    var propertiesHashMap = propertiesHashMap


                    var pageContext = pageContext
this.propertiesHashMap= propertiesHashMap
this.pageContext= pageContext
this.request= pageContext!!.getRequest() as HttpServletRequest

    var storeName: String = propertiesHashMap!!.get(StoreFrontData.getInstance()!!.NAME) as String

this.newStatus= propertiesHashMap!!.get(OrderHistoryData.STATUS) as String

    
                        if(storeName != 
                                    null
                                )
                        
                                    {
                                    this.storeFrontInterface= StoreFrontFactory.getInstance(storeName)

                                    }
                                
this.getFormData()
}


open fun getFormData()
        //nullable = true from not(false or (false and true)) = true
{this.id= request.getParameter(OrderData.ID)
this.groupId= request.getParameter(ShippingMethodData.GROUP)

    
                        if(this.newStatus == 
                                    null
                                )
                        
                                    {
                                    this.newStatus= request.getParameter(OrderHistoryData.STATUS)

                                    }
                                
}


open fun setOrderStatus()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var success: String = "Status successfully set to: " +this.status


    var orderReviewInterface: OrderHistoryInterface = OrderHistoryFactory.getInstance(id)!!
            


    var status: String = orderReviewInterface!!.getStatus()!!
            


    
                        if(status.compareTo(OrderHistoryData.CANCELLED) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Order " +id +" Already Cancelled<br/>"

                                    }
                                
                             else 
    
                        if(status.compareTo(OrderHistoryData.SHIPPED) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Order " +id +" Already Shipped. You can't cancel a shipped order.<br/>"

                                    }
                                
                             else 
    
                        if(status.compareTo(OrderHistoryData.PREPROCESSING) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Order " +id +" has been cancelled.<br/>"

                                    }
                                
                             else 
    
                        if(status.compareTo(OrderHistoryData.PARTIALLYSHIPPED) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Order " +id +" Partially Shipped. You can cancel unshipped items, but not the whole order.<br/>"

                                    }
                                
                             else 
    
                        if(status.compareTo(OrderHistoryData.PROCESSING) == 0)
                        
                                    {
                                    
    var orderHistoryEntityInterface: OrderHistoryEntityInterface = OrderHistoryEntityFactory.getInstance()!!
            

orderHistoryEntityInterface!!.setStatus(id, this.newStatus)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Order " +id +" has been cancelled.<br/>"

                                    }
                                

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, 
                            "setOrderStatus()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Error Setting Order Status"
} catch(e: Exception)
            {
    var error: String = "Failed to set order status"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "setOrderStatus()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error +"<br/>" +"Exception: " +e +"<br/>"
}

}


}
                
            

