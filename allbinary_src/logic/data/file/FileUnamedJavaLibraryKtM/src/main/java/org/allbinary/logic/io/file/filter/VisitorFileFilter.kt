
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.File
import java.io.FileFilter
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.FileWrapperUtil
import org.allbinary.logic.util.visitor.VisitorInterface

open public class VisitorFileFilter
            : Object
        
                , FileFilter {
        

    private var booleanVisitorInterface: VisitorInterface
public constructor        (booleanVisitorInterface: VisitorInterface)
            : super()
        {

                    var booleanVisitorInterface = booleanVisitorInterface
this.booleanVisitorInterface= booleanVisitorInterface
}


open fun accept(file: File)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var file = file

    var abFile: AbFile = FileWrapperUtil.wrapFile(file)!!
            


    var isFileAcceptable: Boolean = visit = this.booleanVisitorInterface!!.visit(abFile)visit as Boolean
visit.
                    !!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return isFileAcceptable || file.isDirectory()
}


open fun accept(file: AbFile)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var file = file

    var isFileAcceptable: Boolean = visit = this.booleanVisitorInterface!!.visit(file)visit as Boolean
visit.
                    !!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return isFileAcceptable || file.isDirectory()
}


}
                
            

