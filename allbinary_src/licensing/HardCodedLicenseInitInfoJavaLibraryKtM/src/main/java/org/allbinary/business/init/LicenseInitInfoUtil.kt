
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

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
            
    val INITFILENAME: String = "licenseinitdata.dat"

    val ABOUT: String = "about"

    val PRIVACY_POLICY: String = "privacy_policy"

    private val OFFICIAL_ALLBINARY_SERVICES_SERVER: String = "https://services.allbinary.com/LicServ/serverssl.php"
@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun setFilePath(filePath: String)
        //nullable = true from not(false or (false and false)) = true
{
var filePath = filePath
}

private constructor ()
            : super()
        {
}


                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun write(initData: LicenseInitInfo)
        //nullable = true from not(false or (false and false)) = true
{
var initData = initData
}


                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun read()
        //nullable = true from not(false or (false and true)) = true
: LicenseInitInfo{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return readAgain(0)
}


                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun readAgain(initializeCounter: Int)
        //nullable = true from not(false or (false and false)) = true
: LicenseInitInfo{
var initializeCounter = initializeCounter

    var licenseInitInfo: LicenseInitInfo = LicenseInitInfo()

licenseInitInfo!!.clearServers()
licenseInitInfo!!.addServer(OFFICIAL_ALLBINARY_SERVICES_SERVER)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return licenseInitInfo
}


}
                
            

