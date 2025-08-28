
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
        package org.allbinary.android.input.motion




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.special.CollidableDestroyableDamageableLayer
import org.allbinary.time.TimeDelayHelper

open public class AnalogControllerHelper
            : Object
         {
        

    private val reduceTimeFactor: Int
public constructor        (reduceTimeFactor: Int)
            : super()
        {
var reduceTimeFactor = reduceTimeFactor
this.reduceTimeFactor= reduceTimeFactor
}


    private val SCALE_VALUE: Int = AnalogControllerConfigurationFactory.getInstance()!!.SCALE_VALUE

    private val rightTimeElapsedHelper: TimeDelayHelper = TimeDelayHelper(0)

    private val leftTimeElapsedHelper: TimeDelayHelper = TimeDelayHelper(0)

    private val downTimeElapsedHelper: TimeDelayHelper = TimeDelayHelper(0)

    private val upTimeElapsedHelper: TimeDelayHelper = TimeDelayHelper(0)

                @Throws(Exception::class)
            
open fun right(collidableDestroyableDamageableLayer: CollidableDestroyableDamageableLayer, xAnalogValue: Int)
        //nullable = true from not(false or (false and false)) = true
{
var collidableDestroyableDamageableLayer = collidableDestroyableDamageableLayer
var xAnalogValue = xAnalogValue
this.rightTimeElapsedHelper!!.delay= ((SCALE_VALUE -xAnalogValue) shr this.reduceTimeFactor)

    
                        if(this.rightTimeElapsedHelper!!.isTime())
                        
                                    {
                                    collidableDestroyableDamageableLayer!!.right()

                                    }
                                
}


                @Throws(Exception::class)
            
open fun left(collidableDestroyableDamageableLayer: CollidableDestroyableDamageableLayer, xAnalogValue: Int)
        //nullable = true from not(false or (false and false)) = true
{
var collidableDestroyableDamageableLayer = collidableDestroyableDamageableLayer
var xAnalogValue = xAnalogValue
this.leftTimeElapsedHelper!!.delay= ((SCALE_VALUE +xAnalogValue) shr this.reduceTimeFactor)

    
                        if(this.leftTimeElapsedHelper!!.isTime())
                        
                                    {
                                    collidableDestroyableDamageableLayer!!.left()

                                    }
                                
}


                @Throws(Exception::class)
            
open fun up(collidableDestroyableDamageableLayer: CollidableDestroyableDamageableLayer, xAnalogValue: Int)
        //nullable = true from not(false or (false and false)) = true
{
var collidableDestroyableDamageableLayer = collidableDestroyableDamageableLayer
var xAnalogValue = xAnalogValue
this.upTimeElapsedHelper!!.delay= ((SCALE_VALUE -xAnalogValue) shr this.reduceTimeFactor)

    
                        if(this.upTimeElapsedHelper!!.isTime())
                        
                                    {
                                    collidableDestroyableDamageableLayer!!.up()

                                    }
                                
}


                @Throws(Exception::class)
            
open fun down(collidableDestroyableDamageableLayer: CollidableDestroyableDamageableLayer, xAnalogValue: Int)
        //nullable = true from not(false or (false and false)) = true
{
var collidableDestroyableDamageableLayer = collidableDestroyableDamageableLayer
var xAnalogValue = xAnalogValue
this.downTimeElapsedHelper!!.delay= ((SCALE_VALUE +xAnalogValue) shr this.reduceTimeFactor)

    
                        if(this.downTimeElapsedHelper!!.isTime())
                        
                                    {
                                    collidableDestroyableDamageableLayer!!.down()

                                    }
                                
}


}
                
            

