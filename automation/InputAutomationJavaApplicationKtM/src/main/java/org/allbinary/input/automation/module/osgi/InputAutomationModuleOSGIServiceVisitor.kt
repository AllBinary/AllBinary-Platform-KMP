
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import bundle.input.automation.module.InputAutomationModuleService
import org.allbinary.input.automation.InputAutomationJFrame
import org.allbinary.input.automation.configuration.InputAutomationConfigurationUtil
import org.allbinary.input.automation.module.InputAutomationModuleFactoryInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.osgi.OSGIServiceInterface
import org.allbinary.osgi.OSGIServiceVisitorInterface
import org.allbinary.string.CommonStrings

open public class InputAutomationModuleOSGIServiceVisitor
            : Object
        
                , OSGIServiceVisitorInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            
public constructor        ()
            : super()
        {}


open fun visit(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Any{

                    var anyType = anyType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.visit(anyType as OSGIServiceInterface)
}


open fun visit(osgiServiceInterface: OSGIServiceInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var osgiServiceInterface = osgiServiceInterface

        try {
            
    var inputAutomationModuleService: InputAutomationModuleService = osgiServiceInterface as InputAutomationModuleService


    var inputAutomationModuleInterfaceArray: Array<InputAutomationModuleFactoryInterface?> = inputAutomationModuleService!!.getInputAutomationModuleInterfaceArray()!!
            





                        for (index in 0 until inputAutomationModuleInterfaceArray!!.size)


        {InputAutomationJFrame.getInstance()!!.onAdd(InputAutomationConfigurationUtil.getChangeEvent(inputAutomationModuleInterfaceArray[index]!!))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, 
                            "visit", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


}
                
            

