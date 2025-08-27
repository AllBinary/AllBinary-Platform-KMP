
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
        package admin.taghelpers




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Calendar
import java.util.HashMap
import java.util.Vector
import javax.servlet.http.HttpServletRequest
import javax.servlet.jsp.PageContext
import javax.servlet.jsp.tagext.TagSupport
import org.allbinary.business.user.UserInterface
import org.allbinary.business.user.role.BasicUserRole
import org.allbinary.business.user.role.UserRole
import org.allbinary.business.user.role.UserRoleFactory
import org.allbinary.data.tables.user.UserEntityFactory
import org.allbinary.data.tables.user.UserEntityInterface
import org.allbinary.globals.GLOBALS2
import org.allbinary.logic.communication.http.request.session.WeblisketSession
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.java.bool.BooleanFactory
import org.allbinary.logic.java.bool.BooleanUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil

open public class AuthenticationHelper : TagHelper {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var weblisketSession: WeblisketSession

    private var authenticated: String

    private var sessionUserName: String

    private var role: UserRole

    private var timeout: String

    private var attemptsInteger: Integer
public constructor        (hashMap: HashMap<Any, Any>, pageContext: PageContext)                        

                            : this(hashMap, pageContext!!.getRequest() as HttpServletRequest){

                    var hashMap = hashMap


                    var pageContext = pageContext


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (hashMap: HashMap<Any, Any>, httpServletRequest: HttpServletRequest){

                    var hashMap = hashMap


                    var httpServletRequest = httpServletRequest
this.weblisketSession= WeblisketSession(hashMap, httpServletRequest)
this.getFormData()

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.AUTHENTICATION))
                        
                                    {
                                    logUtil!!.put(this.outputSessionInfo(), this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
}


                @Throws(Exception::class)
            
open fun getFormData()
        //nullable = true from not(false or (false and true)) = true
{this.authenticated= this.weblisketSession!!.getAuthentication()
this.sessionUserName= this.weblisketSession!!.getUserName()
this.role= this.weblisketSession!!.getRole()
this.attemptsInteger= this.weblisketSession!!.getAttempts()
this.timeout= this.weblisketSession!!.getTimeout()
}


                @Throws(Exception::class)
            
open fun invalidateSession()
        //nullable = true from not(false or (false and true)) = true
: Integer{
        try {
            this.weblisketSession!!.clear()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Integer(TagSupport.EVAL_BODY_INCLUDE)
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.AUTHENTICATIONERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "invalidateSession()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun isSessionOld()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
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
stringBuffer!!.append(sessionTimout)
stringBuffer!!.append(" Eval: ")
stringBuffer!!.append(timeFirst)
stringBuffer!!.append(" > ")
stringBuffer!!.append(timeCreated)
logUtil!!.put(stringBuffer!!.toString(), this, "isSessionOld()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE

                                    }
                                

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.AUTHENTICATION))
                        
                                    {
                                    logUtil!!.put("Role Is Not In Session", this, "isSessionOld()")

                                    }
                                

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.isRarelyUsedSession()
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


    var inactivityAllowed: Long = role.getSessionInactivityTimeout()!!


    var calendar: Calendar = Calendar.getInstance()!!


    var timeFirst: Long = calendar.getTimeInMillis() -lastAccess


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.AUTHENTICATION))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Session Is Rarely Used - Timeout: ")
stringBuffer!!.append(lastAccess)
stringBuffer!!.append(" Eval: ")
stringBuffer!!.append(timeFirst)
stringBuffer!!.append(" > ")
stringBuffer!!.append(inactivityAllowed)
logUtil!!.put(stringBuffer!!.toString(), this, "isRarelyUsedSession()")

                                    }
                                

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.AUTHENTICATION))
                        
                                    {
                                    logUtil!!.put("Role Is Not In Session", this, "isRarelyUsedSession()")

                                    }
                                

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}


