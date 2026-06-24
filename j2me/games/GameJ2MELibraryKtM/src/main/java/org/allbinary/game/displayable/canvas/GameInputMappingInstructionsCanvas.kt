
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Command
import javax.microedition.lcdui.CommandListener
import javax.microedition.lcdui.Graphics
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.game.paint.ColorFillBasePaintable
import org.allbinary.game.paint.ColorFillPaintableFactory
import org.allbinary.graphics.Anchor
import org.allbinary.graphics.draw.DrawStringUtil
import org.allbinary.logic.string.StringUtil

open public class GameInputMappingInstructionsCanvas : GameCommandCanvas {
        
companion object {
            
    val DISPLAY: Command = Command("Help", StringUtil.getInstance()!!.EMPTY_STRING, Command.SCREEN, 1)

    val CLOSE: Command = Command("Close", StringUtil.getInstance()!!.EMPTY_STRING, Command.SCREEN, 1)

    val NAME: String = "GameInputMappingInstructionsCanvas"

        }
            
    private val drawStringUtil: DrawStringUtil = DrawStringUtil.getInstance()!!

    val TITLE: String = "Input Instructions"

    private val instructions: Array<String?> = arrayOf("Add Input Mapping:","1. Select the desired action by generating a currently defined input for a given action.","(Example: Press the '1' key to select the Fire action)","2. Make the newly desired input for the selected action.","(Example: Press 'f' to add it to the selected action)","Note: If the input is already mapped to another action then it will not be added. You","will need to deleted from the other action before adding it to another.","Warning: Not all keys map for a given platform and show as Unknown.",StringUtil.getInstance()!!.EMPTY_STRING,"Remove Input Mapping:","1. Select the desired action by generating a currently defined input for a given action.","(Example: Press the key '1' to select the Fire action)","2. Select a mapped input for the selected action.","(Example: Press the key '1' to select the '1' key input for the selected Fire action)","3. Press the Delete Key.")

    private var colorFillPaintable: ColorFillBasePaintable

    private var anchor: Int = Anchor.TOP_LEFT
public constructor (commandListener: CommandListener, allBinaryGameLayerManager: AllBinaryGameLayerManager)                        

                            : super(commandListener, GameInputMappingInstructionsCanvas.NAME, allBinaryGameLayerManager!!.getBackgroundBasicColor(), allBinaryGameLayerManager!!.getForegroundBasicColor()){
var commandListener = commandListener
var allBinaryGameLayerManager = allBinaryGameLayerManager


                            //For kotlin this is before the body of the constructor.
                    
this.logUtil!!.putF(this.commonStrings!!.START, this, this.commonStrings!!.CONSTRUCTOR)
this.colorFillPaintable= ColorFillPaintableFactory.getInstance()!!.getInstance(allBinaryGameLayerManager!!.getBackgroundBasicColor(), false)
}


    override fun initCommands(cmdListener: CommandListener)
        //nullable = true from not(false or (false and false)) = true
{
var cmdListener = cmdListener
this.removeAllCommands()
this.addCommand(GameInputMappingInstructionsCanvas.CLOSE)
this.setCommandListener(cmdListener)
}


    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
this.myFontProcessor!!.process(graphics)
this.colorFillPaintable!!.paint(graphics)

    var halfWidth: Int = this.displayInfo!!.getLastHalfWidth()!!


    var beginWidth: Int = (graphics.getFont()!!.stringWidth(this.TITLE) shr 1)

graphics.setColor(this.foregroundColor)
graphics.drawString(this.TITLE, halfWidth -beginWidth, this.fontHeight, this.anchor)
this.drawStringUtil!!.drawCenterStrings(graphics, this.instructions, this.displayInfo!!.getLastWidth(), this.fontHeight, halfWidth, 3 *this.fontHeight)
super.paint(graphics)
}


}
                
            

