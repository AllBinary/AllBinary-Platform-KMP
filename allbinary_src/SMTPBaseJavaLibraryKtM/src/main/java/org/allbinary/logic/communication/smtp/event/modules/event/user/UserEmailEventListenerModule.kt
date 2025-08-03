
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
        package org.allbinary.logic.communication.smtp.event.modules.event.user



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.user.UserInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.smtp.BasicEmail
import org.allbinary.logic.communication.smtp.EmailInterface
import org.allbinary.logic.communication.smtp.event.EmailEvent
import org.allbinary.logic.communication.smtp.event.UserEmailEventListenerInterface
import org.allbinary.logic.communication.smtp.queue.EmailQueueFactory

open public class UserEmailEventListenerModule
            : Object
        
                , UserEmailEventListenerInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var userInterface: UserInterface
public constructor        (userInterface: UserInterface)
            : super()
        {

                    var userInterface = userInterface
this.userInterface= userInterface
}


                @Throws(Exception::class)
            
open fun onEmailSendFailure(emailEvent: EmailEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var emailEvent = emailEvent

    var to: String = this.userInterface!!.getSecondaryEmail()!!
            


    var email: BasicEmail = BasicEmail(emailEvent!!.getEmailInfo(), to)

EmailQueueFactory.getInstance()!!.offer(email!!.getEmail() as EmailInterface)
}


                @Throws(Exception::class)
            
open fun onEmailSendRequest(emailEvent: EmailEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var emailEvent = emailEvent

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    logUtil!!.put("Add Email To Que For Sending: " +emailEvent!!.toString(), this, 
                            "onEmailSendRequest")

                                    }
                                

    var to: String = this.userInterface!!.getMainEmail()!!
            


    var email: BasicEmail = BasicEmail(emailEvent!!.getEmailInfo(), to)

EmailQueueFactory.getInstance()!!.offer(email!!.getEmail() as EmailInterface)
}


}
                
            

