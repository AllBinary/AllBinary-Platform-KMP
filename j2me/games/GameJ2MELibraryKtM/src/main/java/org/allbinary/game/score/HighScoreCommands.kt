
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
        package org.allbinary.game.score




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Command

open public class HighScoreCommands
            : Object
         {
        
companion object {
            
    private val instance: HighScoreCommands = HighScoreCommands()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: HighScoreCommands{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val DISPLAY: Command = Command("Scores", Command.SCREEN, 1)

    val PERSONAL: Command = Command("Personal", Command.SCREEN, 1)

    val WORLD: Command = Command("World", Command.SCREEN, 1)

}
                
            

