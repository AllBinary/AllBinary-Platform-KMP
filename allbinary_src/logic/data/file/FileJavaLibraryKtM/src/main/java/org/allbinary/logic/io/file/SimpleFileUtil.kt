
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2025 AllBinary 
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
        
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.io.InputStream
import java.io.Reader
import java.io.Writer
import java.nio.CharBuffer
import org.allbinary.logic.NullUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.StreamUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class SimpleFileUtil
            : Object
         {
        

        companion object {
            
    private val instance: SimpleFileUtil = SimpleFileUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: SimpleFileUtil

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


open fun nullWriter()
        //nullable = true from not(false or (false and true)) = true
: Writer

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return object: Writer()
                                {
                                
    private var closed: Boolean= false

                @Throws(IOException::class)
            override fun append(c: Char)
        //nullable = true from not(false or (false and false)) = true
: Writer

        Updates for KMP build        
        {
var c = c



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this
}

                @Throws(IOException::class)
            override fun append(csq: CharSequence)
        //nullable = true from not(false or (false and false)) = true
: Writer

        Updates for KMP build        
        {
var csq = csq



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this
}

                @Throws(IOException::class)
            override fun append(csq: CharSequence, start: Int, end: Int)
        //nullable = true from not(false or (false and false)) = true
: Writer

        Updates for KMP build        
        {
var csq = csq
var start = start
var end = end



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this
}

                @Throws(IOException::class)
            override fun write(c: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var c = c
}

                @Throws(IOException::class)
            override fun write(cbuf: CharArray, off: Int, len: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var cbuf = cbuf
var off = off
var len = len
}

                @Throws(IOException::class)
            override fun write(str: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var str = str
}

                @Throws(IOException::class)
            override fun write(str: String, off: Int, len: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var str = str
var off = off
var len = len
}

                @Throws(IOException::class)
            override fun flush()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}
override fun close()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}

                                }
                            
}


open fun nullReader()
        //nullable = true from not(false or (false and true)) = true
: Reader

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return object: Reader()
                                {
                                
                @Throws(IOException::class)
            override fun read()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}

                @Throws(IOException::class)
            override fun read(cbuf: CharArray, off: Int, len: Int)
        //nullable = true from not(false or (false and false)) = true
: Int

        Updates for KMP build        
        {
var cbuf = cbuf
var off = off
var len = len



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}

                @Throws(IOException::class)
            override fun read(target: CharBuffer)
        //nullable = true from not(false or (false and false)) = true
: Int

        Updates for KMP build        
        {
var target = target



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}

                @Throws(IOException::class)
            override fun ready()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

                @Throws(IOException::class)
            override fun skip(n: Long)
        //nullable = true from not(false or (false and false)) = true
: Long

        Updates for KMP build        
        {
var n = n



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0L
}
override fun close()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}

                                }
                            
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val NULL_WRITER: Writer = nullWriter()!!

    val NULL_READER: Reader = nullReader()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val nullUtil: NullUtil = NullUtil.getInstance()!!

    private val streamUtil: StreamUtil = StreamUtil.getInstance()!!

open fun loadFileAsList(inputStream: InputStream, max: Int, byteArray1: ByteArray)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList

        Updates for KMP build        
        {
    //var inputStream = inputStream
    //var max = max
    //var byteArray1 = byteArray1



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.loadFileAsList(inputStream, max, byteArray1, 0)
}


open fun loadFileAsList(inputStream: InputStream, max: Int, byteArray1: ByteArray, includeReturnLine: Int)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList

        Updates for KMP build        
        {
    //var inputStream = inputStream
    //var max = max
    //var byteArray1 = byteArray1
    //var includeReturnLine = includeReturnLine

    var stringList: BasicArrayList = BasicArrayList()


    
                        if(inputStream == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringList

                                    }
                                

    var byteArray: ByteArray = nullUtil!!.NULL_BYTE_ARRAY


        try {
            
    var outputStream2: ByteArrayOutputStream = ByteArrayOutputStream(max)

byteArray= streamUtil!!.getByteArray(inputStream, outputStream2, byteArray1)
streamUtil!!.close(inputStream)
} catch(e: Exception)
            

        Updates for KMP build        
        {
streamUtil!!.close(inputStream)
logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.ADD, e)
}


    
                        if(byteArray == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringList

                                    }
                                

    var size: Int = byteArray!!.size
                


    var index: Int = 0


    var startIndex: Int= 0


    var returnLine: Int = 0


        while(index < size)
        

        Updates for KMP build        
        {
startIndex= index

        while(index < size -1 && byteArray[index] != '\n'.code as Byte)
        

        Updates for KMP build        
        {
index++
}


    
                        if(includeReturnLine == 0)
                        
                                    {
                                    
    
                        if(index > 0 && byteArray[index -1] == '\r'.code as Byte)
                        
                                    {
                                    returnLine= 1

                                    }
                                
                        else {
                            returnLine= 0

                        }
                            

                                    }
                                

    var s: String = byteArray.decodeToString()

stringList!!.add(s)
index++
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringList
}


open fun createStringFromArrayOfStrings(stringArray: Array<String?>)
        //nullable = true from not(false or (false and false)) = true
: String

        Updates for KMP build        
        {
    //var stringArray = stringArray

    var stringMaker: StringMaker = StringMaker()


    var size: Int = stringArray!!.size
                





                        for (index in 0 until size)

        

        Updates for KMP build        
        {
stringMaker!!.append(stringArray[index]!!)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringMaker!!.toString()
}


}
                
            

