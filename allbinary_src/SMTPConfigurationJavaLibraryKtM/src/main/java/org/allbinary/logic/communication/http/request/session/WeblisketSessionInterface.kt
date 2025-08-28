
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


        Updates for KMP build        
        

open fun getAttempts()
        //nullable = true from not(false or (false and true)) = true
: Integer

        Updates for KMP build        
        

open fun getAuthentication()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getCreationTime()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        

open fun getId()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getLastAccessedTime()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun getOrder()
        //nullable = true from not(false or (false and true)) = true
: OrderInterface

        Updates for KMP build        
        

open fun getPassword()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getPaymentMethod()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun getRole()
        //nullable = true from not(false or (false and true)) = true
: UserRole

        Updates for KMP build        
        

open fun getStoreName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getTimeout()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getUserName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getWebAppPath()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun removeBasket()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        

open fun setAttempts(value: Integer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setAuthenticated()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        

open fun setAuthenticated(value: Boolean)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setPassword(password: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setPaymentMethod(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setRole(aRole: UserRole)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setStoreName(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setTimeout(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setUserName(userName: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

}
                
            

