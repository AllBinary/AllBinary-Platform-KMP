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
package org.allbinary.game.layer

import org.allbinary.game.collision.CollidableInterfaceCompositeInterface
import org.allbinary.game.collision.CollisionType
import org.allbinary.game.collision.CollisionTypeFactory
import org.allbinary.game.layer.pickup.PickedUpLayerInterface
import org.allbinary.game.layer.special.CollidableDestroyableDamageableBehavior
import org.allbinary.game.layer.special.CollidableDestroyableDamageableLayer
import org.allbinary.logic.communication.log.ForcedLogUtil

open public class CollidableVehicleBehavior : CollidableDestroyableDamageableBehavior {

    var totalImpactVelocity: Long = 0

    public constructor(collidable: Boolean) : super(collidable) {

        // var collidable = collidable

        // For kotlin this is before the body of the constructor.

    }

    @Throws(Exception::class)
    override fun collide(
        ownerLayer: CollidableCompositeLayer,
        collidableInterfaceCompositeInterface: CollidableCompositeLayer,
    )
        // nullable = true from not(false or (false and false)) = true
    {
        // var ownerLayer = ownerLayer
        // var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface

        var collisionTypeFactory: CollisionTypeFactory = CollisionTypeFactory.getInstance()!!

        var collisionType: CollisionType =
            collidableInterfaceCompositeInterface!!
                .getCollidableInferface()!!
                .getCollisionTypeWith(ownerLayer)!!

        if (collisionType == collisionTypeFactory!!.PICKUP) {

            var collidableDestroyableDamageableLayer: CollidableDestroyableDamageableLayer =
                (ownerLayer as CollidableDestroyableDamageableLayer)

            collidableDestroyableDamageableLayer!!
                .getPickupBehavior()!!
                .doPickupLayer(collidableInterfaceCompositeInterface as PickedUpLayerInterface)
        } else if (collisionType == collisionTypeFactory!!.COLLISION) {

            super.collide(ownerLayer, collidableInterfaceCompositeInterface)
        } else {
            this.collideVehicle(
                ownerLayer,
                collidableInterfaceCompositeInterface as VehiclePropertiesCompositeInterface,
            )
        }
    }

    override fun collideInterface(
        ownerLayer: CollidableCompositeLayer,
        collidableInterfaceCompositeInterface: CollidableInterfaceCompositeInterface,
    )
        // nullable = true from not(false or (false and false)) = true
    {
        // var ownerLayer = ownerLayer
        // var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface
        ForcedLogUtil.log("Don't Use Interface Version It Is Slower", this)
    }

    private var halfImpactVelocityX: Long = 0

    private var halfImpactVelocityY: Long = 0

    open fun collideVehicle(
        ownerLayer: CollidableCompositeLayer,
        vehiclePropertiesCompositeInterface: VehiclePropertiesCompositeInterface,
    )
        // nullable = true from not(false or (false and false)) = true
    {
        // var ownerLayer = ownerLayer
        // var vehiclePropertiesCompositeInterface = vehiclePropertiesCompositeInterface

        var ownerVehicleLayerInterface: VehiclePropertiesCompositeInterface =
            (ownerLayer as VehiclePropertiesCompositeInterface)

        var ownerVehicleProperties: VehicleProperties =
            ownerVehicleLayerInterface!!.getVehicleProperties()!!

        var vehicleProperties: VehicleProperties =
            vehiclePropertiesCompositeInterface!!.getVehicleProperties()!!

        var impactVelocityX: Long =
            ownerVehicleProperties!!
                .getVelocityProperties()!!
                .getVelocityXBasicDecimalP()!!
                .getUnscaled() -
                vehicleProperties!!
                    .getVelocityProperties()!!
                    .getVelocityXBasicDecimalP()!!
                    .getUnscaled()

        var impactVelocityY: Long =
            ownerVehicleProperties!!
                .getVelocityProperties()!!
                .getVelocityYBasicDecimalP()!!
                .getUnscaled() -
                vehicleProperties!!
                    .getVelocityProperties()!!
                    .getVelocityYBasicDecimalP()!!
                    .getUnscaled()

        if (impactVelocityX != 0L) {

            this.halfImpactVelocityX = (impactVelocityX shr 1)
            ownerVehicleProperties!!
                .getVelocityProperties()!!
                .getVelocityXBasicDecimalP()!!
                .addlong(this.halfImpactVelocityX)
            vehicleProperties!!
                .getVelocityProperties()!!
                .getVelocityXBasicDecimalP()!!
                .addlong(this.halfImpactVelocityX)
        } else {}

        if (impactVelocityY != 0L) {

            this.halfImpactVelocityY = (impactVelocityY shr 1)
            ownerVehicleProperties!!
                .getVelocityProperties()!!
                .getVelocityYBasicDecimalP()!!
                .addlong(this.halfImpactVelocityY)
            vehicleProperties!!
                .getVelocityProperties()!!
                .getVelocityXBasicDecimalP()!!
                .addlong(this.halfImpactVelocityY)
        } else {}

        this.collideFriction(ownerVehicleLayerInterface)
        this.collideFriction(vehiclePropertiesCompositeInterface)
        this.totalImpactVelocity = impactVelocityX + impactVelocityY
    }

    open fun collideFriction(
        vehiclePropertiesCompositeInterface: VehiclePropertiesCompositeInterface
    )
        // nullable = true from not(false or (false and false)) = true
    {
        // var vehiclePropertiesCompositeInterface = vehiclePropertiesCompositeInterface

        var vehicleFrictionProperties: VehicleFrictionProperties =
            vehiclePropertiesCompositeInterface!!
                .getVehicleProperties()!!
                .getVehicleFrictionProperties()!!

        vehiclePropertiesCompositeInterface!!
            .getVehicleProperties()!!
            .getVehicleFrictionProperties()!!
            .friction(
                vehiclePropertiesCompositeInterface!!
                    .getVehicleProperties()!!
                    .getVelocityProperties(),
                vehicleFrictionProperties!!.getCrashFrictionNominator(),
            )
    }
}
