
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
        package org.allbinary.game.layer.special




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.collision.CollidableBaseBehavior
import org.allbinary.game.collision.CollidableInterfaceCompositeInterface
import org.allbinary.game.combat.damage.DamageUtil
import org.allbinary.game.layer.CollidableCompositeLayer
import org.allbinary.logic.communication.log.ForcedLogUtil

open public class CollidableDestroyableDamageableBehavior : CollidableBaseBehavior {
        

    val damageUtil: DamageUtil = DamageUtil.getInstance()!!
            
public constructor        (ownerLayer: CollidableCompositeLayer, collidable: Boolean)                        

                            : super(ownerLayer, collidable){

                    var ownerLayer = ownerLayer


                    var collidable = collidable


                            //For kotlin this is before the body of the constructor.
                    
}

override fun isCollision(collisionLayer: CollidableCompositeLayer)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var collisionLayer = collisionLayer

    
                        if(this.ownerLayer!!.getGroupInterface()[0] != collisionLayer!!.getGroupInterface()[0])
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.isCollision(collisionLayer)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            override fun collide(collidableInterfaceCompositeInterface: CollidableCompositeLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface

    var ownerCollidableDestroyableDamageableLayer: CollidableDestroyableDamageableLayer = this.ownerLayer as CollidableDestroyableDamageableLayer


    var collidableDestroyableDamageableLayer: CollidableDestroyableDamageableLayer = collidableInterfaceCompositeInterface as CollidableDestroyableDamageableLayer

ownerCollidableDestroyableDamageableLayer!!.damage(collidableDestroyableDamageableLayer!!.getDamage(0), 0)
}

override fun isCollision(collidableInterfaceCompositeInterface: CollidableInterfaceCompositeInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface
ForcedLogUtil.log(
                            "No Longer Used", this)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            override fun collide(collidableInterfaceCompositeInterface: CollidableInterfaceCompositeInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface
ForcedLogUtil.log(
                            "No Longer Used", this)
}


}
                
            

