
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
import org.allbinary.osgi.OSGIServiceVisitorInterface
import org.allbinary.string.CommonStrings

open public class InputAutomationServiceConsumer
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    val osgiServiceUtil: OSGIServiceUtil = OSGIServiceUtil.getInstance()!!
            

    private var registryName: String

    private var bundleContext: BundleContext

    private var osgiServiceVisitorInterface: OSGIServiceVisitorInterface
public constructor        (registryName: String, bundleContext: BundleContext, osgiServiceVisitorInterface: OSGIServiceVisitorInterface)
            : super()
        {

                    var registryName = registryName


                    var bundleContext = bundleContext


                    var osgiServiceVisitorInterface = osgiServiceVisitorInterface
this.setRegistryName(registryName)
this.setBundleContext(bundleContext)
this.setOsgiServiceVisitorInterface(osgiServiceVisitorInterface)
}


                @Throws(Exception::class)
            
open fun process()
        //nullable = true from not(false or (false and true)) = true
{logUtil!!.put(this.commonStrings!!.START, this, commonStrings!!.PROCESS)

    var vector: Vector = osgiServiceUtil!!.getServicesObjectVector(this.getBundleContext(), this.getServiceReferences())!!
            

logUtil!!.put("Processing " +vector.size +" Services", this, commonStrings!!.PROCESS)

    var size: Int = vector.size!!
            


    var osgiServiceInterface: OSGIServiceInterface





                        for (index in 0 until size)


        {osgiServiceInterface= vector.get(index) as OSGIServiceInterface

    
                        if(!getOsgiServiceVisitorInterface()!!.visit(osgiServiceInterface))
                        
                                    {
                                    


                            throw Exception("Unable to process service: " +osgiServiceInterface)

                                    }
                                
}

}


                @Throws(Exception::class)
            
open fun getServiceReferences()
        //nullable = true from not(false or (false and true)) = true
: Array<ServiceReference?>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getBundleContext()!!.getServiceReferences(this.getRegistryName(), 
                            null)
}


open fun getBundleContext()
        //nullable = true from not(false or (false and true)) = true
: BundleContext{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return bundleContext
}


open fun setBundleContext(aBundleContext: BundleContext)
        //nullable = true from not(false or (false and false)) = true
{

                    var aBundleContext = aBundleContext
bundleContext= aBundleContext
}


open fun getRegistryName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return registryName
}


open fun setRegistryName(registryName: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var registryName = registryName
this.registryName= registryName
}


open fun getOsgiServiceVisitorInterface()
        //nullable = true from not(false or (false and true)) = true
: OSGIServiceVisitorInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return osgiServiceVisitorInterface
}


open fun setOsgiServiceVisitorInterface(osgiServiceVisitorInterface: OSGIServiceVisitorInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var osgiServiceVisitorInterface = osgiServiceVisitorInterface
this.osgiServiceVisitorInterface= osgiServiceVisitorInterface
}


}
                
            

