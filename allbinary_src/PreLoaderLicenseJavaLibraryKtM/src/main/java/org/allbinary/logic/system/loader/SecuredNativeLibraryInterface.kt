
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
        package org.allbinary.logic.system.loader




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

interface SecuredNativeLibraryInterface {
        

                @Throws(Exception::class)
            
    open fun load()
        //nullable = true from not(false or (false and true)) = true


                @Throws(Exception::class)
            
    open fun unload()
        //nullable = true from not(false or (false and true)) = true


    open fun unlock(key: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean

    open fun getLibraryName()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String

}
                
            

