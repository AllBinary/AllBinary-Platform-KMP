
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
        package org.allbinary.game




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.advertisement.GameAdStateBase
import org.allbinary.business.advertisement.AdConfiguration
import org.allbinary.input.event.VirtualKeyboardEvent
import org.allbinary.input.event.VirtualKeyboardEventHandler
import org.allbinary.input.event.VirtualKeyboardEventListenerInterface

open public class GameAdState : GameAdStateBase
                , VirtualKeyboardEventListenerInterface {
        
public constructor (adConfiguration: AdConfiguration)                        

                            : super(adConfiguration){
var adConfiguration = adConfiguration


                            //For kotlin this is before the body of the constructor.
                    
VirtualKeyboardEventHandler.getInstance()!!.addListener(this)
}


                @Throws(Exception::class)
            
    override fun onVirtualKeyboardEvent(virtualKeyboardEvent: VirtualKeyboardEvent)
        //nullable = true from not(false or (false and false)) = true
{
var virtualKeyboardEvent = virtualKeyboardEvent
}


}
                
            

