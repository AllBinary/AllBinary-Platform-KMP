
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
        package org.allbinary.game.combat.damage




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.layer.NamedInterface
interface DamageableInterface : NamedInterface {
        

                @Throws(Exception::class)
            
open fun damage(damage: Int, damageType: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun getDamage(damageType: Int)
        //nullable = true from not(false or (false and false)) = true
: Int

        Updates for KMP build        
        

}
                
            

