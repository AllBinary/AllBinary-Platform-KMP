
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
        package org.allbinary.game.layer.weapon




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.animation.Animation
import org.allbinary.animation.FeaturedAnimationInterfaceFactoryInterfaceFactory
import org.allbinary.animation.NullIndexedAnimationFactory
import org.allbinary.game.combat.damage.ExplosionResources
import org.allbinary.game.multiplayer.layer.RemoteInfo
import org.allbinary.graphics.Rectangle
import org.allbinary.physics.movement.Movement
import org.allbinary.view.ViewPosition

open public class SimpleWeaponLayer : WeaponLayer {
        
companion object {
            
                @Throws(Exception::class)
            
    open fun createDestroyed()
        //nullable = true from not(false or (false and true)) = true
: Animation{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return FeaturedAnimationInterfaceFactoryInterfaceFactory.getInstance()!!.getProcedural(ExplosionResources.getInstance()!!.THIRD_EXPLOSION_RESOURCE)!!.getInstanceAnimation(NullIndexedAnimationFactory.getFactoryInstance()!!.getInstance(0))
}


        }
            public constructor (name: String, remoteInfo: RemoteInfo, multiPlayerType: Int, movement: Movement, animationInterface: Animation, destroyedAnimationInterface: Animation, rectangle: Rectangle, viewPosition: ViewPosition)                        

                            : super(name, remoteInfo, multiPlayerType, movement, animationInterface, destroyedAnimationInterface, rectangle, viewPosition){
    //var name = name
    //var remoteInfo = remoteInfo
    //var multiPlayerType = multiPlayerType
    //var movement = movement
    //var animationInterface = animationInterface
    //var destroyedAnimationInterface = destroyedAnimationInterface
    //var rectangle = rectangle
    //var viewPosition = viewPosition


                            //For kotlin this is before the body of the constructor.
                    
this.setCollidableInferface(CollidableWeaponBehavior(this, true))
}


}
                
            

