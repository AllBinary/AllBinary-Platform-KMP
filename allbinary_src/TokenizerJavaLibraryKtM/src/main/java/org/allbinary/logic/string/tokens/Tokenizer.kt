
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.logic.string.StringUtil
import org.allbinary.util.BasicArrayList

open public class Tokenizer
            : Object
         {
        

    private var sep: String

    private var endSep: String = StringUtil.getInstance()!!.EMPTY_STRING
public constructor        (sep: String)
            : super()
        {

                    var sep = sep

    
                        if(sep == 
                                    null
                                 || sep.compareTo(StringUtil.getInstance()!!.EMPTY_STRING) == 0)
                        
                                    {
                                    


                            throw Exception(
                            "Sep provided is not valid")

                                    }
                                
this.sep= sep
}


open fun setSep(sep: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var sep = sep
this.sep= sep
}


open fun setEndSep(endSep: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var endSep = endSep
this.endSep= endSep
}


open fun getInsideSep(string: String)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var string = string

    var tokenList: BasicArrayList = BasicArrayList()


    var index: Int = 0


    var size: Int = string.length!!
            


        while(index < size)
        {index= string.indexOf(sep, index)

    
                        if(index !=  -1)
                        
                                    {
                                    
    var end: Int = string.indexOf(endSep, index +sep.length)!!
            


    
                        if(end !=  -1)
                        
                                    {
                                    tokenList!!.add(string.substring(index +sep.length, end -(endSep!!.length -1)))
index= end +endSep!!.length

                                    }
                                
                        else {
                            
                        }
                            

                                    }
                                
                        else {
                            break;

                    

                        }
                            
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return tokenList
}


open fun getTokens(string: String, tokenVector: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var string = string


                    var tokenVector = tokenVector

    var index: Int = 0


    var end: Int = 0


        while(index < string.length)
        {end= string.indexOf(sep, index)

    
                        if(end !=  -1)
                        
                                    {
                                    tokenVector!!.add(string.substring(index, end))
index= end +sep.length

                                    }
                                
                        else {
                            tokenVector!!.add(string.substring(index, string.length))
break;

                    

                        }
                            
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return tokenVector
}


open fun getTokens(stringVector: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: Hashtable<Any, Any>{

                    var stringVector = stringVector

    var tokenHashtable: Hashtable<Any, Any> = Hashtable<Any, Any>()


    var string: String = StringUtil.getInstance()!!.EMPTY_STRING


    var end: Int = 0


    var size: Int = stringVector!!.size()!!
            





                        for (index in 0 until size)


        {string= stringVector!!.objectArray[index]!! as String
end= string.indexOf(sep)

    
                        if(end >= 0)
                        
                                    {
                                    tokenHashtable!!.put(string.substring(0, end), string.substring(end +1, string.length))

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return tokenHashtable
}


}
                
            

