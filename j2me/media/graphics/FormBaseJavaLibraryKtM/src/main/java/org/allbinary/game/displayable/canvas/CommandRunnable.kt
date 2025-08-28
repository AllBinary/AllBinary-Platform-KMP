
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
        package org.allbinary.game.displayable.canvas




        import java.lang.Object        
        
        import java.lang.Runnable
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Command
import javax.microedition.lcdui.CommandListener
import org.allbinary.graphics.displayable.MyCanvas
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class CommandRunnable
            : Object
        
                , Runnable {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val commandFormInputProcessor: CommandFormInputProcessor

    private val command: Command
public constructor        (commandFormInputProcessor: CommandFormInputProcessor, command: Command)
            : super()
        {
var commandFormInputProcessor = commandFormInputProcessor
var command = command
this.commandFormInputProcessor= commandFormInputProcessor
this.command= command
}

override fun run()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            logUtil!!.put(commonStrings!!.START_RUNNABLE, this, commonStrings!!.RUN)

    var canvas: MyCanvas = this.commandFormInputProcessor!!.getCanvas()!!


    var commandListener: CommandListener = canvas.getCustomCommandListener()!!

commandListener!!.commandAction(command, canvas)
logUtil!!.put(commonStrings!!.END_RUNNABLE, this, commonStrings!!.RUN)
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}


}
                
            

