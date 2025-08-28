
        /* Generated Code Do Not Modify */
        package org.allbinary.game.terrain




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.util.BasicArrayList

open public class TerrainEventListener
            : Object
        
                , TerrainEventListenerInterface {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val list: BasicArrayList = BasicArrayList()
override fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{
var eventObject = eventObject
ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}

override fun onTerrainEvent(terrainEvent: TerrainEvent)
        //nullable = true from not(false or (false and false)) = true
{
var terrainEvent = terrainEvent
this.list.clear()
this.list.add(terrainEvent)
}


open fun getList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list
}


}
                
            

