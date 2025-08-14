
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
        package org.allbinary.logic.system.security.licensing.client




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.init.LicenseInitInfo
import org.allbinary.business.init.LicenseInitInfoUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.xmlrpc.XmlRpcAbeClient
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.AbeLicenseInterface
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class AbeLicenseClient
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val MINSERVERS: Int = 3
public constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun get(abeClientInformation: AbeClientInformationInterface)
        //nullable = true from not(false or (false and false)) = true
: AbeLicenseInterface{

                    var abeClientInformation = abeClientInformation

        try {
            logUtil!!.put(commonStrings!!.START, this, commonStrings!!.GET)

    var xmlRpcAbeLicenseClient: XmlRpcAbeClient = XmlRpcAbeLicenseRetrievalClient(abeClientInformation)


    var abeLicenseInterface: AbeLicenseInterface = xmlRpcAbeLicenseClient!!.get(
                            null) as AbeLicenseInterface


    var licenseId: String = abeLicenseInterface!!.getLicenseId()!!
            


    var servers: BasicArrayList = abeLicenseInterface!!.getServers()!!
            


    var isNewLicenseId: Boolean = false


    var isBetterServerList: Boolean = false


    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!
            


    
                        if(stringValidationUtil!!.isEmpty(abeClientInformation!!.getLicenseId()) && !abeClientInformation!!.isSameId(licenseId))
                        
                                    {
                                    isNewLicenseId= true

                                    }
                                

    
                        if(servers.size() >= MINSERVERS && abeClientInformation!!.isLargerOrDifferentServerList(servers))
                        
                                    {
                                    isBetterServerList= true

                                    }
                                

    
                        if(isBetterServerList || isNewLicenseId)
                        
                                    {
                                    
    var initInfo: LicenseInitInfo = LicenseInitInfoUtil.getInstance()!!.read()!!
            

initInfo!!.setLicenseId(licenseId)
initInfo!!.setServerList(servers)
LicenseInitInfoUtil.getInstance()!!.write(initInfo)
abeClientInformation!!.init()

                                    }
                                
logUtil!!.put(commonStrings!!.END, this, commonStrings!!.GET)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return abeLicenseInterface
} catch(e: Exception)
            {


                            throw e
}

}


}
                
            

