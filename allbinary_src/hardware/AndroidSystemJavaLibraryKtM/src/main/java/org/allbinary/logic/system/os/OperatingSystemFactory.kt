
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
        package org.allbinary.logic.system.os




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.system.os.android.AndroidOperatingSystemFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonStrings

open public class OperatingSystemFactory
            : Object
         {
        
companion object {
            
    private val instance: OperatingSystemFactory = OperatingSystemFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: OperatingSystemFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var genericOperatingSystem: GenericOperatingSystem = NoOperatingSystem.NO_OPERATING_SYSTEM

    private var hasDetected: Boolean = false
private constructor ()
            : super()
        {
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun getOperatingSystemInstance()
        //nullable = true from not(false or (false and true)) = true
: GenericOperatingSystem{

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


        try {
            
    var systemProperties: SystemProperties = SystemProperties.getInstance()!!


    var osName: String = systemProperties!!.getName()!!


    
                        if(!hasDetected)
                        
                                    {
                                    hasDetected= true

    
                        if(osName!!.indexOf(OperatingSystems.getInstance()!!.ANDROID) >= 0)
                        
                                    {
                                    logUtil!!.put("Found a Linux OS", this, commonStrings!!.GET_INSTANCE)
genericOperatingSystem= AndroidOperatingSystemFactory.getInstance()!!.getOperatingSystemInstance()
logUtil!!.put(StringMaker().
                            append("Operating System Info: ")!!.append(genericOperatingSystem!!.toString())!!.toString(), this, commonStrings!!.GET_INSTANCE)

                                    }
                                
                        else {
                            


                            throw Exception(StringMaker().
                            append("OS Not Supported: ")!!.append(osName)!!.toString())

                        }
                            

                                    }
                                
} catch(e: Exception)
            {
genericOperatingSystem= NoOperatingSystem.NO_OPERATING_SYSTEM
logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.GET_INSTANCE, e)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return genericOperatingSystem
}


}
                
            

