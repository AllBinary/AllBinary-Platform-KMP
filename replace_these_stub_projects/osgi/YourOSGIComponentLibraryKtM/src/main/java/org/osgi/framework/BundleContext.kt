
        /* Generated Code Do Not Modify */
        package org.osgi.framework



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Dictionary
interface BundleContext {
        

open fun getBundles()
        //nullable = true from not(false or (false and true)) = true
: Array<Bundle?>

                @Throws(BundleException::class)
            
open fun installBundle(location: String)
        //nullable = true from not(false or (false and false)) = true
: Bundle

open fun registerService(clazz: String, service: Any, properties: Dictionary)
        //nullable = true from not(false or (false and false)) = true
: ServiceRegistration

open fun getService(reference: ServiceReference)
        //nullable = true from not(false or (false and false)) = true
: Any

                @Throws(InvalidSyntaxException::class)
            
open fun getServiceReferences(clazz: String, filter: String)
        //nullable = true from not(false or (false and false)) = true
: Array<ServiceReference?>

open fun getServiceReference(clazz: String)
        //nullable = true from not(false or (false and false)) = true
: ServiceReference

}
                
            

