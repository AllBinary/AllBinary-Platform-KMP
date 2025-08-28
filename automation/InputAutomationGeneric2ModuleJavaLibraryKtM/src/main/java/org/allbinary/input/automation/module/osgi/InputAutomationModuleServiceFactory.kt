
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
        package org.allbinary.input.automation.module.osgi




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.osgi.framework.Bundle
import org.osgi.framework.ServiceFactory
import org.osgi.framework.ServiceRegistration
import bundle.input.automation.module.InputAutomationModuleService
import org.allbinary.input.automation.module.InputAutomationModuleFactoryInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class InputAutomationModuleServiceFactory
            : Object
        
                , ServiceFactory {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var inputAutomationModuleInterfaceArray: Array<InputAutomationModuleFactoryInterface?>
public constructor        ()
            : super()
        {
}


open fun getService(bundle: Bundle, registration: ServiceRegistration)
        //nullable = true from not(false or (false and false)) = true
: Any{
var bundle = bundle
var registration = registration
logUtil!!.put(this.commonStrings!!.START, this, "getService")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return InputAutomationModuleService(this.getInputAutomationModuleInterfaceArray())
}


open fun ungetService(bundle: Bundle, registration: ServiceRegistration, service: Any)
        //nullable = true from not(false or (false and false)) = true
{
var bundle = bundle
var registration = registration
var service = service
}


open fun getInputAutomationModuleInterfaceArray()
        //nullable = true from not(false or (false and true)) = true
: Array<InputAutomationModuleFactoryInterface?>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputAutomationModuleInterfaceArray
}


open fun setInputAutomationModuleInterfaceArray(inputAutomationModuleInterfaceArray: Array<InputAutomationModuleFactoryInterface?>)
        //nullable = true from not(false or (false and false)) = true
{
var inputAutomationModuleInterfaceArray = inputAutomationModuleInterfaceArray
this.inputAutomationModuleInterfaceArray= inputAutomationModuleInterfaceArray
}


}
                
            

