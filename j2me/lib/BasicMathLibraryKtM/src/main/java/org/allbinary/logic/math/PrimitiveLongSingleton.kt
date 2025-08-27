
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
        package org.allbinary.logic.math




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker

open public class PrimitiveLongSingleton
            : Object
         {
        

        companion object {
            
    private val instance: PrimitiveLongSingleton = PrimitiveLongSingleton()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PrimitiveLongSingleton{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val UNK: CharArray = charArrayOf('U','n','k')

    val NUMBER_ARRAY: ByteArray = byteArrayOf(0,1,2,3,4,5,6,7,8,9)

    val NUMBER_CHAR_ARRAY: CharArray = charArrayOf('0','1','2','3','4','5','6','7','8','9')

    val NUMBER_CHAR_ARRAYS: Array<CharArray?> = arrayOf(charArrayOf('0'),charArrayOf('1'),charArrayOf('2'),charArrayOf('3'),charArrayOf('4'),charArrayOf('5'),charArrayOf('6'),charArrayOf('7'),charArrayOf('8'),charArrayOf('9'))

    val ZERO: CharArray = 
                                                        
                                                        charArrayOf(this.NUMBER_CHAR_ARRAY[0])
                                                    

                @Throws(Exception::class)
            
open fun getNumberFromChar(numberAsChar: Char)
        //nullable = true from not(false or (false and false)) = true
: Byte{

                    var numberAsChar = numberAsChar

    var size: Int = NUMBER_CHAR_ARRAY.size
                





                        for (index in 0 until size)

        {
    
                        if(NUMBER_CHAR_ARRAY[index] == numberAsChar)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.NUMBER_ARRAY[index]!!

                                    }
                                
}




                            throw Exception(StringMaker().
                            append("numberAsChar was not in array: ")!!.append(numberAsChar)!!.toString())
}


}
                
            

