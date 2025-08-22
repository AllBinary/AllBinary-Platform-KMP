
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
        
import org.allbinary.game.collision.CollidableHelperFactory
import org.allbinary.game.collision.CollidableInterfaceCompositeInterface
import org.allbinary.game.collision.CollisionHelper
import org.allbinary.game.collision.CollisionType
import org.allbinary.game.collision.CollisionTypeFactory
import org.allbinary.game.collision.LayerCollisionUtil
import org.allbinary.game.combat.damage.DamageableInterface
import org.allbinary.game.layer.CollidableCompositeLayer
import org.allbinary.game.layer.special.CollidableDestroyableDamageableBehavior
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.logic.communication.log.LogUtil

open public class CollidableWeaponBehavior : CollidableDestroyableDamageableBehavior {
        

        companion object {
            
    val NULL_COLLIDABLE_WEAPON_BEHAVIOR: CollidableWeaponBehavior = CollidableWeaponBehavior(CollidableCompositeLayer.NULL_COLLIDABLE_COMPOSITE_LAYER, false)

        }
            
    private var collided: Boolean= false

    var collisionHelper: CollisionHelper
public constructor        (ownerLayer: CollidableCompositeLayer, collidable: Boolean)                        

                            : super(ownerLayer, collidable){

                    var ownerLayer = ownerLayer


                    var collidable = collidable


                            //For kotlin this is before the body of the constructor.
                    
this.setCollided(false)
this.setCollidable(true)
this.collisionHelper= CollidableHelperFactory.getInstance()
}


open fun init(sourceLayerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var sourceLayerInterface = sourceLayerInterface
this.setCollided(false)
this.collisionHelper!!.setOwnerLayerInterface(sourceLayerInterface)
}

override fun isCollision(collisionLayer: CollidableCompositeLayer)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var collisionLayer = collisionLayer

    
                        if(this.collisionHelper!!.isCollidable(collisionLayer))
                        
                                    {
                                    
    
                        if(this.ownerLayer!!.getGroupInterface()[0] != collisionLayer!!.getGroupInterface()[0])
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.isCollision(collisionLayer)

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            override fun collide(collisionLayer: CollidableCompositeLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var collisionLayer = collisionLayer
super.collide(collisionLayer)
this.collided= true
}


    private val layerCollisionUtil: LayerCollisionUtil = LayerCollisionUtil.getInstance()!!
override fun isCollision(collidableInterfaceCompositeInterface: CollidableInterfaceCompositeInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface

    
                        if(this.collisionHelper!!.isCollidable(collidableInterfaceCompositeInterface as CollidableCompositeLayer))
                        
                                    {
                                    
    var layerInterface: AllBinaryLayer = collidableInterfaceCompositeInterface as AllBinaryLayer


    
                        if(this.ownerLayer!!.getGroupInterface()[0] != layerInterface!!.getGroupInterface()[0])
                        
                                    {
                                    
    
                        if(layerCollisionUtil!!.isCollision(this.ownerLayer, layerInterface))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            override fun collide(collidableInterfaceCompositeInterface: CollidableInterfaceCompositeInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface
damageUtil!!.process(this.ownerLayer as DamageableInterface, collidableInterfaceCompositeInterface as DamageableInterface)
this.collided= true
}

override fun getCollisionTypeWith(layerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
: CollisionType{

                    var layerInterface = layerInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CollisionTypeFactory.getInstance()!!.COLLISION
}


open fun isCollided()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return collided
}


open fun setCollided(collided: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var collided = collided
this.collided= collided
}


}
                
            

