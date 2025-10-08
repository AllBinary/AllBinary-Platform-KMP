
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
        package org.allbinary.logic.communication.http.request




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.servlet.RequestDispatcher
import javax.servlet.ServletException
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import javax.servlet.jsp.JspTagException
import javax.servlet.jsp.PageContext
import org.allbinary.globals.FREEBLISKET_PATH_GLOBALS
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory
import org.allbinary.logic.communication.log.config.type.LogConfigTypes

open public class AbResponseHandler
            : Object
         {
        
companion object {
            
                @Throws(JspTagException::class)
            
    open fun sendJspTagRedirect(pageContext: PageContext, e: Exception)
        //nullable = true from not(false or (false and false)) = true
{
var pageContext = pageContext
var e = e

    var logUtil: LogUtil = LogUtil.getInstance()!!


        try {
            
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.JSPTAGERROR))
                        
                                    {
                                    logUtil!!.put("Jsp Tag Exception", "AbResponseHandler", "sendJspRedirect()", e)

                                    }
                                
AbResponseHandler.sendRedirect(pageContext, FREEBLISKET_PATH_GLOBALS.getInstance()!!.ERRORPAGE)
} catch(e2: Exception)
            {

    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.LICENSINGERROR))
                        
                                    {
                                    logUtil!!.put("Exception in Redirect Handling", "AbResponseHandler", "sendJspRedirect", e)

                                    }
                                



                            throw JspTagException()
}

}


                @Throws(ServletException::class)
            
    open fun sendServletRedirect(pageContext: PageContext, e: Exception)
        //nullable = true from not(false or (false and false)) = true
{
var pageContext = pageContext
var e = e

    var logUtil: LogUtil = LogUtil.getInstance()!!


        try {
            
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.JSPTAGERROR))
                        
                                    {
                                    logUtil!!.put("Jsp Tag Exception", "AbResponseHandler", "sendJspRedirect()", e)

                                    }
                                
AbResponseHandler.sendRedirect(pageContext, FREEBLISKET_PATH_GLOBALS.getInstance()!!.ERRORPAGE)
} catch(e2: Exception)
            {

    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.LICENSINGERROR))
                        
                                    {
                                    logUtil!!.put("Exception in Redirect Handling", "AbResponseHandler", "sendJspRedirect", e)

                                    }
                                



                            throw ServletException()
}

}


                @Throws(JspTagException::class)
            
    open fun sendJspTagLicensingRedirect(pageContext: PageContext, e: Exception)
        //nullable = true from not(false or (false and false)) = true
{
var pageContext = pageContext
var e = e

    var logUtil: LogUtil = LogUtil.getInstance()!!


        try {
            
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.JSPTAGERROR))
                        
                                    {
                                    logUtil!!.put("Licensing Exception", "AbResponseHandler", "sendJspTagLicensingRedirect()", e)

                                    }
                                
AbResponseHandler.sendRedirect(pageContext, FREEBLISKET_PATH_GLOBALS.getInstance()!!.LICENSEERRORPAGE)
} catch(e2: Exception)
            {

    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.LICENSINGERROR))
                        
                                    {
                                    logUtil!!.put("Exception in Redirect Handling", "AbResponseHandler", "sendJspTagLicensingRedirect", e)

                                    }
                                



                            throw JspTagException()
}

}


                @Throws(ServletException::class)
            
    open fun sendServletLicensingRedirect(pageContext: PageContext, e: Exception)
        //nullable = true from not(false or (false and false)) = true
{
var pageContext = pageContext
var e = e

    var logUtil: LogUtil = LogUtil.getInstance()!!


        try {
            
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.JSPTAGERROR))
                        
                                    {
                                    logUtil!!.put("Licensing Exception", "AbResponseHandler", "sendServletLicensingRedirect()", e)

                                    }
                                
AbResponseHandler.sendRedirect(pageContext, FREEBLISKET_PATH_GLOBALS.getInstance()!!.LICENSEERRORPAGE)
} catch(e2: Exception)
            {

    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.LICENSINGERROR))
                        
                                    {
                                    logUtil!!.put("Exception in Redirect Handling", "AbResponseHandler", "sendServletLicensingRedirect", e)

                                    }
                                



                            throw ServletException()
}

}


                @Throws(Exception::class)
            
    open fun sendRedirect(pageContext: PageContext, page: String)
        //nullable = true from not(false or (false and false)) = true
{
var pageContext = pageContext
var page = page

    var request: HttpServletRequest = pageContext!!.getRequest() as HttpServletRequest


    var response: HttpServletResponse = pageContext!!.getResponse() as HttpServletResponse


    var requestDispatcher: RequestDispatcher = request.getRequestDispatcher(page)!!


    
                        if(response.isCommitted())
                        
                                    {
                                    response.sendRedirect(page)

                                    }
                                
                        else {
                            
        try {
            requestDispatcher!!.forward(request, response)
} catch(e: Exception)
            {
pageContext!!.getOut()!!.print("Error: " +page)
}


                        }
                            
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
private constructor ()
            : super()
        {
}


}
                
            

