
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2025 AllBinary 
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
        
import javax.crypto.Cipher
import javax.crypto.SecretKey
import org.allbinary.logic.NullUtil
import org.allbinary.logic.java.byteutil.ByteUtil

open public class SecretComposite : BaseSecretComposite {
        

    private val byteUtil: ByteUtil = ByteUtil.getInstance()!!
            

    private val cipher: Cipher

    private val secretKey: SecretKey

    private var key: ByteArray
public constructor        (secretKey: SecretKey, cipher: Cipher, key: ByteArray){

                    var secretKey = secretKey


                    var cipher = cipher


                    var key = key
this.secretKey= secretKey
this.cipher= cipher
this.key= key
}


                @Throws(Exception::class)
            override fun encrypt(array: ByteArray)
        //nullable = true from not(false or (false and false)) = true
: ByteArray{

                    var array = array
array= this.mutilate(array)
cipher.init(Cipher.ENCRYPT_MODE, secretKey)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cipher.doFinal(array)
}


                @Throws(Exception::class)
            override fun decrypt(array: ByteArray)
        //nullable = true from not(false or (false and false)) = true
: ByteArray{

                    var array = array
cipher.init(Cipher.DECRYPT_MODE, secretKey)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.mutilate(cipher.doFinal(array))
}


open fun mutilate(array: ByteArray)
        //nullable = true from not(false or (false and false)) = true
: ByteArray{

                    var array = array




                        for (index in 0 until key.size)


        {
    var value: Byte = key[index]!!


    
                        if(value < 8 && value > 0)
                        
                                    {
                                    array= byteUtil!!.xorByte(array, value.toInt())

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return array
}


}
                
            

