
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
        package org.allbinary.logic.system.security.crypt.jcehelper




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.init.crypt.jcehelper.CryptInterface
import org.allbinary.logic.NullUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.java.byteutil.ByteUtil
import org.allbinary.string.CommonStrings

open public class BasicCrypt
            : Object
        
                , CryptInterface {
        

    private val byteUtil: ByteUtil = ByteUtil.getInstance()!!
            

    private val key: ByteArray
public constructor        (keyAsString: String)
            : super()
        {

                    var keyAsString = keyAsString

    var key: ByteArray = NullUtil.getInstance()!!.NULL_BYTE_ARRAY


        try {
            key= keyAsString!!.encodeToByteArray()
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

PreLogUtil.put(commonStrings!!.EXCEPTION, this, 
                            "AbCrypt(alg,key)", e)
}

this.key= key
}

override fun encrypt(array: ByteArray)
        //nullable = true from not(false or (false and false)) = true
: ByteArray{

                    var array = array

        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.mutilate(array)
} catch(e: Exception)
            {PreLogUtil.put(
                            "Encrypt Failed", this, 
                            "encrypt", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullUtil.getInstance()!!.NULL_BYTE_ARRAY
}

}

override fun decrypt(array: ByteArray)
        //nullable = true from not(false or (false and false)) = true
: ByteArray{

                    var array = array

        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.mutilate(array)
} catch(e: Exception)
            {PreLogUtil.put(
                            "decrypt Failed", this, 
                            "decrypt", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullUtil.getInstance()!!.NULL_BYTE_ARRAY
}

}


open fun mutilate(array: ByteArray)
        //nullable = true from not(false or (false and false)) = true
: ByteArray{

                    var array = array

    var value: Byte





                        for (index in 0 until key.size)


        {value= key[index]!!
array= byteUtil!!.xor(array, value)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return array
}


}
                
            

