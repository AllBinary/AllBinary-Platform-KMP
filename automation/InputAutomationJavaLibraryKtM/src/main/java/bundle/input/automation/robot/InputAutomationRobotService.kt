
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
        package bundle.input.automation.robot




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.input.automation.robot.InputRobotInterface

open public class InputAutomationRobotService
            : Object
        
                , InputAutomationRobotServiceInterface {
        

    private var inputRobotInterfaceArray: Array<InputRobotInterface?>
public constructor        (inputRobotInterfaceArray: Array<InputRobotInterface?>)
            : super()
        {

                    var inputRobotInterfaceArray = inputRobotInterfaceArray
this.setInputRobotInterfaceArray(inputRobotInterfaceArray)
}


open fun getInputRobotInterfaceArray()
        //nullable = true from not(false or (false and true)) = true
: Array<InputRobotInterface?>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputRobotInterfaceArray
}


open fun setInputRobotInterfaceArray(inputRobotInterfaceArray: Array<InputRobotInterface?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var inputRobotInterfaceArray = inputRobotInterfaceArray
this.inputRobotInterfaceArray= inputRobotInterfaceArray
}


}
                
            

