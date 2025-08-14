
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
        package org.allbinary.game.configuration




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import javax.microedition.lcdui.TextField
import org.allbinary.logic.string.StringUtil

open public class GameConfigurationTextInput
            : Object
         {
        

        companion object {
            
    private var hashtable: Hashtable<Any, Any> = Hashtable<Any, Any>()

    var SIMULATOR_IP: GameConfigurationTextInput = GameConfigurationTextInput(
                            "IP: ", 
                            "192.168.1.3")

    var SIMULATOR_PORT: GameConfigurationTextInput = GameConfigurationTextInput(
                            "Port: ", 
                            "8010")

open fun update(textField: TextField)
        //nullable = true from not(false or (false and false)) = true
{

                    var textField = textField

    var anyType: Any = textField!!.getLabel() as Object


    var gameConfigurationTextInput: GameConfigurationTextInput = hashtable.get(anyType as Object?) as GameConfigurationTextInput

gameConfigurationTextInput!!.setText(textField!!.getString())
}


open fun getHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashtable
}


        }
            
    private var label: String = StringUtil.getInstance()!!.EMPTY_STRING

    private var text: String = StringUtil.getInstance()!!.EMPTY_STRING
public constructor        (label: String, text: String)
            : super()
        {

                    var label = label


                    var text = text
this.setText(text)
this.setLabel(label)
hashtable.put(this.getLabel(), this)
}


open fun setText(text: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var text = text
this.text= text
}


open fun getText()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return text
}


open fun setLabel(label: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var label = label
this.label= label
}


open fun getLabel()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return label
}


}
                
            

