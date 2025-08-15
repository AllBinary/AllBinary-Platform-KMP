
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




        import java.lang.Object        
        
        
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
import org.allbinary.logic.communication.http.file.upload.FileUploadData
import org.allbinary.logic.communication.http.file.upload.HttpFileUploadUtil
import org.allbinary.logic.communication.http.request.HttpRequestUtil
import org.allbinary.logic.communication.http.request.MultipartRequestParams
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.AbFileOutputStream
import org.allbinary.logic.io.StreamUtil
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.string.StringMaker
import org.allbinary.servlet.BlisketServletUtil
import org.allbinary.string.CommonStrings
import org.apache.commons.fileupload.FileItem

open public class UploadFileServlet : HttpServlet {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    var requestHashMap: HashMap<Any, Any>

    private var fileName: String

                @Throws(ServletException::class, IOException::class)
            
open fun processRequest(request: HttpServletRequest, response: HttpServletResponse)
        //nullable = true from not(false or (false and false)) = true
{

                    var request = request


                    var response = response

    var isError: Boolean = false


    var inputStream: InputStream = 
                null
            


        try {
            BlisketServletUtil.getInstance()!!.init(request)
this.requestHashMap= MultipartRequestParams(request).
                            toHashMap()

    var filePath: String = this.requestHashMap!!.get(FileUploadData.getInstance()!!.UPLOAD_TO_FILE_PATH) as String


    
                        if(filePath == 
                                    null
                                )
                        
                                    {
                                    isError= true
response.sendError(HttpServletResponse.SC_NOT_FOUND)



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
                                    this.saveFile(filePath)
response.setContentType("text/plain")
response.getOutputStream()!!.write("OK!".encodeToByteArray())

                                    }
                                
                        else {
                            isError= true
response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "You are not Authorized")

                        }
                            

                                    }
                                
                        else {
                            isError= true
response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Please Login")

                        }
                            
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "processRequest()", e)

                                    }
                                
isError= true
response.sendError(HttpServletResponse.SC_NOT_FOUND)
}

         finally {
            
    
                        if(!isError)
                        
                                    {
                                    StreamUtil.getInstance()!!.close(response.getOutputStream())

                                    }
                                

    
                        if(!StreamUtil.getInstance()!!.close(inputStream))
                        
                                    {
                                    
                                    }
                                

         }
        
}


                @Throws(Exception::class)
            
open fun saveFile(filePath: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var filePath = filePath

    var fileOutputStream: AbFileOutputStream = 
                null
            


        try {
            
    var fileItem: FileItem = this.requestHashMap!!.get(FileUploadData.getInstance()!!.FILE_DATA) as FileItem


    
                        if(fileItem != 
                                    null
                                 && fileItem!!.getSize() > 1)
                        
                                    {
                                    this.fileName= HttpRequestUtil.getInstance()!!.generateFileName(fileItem!!.getName())

    
                        if(filePath!!.endsWith("/") || filePath!!.endsWith("\\"))
                        
                                    {
                                    filePath= filePath +this.fileName

                                    }
                                

    var file: AbFile = AbFile(URLGLOBALS.getWebappPath() +filePath)


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Uploaded File: ")
stringBuffer!!.append(this.fileName)
stringBuffer!!.append(" New File: ")
stringBuffer!!.append(file.getPath())
logUtil!!.put(stringBuffer!!.toString(), this, "saveFile()")

                                    }
                                
HttpFileUploadUtil.log(fileItem)

    var byteArray: ByteArray = fileItem!!.get()!!
            


    
                        if(file.isFile())
                        
                                    {
                                    file.delete()
file.createNewFile()

                                    }
                                
fileOutputStream= AbFileOutputStream(file)
fileOutputStream!!.write(byteArray)

                                    }
                                

         finally {
            
    
                        if(fileOutputStream != 
                                    null
                                )
                        
                                    {
                                    fileOutputStream!!.close()

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
                        return "Upload Cloud Files"
}


}
                
            

