
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.animation.IndexedAnimation
import org.allbinary.animation.RotationAnimationInterface
import org.allbinary.animation.RotationAnimationInterfaceCompositeInterface
import org.allbinary.game.ai.tactical.LurchAI
import org.allbinary.game.input.GameInput
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.math.AngleIncrementInfo

open public class LurchRotationAI : LurchAI {
        

    private var rotationAnimationInterface: IndexedAnimation
public constructor        (ownerLayerInterface: AllBinaryLayer, gameInput: GameInput)                        

                            : super(ownerLayerInterface, gameInput){
var ownerLayerInterface = ownerLayerInterface
var gameInput = gameInput


                            //For kotlin this is before the body of the constructor.
                    

    var rotationAnimationInterfaceCompositeInterface: RotationAnimationInterfaceCompositeInterface = this.getOwnerLayerInterface() as RotationAnimationInterfaceCompositeInterface

this.rotationAnimationInterface= rotationAnimationInterfaceCompositeInterface!!.getRotationAnimationInterface()
this.update()
}

override fun reverse()
        //nullable = true from not(false or (false and true)) = true
{
super.reverse()
this.update()
}


open fun update()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(currentRelativeAngle == 0)
                        
                                    {
                                    
    var rotationAnimationInterface: RotationAnimationInterface = this.rotationAnimationInterface as RotationAnimationInterface


    var angleIncrementInfo: AngleIncrementInfo = rotationAnimationInterface!!.getAngleInfoP()!!.getAngleIncrementInfo()!!


    var rotationAnimationInterfaceCompositeInterface: RotationAnimationInterfaceCompositeInterface = this.getOwnerLayerInterface() as RotationAnimationInterfaceCompositeInterface

rotationAnimationInterfaceCompositeInterface!!.setFrame(angleIncrementInfo!!.RIGHT_FRAME.toInt())

                                    }
                                
                             else 
    
                        if(currentRelativeAngle == 180)
                        
                                    {
                                    
    var rotationAnimationInterface: RotationAnimationInterface = this.rotationAnimationInterface as RotationAnimationInterface


    var angleIncrementInfo: AngleIncrementInfo = rotationAnimationInterface!!.getAngleInfoP()!!.getAngleIncrementInfo()!!


    var rotationAnimationInterfaceCompositeInterface: RotationAnimationInterfaceCompositeInterface = this.getOwnerLayerInterface() as RotationAnimationInterfaceCompositeInterface

rotationAnimationInterfaceCompositeInterface!!.setFrame(angleIncrementInfo!!.LEFT_FRAME.toInt())

                                    }
                                
}


}
                
            

