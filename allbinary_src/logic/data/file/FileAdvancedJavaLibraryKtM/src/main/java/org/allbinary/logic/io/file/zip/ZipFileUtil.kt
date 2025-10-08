
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
        package org.allbinary.logic.io.file.zip




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.zip.ZipEntry
import java.util.zip.ZipInputStream
import java.util.zip.ZipOutputStream
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.AbDataOutputStream
import org.allbinary.logic.io.AbFileInputStream
import org.allbinary.logic.io.AbFileOutputStream
import org.allbinary.logic.io.DataOutputStreamFactory
import org.allbinary.logic.io.StreamUtil
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.FileUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class ZipFileUtil
            : Object
         {
        
companion object {
            
    private val instance: ZipFileUtil = ZipFileUtil()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ZipFileUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    open fun create(outFilename: String, fileBasicArrayList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{
var outFilename = outFilename
var fileBasicArrayList = fileBasicArrayList

        try {
            
    var zipFile: AbFile = AbFile(outFilename)


    
                        if(zipFile!!.exists())
                        
                                    {
                                    zipFile!!.delete()

                                    }
                                
zipFile!!.createNewFile()

    var outputStream: ZipOutputStream = ZipOutputStream(AbFileOutputStream(zipFile))


    var streamUtil: StreamUtil = StreamUtil.getInstance()!!


    var stringBuffer: StringMaker = StringMaker()


    var byteArray: ByteArray = ByteArray(16384)


    var fileInputStream: AbFileInputStream


    var size: Int = fileBasicArrayList!!.size()!!


    var current: Int = 0





                        for (i in 0 until size)

        {

    var file: AbFile = fileBasicArrayList!!.get(i) as AbFile


    
                        if(file.isDirectory())
                        
                                    {
                                    
                                    }
                                
                             else 
    
                        if(file.isFile())
                        
                                    {
                                    stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(current)
stringBuffer!!.append(" Creating Zip File Entry: ")
stringBuffer!!.append(file.getPath())
logUtil!!.put(stringBuffer!!.toString(), this, "create()")

        try {
            fileInputStream= AbFileInputStream(file)
outputStream!!.putNextEntry(ZipEntry(file.getPath()))
streamUtil!!.get(fileInputStream, outputStream, byteArray)
outputStream!!.closeEntry()
streamUtil!!.close(fileInputStream)
} catch(e: Exception)
            {
logUtil!!.put("Skipping File (Probably Local): " +file.getPath(), this, "create()")
}


                                    }
                                
current++
}

streamUtil!!.close(outputStream)
} catch(e: Exception)
            {
logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "create", e)
}

}


                @Throws(Exception::class)
            
    open fun unzip(path: String, zipFile: AbFile, fileName: String)
        //nullable = true from not(false or (false and false)) = true
{
var path = path
var zipFile = zipFile
var fileName = fileName

    var buffer: ByteArray = ByteArray(16384)


    var inputStream: ZipInputStream = 
                null
            


        try {
            inputStream= ZipInputStream(AbFileInputStream(zipFile))

    var zipEntry: ZipEntry


    var stringBuffer: StringMaker = StringMaker()


    var fileUtil: FileUtil = FileUtil.getInstance()!!


        while((zipEntry= inputStream!!.getNextEntry()) != 
                                    null
                                )
        {

    var entryName: String = zipEntry!!.getName()!!


    
                        if(zipEntry!!.isDirectory())
                        
                                    {
                                    
                                    }
                                
                        else {
                            
    var entryFile: AbFile = AbFile(path +entryName)

stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append("ZipEntry Name: ")
stringBuffer!!.append(entryName)
stringBuffer!!.append(" isFile: ")
stringBuffer!!.append(entryFile!!.isFile())
stringBuffer!!.append(" isDirectory: ")
stringBuffer!!.append(entryFile!!.isDirectory())
stringBuffer!!.append(" getParent: ")
stringBuffer!!.append(entryFile!!.getParent())
logUtil!!.put(stringBuffer!!.toString(), this, "unzip")

    var dataOutputStream: AbDataOutputStream = DataOutputStreamFactory.getInstance()!!.getInstance(entryFile)!!

fileUtil!!.write(inputStream, dataOutputStream, buffer)

                        }
                            
inputStream!!.closeEntry()
}


         finally {
            StreamUtil.getInstance()!!.close(inputStream)

         }
        
}


}
                
            

