
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

open public class ComboSequenceAI : SequenceAI {
        
public constructor (artificialIntelligenceInterface: Array<ArtificialIntelligenceInterface?>, ownerLayerInterface: AllBinaryLayer, gameInput: GameInput)                        

                            : super(artificialIntelligenceInterface, ownerLayerInterface, gameInput){
var artificialIntelligenceInterface = artificialIntelligenceInterface
var ownerLayerInterface = ownerLayerInterface
var gameInput = gameInput


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
    override fun processAI(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
var allBinaryLayerManager = allBinaryLayerManager

    var artificialIntelligenceInterfaceArray: Array<ArtificialIntelligenceInterface?> = this.getArtificialIntelligenceInterface()!!


    var size: Int = artificialIntelligenceInterfaceArray!!.size
                





                        for (index in 0 until size)

        {
this.setIndex(index)
super.processAI(allBinaryLayerManager)
}

}


}
                
            

