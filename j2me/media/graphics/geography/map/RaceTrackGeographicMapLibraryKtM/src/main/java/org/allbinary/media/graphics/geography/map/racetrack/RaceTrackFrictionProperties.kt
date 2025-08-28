
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
        package org.allbinary.media.graphics.geography.map.racetrack




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.physics.friction.FrictionData

open public class RaceTrackFrictionProperties
            : Object
         {
        

    private val ROAD_FRICTION_NOMINATOR: Int

    private val GROUND_FRICTION_NOMINATOR: Int
public constructor        (roadFriction: Int, groundFriction: Int)
            : super()
        

        Updates for KMP build        
        {
var roadFriction = roadFriction
var groundFriction = groundFriction
ROAD_FRICTION_NOMINATOR= FrictionData.getFrictionDenominator() -roadFriction
GROUND_FRICTION_NOMINATOR= FrictionData.getFrictionDenominator() -groundFriction
}


open fun getRoadFrictionNominator()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.ROAD_FRICTION_NOMINATOR
}


open fun getGroundFrictionNominator()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.GROUND_FRICTION_NOMINATOR
}


}
                
            

