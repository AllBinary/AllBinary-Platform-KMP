
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
        package org.allbinary.logic.communication.smtp.event.modules.log



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.smtp.event.EmailEvent
import org.allbinary.logic.communication.smtp.event.UserEmailEventListenerInterface

open public class LogUserEmailEventListenerModule
            : Object
        
                , UserEmailEventListenerInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            
public constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun onEmailSendRequest(userEmailInfoEvent: EmailEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var userEmailInfoEvent = userEmailInfoEvent

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    
    var message: String = "Logging EmailEvent - Temporary Listener for debugging.\n\n" +userEmailInfoEvent!!.toString()

logUtil!!.put(message, this, 
                            "onEmailSendRequest")

                                    }
                                
}


}
                
            

