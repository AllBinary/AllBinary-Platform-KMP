
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        
import org.allbinary.game.layer.behavior.GameLayerBehavior
import org.allbinary.game.physics.acceleration.BasicAccelerationProperties
import org.allbinary.game.physics.velocity.VelocityProperties
import org.allbinary.string.CommonStrings

open public class TopViewGameLayerBehavior : GameLayerBehavior {
        

    val maxGravityActionIndex: Int

    var isJumpAction: Boolean = true

    var isJumpOver: Boolean = false

    var isFallingWithoutJumpAttempt: Boolean = false

    var gravityActionIndex: Int = 0
public constructor (maxGravityActionIndex: Int){
    //var maxGravityActionIndex = maxGravityActionIndex
this.maxGravityActionIndex= maxGravityActionIndex
}


    open fun gravity()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(this.gravityActionIndex == 0)
                        
                                    {
                                    this.gravityActionIndex++
this.isFallingWithoutJumpAttempt= true

                                    }
                                
}


    open fun land(velocityProperties: VelocityProperties)
        //nullable = true from not(false or (false and false)) = true
{
    //var velocityProperties = velocityProperties
velocityProperties!!.getVelocityYBasicDecimalP()!!.set(0)
this.land()
}


    open fun land()
        //nullable = true from not(false or (false and true)) = true
{
this.gravityActionIndex= 0
this.isFallingWithoutJumpAttempt= false
this.isJumpAction= true
this.isJumpOver= false
}


    open fun up(velocityProperties: VelocityProperties, acceleration: BasicAccelerationProperties, jumpBehavior: InitialJumpBehavior, accelerationMultiplier: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var velocityProperties = velocityProperties
    //var acceleration = acceleration
    //var jumpBehavior = jumpBehavior
    //var accelerationMultiplier = accelerationMultiplier

    
                        if(!isJumpOver)
                        
                                    {
                                    
    
                        if(gravityActionIndex < maxGravityActionIndex)
                        
                                    {
                                    
    var acceleration2: Int =  -acceleration.getForward() *accelerationMultiplier

velocityProperties!!.getVelocityYBasicDecimalP()!!.add(acceleration2)
velocityProperties!!.limitXYToForwardAndReverseMaxVelocity()
gravityActionIndex++

                                    }
                                
                        else {
                            
                        }
                            

                                    }
                                
                        else {
                            
                        }
                            

    
                        if(isJumpAction)
                        
                                    {
                                    jumpBehavior!!.process()
isJumpAction= false

                                    }
                                
}


    open fun inputFrames(velocityProperties: VelocityProperties)
        //nullable = true from not(false or (false and false)) = true
{
    //var velocityProperties = velocityProperties

    
                        if(this.gravityActionIndex > 0 && velocityProperties!!.getVelocityYBasicDecimalP()!!.getUnscaled() > 0)
                        
                                    {
                                    this.isJumpOver= true

                                    }
                                
}


}
                
            

