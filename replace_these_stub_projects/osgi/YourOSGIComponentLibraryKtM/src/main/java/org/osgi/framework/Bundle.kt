
        /* Generated Code Do Not Modify */
        package org.osgi.framework




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

interface Bundle {
        

    open fun getSymbolicName()
        //nullable = true from not(false or (false and true)) = true
: String

                @Throws(BundleException::class)
            
    open fun start()
        //nullable = true from not(false or (false and true)) = true


                @Throws(BundleException::class)
            
    open fun start(options: Int)
        //nullable = true from not(false or (false and false)) = true


}
                
            

