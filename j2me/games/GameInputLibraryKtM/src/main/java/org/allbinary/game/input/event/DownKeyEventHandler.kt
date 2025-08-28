
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
        
import org.allbinary.game.input.LocalPlayerInputIdFactory
import org.allbinary.logic.util.event.EventListenerInterface

open public class DownKeyEventHandler : DownKeyEventHandlerBase {
        

        companion object {
            
    private val instance: DownKeyEventHandler = DownKeyEventHandler()

    private val instanceArray: Array<DownKeyEventHandlerBase?> = arrayOf(DownKeyEventHandlerBase(),DownKeyEventHandlerBase(),DownKeyEventHandlerBase(),DownKeyEventHandlerBase(),DownKeyEventHandlerBase(),DownKeyEventHandlerBase())

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: DownKeyEventHandler

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private val playerInputIdFactory: LocalPlayerInputIdFactory = LocalPlayerInputIdFactory.getInstance()!!

open fun getInstance(deviceId: Int)
        //nullable =  from not(true or (false and false)) = 
: DownKeyEventHandlerBase

        Updates for KMP build        
        {
var deviceId = deviceId

    var playerInputId: Int = playerInputIdFactory!!.getPlayerForDevice(deviceId)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instanceArray[playerInputId]!!
}


open fun getInstanceForPlayer(playerInputId: Int)
        //nullable = true from not(false or (false and false)) = true
: DownKeyEventHandlerBase

        Updates for KMP build        
        {
var playerInputId = playerInputId



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instanceArray[playerInputId]!!
}

private constructor        ()

        Updates for KMP build        
        {
}

override fun removeAllListeners()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
super.removeAllListeners()




                        for (index in instanceArray!!.size -1 downTo 0)

        

        Updates for KMP build        
        {
instanceArray[index]!!.removeAllListeners()
}

}

override fun removeListenerSingleThreaded(eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var eventListenerInterface = eventListenerInterface
super.removeListenerSingleThreaded(eventListenerInterface)




                        for (index in instanceArray!!.size -1 downTo 0)

        

        Updates for KMP build        
        {
instanceArray[index]!!.removeListenerSingleThreaded(eventListenerInterface)
}

}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
override fun removeListener(eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var eventListenerInterface = eventListenerInterface
super.removeListener(eventListenerInterface)




                        for (index in instanceArray!!.size -1 downTo 0)

        

        Updates for KMP build        
        {
instanceArray[index]!!.removeListener(eventListenerInterface)
}

}


}
                
            

