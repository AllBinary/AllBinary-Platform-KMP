
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
        package org.allbinary.game.combat




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.combat.damage.DamageableBaseBehavior
import org.allbinary.game.combat.destroy.DestroyableBaseBehavior

open public class CombatBaseBehavior
            : Object
         {
        

    private val damageableBaseBehavior: DamageableBaseBehavior

    private val destroyableBaseBehavior: DestroyableBaseBehavior

    private var readyForExplosion: Boolean= false
public constructor (damageableBaseBehavior: DamageableBaseBehavior, destroyableBaseBehavior: DestroyableBaseBehavior)
            : super()
        {
var damageableBaseBehavior = damageableBaseBehavior
var destroyableBaseBehavior = destroyableBaseBehavior
this.damageableBaseBehavior= damageableBaseBehavior
this.destroyableBaseBehavior= destroyableBaseBehavior
}


    open fun getDamageableBaseBehavior()
        //nullable = true from not(false or (false and true)) = true
: DamageableBaseBehavior{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return damageableBaseBehavior
}


    open fun getDestroyableBaseBehavior()
        //nullable = true from not(false or (false and true)) = true
: DestroyableBaseBehavior{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return destroyableBaseBehavior
}


    open fun isReadyForExplosion()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return readyForExplosion
}


    open fun setReadyForExplosion(readyForExplosion: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var readyForExplosion = readyForExplosion
this.readyForExplosion= readyForExplosion
}


}
                
            

