
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
        
import java.util.HashMap
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpSession
import javax.servlet.jsp.PageContext
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.context.modules.storefront.StoreFrontFactory
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.user.UserData
import org.allbinary.business.user.commerce.inventory.basket.Basket
import org.allbinary.business.user.commerce.inventory.order.Order
import org.allbinary.business.user.commerce.inventory.order.OrderInterface
import org.allbinary.business.user.commerce.money.payment.gateway.PaymentGatewayData
import org.allbinary.business.user.role.UserRole
import org.allbinary.business.user.role.UserRoleB
import org.allbinary.business.user.role.UserRoleData
import org.allbinary.logic.java.bool.BooleanFactory
import org.allbinary.logic.string.StringValidationUtil

open public class WeblisketSession
            : Object
        
                , WeblisketSessionInterface {
        

    private var session: HttpSession
public constructor        (hashMap: HashMap<Any, Any>, pageContext: PageContext)                        

                            : this(hashMap, pageContext!!.getRequest() as HttpServletRequest){

                    var hashMap = hashMap


                    var pageContext = pageContext


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (hashMap: HashMap<Any, Any>, httpServletRequest: HttpServletRequest)
            : super()
        {

                    var hashMap = hashMap


                    var httpServletRequest = httpServletRequest

    var propertiesHashMap: HashMap<Any, Any> = hashMap


    var request: HttpServletRequest = httpServletRequest

this.session= request.getSession(true)

    
                        if(this.getStoreName() == 
                                    null
                                )
                        
                                    {
                                    this.setStoreName(propertiesHashMap!!.get(StoreFrontData.getInstance()!!.NAME) as String)

                                    }
                                
}


open fun getId()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.session.getId()
}


open fun setPassword(password: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var password = password
session.setAttribute(UserData.PASSWORD, password)
}


open fun setUserName(userName: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var userName = userName
session.setAttribute(UserData.USERNAME, userName)
}


open fun setPaymentMethod(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
session.setAttribute(PaymentGatewayData.NAME.toString(), value)
}


open fun setAuthenticated()
        //nullable = true from not(false or (false and true)) = true
{session.setAttribute(WeblisketSessionData.AUTHENTICATED, BooleanFactory.getInstance()!!.TRUE_STRING)
}


open fun setRole(aRole: UserRole)
        //nullable = true from not(false or (false and false)) = true
{

                    var aRole = aRole
session.setAttribute(UserRoleData.NAME.toString(), aRole)
}


open fun setAttempts(value: Integer)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
session.setAttribute(WeblisketSessionData.ATTEMPTS, value)
}


open fun setTimeout(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.session.setAttribute(WeblisketSessionData.TIMEOUT, value)
}


open fun setStoreName(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.session.setAttribute(StoreFrontData.getInstance()!!.NAME, value)
}


open fun getWebAppPath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.session.getAttribute(org.allbinary.globals.GLOBALS2.WEBAPPPATH) as String
}


open fun getUserName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return session.getAttribute(UserData.USERNAME) as String
}


open fun getPassword()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return session.getAttribute(UserData.PASSWORD) as String
}


open fun getPaymentMethod()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return session.getAttribute(PaymentGatewayData.NAME.toString()) as String
}


open fun getAuthentication()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return session.getAttribute(WeblisketSessionData.AUTHENTICATED) as String
}


open fun getAttempts()
        //nullable = true from not(false or (false and true)) = true
: Integer{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return session.getAttribute(WeblisketSessionData.ATTEMPTS) as Integer
}


open fun getTimeout()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return session.getAttribute(WeblisketSessionData.TIMEOUT) as String
}


open fun getStoreName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return session.getAttribute(StoreFrontData.getInstance()!!.NAME) as String
}


                @Throws(Exception::class)
            
open fun getRole()
        //nullable = true from not(false or (false and true)) = true
: UserRole{
    var userRole: UserRole = session.getAttribute(UserRoleData.NAME.toString()) as UserRole


    
                        if(userRole != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return UserRoleB.getRole(userRole!!.getBasicUserRole()!!.getRole())

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                        }
                            
}


                @Throws(Exception::class)
            
open fun getOrder()
        //nullable = true from not(false or (false and true)) = true
: OrderInterface{
    var storeFrontInterface: StoreFrontInterface = StoreFrontFactory.getInstance(this.getStoreName())!!
            


    var basketName: String = storeFrontInterface!!.getBasketName()!!
            


    
                        if(!StringValidationUtil.getInstance()!!.isEmpty(basketName))
                        
                                    {
                                    
    var orderInterface: OrderInterface = session.getAttribute(basketName) as OrderInterface


    
                        if(orderInterface == 
                                    null
                                )
                        
                                    {
                                    orderInterface= Order(Basket()) as OrderInterface

                                    }
                                
session.setAttribute(basketName, orderInterface)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return orderInterface

                                    }
                                
                        else {
                            


                            throw Exception(
                            "Basket Name Not Found")

                        }
                            
}


open fun setAuthenticated(value: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
session.setAttribute(WeblisketSessionData.AUTHENTICATED, BooleanFactory.getInstance()!!.FALSE_STRING)
}


open fun clear()
        //nullable = true from not(false or (false and true)) = true
{this.session.removeAttribute(WeblisketSessionData.AUTHENTICATED)
this.session.removeAttribute(WeblisketSessionData.TIMEOUT)
this.session.removeAttribute(UserRoleData.NAME.toString())
this.session.removeAttribute(UserData.USERNAME)
}


open fun getCreationTime()
        //nullable = true from not(false or (false and true)) = true
: Long{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return session.getCreationTime()
}


open fun getLastAccessedTime()
        //nullable = true from not(false or (false and true)) = true
: Long{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return session.getLastAccessedTime()
}


open fun removeBasket()
        //nullable = true from not(false or (false and true)) = true
{
    var storeFrontInterface: StoreFrontInterface = StoreFrontFactory.getInstance(this.getStoreName())!!
            


    var basketName: String = storeFrontInterface!!.getBasketName()!!
            


    
                        if(!StringValidationUtil.getInstance()!!.isEmpty(basketName))
                        
                                    {
                                    session.removeAttribute(basketName)

                                    }
                                
}


}
                
            

