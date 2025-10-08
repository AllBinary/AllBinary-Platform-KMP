
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
        package org.allbinary.game.health




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

interface HealthInterface {
        

    open fun isAlive()
        //nullable = true from not(false or (false and true)) = true
: Boolean

    open fun damage(ahealth: Int)
        //nullable = true from not(false or (false and false)) = true


    open fun heal(ahealth: Int)
        //nullable = true from not(false or (false and false)) = true


    open fun heal()
        //nullable = true from not(false or (false and true)) = true


    open fun getMaxHealth()
        //nullable = true from not(false or (false and true)) = true
: Int

    open fun setMaxHealth(maxHealth: Int)
        //nullable = true from not(false or (false and false)) = true


    open fun getHealth()
        //nullable = true from not(false or (false and true)) = true
: Int

    open fun addListener(healthListenerInterface: HealthListenerInterface)
        //nullable = true from not(false or (false and false)) = true


}
                
            

