
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
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.Log
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory
import org.allbinary.logic.communication.log.config.type.LogConfigTypes
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.system.os.linux.LinuxOperatingSystemFactory
import org.allbinary.logic.system.os.solaris.Solaris
import org.allbinary.logic.system.os.windows.WindowsOperatingSystemFactory
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

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var genericOperatingSystem: GenericOperatingSystem = NoOperatingSystem.NO_OPERATING_SYSTEM

    private var hasDetected: Boolean = false
private constructor        ()
            : super()
        {
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun getOperatingSystemInstance()
        //nullable = true from not(false or (false and true)) = true
: GenericOperatingSystem{

        try {
            
    var operatingSystems: OperatingSystems = OperatingSystems.getInstance()!!


    var systemProperties: SystemProperties = SystemProperties.getInstance()!!


    var osName: String = systemProperties!!.getName()!!


    var osArch: String = systemProperties!!.getArch()!!


    var osVersion: String = systemProperties!!.getVersion()!!


    
                        if(!this.hasDetected)
                        
                                    {
                                    logUtil!!.put("osName: " +osName, this, commonStrings!!.GET_INSTANCE)
this.hasDetected= true

    
                        if(osName!!.indexOf(operatingSystems!!.LINUX) >= 0)
                        
                                    {
                                    
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.FACTORYERROR))
                        
                                    {
                                    logUtil!!.put("Found a Linux OS", this, commonStrings!!.GET_INSTANCE)

                                    }
                                
this.genericOperatingSystem= LinuxOperatingSystemFactory.getInstance()!!.getOperatingSystemInstance() as GenericOperatingSystem

                                    }
                                
                             else 
    
                        if(osName!!.indexOf(operatingSystems!!.WINDOWS) >= 0)
                        
                                    {
                                    
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.FACTORYERROR))
                        
                                    {
                                    logUtil!!.put("Found a Windows OS", this, commonStrings!!.GET_INSTANCE)

                                    }
                                
this.genericOperatingSystem= WindowsOperatingSystemFactory.getInstance()!!.getOperatingSystemInstance() as GenericOperatingSystem

                                    }
                                
                             else 
    
                        if(osName!!.indexOf(operatingSystems!!.SOLARIS) >= 0)
                        
                                    {
                                    
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.FACTORYERROR))
                        
                                    {
                                    logUtil!!.put("Found a Solaris OS", this, commonStrings!!.GET_INSTANCE)

                                    }
                                
this.genericOperatingSystem= Solaris() as GenericOperatingSystem

                                    }
                                
                        else {
                            


                            throw Exception(StringMaker().
                            append("OS Not Supported: ")!!.append(osName)!!.toString())

                        }
                            

    var log: Log = LogFactory.getInstance(StringMaker().
                            append("OperatingSystem Info: ")!!.append(StringUtil.getInstance()!!.toString(this.genericOperatingSystem))!!.toString(), this, commonStrings!!.GET_INSTANCE)!!

System.out.println(log.toString())
logUtil!!.put(log)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.genericOperatingSystem
} catch(e: Exception)
            {

    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.FACTORYERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.GET_INSTANCE, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NoOperatingSystem.NO_OPERATING_SYSTEM
}

}


}
                
            

