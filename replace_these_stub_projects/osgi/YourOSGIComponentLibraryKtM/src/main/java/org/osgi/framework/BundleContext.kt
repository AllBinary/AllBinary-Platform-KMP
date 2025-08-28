
        /* Generated Code Do Not Modify */
        package org.osgi.framework




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Dictionary
interface BundleContext {
        

open fun getBundles()
        //nullable = true from not(false or (false and true)) = true
: Array<Bundle?>

        Updates for KMP build        
        

                @Throws(BundleException::class)
            
open fun installBundle(location: String)
        //nullable = true from not(false or (false and false)) = true
: Bundle

        Updates for KMP build        
        

open fun registerService(clazz: String, service: Any, properties: Dictionary)
        //nullable = true from not(false or (false and false)) = true
: ServiceRegistration

        Updates for KMP build        
        

open fun getService(reference: ServiceReference)
        //nullable = true from not(false or (false and false)) = true
: Any

        Updates for KMP build        
        

                @Throws(InvalidSyntaxException::class)
            
open fun getServiceReferences(clazz: String, filter: String)
        //nullable = true from not(false or (false and false)) = true
: Array<ServiceReference?>

        Updates for KMP build        
        

open fun getServiceReference(clazz: String)
        //nullable = true from not(false or (false and false)) = true
: ServiceReference

        Updates for KMP build        
        

}
                
            

