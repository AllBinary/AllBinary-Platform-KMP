
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
        package org.allbinary.logic.io



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.io.file.AbFile

open public class DataOutputStreamFactory
            : Object
         {
        

        companion object {


    private val instance: DataOutputStreamFactory = DataOutputStreamFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: DataOutputStreamFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            
open fun getInstance(file: AbFile)
        //nullable =  from not(true or (false and false)) = 
: AbDataOutputStream{

                    var file = file

    var idFileOutputStream: AbFileOutputStream = AbFileOutputStream(file)


    var idOutData: AbDataOutputStream = AbDataOutputStream(idFileOutputStream)




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return idOutData
}


                @Throws(Exception::class)
            
open fun getInstance(filePath: String, fileName: String)
        //nullable =  from not(true or (false and false)) = 
: AbDataOutputStream{

                    var filePath = filePath


                    var fileName = fileName

    var fileStreamFactory: FileStreamFactory = FileStreamFactory.getInstance()!!
            


    var fileOutputStream: AbFileOutputStream = fileStreamFactory!!.getFileOutputStreamInstance(filePath, fileName)!!
            


    var idOutData: AbDataOutputStream = AbDataOutputStream(fileOutputStream)




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return idOutData
}


}
                
            

