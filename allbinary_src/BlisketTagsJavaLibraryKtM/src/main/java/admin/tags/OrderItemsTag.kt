
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
import javax.servlet.jsp.JspTagException
import admin.taghelpers.OrderItemsHelperFactory
import admin.taghelpers.OrderItemsRequestHelperFactory
import org.allbinary.business.user.commerce.inventory.order.OrderHistoryData
import org.allbinary.logic.communication.http.request.AbResponseHandler
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.security.licensing.LicensingException

open public class OrderItemsTag : TableTag {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var status: String
public constructor        (){this.setTagHelperFactory(OrderItemsHelperFactory())
this.setTagRequestHelperFactory(OrderItemsRequestHelperFactory())
}


open fun setStatus(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.status= value
}


                @Throws(LicensingException::class)
            
open fun setOrderStatus()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var anyType: Any = OrderItemsRequestHelperFactory().
                            getInstance(this.getPropertiesHashMap(), this.pageContext)!!


    
                        if(this.status == 
                                    null
                                )
                        
                                    {
                                    
    var helperClass: KClass<*> = anyType!!::class!!


    var method: Method = helperClass!!.getMethod("setOrderStatus", 
                            null)!!


    var result: String = method.invoke(anyType, 
                            null) as String




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result

                                    }
                                
                        else {
                            
    var helperClass: KClass<*> = anyType!!::class!!


    var methodParams: Array<KClass<*>?> = arrayOf(this.status.::class)


    var method: Method = helperClass!!.getMethod("setOrderStatus", methodParams)!!


    var methodArgs: Array<Any?> = arrayOf(this.status)


    var result: String = method.invoke(anyType, methodArgs) as String




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result

                        }
                            
} catch(e: LicensingException)
            {


                            throw e
}
 catch(e: Exception)
            {
    var error: String = "Failed to set Order status to: " +this.status


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "setOrderStatus()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


                @Throws(JspTagException::class)
            
open fun doStartTag()
        //nullable = true from not(false or (false and true)) = true
: Int{
        try {
            
    
                        if(this.isEnabled())
                        
                                    {
                                    
    
                        if(this.getCommand() != 
                                    null
                                )
                        
                                    {
                                    this.getPropertiesHashMap()!!.put(OrderHistoryData.STATUS, this.status)

    
                        if(this.getCommand()!!.compareTo(OrderHistoryData.SETSTATUS) == 0)
                        
                                    {
                                    this.pageContext!!.getOut()!!.print(this.setOrderStatus())

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.doStartTag()

                        }
                            

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY
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
                
            

