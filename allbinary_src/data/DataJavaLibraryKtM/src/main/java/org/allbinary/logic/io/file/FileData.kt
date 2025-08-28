
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
        

open public class FileData
            : Object
         {
        

        companion object {
            
    private val instance: FileData = FileData()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: FileData{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        {
}


    val NAME: String = "FILE_NAME"

    val ISFILE: String = "FILE_ISFILE"

    val ISDIRECTORY: String = "FILE_ISDIRECTORY"

    val ISHIDDEN: String = "FILE_ISHIDDEN"

    val ISABSOLUTE: String = "FILE_ISABSOLUTE"

    val ROOT_NAME: String = "FILE_ROOT_NAME"

    val PATH: String = "FILE_PATH"

    val ABSOLUTE_PATH: String = "FILE_ABSOLUTE_PATH"

    val CANONICAL_PATH: String = "FILE_CANONICAL_PATH"

    val PARENT: String = "FILE_PARENT"

    val MINLEN: Int = 1

    val MAXLEN: Int = 120

    val MAXIMAGEFILESIZE: Int = 1048576

    val MINIMAGEFILESIZE: Int = 32

    val MAXDOWNLOADABLEFILESIZE: Int = 1048576 *20

    val MINDOWNLOADABLEFILESIZE: Int = 1

}
                
            

