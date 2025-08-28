
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
        
import java.util.Hashtable
import org.allbinary.logic.system.hardware.components.interfaces.HardwareComponentInterface
interface HardwareInterface {
        

open fun getComponent(index: Int)
        //nullable = true from not(false or (false and false)) = true
: HardwareComponentInterface

        Updates for KMP build        
        
override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        

open fun compareTo(hardwareInterface: HardwareInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        

open fun difference(hardwareInterface: HardwareInterface)
        //nullable = true from not(false or (false and false)) = true
: Hashtable<Any, Any>

        Updates for KMP build        
        

}
                
            

