
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.CollidableCompositeLayer
import org.allbinary.game.layer.pickup.PickedUpLayerInterface
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.game.collision.CollidableInterfaceCompositeInterface
import org.allbinary.game.collision.CollisionType
import org.allbinary.game.collision.CollisionTypeFactory
import org.allbinary.game.layer.special.CollidableDestroyableDamageableBehavior
import org.allbinary.game.layer.special.CollidableDestroyableDamageableLayer

open public class CollidableVehicleBehavior : CollidableDestroyableDamageableBehavior {
        

    var totalImpactVelocity: Long = 0
public constructor (ownerLayer: CollidableCompositeLayer, collidable: Boolean)                        

                            : super(ownerLayer, collidable){
var ownerLayer = ownerLayer
var collidable = collidable


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
    open fun collide(collidableInterfaceCompositeInterface: CollidableCompositeLayer)
        //nullable = true from not(false or (false and false)) = true
{
var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface

    var collisionTypeFactory: CollisionTypeFactory = CollisionTypeFactory.getInstance()!!


    var collisionType: CollisionType = collidableInterfaceCompositeInterface!!.getCollidableInferface()!!.getCollisionTypeWith(this.ownerLayer)!!


    
                        if(collisionType == collisionTypeFactory!!.PICKUP)
                        
                                    {
                                    ownerLayer = this.ownerLayerownerLayer as CollidableDestroyableDamageableLayer
ownerLayer.
                    getPickupBehavior()!!.doPickup(collidableInterfaceCompositeInterface as PickedUpLayerInterface)

                                    }
                                
                             else 
    
                        if(collisionType == collisionTypeFactory!!.COLLISION)
                        
                                    {
                                    super.collide(collidableInterfaceCompositeInterface)

                                    }
                                
                        else {
                            this.collide(collidableInterfaceCompositeInterface as VehiclePropertiesCompositeInterface)

                        }
                            
}


    open fun collide(collidableInterfaceCompositeInterface: CollidableInterfaceCompositeInterface)
        //nullable = true from not(false or (false and false)) = true
{
var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface
ForcedLogUtil.log("Don't Use Interface Version It Is Slower", this)
}


    private var halfImpactVelocityX: Long= 0

    private var halfImpactVelocityY: Long= 0

    open fun collide(vehiclePropertiesCompositeInterface: VehiclePropertiesCompositeInterface)
        //nullable = true from not(false or (false and false)) = true
{
var vehiclePropertiesCompositeInterface = vehiclePropertiesCompositeInterface

    var ownerVehicleLayerInterface: VehiclePropertiesCompositeInterface = (this.ownerLayer as VehiclePropertiesCompositeInterface)


    var ownerVehicleProperties: VehicleProperties = ownerVehicleLayerInterface!!.getVehicleProperties()!!


    var vehicleProperties: VehicleProperties = vehiclePropertiesCompositeInterface!!.getVehicleProperties()!!


    var impactVelocityX: Long = ownerVehicleProperties!!.getVelocityProperties()!!.getVelocityXBasicDecimalP()!!.getUnscaled() -vehicleProperties!!.getVelocityProperties()!!.getVelocityXBasicDecimalP()!!.getUnscaled()


    var impactVelocityY: Long = ownerVehicleProperties!!.getVelocityProperties()!!.getVelocityYBasicDecimalP()!!.getUnscaled() -vehicleProperties!!.getVelocityProperties()!!.getVelocityYBasicDecimalP()!!.getUnscaled()


    
                        if(impactVelocityX != 0)
                        
                                    {
                                    halfImpactVelocityX= (impactVelocityX shr 1)
ownerVehicleProperties!!.getVelocityProperties()!!.getVelocityXBasicDecimalP()!!.add(halfImpactVelocityX)
vehicleProperties!!.getVelocityProperties()!!.getVelocityXBasicDecimalP()!!.add(halfImpactVelocityX)

                                    }
                                
                        else {
                            
                        }
                            

    
                        if(impactVelocityY != 0)
                        
                                    {
                                    halfImpactVelocityY= (impactVelocityY shr 1)
ownerVehicleProperties!!.getVelocityProperties()!!.getVelocityYBasicDecimalP()!!.add(halfImpactVelocityY)
vehicleProperties!!.getVelocityProperties()!!.getVelocityXBasicDecimalP()!!.add(halfImpactVelocityY)

                                    }
                                
                        else {
                            
                        }
                            
this.collideFriction(ownerVehicleLayerInterface)
this.collideFriction(vehiclePropertiesCompositeInterface)
totalImpactVelocity= impactVelocityX +impactVelocityY
}


    open fun collideFriction(vehiclePropertiesCompositeInterface: VehiclePropertiesCompositeInterface)
        //nullable = true from not(false or (false and false)) = true
{
var vehiclePropertiesCompositeInterface = vehiclePropertiesCompositeInterface

    var vehicleFrictionProperties: VehicleFrictionProperties = vehiclePropertiesCompositeInterface!!.getVehicleProperties()!!.getVehicleFrictionProperties()!!

vehiclePropertiesCompositeInterface!!.getVehicleProperties()!!.getVehicleFrictionProperties()!!.friction(vehiclePropertiesCompositeInterface!!.getVehicleProperties()!!.getVelocityProperties(), vehicleFrictionProperties!!.getCrashFrictionNominator())
}


}
                
            

