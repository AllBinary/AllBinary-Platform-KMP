
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
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.entry.EntryData
import org.allbinary.business.user.UserData
import org.allbinary.business.user.address.BillingAddressData
import org.allbinary.business.user.address.ShippingAddressData
import org.allbinary.business.user.commerce.inventory.order.OrderData
import org.allbinary.business.user.commerce.inventory.order.OrderHistoryData
import org.allbinary.business.user.commerce.money.payment.PaymentData
import org.allbinary.business.user.commerce.shipping.ShippingMethodData
import org.allbinary.data.tables.user.commerce.inventory.order.OrderHistoryEntityFactory
import org.allbinary.logic.communication.log.LogUtil

open public class UpdateOrderHelper : TagHelper {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var request: HttpServletRequest

    private var entryId: String

    private var orderId: String

    private var userName: String

    private var storeName: String

    private var shipDate: String

    private var orderDate: String

    private var transDate: String

    private var cancelDate: String

    private var status: String

    private var paymentMethod: String

    private var name: String

    private var type: String

    private var expiration: String

    private var number: String

    private var encryption: String

    private var billingName: String

    private var billingStreet: String

    private var billingCity: String

    private var billingState: String

    private var billingCode: String

    private var billingCountry: String

    private var shippingName: String

    private var shippingStreet: String

    private var shippingCity: String

    private var shippingState: String

    private var shippingCode: String

    private var shippingCountry: String

    private var shippingMethodName: String

    private var subTotal: String

    private var shippingCost: String

    private var tax: String

    private var total: String

    private var special: String

    private var userComment: String

    private var userCancelComment: String

    private var storeComment: String

    private var storeCancelComment: String
public constructor        (hashMap: HashMap<Any, Any>, pageContext: PageContext)

        Updates for KMP build        
        {
var hashMap = hashMap
var pageContext = pageContext
this.request= pageContext!!.getRequest() as HttpServletRequest
this.getFormData()
}


open fun getFormData()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.entryId= request.getParameter(EntryData.getInstance()!!.ID)
this.orderId= request.getParameter(OrderData.ID)
this.userName= request.getParameter(UserData.USERNAME)
this.storeName= request.getParameter(StoreFrontData.getInstance()!!.NAME)
this.shipDate= request.getParameter(OrderHistoryData.SHIPPEDDATE)
this.orderDate= request.getParameter(OrderHistoryData.ORDERDATE)
this.transDate= request.getParameter(OrderHistoryData.TRANSDATE)
this.cancelDate= request.getParameter(OrderHistoryData.CANCELDATE)
this.status= request.getParameter(OrderHistoryData.STATUS)
this.paymentMethod= request.getParameter(PaymentData.METHOD)
this.name= request.getParameter(PaymentData.NAME)
this.type= request.getParameter(PaymentData.TYPE)
this.expiration= request.getParameter(PaymentData.EXPIRATION)
this.number= request.getParameter(PaymentData.NUMBER)
this.encryption= request.getParameter(EntryData.getInstance()!!.ENCRYPTION)
this.billingName= request.getParameter(BillingAddressData.NAME)
this.billingStreet= request.getParameter(BillingAddressData.STREET)
this.billingCity= request.getParameter(BillingAddressData.CITY)
this.billingState= request.getParameter(BillingAddressData.STATE)
this.billingCode= request.getParameter(BillingAddressData.CODE)
this.billingCountry= request.getParameter(BillingAddressData.COUNTRY)
this.shippingName= request.getParameter(ShippingAddressData.NAME)
this.shippingStreet= request.getParameter(ShippingAddressData.STREET)
this.shippingCity= request.getParameter(ShippingAddressData.CITY)
this.shippingState= request.getParameter(ShippingAddressData.STATE)
this.shippingCode= request.getParameter(ShippingAddressData.CODE)
this.shippingCountry= request.getParameter(ShippingAddressData.COUNTRY)
this.shippingMethodName= request.getParameter(ShippingMethodData.NAME)
this.subTotal= request.getParameter(OrderHistoryData.SUBTOTAL)
this.shippingCost= request.getParameter(OrderHistoryData.SHIPPINGCOST)
this.tax= request.getParameter(OrderHistoryData.TAX)
this.total= request.getParameter(OrderHistoryData.TOTAL)
this.special= request.getParameter(EntryData.getInstance()!!.SPECIAL)
this.userComment= request.getParameter(OrderData.CUSTOMERCOMMENT)
this.userCancelComment= request.getParameter(OrderData.CUSTOMERCANCELCOMMENT)
this.storeComment= request.getParameter(OrderData.STORECOMMENT)
this.storeCancelComment= request.getParameter(OrderData.STORECANCELCOMMENT)
}


