
        /* Generated Code Do Not Modify */
        package org.apache.commons.fileupload




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.ByteArrayOutputStream
import java.io.InputStream
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.StreamUtil
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.AbFileNativeUtil
import org.allbinary.logic.string.StringMaker

open public class FileItemUtil
            : Object
         {
        

        companion object {
            
    private val instance: FileItemUtil = FileItemUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: FileItemUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val DEFAULT_CHARSET: String = "ISO-8859-1"

                @Throws(Exception::class)
            
open fun getString(byteArray: ByteArray)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var byteArray = byteArray



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return byteArray.decodeToString()
}


                @Throws(Exception::class)
            
open fun getString(fileItem: FileItemStream)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var fileItem = fileItem



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return getBytes.toCharArray().concatToString(DEFAULT_CHARSET)
}


                @Throws(Exception::class)
            
open fun getBytes(fileItem: FileItemStream)
        //nullable = true from not(false or (false and false)) = true
: ByteArray{

                    var fileItem = fileItem

    var streamUtil: StreamUtil = StreamUtil.getInstance()!!


    var inputStream: InputStream = 
                null
            


    var outputStream: ByteArrayOutputStream = 
                null
            


        try {
            inputStream= fileItem!!.openStream()
outputStream= ByteArrayOutputStream()

    
                        if(fileItem!!.isFormField())
                        
                                    {
                                    logUtil!!.put("FileItemStream FieldName: " +fileItem!!.getFieldName(), this, "write()")

                                    }
                                
                        else {
                            
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Uploaded File FieldName: ")
stringBuffer!!.append(fileItem!!.getFieldName())
stringBuffer!!.append(" name = ")
stringBuffer!!.append(fileItem!!.getName())
logUtil!!.put(stringBuffer!!.toString(), this, "write()")

                        }
                            
outputStream= streamUtil!!.get(inputStream, outputStream, ByteArray(16384)) as ByteArrayOutputStream



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return outputStream!!.toByteArray()

         finally {
            streamUtil!!.close(outputStream)
streamUtil!!.close(inputStream)

         }
        
}


                @Throws(Exception::class)
            
open fun write(fileItem: FileItem, file: AbFile)
        //nullable = true from not(false or (false and false)) = true
{

                    var fileItem = fileItem


                    var file = file
fileItem!!.write(AbFileNativeUtil.get(file))
}


}
                
            

