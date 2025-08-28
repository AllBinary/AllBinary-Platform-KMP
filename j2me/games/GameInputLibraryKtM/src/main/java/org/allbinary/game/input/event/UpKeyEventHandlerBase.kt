
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
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.PlayerGameInput
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.util.event.EventListenerInterface
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.logic.util.event.handler.BasicEventHandler
import org.allbinary.util.BasicArrayList

open public class UpKeyEventHandlerBase : BasicEventHandler {
        

        companion object {
            
    private val TOTAL_LISTENERS: String = " Total PlayerGameInput Listeners: "

    private val LISTENER_LABEL: String = " PlayerGameInput Listener: "

        }
            
    private val list: BasicArrayList = BasicArrayList()
 constructor        ()

        Updates for KMP build        
        {
}


open fun addListener(playerGameInput: PlayerGameInput)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var playerGameInput = playerGameInput

    
                        if(!list.contains(playerGameInput))
                        
                                    {
                                    list.add(playerGameInput)

                                    }
                                
}

override fun removeAllListeners()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.list.clear()
super.removeAllListeners()
}

override fun removeListenerSingleThreaded(eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var eventListenerInterface = eventListenerInterface
this.list.remove(eventListenerInterface)
super.removeListenerSingleThreaded(eventListenerInterface)
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
override fun removeListener(eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var eventListenerInterface = eventListenerInterface
this.list.remove(eventListenerInterface)
super.removeListener(eventListenerInterface)
}


                @Throws(Exception::class)
            
open fun fireEvent(eventObject: Integer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var eventObject = eventObject




                        for (index in this.list.size()!!  - 1  downTo 0)

        

        Updates for KMP build        
        {

        try {
            
    var playerGameInput: PlayerGameInput = this.list.objectArray[index]!! as PlayerGameInput

playerGameInput!!.onUpKeyEvent(eventObject)
} catch(e: Exception)
            

        Updates for KMP build        
        {
logUtil!!.put(commonStrings!!.EXCEPTION, this, EventStrings.getInstance()!!.FIRE_EVENT, e)
}

}


    var index: Int = 0


    var eventListenerInterface: EventListenerInterface


        while(index < this.eventListenerInterfaceList!!.size())
        

        Updates for KMP build        
        {

        try {
            eventListenerInterface= this.eventListenerInterfaceList!!.get(index) as EventListenerInterface
this.process(eventObject, eventListenerInterface)
} catch(e: Exception)
            

        Updates for KMP build        
        {
logUtil!!.put(commonStrings!!.EXCEPTION, this, EventStrings.getInstance()!!.FIRE_EVENT, e)
}

index++
}

}


                @Throws(Exception::class)
            
open fun process(eventObject: Integer, eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var eventObject = eventObject
    //var eventListenerInterface = eventListenerInterface

    var upKeyEventListenerInterface: UpKeyEventListenerInterface = eventListenerInterface as UpKeyEventListenerInterface

upKeyEventListenerInterface!!.onUpKeyEvent(eventObject)
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        {

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(super.toString())
stringBuffer!!.append(TOTAL_LISTENERS)
stringBuffer!!.append(this.list.size())




                        for (index in 0 until this.list.size()!!)

        

        Updates for KMP build        
        {

        try {
            
    var eventListenerInterface: EventListenerInterface = this.list.get(index) as EventListenerInterface

stringBuffer!!.append(LISTENER_LABEL)
stringBuffer!!.append(eventListenerInterface!!.toString())
} catch(e: Exception)
            

        Updates for KMP build        
        {
logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.TOSTRING, e)
}

}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

