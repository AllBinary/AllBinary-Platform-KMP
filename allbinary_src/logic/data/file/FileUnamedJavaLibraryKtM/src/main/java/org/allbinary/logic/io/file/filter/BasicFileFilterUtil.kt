
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
        package org.allbinary.logic.io.file.filter




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.FileFilter
import org.allbinary.logic.io.file.visitor.IncludeFileExtensionsBooleanFileVisitor
import org.allbinary.util.BasicArrayList

open public class BasicFileFilterUtil
            : Object
         {
        

        companion object {
            
open fun getInstance(extension: String)
        //nullable =  from not(true or (false and false)) = 
: FileFilter{
    //var extension = extension

    var vector: BasicArrayList = BasicArrayList()

vector.add(extension)

    var includeFileExtensionsBooleanFileVisitor: IncludeFileExtensionsBooleanFileVisitor = IncludeFileExtensionsBooleanFileVisitor(vector)




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return VisitorFileFilter(includeFileExtensionsBooleanFileVisitor) as FileFilter
}


        }
            private constructor        ()
            : super()
        {
}


}
                
            

