
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
        package org.allbinary.game.terrain




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.logic.NullUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventListenerInterface
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.logic.util.event.handler.BasicEventHandler
import org.allbinary.util.BasicArrayList

open public class TerrainEventHandler : BasicEventHandler {
        
companion object {
            
    private var hashtable: Hashtable<Any, Any> = NullUtil.getInstance()!!.NULL_TABLE

    open fun init()
        //nullable = true from not(false or (false and true)) = true
{
TerrainEventHandler.hashtable= Hashtable<Any, Any>()
}


    open fun getInstance(anyType: Any)
        //nullable =  from not(true or (false and false)) = 
: TerrainEventHandler{
    //var anyType = anyType

    var eventHandlerCanBeNull: Any? = TerrainEventHandler.hashtable.get(anyType as Object)


    
                        if(eventHandlerCanBeNull == 
                                    null
                                )
                        
                                    {
                                    eventHandlerCanBeNull= TerrainEventHandler()
TerrainEventHandler.hashtable.put(anyType, eventHandlerCanBeNull)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return eventHandlerCanBeNull as TerrainEventHandler
}


        }
            
    private val list: BasicArrayList = BasicArrayList()
private constructor (){
}


    open fun addListener(terrainEventListener: TerrainEventListener)
        //nullable = true from not(false or (false and false)) = true
{
    //var terrainEventListener = terrainEventListener

    
                        if(!list.contains(terrainEventListener))
                        
                                    {
                                    list.add(terrainEventListener)

                                    }
                                
}


    override fun removeAllListeners()
        //nullable = true from not(false or (false and true)) = true
{
this.list.clear()
super.removeAllListeners()
}


    override fun removeListener(eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var eventListenerInterface = eventListenerInterface
this.list.remove(eventListenerInterface)
super.removeListener(eventListenerInterface)
}


                @Throws(Exception::class)
            
    override fun fireEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{
    //var eventObject = eventObject




                        for (index in this.list.size()!!  - 1  downTo 0)

        {

        try {
            
    var terrainEventListener: TerrainEventListener = this.list.get(index) as TerrainEventListener

terrainEventListener!!.onTerrainEvent(eventObject as TerrainEvent)
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, EventStrings.getInstance()!!.FIRE_EVENT, e)
}

}

super.fireEvent(eventObject)
}


                @Throws(Exception::class)
            
    override fun process(eventObject: AllBinaryEventObject, eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var eventObject = eventObject
    //var eventListenerInterface = eventListenerInterface

    var terrainEventListenerInterface: TerrainEventListenerInterface = eventListenerInterface as TerrainEventListenerInterface

terrainEventListenerInterface!!.onTerrainEvent(eventObject as TerrainEvent)
}


}
                
            

