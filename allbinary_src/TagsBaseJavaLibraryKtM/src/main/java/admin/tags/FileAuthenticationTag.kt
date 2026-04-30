
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
        
import java.util.Calendar
import java.util.Vector
import javax.servlet.http.HttpServletRequest
import javax.servlet.jsp.JspTagException
import javax.servlet.jsp.tagext.TagSupport
import org.allbinary.business.init.InstallerInfo
import org.allbinary.business.user.role.BasicUserRole
import org.allbinary.business.user.role.BasicUserRoleFactory
import org.allbinary.logic.communication.http.request.AbResponseHandler
import org.allbinary.logic.communication.http.request.session.BasicWeblisketSession
import org.allbinary.logic.communication.http.request.session.WeblisketSessionData
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.java.bool.BooleanFactory
import org.allbinary.logic.java.bool.BooleanUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.system.security.licensing.LicensingException
import tags.CustomTagSupport

open public class FileAuthenticationTag : CustomTagSupport {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var attemptsInteger: Integer

    private var weblisketSession: BasicWeblisketSession

    private var request: HttpServletRequest

    private var command: String

    private var userName: String

    private var password: String

    private var newPassword: String

    private var authenticated: String

    private var sessionUserName: String

    private var role: BasicUserRole

    private var timeout: String

    private var roles: Vector
public constructor (){
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


    open fun makeSessionValid(storedRole: BasicUserRole, userName: String)
        //nullable = true from not(false or (false and false)) = true
{
var storedRole = storedRole
var userName = userName
this.weblisketSession!!.setAuthenticated()
this.weblisketSession!!.setRole(storedRole)
this.weblisketSession!!.setUserName(userName)
this.request.removeAttribute(WeblisketSessionData.REMOVABLEUSERNAME)
this.request.removeAttribute(WeblisketSessionData.REMOVABLEPASSWORD)
}


    open fun getFormData()
        //nullable = true from not(false or (false and true)) = true
{
this.authenticated= this.weblisketSession!!.getAuthentication()
this.sessionUserName= this.weblisketSession!!.getUserName()
this.role= this.weblisketSession!!.getRole()
this.attemptsInteger= this.weblisketSession!!.getAttempts()
this.timeout= this.weblisketSession!!.getTimeout()
}


    open fun nextAttempt()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(this.attemptsInteger != 
                                    null
                                 && this.attemptsInteger!!.toInt() > 0)
                        
                                    {
                                    this.weblisketSession!!.setAttempts(Integer(this.attemptsInteger!!.toInt() +1))

                                    }
                                
                        else {
                            this.weblisketSession!!.setAttempts(Integer(1))

                        }
                            
}


                @Throws(LicensingException::class)
            
    open fun changePassword()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

        try {
            
    var userName: String = this.request.getParameter(WeblisketSessionData.REMOVABLEUSERNAME)!!


    var password: String = this.request.getParameter(WeblisketSessionData.REMOVABLEPASSWORD)!!


    var newPassword: String = this.request.getParameter(WeblisketSessionData.REMOVABLENEWPASSWORD)!!


    var newReenteredPassword: String = this.request.getParameter(WeblisketSessionData.REMOVABLEREENTERNEWPASSWORD)!!


    
                        if(newPassword!!.compareTo(newReenteredPassword) != 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                

    var installerInfo: InstallerInfo = InstallerInfo()


    
                        if(installerInfo!!.isValid(userName, password))
                        
                                    {
                                    installerInfo!!.setPassword(newPassword)
installerInfo!!.write()
this.weblisketSession!!.setUserName(userName)
this.weblisketSession!!.setPassword(newPassword)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
} catch(e: LicensingException)
            {



                            throw e
}
 catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGERROR))
                        
                                    {
                                    this.logUtil!!.put(commonStrings!!.EXCEPTION, this, "invalidateSession()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


    open fun invalidateSession()
        //nullable = true from not(false or (false and true)) = true
: Int{

        try {
            this.weblisketSession!!.clear()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Integer(TagSupport.EVAL_BODY_INCLUDE).
                            toInt()
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGERROR))
                        
                                    {
                                    this.logUtil!!.put(commonStrings!!.EXCEPTION, this, "invalidateSession()", e)

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
            
    
                        if(this.role != 
                                    null
                                )
                        
                                    {
                                    
    var timeCreated: Long = this.weblisketSession!!.getCreationTime()!!


    var sessionTimout: Long = this.role.getSessionTimeout()!!


    var calendar: Calendar = Calendar.getInstance()!!


    var timeFirst: Long = calendar.getTimeInMillis() -sessionTimout


    
                        if(timeFirst > timeCreated)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.AUTHENTICATION))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Session Is Old - Timeout: ")
stringBuffer!!.appendlong(sessionTimout)
stringBuffer!!.append(" Eval: ")
stringBuffer!!.appendlong(timeFirst)
stringBuffer!!.append(" > ")
stringBuffer!!.appendlong(timeCreated)
this.logUtil!!.putF(stringBuffer!!.toString(), this, "isSessionOld()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE.

                                    }
                                

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.AUTHENTICATION))
                        
