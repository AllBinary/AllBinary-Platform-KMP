
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
        
import org.allbinary.business.user.commerce.inventory.order.OrderInterface
import org.allbinary.business.user.role.UserRole
interface WeblisketSessionInterface {
        

open fun clear()
        //nullable = true from not(false or (false and true)) = true


open fun getAttempts()
        //nullable = true from not(false or (false and true)) = true
: Integer

open fun getAuthentication()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getCreationTime()
        //nullable = true from not(false or (false and true)) = true
: Long

open fun getId()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getLastAccessedTime()
        //nullable = true from not(false or (false and true)) = true
: Long

                @Throws(Exception::class)
            
open fun getOrder()
        //nullable = true from not(false or (false and true)) = true
: OrderInterface

open fun getPassword()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getPaymentMethod()
        //nullable = true from not(false or (false and true)) = true
: String

                @Throws(Exception::class)
            
open fun getRole()
        //nullable = true from not(false or (false and true)) = true
: UserRole

open fun getStoreName()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getTimeout()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getUserName()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getWebAppPath()
        //nullable = true from not(false or (false and true)) = true
: String

open fun removeBasket()
        //nullable = true from not(false or (false and true)) = true


open fun setAttempts(value: Integer)
        //nullable = true from not(false or (false and false)) = true


open fun setAuthenticated()
        //nullable = true from not(false or (false and true)) = true


open fun setAuthenticated(value: Boolean)
        //nullable = true from not(false or (false and false)) = true


open fun setPassword(password: String)
        //nullable = true from not(false or (false and false)) = true


open fun setPaymentMethod(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setRole(aRole: UserRole)
        //nullable = true from not(false or (false and false)) = true


open fun setStoreName(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setTimeout(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setUserName(userName: String)
        //nullable = true from not(false or (false and false)) = true


}
                
            

