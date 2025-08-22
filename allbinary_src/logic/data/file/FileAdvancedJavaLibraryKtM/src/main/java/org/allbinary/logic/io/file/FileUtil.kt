
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.FileInputStream
import java.io.InputStream
import java.io.OutputStream
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory
import org.allbinary.logic.io.AbDataOutputStream
import org.allbinary.logic.io.AbFileInputStream
import org.allbinary.logic.io.AbFileLocalInputStream
import org.allbinary.logic.io.AbFileSystem
import org.allbinary.logic.io.DataOutputStreamFactory
import org.allbinary.logic.io.FileStreamFactory
import org.allbinary.logic.io.StreamUtil
import org.allbinary.logic.io.file.directory.Directory
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class FileUtil
            : Object
         {
        

        companion object {
            
    private val instance: FileUtil = FileUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: FileUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


open fun getNewDirectory(fromFile: AbFile)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var fromFile = fromFile

    var newDirectory: String = fromFile!!.getPath()!!


    var separatorChar: String = java.io.File.separator


    
                        if(AbFileSystem.getInstance()!!.isType("com.vobject.appengine.java.io"))
                        
                                    {
                                    separatorChar= AbPathData.getInstance()!!.SEPARATOR

                                    }
                                

    var lastIndex: Int = newDirectory!!.lastIndexOf(separatorChar)!!


    
                        if(lastIndex >= newDirectory!!.length)
                        
                                    {
                                    newDirectory= newDirectory!!.substring(0, newDirectory!!.length -1)
lastIndex= newDirectory!!.lastIndexOf(separatorChar)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newDirectory!!.substring(lastIndex, newDirectory!!.length)
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val directory: Directory = Directory.getInstance()!!

    private val logConfigTypeFactory: LogConfigTypeFactory = LogConfigTypeFactory.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val streamUtil: StreamUtil = StreamUtil.getInstance()!!
private constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun write(inputStream: InputStream, file: AbFile)
        //nullable = true from not(false or (false and false)) = true
{

                    var inputStream = inputStream


                    var file = file

    var dataOutputStream: AbDataOutputStream = DataOutputStreamFactory.getInstance()!!.getInstance(file)!!

this.write(inputStream, dataOutputStream)
}


                @Throws(Exception::class)
            
open fun write(inputStream: InputStream, dataOutputStream: AbDataOutputStream)
        //nullable = true from not(false or (false and false)) = true
{

                    var inputStream = inputStream


                    var dataOutputStream = dataOutputStream

        try {
            dataOutputStream= StreamUtil.getInstance()!!.get(inputStream, dataOutputStream, ByteArray(16384)) as AbDataOutputStream
dataOutputStream!!.flush()

         finally {
            StreamUtil.getInstance()!!.close(dataOutputStream)

         }
        
}


                @Throws(Exception::class)
            
open fun write(inputStream: InputStream, dataOutputStream: AbDataOutputStream, buffer: ByteArray)
        //nullable = true from not(false or (false and false)) = true
{

                    var inputStream = inputStream


                    var dataOutputStream = dataOutputStream


                    var buffer = buffer

        try {
            dataOutputStream= StreamUtil.getInstance()!!.get(inputStream, dataOutputStream, buffer) as AbDataOutputStream
dataOutputStream!!.flush()

         finally {
            StreamUtil.getInstance()!!.close(dataOutputStream)

         }
        
}


                @Throws(Exception::class)
            
open fun copy(dataInputStream: AbFileInputStream, dataOutputStream: AbDataOutputStream)
        //nullable = true from not(false or (false and false)) = true
{

                    var dataInputStream = dataInputStream


                    var dataOutputStream = dataOutputStream

        try {
            dataOutputStream= StreamUtil.getInstance()!!.get(dataInputStream, dataOutputStream, ByteArray(16384)) as AbDataOutputStream
dataOutputStream!!.flush()

         finally {
            StreamUtil.getInstance()!!.close(dataOutputStream)
StreamUtil.getInstance()!!.close(dataInputStream)

         }
        
}


                @Throws(Exception::class)
            
open fun fixPath(file: AbFile, path: AbPath, realPath: AbPath, cloud: String)
        //nullable = true from not(false or (false and false)) = true
: AbPath{

                    var file = file


                    var path = path


                    var realPath = realPath


                    var cloud = cloud

    var beginIndex: Int = file.getPath()!!.indexOf(cloud) +cloud.length


    var endIndex: Int = file.getPath()!!.indexOf(file.getName())!!


    var fixedPathString: String = realPath!!.toFileSystemString() +file.getPath()!!.substring(beginIndex, endIndex)


    var fixedPath: AbPath = AbPath(fixedPathString)

this.directory.create(fixedPath)

    var string: String = fixedPath!!.toFileSystemString()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(logConfigTypeFactory!!.FILE))
                        
                                    {
                                    logUtil!!.put(string, getInstance(), "fixPath")

                                    }
                                

    var outPath: AbPath = AbPath(string, file.getName())




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return outPath
}


                @Throws(Exception::class)
            
open fun copyToCloud(file: AbFile, path: AbPath, realPath: AbPath, cloud: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var file = file


                    var path = path


                    var realPath = realPath


                    var cloud = cloud
this.copyToCloud(file, path, realPath, cloud, false, false)
}


                @Throws(Exception::class)
            
open fun copyToCloud(file: AbFile, path: AbPath, realPath: AbPath, cloud: String, overwriteNewer: Boolean, overwriteAll: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var file = file


                    var path = path


                    var realPath = realPath


                    var cloud = cloud


                    var overwriteNewer = overwriteNewer


                    var overwriteAll = overwriteAll

        try {
            
    var outPath: AbPath = fixPath(file, path, realPath, cloud)!!


    var outFile: AbFile = AbFile(outPath)


    
                        if(!this.copyPrepare(file, outFile, overwriteNewer, overwriteAll))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(logConfigTypeFactory!!.FILE))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Out File: ")
stringBuffer!!.append(outFile!!.getPath())
stringBuffer!!.append(" In File: ")
stringBuffer!!.append(file.getPath())
stringBuffer!!.append(" to cloud.")
logUtil!!.put(stringBuffer!!.toString(), getInstance(), "copyToCloud")

                                    }
                                

                        }
                            

    var dataOutputStream: AbDataOutputStream = DataOutputStreamFactory.getInstance()!!.getInstance(outFile)!!


    var fileInputStream: AbFileInputStream = AbFileLocalInputStream(file)

this.copy(fileInputStream, dataOutputStream)
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(logConfigTypeFactory!!.FILEERROR))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Error Copying File File: ")
stringBuffer!!.append(file.toString())
stringBuffer!!.append(" to cloud.")
logUtil!!.put(stringBuffer!!.toString(), getInstance(), "copyToCloud", e)

                                    }
                                



                            throw e
}

}


                @Throws(Exception::class)
            
