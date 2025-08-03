
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        package org.allbinary.media.graphics.geography.map



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.AllBinaryGameLayer
import org.allbinary.string.CommonStrings
import org.allbinary.logic.util.event.EventListenerInterface
import org.allbinary.logic.util.event.handler.BasicEventHandler
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.util.BasicArrayList

open public class GeographicMapEventHandler : BasicEventHandler {
        

        companion object {


    private var instance: GeographicMapEventHandler = GeographicMapEventHandler()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GeographicMapEventHandler{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GeographicMapEventHandler.instance
}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val list: BasicArrayList = BasicArrayList()
private constructor        (){}


open fun addListener(gameLayer: AllBinaryGameLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameLayer = gameLayer

    
                        if(!list!!.contains(gameLayer))
                        
                                    {
                                    list!!.add(gameLayer)

                                    }
                                
}


open fun removeAllListeners()
        //nullable = true from not(false or (false and true)) = true
{this.list!!.clear()
super.removeAllListeners()
}


open fun removeListener(eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var eventListenerInterface = eventListenerInterface
this.list!!.remove(eventListenerInterface)
super.removeListener(eventListenerInterface)
}


open fun fireEvent()
        //nullable = true from not(false or (false and true)) = true
{



                        for (index in this.list!!.size()!! downTo 0)


        {
        try {
            
    var gameLayer: AllBinaryGameLayer = this.list!!.get(index) as AllBinaryGameLayer

gameLayer!!.move()
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, EventStrings.getInstance()!!.FIRE_EVENT, e)
}

}

}


}
                
            

