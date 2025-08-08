
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
        package org.allbinary.logic.communication.smtp.email



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.user.UserInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.smtp.event.UserEmailEventNameData
import org.allbinary.logic.communication.smtp.event.handler.UserEmailEventHandler
import org.allbinary.logic.communication.smtp.event.handler.factory.AdminUserEmailEventHandlerSingletons
import org.allbinary.logic.communication.smtp.event.handler.factory.UserEmailEventHandlerSingletons
import org.allbinary.logic.communication.smtp.info.AdminEmailInfo
import org.allbinary.logic.communication.smtp.info.BasicEmailInfo
import org.allbinary.logic.communication.smtp.info.EmailInfo
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.string.CommonStrings

open public class NewPasswordEmail
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val abeClientInformation: AbeClientInformationInterface

    private var userInterface: UserInterface

    private var newPassword: String
public constructor        (abeClientInformation: AbeClientInformationInterface, userInterface: UserInterface, newPassword: String)
            : super()
        {

                    var abeClientInformation = abeClientInformation


                    var userInterface = userInterface


                    var newPassword = newPassword
this.abeClientInformation= abeClientInformation
this.userInterface= userInterface
this.newPassword= newPassword
}


                @Throws(Exception::class)
            
open fun process()
        //nullable = true from not(false or (false and true)) = true
{this.notifyStoreAdmin()
this.notifyUser()
}


                @Throws(Exception::class)
            
open fun notifyStoreAdmin()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    logUtil!!.put(
                            "notifyStoreAdmin", this, 
                            "notifyStoreAdmin")

                                    }
                                

    var emailSubject: String = "New Password For User: " +this.userInterface!!.getUserName()


    var emailBody: String = "New Password: " +this.newPassword


    var basicEmailInfo: BasicEmailInfo = AdminEmailInfo(emailSubject, emailBody) as BasicEmailInfo


    var emailInfo: EmailInfo = EmailInfo(basicEmailInfo)


    var adminUserEmailEventHandler: UserEmailEventHandler = AdminUserEmailEventHandlerSingletons.getInstance()!!.getInstance(abeClientInformation, UserEmailEventNameData.NEWPASSWORD)!!
            

adminUserEmailEventHandler!!.receiveEmailInfo(UserEmailEventNameData.NEWPASSWORD, emailInfo)
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.EXCEPTION, this, 
                            "emailAdmin", e)

                                    }
                                
}

}


                @Throws(Exception::class)
            
open fun notifyUser()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    logUtil!!.put(
                            "Email User", this, 
                            "notifyUser()")

                                    }
                                

    var subject: String = "New Password"


    var body: String = "New Password: " +newPassword


    var basicEmailInfo: BasicEmailInfo = AdminEmailInfo(subject, body) as BasicEmailInfo


    var emailInfo: EmailInfo = EmailInfo(basicEmailInfo)


    var userEmailEventHandler: UserEmailEventHandler = UserEmailEventHandlerSingletons.getInstance()!!.getInstance(abeClientInformation, UserEmailEventNameData.NEWPASSWORD, this.userInterface)!!
            

userEmailEventHandler!!.receiveEmailInfo(UserEmailEventNameData.NEWPASSWORD, emailInfo)
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.EXCEPTION, this, 
                            "notifyUser", e)

                                    }
                                



                            throw e
}

}


}
                
            

