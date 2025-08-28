
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
        package org.allbinary.logic.communication.http.file.upload




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.java.anyType.clazz.ClassUtil
import org.allbinary.logic.string.StringMaker
import org.apache.commons.fileupload.FileItem
import org.apache.commons.fileupload.FileItemStream

open public class HttpFileUploadUtil
            : Object
         {
        

        companion object {
            
    private val instance: HttpFileUploadUtil = HttpFileUploadUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: HttpFileUploadUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


                @Throws(Exception::class)
            
open fun log(fileItem: FileItemStream)
        //nullable = true from not(false or (false and false)) = true
{
var fileItem = fileItem

    var logUtil: LogUtil = LogUtil.getInstance()!!


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("FileItem Log:")
stringBuffer!!.append("\n")
stringBuffer!!.append("Content Type:")
stringBuffer!!.append(fileItem!!.getContentType())
stringBuffer!!.append("\n")
stringBuffer!!.append("Field Name:")
stringBuffer!!.append(fileItem!!.getFieldName())
stringBuffer!!.append("\n")
stringBuffer!!.append("Name:")
stringBuffer!!.append(fileItem!!.getName())
stringBuffer!!.append("\n")
stringBuffer!!.append("Size:")
stringBuffer!!.append(" Not Calculated Yet")

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTP))
                        
                                    {
                                    logUtil!!.put(stringBuffer!!.toString(), getInstance(), "log()")

                                    }
                                
}


open fun log(fileItem: FileItem)
        //nullable = true from not(false or (false and false)) = true
{
var fileItem = fileItem

    var logUtil: LogUtil = LogUtil.getInstance()!!


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("FileItem Log:")
stringBuffer!!.append("\n")
stringBuffer!!.append("Content Type:")
stringBuffer!!.append(fileItem!!.getContentType())
stringBuffer!!.append("\n")
stringBuffer!!.append("Field Name:")
stringBuffer!!.append(fileItem!!.getFieldName())
stringBuffer!!.append("\n")
stringBuffer!!.append("Name:")
stringBuffer!!.append(fileItem!!.getName())
stringBuffer!!.append("\n")
stringBuffer!!.append("Size:")
stringBuffer!!.append(fileItem!!.getSize())

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put(stringBuffer!!.toString(), getInstance(), "log()")

                                    }
                                
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
private constructor        ()
            : super()
        {
}


                @Throws(Exception::class)
            
open fun isValid(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var anyType = anyType

    
                        if(anyType != 
                                    null
                                 && !(anyType is String))
                        
                                    {
                                    
    
                        if(anyType is FileItem)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                            throw Exception("Object Not Instance Of FileItem but is: " +ClassUtil.viewAll(anyType, "\n"))

                        }
                            

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

