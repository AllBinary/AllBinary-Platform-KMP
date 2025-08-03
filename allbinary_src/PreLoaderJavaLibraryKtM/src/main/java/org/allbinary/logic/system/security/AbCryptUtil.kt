
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
        package org.allbinary.logic.system.security



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.ByteArrayOutputStream
import java.io.InputStream
import org.allbinary.logic.io.StreamUtil
import org.allbinary.logic.system.security.crypt.jcehelper.AbCrypt
import org.allbinary.logic.system.security.crypt.jcehelper.KeySpecFactory

open public class AbCryptUtil
            : Object
         {
        

        companion object {


    private val instance: AbCryptUtil = AbCryptUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AbCryptUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
    private val streamUtil: StreamUtil = StreamUtil.getInstance()!!
            
private constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun decrypt(inputStream: InputStream, key: String)
        //nullable = true from not(false or (false and false)) = true
: ByteArray{

                    var inputStream = inputStream


                    var key = key

    var outputStream: ByteArrayOutputStream = 
                null
            


        try {
            outputStream= streamUtil!!.get(inputStream, ByteArrayOutputStream(), ByteArray(16384)) as ByteArrayOutputStream

    var abCrypt: AbCrypt = AbCrypt(KeySpecFactory.getInstance()!!.DESEDE, key)




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return abCrypt!!.decrypt(outputStream!!.toByteArray())

         finally {
            streamUtil!!.close(outputStream)
streamUtil!!.close(inputStream)

         }
        
}


}
                
            

