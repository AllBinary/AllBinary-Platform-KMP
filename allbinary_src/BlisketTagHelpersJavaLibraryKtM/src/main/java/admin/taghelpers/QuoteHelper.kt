
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
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import javax.servlet.jsp.PageContext
import org.allbinary.business.context.modules.storefront.StoreFront
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.context.modules.storefront.StoreFrontFactory
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.installer.Portion
import org.allbinary.business.user.UserInterface
import org.allbinary.business.user.quoterequest.QuoteRequest
import org.allbinary.data.tables.user.UserEntityFactory
import org.allbinary.data.tables.user.quoterequest.QuoteRequestEntity
import org.allbinary.data.tables.user.quoterequest.QuoteRequestEntityFactory
import org.allbinary.logic.communication.http.request.session.WeblisketSession
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.smtp.event.UserEmailEventNameData
import org.allbinary.logic.communication.smtp.event.handler.UserEmailEventHandler
import org.allbinary.logic.communication.smtp.event.handler.factory.AdminUserEmailEventHandlerSingletons
import org.allbinary.logic.communication.smtp.event.handler.factory.StoreAdminUserEmailEventHandlerSingletons
import org.allbinary.logic.communication.smtp.event.handler.factory.UserEmailEventHandlerSingletons
import org.allbinary.logic.communication.smtp.info.BasicEmailInfo
import org.allbinary.logic.communication.smtp.info.EmailInfo
import org.allbinary.logic.communication.smtp.info.StoreEmailInfo
import org.allbinary.logic.communication.sql.AbSqlTableUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.ServiceClientInformationInterfaceFactory

open public class QuoteHelper : BasicTable {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val abeClientInformation: AbeClientInformationInterface = ServiceClientInformationInterfaceFactory.getInstance()!!

    private val weblisketSession: WeblisketSession

    private val storeFrontInterface: StoreFrontInterface

    private val portion: Portion
public constructor        (hashMap: HashMap<Any, Any>, pageContext: PageContext){
var hashMap = hashMap
var pageContext = pageContext

    var storeName: String = hashMap!!.get(StoreFrontData.getInstance()!!.NAME) as String


    
                        if(storeName != 
                                    null
                                )
                        
                                    {
                                    this.storeFrontInterface= StoreFrontFactory.getInstance(storeName)

                                    }
                                
                        else {
                            this.storeFrontInterface= StoreFront()

                        }
                            
this.weblisketSession= WeblisketSession(hashMap, pageContext)
this.portion= Portion(hashMap)
}


                @Throws(Exception::class)
            
open fun emailUser(quoteRequest: QuoteRequest)
        //nullable = true from not(false or (false and false)) = true
{
var quoteRequest = quoteRequest

    var user: UserInterface = UserEntityFactory.getInstance()!!.getUser(quoteRequest!!.getUserName())!!


    var userEmailSubject: String = "Quote Request Receipt"


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("This is just a verification email. ")
stringBuffer!!.append("We usually respond to quote request within 24 hours.")
stringBuffer!!.append("\n\nThank You For Your Business.")

    var userEmailTextBody: String = stringBuffer!!.toString()!!


    var basicEmailInfo: BasicEmailInfo = StoreEmailInfo(this.storeFrontInterface, userEmailSubject, userEmailTextBody) as BasicEmailInfo


    var emailInfo: EmailInfo = EmailInfo(basicEmailInfo)


    var userEmailEventHandler: UserEmailEventHandler = UserEmailEventHandlerSingletons.getInstance()!!.getInstance(this.abeClientInformation, UserEmailEventNameData.QUOTEREQUEST, user)!!

userEmailEventHandler!!.receiveEmailInfo(UserEmailEventNameData.QUOTEREQUEST, emailInfo)
}


