
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
        package org.allbinary.input.automation.module.configuration




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.input.automation.configuration.InputAutomationConfigurationFactory

open public class InputAutomationModuleConfigurationsSingletonFactory
            : Object
         {
        
companion object {
            
    private var inputAutomationModuleConfigurations: InputAutomationModuleConfigurations = InputAutomationModuleConfigurations(InputAutomationConfigurationFactory.getInstance()!!.getInputAutomationModuleConfigurationList())

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: InputAutomationModuleConfigurations{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputAutomationModuleConfigurations
}


        }
            private constructor ()
            : super()
        {
}


}
                
            

