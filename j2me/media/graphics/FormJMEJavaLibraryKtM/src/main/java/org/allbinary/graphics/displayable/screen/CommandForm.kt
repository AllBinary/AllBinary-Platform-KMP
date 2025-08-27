
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2002 AllBinary 
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
        
import java.util.Stack
import javax.microedition.lcdui.Command
import javax.microedition.lcdui.CommandListener
import javax.microedition.lcdui.Form
import javax.microedition.lcdui.NullCommandListener
import org.allbinary.canvas.Processor
import org.allbinary.game.displayable.canvas.MenuListener
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.displayable.command.MyCommandInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings

open public class CommandForm : Form
                , MyCommandInterface
                , MenuListener {
        

        companion object {
            
    val NULL_COMMAND_FORM: CommandForm = CommandForm(NullCommandListener.NULL_COMMAND_LISTENER, StringUtil.getInstance()!!.EMPTY_STRING, BasicColorFactory.getInstance()!!.BLACK, BasicColorFactory.getInstance()!!.WHITE)

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val repaintProcessor: Processor = ScreenRepaintProcessorFactory.getInstance()!!.getInstance(this)!!

    private var commandStack: Stack<Any>
public constructor        (commandListener: CommandListener, formTitle: String, backgrounBasicColor: BasicColor, foregroundBasicColor: BasicColor)                        

                            : super(formTitle){

                    var commandListener = commandListener


                    var formTitle = formTitle


                    var backgrounBasicColor = backgrounBasicColor


                    var foregroundBasicColor = foregroundBasicColor


                            //For kotlin this is before the body of the constructor.
                    
this.commandStack= Stack<Any>()

        try {
            repaintProcessor!!.process()
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CONSTRUCTOR, e)
}

}


open fun initCommands(cmdListener: CommandListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var cmdListener = cmdListener
}

override fun open()
        //nullable = true from not(false or (false and true)) = true
{logUtil!!.put(this.commonStrings!!.START, this, "open")
}

override fun close()
        //nullable = true from not(false or (false and true)) = true
{logUtil!!.put(this.commonStrings!!.START, this, commonStrings!!.CLOSE)
}


                @Throws(Exception::class)
            
open fun update()
        //nullable = true from not(false or (false and true)) = true
{this.repaintProcessor!!.process()
}

override fun getSourceId()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}

override fun addCommand(command: Command)
        //nullable = true from not(false or (false and false)) = true
{

                    var command = command
commandStack!!.push(command)
super.addCommand(command)
}

override fun removeAllCommands()
        //nullable = true from not(false or (false and true)) = true
{
    var size: Int = commandStack!!.size!!





                        for (index in 0 until size)

        {super.removeCommand(commandStack!!.pop() as Command)
}

}


}
                
            

