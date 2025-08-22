
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
        package org.allbinary.business.user.commerce.inventory.order.status




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.context.modules.storefront.StoreFrontFactory
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.user.UserInterface
import org.allbinary.business.user.commerce.inventory.order.OrderHistory
import org.allbinary.data.tables.user.UserEntityFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.smtp.event.UserEmailEventNameData
import org.allbinary.logic.communication.smtp.event.handler.UserEmailEventHandler
import org.allbinary.logic.communication.smtp.event.handler.factory.AdminUserEmailEventHandlerSingletons
import org.allbinary.logic.communication.smtp.event.handler.factory.StoreAdminUserEmailEventHandlerSingletons
import org.allbinary.logic.communication.smtp.event.handler.factory.UserEmailEventHandlerSingletons
import org.allbinary.logic.communication.smtp.info.AdminEmailInfo
import org.allbinary.logic.communication.smtp.info.BasicEmailInfo
import org.allbinary.logic.communication.smtp.info.EmailInfo
import org.allbinary.logic.communication.smtp.info.StoreEmailInfo
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.string.CommonStrings

open public class OrderStatusEmail
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val abeClientInformation: AbeClientInformationInterface

    private var orderHistory: OrderHistory

    private var storeFrontInterface: StoreFrontInterface

    private var user: UserInterface
public constructor        (abeClientInformation: AbeClientInformationInterface, orderHistory: OrderHistory)
            : super()
        {

                    var abeClientInformation = abeClientInformation


                    var orderHistory = orderHistory
this.abeClientInformation= abeClientInformation
this.orderHistory= orderHistory

    var storeName: String = orderHistory!!.getStoreName()!!

this.storeFrontInterface= StoreFrontFactory.getInstance(storeName)
this.user= UserEntityFactory.getInstance()!!.getUser(orderHistory!!.getUserName())
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
                                    logUtil!!.put("Order Email", this, "emailStoreAdmin")

                                    }
                                

    var adminEmailSubject: String = "Order " +this.orderHistory!!.getStatus() +" Attempt"


    var adminEmailTextBody: String = "Order attempt: " +this.orderHistory!!.getId() +" Preprocessing by: " +user.getUserName()


    var adminBasicEmailInfo: BasicEmailInfo = AdminEmailInfo(adminEmailSubject, adminEmailTextBody) as BasicEmailInfo


    var storeAdminBasicEmailInfo: BasicEmailInfo = StoreEmailInfo(this.storeFrontInterface, adminEmailSubject, adminEmailTextBody) as BasicEmailInfo


    var storeAdminEmailInfo: EmailInfo = EmailInfo(storeAdminBasicEmailInfo)


    var adminEmailInfo: EmailInfo = EmailInfo(adminBasicEmailInfo)


    var userEmailEventNameData: UserEmailEventNameData = UserEmailEventNameData.getInstance(this.orderHistory!!.getStatus())!!


    var adminUserEmailEventHandler: UserEmailEventHandler = AdminUserEmailEventHandlerSingletons.getInstance()!!.getInstance(this.abeClientInformation, userEmailEventNameData)!!


    var storeAdminUserEmailEventHandler: UserEmailEventHandler = StoreAdminUserEmailEventHandlerSingletons.getInstance()!!.getInstance(userEmailEventNameData, this.abeClientInformation, this.storeFrontInterface)!!

storeAdminUserEmailEventHandler!!.receiveEmailInfo(userEmailEventNameData, storeAdminEmailInfo)
adminUserEmailEventHandler!!.receiveEmailInfo(userEmailEventNameData, adminEmailInfo)
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "emailAdmin", e)

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
                                    logUtil!!.put("Email User", this, "notifyUser()")

                                    }
                                

    var subject: String = "Order " +this.orderHistory!!.getStatus() +" Attempt"


    var textBody: String = "Order attempt: " +this.orderHistory!!.getId() +" Preprocessing by: " +user.getUserName()


    var basicEmailInfo: BasicEmailInfo = StoreEmailInfo(this.storeFrontInterface, subject, textBody) as BasicEmailInfo


    var emailInfo: EmailInfo = EmailInfo(basicEmailInfo)


    var userEmailEventNameData: UserEmailEventNameData = UserEmailEventNameData.getInstance(this.orderHistory!!.getStatus())!!


    var userEmailEventHandler: UserEmailEventHandler = UserEmailEventHandlerSingletons.getInstance()!!.getInstance(this.abeClientInformation, userEmailEventNameData, this.user)!!

userEmailEventHandler!!.receiveEmailInfo(userEmailEventNameData, emailInfo)
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "notifyUser", e)

                                    }
                                



                            throw e
}

}


}
                
            

