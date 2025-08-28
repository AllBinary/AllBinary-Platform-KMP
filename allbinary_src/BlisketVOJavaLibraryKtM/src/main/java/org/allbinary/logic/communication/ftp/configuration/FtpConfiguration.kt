
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
        package org.allbinary.logic.communication.ftp.configuration




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap

open public class FtpConfiguration
            : Object
        
                , FtpConfigurationInterface {
        

    private var ftpServer: String

    private var ftpPath: String

    private var ftpUserName: String

    private var ftpPassword: String
public constructor        ()
            : super()
        

        Updates for KMP build        
        {
}

public constructor        (hashMap: HashMap<Any, Any>)
            : super()
        

        Updates for KMP build        
        {
var hashMap = hashMap
this.ftpServer= hashMap!!.get(FtpConfigurationData.SERVER) as String
this.ftpPath= hashMap!!.get(FtpConfigurationData.PATH) as String
this.ftpUserName= hashMap!!.get(FtpConfigurationData.USERNAME) as String
this.ftpPassword= hashMap!!.get(FtpConfigurationData.PASSWORD) as String
}


open fun getServer()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.ftpServer
}


open fun getPath()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.ftpPath
}


open fun getUserName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.ftpUserName
}


open fun getPassword()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.ftpPassword
}


open fun setServer(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
this.ftpServer= value
}


open fun setPath(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
this.ftpPath= value
}


open fun setUserName(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
this.ftpUserName= value
}


open fun setPassword(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
this.ftpPassword= value
}


}
                
            

