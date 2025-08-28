
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
        
import org.allbinary.logic.util.event.AllBinaryEventCircularPool

open public class TerrainEventCircularStaticPool
            : Object
         {
        

        companion object {
            
    private val instance: TerrainEventCircularStaticPool = TerrainEventCircularStaticPool()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TerrainEventCircularStaticPool{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private var EVENT_POOL: AllBinaryEventCircularPool = AllBinaryEventCircularPool(20)

open fun init()
        //nullable = true from not(false or (false and true)) = true
{
EVENT_POOL.init(TerrainEventFactory())
}


                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun getInstance(basicTerrainInfo: BasicTerrainInfo)
        //nullable =  from not(true or (false and false)) = 
: TerrainEvent{
var basicTerrainInfo = basicTerrainInfo

    var trackingEvent: TerrainEvent = EVENT_POOL.getNextInstance() as TerrainEvent

trackingEvent!!.setBasicTerrainInfoForCircularStaticPool(basicTerrainInfo)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return trackingEvent
}


}
                
            

