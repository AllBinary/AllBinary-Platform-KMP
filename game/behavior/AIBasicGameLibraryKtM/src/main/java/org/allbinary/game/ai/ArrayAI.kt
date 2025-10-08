
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
        
import org.allbinary.ai.ArtificialIntelligenceInterface
import org.allbinary.game.input.GameInput
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager

open public class ArrayAI : BasicAI {
        

    private val artificialIntelligenceInterfaceArray: Array<ArtificialIntelligenceInterface?>
public constructor (artificialIntelligenceInterface: Array<ArtificialIntelligenceInterface?>, ownerLayerInterface: AllBinaryLayer, gameInput: GameInput)                        

                            : super(ownerLayerInterface, gameInput){
var artificialIntelligenceInterface = artificialIntelligenceInterface
var ownerLayerInterface = ownerLayerInterface
var gameInput = gameInput


                            //For kotlin this is before the body of the constructor.
                    
this.artificialIntelligenceInterfaceArray= artificialIntelligenceInterface
}


                @Throws(Exception::class)
            
    override fun processAI(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
var allBinaryLayerManager = allBinaryLayerManager

    var size: Int = this.artificialIntelligenceInterfaceArray!!.size
                





                        for (index in 0 until size)

        {
this.artificialIntelligenceInterfaceArray[index]!!.processAI(allBinaryLayerManager)
}

}


    open fun getArtificialIntelligenceInterface()
        //nullable = true from not(false or (false and true)) = true
: Array<ArtificialIntelligenceInterface?>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return artificialIntelligenceInterfaceArray
}


}
                
            

