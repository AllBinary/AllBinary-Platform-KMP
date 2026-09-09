
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

open public class CollidableCharacterBehavior : CollidableDestroyableDamageableBehavior {
        
public constructor (collidable: Boolean)                        

                            : super(collidable){
var collidable = collidable


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
    override fun collide(ownerLayer: CollidableCompositeLayer, collidableInterfaceCompositeInterface: CollidableCompositeLayer)
        //nullable = true from not(false or (false and false)) = true
{
    //var ownerLayer = ownerLayer
var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface

    var collisionTypeFactory: CollisionTypeFactory = CollisionTypeFactory.getInstance()!!


    var collisionType: CollisionType = collidableInterfaceCompositeInterface!!.getCollidableInferface()!!.getCollisionTypeWith(ownerLayer)!!


    
                        if(collisionType == collisionTypeFactory!!.PICKUP)
                        
                                    {
                                    
    var collidableDestroyableDamageableLayer: CollidableDestroyableDamageableLayer = ownerLayer as CollidableDestroyableDamageableLayer

collidableDestroyableDamageableLayer!!.getPickupBehavior()!!.doPickupLayer(collidableInterfaceCompositeInterface as PickedUpLayerInterface)

                                    }
                                
                        else {
                            super.collide(ownerLayer, collidableInterfaceCompositeInterface)

                        }
                            
}


                @Throws(Exception::class)
            
    override fun collideInterface(ownerLayer: CollidableCompositeLayer, collidableInterfaceCompositeInterface: CollidableInterfaceCompositeInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var ownerLayer = ownerLayer
var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface
ForcedLogUtil.log(this.commonStrings!!.NOT_IMPLEMENTED, this)
}


}
                
            

