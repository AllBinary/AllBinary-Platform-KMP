
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
        
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.string.StringValidationUtil

open public class FilePathUtil
            : Object
         {
        
companion object {
            
    open fun adjust(path: String)
        //nullable = true from not(false or (false and false)) = true
: String{
var path = path

    var abPathData: AbPathData = AbPathData.getInstance()!!


    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!


    var filePathData: FilePathData = FilePathData.getInstance()!!


    
                        if(stringValidationUtil!!.isEmpty(path))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return filePathData!!.SEPARATOR

                                    }
                                
path= path.replace(abPathData!!.SEPARATORCHAR, filePathData!!.SEPARATORCHAR)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return path
}


        }
            private constructor ()
            : super()
        {
}


}
                
            

