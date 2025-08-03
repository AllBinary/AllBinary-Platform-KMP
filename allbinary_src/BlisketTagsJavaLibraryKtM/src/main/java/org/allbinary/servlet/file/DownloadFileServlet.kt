
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
        package org.allbinary.servlet.file



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.IOException
import java.io.InputStream
import java.util.HashMap
import javax.servlet.ServletException
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import admin.taghelpers.AuthenticationHelper
import admin.taghelpers.AuthenticationHelperFactory
import admin.taghelpers.AuthenticationHelperUtil
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.CloudStreamUtil
import org.allbinary.logic.io.StreamUtil
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.servlet.BlisketServletUtil
import org.allbinary.string.CommonStrings

open public class DownloadFileServlet : HttpServlet {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val DOWNLOAD: String = "download"

    private val DEFAULT_BUFFER_SIZE: Int = 16384

                @Throws(ServletException::class, IOException::class)
            
open fun processRequest(request: HttpServletRequest, response: HttpServletResponse)
        //nullable = true from not(false or (false and false)) = true
{

                    var request = request


                    var response = response

    var inputStream: InputStream = 
                null
            


        try {
            BlisketServletUtil.getInstance()!!.init(request)

    var requestPath: String = request!!.getRequestURI()!!
            


    
                        if(requestPath == 
                                    null
                                )
                        
                                    {
                                    response!!.sendError(HttpServletResponse.SC_NOT_FOUND)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    var beginIndex: Int = requestPath!!.indexOf(DOWNLOAD)!!
            


    var filePath: String = StringUtil.getInstance()!!.EMPTY_STRING


    
                        if(beginIndex >= 0)
                        
                                    {
                                    filePath= requestPath!!.substring(beginIndex +DOWNLOAD.length)

                                    }
                                
                        else {
                            response!!.sendError(HttpServletResponse.SC_NOT_FOUND)

                        }
                            

    var file: AbFile = AbFile(URLGLOBALS.getWebappPath() +filePath)


    
                        if(!file!!.exists())
                        
                                    {
                                    response!!.sendError(HttpServletResponse.SC_NOT_FOUND)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()


    var authenticationHelper: AuthenticationHelper = AuthenticationHelperFactory().
                            getInstance(hashMap, request) as AuthenticationHelper


    
                        if(authenticationHelper!!.isAuthenticated())
                        
                                    {
                                    
    
                        if(AuthenticationHelperUtil.getInstance()!!.isAuthorized(authenticationHelper, filePath))
                        
                                    {
                                    inputStream= CloudStreamUtil.getInstance()!!.getFile(file)

    var contentType: String = getServletContext()!!.getMimeType(file!!.getName())!!
            


    
                        if(contentType == 
                                    null
                                )
                        
                                    {
                                    contentType= 
                                    //Otherwise - expression - AssignExpr - value - StringLiteralExpr


                                    }
                                
response!!.reset()
response!!.setBufferSize(DEFAULT_BUFFER_SIZE)
response!!.setContentType(contentType)
response!!.setHeader(
                            "Content-Length", String.valueOf(file!!.length))

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "attachment; filename=\"")
stringBuffer!!.append(file!!.getName())
stringBuffer!!.append(
                            "\"")
response!!.setHeader(
                            "Content-Disposition", stringBuffer!!.toString())
StreamUtil.getInstance()!!.get(inputStream, response!!.getOutputStream(), ByteArray(16348))

                                    }
                                
                        else {
                            response!!.sendError(HttpServletResponse.SC_UNAUTHORIZED, 
                            "You are not Authorized")

                        }
                            

                                    }
                                
                        else {
                            response!!.sendError(HttpServletResponse.SC_UNAUTHORIZED, 
                            "Please Login")

                        }
                            
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.EXCEPTION, this, 
                            "processRequest()", e)

                                    }
                                
response!!.sendError(HttpServletResponse.SC_NOT_FOUND)
}

         finally {
            StreamUtil.getInstance()!!.close(response!!.getOutputStream())

    
                        if(!StreamUtil.getInstance()!!.close(inputStream))
                        
                                    {
                                    
                                    }
                                

         }
        
}


                @Throws(ServletException::class, IOException::class)
            
open fun doGet(request: HttpServletRequest, response: HttpServletResponse)
        //nullable = true from not(false or (false and false)) = true
{

                    var request = request


                    var response = response
processRequest(request, response)
}


                @Throws(ServletException::class, IOException::class)
            
open fun doPost(request: HttpServletRequest, response: HttpServletResponse)
        //nullable = true from not(false or (false and false)) = true
{

                    var request = request


                    var response = response
processRequest(request, response)
}


open fun getServletInfo()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Serves Up Cloud Files"
}


}
                
            

