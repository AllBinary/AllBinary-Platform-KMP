
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
        package org.allbinary.input.automation.module.game.test




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.swing
import org.allbinary.input.automation.module.AbstractInputAutomationFactory
import org.allbinary.input.automation.module.InputAutomationModuleData
import org.allbinary.input.automation.module.configuration.BlankModuleConfigurationJPanel
import org.allbinary.thread.RunnableInterface

open public class TestModuleFactory : AbstractInputAutomationFactory {
        
companion object {
            
    private var NAME: String = "Test New Game" +InputAutomationModuleData.MODULE_NAME_END

        }
            
    private var blankModuleConfigurationJPanel: BlankModuleConfigurationJPanel
public constructor ()                        

                            : super(NAME, BlankModuleConfigurationJPanel()){


                            //For kotlin this is before the body of the constructor.
                    
}


    open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NAME
}


    open fun getConfigurationJPanel()
        //nullable = true from not(false or (false and true)) = true
: JPanel{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.blankModuleConfigurationJPanel
}


                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: RunnableInterface{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


}
                
            

