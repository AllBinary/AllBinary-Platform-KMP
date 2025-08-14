
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
        
import java.io.IOException
import javax.servlet.http.HttpServletRequest
import org.apache.commons.fileupload.FileItemFactory
import org.apache.commons.fileupload.FileItemIterator
import org.apache.commons.fileupload.FileUpload
import org.apache.commons.fileupload.FileUploadException
import org.apache.commons.fileupload.servlet.ServletRequestContext

open public class AbFileUpload : FileUpload {
        
public constructor        (fileItemFactory: FileItemFactory)                        

                            : super(fileItemFactory){

                    var fileItemFactory = fileItemFactory


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(FileUploadException::class, IOException::class)
            
open fun getItemIterator(request: HttpServletRequest)
        //nullable = true from not(false or (false and false)) = true
: FileItemIterator{

                    var request = request



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.getItemIterator(ServletRequestContext(request))
}


}
                
            

