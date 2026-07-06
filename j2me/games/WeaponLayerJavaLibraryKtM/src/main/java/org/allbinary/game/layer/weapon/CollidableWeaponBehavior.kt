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

import org.allbinary.game.collision.CollidableHelperFactory
import org.allbinary.game.collision.CollidableInterfaceCompositeInterface
import org.allbinary.game.collision.CollisionHelper
import org.allbinary.game.collision.CollisionType
import org.allbinary.game.collision.CollisionTypeFactory
import org.allbinary.game.combat.damage.DamageableInterface
import org.allbinary.game.layer.CollidableCompositeLayer
import org.allbinary.game.layer.special.CollidableDestroyableDamageableBehavior
import org.allbinary.layer.AllBinaryLayer

open public class CollidableWeaponBehavior : CollidableDestroyableDamageableBehavior {

    companion object {

        val NULL_COLLIDABLE_WEAPON_BEHAVIOR: CollidableWeaponBehavior =
            CollidableWeaponBehavior(false)
    }

    private var collided: Boolean = false

    var collisionHelper: CollisionHelper

    public constructor(collidable: Boolean) : super(collidable) {

        // var collidable = collidable

        // For kotlin this is before the body of the constructor.

        this.setCollided(false)
        this.setCollidable(true)
        this.collisionHelper = CollidableHelperFactory.getInstance()
    }

    open fun init(sourceLayerInterface: AllBinaryLayer)
        // nullable = true from not(false or (false and false)) = true
    {
        // var sourceLayerInterface = sourceLayerInterface
        this.setCollided(false)
        this.collisionHelper!!.setOwnerLayerInterface(sourceLayerInterface)
    }

    override fun isCollision(
        ownerLayer: CollidableCompositeLayer,
        collisionLayer: CollidableCompositeLayer,
    )
        // nullable = true from not(false or (false and false)) = true
        : Boolean {
        // var ownerLayer = ownerLayer
        // var collisionLayer = collisionLayer

        if (this.collisionHelper!!.isCollidable(collisionLayer)) {

            if (ownerLayer!!.getGroupInterface()[0] != collisionLayer!!.getGroupInterface()[0]) {

                // if statement needs to be on the same line and ternary does not work the same way.
                return super.isCollision(ownerLayer, collisionLayer)
            }
        }

        // if statement needs to be on the same line and ternary does not work the same way.
        return false
    }

    @Throws(Exception::class)
    override fun collide(
        ownerLayer: CollidableCompositeLayer,
        collisionLayer: CollidableCompositeLayer,
    )
        // nullable = true from not(false or (false and false)) = true
    {
        // var ownerLayer = ownerLayer
        // var collisionLayer = collisionLayer
        super.collide(ownerLayer, collisionLayer)
        this.collided = true
    }

    override fun isCollisionInterface(
        ownerLayer: CollidableCompositeLayer,
        collidableInterfaceCompositeInterface: CollidableInterfaceCompositeInterface,
    )
        // nullable = true from not(false or (false and false)) = true
        : Boolean {
        // var ownerLayer = ownerLayer
        // var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface

        if (
            this.collisionHelper!!.isCollidable(
                collidableInterfaceCompositeInterface as CollidableCompositeLayer
            )
        ) {

            var layerInterface: AllBinaryLayer =
                collidableInterfaceCompositeInterface as AllBinaryLayer

            if (ownerLayer!!.getGroupInterface()[0] != layerInterface!!.getGroupInterface()[0]) {

                if (this.layerCollisionUtil!!.isCollision(ownerLayer, layerInterface)) {

                    // if statement needs to be on the same line and ternary does not work the same
                    // way.
                    return true
                }
            }
        }

        // if statement needs to be on the same line and ternary does not work the same way.
        return false
    }

    @Throws(Exception::class)
    override fun collideInterface(
        ownerLayer: CollidableCompositeLayer,
        collidableInterfaceCompositeInterface: CollidableInterfaceCompositeInterface,
    )
        // nullable = true from not(false or (false and false)) = true
    {
        // var ownerLayer = ownerLayer
        // var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface

        var ownerDamageableInterface: DamageableInterface = ownerLayer as DamageableInterface

        var damageableInterface: DamageableInterface =
            collidableInterfaceCompositeInterface as DamageableInterface

        this.damageUtil!!.process(ownerDamageableInterface, damageableInterface)
        this.collided = true
    }

    override fun getCollisionTypeWith(
        layerInterface: AllBinaryLayer
    )
        // nullable = true from not(false or (false and false)) = true
        : CollisionType {
        // var layerInterface = layerInterface

        // if statement needs to be on the same line and ternary does not work the same way.
        return CollisionTypeFactory.getInstance()!!.COLLISION
    }

    open fun isCollided()
    // nullable = true from not(false or (false and true)) = true
    : Boolean {

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.collided
    }

    open fun setCollided(collided: Boolean)
        // nullable = true from not(false or (false and false)) = true
    {
        // var collided = collided
        this.collided = collided
    }
}
