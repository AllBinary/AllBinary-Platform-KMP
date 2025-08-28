
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
        package org.allbinary.graphics.displayable.screen




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Canvas
import javax.microedition.lcdui.Command
import javax.microedition.lcdui.CommandListener

open public class AboutCommandProcessor
            : Object
         {
        

        companion object {
            
    private val instance: AboutCommandProcessor = AboutCommandProcessor()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AboutCommandProcessor{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun process(midletCommandListener: CommandListener, command: Command, canvas: Canvas)
        //nullable = true from not(false or (false and false)) = true
{
    //var midletCommandListener = midletCommandListener
    //var command = command
    //var canvas = canvas
midletCommandListener!!.commandAction(command, canvas)
}


}
                
            

