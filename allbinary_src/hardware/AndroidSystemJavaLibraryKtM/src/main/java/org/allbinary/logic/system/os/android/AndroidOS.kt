
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
        package org.allbinary.logic.system.os.android




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.android.AndroidInfoFactory
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.os.GenericOperatingSystem
import org.allbinary.string.CommonSeps

open public class AndroidOS : GenericOperatingSystem {
        

    private var stringBuffer: StringBuilder = StringBuilder()

    private val DEVICE_ID: String = "DeviceId"

    private val DEVICE_SOFTWARE_VERSION: String = "DeviceSoftwareVersion"

    private val LINE_1_NUMBER: String = "Line1Number"
public constructor (){

    var SDK_VERSION: Int = AndroidInfoFactory.getInstance()!!.getVersion()!!


    
                        if(SDK_VERSION > 10)
                        
                                    {
                                    this.scalable= true

                                    }
                                

    var properties: AndroidSystemProperties = AndroidSystemProperties.getInstance()!!


    var commonStrings: CommonSeps = CommonSeps.getInstance()!!

stringBuffer!!.append(DEVICE_ID)
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.append(properties.getDeviceId())
stringBuffer!!.append(commonStrings!!.SPACE)
stringBuffer!!.append(DEVICE_SOFTWARE_VERSION)
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.append(properties.getDeviceSoftwareVersion())
stringBuffer!!.append(commonStrings!!.SPACE)
stringBuffer!!.append(LINE_1_NUMBER)
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.append(properties.getLine1Number())
stringBuffer!!.append(commonStrings!!.SPACE)
stringBuffer!!.append("NetworkCountryIso")
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.append(properties.getNetworkCountryIso())
stringBuffer!!.append(commonStrings!!.SPACE)
stringBuffer!!.append("NetworkOperator")
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.append(properties.getNetworkOperator())
stringBuffer!!.append(commonStrings!!.SPACE)
stringBuffer!!.append("NetworkOperatorName")
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.append(properties.getNetworkOperatorName())
stringBuffer!!.append(commonStrings!!.SPACE)
stringBuffer!!.append("NetworkType")
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.append(properties.getNetworkType())
stringBuffer!!.append(commonStrings!!.SPACE)
stringBuffer!!.append("PhoneType")
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.append(properties.getPhoneType())
stringBuffer!!.append(commonStrings!!.SPACE)
stringBuffer!!.append("SimCountryIso")
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.append(properties.getSimCountryIso())
stringBuffer!!.append(commonStrings!!.SPACE)
stringBuffer!!.append("SimOperator")
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.append(properties.getSimOperator())
stringBuffer!!.append(commonStrings!!.SPACE)
stringBuffer!!.append("SimOperatorName")
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.append(properties.getSimOperatorName())
stringBuffer!!.append(commonStrings!!.SPACE)
stringBuffer!!.append("SimSerialNumber")
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.append(properties.getSimSerialNumber())
stringBuffer!!.append(commonStrings!!.SPACE)
stringBuffer!!.append("SubscriberId")
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.append(properties.getSubscriberId())
stringBuffer!!.append(commonStrings!!.SPACE)
stringBuffer!!.append("VoiceMailAlphaTag")
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.append(properties.getVoiceMailAlphaTag())
stringBuffer!!.append(commonStrings!!.SPACE)
stringBuffer!!.append("VoiceMailNumber")
stringBuffer!!.append(commonStrings!!.EQUALS)
stringBuffer!!.append(properties.getVoiceMailNumber())
stringBuffer!!.append(commonStrings!!.SPACE)
}


    private val OUYA: String = "ouya"

    override fun isOverScan()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

    var properties: AndroidSystemProperties = AndroidSystemProperties.getInstance()!!


    
                        if(properties.getDevice()!!.lowercase()!!.indexOf(OUYA) >= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    override fun getOverScanXPercent()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 90
}


    override fun getOverScanYPercent()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 90
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var osBuffer: StringMaker = StringMaker()

osBuffer!!.append(super.toString())
osBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
osBuffer!!.append("Other System Info: \n")
osBuffer!!.append(this.stringBuffer!!.toString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return osBuffer!!.toString()
}


}
                
            

