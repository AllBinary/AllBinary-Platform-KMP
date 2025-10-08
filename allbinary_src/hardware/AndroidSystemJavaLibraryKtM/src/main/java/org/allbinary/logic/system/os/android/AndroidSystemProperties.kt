
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
        
import android.content.Context
import android.os.Build
import org.allbinary.data.resource.ResourceUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings

open public class AndroidSystemProperties
            : Object
         {
        
companion object {
            
    private val SINGLETON: AndroidSystemProperties = AndroidSystemProperties(ResourceUtil.getInstance()!!.getContext())

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AndroidSystemProperties{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
public constructor (context: Context)
            : super()
        {
var context = context
}


    open fun getDeviceId()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING
}


    open fun getDeviceSoftwareVersion()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return commonStrings!!.DISABLE
}


    open fun getLine1Number()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return commonStrings!!.DISABLE
}


    open fun getNetworkCountryIso()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return commonStrings!!.DISABLE
}


    open fun getNetworkOperator()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return commonStrings!!.DISABLE
}


    open fun getNetworkOperatorName()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return commonStrings!!.DISABLE
}


    open fun getSimCountryIso()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return commonStrings!!.DISABLE
}


    open fun getSimOperator()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return commonStrings!!.DISABLE
}


    open fun getSimOperatorName()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return commonStrings!!.DISABLE
}


    open fun getSimSerialNumber()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return commonStrings!!.DISABLE
}


    open fun getSubscriberId()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return commonStrings!!.DISABLE
}


    open fun getVoiceMailAlphaTag()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return commonStrings!!.DISABLE
}


    open fun getVoiceMailNumber()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return commonStrings!!.DISABLE
}


    open fun getNetworkType()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}


    open fun getPhoneType()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}


    open fun getBoard()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Build.BOARD
}


    open fun getBrand()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Build.BRAND
}


    open fun getDevice()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Build.DEVICE
}


    open fun getFingerprint()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Build.FINGERPRINT
}


    open fun getHost()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Build.HOST
}


    open fun getId()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Build.ID
}


    open fun getModel()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Build.MODEL
}


    open fun getProduct()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Build.PRODUCT
}


    open fun getTags()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Build.TAGS
}


    open fun getTime()
        //nullable = true from not(false or (false and true)) = true
: Long{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Build.TIME
}


    open fun getType()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Build.TYPE
}


    open fun getUser()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Build.USER
}


}
                
            

