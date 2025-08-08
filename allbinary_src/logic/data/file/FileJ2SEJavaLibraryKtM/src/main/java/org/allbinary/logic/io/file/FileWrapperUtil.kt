
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.File
import org.allbinary.logic.communication.log.PreLogUtil

open public class FileWrapperUtil
            : Object
         {
        

        companion object {


open fun wrapFiles(files: Array<Any?>)
        //nullable = true from not(false or (false and false)) = true
: Array<AbFile?>{

                    var files = files

        try {
            
    var abFileArray: Array<AbFile?> = arrayOfNulls(files.size)





                        for (index in files.size -1 downTo 0)


        {abFileArray[index]= AbFile(files[index]!! as File)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return abFileArray
} catch(e: Exception)
            {PreLogUtil.put(
                            "Exception Wrapping Files", 
                            "FileWrapperUtil", 
                            "wrapFiles", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return arrayOfNulls(0)
}

}


open fun wrapFile(file: File)
        //nullable = true from not(false or (false and false)) = true
: AbFile{

                    var file = file

        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbFile(file)
} catch(e: Exception)
            {PreLogUtil.put(
                            "Exception Wrapping File", 
                            "FileWrapperUtil", 
                            "wrapFile", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

