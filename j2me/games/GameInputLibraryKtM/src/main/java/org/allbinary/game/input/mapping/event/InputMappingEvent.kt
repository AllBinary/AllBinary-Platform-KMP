
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
        package org.allbinary.game.input.mapping.event




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.mapping.InputToGameKeyMapping
import org.allbinary.logic.util.event.AllBinaryEventObject

open public class InputMappingEvent : AllBinaryEventObject {
        

    private var inputToGameKeyMapping: InputToGameKeyMapping = InputToGameKeyMapping.NULL_INPUT_TO_GAME_KEY_MAPPING
public constructor (anyType: Any)                        

                            : super(anyType){
var anyType = anyType


                            //For kotlin this is before the body of the constructor.
                    
}


    open fun setInputToGameKeyMapping(inputToGameKeyMapping: InputToGameKeyMapping)
        //nullable = true from not(false or (false and false)) = true
{
var inputToGameKeyMapping = inputToGameKeyMapping
this.inputToGameKeyMapping= inputToGameKeyMapping
}


    open fun getInputToGameKeyMapping()
        //nullable = true from not(false or (false and true)) = true
: InputToGameKeyMapping{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputToGameKeyMapping
}


}
                
            

