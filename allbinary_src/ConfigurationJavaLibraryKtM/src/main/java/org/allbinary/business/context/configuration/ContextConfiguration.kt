
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
        package org.allbinary.business.context.configuration




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.smtp.configuration.server.EmailServerConfiguration
import org.allbinary.logic.communication.smtp.configuration.server.EmailServerConfigurationInterface
import org.allbinary.string.CommonStrings

open public class ContextConfiguration
            : Object
        
                , ContextConfigurationInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var emailServerConfigurationInterface: EmailServerConfigurationInterface
public constructor        ()
            : super()
        {logUtil!!.put(commonStrings!!.START, this, 
                            "ContextConfiguration")
this.setEmailServerConfigurationInterface(EmailServerConfiguration() as EmailServerConfigurationInterface)
}

public constructor        (hashMap: HashMap<Any, Any>)
            : super()
        {

                    var hashMap = hashMap
logUtil!!.put(commonStrings!!.START, this, 
                            "ContextConfiguration(HashMap)")
this.setEmailServerConfigurationInterface(EmailServerConfiguration(hashMap) as EmailServerConfigurationInterface)
}


open fun getEmailServerConfigurationInterface()
        //nullable = true from not(false or (false and true)) = true
: EmailServerConfigurationInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return emailServerConfigurationInterface
}


open fun setEmailServerConfigurationInterface(emailServerConfigurationInterface: EmailServerConfigurationInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var emailServerConfigurationInterface = emailServerConfigurationInterface
this.emailServerConfigurationInterface= emailServerConfigurationInterface
}


}
                
            

