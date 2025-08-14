
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
        package bundle.input.automation.module




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.input.automation.module.InputAutomationModuleFactoryInterface

open public class InputAutomationModuleService
            : Object
        
                , InputAutomationModuleServiceInterface {
        

    private var inputAutomationModuleInterfaceArray: Array<InputAutomationModuleFactoryInterface?>
public constructor        (inputAutomationModuleInterfaceArray: Array<InputAutomationModuleFactoryInterface?>)
            : super()
        {

                    var inputAutomationModuleInterfaceArray = inputAutomationModuleInterfaceArray
this.setInputAutomationModuleInterfaceArray(inputAutomationModuleInterfaceArray)
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
                
            

