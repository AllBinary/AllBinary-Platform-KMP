
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
import admin.taghelpers.PaymentProcessHelperFactory
import org.allbinary.logic.communication.http.request.AbResponseHandler
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.security.licensing.LicensingException
import tags.StoreValidationTransformTag

open public class PaymentProcessTag : StoreValidationTransformTag {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            
public constructor        (){}


                @Throws(LicensingException::class, Exception::class)
            
open fun process()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var anyType: Any = PaymentProcessHelperFactory().
                            getInstance(this.getPropertiesHashMap(), this.pageContext)!!
            


    var helperClass: KClass<*> = anyType!!::class!!
            


    var method: Method = helperClass!!.getMethod(commonStrings!!.PROCESS, 
                            null)!!
            


    var result: String = method.invoke(anyType, 
                            null) as String




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: LicensingException)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.LICENSINGERROR))
                        
                                    {
                                    logUtil!!.put(
                            "LicensingException", this, commonStrings!!.PROCESS, e)

                                    }
                                



                            throw e
}
 catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.PROCESS, e)

                                    }
                                



                            throw e
}

}


                @Throws(JspTagException::class)
            
open fun doStartTag()
        //nullable = true from not(false or (false and true)) = true
: Int{
        try {
            
    
                        if(this.getCommand()!!.compareTo(org.allbinary.globals.GLOBALS2.AUTHORIZEORDEREVALBODYONERROR) == 0 || this.getCommand()!!.compareTo(org.allbinary.globals.GLOBALS2.AUTHORIZEORDERANDEVALBODY) == 0 || this.getCommand()!!.compareTo(org.allbinary.globals.GLOBALS2.AUTHORIZEFORMEVALBODYONERROR) == 0)
                        
                                    {
                                    this.pageContext!!.getOut()!!.print(this.process() +"<br />")

    
                        if(this.getCommand()!!.compareTo(org.allbinary.globals.GLOBALS2.AUTHORIZEORDEREVALBODYONERROR) == 0)
                        


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.SKIP_BODY
                             else 
    
                        if()
                        

                                    }
                                
                        else {
                            


                            throw Exception(
                            "No Such Payment Processing Command")

                        }
                            
} catch(e: Exception)
            {AbResponseHandler.sendJspTagRedirect(this.pageContext, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY
}

}


}
                
            

