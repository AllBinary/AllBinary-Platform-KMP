
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.init.LicenseInitInfo
import org.allbinary.business.init.LicenseInitInfoUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.system.os.OperatingSystemFactory
import org.allbinary.string.CommonStrings

open public class AbeClientInformation : ClientInformation {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val NONE: String = "No License Id"
public constructor        (name: String, version: String, specialName: String, shortName: String)                        

                            : super(name, version, specialName, shortName){

                    var name = name


                    var version = version


                    var specialName = specialName


                    var shortName = shortName


                            //For kotlin this is before the body of the constructor.
                    
}

override fun init()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            this.setOperatingSystemInterface(OperatingSystemFactory.getInstance()!!.getOperatingSystemInstance())

    var licenseInitInfo: LicenseInitInfo = LicenseInitInfoUtil.getInstance()!!.read()!!
            

this.setLicenseId(licenseInitInfo!!.getLicenseId())
this.setLicenseServers(licenseInitInfo!!.getServerList())

    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!
            


    
                        if(stringValidationUtil!!.isEmpty(this.getLicenseId()))
                        
                                    {
                                    this.setLicenseId(NONE)

                                    }
                                

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

PreLogUtil.put(StringMaker().
                            append("Special Name: ")!!.append(this.getSpecialName())!!.toString(), this, commonStrings!!.CONSTRUCTOR)
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CONSTRUCTOR, e)
}

}


}
                
            

