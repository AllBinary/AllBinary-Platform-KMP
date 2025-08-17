
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
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.lang.reflect.Method
import java.util.HashMap
import java.util.Vector
import javax.servlet.http.HttpServletRequest
import javax.servlet.jsp.JspTagException
import javax.servlet.jsp.tagext.TagSupport
import admin.taghelpers.AuthenticationHelperFactory
import admin.taghelpers.AuthenticationRequestHelperFactory
import org.allbinary.logic.communication.http.request.AbResponseHandler
import org.allbinary.logic.communication.http.request.session.WeblisketSessionData
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.system.security.licensing.LicensingException
import tags.CustomTagSupport

open public class AuthenticationTag : CustomTagSupport {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var command: String

    private var userName: String

    private var password: String

    private var newPassword: String

    private var roles: Vector

    private var propertiesHashMap: HashMap<Any, Any>
public constructor        (){
    var stringUtil: StringUtil = StringUtil.getInstance()!!
            

this.userName= stringUtil!!.EMPTY_STRING
this.password= stringUtil!!.EMPTY_STRING
}


open fun setCommand(command: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var command = command
this.command= command
}


open fun setUserName(userName: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var userName = userName
this.userName= userName
}


open fun setPassword(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.password= value
}


open fun setNewPassword(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.newPassword= value
}


open fun setRoles(values: Vector)
        //nullable = true from not(false or (false and false)) = true
{

                    var values = values
this.roles= values
}


                @Throws(LicensingException::class)
            
open fun changePassword()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var anyType: Any = AuthenticationRequestHelperFactory().
                            getInstance(this.propertiesHashMap, this.pageContext)!!
            


    var addressHelperClass: KClass<*> = anyType!!::class!!
            


    var method: Method = addressHelperClass!!.getMethod("changePassword", 
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
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "changePassword()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


                @Throws(LicensingException::class)
            
open fun newPassword()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var anyType: Any = AuthenticationRequestHelperFactory().
                            getInstance(this.propertiesHashMap, this.pageContext)!!
            


    var addressHelperClass: KClass<*> = anyType!!::class!!
            


    var method: Method = addressHelperClass!!.getMethod("newPassword", 
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
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "newPassword()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


                @Throws(LicensingException::class)
            
open fun invalidateSession()
        //nullable = true from not(false or (false and true)) = true
: Int{
        try {
            
    var anyType: Any = AuthenticationHelperFactory().
                            getInstance(this.propertiesHashMap, this.pageContext)!!
            


    var addressHelperClass: KClass<*> = anyType!!::class!!
            


    var method: Method = addressHelperClass!!.getMethod("invalidateSession", 
                            null)!!
            


    var resultInteger: Integer = method.invoke(anyType, 
                            null) as Integer




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return resultInteger!!.toInt()
} catch(e: LicensingException)
            {


                            throw e
}
 catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "invalidateSession()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TagSupport.SKIP_BODY
}

}


                @Throws(LicensingException::class)
            
open fun isSessionOld()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var anyType: Any = AuthenticationHelperFactory().
                            getInstance(this.propertiesHashMap, this.pageContext)!!
            


    var helperClass: KClass<*> = anyType!!::class!!
            


    var method: Method = helperClass!!.getMethod("isSessionOld", 
                            null)!!
            


    var resultBoolean: Boolean = method.invoke(anyType, 
                            null) as Boolean




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return resultBoolean
} catch(e: LicensingException)
            {


                            throw e
}
 catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "isSessionOld()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


                @Throws(LicensingException::class)
            
open fun isRoleValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var anyType: Any = AuthenticationRequestHelperFactory().
                            getInstance(this.propertiesHashMap, this.pageContext)!!
            


    var addressHelperClass: KClass<*> = anyType!!::class!!
            


    var methodParams: Array<KClass<*>?> = arrayOf(this.userName!!.::class, ,this.password.::class, ,this.roles.::class)


    var method: Method = addressHelperClass!!.getMethod("isRoleValid", methodParams)!!
            


    var methodArgs: Array<Any?> = arrayOf(this.userName,this.password,this.roles)


