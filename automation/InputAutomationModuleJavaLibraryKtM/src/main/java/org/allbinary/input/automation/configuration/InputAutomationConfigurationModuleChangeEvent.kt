
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
        
import org.allbinary.input.automation.module.configuration.InputAutomationModuleConfiguration

open public class InputAutomationConfigurationModuleChangeEvent
            : Object
         {
        

    private var inputAutomationModuleConfiguration: InputAutomationModuleConfiguration
public constructor        (inputAutomationModuleConfiguration: InputAutomationModuleConfiguration)
            : super()
        

        Updates for KMP build        
        {
var inputAutomationModuleConfiguration = inputAutomationModuleConfiguration
this.setInputAutomationModuleConfiguration(inputAutomationModuleConfiguration)
}


open fun getInputAutomationModuleConfiguration()
        //nullable = true from not(false or (false and true)) = true
: InputAutomationModuleConfiguration

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputAutomationModuleConfiguration
}


open fun setInputAutomationModuleConfiguration(inputAutomationModuleConfiguration: InputAutomationModuleConfiguration)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var inputAutomationModuleConfiguration = inputAutomationModuleConfiguration
this.inputAutomationModuleConfiguration= inputAutomationModuleConfiguration
}


}
                
            

