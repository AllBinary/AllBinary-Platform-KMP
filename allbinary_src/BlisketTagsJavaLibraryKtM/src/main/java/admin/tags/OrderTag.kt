
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
        package admin.tags




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.lang.reflect.Method
import java.util.HashMap
import javax.servlet.jsp.JspTagException
import javax.servlet.jsp.tagext.TagSupport
import admin.taghelpers.OrderHelperFactory
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.user.commerce.money.payment.gateway.PaymentGatewayData
import org.allbinary.logic.communication.http.request.AbResponseHandler
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.security.licensing.LicensingException
import tags.CustomTagSupport

open public class OrderTag : CustomTagSupport {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var command: String

    private var storeName: String

    private var propertiesHashMap: HashMap<Any, Any>
public constructor        (){}


open fun setCommand(command: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var command = command
this.command= command
}


open fun setStoreName(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.storeName= value
}


                @Throws(LicensingException::class)
            
open fun process()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var anyType: Any = OrderHelperFactory().
                            getInstance(this.propertiesHashMap, this.pageContext)!!


    var helperClass: KClass<*> = anyType!!::class!!


    var method: Method = helperClass!!.getMethod(commonStrings!!.PROCESS, 
                            null)!!


    var result: String = method.invoke(anyType, 
                            null) as String




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: LicensingException)
            {


                            throw e
}
 catch(e: Exception)
            {
    var error: String = "Failed to Process Order: "


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.PROCESS, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


                @Throws(LicensingException::class)
            
open fun setPaymentGateway()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var anyType: Any = OrderHelperFactory().
                            getInstance(this.propertiesHashMap, this.pageContext)!!


    var addressHelperClass: KClass<*> = anyType!!::class!!


    var method: Method = addressHelperClass!!.getMethod("setPaymentGateway", 
                            null)!!


    var result: Boolean = method.invoke(anyType, 
                            null) as Boolean




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: LicensingException)
            {


                            throw e
}
 catch(e: Exception)
            {
    var error: String = "Failed to setPaymentGateway for Order"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "setPaymentGateway()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


                @Throws(JspTagException::class)
            
open fun doStartTag()
        //nullable = true from not(false or (false and true)) = true
: Int{
        try {
            
    
                        if(command != 
                                    null
                                )
                        
                                    {
                                    this.propertiesHashMap= HashMap<Any, Any>()
this.propertiesHashMap!!.put(StoreFrontData.getInstance()!!.NAME, this.storeName)

    
                        if(command.compareTo(org.allbinary.globals.GLOBALS2.PROCESS) == 0)
                        
                                    {
                                    this.process()

                                    }
                                
                             else 
    
                        if(command.compareTo(PaymentGatewayData.NAME.toString()) == 0)
                        
                                    {
                                    
    
                        if(this.setPaymentGateway() == Boolean.TRUE)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TagSupport.EVAL_BODY_INCLUDE

                                    }
                                

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TagSupport.SKIP_BODY
} catch(e: LicensingException)
            {AbResponseHandler.sendJspTagLicensingRedirect(this.pageContext, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY
}
 catch(e: Exception)
            {AbResponseHandler.sendJspTagRedirect(this.pageContext, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY
}

}


}
                
            