    var resultBoolean: Boolean = method.invoke(anyType, methodArgs) as Boolean




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return resultBoolean
} catch(e: LicensingException)
            {


                            throw e
}
 catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "isRoleValid()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


                @Throws(LicensingException::class)
            
open fun validRole()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var anyType: Any = AuthenticationHelperFactory().
                            getInstance(this.propertiesHashMap, this.pageContext)!!
            


    var addressHelperClass: KClass<*> = anyType!!::class!!
            


    var method: Method = addressHelperClass!!.getMethod("validRole", 
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
    var error: String = "Failed to set valid role"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "validRole()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


                @Throws(LicensingException::class)
            
open fun invalidRole()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var anyType: Any = AuthenticationHelperFactory().
                            getInstance(this.propertiesHashMap, this.pageContext)!!
            


    var addressHelperClass: KClass<*> = anyType!!::class!!
            


    var method: Method = addressHelperClass!!.getMethod("invalidRole", 
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
    var error: String = "Failed to set role invalid"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "invalidRole()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


                @Throws(LicensingException::class)
            
open fun isAuthenticationSessionValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var anyType: Any = AuthenticationHelperFactory().
                            getInstance(this.propertiesHashMap, this.pageContext)!!
            


    var addressHelperClass: KClass<*> = anyType!!::class!!
            


    var methodParams: Array<KClass<*>?> = arrayOf(this.roles.::class)


    var method: Method = addressHelperClass!!.getMethod("isAuthenticationSessionValid", methodParams)!!
            


    var methodArgs: Array<Any?> = arrayOf(this.roles)


    var resultBoolean: Boolean = method.invoke(anyType, methodArgs) as Boolean




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return resultBoolean
} catch(e: LicensingException)
            {


                            throw e
}
 catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "isAuthenticationSessionValid()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


                @Throws(LicensingException::class)
            
open fun processIfNewLogin()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var anyType: Any = AuthenticationHelperFactory().
                            getInstance(this.propertiesHashMap, this.pageContext)!!
            


    var helperClass: KClass<*> = anyType!!::class!!
            


    var methodParams: Array<KClass<*>?> = arrayOf(this.userName!!.::class, ,this.password.::class)


    var method: Method = helperClass!!.getMethod("processIfNewLogin", methodParams)!!
            


    var methodArgs: Array<Any?> = arrayOf(this.userName,this.password)


    var resultBoolean: Boolean = method.invoke(anyType, methodArgs) as Boolean




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return resultBoolean
} catch(e: LicensingException)
            {


                            throw e
}
 catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "processIfNewLogin()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


                @Throws(LicensingException::class)
            
open fun processInvalidation()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var anyType: Any = AuthenticationHelperFactory().
                            getInstance(this.propertiesHashMap, this.pageContext)!!
            


    var addressHelperClass: KClass<*> = anyType!!::class!!
            


    var method: Method = addressHelperClass!!.getMethod("processInvalidation", 
                            null)!!
            


    var resultBoolean: Boolean = method.invoke(anyType, 
                            null) as Boolean




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return resultBoolean
} catch(e: LicensingException)
            {


                            throw e
}
 catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "isSetToInvalidate()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


                @Throws(JspTagException::class)
            
open fun doStartTag()
        //nullable = true from not(false or (false and true)) = true
