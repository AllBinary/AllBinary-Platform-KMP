
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
        
import org.allbinary.game.collision.CollidableInterfaceCompositeInterface
import org.allbinary.game.collision.CollisionType
import org.allbinary.game.collision.CollisionTypeFactory
import org.allbinary.game.layer.CollidableCompositeLayer
import org.allbinary.game.layer.pickup.PickedUpLayerInterface
import org.allbinary.logic.communication.log.ForcedLogUtil

open public class CollidableCharacterNoDamageBehavior : CollidableDestroyableDamageableBehavior {
        
public constructor        (ownerLayer: CollidableCompositeLayer, collidable: Boolean)                        

                            : super(ownerLayer, collidable)

        Updates for KMP build        
        {
var ownerLayer = ownerLayer
var collidable = collidable


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            override fun collide(collidableInterfaceCompositeInterface: CollidableCompositeLayer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface

    var collisionTypeFactory: CollisionTypeFactory = CollisionTypeFactory.getInstance()!!


    var collisionType: CollisionType = collidableInterfaceCompositeInterface!!.getCollidableInferface()!!.getCollisionTypeWith(this.ownerLayer)!!


    
                        if(collisionType == collisionTypeFactory!!.PICKUP)
                        
                                    {
                                    
    var collidableDestroyableDamageableLayer: CollidableDestroyableDamageableLayer = this.ownerLayer as CollidableDestroyableDamageableLayer

collidableDestroyableDamageableLayer!!.getPickupBehavior()!!.doPickup(collidableInterfaceCompositeInterface as PickedUpLayerInterface)

                                    }
                                
                        else {
                            
                        }
                            
}


                @Throws(Exception::class)
            override fun collide(collidableInterfaceCompositeInterface: CollidableInterfaceCompositeInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface
ForcedLogUtil.log(commonStrings!!.NOT_IMPLEMENTED, this)
}


}
                
            

