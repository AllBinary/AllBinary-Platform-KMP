
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
        package org.allbinary.graphics.displayable.command




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Command
import org.allbinary.logic.string.StringUtil

open public class MyCommandsFactory
            : Object
         {
        

        companion object {
            
    private val instance: MyCommandsFactory = MyCommandsFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: MyCommandsFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val NO_COMMAND: Command = Command(StringUtil.getInstance()!!.EMPTY_STRING,  -1,  -1)

    val GAUGE_CHANGE: Command = Command("GAUGE_CHANGE", Command.ITEM, 1)

    val SET_DISPLAYABLE: Command = Command("Display", Command.SCREEN, 2)

    val PAUSE_COMMAND: Command = Command("Pause", Command.SCREEN, 0)

    val RESUME_COMMAND: Command = Command("Resume", Command.SCREEN, 0)
protected constructor        ()
            : super()
        {
}


}
                
            

