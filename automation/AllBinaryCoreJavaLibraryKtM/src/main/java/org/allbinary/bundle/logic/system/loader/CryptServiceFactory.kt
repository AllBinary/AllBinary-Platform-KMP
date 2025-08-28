
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
        package org.allbinary.bundle.logic.system.loader




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.osgi.framework.Bundle
import org.osgi.framework.ServiceFactory
import org.osgi.framework.ServiceRegistration
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class CryptServiceFactory
            : Object
        
                , ServiceFactory {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var cryptService: CryptService = CryptService()
public constructor        ()
            : super()
        {
}


open fun getService(bundle: Bundle, registration: ServiceRegistration)
        //nullable = true from not(false or (false and false)) = true
: Any{
    //var bundle = bundle
    //var registration = registration
logUtil!!.put(this.commonStrings!!.START, this, "getService")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.cryptService
}


open fun ungetService(bundle: Bundle, registration: ServiceRegistration, service: Any)
        //nullable = true from not(false or (false and false)) = true
{
var bundle = bundle
var registration = registration
var service = service
}


}
                
            

