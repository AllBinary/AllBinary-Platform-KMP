
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
        
import java.awt.Desktop
import java.net.URI
import javax.microedition.lcdui.Canvas
import javax.microedition.lcdui.Command
import javax.microedition.lcdui.CommandListener
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.util.BasicArrayList

open public class WebCommandProcessor
            : Object
         {
        

        companion object {
            
    private val instance: WebCommandProcessor = WebCommandProcessor()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: WebCommandProcessor{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val aboutCommandProcessor: AboutCommandProcessor = AboutCommandProcessor.getInstance()!!

    val list: BasicArrayList = BasicArrayList()

open fun process(midletCommandListener: CommandListener, command: Command, canvas: Canvas)
        //nullable = true from not(false or (false and false)) = true
{

                    var midletCommandListener = midletCommandListener


                    var command = command


                    var canvas = canvas

        try {
            
    
                        if(Desktop.isDesktopSupported() && Desktop.getDesktop()!!.isSupported(Desktop.Action.BROWSE))
                        
                                    {
                                    Desktop.getDesktop()!!.browse(URI(list.remove(0) as String))

                                    }
                                
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, "process", e)
}

}


}
                
            

