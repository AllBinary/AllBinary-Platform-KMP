
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
        package org.allbinary.game.configuration.event




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventListenerInterface
import org.allbinary.logic.util.event.handler.BasicEventHandler

open public class GameFeatureEventHandler : BasicEventHandler {
        

        companion object {
            
    private val gameKeyEventHandler: GameFeatureEventHandler = GameFeatureEventHandler()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameFeatureEventHandler{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GameFeatureEventHandler.gameKeyEventHandler
}


        }
            private constructor        (){}


                @Throws(Exception::class)
            override fun process(eventObject: AllBinaryEventObject, eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var eventObject = eventObject


                    var eventListenerInterface = eventListenerInterface

    var gameFeatureListenerInterface: GameFeatureListenerInterface = (eventListenerInterface as GameFeatureListenerInterface)

gameFeatureListenerInterface!!.onGameFeatureChange(eventObject as GameFeatureEvent)
}


}
                
            

