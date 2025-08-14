
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
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager

open public class ScrollOverAtEndAI : BasicAI {
        
public constructor        (ownerLayerInterface: AllBinaryLayer, gameInput: GameInput)                        

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
            


    var x: Int = ownerLayerInterface!!.getXP()!!
            


    var y: Int = ownerLayerInterface!!.getYP()!!
            


    var width: Int = ownerLayerInterface!!.getWidth()!!
            


    var height: Int = ownerLayerInterface!!.getHeight()!!
            


    var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!
            


    
                        if(x > displayInfo!!.getLastWidth())
                        
                                    {
                                    ownerLayerInterface!!.setPosition(0, y, ownerLayerInterface!!.getZP())

                                    }
                                

    
                        if(y > displayInfo!!.getLastHeight())
                        
                                    {
                                    ownerLayerInterface!!.setPosition(x, 0, ownerLayerInterface!!.getZP())

                                    }
                                

    
                        if(x <  -width)
                        
                                    {
                                    ownerLayerInterface!!.setPosition(displayInfo!!.getLastWidth() -width, y, ownerLayerInterface!!.getZP())

                                    }
                                

    
                        if(y <  -height)
                        
                                    {
                                    ownerLayerInterface!!.setPosition(x, displayInfo!!.getLastHeight() -height, ownerLayerInterface!!.getZP())

                                    }
                                
}


}
                
            

