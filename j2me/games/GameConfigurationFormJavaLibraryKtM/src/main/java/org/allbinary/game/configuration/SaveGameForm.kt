
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
        package org.allbinary.game.configuration




        import java.lang.Object        
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.CommandListener
import javax.microedition.lcdui.TextField
import org.allbinary.game.commands.GameCommandsFactory
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.displayable.screen.CommandForm
import org.allbinary.logic.communication.log.LogUtil

open public class SaveGameForm : CommandForm {
        

        companion object {
            
    private var FORM: CommandForm = CommandForm.NULL_COMMAND_FORM

                @Throws(Exception::class)
            
open fun getInstance(commandListener: CommandListener, title: String, backgrounBasicColor: BasicColor, foregroundBasicColor: BasicColor)
        //nullable =  from not(true or (false and false)) = 
: CommandForm{

                    var commandListener = commandListener


                    var title = title


                    var backgrounBasicColor = backgrounBasicColor


                    var foregroundBasicColor = foregroundBasicColor
FORM= SaveGameForm(commandListener, title, backgrounBasicColor, foregroundBasicColor)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return FORM
}


open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CommandForm{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return FORM
}


        }
            private constructor        (commandListener: CommandListener, title: String, backgrounBasicColor: BasicColor, foregroundBasicColor: BasicColor)                        

                            : super(commandListener, title, backgrounBasicColor, foregroundBasicColor){

                    var commandListener = commandListener


                    var title = title


                    var backgrounBasicColor = backgrounBasicColor


                    var foregroundBasicColor = foregroundBasicColor


                            //For kotlin this is before the body of the constructor.
                    
logUtil!!.put(commonStrings!!.START, this, commonStrings!!.CONSTRUCTOR)

    var timeString: String = (System.currentTimeMillis()).toString()!!

this.append(TextField("Name: ", timeString, 30, TextField.ANY))
this.initCommands(commandListener)
}

override fun initCommands(cmdListener: CommandListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var cmdListener = cmdListener

    var gameCommandsFactory: GameCommandsFactory = GameCommandsFactory.getInstance()!!

this.removeAllCommands()
this.addCommand(gameCommandsFactory!!.SAVE)
this.addCommand(gameCommandsFactory!!.CLOSE_AND_SHOW_GAME_CANVAS)
this.setCommandListener(cmdListener)
}


}
                
            

