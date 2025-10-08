
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
        package org.allbinary.game.physics.velocity




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.direction.Direction
import org.allbinary.logic.math.BasicDecimal
import org.allbinary.math.Angle

interface BasicVelocityInterface {
        

    open fun getVelocityXBasicDecimalP()
        //nullable = true from not(false or (false and true)) = true
: BasicDecimal

    open fun getVelocityYBasicDecimalP()
        //nullable = true from not(false or (false and true)) = true
: BasicDecimal

    open fun zero()
        //nullable = true from not(false or (false and true)) = true


    open fun setVelocity(magnitudeBasicDecimal: BasicDecimal, direction: Direction, otherDirection: Direction)
        //nullable = true from not(false or (false and false)) = true


    open fun addVelocity(magnitudeBasicDecimal: BasicDecimal, direction: Direction, otherDirection: Direction)
        //nullable = true from not(false or (false and false)) = true


    open fun setVelocity(magnitude: Long, direction: Direction, otherDirection: Direction)
        //nullable = true from not(false or (false and false)) = true


    open fun addVelocity(magnitude: Long, direction: Direction, otherDirection: Direction)
        //nullable = true from not(false or (false and false)) = true


    open fun setVelocity(magnitudeBasicDecimal: BasicDecimal, angle: Angle, otherAngle: Angle)
        //nullable = true from not(false or (false and false)) = true


    open fun addVelocity(magnitudeBasicDecimal: BasicDecimal, angle: Angle, otherAngle: Angle)
        //nullable = true from not(false or (false and false)) = true


    open fun setVelocity(magnitude: Long, angle: Angle, otherAngle: Angle)
        //nullable = true from not(false or (false and false)) = true


    open fun addVelocity(magnitude: Long, angle: Angle, otherAngle: Angle)
        //nullable = true from not(false or (false and false)) = true


    open fun addVelocity(magnitude: Long, angle: Int, otherAngle: Int)
        //nullable = true from not(false or (false and false)) = true


}
                
            

