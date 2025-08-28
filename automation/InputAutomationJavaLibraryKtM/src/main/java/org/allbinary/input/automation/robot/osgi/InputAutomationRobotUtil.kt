
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
        package org.allbinary.input.automation.robot.osgi




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.input.automation.robot.InputRobotInterface

open public class InputAutomationRobotUtil
            : Object
         {
        

        companion object {
            
                @Throws(Exception::class)
            
open fun getChangeEvent(inputRobotInterface: InputRobotInterface)
        //nullable = true from not(false or (false and false)) = true
: InputAutomationRobotChangeEvent{
var inputRobotInterface = inputRobotInterface

    var inputAutomationRobotInterfaceWrapper: InputAutomationRobotInterfaceWrapper = InputAutomationRobotInterfaceWrapper(inputRobotInterface)


    var inputAutomationRobotChangeEvent: InputAutomationRobotChangeEvent = InputAutomationRobotChangeEvent(inputAutomationRobotInterfaceWrapper)




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputAutomationRobotChangeEvent
}


        }
            private constructor        ()
            : super()
        {
}


}
                
            

