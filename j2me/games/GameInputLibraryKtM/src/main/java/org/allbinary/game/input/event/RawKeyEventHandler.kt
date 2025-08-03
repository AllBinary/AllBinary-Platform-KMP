
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
        package org.allbinary.game.input.event



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class RawKeyEventHandler
            : Object
         {
        

        companion object {


    private val instance: RawKeyEventHandler = RawKeyEventHandler()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: RawKeyEventHandler{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


    private val TOTAL_LISTENERS: String = "Total Listeners: "

    private val LISTENER_LABEL: String = " Listener: "


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    var eventListenerInterfaceList: BasicArrayList
public constructor        ()
            : super()
        {this.eventListenerInterfaceList= BasicArrayList()
}


open fun removeAllListeners()
        //nullable = true from not(false or (false and true)) = true
{this.eventListenerInterfaceList= BasicArrayList()
}


open fun addListeners(vector: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var vector = vector

    var eventListenerInterface: RawKeyEventListener


    var size: Int = vector!!.size()!!
            





                        for (index in 0 until size)


        {eventListenerInterface= vector!!.get(index) as RawKeyEventListener
this.addListener(eventListenerInterface)
}

}


open fun addListenerSingleThreaded(eventListenerInterface: RawKeyEventListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var eventListenerInterface = eventListenerInterface

    
                        if(!this.eventListenerInterfaceList!!.contains(eventListenerInterface))
                        
                                    {
                                    this.eventListenerInterfaceList!!.add(eventListenerInterface)

                                    }
                                
}


open fun addListener(eventListenerInterface: RawKeyEventListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var eventListenerInterface = eventListenerInterface

    
                        if(!this.eventListenerInterfaceList!!.contains(eventListenerInterface))
                        
                                    {
                                    this.eventListenerInterfaceList!!.add(eventListenerInterface)

                                    }
                                
}


open fun removeListenerSingleThreaded(eventListenerInterface: RawKeyEventListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var eventListenerInterface = eventListenerInterface
this.eventListenerInterfaceList!!.remove(eventListenerInterface)
}


open fun removeListener(eventListenerInterface: RawKeyEventListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var eventListenerInterface = eventListenerInterface
this.eventListenerInterfaceList!!.remove(eventListenerInterface)
}


                @Throws(Exception::class)
            
open fun fireEvent(keyCode: Int, deviceId: Int, repeated: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyCode = keyCode


                    var deviceId = deviceId


                    var repeated = repeated

    var eventListenerInterface: RawKeyEventListener





                        for (index in 0 until this.eventListenerInterfaceList!!.size()!!)


        {
        try {
            eventListenerInterface= this.eventListenerInterfaceList!!.get(index) as RawKeyEventListener
this.process(keyCode, deviceId, repeated, eventListenerInterface)
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, EventStrings.getInstance()!!.FIRE_EVENT, e)
}

}

}


                @Throws(Exception::class)
            
open fun process(keyCode: Int, deviceId: Int, repeated: Boolean, eventListenerInterface: RawKeyEventListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyCode = keyCode


                    var deviceId = deviceId


                    var repeated = repeated


                    var eventListenerInterface = eventListenerInterface
eventListenerInterface!!.onEvent(keyCode, deviceId, repeated)
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

stringBuffer!!.append(TOTAL_LISTENERS)
stringBuffer!!.append(this.eventListenerInterfaceList!!.size())

    var eventListenerInterface: RawKeyEventListener





                        for (index in 0 until this.eventListenerInterfaceList!!.size()!!)


        {
        try {
            eventListenerInterface= this.eventListenerInterfaceList!!.get(index) as RawKeyEventListener
stringBuffer!!.append(LISTENER_LABEL)
stringBuffer!!.append(eventListenerInterface!!.toString())
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.TOSTRING, e)
}

}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

