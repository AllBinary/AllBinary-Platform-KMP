
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
        package org.allbinary.logic.string




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class StringUtil
            : Object
         {
        

        companion object {
            
    private val instance: StringUtil = StringUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: StringUtil

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val NULL_STRING: String = "null"

    val EMPTY_STRING: String = ""

    var ONE_EMPTY_STRING_ARRAY: Array<String?> = arrayOf(this.EMPTY_STRING)

    private val stringArray: Array<String?> = arrayOfNulls(0)
private constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


open fun getInstance(string: String)
        //nullable =  from not(true or (false and false)) = 
: String

        Updates for KMP build        
        {
var string = string

    
                        if(string == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return EMPTY_STRING

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return string

                        }
                            
}


open fun getArrayInstance()
        //nullable = true from not(false or (false and true)) = true
: Array<String?>

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringArray
}


open fun count(string: String, aChar: Char)
        //nullable = true from not(false or (false and false)) = true
: Int

        Updates for KMP build        
        {
    //var string = string
    //var aChar = aChar

    var count: Int = 0


    var size: Int = string.length!!





                        for (index in 0 until size)

        

        Updates for KMP build        
        {

    
                        if(string[index] == aChar)
                        
                                    {
                                    count++

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return count
}


open fun toString(anyType: Any)
        //nullable = true from not(false or (true and false)) = true
: String

        Updates for KMP build        
        {
    //var anyType = anyType

    
                        if(anyType != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return anyType!!.toString()

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.NULL_STRING

                        }
                            
}


}
                
            

