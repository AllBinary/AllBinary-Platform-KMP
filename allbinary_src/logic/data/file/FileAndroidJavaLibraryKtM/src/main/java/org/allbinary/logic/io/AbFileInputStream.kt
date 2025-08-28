
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.IOException
import java.io.InputStream
import java.nio.channels.FileChannel

open public class AbFileInputStream : InputStream {
        

    private var fileInputStream: FileInputStream
public constructor        (fileInputStream: FileInputStream){
var fileInputStream = fileInputStream
this.fileInputStream= fileInputStream
}

override fun mark(readlimit: Int)
        //nullable = true from not(false or (false and false)) = true
{
var readlimit = readlimit
this.fileInputStream!!.mark(readlimit)
}

override fun markSupported()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.fileInputStream!!.markSupported()
}


                @Throws(IOException::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
override fun reset()
        //nullable = true from not(false or (false and true)) = true
{
this.fileInputStream!!.reset()
}


                @Throws(IOException::class)
            override fun available()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.fileInputStream!!.available()
}

override fun close()
        //nullable = true from not(false or (false and true)) = true
{
this.fileInputStream!!.close()
}


open fun getChannel()
        //nullable = true from not(false or (false and true)) = true
: FileChannel{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.fileInputStream!!.getChannel()
}


                @Throws(IOException::class)
            override fun read()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.fileInputStream!!.read()
}


                @Throws(IOException::class)
            override fun read(b: ByteArray)
        //nullable = true from not(false or (false and false)) = true
: Int{
var b = b



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.fileInputStream!!.read(b)
}


                @Throws(IOException::class)
            override fun read(buffer: ByteArray, offset: Int, count: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
var buffer = buffer
var offset = offset
var count = count



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.fileInputStream!!.read(buffer, offset, count)
}


                @Throws(IOException::class)
            override fun skip(n: Long)
        //nullable = true from not(false or (false and false)) = true
: Long{
var n = n



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.fileInputStream!!.skip(n)
}


}
                
            

