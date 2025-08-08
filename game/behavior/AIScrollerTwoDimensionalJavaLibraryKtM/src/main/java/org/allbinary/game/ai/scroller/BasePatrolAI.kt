
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
        package org.allbinary.game.ai.scroller



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import javax.microedition.lcdui.Canvas
import org.allbinary.game.ai.BasicAI
import org.allbinary.game.input.GameInput
import org.allbinary.game.physics.velocity.BasicVelocityProperties
import org.allbinary.game.physics.velocity.VelocityInterfaceCompositeInterface
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.logic.math.MathUtil
import org.allbinary.logic.math.SmallIntegerSingletonFactory

open public class BasePatrolAI : BasicAI {
        

        companion object {


    val MAX_DISTANCE: Integer = SmallIntegerSingletonFactory.getInstance()!!.getInstance(2)!!
            

    val DIRECTION_ARRAY: Integer = SmallIntegerSingletonFactory.getInstance()!!.getInstance(3)!!
            

    val FIRING_DISTANCE: Integer = SmallIntegerSingletonFactory.getInstance()!!.getInstance(4)!!
            

    var SPEED: Integer = SmallIntegerSingletonFactory.getInstance()!!.getInstance(5)!!
            


        }
            
    var maxDistance: Integer

    var currentDistance: Int

    var xTotalDistance: Int= 0

    var lastKeyDirection: Int = Canvas.RIGHT

    var keyDirection: Int = Canvas.RIGHT
public constructor        (hashtable: Hashtable<Any, Any>, ownerLayerInterface: AllBinaryLayer, gameInput: GameInput)                        

                            : super(ownerLayerInterface, gameInput){

                    var hashtable = hashtable


                    var ownerLayerInterface = ownerLayerInterface


                    var gameInput = gameInput


                            //For kotlin this is before the body of the constructor.
                    
this.maxDistance= hashtable.get(BasePatrolAI.MAX_DISTANCE) as Integer
this.currentDistance= maxDistance!!.toInt()
}


open fun update()
        //nullable = true from not(false or (false and true)) = true
{this.updateTotalDistance()
this.changeDirectionIfReachedPacingAreaMax()
}


open fun updateTotalDistance()
        //nullable = true from not(false or (false and true)) = true
{
    var velocityInterfaceCompositeInterface: VelocityInterfaceCompositeInterface = this.getOwnerLayerInterface() as VelocityInterfaceCompositeInterface


    var velocityProperties: BasicVelocityProperties = velocityInterfaceCompositeInterface!!.getVelocityProperties()!!
            

xTotalDistance += velocityProperties!!.getVelocityXBasicDecimalP()!!.getScaled()
}


open fun changeDirectionIfReachedPacingAreaMax()
        //nullable = true from not(false or (false and true)) = true
{
    var mathUtil: MathUtil = MathUtil.getInstance()!!
            


    var totalDistance: Int = mathUtil!!.abs(xTotalDistance)!!
            


    
                        if(totalDistance > this.currentDistance)
                        
                                    {
                                    this.nextDirection()

                                    }
                                
}


open fun nextDirection()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(this.lastKeyDirection == Canvas.LEFT)
                        
                                    {
                                    keyDirection= Canvas.RIGHT
this.lastKeyDirection= keyDirection
xTotalDistance= 0

                                    }
                                
                             else 
    
                        if(this.lastKeyDirection == Canvas.RIGHT)
                        
                                    {
                                    keyDirection= Canvas.LEFT
this.lastKeyDirection= keyDirection
xTotalDistance= 0

                                    }
                                
}


open fun disable()
        //nullable = true from not(false or (false and true)) = true
{}


}
                
            

