
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
import admin.taghelpers.ShippingAddressHelperFactory
import org.allbinary.business.user.address.ShippingAddressData
import org.allbinary.logic.communication.http.request.AbResponseHandler
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.security.licensing.LicensingException

open public class ShippingAddressTag : TableTag {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var value: String
public constructor        (){this.setTagHelperFactory(ShippingAddressHelperFactory())
this.setTagRequestHelperFactory(ShippingAddressHelperFactory())
}


open fun setValue(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.value= value
}


                @Throws(LicensingException::class)
            
open fun set()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var anyType: Any = ShippingAddressHelperFactory().
                            getInstance(this.getPropertiesHashMap(), this.pageContext)!!
            


    var addressHelperClass: KClass<*> = anyType!!::class!!
            


    var method: Method = addressHelperClass!!.getMethod("set", 
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
    var error: String = "Failed to set Shipping Address"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "set()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


                @Throws(LicensingException::class)
            
open fun setToBillingAddress()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var anyType: Any = ShippingAddressHelperFactory().
                            getInstance(this.getPropertiesHashMap(), this.pageContext)!!
            


    var addressHelperClass: KClass<*> = anyType!!::class!!
            


    var method: Method = addressHelperClass!!.getMethod("setToBillingAddress", 
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
    var error: String = "Failed Setting Shipping address to Billing Address"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "setShippingAddressToBillingAddress()", e)

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
                                    
    
                        if(this.getCommand()!!.compareTo(ShippingAddressData.SELECT) == 0)
                        
                                    {
                                    set()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.EVAL_BODY_INCLUDE

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(ShippingAddressData.SETTOBILLINGADDRESS) == 0)
                        
                                    {
                                    setToBillingAddress()

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
                
            

