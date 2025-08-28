
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2002 AllBinary 
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
        package org.allbinary.logic.io.file.directory




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.File
import java.io.FileFilter
import org.allbinary.logic.util.visitor.VisitorInterface

open public class DirectoryFileVisitor
            : Object
        
                , VisitorInterface
                , FileFilter {
        
public constructor        ()
            : super()
        {
}


open fun accept(arg0: java.io.File)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var arg0 = arg0



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return visit = this.visit(arg0 as Object)visit as Boolean
visit.
                    
}


open fun visit(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Any{
var anyType = anyType

    var file: File = anyType as File


    var index: Int = 1


    var aFile: File = file.getParentFile()!!


        while((aFile= aFile!!.getParentFile()) != 
                                    null
                                )
        {
index++
}


    
                        if(file.isDirectory() && index < 5)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}


}
                
            

