
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
        
import javax.microedition.lcdui.CommandListener
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.displayable.screen.CommandForm
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class GameOptionsFormFactory
            : Object
         {
        
companion object {
            
    private val instance: GameOptionsFormFactory = GameOptionsFormFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameOptionsFormFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
private constructor ()
            : super()
        {
}


    open fun init(commandListener: CommandListener, title: String, backgrounBasicColor: BasicColor, foregroundBasicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
: CommandForm{
var commandListener = commandListener
var title = title
var backgrounBasicColor = backgrounBasicColor
var foregroundBasicColor = foregroundBasicColor

        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GameOptionsForm(commandListener, title, backgrounBasicColor, foregroundBasicColor)
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.INIT, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CommandForm.NULL_COMMAND_FORM
}

}


}
                
            

