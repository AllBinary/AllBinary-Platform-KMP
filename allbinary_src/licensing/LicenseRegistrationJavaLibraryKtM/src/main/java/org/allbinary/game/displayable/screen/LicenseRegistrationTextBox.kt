
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
        package org.allbinary.game.displayable.screen



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Command
import javax.microedition.lcdui.CommandListener
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.TextField
import org.allbinary.string.CommonStrings
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.game.commands.GameCommandsFactory
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.form.item.CustomTextBox
import org.allbinary.graphics.paint.NullPaintable
import org.allbinary.graphics.paint.Paintable
import org.allbinary.graphics.paint.SimpleTextPaintable
import org.allbinary.input.event.VirtualKeyboardEventHandler

open public class LicenseRegistrationTextBox : CustomTextBox {
        

        companion object {


    val DISPLAY_COMMAND: Command = Command(
                            "Register", Command.SCREEN, 3)

    val SUBMIT_COMMAND: Command = Command(
                            "Submit", Command.SCREEN, 3)


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val pleaseWaitPaintable: Paintable = SimpleTextPaintable(commonStrings!!.PLEASE_WAIT, BasicColorFactory.getInstance()!!.WHITE)

    private var paintable: Paintable = NullPaintable.getInstance()!!
            
public constructor        (cmdListener: CommandListener, backgrounBasicColor: BasicColor, foregroundBasicColor: BasicColor)                        

                            : super(cmdListener, 
                            "Enter Registration Code:", StringUtil.getInstance()!!.EMPTY_STRING, 60, TextField.ANY, backgrounBasicColor, foregroundBasicColor){

                    var cmdListener = cmdListener


                    var backgrounBasicColor = backgrounBasicColor


                    var foregroundBasicColor = foregroundBasicColor


                            //For kotlin this is before the body of the constructor.
                    
}


open fun initCommands(cmdListener: CommandListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var cmdListener = cmdListener
this.removeAllCommands()
this.addCommand(GameCommandsFactory.getInstance()!!.CLOSE_AND_SHOW_GAME_CANVAS)
this.addCommand(GameCommandsFactory.getInstance()!!.TOGGLE_KEYBOARD)
this.addCommand(SUBMIT_COMMAND)
this.setCommandListener(cmdListener)
}


open fun open()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    var virtualKeyboardEventHandler: VirtualKeyboardEventHandler = VirtualKeyboardEventHandler.getInstance()!!
            

virtualKeyboardEventHandler!!.fireEvent(virtualKeyboardEventHandler!!.SHOW_EVENT)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "open", e)
}

super.open()
this.paintable= NullPaintable.getInstance()
this.repaint()
}


                @Throws(Exception::class)
            
open fun close()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    var virtualKeyboardEventHandler: VirtualKeyboardEventHandler = VirtualKeyboardEventHandler.getInstance()!!
            

virtualKeyboardEventHandler!!.fireEvent(virtualKeyboardEventHandler!!.HIDE_EVENT)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "open", e)
}

this.paintable= this.pleaseWaitPaintable
this.repaint()
super.close()
}


open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
super.paint(graphics)
this.paintable.paint(graphics)
}


open fun submit()
        //nullable = true from not(false or (false and true)) = true
{
    var commandListener: CommandListener = this.getCustomCommandListener()!!
            

commandListener!!.commandAction(SUBMIT_COMMAND, this)
}


}
                
            

