
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
        package org.allbinary.android.input.motion.event




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventListenerInterface
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.logic.util.event.handler.BasicEventHandler
import org.allbinary.util.BasicArrayList

open public class AnalogControllerConfigurationEventHandler : BasicEventHandler {
        

        companion object {
            
    private val instance: AnalogControllerConfigurationEventHandler = AnalogControllerConfigurationEventHandler()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AnalogControllerConfigurationEventHandler{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private val list: BasicArrayList = BasicArrayList()
private constructor        (){
}


open fun addListener(analogControllerConfigurationEventListenerInterface: AnalogControllerConfigurationEventListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{
var analogControllerConfigurationEventListenerInterface = analogControllerConfigurationEventListenerInterface

    
                        if(!list.contains(analogControllerConfigurationEventListenerInterface))
                        
                                    {
                                    list.add(analogControllerConfigurationEventListenerInterface)

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
            
    var playerGameInput: AnalogControllerConfigurationEventListenerInterface = this.list.objectArray[index]!! as AnalogControllerConfigurationEventListenerInterface

playerGameInput!!.onAnalogControllerConfigurationEvent(eventObject as AnalogControllerConfigurationEvent)
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

    var analogControllerConfigurationEventListenerInterface: AnalogControllerConfigurationEventListenerInterface = (eventListenerInterface as AnalogControllerConfigurationEventListenerInterface)

analogControllerConfigurationEventListenerInterface!!.onAnalogControllerConfigurationEvent(eventObject as AnalogControllerConfigurationEvent)
}


}
                
            

