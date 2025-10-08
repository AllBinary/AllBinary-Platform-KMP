
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
        
import org.allbinary.game.displayable.canvas.AllBinaryGameCanvas
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.logic.util.event.AllBinaryEventCircularPool

open public class DestroyEventCircularStaticPool
            : Object
         {
        
companion object {
            
    private val instance: DestroyEventCircularStaticPool = DestroyEventCircularStaticPool()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: DestroyEventCircularStaticPool{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private var EVENT_POOL: AllBinaryEventCircularPool = AllBinaryEventCircularPool(20)
private constructor ()
            : super()
        {
}


    open fun init(combatGameCanvas: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true
{
var combatGameCanvas = combatGameCanvas
EVENT_POOL.init(DestroyEventFactory(combatGameCanvas))
}


                @Throws(Exception::class)
            
    open fun getInstance(layerInterface: AllBinaryLayer)
        //nullable =  from not(true or (false and false)) = 
: DestroyedEvent{
var layerInterface = layerInterface

    var destroyedEvent: DestroyedEvent = EVENT_POOL.getNextInstance() as DestroyedEvent

destroyedEvent!!.setLayerInterfaceForCircularStaticPool(layerInterface)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return destroyedEvent
}


}
                
            

