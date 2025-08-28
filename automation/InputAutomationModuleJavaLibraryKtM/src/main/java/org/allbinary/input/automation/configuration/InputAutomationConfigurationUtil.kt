
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
        package org.allbinary.input.automation.configuration




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.input.automation.module.InputAutomationModuleFactoryInterface
import org.allbinary.input.automation.module.configuration.InputAutomationModuleConfiguration

open public class InputAutomationConfigurationUtil
            : Object
         {
        

        companion object {
            
                @Throws(Exception::class)
            
open fun getChangeEvent(inputAutomationModuleInterface: InputAutomationModuleFactoryInterface)
        //nullable = true from not(false or (false and false)) = true
: InputAutomationConfigurationModuleChangeEvent{
var inputAutomationModuleInterface = inputAutomationModuleInterface

    var inputAutomationModuleConfiguration: InputAutomationModuleConfiguration = InputAutomationModuleConfiguration(inputAutomationModuleInterface)


    var inputAutomationConfigurationModuleChangeEvent: InputAutomationConfigurationModuleChangeEvent = InputAutomationConfigurationModuleChangeEvent(inputAutomationModuleConfiguration)




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputAutomationConfigurationModuleChangeEvent
}


        }
            private constructor        ()
            : super()
        {
}


}
                
            

