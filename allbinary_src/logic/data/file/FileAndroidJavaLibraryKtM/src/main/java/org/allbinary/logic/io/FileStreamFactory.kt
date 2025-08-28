
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
        package org.allbinary.logic.io




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import android.content.Context
import org.allbinary.data.resource.ResourceUtil
import org.allbinary.logic.NullUtil

open public class FileStreamFactory
            : Object
         {
        

        companion object {
            
    private val SINGLETON: FileStreamFactory = FileStreamFactory(ResourceUtil.getInstance()!!.getContext())

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: FileStreamFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
    private var context: Any
private constructor        (context: Context)
            : super()
        {
    //var context = context
this.context= context
}


                @Throws(Exception::class)
            
open fun getFileInputStreamInstance(path: String, fileName: String)
        //nullable = true from not(false or (false and false)) = true
: AbFileInputStream{
    //var path = path
    //var fileName = fileName



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbFileInputStream(this.getContext()!!.openFileInput(fileName))
}


                @Throws(Exception::class)
            
open fun getFileOutputStreamInstance(path: String, fileName: String)
        //nullable = true from not(false or (false and false)) = true
: AbFileOutputStream{
    //var path = path
    //var fileName = fileName

    var context: Context = this.getContext()!!

context.deleteFile(fileName)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbFileOutputStream(context.openFileOutput(fileName, 0))
}


                @Throws(Exception::class)
            
open fun delete(path: String, fileName: String)
        //nullable = true from not(false or (false and false)) = true
{
    //var path = path
    //var fileName = fileName
this.getContext()!!.deleteFile(fileName)
}


open fun getContext()
        //nullable = true from not(false or (false and true)) = true
: Context{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return context as Context
}


}
                
            

