
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
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.logic.math.BasicDecimal

open public class UpDownVectorAI : BasicAI {
        

    private var velocityInterface: BasicVelocityProperties

    private var index: Int = 0
public constructor        (ownerLayerInterface: AllBinaryLayer, gameInput: GameInput)                        

                            : super(ownerLayerInterface, gameInput)

        Updates for KMP build        
        {
var ownerLayerInterface = ownerLayerInterface
var gameInput = gameInput


                            //For kotlin this is before the body of the constructor.
                    

    var velocityInterfaceCompositeInterface: VelocityInterfaceCompositeInterface = this.getOwnerLayerInterface() as VelocityInterfaceCompositeInterface

this.velocityInterface= velocityInterfaceCompositeInterface!!.getVelocityProperties()
this.velocityInterface!!.getVelocityYBasicDecimalP()!!.set(0)
}


                @Throws(Exception::class)
            override fun processAI(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var allBinaryLayerManager = allBinaryLayerManager

    var y: Int = this.getOwnerLayerInterface()!!.getHeight() *270


    
                        if(this.index < 5)
                        
                                    {
                                    
    var basicDecimal: BasicDecimal = this.velocityInterface!!.getVelocityYBasicDecimalP()!!

basicDecimal!!.set(0)
basicDecimal!!.add(y)
this.index++

                                    }
                                
                             else 
    
                        if(this.index < 10)
                        
                                    {
                                    
    var basicDecimal: BasicDecimal = this.velocityInterface!!.getVelocityYBasicDecimalP()!!

basicDecimal!!.set(0)
basicDecimal!!.subtract(y)
this.index++

                                    }
                                
                        else {
                            this.index= 0
this.processAI(allBinaryLayerManager)

                        }
                            
}


}
                
            

