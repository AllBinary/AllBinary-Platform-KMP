
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

        Updates for KMP build        
        

open fun canWrite()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        

                @Throws(IOException::class)
            
open fun createNewFile()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        

                @Throws(IOException::class)
            
open fun delete()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        

open fun deleteOnExit()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        

open fun exists()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        

open fun getAbsolutePath()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

                @Throws(IOException::class)
            
open fun getCanonicalPath()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getParent()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getPath()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun isAbsolute()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        

open fun isDirectory()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        

open fun isFile()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        

open fun isHidden()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        

open fun lastModified()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        

open fun length()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        

open fun list()
        //nullable = true from not(false or (false and true)) = true
: Array<String?>

        Updates for KMP build        
        

open fun list(filter: FilenameFilter)
        //nullable = true from not(false or (false and false)) = true
: Array<String?>

        Updates for KMP build        
        

open fun mkdir()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        

open fun mkdirs()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        

open fun setLastModified(time: Long)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        

open fun setReadOnly()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        
override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        

open fun toURI()
        //nullable = true from not(false or (false and true)) = true
: URI

        Updates for KMP build        
        

}
                
            

