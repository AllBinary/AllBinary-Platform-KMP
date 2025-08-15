
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
        package org.allbinary.business.init.db




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.globals.FREEBLISKET_PATH_GLOBALS
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.http.HttpData
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory
import org.allbinary.logic.communication.log.config.type.LogConfigTypes
import org.allbinary.logic.io.AbDataInputStream
import org.allbinary.logic.io.AbDataOutputStream
import org.allbinary.logic.io.AbFileInputStream
import org.allbinary.logic.io.DataOutputStreamFactory
import org.allbinary.logic.io.StreamUtil
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.directory.Directory
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.system.security.crypt.DatabaseEncoder
import org.allbinary.logic.system.security.crypt.WeakCrypt
import org.allbinary.string.CommonStrings

open public class DbInitInfo : DbConnectionInfo {
        

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val directory: Directory = Directory.getInstance()!!
            

    private val httpData: HttpData = HttpData.getInstance()!!
            

    private val GET_URL: String = "getUrl"

    private val PACKAGE: String = FREEBLISKET_PATH_GLOBALS.getInstance()!!.DBINITPATH

    private var initFileName: String

    private var hasRead: Boolean = false
public constructor        (initFileName: String, read: Boolean)                        

                            : super(){

                    var initFileName = initFileName


                    var read = read


                            //For kotlin this is before the body of the constructor.
                    
this.initFileName= initFileName

    
                        if(read)
                        
                                    {
                                    this.updateIfNeeded()

                                    }
                                
                        else {
                            this.setHasRead(true)

                        }
                            
}


open fun getUrl()
        //nullable = true from not(false or (false and true)) = true
: String{
    var url: String = super.getUrl()!!
            


    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.PRELOADER))
                        
                                    {
                                    PreLogUtil.put(this.httpData!!.URL_LABEL +url, this, GET_URL)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return url
}


                @Throws(Exception::class)
            
open fun write()
        //nullable = true from not(false or (false and true)) = true
{
    var PATH: AbPath = AbPath(URLGLOBALS.getWebappPath() +PACKAGE)

this.directory.create(PATH)

    var FILEABPATH: AbPath = AbPath(URLGLOBALS.getWebappPath() +PACKAGE, this.initFileName)


        try {
            
    var newFile: AbFile = AbFile(FILEABPATH)

newFile!!.createNewFile()

    var dataOutputStream: AbDataOutputStream = DataOutputStreamFactory.getInstance()!!.getInstance(newFile)!!
            


        try {
            
    var cryptedJdbcDriver: ByteArray = WeakCrypt(1).
                            encrypt(this.getJdbcDriver())!!.encodeToByteArray()!!
            


    var cryptedName: ByteArray = WeakCrypt(2).
                            encrypt(this.getName())!!.encodeToByteArray()!!
            


    var cryptedUserName: ByteArray = WeakCrypt(3).
                            encrypt(this.getUserName())!!.encodeToByteArray()!!
            


    var cryptedPassword: ByteArray = WeakCrypt(4).
                            encrypt(this.getPassword())!!.encodeToByteArray()!!
            


    var cryptedSchema: ByteArray = WeakCrypt(5).
                            encrypt(this.getSchema())!!.encodeToByteArray()!!
            


    var cryptedServer: ByteArray = WeakCrypt(6).
                            encrypt(this.getServer())!!.encodeToByteArray()!!
            


    var cryptedPort: ByteArray = WeakCrypt(7).
                            encrypt(this.getPort())!!.encodeToByteArray()!!
            

dataOutputStream!!.writeUTF(DatabaseEncoder.encode(cryptedJdbcDriver))
dataOutputStream!!.writeUTF(DatabaseEncoder.encode(cryptedName))
dataOutputStream!!.writeUTF(DatabaseEncoder.encode(cryptedUserName))
dataOutputStream!!.writeUTF(DatabaseEncoder.encode(cryptedPassword))
dataOutputStream!!.writeUTF(DatabaseEncoder.encode(cryptedSchema))
dataOutputStream!!.writeUTF(DatabaseEncoder.encode(cryptedServer))
dataOutputStream!!.writeUTF(DatabaseEncoder.encode(cryptedPort))
hasRead= false

         finally {
            StreamUtil.getInstance()!!.close(dataOutputStream)

         }
        
} catch(e: Exception)
            {
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.PRELOADERERROR))
                        
                                    {
                                    PreLogUtil.put("Failed Write: " +FILEABPATH.toString(), this, "write", e)

                                    }
                                
}

}


                @Throws(Exception::class)
            
