
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Choice
import javax.microedition.lcdui.Command
import javax.microedition.lcdui.CommandListener
import org.allbinary.game.commands.GameCommandsFactory
import org.allbinary.game.configuration.feature.GameFeatureFormUtil
import org.allbinary.game.configuration.feature.InGameFeatureChoiceGroups
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.displayable.screen.CommandForm
import org.allbinary.logic.communication.log.LogUtil

open public class InGameOptionsForm : CommandForm {
        

        companion object {
            
    val DISPLAY: Command = Command("Options In Game", Command.SCREEN, 1)

    val SAVE: Command = Command("Save", Command.SCREEN, 1)

    val DEFAULT: Command = Command("Default", Command.SCREEN, 1)

        }
             constructor        (commandListener: CommandListener, title: String, backgrounBasicColor: BasicColor, foregroundBasicColor: BasicColor)                        

                            : super(commandListener, title, backgrounBasicColor, foregroundBasicColor){

                    var commandListener = commandListener


                    var title = title


                    var backgrounBasicColor = backgrounBasicColor


                    var foregroundBasicColor = foregroundBasicColor


                            //For kotlin this is before the body of the constructor.
                    
logUtil!!.put(commonStrings!!.START, this, commonStrings!!.CONSTRUCTOR)

    var gameFeatureFormUtil: GameFeatureFormUtil = GameFeatureFormUtil.getInstance()!!

gameFeatureFormUtil!!.addChoiceGroup(this, InGameFeatureChoiceGroups.getExclusiveInstance()!!.get(), Choice.EXCLUSIVE)
gameFeatureFormUtil!!.addChoiceGroup(this, InGameFeatureChoiceGroups.getMultipleInstance()!!.get(), Choice.MULTIPLE)
this.initCommands(commandListener)
}

override fun initCommands(cmdListener: CommandListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var cmdListener = cmdListener
this.removeAllCommands()
this.addCommand(GameCommandsFactory.getInstance()!!.CLOSE_AND_SHOW_GAME_CANVAS)
this.addCommand(InGameOptionsForm.DEFAULT)
this.setCommandListener(cmdListener)
}


}
                
            

