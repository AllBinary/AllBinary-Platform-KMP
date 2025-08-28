
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
        
import java.io.ByteArrayOutputStream
import java.io.Closeable
import java.io.InputStream
import java.io.OutputStream
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class StreamUtil
            : Object
         {
        

        companion object {
            
    private val instance: StreamUtil = StreamUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: StreamUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
private constructor        ()
            : super()
        {
}


                @Throws(Exception::class)
            
open fun get(inputStream: InputStream, outputStream: OutputStream, buffer: ByteArray)
        //nullable = true from not(false or (false and false)) = true
: OutputStream{
    //var inputStream = inputStream
    //var outputStream = outputStream
var buffer = buffer

    var len: Int = 0


        while(true)
        {
len= inputStream!!.read(buffer, 0, buffer.size)

    
                        if(len !=  -1)
                        
                                    {
                                    
                                    }
                                
                        else {
                            break;

                    

                        }
                            
outputStream!!.write(buffer, 0, len)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return outputStream
}


                @Throws(Exception::class)
            
open fun getByteArray(inputStream: InputStream, outputStream2: ByteArrayOutputStream, byteArray: ByteArray)
        //nullable = true from not(false or (false and false)) = true
: ByteArray{
    //var inputStream = inputStream
    //var outputStream2 = outputStream2
    //var byteArray = byteArray

    var outputStream: ByteArrayOutputStream = outputStream2


        try {
            this.get(inputStream, outputStream, byteArray)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return outputStream!!.toByteArray()
} catch(e: Exception)
            {



                            throw e
}

         finally {
            this.close(outputStream)

         }
        
}


open fun close(closeable: Closeable)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var closeable = closeable

        try {
            
    
                        if(closeable != 
                                    null
                                )
                        
                                    {
                                    closeable.close()

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CLOSE, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


}
                
            

