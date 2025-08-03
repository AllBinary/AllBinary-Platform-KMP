
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
        package org.allbinary.input.automation.actions.script.condition.processors.input



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Set
import javax.swing
import org.allbinary.input.automation.robot.InputRobotFactory

open public class InputAutomationTypeDefaultComboBoxModelFactory
            : Object
         {
        

        companion object {


                @Throws(Exception::class)
            
open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: DefaultComboBoxModel{
    var defaultComboBoxModel: DefaultComboBoxModel = DefaultComboBoxModel()


    var set: Set = InputRobotFactory.getInstance()!!.get()!!.keySet()!!
            


    var nameArray: Array<Any?> = set!!.toArray()!!
            


    var size: Int = nameArray!!.size
                





                        for (index in 0 until size)


        {defaultComboBoxModel!!.addElement(nameArray[index]!! as String)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return defaultComboBoxModel
}



        }
            private constructor        ()
            : super()
        {}


}
                
            