open fun update()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var success: String = "Successful update"


    var orderHashMap: HashMap<Any, Any> = HashMap<Any, Any>()


    var whereHashMap: HashMap<Any, Any> = HashMap<Any, Any>()

orderHashMap!!.put(EntryData.getInstance()!!.ID, entryId)
orderHashMap!!.put(OrderData.ID, this.orderId)
orderHashMap!!.put(UserData.USERNAME, userName)
orderHashMap!!.put(StoreFrontData.getInstance()!!.NAME, this.storeName)
orderHashMap!!.put(OrderHistoryData.SHIPPEDDATE, shipDate)
orderHashMap!!.put(OrderHistoryData.ORDERDATE, orderDate)
orderHashMap!!.put(OrderHistoryData.TRANSDATE, transDate)
orderHashMap!!.put(OrderHistoryData.CANCELDATE, cancelDate)
orderHashMap!!.put(OrderHistoryData.STATUS, status)
orderHashMap!!.put(PaymentData.METHOD, paymentMethod)
orderHashMap!!.put(PaymentData.NAME, name)
orderHashMap!!.put(PaymentData.TYPE, type)
orderHashMap!!.put(PaymentData.EXPIRATION, expiration)
orderHashMap!!.put(BillingAddressData.NAME, billingName)
orderHashMap!!.put(BillingAddressData.STREET, billingStreet)
orderHashMap!!.put(BillingAddressData.CITY, billingCity)
orderHashMap!!.put(BillingAddressData.STATE, billingState)
orderHashMap!!.put(BillingAddressData.CODE, billingCode)
orderHashMap!!.put(BillingAddressData.COUNTRY, billingCountry)
orderHashMap!!.put(ShippingAddressData.NAME, shippingName)
orderHashMap!!.put(ShippingAddressData.STREET, shippingStreet)
orderHashMap!!.put(ShippingAddressData.CITY, shippingCity)
orderHashMap!!.put(ShippingAddressData.STATE, shippingState)
orderHashMap!!.put(ShippingAddressData.CODE, shippingCode)
orderHashMap!!.put(ShippingAddressData.COUNTRY, shippingCountry)
orderHashMap!!.put(ShippingMethodData.NAME, this.shippingMethodName)
orderHashMap!!.put(OrderHistoryData.SUBTOTAL, this.subTotal)
orderHashMap!!.put(OrderHistoryData.SHIPPINGCOST, this.shippingCost)
orderHashMap!!.put(OrderHistoryData.TAX, this.tax)
orderHashMap!!.put(OrderHistoryData.TOTAL, this.total)
orderHashMap!!.put(EntryData.getInstance()!!.SPECIAL, special)
orderHashMap!!.put(OrderData.CUSTOMERCOMMENT, this.userComment)
orderHashMap!!.put(OrderData.CUSTOMERCANCELCOMMENT, this.userCancelComment)
orderHashMap!!.put(OrderData.STORECOMMENT, this.storeComment)
orderHashMap!!.put(OrderData.STORECANCELCOMMENT, this.storeCancelComment)
whereHashMap!!.put(OrderData.ID, orderId)
OrderHistoryEntityFactory.getInstance()!!.update(whereHashMap, orderHashMap)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "update()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var error: String = "Failed to update order table"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "update()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


}
                
            

