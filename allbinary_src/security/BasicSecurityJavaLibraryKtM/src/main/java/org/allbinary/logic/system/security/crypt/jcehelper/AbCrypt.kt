
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
        
import java.security.Security
import java.security.spec.KeySpec
import javax.crypto.Cipher
import javax.crypto.SecretKey
import javax.crypto.SecretKeyFactory
import org.allbinary.init.crypt.jcehelper.CryptInterface
import org.allbinary.logic.NullUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.java.byteutil.ByteUtil
import org.allbinary.string.CommonStrings
import org.bouncycastle.jce.provider.BouncyCastleProvider

open public class AbCrypt
            : Object
        
                , CryptInterface {
        

    private var secretComposite: BaseSecretComposite = BaseSecretComposite.NULL_SECRET_COMPOSITE

    private var algorithm: String
public constructor (algorithm: String)
            : super()
        {
    //var algorithm = algorithm
this.algorithm= algorithm
}


    open fun init(keyAsString: String)
        //nullable = true from not(false or (false and false)) = true
{
    //var keyAsString = keyAsString

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


        try {
            
        try {
            Security.addProvider(BouncyCastleProvider())
} catch(e: Exception)
            {
PreLogUtil.put(commonStrings!!.EXCEPTION, this, commonStrings!!.INIT, e)
}


    var key: ByteArray = keyAsString!!.encodeToByteArray()!!


    var keySpec: KeySpec = KeySpecFactory.getInstance()!!.getInstance(this.algorithm, key)!!


    var keyFactory: SecretKeyFactory = SecretKeyFactory.getInstance(algorithm)!!


    var secretKey: SecretKey = keyFactory!!.generateSecret(keySpec)!!


    var cipher: Cipher = Cipher.getInstance(algorithm)!!

this.secretComposite= SecretComposite(secretKey, cipher, key)
} catch(e: Exception)
            {
PreLogUtil.put("init Failed", this, commonStrings!!.INIT, e)
}

}


    override fun encrypt(array: ByteArray)
        //nullable = true from not(false or (false and false)) = true
: ByteArray{
    //var array = array

        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.secretComposite!!.encrypt(array)
} catch(e: Exception)
            {
PreLogUtil.put("Encrypt Failed", this, "encrypt", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullUtil.getInstance()!!.NULL_BYTE_ARRAY
}

}


    override fun decrypt(array: ByteArray)
        //nullable = true from not(false or (false and false)) = true
: ByteArray{
    //var array = array

        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.secretComposite!!.decrypt(array)
} catch(e: Exception)
            {
PreLogUtil.put("decrypt Failed", this, "decrypt", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullUtil.getInstance()!!.NULL_BYTE_ARRAY
}

}


}
                
            

