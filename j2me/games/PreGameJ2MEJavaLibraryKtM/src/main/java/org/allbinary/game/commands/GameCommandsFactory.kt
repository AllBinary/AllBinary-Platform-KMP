
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
        package org.allbinary.game.commands




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Command
import org.allbinary.graphics.displayable.CanvasStrings
import org.allbinary.string.CommonStrings

open public class GameCommandsFactory
            : Object
         {
        

        companion object {
            
    private val instance: GameCommandsFactory = GameCommandsFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameCommandsFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val TOGGLE_FULLSCREEN: Command = Command(
                            "Toggle FullScreen", Command.SCREEN, 1)

    val TOGGLE_KEYBOARD: Command = Command(
                            "Keyboard", Command.SCREEN, 1)

    val SET_MENU_DISPLAYABLE: Command = Command(
                            "Set Menu Displayable", Command.SCREEN, 1)

    val APPLICATION_UPDATE: Command = Command(CommonStrings.getInstance()!!.UPDATE, Command.SCREEN, 1)

    val DISPLAY_ABOUT: Command = Command(CanvasStrings.getInstance()!!.ABOUT, Command.SCREEN, 2)

    val OPEN_WEB_URL: Command = Command(
                            "Open Web URL", Command.SCREEN, 2)

    val CLOSE_OPTIONS: Command = Command(
                            "Back", Command.SCREEN, 1)

    val DISPLAY_OPTIONS: Command = Command(CanvasStrings.getInstance()!!.OPTIONS, Command.SCREEN, 2)

    val START_TRACE: Command = Command(
                            "Start Trace", Command.SCREEN, 1)

    val STOP_TRACE: Command = Command(
                            "Stop Trace", Command.SCREEN, 1)

    val DEFAULT_OPTIONS: Command = Command(
                            "Default", Command.SCREEN, 1)

    val SHOW_GAME_CANVAS: Command = Command(
                            "Back to Game", Command.SCREEN, 1)

    val CLOSE_AND_SHOW_GAME_CANVAS: Command = Command(
                            "Back", Command.SCREEN, 1)

    val QUIT_COMMAND: Command = Command(
                            "Quit", Command.STOP, 1)

    val RESTART_COMMAND: Command = Command(
                            "Restart", Command.SCREEN, 0)

    val DISPLAY_SAVE_FORM: Command = Command(
                            "Save To", Command.SCREEN, 3)

    val SAVE: Command = Command(
                            "Save", Command.SCREEN, 3)

    val DISPLAY_LOAD_FORM: Command = Command(
                            "Load", Command.SCREEN, 3)

    val LOAD_FILE: Command = Command(
                            "Load File", Command.SCREEN, 3)

    val DELETE_FILE: Command = Command(
                            "Delete File", Command.SCREEN, 1)

    val EXIT_COMMAND: Command = Command(
                            "Exit", Command.EXIT, 2)

    val EXIT_WITHOUT_PROGRESS_COMMAND: Command = Command(
                            "Exit Without Progress", Command.EXIT, 2)

    val START_COMMAND: Command = Command(CommonStrings.getInstance()!!.START, Command.SCREEN, 1)

    val CONTINUE_COMMAND: Command = Command(
                            "Continue", Command.SCREEN, 1)

    val SELECT_COMMAND: Command = Command(
                            "Select", Command.SCREEN, 1)

    val FEATURE_UPDATE: Command = Command(
                            "Feature Update", Command.SCREEN, 1)

    val BUY_COMMAND: Command = Command(
                            "BUY", Command.SCREEN, 1)
protected constructor        ()
            : super()
        {}


}
                
            

