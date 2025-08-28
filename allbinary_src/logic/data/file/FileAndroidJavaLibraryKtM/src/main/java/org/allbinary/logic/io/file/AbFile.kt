
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
        
import java.io.File
import java.io.FileFilter
import java.io.FilenameFilter
import java.io.IOException
import java.net.URI
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.string.StringUtil

open public class AbFile
            : Object
        
                , AbFileInterface {
        

        companion object {
            
    val NULL_FILE: AbFile = AbFile(StringUtil.getInstance()!!.EMPTY_STRING, false)

        }
            
    private val file: File
 constructor        (filePath: String, unknown: Boolean)
            : super()
        

        Updates for KMP build        
        {
var filePath = filePath
var unknown = unknown
this.file= File(filePath)
}

protected constructor        (file: File)
            : super()
        

        Updates for KMP build        
        {
var file = file
this.file= file
}

public constructor        (file: AbFile, childPathName: String)
            : super()
        

        Updates for KMP build        
        {
var file = file
var childPathName = childPathName
this.file= File(file.getFile(), childPathName)
}

public constructor        (filePath: String)
            : super()
        

        Updates for KMP build        
        {
var filePath = filePath
this.file= File(AbPath(filePath).
                            toFileSystemString())
}

public constructor        (filePath: String, fileName: String)
            : super()
        

        Updates for KMP build        
        {
var filePath = filePath
var fileName = fileName
this.file= File(AbPath(filePath).
                            toFileSystemString(), fileName)
}

public constructor        (abPath: AbPath)
            : super()
        

        Updates for KMP build        
        {
var abPath = abPath
this.file= File(abPath!!.toFileSystemString())
}


open fun getFile()
        //nullable = true from not(false or (false and true)) = true
: File

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return file
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.getName()
}

override fun getParent()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.getParent()
}


open fun getParentFile()
        //nullable = true from not(false or (false and true)) = true
: File

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.getParentFile()
}

override fun getPath()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.getPath()
}

override fun isAbsolute()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.isAbsolute()
}

override fun getAbsolutePath()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.getAbsolutePath()
}


open fun getAbsoluteFile()
        //nullable = true from not(false or (false and true)) = true
: File

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.getAbsoluteFile()
}


                @Throws(IOException::class)
            override fun getCanonicalPath()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.getCanonicalPath()
}


                @Throws(IOException::class)
            
open fun getCanonicalFile()
        //nullable = true from not(false or (false and true)) = true
: File

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.getCanonicalFile()
}

override fun toURI()
        //nullable = true from not(false or (false and true)) = true
: URI

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.toURI()
}

override fun canRead()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.canRead()
}

override fun canWrite()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.canWrite()
}

override fun exists()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.exists()
}

override fun isDirectory()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.isDirectory()
}

override fun isFile()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.isFile()
}

override fun isHidden()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.isHidden()
}

override fun lastModified()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.lastModified()
}

override fun length()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.length()
}


                @Throws(IOException::class)
            override fun createNewFile()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.createNewFile()
}


                @Throws(IOException::class)
            override fun delete()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.delete()
}

override fun deleteOnExit()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.file.deleteOnExit()
}

override fun list()
        //nullable = true from not(false or (false and true)) = true
: Array<String?>

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.list()
}

override fun list(filter: FilenameFilter)
        //nullable = true from not(false or (false and false)) = true
: Array<String?>

        Updates for KMP build        
        {
var filter = filter



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.list(filter)
}


open fun listFiles()
        //nullable = true from not(false or (false and true)) = true
: Array<Any?>

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.listFiles() as Array<Any?>
}


open fun listFiles(filter: FilenameFilter)
        //nullable = true from not(false or (false and false)) = true
: Array<Any?>

        Updates for KMP build        
        {
var filter = filter



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.listFiles(filter) as Array<Any?>
}


open fun listFiles(filter: FileFilter)
        //nullable = true from not(false or (false and false)) = true
: Array<Any?>

        Updates for KMP build        
        {
var filter = filter



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.listFiles(filter) as Array<Any?>
}

override fun mkdir()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.mkdir()
}

override fun mkdirs()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.mkdirs()
}


open fun renameTo(dest: AbFile)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
var dest = dest



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.renameTo(dest.getFile())
}

override fun setLastModified(time: Long)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
var time = time



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.setLastModified(time)
}

override fun setReadOnly()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.setReadOnly()
}


open fun compareTo(pathname: File)
        //nullable = true from not(false or (false and false)) = true
: Int

        Updates for KMP build        
        {
var pathname = pathname



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.compareTo(pathname)
}

override fun equals(obj: Any?)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
var obj = obj



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.equals(obj)
}

override fun hashCode()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.hashCode()
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file.toString()
}


}
                
            

