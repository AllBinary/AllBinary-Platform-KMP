
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
        
import java.util.HashMap
import java.util.List
import javax.servlet.http.HttpServletRequest
import javax.servlet.jsp.PageContext
import org.allbinary.logic.communication.http.file.upload.AbFileUploadFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringValidationUtil
import org.apache.commons.fileupload.FileItem
import org.apache.commons.fileupload.FileUploadBase.InvalidContentTypeException

open public class MultipartRequestParams : RequestParams {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var special: Boolean = false
public constructor        (request: HttpServletRequest)                        

                            : super()

        Updates for KMP build        
        {
var request = request


                            //For kotlin this is before the body of the constructor.
                    
this.processMultipartRequest(request)
}

public constructor        (pageContext: PageContext)                        

                            : super()

        Updates for KMP build        
        {
var pageContext = pageContext


                            //For kotlin this is before the body of the constructor.
                    
this.processMultipartRequest(pageContext!!.getRequest() as HttpServletRequest)
}


open fun setSpecial()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.special= true
}


open fun processMultipartRequest(request: HttpServletRequest)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var request = request

        try {
            
    var specialRequest: HashMap<Any, Any> = HashMap<Any, Any>()


    var multipartRequestList: List = AbFileUploadFactory.getInstance()!!.getFileItemStreamList(request)!!


    
                        if(multipartRequestList != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("FileItem List Size: " +multipartRequestList!!.size, this, "processMultipartRequest()")

                                    }
                                

    var fileItemArray: Array<Any?> = multipartRequestList!!.toArray()!!


    var size: Int = fileItemArray!!.size
                





                        for (index in 0 until size)

        

        Updates for KMP build        
        {

    var fileItem: FileItem = fileItemArray[index]!! as FileItem


    var name: String = fileItem!!.getName()!!


    
                        if(StringValidationUtil.getInstance()!!.isEmpty(name))
                        
                                    {
                                    specialRequest!!.put(fileItem!!.getFieldName(), fileItem!!.getString())

                                    }
                                
                        else {
                            specialRequest!!.put(fileItem!!.getFieldName(), fileItem)

                        }
                            
}


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("Special Request Data: " +specialRequest!!.toString(), this, "processMultipartRequest()")

                                    }
                                
this.setSpecial()
this.setMap(specialRequest)

                                    }
                                
} catch(e: InvalidContentTypeException)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("Using Normal RequestParams", this, "processMultipartRequest()")

                                    }
                                
super.setMap(request.getParameterMap())
}
 catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUESTERROR))
                        
                                    {
                                    logUtil!!.put("Should Not Occur", this, "processMultipartRequest()")

                                    }
                                
super.setMap(request.getParameterMap())
}

}


                @Throws(Exception::class)
            
open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>

        Updates for KMP build        
        {

    
                        if(this.special)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getMap() as HashMap<Any, Any>

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.toHashMap()

                        }
                            
}


}
                
            

