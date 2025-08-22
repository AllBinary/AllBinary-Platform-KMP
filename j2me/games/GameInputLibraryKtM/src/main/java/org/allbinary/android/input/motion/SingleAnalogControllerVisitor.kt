
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
        package org.allbinary.android.input.motion




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.analog.AnalogLocationInput
import org.allbinary.game.input.analog.AnalogLocationInputFactory
import org.allbinary.layer.AllBinaryLayerManager

open public class SingleAnalogControllerVisitor : AnalogControllerVisitor {
        

    private val playerInputId: Int
public constructor        (playerInputId: Int){

                    var playerInputId = playerInputId
this.playerInputId= playerInputId
}

override fun process(allbinaryLayerManager: AllBinaryLayerManager, analogLocationInputProcessor: AnalogLocationInputProcessor)
        //nullable = true from not(false or (false and false)) = true
{

                    var allbinaryLayerManager = allbinaryLayerManager


                    var analogLocationInputProcessor = analogLocationInputProcessor

    var analogLocationInput: AnalogLocationInput = AnalogLocationInputFactory.getInstance()!!.getInstance(playerInputId)!!

analogLocationInputProcessor!!.process(allbinaryLayerManager, analogLocationInput)
}


}
                
            

