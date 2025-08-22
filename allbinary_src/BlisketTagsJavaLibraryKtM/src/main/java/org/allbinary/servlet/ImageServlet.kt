
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
        package org.allbinary.servlet




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.io.InputStream
import javax.servlet.ServletException
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.CloudStreamUtil
import org.allbinary.logic.io.StreamUtil
import org.allbinary.logic.io.file.AbFile
import org.allbinary.string.CommonStrings

open public class ImageServlet : HttpServlet {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

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

    var requestURI: String = request.getRequestURI()!!


    var file: AbFile = AbFile(URLGLOBALS.getWebappPath() +requestURI)

inputStream= CloudStreamUtil.getInstance()!!.getFileLocal(file)

    var outputStream: ByteArrayOutputStream = ByteArrayOutputStream(8000)


    var byteArray: ByteArray = StreamUtil.getInstance()!!.getByteArray(inputStream, outputStream, ByteArray(16384))!!

response.setContentType("image/jpeg;charset=utf-8")
response.getOutputStream()!!.write(byteArray)
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "processRequest()", e)

                                    }
                                
}

         finally {
            StreamUtil.getInstance()!!.close(response.getOutputStream())

    
                        if(!StreamUtil.getInstance()!!.close(inputStream))
                        
                                    {
                                    response.sendError(HttpServletResponse.SC_NOT_FOUND)

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
                        return "Serves Up Image"
}


}
                
            