open fun copyToCloud(file: AbFile, outFile: AbFile)
        //nullable = true from not(false or (false and false)) = true
{

                    var file = file


                    var outFile = outFile
this.copyToCloud(file, outFile, false, false)
}


                @Throws(Exception::class)
            
open fun copyToCloud(file: AbFile, outFile: AbFile, overwriteNewer: Boolean, overwriteAll: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var file = file


                    var outFile = outFile


                    var overwriteNewer = overwriteNewer


                    var overwriteAll = overwriteAll

        try {
            
    var stringBuffer: StringMaker = StringMaker()


    
                        if(!this.copyPrepare(file, outFile, overwriteNewer, overwriteAll))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(logConfigTypeFactory!!.FILE))
                        
                                    {
                                    stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append("Out File: ")
stringBuffer!!.append(outFile!!.getPath())
stringBuffer!!.append(" In File: ")
stringBuffer!!.append(file.getPath())
stringBuffer!!.append(" to cloud.")
logUtil!!.put(stringBuffer!!.toString(), getInstance(), "copyToCloud")

                                    }
                                

                        }
                            

    var dataOutputStream: AbDataOutputStream = DataOutputStreamFactory.getInstance()!!.getInstance(outFile)!!


    var fileInputStream: AbFileInputStream = AbFileLocalInputStream(file)