                @Throws(Exception::class)
            
open fun emailAdmins(quoteRequest: QuoteRequest)
        //nullable = true from not(false or (false and false)) = true
{
var quoteRequest = quoteRequest

    var adminEmailSubject: String = "Quote Request"


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("\nUserName: ")
stringBuffer!!.append(quoteRequest!!.getUserName())
stringBuffer!!.append("\nProject Info: \n")
stringBuffer!!.append(quoteRequest!!.getProjectInfo())
stringBuffer!!.append("\nUser Comments: \n")
stringBuffer!!.append(quoteRequest!!.getUserComments())
stringBuffer!!.append("\nBudget: \n")
stringBuffer!!.append(quoteRequest!!.getBudget())
stringBuffer!!.append("\nTime Frame: \n")
stringBuffer!!.append(quoteRequest!!.getTimeFrame())
stringBuffer!!.append("\nComments: \n")
stringBuffer!!.append(quoteRequest!!.getComments())

    var adminEmailTextBody: String = stringBuffer!!.toString()!!


    var basicEmailInfo: BasicEmailInfo = StoreEmailInfo(this.storeFrontInterface, adminEmailSubject, adminEmailTextBody) as BasicEmailInfo


    var emailInfo: EmailInfo = EmailInfo(basicEmailInfo)


    var storeAdminUserEmailEventHandler: UserEmailEventHandler = AdminUserEmailEventHandlerSingletons.getInstance()!!.getInstance(this.abeClientInformation, UserEmailEventNameData.QUOTEREQUEST)!!


    var adminUserEmailEventHandler: UserEmailEventHandler = StoreAdminUserEmailEventHandlerSingletons.getInstance()!!.getInstance(UserEmailEventNameData.QUOTEREQUEST, this.abeClientInformation, this.storeFrontInterface)!!

storeAdminUserEmailEventHandler!!.receiveEmailInfo(UserEmailEventNameData.QUOTEREQUEST, emailInfo)
adminUserEmailEventHandler!!.receiveEmailInfo(UserEmailEventNameData.QUOTEREQUEST, emailInfo)
}


                @Throws(Exception::class)
            
open fun email()
        //nullable = true from not(false or (false and true)) = true
: String{

        try {
            
    var quoteRequestEntity: QuoteRequestEntity = QuoteRequestEntityFactory.getInstance()!!.getQuoteRequestEntityInstance()!!


    var userName: String = this.weblisketSession!!.getUserName()!!


    var vector: Vector = quoteRequestEntity!!.getIds(userName)!!


    var id: Int = 0


    var size: Int = vector.size!!





                        for (index in 0 until size)

        {

    var nextId: Int = get = vector.get(index)get as Integer
get.
                    toInt()!!


    
                        if(id < nextId)
                        
                                    {
                                    id= nextId

                                    }
                                
}


    var quoteRequest: QuoteRequest = quoteRequestEntity!!.get(userName, id)!!


    
                        if(quoteRequest != 
                                    null
                                )
                        
                                    {
                                    this.emailUser(quoteRequest)
this.emailAdmins(quoteRequest)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Thank You For Your Business.<p/>"

                                    }
                                
                        else {
                            


                            throw Exception("No Quote Request")

                        }
                            
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, "email", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Thank You For Your Business.<p>"
}

}


open fun drop()
        //nullable = true from not(false or (false and true)) = true
: String{

        try {
            
    var success: String = QuoteRequestEntityFactory.getInstance()!!.getQuoteRequestEntityInstance()!!.dropTable()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, commonStrings!!.DROP)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            {

    var error: String = "Failed to drop QuoteRequest table"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.DROP, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun create()
        //nullable = true from not(false or (false and true)) = true
: String{

        try {
            
    var success: String = QuoteRequestEntityFactory.getInstance()!!.getQuoteRequestEntityInstance()!!.createTable()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "create()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            {

    var error: String = "Failed to create new QuoteRequest table"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "create()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun restore()
        //nullable = true from not(false or (false and true)) = true
: String{

        try {
            
    var success: String = "Restore Successful"


    var result: String = AbSqlTableUtil.getInstance()!!.restoreTable(QuoteRequestEntityFactory.getInstance()!!.getQuoteRequestEntityInstance(), portion)!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "restore()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            {

    var error: String = "Failed to restore backup"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "restore()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun backup()
        //nullable = true from not(false or (false and true)) = true
: String{

        try {
            
    var success: String = "Restore Successful"


    var result: String = AbSqlTableUtil.getInstance()!!.backupTable(QuoteRequestEntityFactory.getInstance()!!.getQuoteRequestEntityInstance())!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "backup()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            {

    var error: String = "Failed to make backup"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "backup()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


}
                
            