                                    {
                                    this.logUtil!!.putF("Role Is Not In Session", this, "isSessionOld()")

                                    }
                                

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.isRarelyUsedSession()
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGERROR))
                        
                                    {
                                    this.logUtil!!.put(commonStrings!!.EXCEPTION, this, "isSessionOld()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


    open fun isRarelyUsedSession()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

    
                        if(this.role != 
                                    null
                                )
                        
                                    {
                                    
    var timeCreated: Long = this.weblisketSession!!.getCreationTime()!!


    var lastAccess: Long = this.weblisketSession!!.getLastAccessedTime()!!


    var timePassed: Long = this.role.getSessionInactivityTimeout()!!


    var calendar: Calendar = Calendar.getInstance()!!


    var timeFirst: Long = calendar.getTimeInMillis() -lastAccess


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.AUTHENTICATION))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Session Is Rarely Used - Timeout: ")
stringBuffer!!.appendlong(lastAccess)
stringBuffer!!.append(" Eval: ")
stringBuffer!!.appendlong(timeFirst)
stringBuffer!!.append(" > ")
stringBuffer!!.appendlong(timePassed)
this.logUtil!!.putF(stringBuffer!!.toString(), this, "isRarelyUsedSession()")

                                    }
                                

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.AUTHENTICATION))
                        
                                    {
                                    this.logUtil!!.putF("Role Is Not In Session", this, "isRarelyUsedSession()")

                                    }
                                

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}


                @Throws(LicensingException::class)
            
    open fun isRoleValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

        try {
            this.makeSessionValid(BasicUserRoleFactory.getInstance()!!.INSTALLER, userName)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE.
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGERROR))
                        
                                    {
                                    this.logUtil!!.put(commonStrings!!.EXCEPTION, this, "isRoleValid()", e)

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
            
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Trying New login<p>")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
} catch(e: Exception)
            {

    var error: String = "Failed to set valid role"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGERROR))
                        
                                    {
                                    this.logUtil!!.put(commonStrings!!.EXCEPTION, this, "validRole()", e)

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
            this.weblisketSession!!.setAuthenticated(false)

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Sorry your username and password is invalid on this page.")
stringBuffer!!.append("Trying New login<p>")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
} catch(e: Exception)
            {

    var error: String = "Failed to set role invalid"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGERROR))
                        
                                    {
                                    this.logUtil!!.put(commonStrings!!.EXCEPTION, this, "invalidRole()", e)

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
            
    
                        if(BooleanUtil.getInstance()!!.getFromString(this.authenticated))
                        
                                    {
                                    
    var size: Int = this.roles.size!!





                        for (index in 0 until size)

        {

    var mustBeOfRole: BasicUserRole = this.roles.get(index) as BasicUserRole


    
                        if(this.sessionUserName != 
                                    null
                                 && this.role.equals(mustBeOfRole))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE.

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE.

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE.
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGERROR))
                        
                                    {
                                    this.logUtil!!.put(commonStrings!!.EXCEPTION, this, "isAuthenticationSessionValid()", e)

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
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERERROR))
                        
                                    {
                                    this.logUtil!!.putF("Starting for User: " +this.userName +" Attempt: " +this.weblisketSession!!.getAttempts(), this, "processIfNewLogin()")

                                    }
                                

    
                        if(this.userName != 
                                    null
                                 && this.userName!!.compareTo(StringUtil.getInstance()!!.EMPTY_STRING) != 0 && this.password != 
                                    null
                                 && this.password.compareTo(StringUtil.getInstance()!!.EMPTY_STRING) != 0)
                        
                                    {
                                    
    var login: String


    var installerInfo: InstallerInfo = InstallerInfo()


    
                        if(installerInfo!!.isValid(this.userName, this.password))
                        
                                    {
                                    login= org.allbinary.globals.GLOBALS2.LOGINSUCCESS

                                    }
                                
                        else {
                            login= org.allbinary.globals.GLOBALS2.LOGINFAILED

                        }
                            

    
                        if(login.compareTo(org.allbinary.globals.GLOBALS2.LOGINSUCCESS) == 0)
                        
                                    {
                                    this.weblisketSession!!.setAttempts(Integer(0))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE.

                                    }
                                
this.nextAttempt()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE.

                                    }
                                
