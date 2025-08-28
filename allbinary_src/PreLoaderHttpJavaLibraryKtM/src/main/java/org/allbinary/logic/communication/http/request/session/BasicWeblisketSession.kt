
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
        package org.allbinary.logic.communication.http.request.session




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpSession
import javax.servlet.jsp.PageContext
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.user.UserData
import org.allbinary.business.user.commerce.money.payment.gateway.PaymentGatewayData
import org.allbinary.business.user.role.BasicUserRole
import org.allbinary.business.user.role.BasicUserRoleData
import org.allbinary.logic.java.bool.BooleanFactory

open public class BasicWeblisketSession
            : Object
         {
        

    private var session: HttpSession

    private var pageContext: PageContext
public constructor        (pageContext: PageContext)
            : super()
        

        Updates for KMP build        
        {
var pageContext = pageContext
this.pageContext= pageContext

    var request: HttpServletRequest = pageContext!!.getRequest() as HttpServletRequest

this.session= request.getSession(true)
}


open fun setRole(aRole: BasicUserRole)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var aRole = aRole
session.setAttribute(BasicUserRoleData.NAME.toString(), aRole)
}


open fun getRole()
        //nullable = true from not(false or (false and true)) = true
: BasicUserRole

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return session.getAttribute(BasicUserRoleData.NAME.toString()) as BasicUserRole
}


open fun setPassword(password: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var password = password
session.setAttribute(UserData.PASSWORD, password)
}


open fun setUserName(userName: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var userName = userName
session.setAttribute(UserData.USERNAME, userName)
}


open fun setPaymentMethod(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
session.setAttribute(PaymentGatewayData.NAME.toString(), value)
}


open fun setAuthenticated()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
session.setAttribute(WeblisketSessionData.AUTHENTICATED, BooleanFactory.getInstance()!!.TRUE_STRING)
}


open fun setAttempts(value: Integer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
session.setAttribute(WeblisketSessionData.ATTEMPTS, value)
}


open fun setTimeout(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
this.session.setAttribute(WeblisketSessionData.TIMEOUT, value)
}


open fun setStoreName(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
this.session.setAttribute(StoreFrontData.getInstance()!!.NAME, value)
}


open fun getWebAppPath()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.session.getAttribute(org.allbinary.globals.GLOBALS2.WEBAPPPATH) as String
}


open fun getUserName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return session.getAttribute(UserData.USERNAME) as String
}


open fun getPassword()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return session.getAttribute(UserData.PASSWORD) as String
}


open fun getPaymentMethod()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return session.getAttribute(PaymentGatewayData.NAME.toString()) as String
}


open fun getAuthentication()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return session.getAttribute(WeblisketSessionData.AUTHENTICATED) as String
}


open fun getAttempts()
        //nullable = true from not(false or (false and true)) = true
: Integer

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return session.getAttribute(WeblisketSessionData.ATTEMPTS) as Integer
}


open fun getTimeout()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return session.getAttribute(WeblisketSessionData.TIMEOUT) as String
}


open fun getStoreName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return session.getAttribute(StoreFrontData.getInstance()!!.NAME) as String
}


open fun setAuthenticated(value: Boolean)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
session.setAttribute(WeblisketSessionData.AUTHENTICATED, BooleanFactory.getInstance()!!.FALSE_STRING)
}


open fun clear()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.session.removeAttribute(WeblisketSessionData.AUTHENTICATED)
this.session.removeAttribute(WeblisketSessionData.TIMEOUT)
this.session.removeAttribute(BasicUserRoleData.NAME.toString())
this.session.removeAttribute(UserData.USERNAME)
}


open fun getCreationTime()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return session.getCreationTime()
}


open fun getLastAccessedTime()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {

    var lastAccessedTime: Long = session.getLastAccessedTime()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return lastAccessedTime
}


}
                
            

