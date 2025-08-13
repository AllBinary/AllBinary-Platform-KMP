
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
        package org.allbinary.osgi



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.osgi.framework.BundleContext
import org.osgi.framework.NullServiceReferenceFactory
import org.osgi.framework.ServiceReference
import org.osgi.framework.ServiceRegistration

open public class OSGIActivatorUtil
            : Object
         {
        

        companion object {
            
                @Throws(Exception::class)
            
open fun registerAsService(bundleContext: BundleContext, anyType: Any, serviceName: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var bundleContext = bundleContext


                    var anyType = anyType


                    var serviceName = serviceName
OSGIActivatorUtil.registerAsService(bundleContext, anyType, serviceName, Hashtable<Any, Any>())
}


                @Throws(Exception::class)
            
open fun registerAsService(bundleContext: BundleContext, anyType: Any, serviceName: String, properties: Hashtable<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{

                    var bundleContext = bundleContext


                    var anyType = anyType


                    var serviceName = serviceName


                    var properties = properties

    var serviceRegistration: ServiceRegistration = bundleContext!!.registerService(serviceName, anyType, properties)!!
            


    var serviceReference: ServiceReference = serviceRegistration!!.getReference()!!
            

serviceReference= bundleContext!!.getServiceReference(serviceName)

    
                        if(serviceReference == NullServiceReferenceFactory.getInstance()!!.NULL_SERVICE_REFERENCE)
                        
                                    {
                                    


                            throw Exception(
                            "No Such Service Reference")

                                    }
                                
}


        }
            private constructor        ()
            : super()
        {}


}
                
            

