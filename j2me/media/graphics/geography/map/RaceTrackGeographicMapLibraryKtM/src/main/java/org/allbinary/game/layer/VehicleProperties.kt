
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
        
import org.allbinary.game.physics.velocity.VelocityProperties

open public class VehicleProperties
            : Object
         {
        

    private val velocityProperties: VelocityProperties

    private var vehicleFrictionProperties: VehicleFrictionProperties
public constructor        (velocityProperties: VelocityProperties, vehicleFrictionProperties: VehicleFrictionProperties)
            : super()
        {
var velocityProperties = velocityProperties
var vehicleFrictionProperties = vehicleFrictionProperties
this.velocityProperties= velocityProperties
this.setVehicleFrictionProperties(vehicleFrictionProperties)
}


open fun getVehicleFrictionProperties()
        //nullable = true from not(false or (false and true)) = true
: VehicleFrictionProperties{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return vehicleFrictionProperties
}


open fun setVehicleFrictionProperties(vehicleFrictionProperties: VehicleFrictionProperties)
        //nullable = true from not(false or (false and false)) = true
{
var vehicleFrictionProperties = vehicleFrictionProperties
this.vehicleFrictionProperties= vehicleFrictionProperties
}


open fun getVelocityProperties()
        //nullable = true from not(false or (false and true)) = true
: VelocityProperties{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return velocityProperties
}


}
                
            

