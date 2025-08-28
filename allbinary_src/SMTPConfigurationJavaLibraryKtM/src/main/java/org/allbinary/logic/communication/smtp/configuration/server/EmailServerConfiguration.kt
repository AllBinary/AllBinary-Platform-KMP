
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings

open public class EmailServerConfiguration
            : Object
        
                , EmailServerConfigurationInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var accountName: String

    private var password: String

    private var smtpServer: String
public constructor        ()
            : super()
        

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.START, this, commonStrings!!.CONSTRUCTOR)

                                    }
                                
this.setSmtpServer(StringUtil.getInstance()!!.EMPTY_STRING)
}

public constructor        (hashMap: HashMap<Any, Any>)
            : super()
        

        Updates for KMP build        
        {
var hashMap = hashMap

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.START, this, "EmailServerConfiguration(HashMap)")

                                    }
                                
this.setAccountName(hashMap!!.get(EmailServerConfigurationData.ACCOUNT) as String)
this.setPassword(hashMap!!.get(EmailServerConfigurationData.PASSWORD) as String)
this.setSmtpServer(hashMap!!.get(EmailServerConfigurationData.SERVER) as String)
this.log()
}

public constructor        (account: String, password: String, server: String)
            : super()
        

        Updates for KMP build        
        {
var account = account
var password = password
var server = server

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.START, this, "EmailServerConfiguration(HashMap)")

                                    }
                                
this.setAccountName(account)
this.setPassword(password)
this.setSmtpServer(server)
this.log()
}


open fun setSmtpServer(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
this.smtpServer= value
}


open fun getSmtpServer()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.smtpServer
}


open fun getAccountName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return accountName
}


open fun setAccountName(accountName: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var accountName = accountName
this.accountName= accountName
}


open fun getPassword()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return password
}


open fun setPassword(password: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var password = password
this.password= password
}


open fun log()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    logUtil!!.put(this.toString(), this, "EmailServerConfiguration")

                                    }
                                
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Email Server Configuration:\n" +"Smtp Server: \n" +this.getSmtpServer() +"\nAccount Name: " +this.getAccountName() +"\nPassword: " +this.getPassword()
}


}
                
            

