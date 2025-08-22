
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
import javax.servlet.jsp.tagext.TagSupport
import admin.taghelpers.StoreFrontsHelperFactory
import admin.taghelpers.StoreFrontsRequestHelperFactory
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.logic.communication.http.request.AbResponseHandler
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.security.licensing.LicensingException

open public class StoreFrontsTag : TableTag {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
public constructor        (){this.setTagHelperFactory(StoreFrontsHelperFactory())
this.setTagRequestHelperFactory(StoreFrontsRequestHelperFactory())
}


                @Throws(LicensingException::class)
            
open fun generateSelect()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var anyType: Any = this.getTagHelperFactoryInterface()!!.getInstance(this.getPropertiesHashMap(), pageContext)!!


    var method: Method = anyType!!::class.getMethod("generateSelect", 
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
    var error: String = "Failed to generate storefronts select"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "generateSelect()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


                @Throws(LicensingException::class)
            
open fun install()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var anyType: Any = this.getTagRequestHelperFactoryInterface()!!.getInstance(this.getPropertiesHashMap(), pageContext)!!


    var method: Method = anyType!!::class.getMethod("install", 
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
    var error: String = "Failed to generate storefronts select"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "generateSelect()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


                @Throws(LicensingException::class)
            
open fun sendStoreCreatedEmails()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var anyType: Any = this.getTagRequestHelperFactoryInterface()!!.getInstance(this.getPropertiesHashMap(), pageContext)!!


    var method: Method = anyType!!::class.getMethod("sendStoreCreatedEmails", 
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
    var error: String = "Failed to send email"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "sendStoreCreatedEmails()", e)

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
                                    
    var storeFrontData: StoreFrontData = StoreFrontData.getInstance()!!


    
                        if(this.getCommand()!!.compareTo(storeFrontData!!.SELECT) == 0)
                        
                                    {
                                    this.pageContext!!.getOut()!!.print(this.generateSelect())

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(storeFrontData!!.INSTALL) == 0)
                        
                                    {
                                    this.getPropertiesHashMap()!!.put("current", this.getCurrent())
this.getPropertiesHashMap()!!.put("total", this.getTotal())

    
                        if(this.getCurrent()!!.toInt() == this.getTotal()!!.toInt())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TagSupport.EVAL_BODY_INCLUDE

                                    }
                                
this.install()

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(storeFrontData!!.INSTALL_COMPLETE) == 0)
                        
                                    {
                                    this.sendStoreCreatedEmails()

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
                
            

