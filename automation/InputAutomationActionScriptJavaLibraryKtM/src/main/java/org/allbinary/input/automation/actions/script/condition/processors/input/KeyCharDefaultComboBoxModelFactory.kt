
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




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.swing
import abbot.tester.KeyStrokeMap
import org.allbinary.input.KeySingletonFactory

open public class KeyCharDefaultComboBoxModelFactory
            : Object
         {
        

        companion object {
            
open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: DefaultComboBoxModel{
    var defaultComboBoxModel: DefaultComboBoxModel = DefaultComboBoxModel()


    var keyArray: Array<Integer?> = KeySingletonFactory.getArray()!!





                        for (index in 0 until keyArray!!.size)


        {
    var nextKey: Integer = keyArray[index]!!


    var keyStroke: KeyStroke = KeyStroke.getKeyStroke(nextKey!!.toInt(), 0)!!


    var keyChar: Char = KeyStrokeMap.getChar(keyStroke)!!

defaultComboBoxModel!!.addElement(Character.toString(keyChar))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return defaultComboBoxModel
}


        }
            private constructor        ()
            : super()
        {}


}
                
            

