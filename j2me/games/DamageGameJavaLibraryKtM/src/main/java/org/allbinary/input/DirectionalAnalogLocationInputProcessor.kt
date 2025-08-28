
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
        package org.allbinary.input




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.android.input.motion.AnalogLocationInputProcessor
import org.allbinary.game.input.GameInputProcessor
import org.allbinary.game.input.GameKeyEventSourceInterface
import org.allbinary.game.input.GameKeyFactory
import org.allbinary.game.input.analog.AnalogLocationInput
import org.allbinary.game.input.event.GameKeyEvent
import org.allbinary.game.input.event.GameKeyEventFactory
import org.allbinary.graphics.CustomGPoint
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class DirectionalAnalogLocationInputProcessor : AnalogLocationInputProcessor
                , GameKeyEventSourceInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val inputProcessorArray: Array<GameInputProcessor?>

    private val gameKeyFactory: GameKeyFactory = GameKeyFactory.getInstance()!!

    private var leftGameKeyEvent: GameKeyEvent = GameKeyEvent.NONE

    private var rightGameKeyEvent: GameKeyEvent = GameKeyEvent.NONE

    private var upGameKeyEvent: GameKeyEvent = GameKeyEvent.NONE

    private var downGameKeyEvent: GameKeyEvent = GameKeyEvent.NONE

    private var leftTriggerGameKeyEvent: GameKeyEvent = GameKeyEvent.NONE

    private var rightTriggerGameKeyEvent: GameKeyEvent = GameKeyEvent.NONE
public constructor        (inputProcessorArray: Array<GameInputProcessor?>){
var inputProcessorArray = inputProcessorArray
this.inputProcessorArray= inputProcessorArray

        try {
            this.leftGameKeyEvent= GameKeyEventFactory.getInstance()!!.getInstance(this, gameKeyFactory!!.LEFT)
this.rightGameKeyEvent= GameKeyEventFactory.getInstance()!!.getInstance(this, gameKeyFactory!!.RIGHT)
this.upGameKeyEvent= GameKeyEventFactory.getInstance()!!.getInstance(this, gameKeyFactory!!.UP)
this.downGameKeyEvent= GameKeyEventFactory.getInstance()!!.getInstance(this, gameKeyFactory!!.DOWN)
this.leftTriggerGameKeyEvent= GameKeyEventFactory.getInstance()!!.getInstance(this, gameKeyFactory!!.KEY_NUM0)
this.rightTriggerGameKeyEvent= GameKeyEventFactory.getInstance()!!.getInstance(this, gameKeyFactory!!.KEY_NUM5)
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CONSTRUCTOR, e)
}

}

override fun process(allbinaryLayerManager: AllBinaryLayerManager, analogLocationInput: AnalogLocationInput)
        //nullable = true from not(false or (false and false)) = true
{
var allbinaryLayerManager = allbinaryLayerManager
var analogLocationInput = analogLocationInput

        try {
            
    var customGPoint: CustomGPoint

customGPoint= analogLocationInput!!.getCustomGPoint()

    var x: Int = customGPoint!!.getX()!!


    var y: Int = customGPoint!!.getY()!!


    var leftTrigger: Int = analogLocationInput!!.getLeftTrigger()!!


    var rightTrigger: Int = analogLocationInput!!.getRightTrigger()!!


    
                        if(x < 0)
                        
                                    {
                                    inputProcessorArray[this.leftGameKeyEvent!!.getKey()]!!.process(allbinaryLayerManager, this.leftGameKeyEvent, x)

                                    }
                                
                             else 
    
                        if(x > 0)
                        
                                    {
                                    inputProcessorArray[this.rightGameKeyEvent!!.getKey()]!!.process(allbinaryLayerManager, this.rightGameKeyEvent, x)

                                    }
                                

    
                        if(y < 0)
                        
                                    {
                                    inputProcessorArray[this.downGameKeyEvent!!.getKey()]!!.process(allbinaryLayerManager, this.downGameKeyEvent, y)

                                    }
                                
                             else 
    
                        if(y > 0)
                        
                                    {
                                    inputProcessorArray[this.upGameKeyEvent!!.getKey()]!!.process(allbinaryLayerManager, this.upGameKeyEvent, y)

                                    }
                                

    
                        if(leftTrigger > 0)
                        
                                    {
                                    inputProcessorArray[this.leftTriggerGameKeyEvent!!.getKey()]!!.process(allbinaryLayerManager, this.leftTriggerGameKeyEvent, leftTrigger)

                                    }
                                

    
                        if(rightTrigger > 0)
                        
                                    {
                                    inputProcessorArray[this.rightTriggerGameKeyEvent!!.getKey()]!!.process(allbinaryLayerManager, this.rightTriggerGameKeyEvent, rightTrigger)

                                    }
                                
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put("Unable to process analog input", this, commonStrings!!.PROCESS, e)
}

}

override fun getSourceId()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


}
                
            

