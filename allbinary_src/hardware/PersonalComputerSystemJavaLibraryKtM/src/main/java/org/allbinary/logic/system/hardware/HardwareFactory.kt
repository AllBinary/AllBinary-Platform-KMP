
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
        
import org.allbinary.logic.system.os.GenericOperatingSystem
import org.allbinary.logic.system.os.OperatingSystems
import org.allbinary.logic.system.hardware.linux.LinuxHardware
import org.allbinary.logic.system.hardware.windows.WindowsHardware

open public class HardwareFactory
            : Object
         {
        

        companion object {
            
                @Throws(Exception::class)
            
open fun getInstance(os: GenericOperatingSystem)
        //nullable =  from not(true or (false and false)) = 
: HardwareInterface

        Updates for KMP build        
        {
var os = os

        try {
            
    var operatingSystems: OperatingSystems = OperatingSystems.getInstance()!!


    
                        if(os.getName()!!.compareTo(operatingSystems!!.LINUX) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return LinuxHardware() as HardwareInterface

                                    }
                                
                             else 
    
                        if(os.getName()!!.indexOf(operatingSystems!!.WINDOWS) >= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return WindowsHardware() as HardwareInterface

                                    }
                                



                            throw Exception("No Hardware Imp for: " +os.getName())
} catch(e: Exception)
            

        Updates for KMP build        
        {



                            throw e
}

}


        }
            private constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


}
                
            

