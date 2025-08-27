
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
        
import java.util.Hashtable
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.canvas.SpecialMessageUtil
import org.allbinary.string.CommonLabels

open public class LicenseRegistrationUtil
            : Object
         {
        

        companion object {
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun process(abeClientInformation: AbeClientInformationInterface, registrationId: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var abeClientInformation = abeClientInformation


                    var registrationId = registrationId

        try {
            
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

PreLogUtil.put(CommonLabels.getInstance()!!.START_LABEL +"License Registration", "LicenseRegistrationUtil", commonStrings!!.PROCESS)
RegistrationConfiguration.getInstance()!!.setRegistrationCode(registrationId)
RegistrationConfiguration.getInstance()!!.write()

    var hashtable: Hashtable<Any, Any> = abeClientInformation!!.toHashtable()!!

hashtable.put(RegistrationConfiguration.getInstance()!!.NAME, registrationId)
hashtable.put("message", SpecialMessageUtil.getInstance()!!.get())
XmlRpcRemoteLicenseRegistrationClient(abeClientInformation).
                            get(hashtable)
} catch(e: Exception)
            {PreLogUtil.put("License Registration Exception", "LicenseRegistrationUtil", "License Registration", e)
}

}


        }
            private constructor        ()
            : super()
        {}


}
                
            

