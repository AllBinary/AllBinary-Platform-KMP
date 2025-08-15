
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
        
import java.util.ArrayList
import java.util.List
import javax.servlet.http.HttpServletRequest
import org.allbinary.logic.communication.http.AbFileItemFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.apache.commons.fileupload.FileItemIterator
import org.apache.commons.fileupload.FileItemStream
import org.apache.commons.fileupload.FileItemUtil

open public class AbFileUploadFactory
            : Object
         {
        

        companion object {
            
    private val instance: AbFileUploadFactory = AbFileUploadFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AbFileUploadFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            
private constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun getFileItemStreamList(httpServletRequest: HttpServletRequest)
        //nullable = true from not(false or (false and false)) = true
: List{

                    var httpServletRequest = httpServletRequest

        try {
            
    var fileUpload: AbFileUpload = AbFileUpload(AbFileItemFactory())


    var iterator: FileItemIterator = fileUpload!!.getItemIterator(httpServletRequest)!!
            


    var items: List = ArrayList()


        while(iterator.hasNext())
        {
    var fileItemStream: FileItemStream = iterator.next()!!
            

HttpFileUploadUtil.log(fileItemStream)

    var fileItem: AbFileItem = AbFileItem(fileItemStream!!.getName(), fileItemStream!!.getFieldName(), FileItemUtil.getInstance()!!.encodeToByteArray())

items.add(fileItem)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return items
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPERROR))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, "get()", e)

                                    }
                                



                            throw e
}

}


                @Throws(Exception::class)
            
open fun getFileItemList(httpServletRequest: HttpServletRequest)
        //nullable = true from not(false or (false and false)) = true
: List{

                    var httpServletRequest = httpServletRequest

        try {
            
    var abFileUpload: AbFileUpload = AbFileUpload(AbFileItemFactory())




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return abFileUpload!!.parseRequest(httpServletRequest)
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "get()", e)

                                    }
                                



                            throw e
}

}


}
                
            

