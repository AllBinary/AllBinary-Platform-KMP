
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
        package org.allbinary.logic.io.file.directory




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.util.visitor.VisitorInterface

open public class DirectoryBooleanFileVisitor
            : Object
        
                , VisitorInterface {
        
public constructor ()
            : super()
        {
}


    open fun visit(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Any{
var anyType = anyType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.visit(anyType as AbFile) as Object
}


    open fun visit(file: AbFile)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var file = file

    
                        if(file.isDirectory())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}


}
                
            

