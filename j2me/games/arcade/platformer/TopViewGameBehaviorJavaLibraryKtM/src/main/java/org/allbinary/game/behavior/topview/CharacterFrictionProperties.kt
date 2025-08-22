
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2006 AllBinary 
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
        package org.allbinary.game.behavior.topview




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.physics.FrictionProperties
import org.allbinary.game.physics.friction.FrictionData

open public class CharacterFrictionProperties : FrictionProperties {
        

    private val WATER_FRICTION_NOMINATOR: Int

    private val AIR_FRICTION_NOMINATOR: Int

    private val COLLISION_FRICTION_NOMINATOR: Int
public constructor        (airFriction: Int, waterFriction: Int, collisionFriction: Int){

                    var airFriction = airFriction


                    var waterFriction = waterFriction


                    var collisionFriction = collisionFriction
AIR_FRICTION_NOMINATOR= FrictionData.getFrictionDenominator() -airFriction
COLLISION_FRICTION_NOMINATOR= FrictionData.getFrictionDenominator() -collisionFriction
WATER_FRICTION_NOMINATOR= FrictionData.getFrictionDenominator() -waterFriction
}


open fun getWATER_FRICTION_NOMINATOR()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return WATER_FRICTION_NOMINATOR
}


open fun getAIR_FRICTION_NOMINATOR()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AIR_FRICTION_NOMINATOR
}


open fun getCOLLISION_FRICTION_NOMINATOR()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return COLLISION_FRICTION_NOMINATOR
}


}
                
            

