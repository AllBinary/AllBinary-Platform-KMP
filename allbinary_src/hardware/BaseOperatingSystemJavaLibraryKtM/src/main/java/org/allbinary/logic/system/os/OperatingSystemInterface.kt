
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
        
import org.allbinary.logic.java.character.CharacterSet
interface OperatingSystemInterface {
        

open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getVersion()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getArch()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getCharacterSet()
        //nullable = true from not(false or (false and true)) = true
: CharacterSet

        Updates for KMP build        
        

open fun isOverScan()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        

open fun getOverScanXPercent()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        

open fun getOverScanYPercent()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        

open fun isScalable()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        
override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        

}
                
            

