
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
        package org.allbinary.game.input.motion.action




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.CompleteMotionGestureInputEvent
import org.allbinary.game.input.CompleteMotionGestureInputEventListener
import org.allbinary.game.input.event.DownGameKeyEventHandler
import org.allbinary.game.input.event.GameKeyEvent
import org.allbinary.game.input.event.UpGameKeyEventHandler
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.string.CommonStrings

open public class GameKeyFromMotionGestureEventListener : CompleteMotionGestureInputEventListener {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var previousGameKeyEvent: GameKeyEvent = GameKeyEvent.NONE
override fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{

                    var eventObject = eventObject
ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}

override fun onCompleteMotionGestureInputEvent(completeMotionGestureInputEvent: CompleteMotionGestureInputEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var completeMotionGestureInputEvent = completeMotionGestureInputEvent

        try {
            
    var gameKeyCompleteMotionGestureInputEvent: GameKeyCompleteMotionGestureInputEvent = completeMotionGestureInputEvent as GameKeyCompleteMotionGestureInputEvent


    var gameKeyEvent: GameKeyEvent = gameKeyCompleteMotionGestureInputEvent!!.getGameKeyEvent()!!
            


    
                        if(gameKeyEvent != previousGameKeyEvent)
                        
                                    {
                                    
    
                        if(previousGameKeyEvent != GameKeyEvent.NONE)
                        
                                    {
                                    UpGameKeyEventHandler.getInstance()!!.fireEvent(previousGameKeyEvent)

                                    }
                                
previousGameKeyEvent= gameKeyEvent

    
                        if(gameKeyEvent != 
                                    null
                                 && gameKeyEvent != GameKeyEvent.NONE)
                        
                                    {
                                    DownGameKeyEventHandler.getInstance()!!.fireEvent(gameKeyEvent)

                                    }
                                

                                    }
                                
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, "onCompleteMotionGestureInputEvent", e)
}

}


}
                
            

