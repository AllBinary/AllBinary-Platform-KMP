
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
: LogConfigTypeFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return LogConfigTypeFactory.instance
}


        }
            
    private val NO_DESCRIPTION: String = "No Description"

    val AUTHENTICATION: LogConfigType = LogConfigType("Authentication", this.NO_DESCRIPTION)

    val AUTHENTICATIONERROR: LogConfigType = LogConfigType("Authentication Error", this.NO_DESCRIPTION)

    val CATEGORY: LogConfigType = LogConfigType("Category", this.NO_DESCRIPTION)

    val CATEGORYERROR: LogConfigType = LogConfigType("Category Error", this.NO_DESCRIPTION)

    val CRYPT: LogConfigType = LogConfigType("Crypt", this.NO_DESCRIPTION)

    val CRYPTERROR: LogConfigType = LogConfigType("Crypt Error", this.NO_DESCRIPTION)

    val EMAILLOGGING: LogConfigType = LogConfigType("Email", this.NO_DESCRIPTION)

    val EMAILLOGGINGERROR: LogConfigType = LogConfigType("Email Error", this.NO_DESCRIPTION)

    val ENTITYFACTORYERROR: LogConfigType = LogConfigType("Entity Factory Error", this.NO_DESCRIPTION)

    val NETBEANS_MODULE: LogConfigType = LogConfigType("NetBeans Module", this.NO_DESCRIPTION)

    val NETBEANS_MODULE_ERROR: LogConfigType = LogConfigType("NetBeans Module Error", this.NO_DESCRIPTION)

    val FACTORYERROR: LogConfigType = LogConfigType("General Factory Error", this.NO_DESCRIPTION)

    val FILE: LogConfigType = LogConfigType("File", this.NO_DESCRIPTION)

    val FILEERROR: LogConfigType = LogConfigType("File Error", this.NO_DESCRIPTION)

    val HTTP: LogConfigType = LogConfigType("HTTP", this.NO_DESCRIPTION)

    val HTTPERROR: LogConfigType = LogConfigType("HTTP Error", this.NO_DESCRIPTION)

    val HTTPREQUEST: LogConfigType = LogConfigType("Http Request", this.NO_DESCRIPTION)

    val HTTPREQUESTERROR: LogConfigType = LogConfigType("Http Request Error", this.NO_DESCRIPTION)

    val IDLOGGING: LogConfigType = LogConfigType("ID Logging", this.NO_DESCRIPTION)

    val JSPEXTRAOUTPUT: LogConfigType = LogConfigType("JSP Extra Output", this.NO_DESCRIPTION)

    val JSPTAGEXTRAOUTPUT: LogConfigType = LogConfigType("JSP Tag Extra Output", this.NO_DESCRIPTION)

    val JSPTAG: LogConfigType = LogConfigType("JSP Tag", this.NO_DESCRIPTION)

    val JSPTAGERROR: LogConfigType = LogConfigType("JSP Tag Error", this.NO_DESCRIPTION)

    val LICENSING: LogConfigType = LogConfigType("Licensing", this.NO_DESCRIPTION)

    val LICENSINGERROR: LogConfigType = LogConfigType("Licensing Error", this.NO_DESCRIPTION)

    val LOADER: LogConfigType = LogConfigType("Loader", this.NO_DESCRIPTION)

    val LOADERERROR: LogConfigType = LogConfigType("Loader Error", this.NO_DESCRIPTION)

    val OS: LogConfigType = LogConfigType("OS", this.NO_DESCRIPTION)

    val OSERROR: LogConfigType = LogConfigType("OS Error", this.NO_DESCRIPTION)

    val PAYMENT: LogConfigType = LogConfigType("Payment", this.NO_DESCRIPTION)

    val PAYMENTERROR: LogConfigType = LogConfigType("Payment Error", this.NO_DESCRIPTION)

    val PRELOADER: LogConfigType = LogConfigType("PreLoader", this.NO_DESCRIPTION)

    val PRELOADERERROR: LogConfigType = LogConfigType("PreLoader Error", this.NO_DESCRIPTION)

    val PRODUCTSEARCHLOGGING: LogConfigType = LogConfigType("Product Search Logging", this.NO_DESCRIPTION)

    val PRODUCTSEARCHLOGGINGERROR: LogConfigType = LogConfigType("Product Search Logging Error", this.NO_DESCRIPTION)

    val SERVLET: LogConfigType = LogConfigType("Servlet", this.NO_DESCRIPTION)

    val SERVLETERROR: LogConfigType = LogConfigType("Servlet Error", this.NO_DESCRIPTION)

    val SHIPPINGERROR: LogConfigType = LogConfigType("Shipping Error", this.NO_DESCRIPTION)

    val SQLLOGGINGERROR: LogConfigType = LogConfigType("SQL Error", this.NO_DESCRIPTION)

    val SQLLOGGING: LogConfigType = LogConfigType("SQL Logging", this.NO_DESCRIPTION)

    val SQLTAGS: LogConfigType = LogConfigType("SQL Tag Logging", this.NO_DESCRIPTION)

    val SQLTAGSERROR: LogConfigType = LogConfigType("SQL Tag Error", this.NO_DESCRIPTION)

    val STYLE: LogConfigType = LogConfigType("Style", this.NO_DESCRIPTION)

    val STYLEERROR: LogConfigType = LogConfigType("Style Error", this.NO_DESCRIPTION)

    val TAGHELPER: LogConfigType = LogConfigType("Tag Helper", this.NO_DESCRIPTION)

    val TAGHELPERERROR: LogConfigType = LogConfigType("Tag Helper Error", this.NO_DESCRIPTION)

    val TAGHELPERFACTORY: LogConfigType = LogConfigType("Tag Helper Factory", this.NO_DESCRIPTION)

    val TAGHELPERFACTORYERROR: LogConfigType = LogConfigType("Tag Helper Factory Error", this.NO_DESCRIPTION)

    val TAX: LogConfigType = LogConfigType("Tax", this.NO_DESCRIPTION)

    val TAXERROR: LogConfigType = LogConfigType("Tax Error", this.NO_DESCRIPTION)

    val VALIDATION: LogConfigType = LogConfigType("Validation", this.NO_DESCRIPTION)

    val VALIDATIONERROR: LogConfigType = LogConfigType("Validation Error", this.NO_DESCRIPTION)

    val VIEW: LogConfigType = LogConfigType("View", this.NO_DESCRIPTION)

    val VIEWERROR: LogConfigType = LogConfigType("View Error", this.NO_DESCRIPTION)

    val VIEWFACTORYERROR: LogConfigType = LogConfigType("View Factory Error", this.NO_DESCRIPTION)

    val WORKFLOW: LogConfigType = LogConfigType("Workflow", this.NO_DESCRIPTION)

    val WORKFLOWERROR: LogConfigType = LogConfigType("Workflow Error", this.NO_DESCRIPTION)

    val XMLLOGGING: LogConfigType = LogConfigType("XML Logging", this.NO_DESCRIPTION)

    val XMLLOGGINGERROR: LogConfigType = LogConfigType("XML Logging Error", this.NO_DESCRIPTION)

    val XSLLOGGING: LogConfigType = LogConfigType("XSL Logging", this.NO_DESCRIPTION)

    val XSLLOGGINGERROR: LogConfigType = LogConfigType("XSL Logging Error", this.NO_DESCRIPTION)

    val REPLACE: LogConfigType = LogConfigType("Replace", this.NO_DESCRIPTION)

    val REPLACE_INFO: LogConfigType = LogConfigType("Replace Info", this.NO_DESCRIPTION)

    val REPLACEERROR: LogConfigType = LogConfigType("Replace Error", this.NO_DESCRIPTION)

    val SQLLOGGINGPOOL: LogConfigType = LogConfigType("SQL Pool", this.NO_DESCRIPTION)

    val SQLLOGGINGPOOLERROR: LogConfigType = LogConfigType("SQL Pool Error", this.NO_DESCRIPTION)

    val STATICPAGEGENERATIONLOGGING: LogConfigType = LogConfigType("Static Page Generation Logging", this.NO_DESCRIPTION)

    val STATICPAGEGENERATIONLOGGINGERROR: LogConfigType = LogConfigType("Static Page Generation Logging Error", this.NO_DESCRIPTION)
private constructor ()
            : super()
        {
PreLogUtil.put("FreeBlisket", this, CommonStrings.getInstance()!!.CONSTRUCTOR)
}


}
                
            