this.copy(fileInputStream, dataOutputStream)
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(logConfigTypeFactory!!.FILEERROR))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Error Copying File File: ")
stringBuffer!!.append(file.toString())
stringBuffer!!.append(" to cloud.")
logUtil!!.put(stringBuffer!!.toString(), getInstance(), "copyToCloud", e)

                                    }
                                



                            throw e
}

}


                @Throws(Exception::class)
            
open fun copyPrepare(fromFile: AbFile, toFile: AbFile, overwriteNewer: Boolean, overwriteAll: Boolean)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var fromFile = fromFile


                    var toFile = toFile


                    var overwriteNewer = overwriteNewer


                    var overwriteAll = overwriteAll

    
                        if(toFile!!.exists())
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()


    
                        if(overwriteAll)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(logConfigTypeFactory!!.FILE))
                        
                                    {
                                    stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append("Overwriting File: ")
stringBuffer!!.append(toFile!!.getPath())
logUtil!!.put(stringBuffer!!.toString(), getInstance(), "copyFile")

                                    }
                                
toFile!!.delete()
toFile!!.createNewFile()

                                    }
                                
                             else 
    
                        if(toFile!!.lastModified() < fromFile!!.lastModified() && overwriteNewer)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(logConfigTypeFactory!!.FILE))
                        
                                    {
                                    stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append("Newer by: ")
stringBuffer!!.append(fromFile!!.lastModified() -toFile!!.lastModified())
stringBuffer!!.append("ms ")
stringBuffer!!.append("Copying File: ")
stringBuffer!!.append(toFile!!.getPath())
logUtil!!.put(stringBuffer!!.toString(), getInstance(), "copyFile")

                                    }
                                
toFile!!.delete()
toFile!!.createNewFile()

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(logConfigTypeFactory!!.FILE))
                        
                                    {
                                    stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append("File Already Exists")

    
                        if(overwriteNewer)
                        
                                    {
                                    stringBuffer!!.append(" And Is Not Older")

                                    }
                                
                        else {
                            stringBuffer!!.append(" And Not A In Overwrite Mode")

                        }
                            
stringBuffer!!.append(CommonLabels.getInstance()!!.COLON_SEP)
stringBuffer!!.append(toFile!!.getPath())
logUtil!!.put(stringBuffer!!.toString(), getInstance(), "copyFile")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            

                                    }
                                
                        else {
                            toFile!!.createNewFile()

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


                @Throws(Exception::class)
            
open fun copyFile(fromFile: AbFile, toFile: AbFile)
        //nullable = true from not(false or (false and false)) = true
{

                    var fromFile = fromFile


                    var toFile = toFile
this.copyFile(fromFile, toFile, false, false)
}


                @Throws(Exception::class)
            
open fun copyFile(fromFile: AbFile, toFile: AbFile, overwriteNewer: Boolean, overwriteAll: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var fromFile = fromFile


                    var toFile = toFile


                    var overwriteNewer = overwriteNewer


                    var overwriteAll = overwriteAll

        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(logConfigTypeFactory!!.FILE))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Copying ")
stringBuffer!!.append(fromFile!!.length())
stringBuffer!!.append(" bytes from File: ")
stringBuffer!!.append(fromFile!!.getPath())
stringBuffer!!.append(" to: ")
stringBuffer!!.append(toFile!!.getPath())
logUtil!!.put(stringBuffer!!.toString(), getInstance(), "copyFile")

                                    }
                                

    
                        if(!this.copyPrepare(fromFile, toFile, overwriteNewer, overwriteAll))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    var dataOutputStream: AbDataOutputStream = DataOutputStreamFactory.getInstance()!!.getInstance(toFile)!!


    var fileInputStream: AbFileInputStream = AbFileInputStream(fromFile)

