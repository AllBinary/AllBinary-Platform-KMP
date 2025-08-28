
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
        
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventListenerInterface
interface BasicEventHandlerInterface {
        

open fun addListener(eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
open fun fireEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true


open fun removeAllListeners()
        //nullable = true from not(false or (false and true)) = true


open fun removeListener(eventListenerInterface: EventListenerInterface)
        //nullable = true from not(false or (false and false)) = true


}
                
            

