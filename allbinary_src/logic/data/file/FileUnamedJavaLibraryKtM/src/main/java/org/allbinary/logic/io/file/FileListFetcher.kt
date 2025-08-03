
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
        
import org.allbinary.logic.io.file.directory.DirectoryOrIncludeFileExtensionBooleanFileVisitor
import org.allbinary.logic.io.file.directory.SubDirectory
import org.allbinary.logic.io.file.filter.VisitorFileFilter
import org.allbinary.util.BasicArrayList

open public class FileListFetcher
            : Object
         {
        

        companion object {


    private val instance: FileListFetcher = FileListFetcher()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: FileListFetcher{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val subDirectory: SubDirectory = SubDirectory.getInstance()!!
            

open fun getFiles(path: String)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var path = path

        try {
            
    var files: BasicArrayList = subDirectory!!.search(AbFile(path))!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return files
} catch(e: Exception)
            {e!!.printStackTrace()
System.out!!.println("Error: " +e +"\nMsg: " +e!!.getMessage())
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun getFiles(path: String, includeExtension: String)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var path = path


                    var includeExtension = includeExtension

        try {
            
    var includeExtensionBasicArrayList: BasicArrayList = BasicArrayList()

includeExtensionBasicArrayList!!.add(includeExtension)

    var visitorFileFilter: VisitorFileFilter = VisitorFileFilter(DirectoryOrIncludeFileExtensionBooleanFileVisitor(includeExtensionBasicArrayList))


    var files: BasicArrayList = subDirectory!!.search(visitorFileFilter, AbFile(path))!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return files
} catch(e: Exception)
            {e!!.printStackTrace()
System.out!!.println("Error: " +e +"\nMsg: " +e!!.getMessage())
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun getFiles(path: String, pathIncludes: String, includeExtension: String)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var path = path


                    var pathIncludes = pathIncludes


                    var includeExtension = includeExtension

        try {
            
    var includeExtensionBasicArrayList: BasicArrayList = BasicArrayList()

includeExtensionBasicArrayList!!.add(includeExtension)

    var visitorFileFilter: VisitorFileFilter = VisitorFileFilter(DirectoryOrIncludeFileExtensionBooleanFileVisitor(includeExtensionBasicArrayList, pathIncludes))


    var files: BasicArrayList = subDirectory!!.search(visitorFileFilter, AbFile(path))!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return files
} catch(e: Exception)
            {e!!.printStackTrace()
System.out!!.println("Error: " +e +"\nMsg: " +e!!.getMessage())
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


}
                
            

