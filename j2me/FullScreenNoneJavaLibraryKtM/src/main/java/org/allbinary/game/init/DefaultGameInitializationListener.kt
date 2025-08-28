
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
        package org.allbinary.game.init




        import java.lang.Object        
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.configuration.event.GameInitializedEvent
import org.allbinary.game.configuration.event.GameInitializedEventHandler
import org.allbinary.game.configuration.event.GameInitializedListenerInterface
import org.allbinary.game.resource.FeatureResourceInitializationUtil
import org.allbinary.graphics.threed.SWTJOGLProcessor
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.string.CommonStrings

open public class DefaultGameInitializationListener
            : Object
        
                , GameInitializedListenerInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val swtJOGLProcessor: SWTJOGLProcessor = SWTJOGLProcessor.getInstance()!!
public constructor        ()
            : super()
        {

    var gameInitializedEventHandler: GameInitializedEventHandler = GameInitializedEventHandler.getInstance()!!

gameInitializedEventHandler!!.removeAllListeners()
gameInitializedEventHandler!!.addListener(this as GameInitializedListenerInterface)
}

override fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{
    //var eventObject = eventObject
ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}


    var firstTime: Boolean = true
override fun onGameInitialized(gameInitializedEvent: GameInitializedEvent)
        //nullable = true from not(false or (false and false)) = true
{
    //var gameInitializedEvent = gameInitializedEvent

    var ON_GAME_INITIALIZED: String = "onGameInitialized"


    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


        try {
            logUtil!!.put(commonStrings!!.START, this, ON_GAME_INITIALIZED)

        while(!swtJOGLProcessor!!.glHolder!!.isCreated)
        {
logUtil!!.put(commonStrings!!.UPDATE, this, ON_GAME_INITIALIZED)
Thread.sleep(20)
}

FeatureResourceInitializationUtil.getInstance()!!.init(gameInitializedEvent!!.getLevel())

    
                        if(firstTime)
                        
                                    {
                                    firstTime= false

                                    }
                                
                        else {
                            swtJOGLProcessor!!.onSurfaceChanged()

                        }
                            
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, ON_GAME_INITIALIZED, e)
}

}


}
                
            

