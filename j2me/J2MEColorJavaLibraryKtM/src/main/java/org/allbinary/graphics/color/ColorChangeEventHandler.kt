
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
        package org.allbinary.graphics.color




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.util.event.handler.BasicEventHandler

open public class ColorChangeEventHandler : BasicEventHandler {
        

        companion object {
            
    private val eventHandler: ColorChangeEventHandler = ColorChangeEventHandler()
@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ColorChangeEventHandler{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ColorChangeEventHandler.eventHandler
}


        }
            private constructor        (){
}


}
                
            

