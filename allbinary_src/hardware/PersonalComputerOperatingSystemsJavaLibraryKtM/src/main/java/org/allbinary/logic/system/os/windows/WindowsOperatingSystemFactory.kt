
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
        package org.allbinary.logic.system.os.windows




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory
import org.allbinary.logic.communication.log.config.type.LogConfigTypes
import org.allbinary.logic.system.os.GenericOperatingSystem
import org.allbinary.logic.system.os.NoOperatingSystem
import org.allbinary.logic.system.os.OperatingSystems
import org.allbinary.logic.system.os.SystemProperties
import org.allbinary.string.CommonStrings

open public class WindowsOperatingSystemFactory
            : Object
         {
        
companion object {
            
    private val instance: WindowsOperatingSystemFactory = WindowsOperatingSystemFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: WindowsOperatingSystemFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
private constructor ()
            : super()
        {
}


    open fun getOperatingSystemInstance()
        //nullable = true from not(false or (false and true)) = true
: GenericOperatingSystem{

        try {
            
    var operatingSystems: OperatingSystems = OperatingSystems.getInstance()!!


    var osName: String = SystemProperties.getInstance()!!.getName()!!


    var operatingSystemInterface: GenericOperatingSystem


    
                        if(osName!!.compareTo(operatingSystems!!.WINDOWS_NT) == 0)
                        
                                    {
                                    operatingSystemInterface= WindowsOS()

                                    }
                                
                             else 
    
                        if(osName!!.compareTo(operatingSystems!!.WINDOWS_10) == 0)
                        
                                    {
                                    operatingSystemInterface= WindowsOS()

                                    }
                                
                             else 
    
                        if(osName!!.compareTo(operatingSystems!!.WINDOWS_11) == 0)
                        
                                    {
                                    operatingSystemInterface= WindowsOS()

                                    }
                                
                             else 
    
                        if(osName!!.compareTo(operatingSystems!!.WINDOWS2000) == 0)
                        
                                    {
                                    operatingSystemInterface= WindowsOS()

                                    }
                                
                             else 
    
                        if(osName!!.compareTo(operatingSystems!!.WINDOWS_XP) == 0)
                        
                                    {
                                    operatingSystemInterface= WindowsOS()

                                    }
                                
                             else 
    
                        if(osName!!.compareTo(operatingSystems!!.WINDOWS_VISTA) == 0)
                        
                                    {
                                    operatingSystemInterface= WindowsOS()

                                    }
                                
                        else {
                            
    
                        if(operatingSystems!!.isUnknownSpecificOSAllowed())
                        
                                    {
                                    operatingSystemInterface= WindowsOS()

                                    }
                                
                        else {
                            


                            throw Exception("Specific Windows OS Not Supported: " +osName)

                        }
                            

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return operatingSystemInterface
} catch(e: Exception)
            {

    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.FACTORYERROR))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.GET_INSTANCE, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NoOperatingSystem.NO_OPERATING_SYSTEM
}

}


}
                
            

