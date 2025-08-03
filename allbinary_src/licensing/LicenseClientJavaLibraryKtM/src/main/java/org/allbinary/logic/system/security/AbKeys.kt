
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
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.AbeLicenseInterfaceFactory
import org.allbinary.logic.system.security.licensing.LicensingException

open public class AbKeys
            : Object
         {
        

        companion object {


    private val instance: AbKeys = AbKeys()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AbKeys{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            
private constructor        ()
            : super()
        {}


                @Throws(LicensingException::class)
            
open fun getKey(abeClientInformation: AbeClientInformationInterface, keyName: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var abeClientInformation = abeClientInformation


                    var keyName = keyName

        try {
            logUtil!!.put("Getting Key: " +keyName, this, 
                            "getKey")

    
                        if(keyName!!.compareTo(
                            "DirectX 8") == 0 || keyName!!.compareTo(
                            "DirectX") == 0 || keyName!!.compareTo(
                            "Low Level") == 0 || keyName!!.compareTo(
                            "System Drivers") == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Temp For Input Library"

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbeLicenseInterfaceFactory.getInstance()!!.getLicenseInstance(abeClientInformation)!!.getKey(keyName)
} catch(e: LicensingException)
            {


                            throw e
}
 catch(e: Exception)
            {logUtil!!.put(
                            "Licensing Failure", this, 
                            "getKey()", e)



                            throw LicensingException(
                            "Unknown License Failure")
}

}


}
                
            

