
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
        package tags




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.lang.reflect.Method
import javax.servlet.http.HttpServletRequest
import javax.servlet.jsp.JspTagException
import org.allbinary.logic.communication.http.request.AbResponseHandler
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.security.licensing.LicensingException
import taghelpers.ValidatedViewHelperFactory

open public class ValidationTransformTag : TransformTag {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var xslFile: String

    private var logic: Boolean
public constructor        ()                        

                            : super(ValidatedViewHelperFactory()){

                            //For kotlin this is before the body of the constructor.
                    
this.logic= true
}


open fun setXsl(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.xslFile= value
this.setTemplateFile(this.xslFile)
}


open fun setLogic(logic: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var logic = logic
this.logic= logic
}


                @Throws(Exception::class)
            
open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var helperClass: KClass<*> = this.getHelper()!!.::class!!
            


    var method: Method = helperClass!!.getMethod(commonStrings!!.IS_VALID, 
                            null)!!
            


    var result: Boolean = method.invoke(this.getHelper(), 
                            null) as Boolean




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.IS_VALID, e)

                                    }
                                



                            throw e
}

}


                @Throws(Exception::class)
            
open fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var addressHelperClass: KClass<*> = this.getHelper()!!.::class!!
            


    var method: Method = addressHelperClass!!.getMethod(
                            "validationInfo", 
                            null)!!
            


    var result: String = method.invoke(this.getHelper(), 
                            null) as String




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "validationInfo()", e)

                                    }
                                



                            throw e
}

}


                @Throws(JspTagException::class)
            
open fun doStartTag()
        //nullable = true from not(false or (false and true)) = true
: Int{
        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()


    var request: HttpServletRequest = this.pageContext!!.getRequest() as HttpServletRequest

stringBuffer!!.append(
                            "ValidationViewTag Start For: ")
stringBuffer!!.append(this.getName())
stringBuffer!!.append(
                            "\nView FIle: ")
stringBuffer!!.append(this.getObjectFile())
stringBuffer!!.append(
                            "\nRequest URI: ")
stringBuffer!!.append(request.getRequestURI())
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "doStartTag")

                                    }
                                
this.setHelper()

    
                        if(this.isValid())
                        
                                    {
                                    super.doStartTag()

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "View File: ")
stringBuffer!!.append(this.getObjectFile())
stringBuffer!!.append(
                            "\nLogic includes body if true=")
stringBuffer!!.append(this.logic)
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "doStartTag")

                                    }
                                

    
                        if(this.logic)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return EVAL_BODY_INCLUDE

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY

                        }
                            

                                    }
                                
                        else {
                            pageContext!!.getOut()!!.print(this.validationInfo())

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "View File: ")
stringBuffer!!.append(this.getObjectFile())
stringBuffer!!.append(
                            "\nisValid()=false")
stringBuffer!!.append(
                            "\nLogic skips body if true=")
stringBuffer!!.append(this.logic)
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "doStartTag")

                                    }
                                

    
                        if(this.logic)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return EVAL_BODY_INCLUDE

                        }
                            

                        }
                            
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


open fun doEndTag()
        //nullable = true from not(false or (false and true)) = true
: Int{
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put(
                            "Tag Ended", this, 
                            "doEndTag")

                                    }
                                
this.logic= true



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.doEndTag()
}


}
                
            

