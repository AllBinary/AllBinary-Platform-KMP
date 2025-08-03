
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.path.AbPath

open public class FileStreamFactory
            : Object
         {
        

        companion object {


    private val SINGLETON: FileStreamFactory = FileStreamFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: FileStreamFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}



        }
            private constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun getFileInputStreamInstance(path: String, fileName: String)
        //nullable = true from not(false or (false and false)) = true
: AbFileInputStream{

                    var path = path


                    var fileName = fileName

    var FILEABPATH: AbPath = AbPath(path, fileName)


    var file: AbFile = AbFile(FILEABPATH)




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbFileInputStream(file)
}


                @Throws(Exception::class)
            
open fun getFileOutputStreamInstance(path: String, fileName: String)
        //nullable = true from not(false or (false and false)) = true
: AbFileOutputStream{

                    var path = path


                    var fileName = fileName

    var FILEABPATH: AbPath = AbPath(path, fileName)


    var file: AbFile = AbFile(FILEABPATH)


    
                        if(file!!.exists())
                        
                                    {
                                    file!!.delete()
file!!.createNewFile()

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbFileOutputStream(file)
}


                @Throws(Exception::class)
            
open fun delete(path: String, fileName: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var path = path


                    var fileName = fileName

    var FILEABPATH: AbPath = AbPath(path, fileName)


    var file: AbFile = AbFile(FILEABPATH)

file!!.delete()
}


}
                
            