this.copy(fileInputStream, dataOutputStream)
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(logConfigTypeFactory!!.FILEERROR))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Error Copying File fromFile: ")
stringBuffer!!.append(fromFile!!.toString())
stringBuffer!!.append(" to: ")
stringBuffer!!.append(toFile!!.toString())
logUtil!!.put(stringBuffer!!.toString(), getInstance(), "copyFile", e)

                                    }
                                



                            throw e
}

}


                @Throws(Exception::class)
            
open fun copyDirectoryPortion(fromDirectoryAbPath: AbPath, toDirectoryAbPath: AbPath, overwriteNewer: Boolean, overwriteAll: Boolean, current: Int, total: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var fromDirectoryAbPath = fromDirectoryAbPath


                    var toDirectoryAbPath = toDirectoryAbPath


                    var overwriteNewer = overwriteNewer


                    var overwriteAll = overwriteAll


                    var current = current


                    var total = total

    var file: AbFile = AbFile(fromDirectoryAbPath)


    
                        if(!file.isDirectory())
                        
                                    {
                                    


                            throw Exception("Not a directory: " +file.getPath())

                                    }
                                

    var fileList: BasicArrayList = directory.search(file, true)!!


    var size: Int = fileList!!.size()!!


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Searched: ")
stringBuffer!!.append(file.getPath())
stringBuffer!!.append(" Total: ")
stringBuffer!!.append(size)

    var portion: Int = size /total +1


    var start: Int = portion *current


    var end: Int = start +portion


    
                        if(end > size)
                        
                                    {
                                    end= size

                                    }
                                
stringBuffer!!.append(" Section: ")
stringBuffer!!.append(start)
stringBuffer!!.append(" - ")
stringBuffer!!.append(end)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(logConfigTypeFactory!!.FILE))
                        
                                    {
                                    logUtil!!.put(stringBuffer!!.toString(), getInstance(), "copySomeFilesToDirectory()")

                                    }
                                




                        for (index in start until end)


        {
    var nextFile: AbFile = fileList!!.get(index) as AbFile


    
                        if(nextFile!!.isDirectory())
                        
                                    {
                                    
                                    }
                                
                        else {
                            
    var path: String = AbPath(nextFile!!.getPath()).
                            getPath()!!


    var beginIndex: Int = fromDirectoryAbPath!!.getPath()!!.length()!!


    
                        if(path.indexOf(URLGLOBALS.getWebappPath()) < 0)
                        
                                    {
                                    beginIndex -= AbPath(URLGLOBALS.getWebappPath()).
                            getPath()!!.length()

                                    }
                                

    var newPath: String = toDirectoryAbPath!!.toFileSystemString() +path.substring(beginIndex)


    var toFile: AbFile = AbFile(AbPath(newPath))

this.copyFile(nextFile, toFile, overwriteNewer, overwriteAll)

                        }
                            
}

}


                @Throws(Exception::class)
            
open fun copyDirectory(fromFile: AbFile, to: AbFile)
        //nullable = true from not(false or (false and false)) = true
{

                    var fromFile = fromFile


                    var to = to

        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(logConfigTypeFactory!!.FILE))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Copying Directory from: ")
