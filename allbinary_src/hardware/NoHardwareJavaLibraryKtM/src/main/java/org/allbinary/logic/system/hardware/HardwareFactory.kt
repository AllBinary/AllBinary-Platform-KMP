
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
        
import org.allbinary.logic.system.os.OperatingSystemInterface

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
            
    private val SINGLETON: HardwareInterface = NoHardware.getInstance()!!
            
private constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun getInstance(os: OperatingSystemInterface)
        //nullable =  from not(true or (false and false)) = 
: HardwareInterface{

                    var os = os

        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
} catch(e: Exception)
            {


                            throw e
}

}


}
                
            

