
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventListenerInterface
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class BasicEventHandler
            : Object
        
                , BasicEventHandlerInterface {
        

        companion object {
            
    val PERFORMANCE_MESSAGE: String = "Use Custom onEvent Methods for needed optimization"

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var eventListenerInterfaceList: BasicArrayList
public constructor        ()
            : super()
        {this.eventListenerInterfaceList= BasicArrayList()
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "Total Listeners: ")
stringBuffer!!.append(this.eventListenerInterfaceList!!.size())

    var eventListenerInterface: EventListenerInterface





                        for (index in 0 until this.eventListenerInterfaceList!!.size()!!)


        {
        try {
            eventListenerInterface= this.eventListenerInterfaceList!!.objectArray[index]!! as EventListenerInterface
stringBuffer!!.append(
                            " Listener: ")
stringBuffer!!.append(StringUtil.getInstance()!!.toString(eventListenerInterface))
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.TOSTRING, e)
}

}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun removeAllListeners()
        //nullable = true from not(false or (false and true)) = true
{this.eventListenerInterfaceList= BasicArrayList()
}


open fun addListenerSingleThreaded(eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var eventListenerInterface = eventListenerInterface

    
                        if(!this.eventListenerInterfaceList!!.contains(eventListenerInterface))
                        
                                    {
                                    this.eventListenerInterfaceList!!.add(eventListenerInterface)

                                    }
                                
}


open fun addListener(eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var eventListenerInterface = eventListenerInterface

    
                        if(!this.eventListenerInterfaceList!!.contains(eventListenerInterface))
                        
                                    {
                                    this.eventListenerInterfaceList!!.add(eventListenerInterface)

                                    }
                                
}


open fun removeListenerSingleThreaded(eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var eventListenerInterface = eventListenerInterface
this.eventListenerInterfaceList!!.remove(eventListenerInterface)
}


open fun removeListener(eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var eventListenerInterface = eventListenerInterface
this.eventListenerInterfaceList!!.remove(eventListenerInterface)
}


                @Throws(Exception::class)
            
open fun fireEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{

                    var eventObject = eventObject




                        for (index in 0 until this.eventListenerInterfaceList!!.size()!!)


        {
        try {
            
    var eventListenerInterface: EventListenerInterface = this.eventListenerInterfaceList!!.objectArray[index]!! as EventListenerInterface

this.process(eventObject, eventListenerInterface)
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, EventStrings.getInstance()!!.FIRE_EVENT, e)
}

}

}


                @Throws(Exception::class)
            
open fun process(eventObject: AllBinaryEventObject, eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var eventObject = eventObject


                    var eventListenerInterface = eventListenerInterface
eventListenerInterface!!.onEvent(eventObject)
}


open fun getEventListenerInterfaceListP()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return eventListenerInterfaceList
}


}
                
            

