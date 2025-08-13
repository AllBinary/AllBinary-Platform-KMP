
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
        package org.allbinary.game.tracking



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.logic.util.event.AllBinaryEventCircularPool

open public class TrackingEventCircularStaticPool
            : Object
         {
        

        companion object {
            
    private var instance: TrackingEventCircularStaticPool = TrackingEventCircularStaticPool()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TrackingEventCircularStaticPool{


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
{EVENT_POOL.init(TrackingEventFactory())
}


                @Throws(Exception::class)
            
open fun getInstance(layerInterface: AllBinaryLayer)
        //nullable =  from not(true or (false and false)) = 
: TrackingEvent{

                    var layerInterface = layerInterface

    var trackingEvent: TrackingEvent = EVENT_POOL.getNextInstance() as TrackingEvent

trackingEvent!!.setLayerInterfaceForCircularStaticPool(layerInterface)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return trackingEvent
}


}
                
            

