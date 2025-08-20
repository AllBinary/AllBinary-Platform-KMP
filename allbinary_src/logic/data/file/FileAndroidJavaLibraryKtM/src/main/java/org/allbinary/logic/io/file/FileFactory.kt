
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
        package org.allbinary.logic.io.file




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.File
import java.io.FileNotFoundException
import android.content.Context
import org.allbinary.data.resource.ResourceUtil

open public class FileFactory
            : Object
         {
        

        companion object {
            
    private val SINGLETON: FileFactory = FileFactory(ResourceUtil.getInstance()!!.getContext())

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: FileFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
    private var context: Context
private constructor        (context: Context)
            : super()
        {

                    var context = context
this.context= context
}


                @Throws(Exception::class)
            
open fun isFile(path: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var path = path

        try {
            context.openFileInput(path)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
} catch(e: FileNotFoundException)
            {


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


open fun getContext()
        //nullable = true from not(false or (false and true)) = true
: Context{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return context
}


                @Throws(Exception::class)
            
open fun getFile(filePath: String)
        //nullable = true from not(false or (false and false)) = true
: AbFile{

                    var filePath = filePath



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbFile(filePath, false)
}


                @Throws(Exception::class)
            
open fun getInstance(file: AbFile, childFilePath: String)
        //nullable =  from not(true or (false and false)) = 
: AbFile{

                    var file = file


                    var childFilePath = childFilePath



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbFile(file, childFilePath)
}


}
                
            

