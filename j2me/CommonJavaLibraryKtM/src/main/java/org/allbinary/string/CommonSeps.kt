
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
        package org.allbinary.string




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class CommonSeps
            : Object
         {
        

        companion object {
            
    private val SINGLETON: CommonSeps = CommonSeps()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CommonSeps

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val NEW_LINE: String = "\n"

    val SEMICOLON: String = ";"

    val EQUALS: String = "="

    val SPACE: String = " "

    val COMMA: String = ","

    val COLON: String = ":"

    val PERIOD: String = "."

    val UNDERSCORE: String = "_"

    val COLON_SEP: String = COLON +SPACE

    val COMMA_SEP: String = COMMA +SPACE

    val PARENTHESIS_OPEN: String = "("

    val PARENTHESIS_CLOSE: String = ")"

    val BRACE_OPEN: String = "{"

    val BRACE_CLOSE: String = "}"

    val BRACKET_OPEN: String = "["

    val BRACKET_CLOSE: String = "]"

    val DASH: String = "-"

    val PERCENT: String = "%"

    val AMPERSAND: String = "&"

    val FORWARD_SLASH: String = "/"

    val BACK_SLASH: String = "\\"

    val AMP: String = "&"

    val QUESTION: String = "?"

    val QUOTE: String = "\""

    val QUOTE_END: String = "\","

    val COMMENT: String = "//"

}
                
            

