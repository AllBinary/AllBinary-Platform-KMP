
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
import admin.taghelpers.BasicTextEmailHelperFactory
import org.allbinary.logic.communication.http.request.AbResponseHandler
import org.allbinary.logic.communication.log.LogUtil
import tags.CustomTagSupport

open public class BasicTextEmailTag : CustomTagSupport {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var subject: String

    private var body: String
public constructor (){
}


    open fun setSubject(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.subject= value
}


    open fun setBody(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.body= value
}


    open fun send()
        //nullable = true from not(false or (false and true)) = true
: String{

        try {
            
    var propertiesHashMap: HashMap<Any, Any> = HashMap<Any, Any>()

propertiesHashMap!!.put("Subject", this.subject)
propertiesHashMap!!.put("Body", this.body)

    var anyType: Any = BasicTextEmailHelperFactory().
                            getInstance(propertiesHashMap, this.pageContext)!!


    var method: Method = anyType!!::class.getMethod("send", 
                            null)!!

method.invoke(anyType, 
                            null)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Email Sent"
} catch(e: Exception)
            {

    var error: String = "Failed to Send Email."


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "send()", e)

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
            this.pageContext!!.getOut()!!.print(this.send())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY
} catch(e: Exception)
            {
AbResponseHandler.sendJspTagRedirect(this.pageContext, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY
}

}


}
                
            

