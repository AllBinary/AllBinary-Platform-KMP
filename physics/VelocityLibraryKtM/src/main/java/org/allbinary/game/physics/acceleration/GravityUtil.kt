
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
        package org.allbinary.game.physics.acceleration



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.physics.velocity.BasicVelocityProperties

open public class GravityUtil
            : Object
         {
        

        companion object {


    private val instance: GravityUtil = GravityUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GravityUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val GAME_GRAVITY_VELOCITY: Int = 1800

    val MAX_GAME_VELOCITY: Int = 18000

open fun process(velocityProperties: BasicVelocityProperties)
        //nullable = true from not(false or (false and false)) = true
{

                    var velocityProperties = velocityProperties
velocityProperties!!.getVelocityYBasicDecimalP()!!.add(this.GAME_GRAVITY_VELOCITY)
}


open fun process(velocityProperties: BasicVelocityProperties, customGravity: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var velocityProperties = velocityProperties


                    var customGravity = customGravity
velocityProperties!!.getVelocityYBasicDecimalP()!!.add(customGravity)
}


}
                
            