this.nextAttempt()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE.
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGERROR))
                        
                                    {
                                    this.logUtil!!.put(commonStrings!!.EXCEPTION, this, "processIfNewLogin()", e)

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
            
    
                        if(BooleanUtil.getInstance()!!.getFromString(this.timeout))
                        
                                    {
                                    this.invalidateSession()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE.

                                    }
                                


                            {
                            this.weblisketSession!!.setTimeout(BooleanFactory.getInstance()!!.TRUE_STRING)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE.

                            }
                    
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGERROR))
                        
                                    {
                                    this.logUtil!!.put(commonStrings!!.EXCEPTION, this, "isSetToInvalidate()", e)

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

this.request= pageContext!!.getRequest() as HttpServletRequest
this.weblisketSession= BasicWeblisketSession(pageContext)
this.getFormData()

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    this.logUtil!!.putF("Started", this, tagStrings!!.DO_START_TAG)

                                    }
                                

    
                        if(this.command != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(this.command.compareTo(org.allbinary.globals.GLOBALS2.CHANGEPASSWORD) == 0)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    this.logUtil!!.putF("Change Password", this, tagStrings!!.DO_START_TAG)

                                    }
                                

    
                        if(!this.changePassword())
                        
                                    {
                                    pageContext!!.getOut()!!.print("Password Change Attempt Failed.<p>")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return EVAL_BODY_INCLUDE

                                    }
                                
                        else {
                            pageContext!!.getOut()!!.print("Password Changed Successfully.<p>")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY

                        }
                            

                                    }
                                
                             else 
    
                        if(this.command.compareTo(WeblisketSessionData.INVALIDATESESSION) == 0)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    this.logUtil!!.putF("INVALIDATESESSION", this, tagStrings!!.DO_START_TAG)

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
                                    this.logUtil!!.putF("Processing Invalidation", this, tagStrings!!.DO_START_TAG)

                                    }
                                
pageContext!!.getOut()!!.print("Please login again.<p>")

    
                        if(this.command.compareTo(org.allbinary.globals.GLOBALS2.PROCESSBODYIFAUTHENTICATED) == 0)
                        
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
                                    this.logUtil!!.putF("Preparing session for invalidation", this, tagStrings!!.DO_START_TAG)

                                    }
                                

    
                        if(this.command.compareTo(org.allbinary.globals.GLOBALS2.PROCESSBODYIFAUTHENTICATED) == 0)
                        
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
                                

    
                        if((this.userName == 
                                    null
                                 || this.userName!!.compareTo(stringUtil!!.EMPTY_STRING) == 0) && (this.password == 
                                    null
                                 || this.password.compareTo(stringUtil!!.EMPTY_STRING) == 0) && this.roles != 
                                    null
                                 && this.isAuthenticationSessionValid())
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    this.logUtil!!.putF("Authenticated session is valid", this, tagStrings!!.DO_START_TAG)

                                    }
                                

    
                        if(this.command.compareTo(org.allbinary.globals.GLOBALS2.PROCESSBODYIFAUTHENTICATED) == 0)
                        
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
                                    this.logUtil!!.putF("Processing new login.", this, tagStrings!!.DO_START_TAG)

                                    }
                                

    
                        if(this.isRoleValid())
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    this.logUtil!!.putF("Role is valid - Processing new login", this, tagStrings!!.DO_START_TAG)

                                    }
                                
pageContext!!.getOut()!!.print(validRole())

    
                        if(this.command.compareTo(org.allbinary.globals.GLOBALS2.PROCESSBODYIFAUTHENTICATED) == 0)
                        
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
                                    this.logUtil!!.putF("Role is not valid - Processing new login", this, tagStrings!!.DO_START_TAG)

                                    }
                                
pageContext!!.getOut()!!.print(invalidRole())

    
                        if(this.command.compareTo(org.allbinary.globals.GLOBALS2.PROCESSBODYIFAUTHENTICATED) == 0)
                        
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
                                    this.logUtil!!.putF("Invalid Login", this, tagStrings!!.DO_START_TAG)

                                    }
                                

    
                        if(this.userName != 
                                    null
                                 && this.userName!!.compareTo(StringUtil.getInstance()!!.EMPTY_STRING) != 0 && this.password != 
                                    null
                                 && this.password.compareTo(StringUtil.getInstance()!!.EMPTY_STRING) != 0)
                        
                                    {
                                    pageContext!!.getOut()!!.print("Sorry your username and/or password is invalid.<p>")

                                    }
                                

                        }
                            

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Major authentication error - userName: ")
stringBuffer!!.append(this.userName)
stringBuffer!!.append(" Password: ")
stringBuffer!!.append(this.password)
stringBuffer!!.append(" Command: ")
stringBuffer!!.append(this.command)
this.logUtil!!.putF(stringBuffer!!.toString(), this, tagStrings!!.DO_START_TAG)

                                    }
                                

    
                        if(this.command.compareTo(org.allbinary.globals.GLOBALS2.PROCESSBODYIFAUTHENTICATED) == 0)
                        
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
            {
AbResponseHandler.sendJspTagLicensingRedirect(this.pageContext, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY
}
 catch(e: Exception)
            {
AbResponseHandler.sendJspTagRedirect(this.pageContext, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY
}

}


}
                
            

