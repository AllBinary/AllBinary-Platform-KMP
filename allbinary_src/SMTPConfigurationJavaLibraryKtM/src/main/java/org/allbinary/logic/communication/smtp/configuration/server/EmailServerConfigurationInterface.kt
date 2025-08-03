
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
        package org.allbinary.logic.communication.smtp.configuration.server



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
interface EmailServerConfigurationInterface {
        

open fun setSmtpServer(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun getSmtpServer()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getAccountName()
        //nullable = true from not(false or (false and true)) = true
: String

open fun setAccountName(accountName: String)
        //nullable = true from not(false or (false and false)) = true


open fun getPassword()
        //nullable = true from not(false or (false and true)) = true
: String

open fun setPassword(password: String)
        //nullable = true from not(false or (false and false)) = true


open fun log()
        //nullable = true from not(false or (false and true)) = true

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

}
                
            

