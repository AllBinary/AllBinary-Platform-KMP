
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.CollidableCompositeLayer
import org.allbinary.game.layer.special.CollidableDestroyableDamageableLayer
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker

open public class DamageUtil
            : Object
         {
        

        companion object {


    private val instance: DamageUtil = DamageUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: DamageUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val COLLIDE: String = "collide"
private constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun process(damageableInterface: DamageableInterface, damageableInterface2: DamageableInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var damageableInterface = damageableInterface


                    var damageableInterface2 = damageableInterface2
damageableInterface!!.damage(damageableInterface2!!.getDamage(0), 0)
}


                @Throws(Exception::class)
            
open fun debugDamage(collidableInterfaceCompositeInterface1: CollidableCompositeLayer, collidableInterfaceCompositeInterface: CollidableCompositeLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var collidableInterfaceCompositeInterface1 = collidableInterfaceCompositeInterface1


                    var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface

    var collidableDestroyableDamageableLayer: CollidableDestroyableDamageableLayer = collidableInterfaceCompositeInterface as CollidableDestroyableDamageableLayer


    var damage: Int = collidableDestroyableDamageableLayer!!.getDamage(0)!!
            


    
                        if(damage > 20000)
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "Collision ")
stringBuffer!!.append(collidableInterfaceCompositeInterface1!!.toString())
stringBuffer!!.append(
                            " with: ")
stringBuffer!!.append(collidableInterfaceCompositeInterface!!.toString())
stringBuffer!!.append(
                            " damage: ")
stringBuffer!!.append(damage)
logUtil!!.put(stringBuffer!!.toString(), collidableInterfaceCompositeInterface1, COLLIDE)

                                    }
                                
}


}
                
            