open fun load()
        //nullable = true from not(false or (false and true)) = true
{
    var FILEABPATH: AbPath = AbPath(URLGLOBALS.getWebappPath() +PACKAGE, this.initFileName)


        try {
            
    var file: AbFile = AbFile(FILEABPATH)


    
                        if(file.isFile())
                        
                                    {
                                    
    var iFile: AbFileInputStream = AbFileInputStream(file)


    var iData: AbDataInputStream = AbDataInputStream(iFile)


        try {
            
    var decryptedJdbcDriver: String = decode.decodeToString()


    var decryptedName: String = decode.decodeToString()


    var decryptedUserName: String = decode.decodeToString()


    var decryptedPassword: String = decode.decodeToString()


    var decryptedSchema: String = decode.decodeToString()


    var decryptedServer: String = decode.decodeToString()


    var decryptedPort: String = decode.decodeToString()

this.setJdbcDriver(WeakCrypt(1).
                            decrypt(decryptedJdbcDriver))
this.setName(WeakCrypt(2).
                            decrypt(decryptedName))
this.setUserName(WeakCrypt(3).
                            decrypt(decryptedUserName))
this.setPassword(WeakCrypt(4).
                            decrypt(decryptedPassword))
this.setSchema(WeakCrypt(5).
                            decrypt(decryptedSchema))
this.setServer(WeakCrypt(6).
                            decrypt(decryptedServer))
this.setPort(WeakCrypt(7).
                            decrypt(decryptedPort))

    var stringUtil: StringUtil = StringUtil.getInstance()!!
            


         finally {
            StreamUtil.getInstance()!!.close(iData)

         }
        

                                    }
                                
                        else {
                            hasRead= false

    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.PRELOADER))
                        
                                    {
                                    PreLogUtil.put("Not a File - Failed Loading: " +FILEABPATH.toString(), this, commonStrings!!.LOAD)

                                    }
                                

                        }
                            
} catch(e: Exception)
            {
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.PRELOADERERROR))
                        
                                    {
                                    PreLogUtil.put("Failed Loading: " +FILEABPATH.toString(), this, commonStrings!!.LOAD, e)

                                    }
                                
}

}


open fun setHasRead(value: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.hasRead= value
}


open fun updateIfNeeded()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    
                        if(!hasRead)
                        
                                    {
                                    hasRead= true
this.load()

                                    }
                                
} catch(e: Exception)
            {
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.PRELOADERERROR))
                        
                                    {
                                    PreLogUtil.put(commonStrings!!.EXCEPTION, this, "updateIfNeeded", e)

                                    }
                                
}

}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{this.updateIfNeeded()

    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.PRELOADER))
                        
                                    {
                                    PreLogUtil.put("Name: " +super.getName(), this, "getName")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.getName()
}


open fun getUserName()
        //nullable = true from not(false or (false and true)) = true
: String{this.updateIfNeeded()

    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.PRELOADER))
                        
                                    {
                                    PreLogUtil.put("Name: " +super.getUserName(), this, "getUserName")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.getUserName()
}


open fun getPassword()
        //nullable = true from not(false or (false and true)) = true
: String{this.updateIfNeeded()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.getPassword()
}


open fun getSchema()
        //nullable = true from not(false or (false and true)) = true
: String{this.updateIfNeeded()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.getSchema()
}


open fun getServer()
        //nullable = true from not(false or (false and true)) = true
: String{this.updateIfNeeded()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.getServer()
}


open fun getPort()
        //nullable = true from not(false or (false and true)) = true
: String{this.updateIfNeeded()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.getPort()
}


}
                
            

