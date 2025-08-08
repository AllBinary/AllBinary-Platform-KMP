
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
        package org.allbinary.logic.communication.http.file.upload



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.path.AbPath

open public class HttpFilePermissionsUtil
            : Object
         {
        

        companion object {


    private val instance: HttpFilePermissionsUtil = HttpFilePermissionsUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: HttpFilePermissionsUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            
open fun create(path: AbPath)
        //nullable = true from not(false or (false and false)) = true
{

                    var path = path

    var file: AbFile = AbFile(path)


    
                        if(!file.isFile())
                        
                                    {
                                    file.createNewFile()

                                    }
                                
}


}
                
            

