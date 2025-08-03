
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
        package org.allbinary.game.life



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
interface LifeInterface {
        

open fun get()
        //nullable = true from not(false or (false and true)) = true
: Short

open fun set(lives: Short)
        //nullable = true from not(false or (false and false)) = true


open fun reset()
        //nullable = true from not(false or (false and true)) = true


open fun add(lives: Short)
        //nullable = true from not(false or (false and false)) = true


open fun deaths(lives: Short)
        //nullable = true from not(false or (false and false)) = true


open fun getMaxlives()
        //nullable = true from not(false or (false and true)) = true
: Short

open fun isAlive()
        //nullable = true from not(false or (false and true)) = true
: Boolean

}
                
            

