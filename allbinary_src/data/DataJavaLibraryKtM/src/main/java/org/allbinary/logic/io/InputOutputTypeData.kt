
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
        package org.allbinary.logic.io



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class InputOutputTypeData
            : Object
         {
        

        companion object {
            
    private val instance: InputOutputTypeData = InputOutputTypeData()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: InputOutputTypeData{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        {}


    val NAME: String = "INPUT_OUTPUT_TYPE_NAME"

    val FILE: String = "INPUT_OUTPUT_TYPE_FILE"

    val RESPONSE: String = "INPUT_OUTPUT_TYPE_RESPONSE"

    val DB: String = "INPUT_OUTPUT_TYPE_DB"

    val JSP: String = "jsp"

    val JSP_FRAGMENT: String = "jspf"

    val PHP: String = "php"

    val ASP: String = "asp"

    val PL: String = "pl"

    val DEFAULT: String = JSP

    val DEFAULT_FRAGMENT: String = JSP_FRAGMENT

}
                
            

