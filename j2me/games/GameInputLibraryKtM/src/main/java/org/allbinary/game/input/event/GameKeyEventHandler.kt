
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
        package org.allbinary.game.input.event




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.util.event.EventListenerInterface
import org.allbinary.string.CommonStrings

open public class GameKeyEventHandler
            : Object
         {
        

        companion object {
            
    private val instance: GameKeyEventHandler = GameKeyEventHandler()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameKeyEventHandler{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val pressGameKeyEventHandler: PressGameKeyEventHandler = PressGameKeyEventHandler.getInstance()!!

    private val upGameKeyEventHandler: UpGameKeyEventHandler = UpGameKeyEventHandler.getInstance()!!

    private val downGameKeyEventHandler: DownGameKeyEventHandler = DownGameKeyEventHandler.getInstance()!!
@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun removeAllListeners()
        //nullable = true from not(false or (false and true)) = true
{
this.pressGameKeyEventHandler!!.removeAllListeners()
this.upGameKeyEventHandler!!.removeAllListeners()
this.downGameKeyEventHandler!!.removeAllListeners()
}


open fun addListener(eventListenerInterface: EventListenerInterface, playerInputId: Int)
        //nullable = true from not(false or (false and false)) = true
{
var eventListenerInterface = eventListenerInterface
var playerInputId = playerInputId
logUtil!!.put(eventListenerInterface!!.toString(), this, commonStrings!!.ADD_LISTENER)
this.pressGameKeyEventHandler!!.addListenerSingleThreaded(eventListenerInterface)
this.upGameKeyEventHandler!!.getInstanceForPlayer(playerInputId)!!.addListenerSingleThreaded(eventListenerInterface)
this.downGameKeyEventHandler!!.getInstanceForPlayer(playerInputId)!!.addListenerSingleThreaded(eventListenerInterface)
}


open fun addListener(eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{
var eventListenerInterface = eventListenerInterface
logUtil!!.put(eventListenerInterface!!.toString(), this, commonStrings!!.ADD_LISTENER)
this.pressGameKeyEventHandler!!.addListenerSingleThreaded(eventListenerInterface)
this.upGameKeyEventHandler!!.addListenerSingleThreaded(eventListenerInterface)
this.downGameKeyEventHandler!!.addListenerSingleThreaded(eventListenerInterface)
}


open fun removeListener(eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{
var eventListenerInterface = eventListenerInterface
logUtil!!.put(eventListenerInterface!!.toString(), this, commonStrings!!.REMOVE_LISTENER)
this.pressGameKeyEventHandler!!.removeListenerSingleThreaded(eventListenerInterface)
this.upGameKeyEventHandler!!.removeListenerSingleThreaded(eventListenerInterface)
this.downGameKeyEventHandler!!.removeListenerSingleThreaded(eventListenerInterface)
}


}
                
            

