
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
        
import org.allbinary.logic.string.StringMaker

open public class CommonSeps
            : Object
         {
        
companion object {
            
    private val instance: CommonSeps = CommonSeps()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CommonSeps{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CommonSeps.instance
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

    val COLON_SEP: String = StringMaker().
                            append(this.COLON)!!.append(this.SPACE)!!.toString()!!

    val COMMA_SEP: String = StringMaker().
                            append(this.COMMA)!!.append(this.SPACE)!!.toString()!!

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

    val QUESTION: String = "?"

    val QUOTE: String = "\""

    val QUOTE_END: String = "\","

    val COMMENT: String = "//"

}
                
            

