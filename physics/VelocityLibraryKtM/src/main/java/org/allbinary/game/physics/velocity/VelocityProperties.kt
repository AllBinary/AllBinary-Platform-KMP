
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
        

open public class VelocityProperties : BasicVelocityProperties
                , VelocityInterface {
        
companion object {
            
    val NULL_VELOCITY_PROPERTIES: VelocityProperties = VelocityProperties(0, 0)

        }
            
    private var maxForwardVelocity: Int= 0

    private var maxReverseVelocity: Int= 0
public constructor (maxForwardVelocity: Int, maxReverseVelocity: Int){
var maxForwardVelocity = maxForwardVelocity
var maxReverseVelocity = maxReverseVelocity
this.setMaxForwardVelocity(maxForwardVelocity)
this.setMaxReverseVelocity(maxReverseVelocity)
}


    override fun getMaxForwardVelocity()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return maxForwardVelocity
}


    override fun setMaxForwardVelocity(maxForwardVelocity: Int)
        //nullable = true from not(false or (false and false)) = true
{
var maxForwardVelocity = maxForwardVelocity
this.maxForwardVelocity= maxForwardVelocity
}


    override fun getMaxReverseVelocity()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return maxReverseVelocity
}


    override fun setMaxReverseVelocity(maxReverseVelocity: Int)
        //nullable = true from not(false or (false and false)) = true
{
var maxReverseVelocity = maxReverseVelocity
this.maxReverseVelocity= maxReverseVelocity
}


    override fun limitMaxXYForwardVelocity()
        //nullable = true from not(false or (false and true)) = true
{
this.limitMaxXYVelocity(this.getMaxForwardVelocity())
}


    override fun limitMaxXYReverseVelocity()
        //nullable = true from not(false or (false and true)) = true
{
this.limitMaxXYVelocity(this.getMaxReverseVelocity())
}


    open fun limitMaxYForwardVelocity()
        //nullable = true from not(false or (false and true)) = true
{
this.limitMaxYVelocity(this.getMaxForwardVelocity())
}


    open fun limitMaxYReverseVelocity()
        //nullable = true from not(false or (false and true)) = true
{
this.limitMaxYVelocity(this.getMaxReverseVelocity())
}


    open fun limitMaxXForwardVelocity()
        //nullable = true from not(false or (false and true)) = true
{
this.limitMaxXVelocity(this.getMaxForwardVelocity())
}


    open fun limitMaxXReverseVelocity()
        //nullable = true from not(false or (false and true)) = true
{
this.limitMaxXVelocity(this.getMaxReverseVelocity())
}


    open fun isOverXYMaxForwardVelocity()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.isOverXYMaxVelocity(this.getMaxForwardVelocity())
}


    open fun isOverXYMaxReverseVelocity()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.isOverXYMaxVelocity(this.getMaxReverseVelocity())
}


    override fun limitXYToForwardAndReverseMaxVelocity()
        //nullable = true from not(false or (false and true)) = true
{
this.limitMaxXYForwardVelocity()
this.limitMaxXYReverseVelocity()
}


    override fun limitMaxXYVelocity(maxVelocity: Int)
        //nullable = true from not(false or (false and false)) = true
{
var maxVelocity = maxVelocity
this.limitMaxXVelocity(maxVelocity)
this.limitMaxYVelocity(maxVelocity)
}


    open fun limitMaxPositiveYVelocity(maxVelocity: Int)
        //nullable = true from not(false or (false and false)) = true
{
var maxVelocity = maxVelocity

    
                        if(this.velocityYBasicDecimal!!.getUnscaled() > maxVelocity)
                        
                                    {
                                    this.velocityYBasicDecimal!!.set(maxVelocity)

                                    }
                                
}


    open fun limitMaxNegativeYVelocity(maxVelocity: Int)
        //nullable = true from not(false or (false and false)) = true
{
var maxVelocity = maxVelocity

    
                        if(this.velocityYBasicDecimal!!.getUnscaled() <  -maxVelocity)
                        
                                    {
                                    this.velocityYBasicDecimal!!.set( -maxVelocity)

                                    }
                                
}


    open fun limitMaxYVelocity(maxVelocity: Int)
        //nullable = true from not(false or (false and false)) = true
{
var maxVelocity = maxVelocity
this.limitMaxPositiveYVelocity(maxVelocity)
this.limitMaxNegativeYVelocity(maxVelocity)
}


    open fun limitMaxXVelocity(maxVelocity: Int)
        //nullable = true from not(false or (false and false)) = true
{
var maxVelocity = maxVelocity

    
                        if(this.velocityXBasicDecimal!!.getUnscaled() > maxVelocity)
                        
                                    {
                                    this.velocityXBasicDecimal!!.set(maxVelocity)

                                    }
                                

    
                        if(this.velocityXBasicDecimal!!.getUnscaled() <  -maxVelocity)
                        
                                    {
                                    this.velocityXBasicDecimal!!.set( -maxVelocity)

                                    }
                                
}


    open fun isOverXYMaxVelocity(maxVelocity: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var maxVelocity = maxVelocity

    
                        if(this.velocityXBasicDecimal!!.getUnscaled() > maxVelocity)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                

    
                        if(this.velocityXBasicDecimal!!.getUnscaled() <  -maxVelocity)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                

    
                        if(this.velocityYBasicDecimal!!.getUnscaled() > maxVelocity)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                

    
                        if(this.velocityYBasicDecimal!!.getUnscaled() <  -maxVelocity)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    override fun setVelocity(magnitude: Long, angle: Int, otherAngle: Int)
        //nullable = true from not(false or (false and false)) = true
{
var magnitude = magnitude
var angle = angle
var otherAngle = otherAngle
super.setVelocity(magnitude, angle, otherAngle)
this.limitXYToForwardAndReverseMaxVelocity()
}


    override fun addVelocity(magnitude: Long, angle: Int, otherAngle: Int)
        //nullable = true from not(false or (false and false)) = true
{
var magnitude = magnitude
var angle = angle
var otherAngle = otherAngle
super.addVelocity(magnitude, angle, otherAngle)
this.limitXYToForwardAndReverseMaxVelocity()
}


}
                
            

