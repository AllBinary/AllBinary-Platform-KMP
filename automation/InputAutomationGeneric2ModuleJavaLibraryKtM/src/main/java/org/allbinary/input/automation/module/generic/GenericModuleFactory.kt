
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
        
import org.allbinary.input.automation.module.AbstractInputAutomationFactory
import org.allbinary.input.automation.module.InputAutomationActionInterface
import org.allbinary.input.automation.module.InputAutomationModuleData
import org.allbinary.input.automation.module.generic.configuration.GenericModuleConfigurationJPanel
import org.allbinary.input.automation.module.generic.configuration.profile.GenericProfile
import org.allbinary.input.automation.module.generic.constraints.NoImageComparatorConstraints
import org.allbinary.input.automation.module.generic.constraints.NoMotionRectangleConstraints
import org.allbinary.thread.RunnableInterface

open public class GenericModuleFactory : AbstractInputAutomationFactory {
        

        companion object {


    private var NAME: String = "Generic" +InputAutomationModuleData.MODULE_NAME_END


        }
            public constructor        ()                        

                            : super(NAME, GenericModuleConfigurationJPanel()){

                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: RunnableInterface{
    var genericProfile: GenericProfile = 
                                    (getConfigurationJPanel as GenericModuleConfigurationJPanel).getSelectedGenericProfile()!!
            


    var inputAutomationActionInterface: InputAutomationActionInterface = GenericInputAutomationAction() as InputAutomationActionInterface




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GenericInputAutomationWorker(inputAutomationActionInterface, genericProfile, NoMotionRectangleConstraints(), NoImageComparatorConstraints()) as RunnableInterface
}


}
                
            

