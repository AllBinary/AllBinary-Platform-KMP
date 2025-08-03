
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
        package org.allbinary.game.ai



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Canvas
import org.allbinary.ai.ArtificialIntelligenceTransitionInterface
import org.allbinary.animation.IndexedAnimation
import org.allbinary.animation.RotationAnimationInterface
import org.allbinary.animation.RotationAnimationInterfaceCompositeInterface
import org.allbinary.game.input.GameInput
import org.allbinary.game.physics.velocity.BasicVelocityProperties
import org.allbinary.game.physics.velocity.VelocityInterface
import org.allbinary.game.physics.velocity.VelocityInterfaceCompositeInterface
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.math.AngleIncrementInfo
import org.allbinary.util.CircularIndexUtil

open public class HorizontaRotationManeuverAI : BasicAI
                , ArtificialIntelligenceTransitionInterface {
        

    private val circularIndexUtil: CircularIndexUtil = CircularIndexUtil.getInstance(10, Integer.MAX_VALUE)!!
            

    private var currentSpeedDivisor: Int = 5

    private val rotationAnimationInterface: IndexedAnimation

    private val baseVelocityInterface: BasicVelocityProperties

    private val velocityInterface: VelocityInterface
public constructor        (ownerLayerInterface: AllBinaryLayer, gameInput: GameInput)                        

                            : super(ownerLayerInterface, gameInput){

                    var ownerLayerInterface = ownerLayerInterface


                    var gameInput = gameInput


                            //For kotlin this is before the body of the constructor.
                    

    var rotationAnimationInterfaceCompositeInterface: RotationAnimationInterfaceCompositeInterface = this.getOwnerLayerInterface() as RotationAnimationInterfaceCompositeInterface

this.rotationAnimationInterface= rotationAnimationInterfaceCompositeInterface!!.getRotationAnimationInterface()

    var velocityInterfaceCompositeInterface: VelocityInterfaceCompositeInterface = this.getOwnerLayerInterface() as VelocityInterfaceCompositeInterface

this.baseVelocityInterface= velocityInterfaceCompositeInterface!!.getVelocityProperties()
this.velocityInterface= baseVelocityInterface as VelocityInterface

    var rotationAnimationInterface: RotationAnimationInterface = this.rotationAnimationInterface as RotationAnimationInterface


    var angleIncrementInfo: AngleIncrementInfo = rotationAnimationInterface!!.getAngleInfoP()!!.getAngleIncrementInfo()!!
            

rotationAnimationInterfaceCompositeInterface!!.setFrame(angleIncrementInfo!!.RIGHT_FRAME.toInt())
}

override fun transition()
        //nullable = true from not(false or (false and true)) = true
{
    var rotationAnimationInterface: RotationAnimationInterface = this.rotationAnimationInterface as RotationAnimationInterface


    var angleIncrementInfo: AngleIncrementInfo = rotationAnimationInterface!!.getAngleInfoP()!!.getAngleIncrementInfo()!!
            


    var rotationAnimationInterfaceCompositeInterface: RotationAnimationInterfaceCompositeInterface = this.getOwnerLayerInterface() as RotationAnimationInterfaceCompositeInterface

rotationAnimationInterfaceCompositeInterface!!.setFrame(angleIncrementInfo!!.RIGHT_FRAME.toInt())

    var allbinaryLayer: AllBinaryLayer = this.getOwnerLayerInterface()!!
            

allbinaryLayer!!.setPosition(allbinaryLayer!!.getXP(), 1, allbinaryLayer!!.getZP())
}


                @Throws(Exception::class)
            override fun processAI(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryLayerManager = allBinaryLayerManager

    var rotationAnimationInterface: RotationAnimationInterface = (this.rotationAnimationInterface as RotationAnimationInterface)


    var angleIncrementInfo: AngleIncrementInfo = rotationAnimationInterface!!.getAngleInfoP()!!.getAngleIncrementInfo()!!
            


    var frame: Int = this.rotationAnimationInterface!!.getFrame()!!
            


    var ownerLayerInterface: AllBinaryLayer = this.getOwnerLayerInterface()!!
            


    
                        if(ownerLayerInterface!!.getXP() -ownerLayerInterface!!.getWidth() <= 0 && frame == angleIncrementInfo!!.LEFT_FRAME.toInt())
                        
                                    {
                                    this.reverse()
this.drop()

                                    }
                                

    var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!
            


    
                        if(ownerLayerInterface!!.getX2() +ownerLayerInterface!!.getWidth() > displayInfo!!.getLastWidth() && frame == angleIncrementInfo!!.RIGHT_FRAME.toInt())
                        
                                    {
                                    this.reverse()
this.accelerate()
this.drop()

                                    }
                                

    var index: Int = circularIndexUtil!!.getIndex()!!
            


    
                        if(index % this.currentSpeedDivisor == 0 && index % 2 == 0)
                        
                                    {
                                    super.processAI(Canvas.UP)
velocityInterface!!.limitMaxXYVelocity(this.velocityInterface!!.getMaxForwardVelocity() /this.currentSpeedDivisor)

                                    }
                                
this.circularIndexUtil!!.next()

    
                        if(frame == angleIncrementInfo!!.LEFT_FRAME.toInt())
                        
                                    {
                                    super.processAI(Canvas.KEY_NUM0)

                                    }
                                
                             else 
    
                        if(frame == angleIncrementInfo!!.RIGHT_FRAME.toInt())
                        
                                    {
                                    super.processAI(Canvas.KEY_POUND)

                                    }
                                
}


open fun reverse()
        //nullable = true from not(false or (false and true)) = true
{
    var rotationAnimationInterface: RotationAnimationInterface = this.rotationAnimationInterface as RotationAnimationInterface


    var angleIncrementInfo: AngleIncrementInfo = rotationAnimationInterface!!.getAngleInfoP()!!.getAngleIncrementInfo()!!
            


    var frame: Int = this.rotationAnimationInterface!!.getFrame()!!
            


    
                        if(frame == angleIncrementInfo!!.LEFT_FRAME.toInt())
                        
                                    {
                                    
    var rotationAnimationInterfaceCompositeInterface: RotationAnimationInterfaceCompositeInterface = this.getOwnerLayerInterface() as RotationAnimationInterfaceCompositeInterface

rotationAnimationInterfaceCompositeInterface!!.setFrame(angleIncrementInfo!!.RIGHT_FRAME.toInt())
this.baseVelocityInterface!!.zero()

                                    }
                                
                             else 
    
                        if(frame == angleIncrementInfo!!.RIGHT_FRAME.toInt())
                        
                                    {
                                    
    var rotationAnimationInterfaceCompositeInterface: RotationAnimationInterfaceCompositeInterface = this.getOwnerLayerInterface() as RotationAnimationInterfaceCompositeInterface

rotationAnimationInterfaceCompositeInterface!!.setFrame(angleIncrementInfo!!.LEFT_FRAME.toInt())
this.baseVelocityInterface!!.zero()

                                    }
                                
}


open fun accelerate()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(currentSpeedDivisor > 1)
                        
                                    {
                                    currentSpeedDivisor--

                                    }
                                
}


open fun drop()
        //nullable = true from not(false or (false and true)) = true
{
    var ownerLayerInterface: AllBinaryLayer = this.getOwnerLayerInterface()!!
            


    var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!
            


    var y: Int = ownerLayerInterface!!.getYP()!!
            


    
                        if(ownerLayerInterface!!.getY2() +ownerLayerInterface!!.getHeight() > displayInfo!!.getLastHeight())
                        
                                    {
                                    y= 0

                                    }
                                
                        else {
                            y += ownerLayerInterface!!.getHeight() +1

                        }
                            
ownerLayerInterface!!.setPosition(ownerLayerInterface!!.getXP(), y, ownerLayerInterface!!.getZP())
}

override fun getId()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ArtificialIntelligenceTransitionInterface.ID
}


}
                
            

