
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
        package tags.generic.order.history




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.lang.reflect.Method
import javax.servlet.jsp.JspTagException
import org.allbinary.business.user.commerce.inventory.order.OrderHistoryData
import org.allbinary.logic.communication.http.request.AbResponseHandler
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.security.licensing.LicensingException
import taghelpers.OrderHistoryHelperFactory
import tags.StoreValidationTransformTag

open public class OrderHistoryTag : StoreValidationTransformTag {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var status: String
public constructor        ()

        Updates for KMP build        
        {
}


open fun setStatus(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
this.status= value
}


                @Throws(LicensingException::class)
            
open fun setOrderStatus()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var anyType: Any = OrderHistoryHelperFactory().
                            getInstance(this.getPropertiesHashMap(), pageContext)!!


    var helperClass: KClass<*> = anyType!!::class!!


    var method: Method = helperClass!!.getMethod("setOrderStatus", 
                            null)!!


    var result: String = method.invoke(anyType, 
                            null) as String




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: LicensingException)
            

        Updates for KMP build        
        {



                            throw e
}
 catch(e: Exception)
            

        Updates for KMP build        
        {

    var error: String = "Failed to view order table"


    
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
: Int

        Updates for KMP build        
        {

        try {
            this.setName("Basic Order History View")
this.setObjectFile("views.generic.order.history.ValidationView")

    
                        if(this.getCommand() != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(this.getCommand()!!.compareTo(OrderHistoryData.SETSTATUS) == 0)
                        
                                    {
                                    this.getPropertiesHashMap()!!.put(OrderHistoryData.STATUS, this.status)
pageContext!!.getOut()!!.print(this.setOrderStatus())

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(org.allbinary.globals.GLOBALS2.VIEW) == 0)
                        
                                    {
                                    
                                    }
                                
                        else {
                            


                            throw Exception("No Such View Command: " +this.getCommand())

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.doStartTag()

                                    }
                                



                            throw Exception("Command Null")
} catch(e: LicensingException)
            

        Updates for KMP build        
        {
AbResponseHandler.sendJspTagLicensingRedirect(this.pageContext, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY
}
 catch(e: Exception)
            

        Updates for KMP build        
        {
AbResponseHandler.sendJspTagRedirect(this.pageContext, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY
}

}


}
                
            

