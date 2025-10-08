
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
        package org.allbinary.game.ai.sequence




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.ai.ArtificialIntelligenceInterface
import org.allbinary.game.input.GameInput
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager

open public class NumberLayersSequenceAI : SequenceAI {
        

    private var numberOfLayersLeft: Int
public constructor (numberOfEnemiesLeft: Int, artificialIntelligenceInterface: Array<ArtificialIntelligenceInterface?>, ownerLayerInterface: AllBinaryLayer, gameInput: GameInput)                        

                            : super(artificialIntelligenceInterface, ownerLayerInterface, gameInput){
var numberOfEnemiesLeft = numberOfEnemiesLeft
var artificialIntelligenceInterface = artificialIntelligenceInterface
var ownerLayerInterface = ownerLayerInterface
var gameInput = gameInput


                            //For kotlin this is before the body of the constructor.
                    
this.numberOfLayersLeft= numberOfEnemiesLeft
}


                @Throws(Exception::class)
            
    override fun processAI(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
var allBinaryLayerManager = allBinaryLayerManager

    
                        if(this.getIndex() == 0)
                        
                                    {
                                    
    
                        if(allBinaryLayerManager!!.getSize() < this.numberOfLayersLeft)
                        
                                    {
                                    this.setIndex(1)

                                    }
                                

                                    }
                                
super.processAI(allBinaryLayerManager)
}


}
                
            