open fun validRole()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Trying New login<p/>")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
} catch(e: Exception)
            {
    var error: String = "Failed to set valid role"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.AUTHENTICATIONERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "validRole()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun invalidRole()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            this.weblisketSession!!.setAuthenticated(false)

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Sorry your username and password is invalid on this page. ")
stringBuffer!!.append("Trying New login<p/>")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
} catch(e: Exception)
            {
    var error: String = "Failed to set role invalid"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.AUTHENTICATIONERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "invalidRole()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


                @Throws(Exception::class)
            
open fun isAuthenticated()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
                        if(BooleanUtil.getInstance()!!.getFromString(authenticated))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


open fun isAuthenticationSessionValid(roles: Vector)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var roles = roles

        try {
            
    
                        if(this.role != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(this.isAuthenticated())
                        
                                    {
                                    
    
                        if(sessionUserName != 
                                    null
                                )
                        
                                    {
                                    
    var basicUserRole: BasicUserRole = role.getBasicUserRole()!!


    var basicUserRoleArray: Array<Any?> = roles.toArray()!!


    var size: Int = basicUserRoleArray!!.size
                





                        for (index in 0 until size)

        {
    var mustBeOfRole: BasicUserRole = basicUserRoleArray[index]!! as BasicUserRole


    
                        if(basicUserRole!!.equals(mustBeOfRole))
                        
                                    {
                                    
    
                        if(basicUserRole!!.equals(UserRoleFactory.getInstance()!!.CUSTOMER))
                        
                                    {
                                    
    var userEntityInterface: UserEntityInterface = UserEntityFactory.getInstance()!!


    var userInterface: UserInterface = userEntityInterface!!.getUser(sessionUserName)!!


    
                        if(!userInterface!!.isSessionValid())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE

                                    }
                                
}


                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.AUTHENTICATION))
                        
                                    {
                                    logUtil!!.put("Role Is Not In Session", this, "isAuthenticationSessionValid()")

                                    }
                                

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.AUTHENTICATIONERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "isAuthenticatedSessionValid()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


open fun nextAttempt()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(attemptsInteger != 
                                    null
                                 && attemptsInteger!!.toInt() > 0)
                        
                                    {
                                    this.weblisketSession!!.setAttempts(Integer(attemptsInteger!!.toInt() +1))

                                    }
                                
                        else {
                            this.weblisketSession!!.setAttempts(Integer(1))

                        }
                            
}


open fun processIfNewLogin(userName: String, password: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var userName = userName


                    var password = password

        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.AUTHENTICATIONERROR))
                        
                                    {
                                    logUtil!!.put("Starting: " +userName, this, "processIfNewLogin()")

                                    }
                                

    
                        if(userName != 
                                    null
                                 && userName!!.compareTo(StringUtil.getInstance()!!.EMPTY_STRING) != 0 && password != 
                                    null
                                 && password.compareTo(StringUtil.getInstance()!!.EMPTY_STRING) != 0)
                        
                                    {
                                    
    var login: String


    var userEntityInterface: UserEntityInterface = UserEntityFactory.getInstance()!!

login= userEntityInterface!!.login(userName, password)

    
                        if(login.compareTo(GLOBALS2.LOGINSUCCESS) == 0)
                        
                                    {
                                    
    var userInterface: UserInterface = userEntityInterface!!.getUser(userName)!!


    
                        if(userInterface!!.isSessionValid())
                        
                                    {
                                    this.weblisketSession!!.setAttempts(Integer(0))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE

                                    }
                                

                                    }
                                
this.nextAttempt()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                
this.nextAttempt()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.AUTHENTICATIONERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "processIfNewLogin()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


open fun processInvalidation()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    
                        if(BooleanUtil.getInstance()!!.getFromString(timeout))
                        
                                    {
                                    this.invalidateSession()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE

                                    }
                                


                            {
                            this.weblisketSession!!.setTimeout(BooleanFactory.getInstance()!!.TRUE_STRING)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                            }
                    
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.AUTHENTICATIONERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "processInvalidation()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


open fun outputSessionInfo()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var calendar: Calendar = Calendar.getInstance()!!


    var timeCreated: Long = this.weblisketSession!!.getCreationTime()!!


    var stringBuffer: StringMaker = StringMaker()


    var lastAccess: Long = this.weblisketSession!!.getLastAccessedTime()!!

stringBuffer!!.append("Time Since Last Access: " +(calendar.getTimeInMillis() -lastAccess) +"<br/>\n")

    
                        if(this.role != 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.append("Auth: ")
stringBuffer!!.append(this.authenticated)
stringBuffer!!.append(" UserName: ")
stringBuffer!!.append(this.sessionUserName)
stringBuffer!!.append(" Role: ")
stringBuffer!!.append(this.role.toString())
stringBuffer!!.append("<br/>\n")
stringBuffer!!.append("Time Left: ")
stringBuffer!!.append((role.getSessionTimeout() -(calendar.getTimeInMillis() -timeCreated)))
stringBuffer!!.append("<br/>\n")
stringBuffer!!.append("Inactivity Time Allowed: ")
stringBuffer!!.append(role.getSessionTimeout())
stringBuffer!!.append("<br/>\n")
stringBuffer!!.append("Inactivity Time Allowed: ")
stringBuffer!!.append(role.getSessionInactivityTimeout())
stringBuffer!!.append("<br/>\n")

                                    }
                                
                        else {
                            stringBuffer!!.append("Role Is Not Set<br/>\n")

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
} catch(e: Exception)
            {


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Error"
}

}


open fun getRole()
        //nullable = true from not(false or (false and true)) = true
: UserRole{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return role
}


}
                
            

