
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.globals.PATH_GLOBALS
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.AbDataInputStream
import org.allbinary.logic.io.AbDataOutputStream
import org.allbinary.logic.io.AbFileLocalInputStream
import org.allbinary.logic.io.DataOutputStreamFactory
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.system.security.crypt.DatabaseEncoder
import org.allbinary.logic.system.security.crypt.WeakCrypt

open public class InstallerInfo
            : Object
         {
        

        companion object {


    private val instance: InstallerInfo = InstallerInfo()

    private val INITFILENAME: String = "installerdata.dat"

    private val PACKAGE: String = PATH_GLOBALS.getInstance()!!.INIT_PATH

    private var userName: String = StringUtil.getInstance()!!.EMPTY_STRING

    private var password: String = StringUtil.getInstance()!!.EMPTY_STRING

    private var hasRead: Boolean = false

open fun setHasRead(value: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
InstallerInfo.hasRead= value
}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            
public constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun write()
        //nullable = true from not(false or (false and true)) = true
{
    var FILEABPATH: AbPath = AbPath(URLGLOBALS.getMainPath() +PACKAGE, INITFILENAME)


        try {
            
    var newFile: AbFile = AbFile(FILEABPATH)

newFile!!.createNewFile()

    var dataOutputStream: AbDataOutputStream = DataOutputStreamFactory.getInstance()!!.getInstance(newFile)!!
            


    var cryptedUserName: ByteArray = WeakCrypt(1).
                            encrypt(this.getUserName())!!.encodeToByteArray()!!
            


    var cryptedPassword: ByteArray = WeakCrypt(2).
                            encrypt(this.getPassword())!!.encodeToByteArray()!!
            

dataOutputStream!!.writeUTF(DatabaseEncoder.encode(cryptedUserName))
dataOutputStream!!.writeUTF(DatabaseEncoder.encode(cryptedPassword))
hasRead= false
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.PRELOADERERROR))
                        
                                    {
                                    logUtil!!.put(
                            "Failed", this, 
                            "write")

                                    }
                                



                            throw e
}

}


                @Throws(Exception::class)
            
open fun read()
        //nullable = true from not(false or (false and true)) = true
{
    var FILEABPATH: AbPath = AbPath(URLGLOBALS.getMainPath() +PACKAGE, INITFILENAME)


        try {
            
    var file: AbFile = AbFile(FILEABPATH)


    
                        if(file!!.isFile())
                        
                                    {
                                    
    var iFile: AbFileLocalInputStream = AbFileLocalInputStream(file)


    var iData: AbDataInputStream = AbDataInputStream(iFile)


    var decryptedUserName: String = decode.decodeToString()


    var decryptedPassword: String = decode.decodeToString()

this.setUserName(WeakCrypt(1).
                            decrypt(decryptedUserName))
this.setPassword(WeakCrypt(2).
                            decrypt(decryptedPassword))

                                    }
                                
                        else {
                            
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.PRELOADER))
                        
                                    {
                                    logUtil!!.put("Not a File - Failed Loading: " +FILEABPATH.toString(), this, 
                            "read")

                                    }
                                

                        }
                            
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.PRELOADERERROR))
                        
                                    {
                                    logUtil!!.put(
                            "Failed", this, 
                            "read")

                                    }
                                
}

}


open fun setUserName(userName: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var userName = userName
InstallerInfo.userName= userName
}


open fun setPassword(password: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var password = password
InstallerInfo.password= password
}


                @Throws(Exception::class)
            
open fun updateIfNeeded()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(!hasRead)
                        
                                    {
                                    hasRead= true
this.read()

    
                        if(InstallerInfo.userName == 
                                    null
                                 || InstallerInfo.password == 
                                    null
                                )
                        
                                    {
                                    
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.PRELOADER))
                        
                                    {
                                    logUtil!!.put(
                            "Failed", this, 
                            "updateIfNeeded")

                                    }
                                

                                    }
                                

                                    }
                                
}


                @Throws(Exception::class)
            
open fun getUserName()
        //nullable = true from not(false or (false and true)) = true
: String{this.updateIfNeeded()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return InstallerInfo.userName
}


                @Throws(Exception::class)
            
open fun getPassword()
        //nullable = true from not(false or (false and true)) = true
: String{this.updateIfNeeded()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return InstallerInfo.password
}


                @Throws(Exception::class)
            
open fun isValid(userName: String, password: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var userName = userName


                    var password = password
this.updateIfNeeded()

    
                        if(this.userName != 
                                    null
                                 && this.userName!!.compareTo(userName) == 0 && this.password != 
                                    null
                                 && this.password!!.compareTo(password) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

