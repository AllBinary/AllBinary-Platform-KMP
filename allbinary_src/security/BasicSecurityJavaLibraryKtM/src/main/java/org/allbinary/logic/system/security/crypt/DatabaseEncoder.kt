
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
        package org.allbinary.logic.system.security.crypt




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.NullUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.tokens.Tokenizer
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class DatabaseEncoder
            : Object
         {
        

        companion object {
            
open fun encode(value: ByteArray)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var value = value

        try {
            
    var array: ByteArray = value


    var stringBuffer: StringMaker = StringMaker()





                        for (index in 0 until array.size)


        {stringBuffer!!.append(array[index]!!.
                            toString())

    
                        if(index < array.size -1)
                        
                                    {
                                    stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

PreLogUtil.put(commonStrings!!.EXCEPTION, "DatabaseEncoder", "decode", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING
}

}


open fun decode(value: String)
        //nullable = true from not(false or (false and false)) = true
: ByteArray{

                    var value = value

        try {
            
    var tokenizer: Tokenizer = Tokenizer(CommonSeps.getInstance()!!.SPACE)


    var vector: BasicArrayList = tokenizer.getTokens(value, BasicArrayList())!!
            


    var byteVector: BasicArrayList = BasicArrayList()


    var size: Int = vector.size()!!
            


    var byteOfData: String





                        for (index in 0 until size)


        {byteOfData= vector.objectArray[index]!! as String
byteVector!!.add(byteOfData)
}


    var decode: ByteArray = ByteArray(byteVector!!.size())


    var decodeIndex: Int = 0


    var aByte: Byte





                        for (index in 0 until size)


        {aByte= byteVector!!.objectArray[index]!! as Byte
decode[decodeIndex]= aByte!!.toByte()
decodeIndex++
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return decode
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

PreLogUtil.put(commonStrings!!.EXCEPTION, "DatabaseEncoder", "decode", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullUtil.getInstance()!!.NULL_BYTE_ARRAY
}

}


        }
            private constructor        ()
            : super()
        {}


}
                
            

