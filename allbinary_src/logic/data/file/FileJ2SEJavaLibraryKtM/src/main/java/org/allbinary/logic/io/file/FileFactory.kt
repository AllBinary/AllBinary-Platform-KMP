
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
        

open public class FileFactory
            : Object
         {
        

        companion object {
            
    private val instance: FileFactory = FileFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: FileFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            
open fun getInstance(filePath: String)
        //nullable =  from not(true or (false and false)) = 
: AbFile{

                    var filePath = filePath



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbFile(filePath, false)
}


                @Throws(Exception::class)
            
open fun getInstance(file: AbFile, childFilePath: String)
        //nullable =  from not(true or (false and false)) = 
: AbFile{

                    var file = file


                    var childFilePath = childFilePath



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbFile(file, childFilePath)
}


                @Throws(Exception::class)
            
open fun isFile(path: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var path = path

    var file: AbFile = AbFile(path)


    
                        if(file.exists())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


}
                
            

