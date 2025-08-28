
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
        package admin.taghelpers




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import javax.servlet.http.HttpServletRequest
import javax.servlet.jsp.PageContext
import org.allbinary.business.context.modules.storefront.StoreFront
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.installer.Portion
import org.allbinary.data.tables.context.module.storefronts.StoreFrontsEntityFactory
import org.allbinary.logic.communication.http.request.session.WeblisketSession
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.smtp.event.UserEmailEventNameData
import org.allbinary.logic.communication.smtp.event.handler.UserEmailEventHandler
import org.allbinary.logic.communication.smtp.event.handler.factory.AdminUserEmailEventHandlerSingletons
import org.allbinary.logic.communication.smtp.event.handler.factory.StoreAdminUserEmailEventHandlerSingletons
import org.allbinary.logic.communication.smtp.info.AdminEmailInfo
import org.allbinary.logic.communication.smtp.info.BasicEmailInfo
import org.allbinary.logic.communication.smtp.info.EmailInfo
import org.allbinary.logic.communication.smtp.info.StoreEmailInfo
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.ServiceClientInformationInterfaceFactory

open public class StoreFrontsRequestHelper : ModifyTable {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val abeClientInformation: AbeClientInformationInterface = ServiceClientInformationInterfaceFactory.getInstance()!!

    private val pageContext: PageContext

    private val request: HttpServletRequest

    private val weblisketSession: WeblisketSession

    private var storeName: String

    private var modifyingStoreFrontInterface: StoreFrontInterface

    private val portion: Portion
public constructor        (hashMap: HashMap<Any, Any>, pageContext: PageContext)

        Updates for KMP build        
        {
var hashMap = hashMap
var pageContext = pageContext
this.pageContext= pageContext
this.request= pageContext!!.getRequest() as HttpServletRequest
this.weblisketSession= WeblisketSession(hashMap, pageContext)
this.portion= Portion(hashMap)
this.getFormData()
}


                @Throws(Exception::class)
            
open fun getFormData()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.storeName= this.weblisketSession!!.getStoreName()
this.modifyingStoreFrontInterface= StoreFront(this.request) as StoreFrontInterface
}


open fun update()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var success: String = "Updated Successfully"


    var hashMapData: HashMap<Any, Any> = this.modifyingStoreFrontInterface!!.toHashMap()!!

StoreFrontsEntityFactory.getInstance()!!.getStoreFrontsEntityInstance()!!.update(hashMapData)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "update()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var error: String = "Failed to update storefronts table"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "update()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


                @Throws(Exception::class)
            
open fun sendStoreCreatedEmails()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    var storeManagerEmailSubject: String = "Store Manager Nofification For Store: " +this.modifyingStoreFrontInterface!!.getName()


    var adminEmailSubject: String = "Admin Notification For Store: " +this.modifyingStoreFrontInterface!!.getName()


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Store Created: ")
stringBuffer!!.append(this.modifyingStoreFrontInterface!!.getName())
stringBuffer!!.append("\n\n")
stringBuffer!!.append("Click here for the Admin Interface:\n")
stringBuffer!!.append(this.modifyingStoreFrontInterface!!.getCurrentHomeHostName())
stringBuffer!!.append("/admin/login.jsp\n\n")
stringBuffer!!.append("Goto Your Store:\n")
stringBuffer!!.append(this.modifyingStoreFrontInterface!!.getCurrentHomeHostName())
stringBuffer!!.append(this.modifyingStoreFrontInterface!!.getName())
stringBuffer!!.append("/index.jsp")
stringBuffer!!.append("\n\n")
stringBuffer!!.append("UserName: ")
stringBuffer!!.append(this.weblisketSession!!.getUserName())

    var adminEmailTextBody: String = stringBuffer!!.toString()!!


    var adminBasicEmailInfo: BasicEmailInfo = AdminEmailInfo(adminEmailSubject, adminEmailTextBody) as BasicEmailInfo


    var storeAdminBasicEmailInfo: BasicEmailInfo = StoreEmailInfo(this.modifyingStoreFrontInterface, storeManagerEmailSubject, adminEmailTextBody) as BasicEmailInfo


    var storeAdminEmailInfo: EmailInfo = EmailInfo(storeAdminBasicEmailInfo)


    var adminEmailInfo: EmailInfo = EmailInfo(adminBasicEmailInfo)


    var adminUserEmailEventHandler: UserEmailEventHandler = AdminUserEmailEventHandlerSingletons.getInstance()!!.getInstance(this.abeClientInformation, UserEmailEventNameData.STORECREATED)!!


    var storeAdminUserEmailEventHandler: UserEmailEventHandler = StoreAdminUserEmailEventHandlerSingletons.getInstance()!!.getInstance(UserEmailEventNameData.STORECREATED, this.abeClientInformation, this.modifyingStoreFrontInterface)!!

storeAdminUserEmailEventHandler!!.receiveEmailInfo(UserEmailEventNameData.STORECREATED, storeAdminEmailInfo)
adminUserEmailEventHandler!!.receiveEmailInfo(UserEmailEventNameData.STORECREATED, adminEmailInfo)
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun install()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Intall StoreFront Successfully: ")
stringBuffer!!.append(this.portion.getCurrent()!!.toInt())
stringBuffer!!.append(" of ")
stringBuffer!!.append(this.portion.getTotal()!!.toInt())

    var success: String = stringBuffer!!.toString()!!

this.modifyingStoreFrontInterface!!.install(this.portion.getCurrent()!!.toInt(), this.portion.getTotal()!!.toInt())

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "install()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var error: String = "Failed to Install storefront"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "install()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun insert()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var success: String = "Added Successfully"


    var values: Vector = this.modifyingStoreFrontInterface!!.toVector()!!

StoreFrontsEntityFactory.getInstance()!!.getStoreFrontsEntityInstance()!!.insert(values)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "insert()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var error: String = "Failed to add storefront"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "insert()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun delete()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var success: String = "Delete Successfully"

StoreFrontsEntityFactory.getInstance()!!.getStoreFrontsEntityInstance()!!.delete(this.storeName)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "delete()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var error: String = "Failed to delete storefronts table"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "delete()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


}
                
            

