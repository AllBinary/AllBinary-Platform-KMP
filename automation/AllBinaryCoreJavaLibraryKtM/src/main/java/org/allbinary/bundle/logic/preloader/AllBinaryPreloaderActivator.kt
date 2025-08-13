
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
        package org.allbinary.bundle.logic.preloader



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext
import org.osgi.framework.ServiceReference
import org.osgi.framework.ServiceRegistration
import org.allbinary.bundle.logic.system.loader.CryptServiceFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class AllBinaryPreloaderActivator
            : Object
        
                , BundleActivator {
        

        companion object {
            
    private var context: BundleContext

    private val CRYPT_REGISTRY_NAME: String = "bundle.abcs.logic.system.loader.CryptService"

open fun getBundleContext()
        //nullable = true from not(false or (false and true)) = true
: BundleContext{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return context
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            
public constructor        ()
            : super()
        {}


    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

                @Throws(Exception::class)
            
open fun start(context: BundleContext)
        //nullable = true from not(false or (false and false)) = true
{

                    var context = context

        try {
            logUtil!!.put(this.commonStrings!!.START, this, 
                            "start")
AllBinaryPreloaderActivator.context= context
this.registerAsService()
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, 
                            "start", e)



                            throw e
}

}


                @Throws(Exception::class)
            
open fun registerAsService()
        //nullable = true from not(false or (false and true)) = true
{
    var properties: Hashtable<Any, Any> = Hashtable<Any, Any>()


    var serviceRegistration: ServiceRegistration = context.registerService(CRYPT_REGISTRY_NAME, CryptServiceFactory(), properties)!!
            


    var serviceReference: ServiceReference = serviceRegistration!!.getReference()!!
            

serviceReference= context.getServiceReference(CRYPT_REGISTRY_NAME)

    
                        if(serviceReference == 
                                    null
                                )
                        
                                    throw Exception(
                            "No Such Service Reference")
}


                @Throws(Exception::class)
            
open fun stop(context: BundleContext)
        //nullable = true from not(false or (false and false)) = true
{

                    var context = context
logUtil!!.put(this.commonStrings!!.START, this, 
                            "stop")
}


}
                
            

