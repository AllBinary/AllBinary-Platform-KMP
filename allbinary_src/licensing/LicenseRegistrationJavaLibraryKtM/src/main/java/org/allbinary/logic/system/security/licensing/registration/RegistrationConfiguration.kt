
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
        package org.allbinary.logic.system.security.licensing.registration




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.DataInputStream
import java.io.InputStream
import java.io.OutputStream
import org.allbinary.logic.io.AbDataOutputStream
import org.allbinary.logic.io.FileStreamFactory
import org.allbinary.logic.io.StreamUtil
import org.allbinary.logic.io.file.FileFactory
import org.allbinary.string.CommonStrings
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.PreLogUtil

open public class RegistrationConfiguration
            : Object
         {
        

        companion object {
            
    private val SINGLETON: RegistrationConfiguration = RegistrationConfiguration()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: RegistrationConfiguration{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var registrationCode: String = "No Registration Code"

    val NAME: String = "registrationid"

    private val FILE: String = "Registration.dat"
private constructor        ()
            : super()
        {
        try {
            
    
                        if(FileFactory.getInstance()!!.isFile(FILE))
                        
                                    {
                                    this.read()

                                    }
                                
                        else {
                            this.write()

                        }
                            
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CONSTRUCTOR, e)
}

}


                @Throws(Exception::class)
            
open fun read()
        //nullable = true from not(false or (false and true)) = true
{
    var fileInputStreamFactory: FileStreamFactory = FileStreamFactory.getInstance()!!


    var fileInputStream: InputStream = fileInputStreamFactory!!.getFileInputStreamInstance(StringUtil.getInstance()!!.EMPTY_STRING, FILE)!!


    var dataInputStream: DataInputStream = DataInputStream(fileInputStream)

this.setRegistrationCode(dataInputStream!!.readUTF())
PreLogUtil.put(StringMaker().
                            append("Read Configuration: ")!!.append(this.toString())!!.toString(), this, "read")
}


                @Throws(Exception::class)
            
open fun write()
        //nullable = true from not(false or (false and true)) = true
{
    var dataOutputStream: AbDataOutputStream = 
                null
            


        try {
            logUtil!!.put(StringMaker().
                            append("Write Configuration: ")!!.append(this.toString())!!.toString(), this, "write")

    var fileInputStreamFactory: FileStreamFactory = FileStreamFactory.getInstance()!!


    var fileOutputStream: OutputStream = fileInputStreamFactory!!.getFileOutputStreamInstance(StringUtil.getInstance()!!.EMPTY_STRING, FILE)!!

dataOutputStream= AbDataOutputStream(fileOutputStream)
dataOutputStream!!.writeUTF(this.getRegistrationCode())
dataOutputStream!!.flush()

         finally {
            StreamUtil.getInstance()!!.close(dataOutputStream)

         }
        
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringMaker().
                            append("Registration Code: ")!!.append(this.getRegistrationCode())!!.toString()
}


open fun setRegistrationCode(registrationCode: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var registrationCode = registrationCode
this.registrationCode= registrationCode
}


open fun getRegistrationCode()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return registrationCode
}


}
                
            

