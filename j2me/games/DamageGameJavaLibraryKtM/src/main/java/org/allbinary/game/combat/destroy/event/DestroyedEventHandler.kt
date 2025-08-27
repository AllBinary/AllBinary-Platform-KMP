
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
        package org.allbinary.game.combat.destroy.event




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.special.CollidableDestroyableDamageableLayer
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventListenerInterface
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.logic.util.event.handler.BasicEventHandler
import org.allbinary.util.BasicArrayList

open public class DestroyedEventHandler : BasicEventHandler {
        

        companion object {
            
    private val instance: DestroyedEventHandler = DestroyedEventHandler()
@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: DestroyedEventHandler{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DestroyedEventHandler.instance
}


        }
            
    private val list: BasicArrayList = BasicArrayList()
private constructor        (){}


open fun addListener(collidableDestroyableDamageableLayer: CollidableDestroyableDamageableLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var collidableDestroyableDamageableLayer = collidableDestroyableDamageableLayer

    
                        if(!list.contains(collidableDestroyableDamageableLayer))
                        
                                    {
                                    list.add(collidableDestroyableDamageableLayer)

                                    }
                                
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
override fun removeAllListeners()
        //nullable = true from not(false or (false and true)) = true
{this.list.clear()
super.removeAllListeners()
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
override fun removeListener(eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var eventListenerInterface = eventListenerInterface
this.list.remove(eventListenerInterface)
super.removeListener(eventListenerInterface)
}


                @Throws(Exception::class)
            override fun fireEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{

                    var eventObject = eventObject




                        for (index in this.list.size()!!  - 1  downTo 0)

        {
        try {
            
    var collidableDestroyableDamageableLayer: CollidableDestroyableDamageableLayer = this.list.objectArray[index]!! as CollidableDestroyableDamageableLayer

collidableDestroyableDamageableLayer!!.onDestroyed(eventObject as DestroyedEvent)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, EventStrings.getInstance()!!.FIRE_EVENT, e)
}

}

super.fireEvent(eventObject)
}


                @Throws(Exception::class)
            override fun process(eventObject: AllBinaryEventObject, eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var eventObject = eventObject


                    var eventListenerInterface = eventListenerInterface

    var destroyedEventListenerInterface: DestroyedEventListenerInterface = eventListenerInterface as DestroyedEventListenerInterface

destroyedEventListenerInterface!!.onDestroyed(eventObject as DestroyedEvent)
}


}
                
            

