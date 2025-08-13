
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
        
import java.io.BufferedWriter
import java.io.FileWriter
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.AbFileNativeUtil

open public class BufferedWriterUtil
            : Object
         {
        

        companion object {
            
    private val instance: BufferedWriterUtil = BufferedWriterUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BufferedWriterUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            
open fun overwrite(path: String, data: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var path = path


                    var data = data

    var abFile: AbFile = AbFile(path)


    
                        if(abFile!!.exists())
                        
                                    {
                                    abFile!!.delete()

                                    }
                                
this.write(abFile, data)
}


                @Throws(Exception::class)
            
open fun overwrite(abFile: AbFile, data: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var abFile = abFile


                    var data = data

    
                        if(abFile!!.exists())
                        
                                    {
                                    abFile!!.delete()

                                    }
                                
this.write(abFile, data)
}


                @Throws(Exception::class)
            
open fun write(abFile: AbFile, data: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var abFile = abFile


                    var data = data

    var fileOut: BufferedWriter = BufferedWriter(FileWriter(AbFileNativeUtil.get(abFile)))

fileOut!!.write(data, 0, data.length)
fileOut!!.newLine()
fileOut!!.flush()
}


}
                
            

