
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
        package org.allbinary.game.combat.destroy




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.combat.destroy.event.DestroyEventCircularStaticPool
import org.allbinary.game.combat.destroy.event.DestroyedEvent
import org.allbinary.game.combat.destroy.event.DestroyedEventHandler
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.layer.BasicLayerProcessor
import org.allbinary.util.BasicArrayList

open public class DestroyedLayerProcessor : BasicLayerProcessor {
        

        companion object {
            
    private var DESTROYED_LAYER_PROCESSOR: BasicLayerProcessor = BasicLayerProcessor.NULL_LAYER_PROCESSOR

open fun init()
        //nullable = true from not(false or (false and true)) = true
{
DESTROYED_LAYER_PROCESSOR= DestroyedLayerProcessor()
}


open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BasicLayerProcessor{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DESTROYED_LAYER_PROCESSOR
}


        }
            private constructor        (){
}


                @Throws(Exception::class)
            override fun process(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
var allBinaryLayerManager = allBinaryLayerManager

    var list: BasicArrayList = this.getList()!!


    var size: Int = list.size()!!


    var destroyedEventHandler: DestroyedEventHandler = DestroyedEventHandler.getInstance()!!


    var destroyEventCircularStaticPool: DestroyEventCircularStaticPool = DestroyEventCircularStaticPool.getInstance()!!


    var destroyedEvent: DestroyedEvent


    var layerInterface: AllBinaryLayer





                        for (index in 0 until size)

        {

    var layerInterfaceCanBeNull: Any? = list.objectArray[index]


    
                        if(layerInterfaceCanBeNull != 
                                    null
                                )
                        
                                    {
                                    layerInterface= layerInterfaceCanBeNull as AllBinaryLayer
allBinaryLayerManager!!.remove(layerInterface)
destroyedEvent= destroyEventCircularStaticPool!!.getInstance(layerInterface)
destroyedEventHandler!!.fireEvent(destroyedEvent)

                                    }
                                
                        else {
                            
                        }
                            
}

list.clear()
}


}
                
            

