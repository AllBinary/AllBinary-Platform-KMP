
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
        
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.IOException
import java.io.OutputStream
import java.nio.channels.FileChannel
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.AbFileNativeUtil

open public class AbFileOutputStream : OutputStream {
        
public constructor        (name: String){

                    var name = name
}


    private var fileOutputStream: FileOutputStream
public constructor        (file: AbFile){

                    var file = file
this.fileOutputStream= FileOutputStream(AbFileNativeUtil.get(file))
}

protected constructor        (fileOutputStream: FileOutputStream){

                    var fileOutputStream = fileOutputStream
this.fileOutputStream= fileOutputStream
}


                @Throws(IOException::class)
            
open fun close()
        //nullable = true from not(false or (false and true)) = true
{this.fileOutputStream!!.close()
}


open fun getChannel()
        //nullable = true from not(false or (false and true)) = true
: FileChannel{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.fileOutputStream!!.getChannel()
}


                @Throws(IOException::class)
            
open fun write(buffer: ByteArray)
        //nullable = true from not(false or (false and false)) = true
{

                    var buffer = buffer
this.fileOutputStream!!.write(buffer)
}


                @Throws(IOException::class)
            
open fun write(buffer: ByteArray, offset: Int, count: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var buffer = buffer


                    var offset = offset


                    var count = count
this.fileOutputStream!!.write(buffer, offset, count)
}


                @Throws(IOException::class)
            
open fun write(b: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var b = b
this.fileOutputStream!!.write(b)
}


}
                
            

