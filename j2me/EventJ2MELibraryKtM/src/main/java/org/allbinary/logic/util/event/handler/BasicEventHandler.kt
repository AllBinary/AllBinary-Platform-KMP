
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
        package org.allbinary.logic.util.event.handler




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventListenerInterface
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class BasicEventHandler
            : Object
        
                , BasicEventHandlerInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val eventStrings: EventStrings = EventStrings.getInstance()!!

    var eventListenerInterfaceList: BasicArrayList
public constructor        ()
            : super()
        {
this.eventListenerInterfaceList= BasicArrayList()
}

override fun removeAllListeners()
        //nullable = true from not(false or (false and true)) = true
{
this.eventListenerInterfaceList= BasicArrayList()
}

override fun addListeners(vector: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{
    //var vector = vector

    var eventListenerInterface: EventListenerInterface


    var size: Int = vector.size()!!





                        for (index in 0 until size)

        {
eventListenerInterface= vector.get(index) as EventListenerInterface
this.addListener(eventListenerInterface)
}

}


open fun removeListeners(vector: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{
    //var vector = vector

    var eventListenerInterface: EventListenerInterface


    var size: Int = vector.size()!!





                        for (index in 0 until size)

        {
eventListenerInterface= vector.get(index) as EventListenerInterface
this.removeListener(eventListenerInterface)
}

}


open fun addListenerSingleThreaded(eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var eventListenerInterface = eventListenerInterface

    
                        if(!this.eventListenerInterfaceList!!.contains(eventListenerInterface))
                        
                                    {
                                    this.eventListenerInterfaceList!!.add(eventListenerInterface)

                                    }
                                
}

override fun addListener(eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var eventListenerInterface = eventListenerInterface

    
                        if(!this.eventListenerInterfaceList!!.contains(eventListenerInterface))
                        
                                    {
                                    this.eventListenerInterfaceList!!.add(eventListenerInterface)

                                    }
                                
}


open fun removeListenerSingleThreaded(eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var eventListenerInterface = eventListenerInterface
this.eventListenerInterfaceList!!.remove(eventListenerInterface)
}

override fun removeListener(eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var eventListenerInterface = eventListenerInterface
this.eventListenerInterfaceList!!.remove(eventListenerInterface)
}


                @Throws(Exception::class)
            override fun fireEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{
    //var eventObject = eventObject

    var eventListenerInterface: EventListenerInterface


    var index: Int = 0


        while(index < this.eventListenerInterfaceList!!.size())
        {

        try {
            eventListenerInterface= this.eventListenerInterfaceList!!.get(index) as EventListenerInterface
this.process(eventObject, eventListenerInterface)
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, eventStrings!!.FIRE_EVENT, e)
}

index++
}

}


                @Throws(Exception::class)
            
open fun process(eventObject: AllBinaryEventObject, eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var eventObject = eventObject
    //var eventListenerInterface = eventListenerInterface
eventListenerInterface!!.onEvent(eventObject)
}


open fun getEventListenerInterfaceListP()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return eventListenerInterfaceList
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(eventStrings!!.TOTAL_LISTENERS)
stringBuffer!!.append(this.eventListenerInterfaceList!!.size())

    var eventListenerInterface: EventListenerInterface


    var index: Int = 0


        while(index < this.eventListenerInterfaceList!!.size())
        {

        try {
            eventListenerInterface= this.eventListenerInterfaceList!!.get(index) as EventListenerInterface
stringBuffer!!.append(eventStrings!!.LISTENER_LABEL)
stringBuffer!!.append(eventListenerInterface!!.toString())
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.TOSTRING, e)
}

index++
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

