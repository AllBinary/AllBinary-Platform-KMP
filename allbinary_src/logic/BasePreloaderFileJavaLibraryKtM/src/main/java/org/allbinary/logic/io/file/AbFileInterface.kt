
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
        
import java.io.FilenameFilter
import java.io.IOException
import java.net.URI

interface AbFileInterface {
        

    open fun canRead()
        //nullable = true from not(false or (false and true)) = true
: Boolean

    open fun canWrite()
        //nullable = true from not(false or (false and true)) = true
: Boolean

                @Throws(IOException::class)
            
    open fun createNewFile()
        //nullable = true from not(false or (false and true)) = true
: Boolean

                @Throws(IOException::class)
            
    open fun delete()
        //nullable = true from not(false or (false and true)) = true
: Boolean

    open fun deleteOnExit()
        //nullable = true from not(false or (false and true)) = true


    open fun exists()
        //nullable = true from not(false or (false and true)) = true
: Boolean

    open fun getAbsolutePath()
        //nullable = true from not(false or (false and true)) = true
: String

                @Throws(IOException::class)
            
    open fun getCanonicalPath()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getParent()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getPath()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun isAbsolute()
        //nullable = true from not(false or (false and true)) = true
: Boolean

    open fun isDirectory()
        //nullable = true from not(false or (false and true)) = true
: Boolean

    open fun isFile()
        //nullable = true from not(false or (false and true)) = true
: Boolean

    open fun isHidden()
        //nullable = true from not(false or (false and true)) = true
: Boolean

    open fun lastModified()
        //nullable = true from not(false or (false and true)) = true
: Long

    open fun length()
        //nullable = true from not(false or (false and true)) = true
: Long

    open fun list()
        //nullable = true from not(false or (false and true)) = true
: Array<String?>

    open fun list(filter: FilenameFilter)
        //nullable = true from not(false or (false and false)) = true
: Array<String?>

    open fun mkdir()
        //nullable = true from not(false or (false and true)) = true
: Boolean

    open fun mkdirs()
        //nullable = true from not(false or (false and true)) = true
: Boolean

    open fun setLastModified(time: Long)
        //nullable = true from not(false or (false and false)) = true
: Boolean

    open fun setReadOnly()
        //nullable = true from not(false or (false and true)) = true
: Boolean

    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

    open fun toURI()
        //nullable = true from not(false or (false and true)) = true
: URI

}
                
            

