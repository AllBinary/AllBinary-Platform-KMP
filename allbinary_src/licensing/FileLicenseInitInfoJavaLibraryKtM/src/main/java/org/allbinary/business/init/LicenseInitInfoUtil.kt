
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
        package org.allbinary.business.init



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.globals.PATH_GLOBALS
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.AbDataInputStream
import org.allbinary.logic.io.AbDataOutputStream
import org.allbinary.logic.io.AbFileInputStream
import org.allbinary.logic.io.DataOutputStreamFactory
import org.allbinary.logic.io.FileStreamFactory
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.system.security.crypt.DatabaseEncoder
import org.allbinary.logic.system.security.crypt.WeakCrypt

open public class LicenseInitInfoUtil
            : Object
         {
        

        companion object {
            
    private val instance: LicenseInitInfoUtil = LicenseInitInfoUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: LicenseInitInfoUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val INITFILENAME: String = "licenseinitdata.dat"

    val ABOUT: String = "about"

    val PRIVACY_POLICY: String = "privacy_policy"

    private var filePath: String = StringUtil.getInstance()!!.EMPTY_STRING

open fun setFilePath(filePath: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var filePath = filePath
this.filePath= filePath
}


                @Throws(Exception::class)
            
open fun write(initData: LicenseInitInfo)
        //nullable = true from not(false or (false and false)) = true
{

                    var initData = initData

    
                        if(this.filePath == 
                                    null
                                )
                        
                                    {
                                    this.filePath= URLGLOBALS.getMainPath() +PATH_GLOBALS.getInstance()!!.INIT_PATH

                                    }
                                

        try {
            
    var dataOutputStream: AbDataOutputStream = DataOutputStreamFactory.getInstance()!!.getInstance(this.filePath, INITFILENAME)!!
            


    var licenseIdCrypted: ByteArray = WeakCrypt(1).
                            encrypt(initData!!.getLicenseId())!!.encodeToByteArray()!!
            

dataOutputStream!!.writeUTF(DatabaseEncoder.encode(licenseIdCrypted))

    var numberOfLicenseServers: Int = initData!!.getNumberOfServers()!!
            

dataOutputStream!!.writeInt(numberOfLicenseServers)




                        for (index in 0 until numberOfLicenseServers)


        {
    var licenseServerCrypted: ByteArray = WeakCrypt(3).
                            encrypt(initData!!.getServer(index))!!.encodeToByteArray()!!
            

dataOutputStream!!.writeUTF(DatabaseEncoder.encode(licenseServerCrypted))
}

} catch(e: Exception)
            {logUtil!!.put("Command Failed: " +INITFILENAME, this, 
                            "write", e)
FileStreamFactory.getInstance()!!.delete(this.filePath, INITFILENAME)



                            throw e
}

}


                @Throws(Exception::class)
            
open fun read()
        //nullable = true from not(false or (false and true)) = true
: LicenseInitInfo{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return readAgain(0)
}


                @Throws(Exception::class)
            
open fun readAgain(initializeCounter: Int)
        //nullable = true from not(false or (false and false)) = true
: LicenseInitInfo{

                    var initializeCounter = initializeCounter

    var METHOD_NAME: String = "readAgain"


    
                        if(this.filePath == 
                                    null
                                )
                        
                                    {
                                    this.filePath= URLGLOBALS.getMainPath() +PATH_GLOBALS.getInstance()!!.INIT_PATH

                                    }
                                

        try {
            logUtil!!.put("LicenseInitInfo File: " +INITFILENAME, this, METHOD_NAME)

    var fileStreamFactory: FileStreamFactory = FileStreamFactory.getInstance()!!
            


    var iFile: AbFileInputStream = fileStreamFactory!!.getFileInputStreamInstance(this.filePath, INITFILENAME)!!
            


    
                        if(iFile != 
                                    null
                                )
                        
                                    {
                                    
    var iData: AbDataInputStream = AbDataInputStream(iFile)


    var initInfo: LicenseInitInfo = LicenseInitInfo()


    var decodedByteArray: ByteArray = DatabaseEncoder.decode(iData!!.readUTF())!!
            


    var licenseIdDecoded: String = decodedByteArray.decodeToString()

initInfo!!.setLicenseId(WeakCrypt(1).
                            decrypt(licenseIdDecoded))

    var numberOfLicenseServers: Int = iData!!.readInt()!!
            


    var NEXT_FILE: String = "Next License Server From File: "


    var licenseServerDecoded: String





                        for (index in 0 until numberOfLicenseServers)


        {decodedByteArray= DatabaseEncoder.decode(iData!!.readUTF())
licenseServerDecoded= decodedByteArray.decodeToString()
initInfo!!.setServer(WeakCrypt(3).
                            decrypt(licenseServerDecoded), index)
logUtil!!.put(NEXT_FILE +initInfo!!.getServer(index), this, METHOD_NAME)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return initInfo

                                    }
                                
                        else {
                            


                            throw Exception("Could Not Load License InitInfo: " +INITFILENAME)

                        }
                            
} catch(e: Exception)
            {
        try {
            logUtil!!.put("Command Failed: " +INITFILENAME, this, METHOD_NAME, e)
Thread.sleep(2000)

    
                        if(initializeCounter < 3)
                        
                                    {
                                    initializeCounter++



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return readAgain(initializeCounter++)

                                    }
                                
} catch(se: Exception)
            {logUtil!!.put("LicenseInitInfo Read Retry: " +INITFILENAME, this, 
                            "readAgain()", se)
}




                            throw Exception("LicenseInitInfo Read Error: " +INITFILENAME)
}

}


open fun getFilePath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return filePath
}


}
                
            

