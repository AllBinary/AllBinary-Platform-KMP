
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
        package org.allbinary.logic.system.hardware




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.hardware.android.AndroidHardware
import org.allbinary.logic.system.os.GenericOperatingSystem
import org.allbinary.logic.system.os.OperatingSystems
import org.allbinary.string.CommonStrings

open public class HardwareFactory
            : Object
         {
        

        companion object {
            
    private val instance: HardwareFactory = HardwareFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: HardwareFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            
private constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun getInstance(os: GenericOperatingSystem)
        //nullable =  from not(true or (false and false)) = 
: HardwareInterface{

                    var os = os

        try {
            
    
                        if(os.getName()!!.compareTo(OperatingSystems.getInstance()!!.ANDROID) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AndroidHardware()

                                    }
                                



                            throw Exception("No Hardware Imp for: " +os.getName())
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put("Ignoring Exception Returning NoHardware", this, commonStrings!!.GET_INSTANCE, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NoHardware()
}

}


}
                
            

