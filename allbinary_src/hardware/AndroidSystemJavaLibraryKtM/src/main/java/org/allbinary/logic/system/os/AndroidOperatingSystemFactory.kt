
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
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class AndroidOperatingSystemFactory
            : Object
         {
        
companion object {
            
    private val instance: AndroidOperatingSystemFactory = AndroidOperatingSystemFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AndroidOperatingSystemFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
private constructor ()
            : super()
        {
}


                @Throws(Exception::class)
            
    open fun getOperatingSystemInstance()
        //nullable = true from not(false or (false and true)) = true
: GenericOperatingSystem{

        try {
            
    var GenericOperatingSystem: GenericOperatingSystem


    var systemProperties: SystemProperties = SystemProperties.getInstance()!!


    var osName: String = systemProperties!!.getName()!!


    
                        if(osName!!.compareTo(OperatingSystems.getInstance()!!.ANDROID) == 0)
                        
                                    {
                                    GenericOperatingSystem= AndroidOperatingSystem()

                                    }
                                
                        else {
                            
    
                        if(OperatingSystems.getInstance()!!.isUnknownSpecificOSAllowed())
                        
                                    {
                                    GenericOperatingSystem= AndroidOperatingSystem()

                                    }
                                
                        else {
                            


                            throw Exception("Specific Android OS Not Supported: " +osName)

                        }
                            

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GenericOperatingSystem
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put("Failed to get OperatingSystem returning NoOperatingSystem", this, commonStrings!!.GET_INSTANCE, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NoOperatingSystem.NO_OPERATING_SYSTEM
}

}


}
                
            

