
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
        package admin.taghelpers




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.servlet.http.HttpServletRequest
import javax.servlet.jsp.PageContext
import org.allbinary.business.user.commerce.inventory.order.OrderData
import org.allbinary.business.user.commerce.inventory.order.OrderHistory
import org.allbinary.business.user.commerce.inventory.order.OrderHistoryData
import org.allbinary.business.user.commerce.inventory.order.status.OrderStatusEmail
import org.allbinary.business.user.commerce.shipping.ShippingMethodData
import org.allbinary.data.tables.user.commerce.inventory.order.OrderHistoryEntityFactory
import org.allbinary.data.tables.user.commerce.inventory.order.OrderItemsEntityFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.ServiceClientInformationInterfaceFactory
import org.allbinary.string.CommonPhoneStrings

open public class OrderHistoryRequestHelper : TagHelper {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val abeClientInformation: AbeClientInformationInterface = ServiceClientInformationInterfaceFactory.getInstance()!!
            

    private var request: HttpServletRequest

    private var id: String

    private var groupId: String

    private var status: String
public constructor        (hashMap: HashMap<Any, Any>, pageContext: PageContext){

                    var hashMap = hashMap


                    var pageContext = pageContext
this.request= pageContext!!.getRequest() as HttpServletRequest
this.getFormData()
}


open fun getFormData()
        //nullable = true from not(false or (false and true)) = true
{this.id= request.getParameter(OrderData.ID)
this.groupId= request.getParameter(ShippingMethodData.GROUP)
this.status= request.getParameter(OrderHistoryData.STATUS)
}


open fun setOrderStatus()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    
                        if(this.groupId!!.compareTo(CommonPhoneStrings.getInstance()!!.ZERO) != 0)
                        
                                    {
                                    
    
                        if(OrderItemsEntityFactory.getInstance()!!.isEverythingShipped(id))
                        
                                    {
                                    this.status= OrderHistoryData.SHIPPED

                                    }
                                
                        else {
                            this.status= OrderHistoryData.PARTIALLYSHIPPED

                        }
                            

                                    }
                                

    var success: String = "Status successfully set to: " +this.status

OrderHistoryEntityFactory.getInstance()!!.setStatus(id, this.status)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(
                            "Success", this, 
                            "setOrderStatus()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            {
    var error: String = "Failed to set order status"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "setOrderStatus()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun setOrderStatus(newStatus: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var newStatus = newStatus

        try {
            
    
                        if(newStatus == 
                                    null
                                )
                        newStatus= this.status

    var success: String = "Status successfully set to: " +newStatus

OrderHistoryEntityFactory.getInstance()!!.setStatus(id, newStatus)

    var orderHistory: OrderHistory = OrderHistoryEntityFactory.getInstance()!!.getOrder(id)!!
            

OrderStatusEmail(this.abeClientInformation, orderHistory).
                            process()

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(
                            "Success", this, 
                            "setOrderStatus()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            {
    var error: String = "Failed to view order table"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "setOrderStatus(newStatus)", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


}
                
            

