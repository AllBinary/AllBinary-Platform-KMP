
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
import java.util.Vector
import javax.servlet.http.HttpServletRequest
import javax.servlet.jsp.PageContext
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.context.modules.storefront.StoreFrontFactory
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.user.commerce.inventory.order.Order
import org.allbinary.business.user.commerce.inventory.order.OrderInterface
import org.allbinary.business.user.commerce.inventory.order.OrderProcessorUtil
import org.allbinary.business.user.commerce.money.payment.gateway.PaymentGatewayData
import org.allbinary.business.user.commerce.money.payment.gateway.PaymentGatewayInterface
import org.allbinary.business.user.commerce.money.payment.types.BasicPaymentType
import org.allbinary.data.tables.user.commerce.money.payment.gateway.PaymentGatewayEntity
import org.allbinary.data.tables.user.commerce.money.payment.gateway.PaymentGatewayEntityFactory
import org.allbinary.logic.communication.http.request.session.WeblisketSession
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringValidationUtil

open public class OrderHelper : TagHelper {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var weblisketSession: WeblisketSession

    private var storeFrontInterface: StoreFrontInterface

    private var propertiesHashMap: HashMap<Any, Any>

    private var pageContext: PageContext

    private var request: HttpServletRequest
public constructor        (propertiesHashMap: HashMap<Any, Any>, pageContext: PageContext){

                    var propertiesHashMap = propertiesHashMap


                    var pageContext = pageContext
this.propertiesHashMap= propertiesHashMap
this.pageContext= pageContext
this.request= pageContext!!.getRequest() as HttpServletRequest

    var storeName: String = propertiesHashMap!!.get(StoreFrontData.getInstance()!!.NAME) as String


    
                        if(!StringValidationUtil.getInstance()!!.isEmpty(storeName))
                        
                                    {
                                    this.storeFrontInterface= StoreFrontFactory.getInstance(storeName)

                                    }
                                
this.weblisketSession= WeblisketSession(this.propertiesHashMap, this.pageContext)
}


open fun setPaymentGateway()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var paymentGatewayBoolean: Boolean = Boolean.FALSE


    var orderInterface: OrderInterface = this.weblisketSession!!.getOrder()!!
            


    var requestPaymentGateway: String = request.getParameter(PaymentGatewayData.NAME.toString()) as String


    
                        if(!StringValidationUtil.getInstance()!!.isEmpty(requestPaymentGateway))
                        
                                    {
                                    this.weblisketSession!!.setPaymentMethod(requestPaymentGateway)
orderInterface!!.setPaymentMethod(requestPaymentGateway)
paymentGatewayBoolean= Boolean.TRUE

                                    }
                                

    var paymentGatewayEntityInterface: PaymentGatewayEntity = PaymentGatewayEntityFactory.getInstance() as PaymentGatewayEntity


    var paymentTypeVector: Vector = paymentGatewayEntityInterface!!.findPaymentTypeVectorByStore(this.weblisketSession!!.getStoreName())!!
            


    
                        if(paymentTypeVector!!.size == 1)
                        
                                    {
                                    
    var paymentType: BasicPaymentType = paymentTypeVector!!.get(0) as BasicPaymentType


    var paymentGatewayInterface: PaymentGatewayInterface = paymentGatewayEntityInterface!!.getPaymentGatewayInterface(this.weblisketSession!!.getStoreName(), paymentType) as PaymentGatewayInterface


    var paymentGateway: String = paymentGatewayInterface!!.getName()!!
            

this.weblisketSession!!.setPaymentMethod(paymentGateway)
orderInterface!!.setPaymentMethod(paymentGateway)
paymentGatewayBoolean= Boolean.TRUE

                                    }
                                

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "Successfully set PaymentGateway Order: ")
stringBuffer!!.append(orderInterface!!.getId())
stringBuffer!!.append(
                            " to: ")
stringBuffer!!.append(orderInterface!!.getPaymentMethod())
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "setPaymentGateway()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return paymentGatewayBoolean
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "Failed to set PaymentGateway for Order: ")

        try {
            
    var orderInterface: OrderInterface = this.weblisketSession!!.getOrder()!!
            


    
                        if(orderInterface != 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.append(orderInterface!!.getId())
stringBuffer!!.append(
                            " to: ")
stringBuffer!!.append(orderInterface!!.getPaymentMethod())

                                    }
                                
} catch(ex: Exception)
            {stringBuffer!!.append(
                            " Exception Getting")
}

logUtil!!.put(stringBuffer!!.toString(), this, 
                            "setPaymentGateway()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


open fun process()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var order: OrderInterface = this.weblisketSession!!.getOrder()!!
            

order.setStoreName(this.storeFrontInterface!!.getName())

    var result: String = OrderProcessorUtil.getInstance()!!.process(this.weblisketSession!!.getUserName(), order as Order)!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put("Successfully Processed Order: " +result, this, 
                            "processOrder()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            {
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "Failed to Process Order: ")

        try {
            stringBuffer!!.append(this.weblisketSession!!.getOrder()!!.getId())
} catch(ex: Exception)
            {stringBuffer!!.append(
                            " Exception Getting Id")
}


    var error: String = stringBuffer!!.toString()!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.PROCESS, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


}
                
            

