
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
        
import org.allbinary.game.input.GameInput
import org.allbinary.game.physics.velocity.BasicVelocityProperties
import org.allbinary.game.physics.velocity.VelocityInterfaceCompositeInterface
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager

open public class StopAtEdgeAI : BasicAI {
        
public constructor (ownerLayerInterface: AllBinaryLayer, gameInput: GameInput)                        

                            : super(ownerLayerInterface, gameInput){
var ownerLayerInterface = ownerLayerInterface
var gameInput = gameInput


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
    override fun processAI(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
var allBinaryLayerManager = allBinaryLayerManager

    var ownerLayerInterface: AllBinaryLayer = this.getOwnerLayerInterface()!!


    var velocityInterfaceCompositeInterface: VelocityInterfaceCompositeInterface = (ownerLayerInterface as VelocityInterfaceCompositeInterface)


    var velocityProperties: BasicVelocityProperties = velocityInterfaceCompositeInterface!!.getVelocityProperties()!!


    var x: Int = ownerLayerInterface!!.getXP()!!


    var y: Int = ownerLayerInterface!!.getYP()!!


    var x2: Int = ownerLayerInterface!!.getX2()!!


    var y2: Int = ownerLayerInterface!!.getY2()!!


    var width: Int = ownerLayerInterface!!.getWidth()!!


    var height: Int = ownerLayerInterface!!.getHeight()!!


    var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!


    
                        if(x2 +velocityProperties!!.getVelocityXBasicDecimalP()!!.getScaled() > displayInfo!!.getLastWidth())
                        
                                    {
                                    ownerLayerInterface!!.setPosition(displayInfo!!.getLastWidth() -width, y, ownerLayerInterface!!.getZP())
velocityProperties!!.getVelocityYBasicDecimalP()!!.set(0)

                                    }
                                

    
                        if(y2 +velocityProperties!!.getVelocityYBasicDecimalP()!!.getScaled() > displayInfo!!.getLastHeight())
                        
                                    {
                                    ownerLayerInterface!!.setPosition(x, displayInfo!!.getLastHeight() -height, ownerLayerInterface!!.getZP())
velocityProperties!!.getVelocityXBasicDecimalP()!!.set(0)

                                    }
                                

    
                        if(x +velocityProperties!!.getVelocityXBasicDecimalP()!!.getScaled() < 0)
                        
                                    {
                                    ownerLayerInterface!!.setPosition(0, y, ownerLayerInterface!!.getZP())
velocityProperties!!.getVelocityYBasicDecimalP()!!.set(0)

                                    }
                                

    
                        if(y +velocityProperties!!.getVelocityYBasicDecimalP()!!.getScaled() < 0)
                        
                                    {
                                    ownerLayerInterface!!.setPosition(x, 0, ownerLayerInterface!!.getZP())
velocityProperties!!.getVelocityXBasicDecimalP()!!.set(0)

                                    }
                                
}


}
                
            

