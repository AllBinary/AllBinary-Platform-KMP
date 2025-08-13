
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
        package org.allbinary.input.automation.module.generic



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.input.automation.module.InputAutomationModuleFactoryInterface
import org.allbinary.input.automation.module.osgi.InputAutomationModuleServiceFactory
import org.allbinary.logic.communication.log.LogUtil

open public class InputAutomationGenericModuleServiceFactory : InputAutomationModuleServiceFactory {
        

        companion object {
            
    private var inputAutomationGenericModuleServiceFactory: InputAutomationGenericModuleServiceFactory = InputAutomationGenericModuleServiceFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: InputAutomationGenericModuleServiceFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputAutomationGenericModuleServiceFactory
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            
public constructor        (){
        try {
            
    var inputAutomationModuleInterfaceArray: Array<InputAutomationModuleFactoryInterface?> = arrayOfNulls(1)

inputAutomationModuleInterfaceArray[0]= GenericModuleFactory()
this.setInputAutomationModuleInterfaceArray(inputAutomationModuleInterfaceArray)
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, this.commonStrings!!.CONSTRUCTOR, e)
}

}


}
                
            

