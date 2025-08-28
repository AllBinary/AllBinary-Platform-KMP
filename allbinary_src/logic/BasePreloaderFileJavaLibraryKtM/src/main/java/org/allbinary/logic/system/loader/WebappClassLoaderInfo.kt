
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
        
        import java.lang.ClassLoader
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.NullUtil

open public class WebappClassLoaderInfo
            : Object
         {
        

        companion object {
            
    private var classLoader: Any = NullUtil.getInstance()!!.NULL_OBJECT
@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun setLoader(classLoader: ClassLoader)
        //nullable = true from not(false or (false and false)) = true
{
var classLoader = classLoader
WebappClassLoaderInfo.classLoader= classLoader
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun getLoader()
        //nullable = true from not(false or (false and true)) = true
: ClassLoader{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return classLoader as ClassLoader
}


        }
            private constructor        ()
            : super()
        {
}


}
                
            

