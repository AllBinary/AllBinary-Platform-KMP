
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
        package org.allbinary.logic.system.security.licensing



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.IOException
import java.util.Calendar
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.security.licensing.client.AbeLicenseClient
import org.allbinary.string.CommonStrings

open public class AbeLicenseInterfaceFactory
            : Object
         {
        

        companion object {


    private val SINGLETON: AbeLicenseInterfaceFactory = AbeLicenseInterfaceFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AbeLicenseInterfaceFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var time: Long = 0

    private var check: Boolean = false

    private var checkPeriod: Int = 36000000

    private var abeLicenseInterface: AbeLicenseInterface = 
                null
            
private constructor        ()
            : super()
        {}


                @Throws(LicensingException::class)
            
open fun getLicenseInstance(abeClientInformation: AbeClientInformationInterface)
        //nullable = true from not(false or (false and false)) = true
: AbeLicenseInterface{

                    var abeClientInformation = abeClientInformation

    
                        if(isTimeToGetKey())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return get(abeClientInformation)

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return abeLicenseInterface

                        }
                            
}


                @Throws(LicensingException::class)
            
open fun get(abeClientInformation: AbeClientInformationInterface)
        //nullable = true from not(false or (false and false)) = true
: AbeLicenseInterface{

                    var abeClientInformation = abeClientInformation

        try {
            logUtil!!.put(
                            "Getting Keys", this, commonStrings!!.GET)
abeLicenseInterface= AbeNoLicense.getInstance()

    var licenseClient: AbeLicenseClient = AbeLicenseClient()

abeLicenseInterface= licenseClient!!.get(abeClientInformation)

    
                        if(abeLicenseInterface != 
                                    null
                                )
                        
                                    {
                                    logUtil!!.put("Default Key: " +abeLicenseInterface!!.getKey(AbeClientInformationData.getInstance()!!.KEY), this, commonStrings!!.GET)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return abeLicenseInterface
} catch(e: IOException)
            {logUtil!!.put(
                            "Licensing IO Error", this, commonStrings!!.GET, e)



                            throw LicensingException(
                            "License Server Connection Error")
}
 catch(e: Exception)
            {logUtil!!.put(
                            "Licensing Failure", this, commonStrings!!.GET, e)



                            throw LicensingException("Unknown License Failure: " +this::class.qualifiedName!!)
}

}


open fun isTimeToGetKey()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    var calendar: Calendar = Calendar.getInstance()!!
            


    var currentTime: Long = calendar.getTimeInMillis()!!
            


    
                        if(abeLicenseInterface == 
                                    null
                                 || abeLicenseInterface == AbeNoLicense.getInstance() || !abeLicenseInterface!!.hasKey() || isCheck() || currentTime -checkPeriod > time)
                        
                                    {
                                    abeLicenseInterface= 
                                        null
                                    
time= currentTime



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                             else 
    
                        if()
                        
}


open fun setCheck(check: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var check = check
this.check= check
}


open fun isCheck()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return check
}


}
                
            

