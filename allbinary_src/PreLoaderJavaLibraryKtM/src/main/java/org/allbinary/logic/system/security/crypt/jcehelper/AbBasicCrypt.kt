
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
        
import java.security.Provider
import java.security.Security
import java.security.spec.KeySpec
import javax.crypto.Cipher
import javax.crypto.SecretKey
import javax.crypto.SecretKeyFactory
import org.allbinary.init.crypt.jcehelper.CryptInterface
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.string.CommonStrings

open public class AbBasicCrypt
            : Object
        
                , CryptInterface {
        

    private var cipher: Cipher

    private var secretKey: SecretKey

    private var algorithm: String

    private var key: ByteArray
public constructor        (algorithm: String, key: String)
            : super()
        {
var algorithm = algorithm
var key = key

        try {
            this.algorithm= algorithm
this.key= key.encodeToByteArray()
this.init()
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

PreLogUtil.put(commonStrings!!.EXCEPTION, this, "AbCrypt(alg,key)", e)
}

}


open fun init()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            
    var sunJce: Provider = com.sun.crypto.provider.SunJCE()

Security.addProvider(sunJce)

    var keySpec: KeySpec = KeySpecFactory.getInstance()!!.getInstance(this.algorithm, this.key)!!


    var keyFactory: SecretKeyFactory = SecretKeyFactory.getInstance(algorithm)!!

this.secretKey= keyFactory!!.generateSecret(keySpec)
this.cipher= Cipher.getInstance(algorithm)
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

PreLogUtil.put("init Failed", this, commonStrings!!.INIT, e)
}

}


open fun encrypt(array: ByteArray)
        //nullable = true from not(false or (false and false)) = true
: ByteArray{
var array = array

        try {
            cipher.init(Cipher.ENCRYPT_MODE, secretKey)

    var ivArray: ByteArray = secretKey!!.getEncoded()!!


    var encrypted: ByteArray = cipher.doFinal(array)!!


    var result: ByteArray = ByteArray(ivArray!!.size +encrypted.size)

PreLogUtil.put("ivArray Length: " +ivArray!!.size, this, "encrypt")




                        for (index in 0 until ivArray!!.size)

        {
result[index]= ivArray[index]!!
}





                        for (index in 0 until encrypted.size)

        {
result[index +ivArray!!.size]= encrypted[index]!!
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            {
PreLogUtil.put("Encrypt Failed", this, "encrypt", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun decrypt(array: ByteArray)
        //nullable = true from not(false or (false and false)) = true
: ByteArray{
var array = array

        try {
            cipher.init(Cipher.DECRYPT_MODE, secretKey)

    var ivArray: ByteArray = ByteArray(8)





                        for (index in 0 until 8)

        {
ivArray[index]= array[index]!!
}

PreLogUtil.put("ivArray Length: " +ivArray!!.size, this, "encrypt")

    var result: ByteArray = ByteArray(array.size -ivArray!!.size)





                        for (index in ivArray!!.size until array.size)

        {
result[index -ivArray!!.size]= array[index]!!
}


    var decrypted: ByteArray = cipher.doFinal(result)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            {
PreLogUtil.put("decrypt Failed", this, "decrypt", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


}
                
            