stringBuffer!!.append(fromFile!!.getPath())
stringBuffer!!.append(" to: ")
stringBuffer!!.append(to.getPath())
logUtil!!.put(stringBuffer!!.toString(), getInstance(), "copyDirectory")

                                    }
                                

    var newDirectory: String = getNewDirectory(fromFile)!!


    var newDirectoryAbPath: AbPath = AbPath(to.getPath() +AbPathData.getInstance()!!.SEPARATOR +newDirectory)


    
                        if(!this.directory.create(newDirectoryAbPath))
                        
                                    {
                                    


                            throw Exception("Failed to create directory: " +newDirectoryAbPath)

                                    }
                                

    var fileArray: Array<AbFile?> = FileWrapperUtil.wrapFiles(fromFile!!.listFiles())!!


    var size: Int = fileArray!!.size
                


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(logConfigTypeFactory!!.FILE))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Copying ")
stringBuffer!!.append(size)
stringBuffer!!.append(" files from: ")
stringBuffer!!.append(fromFile!!.getPath())
stringBuffer!!.append(" to: ")
stringBuffer!!.append(to.getPath())
logUtil!!.put(stringBuffer!!.toString(), getInstance(), "copyDirectory")

                                    }
                                




                        for (index in 0 until size)


        {
    var file: AbFile = fileArray[index]!!


    
                        if(file.isFile())
                        
                                    {
                                    this.copyFile(file, AbFile(newDirectoryAbPath!!.toString(), file.getName()))

                                    }
                                
                             else 
    
                        if(file.isDirectory())
                        
                                    {
                                    this.copyDirectory(file, AbFile(newDirectoryAbPath))

                                    }
                                
                        else {
                            


                            throw Exception("File Copy Error")

                        }
                            
}

} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(logConfigTypeFactory!!.FILEERROR))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Error Copying Directory fromFile: ")
stringBuffer!!.append(fromFile!!.toString())
stringBuffer!!.append(" to: ")
stringBuffer!!.append(to.toString())
logUtil!!.put(stringBuffer!!.toString(), getInstance(), "copyDirectory", e)

                                    }
                                



                            throw e
}

}


                @Throws(Exception::class)
            
open fun copy(fromAbPath: AbPath, to: AbPath)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var fromAbPath = fromAbPath


                    var to = to

        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(logConfigTypeFactory!!.FILE))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Copying AbPaths from: ")
stringBuffer!!.append(fromAbPath!!.toString())
stringBuffer!!.append(" to: ")
stringBuffer!!.append(to.toString())
logUtil!!.put(stringBuffer!!.toString(), getInstance(), "copy")

                                    }
                                

    
                        if(fromAbPath == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception("Cannot Copy From A Null Location")

                                    }
                                

    
                        if(to == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception("Cannot Copy To A Null Location")

                                    }
                                

    var fromLocationFile: AbFile = AbFile(fromAbPath)


    var toLocationFile: AbFile = AbFile(to)


    
                        if(fromLocationFile!!.isFile())
                        
                                    {
                                    
    
                        if(toLocationFile!!.isDirectory())
                        
                                    {
                                    
    var file: AbFile = AbFile(toLocationFile, fromLocationFile!!.getName())

this.copyFile(fromLocationFile, file)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(logConfigTypeFactory!!.FILE))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Copied file=")
stringBuffer!!.append(fromLocationFile!!.getName())
stringBuffer!!.append(" from: ")
stringBuffer!!.append(fromLocationFile!!.getPath())
stringBuffer!!.append(" to: ")
stringBuffer!!.append(toLocationFile!!.getPath())
logUtil!!.put(stringBuffer!!.toString(), getInstance(), "copy")

                                    }
                                

                                    }
                                
                        else {
                            this.copyFile(fromLocationFile, toLocationFile)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(logConfigTypeFactory!!.FILE))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Copied file with new name ")
