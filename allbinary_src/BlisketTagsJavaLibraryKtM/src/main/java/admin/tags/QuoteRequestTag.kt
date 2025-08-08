
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.lang.reflect.Method
import javax.servlet.jsp.JspTagException
import admin.taghelpers.QuoteHelperFactory
import admin.taghelpers.QuoteRequestHelperFactory
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.logic.communication.http.request.AbResponseHandler
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.security.licensing.LicensingException

open public class QuoteRequestTag : TableTag {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var storeName: String
public constructor        (){this.setTagHelperFactory(QuoteHelperFactory())
this.setTagRequestHelperFactory(QuoteRequestHelperFactory())
}


open fun setStoreName(storeName: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var storeName = storeName
this.storeName= storeName
}


                @Throws(LicensingException::class)
            
open fun email()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var anyType: Any = QuoteHelperFactory().
                            getInstance(this.getPropertiesHashMap(), pageContext)!!
            


    var helperClass: KClass<*> = anyType!!::class!!
            


    var method: Method = helperClass!!.getMethod(
                            "email", 
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
    var error: String = "Failed to send QuoteRequest emails"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "sendEmail()", e)

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
            
    
                        if(this.getCommand() != 
                                    null
                                )
                        
                                    {
                                    this.getPropertiesHashMap()!!.put(StoreFrontData.getInstance()!!.NAME, this.storeName)

    
                        if(this.getCommand()!!.compareTo(
                            "EMAIL") == 0)
                        
                                    {
                                    this.email()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.EVAL_BODY_INCLUDE

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.doStartTag()

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
                
            

