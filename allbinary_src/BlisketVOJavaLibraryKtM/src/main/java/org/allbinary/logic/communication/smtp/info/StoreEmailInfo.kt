
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
        package org.allbinary.logic.communication.smtp.info




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.context.configuration.ContextConfigurationInterface
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.smtp.configuration.server.EmailServerConfigurationInterface
import org.allbinary.string.CommonStrings

open public class StoreEmailInfo : BasicEmailInfo {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var storeFrontInterface: StoreFrontInterface
public constructor        (storeFrontInterface: StoreFrontInterface, subject: String, textBody: String)                        

                            : super(subject, textBody){
var storeFrontInterface = storeFrontInterface
var subject = subject
var textBody = textBody


                            //For kotlin this is before the body of the constructor.
                    

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.START, this, commonStrings!!.CONSTRUCTOR)

                                    }
                                
this.storeFrontInterface= storeFrontInterface
this.init()
}


                @Throws(Exception::class)
            
open fun init()
        //nullable = true from not(false or (false and true)) = true
{

    var contextConfigurationInterface: ContextConfigurationInterface = storeFrontInterface!!.getContextConfigurationInterface()!!


    var emailServerConfigurationInterface: EmailServerConfigurationInterface = contextConfigurationInterface!!.getEmailServerConfigurationInterface()!!

this.setEmailServerConfigurationInterface(emailServerConfigurationInterface)
}


}
                
            

