
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
        
import java.util.Hashtable
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.system.hardware.HardwareInterface
import org.allbinary.logic.system.hardware.SystemHardwareFactory
import org.allbinary.logic.system.os.GenericOperatingSystem
import org.allbinary.logic.system.os.NoOperatingSystem
import org.allbinary.string.CommonSeps
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListUtil

open public class ClientInformation
            : Object
        
                , AbeClientInformationInterface {
        

    private var operatingSystemInterface: GenericOperatingSystem = NoOperatingSystem.NO_OPERATING_SYSTEM

    private val name: String

    private val shortName: String

    private val version: String

    private val specialName: String

    private var hardSale: Boolean = true

    private var licenseId: String = StringUtil.getInstance()!!.EMPTY_STRING

    private var licenseServers: BasicArrayList = BasicArrayListUtil.getInstance()!!.getImmutableInstance()!!
public constructor        (name: String, version: String, specialName: String, shortName: String)
            : super()
        

        Updates for KMP build        
        {
    //var name = name
    //var version = version
    //var specialName = specialName
    //var shortName = shortName
this.name= name
this.version= version
this.specialName= specialName
this.shortName= StringMaker().
                            append(shortName)!!.append(CommonSeps.getInstance()!!.UNDERSCORE)!!.append(version)!!.toString()
this.init()
}

override fun init()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}

override fun getOperatingSystemInterface()
        //nullable = true from not(false or (false and true)) = true
: GenericOperatingSystem

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return operatingSystemInterface
}

override fun getName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.name
}

override fun getSpecialName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.specialName
}

override fun getVersion()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.version
}

override fun getLicenseId()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.licenseId
}

override fun getLicenseServers()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.licenseServers
}

override fun getLicenseServer(index: Int)
        //nullable = true from not(false or (false and false)) = true
: String

        Updates for KMP build        
        {
var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.licenseServers!!.objectArray[index]!! as String
}

override fun getNumberOfLicenseServers()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.licenseServers!!.size()
}

override fun toHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>

        Updates for KMP build        
        {

    var abeClientInformationData: AbeClientInformationData = AbeClientInformationData.getInstance()!!


    var clientInfoHashtable: Hashtable<Any, Any> = Hashtable<Any, Any>()

clientInfoHashtable!!.put(abeClientInformationData!!.NAME, this.name)
clientInfoHashtable!!.put(abeClientInformationData!!.VERSION, this.version)
clientInfoHashtable!!.put(abeClientInformationData!!.SPECIALNAME, this.specialName)
clientInfoHashtable!!.put(abeClientInformationData!!.LICENSEID, this.getLicenseId())
clientInfoHashtable!!.put(abeClientInformationData!!.OSNAME, this.getOperatingSystemInterface()!!.getName())
clientInfoHashtable!!.put(abeClientInformationData!!.OSARCH, this.getOperatingSystemInterface()!!.getArch())
clientInfoHashtable!!.put(abeClientInformationData!!.OSVERSION, this.getOperatingSystemInterface()!!.getVersion())
clientInfoHashtable!!.put(abeClientInformationData!!.OS, this.getOperatingSystemInterface()!!.toString())

    var hardwareInterface: HardwareInterface = SystemHardwareFactory.getInstance()!!.getInstance(getOperatingSystemInterface())!!


    var hardwareString: String = hardwareInterface!!.toString()!!

clientInfoHashtable!!.put(abeClientInformationData!!.HARDWARE, hardwareString)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return clientInfoHashtable
}

override fun isSameId(alicenseId: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
var alicenseId = alicenseId

    
                        if(this.getLicenseId()!!.compareTo(alicenseId) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}

override fun isLargerOrDifferentServerList(list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
var list = list

    var size: Int = list.size() -1


    var currentSize: Int = this.licenseServers!!.size() -1


    
                        if(size > currentSize)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                




                        for (index in size downTo 0)

        

        Updates for KMP build        
        {

    var newServerName: String = list.objectArray[index]!! as String





                        for (index2 in currentSize downTo 0)

        

        Updates for KMP build        
        {

    var nextOldServerName: String = this.licenseServers!!.objectArray[index]!! as String


    
                        if(newServerName!!.compareTo(nextOldServerName) != 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
}

}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun setHardSale(hardSale: Boolean)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var hardSale = hardSale
this.hardSale= hardSale
}

override fun isHardSale()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hardSale
}


open fun setOperatingSystemInterface(operatingSystemInterface: GenericOperatingSystem)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var operatingSystemInterface = operatingSystemInterface
this.operatingSystemInterface= operatingSystemInterface
}


open fun setLicenseId(licenseId: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var licenseId = licenseId
this.licenseId= licenseId
}


open fun setLicenseServers(licenseServers: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var licenseServers = licenseServers
this.licenseServers= licenseServers
}

override fun toShortString()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.shortName
}


}
                
            

