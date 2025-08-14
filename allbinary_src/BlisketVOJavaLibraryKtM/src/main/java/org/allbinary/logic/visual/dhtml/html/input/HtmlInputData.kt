
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
        package org.allbinary.logic.visual.dhtml.html.input




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class HtmlInputData
            : Object
         {
        

        companion object {
            
    private val instance: HtmlInputData = HtmlInputData()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: HtmlInputData{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val TEXT: String = "text"

    val RADIO: String = "radio"

    val CHECKBOX: String = "checkbox"

    val HIDDEN: String = "hidden"

    val IMAGE: String = "image"

    val PASSWORD: String = "password"

    val RESET: String = "reset"

    val SUBMIT: String = "submit"

    val TYPES: Array<String?> = arrayOf(TEXT,RADIO,CHECKBOX,HIDDEN,IMAGE,PASSWORD,RADIO,RESET,SUBMIT)

}
                
            

