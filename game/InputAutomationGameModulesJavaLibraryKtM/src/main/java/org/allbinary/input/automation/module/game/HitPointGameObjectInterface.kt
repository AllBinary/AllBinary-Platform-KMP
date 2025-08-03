
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
        package org.allbinary.input.automation.module.game



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
interface HitPointGameObjectInterface : MeteredGameObjectInterface {
        

open fun isMoreThan(aFloat: Float)
        //nullable = true from not(false or (false and false)) = true
: Boolean

open fun isCloseDeath()
        //nullable = true from not(false or (false and true)) = true
: Boolean

open fun isDamaged()
        //nullable = true from not(false or (false and true)) = true
: Boolean

}
                
            

