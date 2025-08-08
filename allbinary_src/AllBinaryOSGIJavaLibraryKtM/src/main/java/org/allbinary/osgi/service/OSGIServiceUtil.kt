
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
        package org.allbinary.osgi.service



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.osgi.framework.BundleContext
import org.osgi.framework.ServiceReference
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.osgi.OSGIServiceInterface

open public class OSGIServiceUtil
            : Object
         {
        

        companion object {


    private val instance: OSGIServiceUtil = OSGIServiceUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: OSGIServiceUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            
private constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun getServicesObjectVector(bundleContext: Object, serviceReferences: Array<ServiceReference?>)
        //nullable = true from not(false or (false and false)) = true
: Vector{

                    var bundleContext = bundleContext


                    var serviceReferences = serviceReferences

    var vector: Vector = Vector()


    
                        if(serviceReferences != 
                                    null
                                )
                        
                                    {
                                    
    var size: Int = serviceReferences!!.size
                

logUtil!!.put("Service References: " +size, this, 
                            "getServicesObjectVector")




                        for (index in 0 until size)


        {
    var serviceReference: ServiceReference = serviceReferences[index]!!


    
                        if(serviceReference != 
                                    null
                                )
                        
                                    {
                                    
    var osgiServiceInterface: OSGIServiceInterface = bundleContext!!.getService(serviceReference) as OSGIServiceInterface


    
                        if(osgiServiceInterface == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception(
                            "No Service For Reference")

                                    }
                                
vector.add(osgiServiceInterface)

                                    }
                                
}


                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return vector
}


}
                
            