: Int{
        try {
            
    var stringUtil: StringUtil = StringUtil.getInstance()!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    
    var request: HttpServletRequest = this.pageContext!!.getRequest() as HttpServletRequest


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(" Request URI: ")
stringBuffer!!.append(request.getRequestURI())
logUtil!!.put(stringBuffer!!.toString(), this, "doStartTag()")

                                    }
                                

    
                        if(command != 
                                    null
                                )
                        
                                    {
                                    this.propertiesHashMap= HashMap<Any, Any>()

    
                        if(command.compareTo(org.allbinary.globals.GLOBALS2.NEWPASSWORD) == 0)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put("New Password", this, "doStartTag()")

                                    }
                                

    
                        if(!this.newPassword())
                        
                                    {
                                    pageContext!!.getOut()!!.print("New Password Request Failed.<p/>")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return EVAL_BODY_INCLUDE

                                    }
                                
                        else {
                            pageContext!!.getOut()!!.print("New Password Was Sent.<p/>")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY

                        }
                            

                                    }
                                
                             else 
    
                        if(command.compareTo(org.allbinary.globals.GLOBALS2.CHANGEPASSWORD) == 0)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put("Change Password", this, "doStartTag()")

                                    }
                                

    
                        if(!this.changePassword())
                        
                                    {
                                    pageContext!!.getOut()!!.print("Password Change Attempt Failed.<p/>")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return EVAL_BODY_INCLUDE

                                    }
                                
                        else {
                            pageContext!!.getOut()!!.print("Password Changed Successfully.<p/>")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY

                        }
                            

                                    }
                                
                             else 
    
                        if(command.compareTo(WeblisketSessionData.INVALIDATESESSION) == 0)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put("INVALIDATESESSION", this, "doStartTag()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.invalidateSession()

                                    }
                                
                        else {
                            
    
                        if(this.isSessionOld())
                        
                                    {
                                    
    
                        if(this.processInvalidation())
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put("Processing Invalidation", this, "doStartTag()")

                                    }
                                
pageContext!!.getOut()!!.print("Please login again.<p>")

    
                        if(command.compareTo(org.allbinary.globals.GLOBALS2.PROCESSBODYIFAUTHENTICATED) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TagSupport.SKIP_BODY

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TagSupport.EVAL_BODY_INCLUDE

                        }
                            

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put("Preparing session for invalidation", this, "doStartTag()")

                                    }
                                

    
                        if(command.compareTo(org.allbinary.globals.GLOBALS2.PROCESSBODYIFAUTHENTICATED) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TagSupport.SKIP_BODY

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TagSupport.EVAL_BODY_INCLUDE

                        }
                            

                        }
                            

                                    }
                                

    
                        if((userName == 
                                    null
                                 || userName!!.compareTo(stringUtil!!.EMPTY_STRING) == 0) && (password == 
                                    null
                                 || password.compareTo(stringUtil!!.EMPTY_STRING) == 0) && this.roles != 
                                    null
                                 && this.isAuthenticationSessionValid())
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put("Authenticated session is valid", this, "doStartTag()")

                                    }
                                

    
                        if(command.compareTo(org.allbinary.globals.GLOBALS2.PROCESSBODYIFAUTHENTICATED) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TagSupport.EVAL_BODY_INCLUDE

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TagSupport.SKIP_BODY

                        }
                            

                                    }
                                

    
                        if(this.userName != 
                                    null
                                 && this.password != 
                                    null
                                 && this.processIfNewLogin())
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put("Processing new login.", this, "doStartTag()")

                                    }
                                

    
                        if(this.isRoleValid())
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put("Role is valid - Processing new login", this, "doStartTag()")

                                    }
                                
pageContext!!.getOut()!!.print(validRole())

    
                        if(command.compareTo(org.allbinary.globals.GLOBALS2.PROCESSBODYIFAUTHENTICATED) == 0)
                        
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
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put("Role is not valid - Processing new login", this, "doStartTag()")

                                    }
                                
pageContext!!.getOut()!!.print(invalidRole())

    
                        if(command.compareTo(org.allbinary.globals.GLOBALS2.PROCESSBODYIFAUTHENTICATED) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return EVAL_BODY_INCLUDE

                        }
                            

                        }
                            

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put("Invalid Login", this, "doStartTag()")

                                    }
                                

    
                        if(userName != 
                                    null
                                 && userName!!.compareTo(stringUtil!!.EMPTY_STRING) != 0 && password != 
                                    null
                                 && password.compareTo(stringUtil!!.EMPTY_STRING) != 0)
                        
                                    {
                                    pageContext!!.getOut()!!.print("Sorry your username and/or password is invalid.<p/>")

                                    }
                                

                        }
                            

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put("Major authentication error - userName: " +this.userName +" Password: " +this.password +" Command: " +this.command, this, "doStartTag()")

                                    }
                                

    
                        if(command.compareTo(org.allbinary.globals.GLOBALS2.PROCESSBODYIFAUTHENTICATED) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TagSupport.SKIP_BODY

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TagSupport.EVAL_BODY_INCLUDE

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
                
            

