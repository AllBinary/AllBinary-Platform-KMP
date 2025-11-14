
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
        package org.allbinary.graphics.j2me.workarea.tools.event




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class MyGraphicItemEventService
            : Object
         {
        
companion object {
            
    private var listenerList: javax.swing.event.EventListenerList = javax.swing.event.EventListenerList()

    var DELETE: String = "delete"

    var DESELECT: String = "deselect"

    var SELECT: String = "select"

    var DUPLICATE: String = "duplicate"

    var ROTATE: String = "rotate"
@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun addListener(listener: MyGraphicItemEventListener)
        //nullable = true from not(false or (false and false)) = true
{
var listener = listener
listenerList!!.add(listener::class as Class<*>, listener as java.util.EventListener)
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun removeListener(listener: MyGraphicItemEventListener)
        //nullable = true from not(false or (false and false)) = true
{
var listener = listener
listenerList!!.remove(listener::class as Class<*>, listener as java.util.EventListener)
}


                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun fire(evt: MyGraphicItemEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

    var listeners: Array<Any?> = listenerList!!.getListenerList()!!





                        for (i in 0 until listeners.size)

        {

    
                        if(listeners[i] == listeners[i +1]!!.::class)
                        
                                    {
                                    
    
                        if(evt.getCommand()!!.compareTo(SELECT) == 0)
                        
                                    {
                                     = listeners[i +1]!! as MyGraphicItemEventListener
.
                    highlight(evt)

                                    }
                                
                             else 
    
                        if(evt.getCommand()!!.compareTo(DESELECT) == 0)
                        
                                    {
                                     = listeners[i +1]!! as MyGraphicItemEventListener
.
                    deselect(evt)

                                    }
                                
                             else 
    
                        if(evt.getCommand()!!.compareTo(DELETE) == 0)
                        
                                    {
                                     = listeners[i +1]!! as MyGraphicItemEventListener
.
                    delete(evt)

                                    }
                                
                             else 
    
                        if(evt.getCommand()!!.compareTo(DUPLICATE) == 0)
                        
                                    {
                                     = listeners[i +1]!! as MyGraphicItemEventListener
.
                    duplicate(evt)

                                    }
                                
                             else 
    
                        if(evt.getCommand()!!.compareTo(ROTATE) == 0)
                        
                                    {
                                     = listeners[i +1]!! as MyGraphicItemEventListener
.
                    rotate(evt)

                                    }
                                

                                    }
                                
}

}


        }
            private constructor ()
            : super()
        {
}


}
                
            

