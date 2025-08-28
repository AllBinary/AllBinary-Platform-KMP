
        /* Generated Code Do Not Modify */
        package org.platform




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.InputStream

open public class OpenGLResources
            : Object
         {
        

        companion object {
            
    private val instance: OpenGLResources = OpenGLResources()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: OpenGLResources

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun init()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


open fun isExcluded(name: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
    //var name = name



                            throw RuntimeException()
}


open fun getIdentifier(name: String, defType: String, defPackage: String)
        //nullable = true from not(false or (false and false)) = true
: Int

        Updates for KMP build        
        {
    //var name = name
    //var defType = defType
    //var defPackage = defPackage



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
open fun openRawResource(id: Int)
        //nullable = true from not(false or (false and false)) = true
: InputStream

        Updates for KMP build        
        {
    //var id = id



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
open fun openRawResourceFromName(resourceName: String)
        //nullable = true from not(false or (false and false)) = true
: InputStream

        Updates for KMP build        
        {
    //var resourceName = resourceName



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
open fun getResourceAsStream(resourceName: String)
        //nullable = true from not(false or (false and false)) = true
: InputStream

        Updates for KMP build        
        {
    //var resourceName = resourceName



                            throw RuntimeException()
}


open fun getPackageName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                            throw RuntimeException()
}


}
                
            

