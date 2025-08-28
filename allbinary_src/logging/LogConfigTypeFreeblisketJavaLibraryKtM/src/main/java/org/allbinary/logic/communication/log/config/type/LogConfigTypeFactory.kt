
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        package org.allbinary.logic.communication.log.config.type




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.string.CommonStrings

open public class LogConfigTypeFactory
            : Object
         {
        

        companion object {
            
    private val instance: LogConfigTypeFactory = LogConfigTypeFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: LogConfigTypeFactory

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private val NO_DESCRIPTION: String = "No Description"

    val AUTHENTICATION: LogConfigType = LogConfigType("Authentication", NO_DESCRIPTION)

    val AUTHENTICATIONERROR: LogConfigType = LogConfigType("Authentication Error", NO_DESCRIPTION)

    val CATEGORY: LogConfigType = LogConfigType("Category", NO_DESCRIPTION)

    val CATEGORYERROR: LogConfigType = LogConfigType("Category Error", NO_DESCRIPTION)

    val CRYPT: LogConfigType = LogConfigType("Crypt", NO_DESCRIPTION)

    val CRYPTERROR: LogConfigType = LogConfigType("Crypt Error", NO_DESCRIPTION)

    val EMAILLOGGING: LogConfigType = LogConfigType("Email", NO_DESCRIPTION)

    val EMAILLOGGINGERROR: LogConfigType = LogConfigType("Email Error", NO_DESCRIPTION)

    val ENTITYFACTORYERROR: LogConfigType = LogConfigType("Entity Factory Error", NO_DESCRIPTION)

    val NETBEANS_MODULE: LogConfigType = LogConfigType("NetBeans Module", NO_DESCRIPTION)

    val NETBEANS_MODULE_ERROR: LogConfigType = LogConfigType("NetBeans Module Error", NO_DESCRIPTION)

    val FACTORYERROR: LogConfigType = LogConfigType("General Factory Error", NO_DESCRIPTION)

    val FILE: LogConfigType = LogConfigType("File", NO_DESCRIPTION)

    val FILEERROR: LogConfigType = LogConfigType("File Error", NO_DESCRIPTION)

    val HTTP: LogConfigType = LogConfigType("HTTP", NO_DESCRIPTION)

    val HTTPERROR: LogConfigType = LogConfigType("HTTP Error", NO_DESCRIPTION)

    val HTTPREQUEST: LogConfigType = LogConfigType("Http Request", NO_DESCRIPTION)

    val HTTPREQUESTERROR: LogConfigType = LogConfigType("Http Request Error", NO_DESCRIPTION)

    val IDLOGGING: LogConfigType = LogConfigType("ID Logging", NO_DESCRIPTION)

    val JSPEXTRAOUTPUT: LogConfigType = LogConfigType("JSP Extra Output", NO_DESCRIPTION)

    val JSPTAGEXTRAOUTPUT: LogConfigType = LogConfigType("JSP Tag Extra Output", NO_DESCRIPTION)

    val JSPTAG: LogConfigType = LogConfigType("JSP Tag", NO_DESCRIPTION)

    val JSPTAGERROR: LogConfigType = LogConfigType("JSP Tag Error", NO_DESCRIPTION)

    val LICENSING: LogConfigType = LogConfigType("Licensing", NO_DESCRIPTION)

    val LICENSINGERROR: LogConfigType = LogConfigType("Licensing Error", NO_DESCRIPTION)

    val LOADER: LogConfigType = LogConfigType("Loader", NO_DESCRIPTION)

    val LOADERERROR: LogConfigType = LogConfigType("Loader Error", NO_DESCRIPTION)

    val OS: LogConfigType = LogConfigType("OS", NO_DESCRIPTION)

    val OSERROR: LogConfigType = LogConfigType("OS Error", NO_DESCRIPTION)

    val PAYMENT: LogConfigType = LogConfigType("Payment", NO_DESCRIPTION)

    val PAYMENTERROR: LogConfigType = LogConfigType("Payment Error", NO_DESCRIPTION)

    val PRELOADER: LogConfigType = LogConfigType("PreLoader", NO_DESCRIPTION)

    val PRELOADERERROR: LogConfigType = LogConfigType("PreLoader Error", NO_DESCRIPTION)

    val PRODUCTSEARCHLOGGING: LogConfigType = LogConfigType("Product Search Logging", NO_DESCRIPTION)

    val PRODUCTSEARCHLOGGINGERROR: LogConfigType = LogConfigType("Product Search Logging Error", NO_DESCRIPTION)

    val SERVLET: LogConfigType = LogConfigType("Servlet", NO_DESCRIPTION)

    val SERVLETERROR: LogConfigType = LogConfigType("Servlet Error", NO_DESCRIPTION)

    val SHIPPINGERROR: LogConfigType = LogConfigType("Shipping Error", NO_DESCRIPTION)

    val SQLLOGGINGERROR: LogConfigType = LogConfigType("SQL Error", NO_DESCRIPTION)

    val SQLLOGGING: LogConfigType = LogConfigType("SQL Logging", NO_DESCRIPTION)

    val SQLTAGS: LogConfigType = LogConfigType("SQL Tag Logging", NO_DESCRIPTION)

    val SQLTAGSERROR: LogConfigType = LogConfigType("SQL Tag Error", NO_DESCRIPTION)

    val STYLE: LogConfigType = LogConfigType("Style", NO_DESCRIPTION)

    val STYLEERROR: LogConfigType = LogConfigType("Style Error", NO_DESCRIPTION)

    val TAGHELPER: LogConfigType = LogConfigType("Tag Helper", NO_DESCRIPTION)

    val TAGHELPERERROR: LogConfigType = LogConfigType("Tag Helper Error", NO_DESCRIPTION)

    val TAGHELPERFACTORY: LogConfigType = LogConfigType("Tag Helper Factory", NO_DESCRIPTION)

    val TAGHELPERFACTORYERROR: LogConfigType = LogConfigType("Tag Helper Factory Error", NO_DESCRIPTION)

    val TAX: LogConfigType = LogConfigType("Tax", NO_DESCRIPTION)

    val TAXERROR: LogConfigType = LogConfigType("Tax Error", NO_DESCRIPTION)

    val VALIDATION: LogConfigType = LogConfigType("Validation", NO_DESCRIPTION)

    val VALIDATIONERROR: LogConfigType = LogConfigType("Validation Error", NO_DESCRIPTION)

    val VIEW: LogConfigType = LogConfigType("View", NO_DESCRIPTION)

    val VIEWERROR: LogConfigType = LogConfigType("View Error", NO_DESCRIPTION)

    val VIEWFACTORYERROR: LogConfigType = LogConfigType("View Factory Error", NO_DESCRIPTION)

    val WORKFLOW: LogConfigType = LogConfigType("Workflow", NO_DESCRIPTION)

    val WORKFLOWERROR: LogConfigType = LogConfigType("Workflow Error", NO_DESCRIPTION)

    val XMLLOGGING: LogConfigType = LogConfigType("XML Logging", NO_DESCRIPTION)

    val XMLLOGGINGERROR: LogConfigType = LogConfigType("XML Logging Error", NO_DESCRIPTION)

    val XSLLOGGING: LogConfigType = LogConfigType("XSL Logging", NO_DESCRIPTION)

    val XSLLOGGINGERROR: LogConfigType = LogConfigType("XSL Logging Error", NO_DESCRIPTION)

    val REPLACE: LogConfigType = LogConfigType("Replace", NO_DESCRIPTION)

    val REPLACE_INFO: LogConfigType = LogConfigType("Replace Info", NO_DESCRIPTION)

    val REPLACEERROR: LogConfigType = LogConfigType("Replace Error", NO_DESCRIPTION)

    val SQLLOGGINGPOOL: LogConfigType = LogConfigType("SQL Pool", NO_DESCRIPTION)

    val SQLLOGGINGPOOLERROR: LogConfigType = LogConfigType("SQL Pool Error", NO_DESCRIPTION)

    val STATICPAGEGENERATIONLOGGING: LogConfigType = LogConfigType("Static Page Generation Logging", NO_DESCRIPTION)

    val STATICPAGEGENERATIONLOGGINGERROR: LogConfigType = LogConfigType("Static Page Generation Logging Error", NO_DESCRIPTION)
private constructor        ()
            : super()
        

        Updates for KMP build        
        {
PreLogUtil.put("FreeBlisket", this, CommonStrings.getInstance()!!.CONSTRUCTOR)
}


}
                
            