stringBuffer!!.append(" from: ")
stringBuffer!!.append(fromLocationFile!!.getPath())
stringBuffer!!.append(" to: ")
stringBuffer!!.append(toLocationFile!!.getPath())
logUtil!!.put(stringBuffer!!.toString(), getInstance(), "copy")

                                    }
                                

                        }
                            

                                    }
                                
                             else 
    
                        if(fromLocationFile!!.isDirectory() && toLocationFile!!.isDirectory())
                        
                                    {
                                    
    
                        if(fromAbPath!!.toFileSystemString()[fromAbPath!!.toFileSystemString()!!.length() -1] == java.io.File.separatorChar)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(logConfigTypeFactory!!.FILE))
                        
                                    {
                                    logUtil!!.put("Copying subdirectories", getInstance(), "copy")

                                    }
                                

    var fileArray: Array<AbFile?> = FileWrapperUtil.wrapFiles(fromLocationFile!!.listFiles())!!





                        for (index in 0 until fileArray!!.size)


        {
    var file: AbFile = fileArray[index]!!


    
                        if(file.isFile())
                        
                                    {
                                    
    var aFile: AbFile = AbFile(toLocationFile, file.getName())

this.copyFile(file, aFile)

                                    }
                                
                             else 
    
                        if(file.isDirectory())
                        
                                    {
                                    copyDirectory(file, toLocationFile)

                                    }
                                
                        else {
                            


                            throw Exception("File Copy Error")

                        }
                            
}


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(logConfigTypeFactory!!.FILE))
                        
                                    {
                                    logUtil!!.put("Copied subdirectories", getInstance(), "copy")

                                    }
                                

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(logConfigTypeFactory!!.FILE))
                        
                                    {
                                    logUtil!!.put("Copyinhg directory", getInstance(), "copy")

                                    }
                                
copyDirectory(fromLocationFile, toLocationFile)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(logConfigTypeFactory!!.FILE))
                        
                                    {
                                    logUtil!!.put("Copied directory", getInstance(), "copy")

                                    }
                                

                        }
                            

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(logConfigTypeFactory!!.FILEERROR))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Error Copying fromAbPath: ")
stringBuffer!!.append(fromAbPath!!.toString())
stringBuffer!!.append(" to: ")
stringBuffer!!.append(to.toString())
logUtil!!.put(stringBuffer!!.toString(), getInstance(), "copy", e)

                                    }
                                



                            throw e
}

}


open fun readAsString(fileName: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var fileName = fileName

    var bytes: ByteArray = ByteArray(1000000)




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.readAsString(fileName, bytes)
}


open fun readAsString(fileName: String, bytes: ByteArray)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var fileName = fileName


                    var bytes = bytes

    var idFile: FileInputStream = 
                null
            


        try {
            idFile= FileInputStream(fileName)

    var size: Int = idFile!!.read(bytes)!!


    
                        if(size > 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return bytes.decodeToString()

                                    }
                                
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(logConfigTypeFactory!!.IDLOGGING))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "SmallInsert", e)

                                    }
                                
}

         finally {
            streamUtil!!.close(idFile)

         }
        



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING
}


open fun shouldSkip(file: AbFile, skipFiles: Array<String?>)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var file = file


                    var skipFiles = skipFiles

    var size: Int = skipFiles!!.size
                


    var skipFile: String





                        for (index in 0 until size)


        {skipFile= skipFiles[index]!!

    
                        if(file.getPath()!!.compareTo(skipFile) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    private val WRITE_LABEL: String = "Write file: "

    private val DATA_LABEL: String = " data: "

    private val WRITE_METHOD: String = "write"

                @Throws(Exception::class)
            
open fun write(filePath: String, string: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var filePath = filePath


                    var string = string

    var dataOutputStream: AbDataOutputStream = 
                null
            


        try {
            PreLogUtil.put(StringBuilder().
                            append(this.WRITE_LABEL)!!.append(filePath)!!.append(DATA_LABEL)!!.append(string)!!.toString(), this, this.WRITE_METHOD)

    var fileInputStreamFactory: FileStreamFactory = FileStreamFactory.getInstance()!!


    var fileOutputStream: OutputStream = fileInputStreamFactory!!.getFileOutputStreamInstance(StringUtil.getInstance()!!.EMPTY_STRING, filePath)!!

dataOutputStream= AbDataOutputStream(fileOutputStream)
dataOutputStream!!.write(string.encodeToByteArray()0, string.length)
dataOutputStream!!.flush()

         finally {
            StreamUtil.getInstance()!!.close(dataOutputStream)

         }
        
}


open fun loadFileAsList(file: AbFile, max: Int, byteArray1: ByteArray)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var file = file


                    var max = max


                    var byteArray1 = byteArray1



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return FileUtil2.getInstance()!!.loadFileAsList(file, max, byteArray1)
}


}
                
            

