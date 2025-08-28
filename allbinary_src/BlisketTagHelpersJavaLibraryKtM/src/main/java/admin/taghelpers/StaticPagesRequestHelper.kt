
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
import javax.servlet.http.HttpServletRequest
import javax.servlet.jsp.PageContext
import org.allbinary.business.context.AbContext
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.context.modules.storefront.StoreFrontFactory
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.http.AcceptableResponseGenerator
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.smtp.event.UserEmailEventNameData
import org.allbinary.logic.communication.smtp.event.handler.UserEmailEventHandler
import org.allbinary.logic.communication.smtp.event.handler.factory.AdminUserEmailEventHandlerSingletons
import org.allbinary.logic.communication.smtp.event.handler.factory.StoreAdminUserEmailEventHandlerSingletons
import org.allbinary.logic.communication.smtp.info.AdminEmailInfo
import org.allbinary.logic.communication.smtp.info.BasicEmailInfo
import org.allbinary.logic.communication.smtp.info.EmailInfo
import org.allbinary.logic.communication.smtp.info.StoreEmailInfo
import org.allbinary.logic.control.search.SearchParams
import org.allbinary.logic.control.search.SearchRequest
import org.allbinary.logic.io.file.FileUtil
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.ServiceClientInformationInterfaceFactory
import org.allbinary.logic.visual.transform.info.TransformInfoData
import views.admin.inventory.listings.ProductListingFactory

open public class StaticPagesRequestHelper : AbContext
                , TagHelperInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val abeClientInformation: AbeClientInformationInterface = ServiceClientInformationInterfaceFactory.getInstance()!!

    private var request: HttpServletRequest

    private var storeName: String

    private var searchParams: SearchParams

    private var xslFile: String
public constructor        (propertiesHashMap: HashMap<Any, Any>, pageContext: PageContext)                        

                            : super(propertiesHashMap, pageContext)

        Updates for KMP build        
        {
var propertiesHashMap = propertiesHashMap
var pageContext = pageContext


                            //For kotlin this is before the body of the constructor.
                    
this.request= pageContext!!.getRequest() as HttpServletRequest
this.xslFile= propertiesHashMap!!.get(TransformInfoData.getInstance()!!.TEMPLATEFILENAME) as String
this.getFormData()
}


open fun getFormData()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.storeName= request.getParameter(StoreFrontData.getInstance()!!.NAME)
this.searchParams= SearchParams(this.request)
}


                @Throws(Exception::class)
            
open fun email()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    logUtil!!.put("Generated Static Pages Notification Email", this, "email")

                                    }
                                

    var storeFrontInterface: StoreFrontInterface = StoreFrontFactory.getInstance(this.storeName)!!


    var adminEmailSubject: String = "Generated Static Pages Email Notification"


    var adminEmailTextBody: String = "Generated static pages for store: " +this.storeName


    var adminBasicEmailInfo: BasicEmailInfo = AdminEmailInfo(adminEmailSubject, adminEmailTextBody) as BasicEmailInfo


    var storeAdminBasicEmailInfo: BasicEmailInfo = StoreEmailInfo(storeFrontInterface, adminEmailSubject, adminEmailTextBody) as BasicEmailInfo


    var storeAdminEmailInfo: EmailInfo = EmailInfo(storeAdminBasicEmailInfo)


    var adminEmailInfo: EmailInfo = EmailInfo(adminBasicEmailInfo)


    var adminUserEmailEventHandler: UserEmailEventHandler = AdminUserEmailEventHandlerSingletons.getInstance()!!.getInstance(this.abeClientInformation, UserEmailEventNameData.STOREGENERATINGSTATICPAGES)!!


    var storeAdminUserEmailEventHandler: UserEmailEventHandler = StoreAdminUserEmailEventHandlerSingletons.getInstance()!!.getInstance(UserEmailEventNameData.STOREGENERATINGSTATICPAGES, this.abeClientInformation, storeFrontInterface)!!

storeAdminUserEmailEventHandler!!.receiveEmailInfo(UserEmailEventNameData.STOREGENERATINGSTATICPAGES, storeAdminEmailInfo)
adminUserEmailEventHandler!!.receiveEmailInfo(UserEmailEventNameData.STOREGENERATINGSTATICPAGES, adminEmailInfo)
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, "email", e)

                                    }
                                
}

}


open fun generateStaticPages()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var contentType: String = AcceptableResponseGenerator.getInstance()!!.get(this.request)!!


    var searchRequest: SearchRequest = SearchRequest(
                            null, this.searchParams, xslFile, contentType, this.getPropertiesHashMap(), this.getPageContext())


    var success: String = ProductListingFactory.getInstance(searchRequest)!!.generateAll(storeName)!!

this.email()

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "generateStaticPages()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var error: String = "Failed to generate staticpages table"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "generateStaticPages()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun makePublic()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var storeFrontInterface: StoreFrontInterface = StoreFrontFactory.getInstance(this.storeName)!!


    var fromAbPath: AbPath = AbPath(storeFrontInterface!!.getTestHtmlPath() +storeFrontInterface!!.getStaticPath())


    var toAbPath: AbPath = AbPath(URLGLOBALS.getWebappPath() +storeFrontInterface!!.getName() +AbPathData.getInstance()!!.SEPARATOR +storeFrontInterface!!.getStaticPath())

FileUtil.getInstance()!!.copy(fromAbPath, toAbPath)

    var success: String = "Made Public"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "makePublic()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var error: String = "Failed to makePublic"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "makePublic()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


}
                
            

