
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
        package org.allbinary.init.crypt.jcehelper



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.InputStream
import org.allbinary.logic.communication.log.LogUtil

open public class BasicCryptUtil
            : Object
         {
        

        companion object {


    private val instance: BasicCryptUtil = BasicCryptUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BasicCryptUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val XML_START: String = "<?xml"

                @Throws(Exception::class)
            
open fun getDecryptedInputStream(inputStream: InputStream, cryptInterface: CryptInterface)
        //nullable = true from not(false or (false and false)) = true
: InputStream{

                    var inputStream = inputStream


                    var cryptInterface = cryptInterface

    var buffer: ByteArrayOutputStream = ByteArrayOutputStream()


    var ch: Int= 0


        while(true)
        {ch= inputStream!!.read()

    
                        if(ch ==  -1)
                        
                                    {
                                    break;

                    

                                    }
                                
buffer.write(ch)
}


    var decrypted: ByteArray = cryptInterface!!.decrypt(buffer.toByteArray())!!
            


    var decryptedString: String = decrypted.decodeToString()


    var index: Int = decryptedString!!.indexOf(XML_START)!!
            


    
                        if(index > 0)
                        
                                    {
                                    decryptedString= decryptedString!!.substring(index)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ByteArrayInputStream(decryptedString!!.encodeToByteArray())
}


}
                
            

