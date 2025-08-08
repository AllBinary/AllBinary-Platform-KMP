
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.lang.reflect.Method
import javax.servlet.http.HttpServletRequest
import javax.servlet.jsp.JspTagException
import admin.taghelpers.TagHelperFactoryInterface
import org.allbinary.logic.communication.http.request.AbResponseHandler
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.security.licensing.LicensingException
import org.allbinary.string.CommonStrings

open public class ModifyTag : HelperTag {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            
public constructor        (tagHelperFactoryInterface: TagHelperFactoryInterface)                        

                            : super(tagHelperFactoryInterface){

                    var tagHelperFactoryInterface = tagHelperFactoryInterface


                            //For kotlin this is before the body of the constructor.
                    

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
}


                @Throws(LicensingException::class)
            
open fun insert()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var helperClass: KClass<*> = this.getHelper()!!.::class!!
            


    var method: Method = helperClass!!.getMethod(
                            "insert", 
                            null)!!
            


    var result: String = method.invoke(this.getHelper(), 
                            null) as String




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            {
    var error: String = "Failed to insert"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "insert()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


                @Throws(LicensingException::class)
            
open fun delete()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var helperClass: KClass<*> = this.getHelper()!!.::class!!
            


    var method: Method = helperClass!!.getMethod(commonStrings!!.delete, 
                            null)!!
            


    var result: String = method.invoke(this.getHelper(), 
                            null) as String




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            {
    var error: String = "Failed to delete"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "delete()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


                @Throws(LicensingException::class)
            
open fun update()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var helperClass: KClass<*> = this.getHelper()!!.::class!!
            


    var method: Method = helperClass!!.getMethod(
                            "update", 
                            null)!!
            


    var result: String = method.invoke(this.getHelper(), 
                            null) as String




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            {
    var error: String = "Failed to update"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "update()", e)

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
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    
    var request: HttpServletRequest = this.pageContext!!.getRequest() as HttpServletRequest


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "Command: ")
stringBuffer!!.append(this.getCommand())
stringBuffer!!.append(
                            " Request URI: ")
stringBuffer!!.append(request.getRequestURI())
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "doStartTag()")

                                    }
                                

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    
                                    }
                                

    
                        if(this.getCommand() != 
                                    null
                                )
                        
                                    {
                                    this.setHelper()

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            


    
                        if(this.getCommand()!!.compareTo(commonStrings!!.INSERT) == 0)
                        
                                    {
                                    
    var output: String = this.insert()!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGEXTRAOUTPUT))
                        
                                    {
                                    this.pageContext!!.getOut()!!.print(output +"<br />")

                                    }
                                

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(commonStrings!!.DELETE) == 0)
                        
                                    {
                                    
    var output: String = this.delete()!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGEXTRAOUTPUT))
                        
                                    {
                                    this.pageContext!!.getOut()!!.print(output +"<br />")

                                    }
                                

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(commonStrings!!.UPDATE) == 0)
                        
                                    {
                                    
    var output: String = this.update()!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGEXTRAOUTPUT))
                        
                                    {
                                    this.pageContext!!.getOut()!!.print(output +"<br />")

                                    }
                                

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.EVAL_BODY_INCLUDE
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
                
            

