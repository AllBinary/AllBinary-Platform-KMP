
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
        package org.allbinary.game.ai.tactical



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Canvas
import org.allbinary.game.ai.BasicAI
import org.allbinary.game.input.GameInput
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager

open public class HorizontalManeuverAI : BasicAI {
        

    var currentRelativeAngle: Int = 0

    private var currentSpeed: Int
public constructor        (ownerLayerInterface: AllBinaryLayer, gameInput: GameInput)                        

                            : super(ownerLayerInterface, gameInput){

                    var ownerLayerInterface = ownerLayerInterface


                    var gameInput = gameInput


                            //For kotlin this is before the body of the constructor.
                    
currentSpeed= 5
}


                @Throws(Exception::class)
            override fun processAI(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryLayerManager = allBinaryLayerManager

    var ownerLayerInterface: AllBinaryLayer = this.getOwnerLayerInterface()!!
            


    var x: Int = ownerLayerInterface!!.getXP()!!
            


    
                        if(ownerLayerInterface!!.getXP() -currentSpeed <= 0)
                        
                                    {
                                    this.reverse()
this.drop()

                                    }
                                

    
                        if(ownerLayerInterface!!.getX2() +currentSpeed > DisplayInfoSingleton.getInstance()!!.getLastWidth())
                        
                                    {
                                    this.reverse()
this.accelerate()
this.drop()

                                    }
                                

    
                        if(currentRelativeAngle == 0)
                        
                                    {
                                    x += (currentSpeed)

                                    }
                                
                             else 
    
                        if(currentRelativeAngle == 180)
                        
                                    {
                                    x -= (currentSpeed)

                                    }
                                
ownerLayerInterface!!.setPosition(x, ownerLayerInterface!!.getYP(), ownerLayerInterface!!.getZP())

    
                        if(currentRelativeAngle == 0)
                        
                                    {
                                    super.processAI(Canvas.KEY_NUM0)

                                    }
                                
                             else 
    
                        if(currentRelativeAngle == 180)
                        
                                    {
                                    super.processAI(Canvas.KEY_POUND)

                                    }
                                
}


open fun reverse()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(currentRelativeAngle == 180)
                        
                                    {
                                    currentRelativeAngle= 0

                                    }
                                
                             else 
    
                        if(currentRelativeAngle == 0)
                        
                                    {
                                    currentRelativeAngle= 180

                                    }
                                
}


open fun accelerate()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(currentSpeed < 20)
                        
                                    {
                                    currentSpeed++

                                    }
                                
}


open fun drop()
        //nullable = true from not(false or (false and true)) = true
{
    var ownerLayerInterface: AllBinaryLayer = this.getOwnerLayerInterface()!!
            


    var y: Int = ownerLayerInterface!!.getYP()!!
            


    
                        if(ownerLayerInterface!!.getY2() +ownerLayerInterface!!.getHeight() > DisplayInfoSingleton.getInstance()!!.getLastHeight())
                        
                                    {
                                    y= 0

                                    }
                                
                        else {
                            y += ownerLayerInterface!!.getHeight() +1

                        }
                            
ownerLayerInterface!!.setPosition(ownerLayerInterface!!.getXP(), y, ownerLayerInterface!!.getZP())
}


}
                
            

