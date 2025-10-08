
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
        package org.allbinary.bounds




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.bounds.event.BoundsChangeEvent
import org.allbinary.bounds.event.BoundsChangeEventListener
import org.allbinary.graphics.Rectangle
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventStrings

open public class LayerBounds
            : Object
        
                , BoundsChangeEventListener {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    var rectangle: Rectangle
protected constructor (rectangle: Rectangle)
            : super()
        {
var rectangle = rectangle
this.rectangle= rectangle
}


    open fun getRectangleP()
        //nullable = true from not(false or (false and true)) = true
: Rectangle{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rectangle
}


    open fun visit(boundsVisitorInterface: BoundsVisitorInterface)
        //nullable = true from not(false or (false and false)) = true
{
var boundsVisitorInterface = boundsVisitorInterface
}


    override fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{
var eventObject = eventObject
ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}


    override fun onBoundsChangeEvent(boundsChangeEvent: BoundsChangeEvent)
        //nullable = true from not(false or (false and false)) = true
{
var boundsChangeEvent = boundsChangeEvent
this.rectangle= boundsChangeEvent!!.getRectangle()
}


}
                
            

