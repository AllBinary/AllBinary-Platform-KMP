
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

this.stringBuffer!!.append(this.DEVICE_ID)
this.stringBuffer!!.append(commonStrings!!.EQUALS)
this.stringBuffer!!.append(properties.getDeviceId())
this.stringBuffer!!.append(commonStrings!!.SPACE)
this.stringBuffer!!.append(this.DEVICE_SOFTWARE_VERSION)
this.stringBuffer!!.append(commonStrings!!.EQUALS)
this.stringBuffer!!.append(properties.getDeviceSoftwareVersion())
this.stringBuffer!!.append(commonStrings!!.SPACE)
this.stringBuffer!!.append(this.LINE_1_NUMBER)
this.stringBuffer!!.append(commonStrings!!.EQUALS)
this.stringBuffer!!.append(properties.getLine1Number())
this.stringBuffer!!.append(commonStrings!!.SPACE)
this.stringBuffer!!.append("NetworkCountryIso")
this.stringBuffer!!.append(commonStrings!!.EQUALS)
this.stringBuffer!!.append(properties.getNetworkCountryIso())
this.stringBuffer!!.append(commonStrings!!.SPACE)
this.stringBuffer!!.append("NetworkOperator")
this.stringBuffer!!.append(commonStrings!!.EQUALS)
this.stringBuffer!!.append(properties.getNetworkOperator())
this.stringBuffer!!.append(commonStrings!!.SPACE)
this.stringBuffer!!.append("NetworkOperatorName")
this.stringBuffer!!.append(commonStrings!!.EQUALS)
this.stringBuffer!!.append(properties.getNetworkOperatorName())
this.stringBuffer!!.append(commonStrings!!.SPACE)
this.stringBuffer!!.append("NetworkType")
this.stringBuffer!!.append(commonStrings!!.EQUALS)
this.stringBuffer!!.append(properties.getNetworkType())
this.stringBuffer!!.append(commonStrings!!.SPACE)
this.stringBuffer!!.append("PhoneType")
this.stringBuffer!!.append(commonStrings!!.EQUALS)
this.stringBuffer!!.append(properties.getPhoneType())
this.stringBuffer!!.append(commonStrings!!.SPACE)
this.stringBuffer!!.append("SimCountryIso")
this.stringBuffer!!.append(commonStrings!!.EQUALS)
this.stringBuffer!!.append(properties.getSimCountryIso())
this.stringBuffer!!.append(commonStrings!!.SPACE)
this.stringBuffer!!.append("SimOperator")
this.stringBuffer!!.append(commonStrings!!.EQUALS)
this.stringBuffer!!.append(properties.getSimOperator())
this.stringBuffer!!.append(commonStrings!!.SPACE)
this.stringBuffer!!.append("SimOperatorName")
this.stringBuffer!!.append(commonStrings!!.EQUALS)
this.stringBuffer!!.append(properties.getSimOperatorName())
this.stringBuffer!!.append(commonStrings!!.SPACE)
this.stringBuffer!!.append("SimSerialNumber")
this.stringBuffer!!.append(commonStrings!!.EQUALS)
this.stringBuffer!!.append(properties.getSimSerialNumber())
this.stringBuffer!!.append(commonStrings!!.SPACE)
this.stringBuffer!!.append("SubscriberId")
this.stringBuffer!!.append(commonStrings!!.EQUALS)
this.stringBuffer!!.append(properties.getSubscriberId())
this.stringBuffer!!.append(commonStrings!!.SPACE)
this.stringBuffer!!.append("VoiceMailAlphaTag")
this.stringBuffer!!.append(commonStrings!!.EQUALS)
this.stringBuffer!!.append(properties.getVoiceMailAlphaTag())
this.stringBuffer!!.append(commonStrings!!.SPACE)
this.stringBuffer!!.append("VoiceMailNumber")
this.stringBuffer!!.append(commonStrings!!.EQUALS)
this.stringBuffer!!.append(properties.getVoiceMailNumber())
this.stringBuffer!!.append(commonStrings!!.SPACE)
}


    private val OUYA: String = "ouya"

    override fun isOverScan()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

    var properties: AndroidSystemProperties = AndroidSystemProperties.getInstance()!!


    
                        if(properties.getDevice()!!.lowercase()!!.indexOf(this.OUYA) >= 0)
                        
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
                
            

