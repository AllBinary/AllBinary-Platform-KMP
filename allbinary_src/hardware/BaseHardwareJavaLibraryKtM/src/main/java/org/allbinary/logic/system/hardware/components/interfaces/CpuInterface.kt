
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
        package org.allbinary.logic.system.hardware.components.interfaces



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
interface CpuInterface {
        

open fun getProcessor()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getVendorId()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getCpuFamily()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getModel()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getModelName()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getStepping()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getCpuSpeed()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getCacheSize()
        //nullable = true from not(false or (false and true)) = true
: String

open fun compareTo(cpuInterface: CpuInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean

}
                
            

