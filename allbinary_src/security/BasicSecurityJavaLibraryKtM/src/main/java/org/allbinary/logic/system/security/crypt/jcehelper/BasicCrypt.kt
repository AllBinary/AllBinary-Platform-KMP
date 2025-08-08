
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.init.crypt.jcehelper.CryptInterface
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.java.byteutil.ByteUtil
import org.allbinary.string.CommonStrings

open public class BasicCrypt
            : Object
        
                , CryptInterface {
        

    private val byteUtil: ByteUtil = ByteUtil.getInstance()!!
            

    private var key: ByteArray
public constructor        (key: String)
            : super()
        {

                    var key = key

        try {
            this.key= key.encodeToByteArray()
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

PreLogUtil.put(commonStrings!!.EXCEPTION, this, 
                            "AbCrypt(alg,key)", e)
}

}


open fun encrypt(array: ByteArray)
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
                        return null
}

}


open fun decrypt(array: ByteArray)
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
                        return null
}

}


open fun mutilate(array: ByteArray)
        //nullable = true from not(false or (false and false)) = true
: ByteArray{

                    var array = array




                        for (index in 0 until key.size)


        {
    var val: Byte = key[index]!!

array= byteUtil!!.xor(array, val)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return array
}


}
                
            

