
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
        
import org.allbinary.game.physics.FrictionProperties
import org.allbinary.game.physics.friction.FrictionData

open public class VehicleFrictionProperties : FrictionProperties {
        

    private val TIRE_FRICTION_NOMINATOR: Int

    private val BRAKE_FRICTION_NOMINATOR: Int

    private val AIR_FRICTION_NOMINATOR: Int

    private val CRASH_FRICTION_NOMINATOR: Int
public constructor        (tireFriction: Int, brakeFriction: Int, airFriction: Int, crashFriction: Int)

        Updates for KMP build        
        {
var tireFriction = tireFriction
var brakeFriction = brakeFriction
var airFriction = airFriction
var crashFriction = crashFriction
TIRE_FRICTION_NOMINATOR= FrictionData.getFrictionDenominator() -tireFriction
BRAKE_FRICTION_NOMINATOR= FrictionData.getFrictionDenominator() -brakeFriction
AIR_FRICTION_NOMINATOR= FrictionData.getFrictionDenominator() -airFriction
CRASH_FRICTION_NOMINATOR= FrictionData.getFrictionDenominator() -crashFriction
}


open fun getTireFrictionNominator()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.TIRE_FRICTION_NOMINATOR
}


open fun getBrakeFrictionNominator()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.BRAKE_FRICTION_NOMINATOR
}


open fun getAirFrictionNominator()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.AIR_FRICTION_NOMINATOR
}


open fun getCrashFrictionNominator()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.CRASH_FRICTION_NOMINATOR
}


}
                
            

