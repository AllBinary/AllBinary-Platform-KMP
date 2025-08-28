
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
        package org.allbinary.data




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.string.tokens.Tokenizer
import org.allbinary.string.CommonSeps
import org.allbinary.util.BasicArrayList

open public class CamelCaseUtil
            : Object
         {
        

        companion object {
            
    private val instance: CamelCaseUtil = CamelCaseUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CamelCaseUtil

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val commonSeps: CommonSeps = CommonSeps.getInstance()!!

                @Throws(Exception::class)
            
open fun getAsCamelCase(string: String, stringBuilder: StringMaker)
        //nullable = true from not(false or (false and false)) = true
: String

        Updates for KMP build        
        {
    //var string = string
    //var stringBuilder = stringBuilder

    
                        if(string == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING

                                    }
                                

    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!

stringBuilder!!.delete(0, stringBuilder!!.length())

    var list: BasicArrayList = BasicArrayList()


    var tokenizer: Tokenizer = Tokenizer(commonSeps!!.UNDERSCORE)

tokenizer.getTokens(string, list)

    var size: Int = list.size()!!


    var word: String





                        for (i in 0 until size)

        

        Updates for KMP build        
        {
word= list.get(i) as String
word= if(stringValidationUtil!!.isEmpty(word)) {
                            
                            word
                        
                            } else {
                            StringMaker().
                            append(Character.toUpperCase(word[0]))!!.append(word.substring(1)!!.lowercase())!!.toString()
                            }
    
stringBuilder!!.append(word)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuilder!!.toString()
}


}
                
            

