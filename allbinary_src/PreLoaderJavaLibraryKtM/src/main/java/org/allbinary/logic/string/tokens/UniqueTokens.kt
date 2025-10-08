
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
        package org.allbinary.logic.string.tokens




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashSet
import java.util.Vector
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.string.regex.replace.Replace
import org.allbinary.string.CommonPhoneStrings
import org.allbinary.string.CommonSeps
import org.allbinary.util.BasicArrayList

open public class UniqueTokens
            : Object
         {
        

    private val specialCharacters: Vector = Vector()
public constructor ()
            : super()
        {
specialCharacters!!.add("!")
specialCharacters!!.add("@")
specialCharacters!!.add(CommonPhoneStrings.getInstance()!!.POUND)
specialCharacters!!.add("$")
specialCharacters!!.add("%")
specialCharacters!!.add("^")
specialCharacters!!.add(CommonSeps.getInstance()!!.AMP)
specialCharacters!!.add(CommonPhoneStrings.getInstance()!!.STAR)
specialCharacters!!.add("(")
specialCharacters!!.add(")")
specialCharacters!!.add("-")
specialCharacters!!.add("_")
specialCharacters!!.add("+")
specialCharacters!!.add("=")
specialCharacters!!.add("\\")
specialCharacters!!.add("|")
specialCharacters!!.add(AbPathData.getInstance()!!.EXTENSION_SEP)
specialCharacters!!.add(",")
specialCharacters!!.add("<")
specialCharacters!!.add(">")
specialCharacters!!.add("?")
specialCharacters!!.add("/")
specialCharacters!!.add("~")
specialCharacters!!.add("`")
}


                @Throws(Exception::class)
            
    open fun getWhithoutDashesAndSkipNumberOnlyTokens(stringVector: Vector)
        //nullable = true from not(false or (false and false)) = true
: HashSet{
var stringVector = stringVector

        try {
            
    var hashSet: HashSet = HashSet()


    var index: Int = 0


    var commonSeps: CommonSeps = CommonSeps.getInstance()!!


        while(index < stringVector!!.size)
        {

    var keywords: String = stringVector!!.elementAt(index) as String


    var tokenizer: Tokenizer = Tokenizer(commonSeps!!.COMMA)


    var keywordVector: BasicArrayList = tokenizer.getTokens(keywords, BasicArrayList())!!





                        for (forIndex in 0 until keywordVector!!.size()!!)

        {

    var cleanString: String = keywordVector!!.get(forIndex) as String

cleanString= cleanString!!.trim()

    
                        if(cleanString!!.indexOf('-') !=  -1)
                        cleanString= Replace("-", commonSeps!!.SPACE).
                            all(cleanString)
hashSet!!.add(cleanString)

    
                        if(cleanString!!.indexOf(' ') !=  -1)
                        
                                    {
                                    
    var spaceTokenizer: Tokenizer = Tokenizer(commonSeps!!.SPACE)


    var subKeywordVector: BasicArrayList = spaceTokenizer!!.getTokens(cleanString, BasicArrayList())!!





                        for (spaceIndex in 0 until subKeywordVector!!.size()!!)

        {

    var subCleanString: String = subKeywordVector!!.get(spaceIndex) as String


    
                        if(!isSpecialCharacter(subCleanString) && !numberOnly(subCleanString))
                        
                                    {
                                    hashSet!!.add(subCleanString)

                                    }
                                
}


                                    }
                                
}

index++
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashSet
} catch(e: Exception)
            {



                            throw e
}

}


    open fun numberOnly(subCleaningString: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var subCleaningString = subCleaningString

        try {
            Integer.parseInt(subCleaningString)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
} catch(e: NumberFormatException)
            {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


    open fun isSpecialCharacter(subCleaningString: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var subCleaningString = subCleaningString




                        for (index in 0 until specialCharacters!!.size!!)

        {

    
                        if(subCleaningString!!.compareTo(specialCharacters!!.elementAt(index) as String) == 0)
                        


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

