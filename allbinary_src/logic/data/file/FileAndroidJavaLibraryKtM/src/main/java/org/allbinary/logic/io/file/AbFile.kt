
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.File
import java.io.FileFilter
import java.io.FilenameFilter
import java.io.IOException
import java.net.URI
import org.allbinary.logic.io.path.AbPath

open public class AbFile
            : Object
        
                , AbFileInterface {
        

    private val file: File
protected constructor        (filePath: String, unknown: Boolean)
            : super()
        {

                    var filePath = filePath


                    var unknown = unknown
this.file= File(filePath)
}

protected constructor        (file: File)
            : super()
        {

                    var file = file
this.file= file
}

public constructor        (file: AbFile, childPathName: String)
            : super()
        {

                    var file = file


                    var childPathName = childPathName
this.file= File(file!!.getFile(), childPathName)
}

public constructor        (filePath: String)
            : super()
        {

                    var filePath = filePath
this.file= File(AbPath(filePath).
                            toFileSystemString())
}

public constructor        (filePath: String, fileName: String)
            : super()
        {

                    var filePath = filePath


                    var fileName = fileName
this.file= File(AbPath(filePath).
                            toFileSystemString(), fileName)
}

public constructor        (abPath: AbPath)
            : super()
        {

                    var abPath = abPath
this.file= File(abPath!!.toFileSystemString())
}


open fun getFile()
        //nullable = true from not(false or (false and true)) = true
: File{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return file
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.getName()
}


open fun getParent()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.getParent()
}


open fun getParentFile()
        //nullable = true from not(false or (false and true)) = true
: File{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.getParentFile()
}


open fun getPath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.getPath()
}


open fun isAbsolute()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.isAbsolute()
}


open fun getAbsolutePath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.getAbsolutePath()
}


open fun getAbsoluteFile()
        //nullable = true from not(false or (false and true)) = true
: File{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.getAbsoluteFile()
}


                @Throws(IOException::class)
            
open fun getCanonicalPath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.getCanonicalPath()
}


                @Throws(IOException::class)
            
open fun getCanonicalFile()
        //nullable = true from not(false or (false and true)) = true
: File{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.getCanonicalFile()
}


open fun toURI()
        //nullable = true from not(false or (false and true)) = true
: URI{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.toURI()
}


open fun canRead()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.canRead()
}


open fun canWrite()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.canWrite()
}


open fun exists()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.exists()
}


open fun isDirectory()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.isDirectory()
}


open fun isFile()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.isFile()
}


open fun isHidden()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.isHidden()
}


open fun lastModified()
        //nullable = true from not(false or (false and true)) = true
: Long{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.lastModified()
}


open fun length()
        //nullable = true from not(false or (false and true)) = true
: Long{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.length
}


                @Throws(IOException::class)
            
open fun createNewFile()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.createNewFile()
}


                @Throws(IOException::class)
            
open fun delete()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.delete()
}


open fun deleteOnExit()
        //nullable = true from not(false or (false and true)) = true
{this.file!!.deleteOnExit()
}


open fun list()
        //nullable = true from not(false or (false and true)) = true
: Array<String?>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.list()
}


open fun list(filter: FilenameFilter)
        //nullable = true from not(false or (false and false)) = true
: Array<String?>{

                    var filter = filter



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.list(filter)
}


open fun listFiles()
        //nullable = true from not(false or (false and true)) = true
: Array<File?>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.listFiles()
}


open fun listFiles(filter: FilenameFilter)
        //nullable = true from not(false or (false and false)) = true
: Array<File?>{

                    var filter = filter



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.listFiles(filter)
}


open fun listFiles(filter: FileFilter)
        //nullable = true from not(false or (false and false)) = true
: Array<File?>{

                    var filter = filter



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.listFiles(filter)
}


open fun mkdir()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.mkdir()
}


open fun mkdirs()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.mkdirs()
}


open fun renameTo(dest: AbFile)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var dest = dest



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.renameTo(dest!!.getFile())
}


open fun setLastModified(time: Long)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var time = time



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.setLastModified(time)
}


open fun setReadOnly()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.setReadOnly()
}


open fun compareTo(pathname: File)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var pathname = pathname



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.compareTo(pathname)
}


open fun equals(obj: Any)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var obj = obj



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.equals(obj)
}


open fun hashCode()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.hashCode()
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.file!!.toString()
}


}
                
            

