
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
        package org.allbinary.game.layer.hud.event



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventListenerInterface
import org.allbinary.logic.util.event.NullEventListener
import org.allbinary.logic.util.event.handler.BasicEventHandler
import org.allbinary.util.BasicArrayList

open public class GameNotificationEventHandler : BasicEventHandler {
        

        companion object {


    private val instance: GameNotificationEventHandler = GameNotificationEventHandler()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameNotificationEventHandler{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            private constructor        (){}


    var enabled: Boolean = true
override fun removeAllListeners()
        //nullable = true from not(false or (false and true)) = true
{
    var eventListenerInterface: EventListenerInterface = NullEventListener.NULL_EVENT_LISTENER


    var list: BasicArrayList = this.eventListenerInterfaceList


    
                        if(list!!.size() > 0)
                        
                                    {
                                    eventListenerInterface= list!!.objectArray[0]!! as EventListenerInterface

                                    }
                                
super.removeAllListeners()

    
                        if(eventListenerInterface != 
                                    null
                                )
                        
                                    {
                                    this.addListener(eventListenerInterface)

                                    }
                                
}


                @Throws(Exception::class)
            override fun process(eventObject: AllBinaryEventObject, eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var eventObject = eventObject


                    var eventListenerInterface = eventListenerInterface

    
                        if(!enabled)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    var gameNotificationListenerInterface: GameNotificationListenerInterface = eventListenerInterface as GameNotificationListenerInterface

gameNotificationListenerInterface!!.onGameNotificationEvent(eventObject as GameNotificationEvent)
}


}
                
            

