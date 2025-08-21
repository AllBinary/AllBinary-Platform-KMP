
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
        
import java.util.Vector
import javax.microedition.lcdui.CommandListener
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.NullCommandListener
import org.allbinary.canvas.Processor
import org.allbinary.game.commands.GameCommandsFactory
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.InputFeatureFactory
import org.allbinary.game.displayable.RepaintBehavior
import org.allbinary.game.input.GameInputStrings
import org.allbinary.game.input.GameKey
import org.allbinary.game.input.GameKeyFactory
import org.allbinary.game.input.PlatformInputMappingFactory
import org.allbinary.game.input.event.DownGameKeyEventHandler
import org.allbinary.game.input.event.GameKeyEvent
import org.allbinary.game.input.event.GameKeyEventFactory
import org.allbinary.game.input.event.GameKeyEventHandler
import org.allbinary.game.input.event.UpGameKeyEventHandler
import org.allbinary.game.input.mapping.InputToGameKeyMapping
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.displayable.CanvasStrings
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.displayable.MyCanvas
import org.allbinary.graphics.displayable.event.DisplayChangeEvent
import org.allbinary.graphics.displayable.event.DisplayChangeEventHandler
import org.allbinary.graphics.displayable.event.DisplayChangeEventListener
import org.allbinary.graphics.displayable.screen.ScreenRepaintProcessorFactory
import org.allbinary.graphics.font.MyFont
import org.allbinary.graphics.form.CommandCurrentSelectionFormFactory
import org.allbinary.graphics.form.FormPaintable
import org.allbinary.graphics.form.FormTypeFactory
import org.allbinary.graphics.form.PaintableForm
import org.allbinary.graphics.form.ScrollSelectionForm
import org.allbinary.graphics.form.ScrollSelectionFormNoneFactory
import org.allbinary.graphics.form.item.CommandTextItemArrayFactory
import org.allbinary.graphics.form.item.CustomItem
import org.allbinary.graphics.form.item.validation.AllCommandsVisitor
import org.allbinary.graphics.paint.NullPaintable
import org.allbinary.graphics.paint.Paintable
import org.allbinary.input.motion.gesture.observer.BasicMotionGesturesHandler
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.string.CommonSeps
import org.allbinary.util.BasicArrayList

open public class GameCommandCanvas : MyCanvas
                , MenuListener
                , DisplayChangeEventListener {
        

        companion object {
            
    private val id: Int = 0

        }
            
    private val repaintProcessor: Processor = ScreenRepaintProcessorFactory.getInstance()!!.getInstance(this)!!
            

    val gameInputStrings: GameInputStrings = GameInputStrings.getInstance()!!
            

    val foregroundBasicColor: BasicColor

    val backgroundBasicColor: BasicColor

    private val inputToGameKeyMapping: InputToGameKeyMapping = PlatformInputMappingFactory.getInstance()!!.getPersistentInputMappingInstance()!!.getInputMapping()!!
            

    private val gameKeyFactory: GameKeyFactory = GameKeyFactory.getInstance()!!
            

    private val gameKeyEventFactory: GameKeyEventFactory = GameKeyEventFactory.getInstance()!!
            

    private val downGameKeyEventHandler: DownGameKeyEventHandler = DownGameKeyEventHandler.getInstance()!!
            

    private val upGameKeyEventHandler: UpGameKeyEventHandler = UpGameKeyEventHandler.getInstance()!!
            

    val repaintBehavior: RepaintBehavior

    var foregroundColor: Int

    var backgroundColor: Int

    private var menuInputProcessor: BasicMenuInputProcessor = NoMenuInputProcessor.getInstance()!!
            

    private var menuPaintable: Paintable = NullPaintable.getInstance()!!
            

    private var menuForm: PaintableForm = PaintableForm.NULL_PAINTABLE_FORM

    private var isSingleKeyRepeatableProcessing: Boolean = Features.getInstance()!!.isFeature(InputFeatureFactory.getInstance()!!.SINGLE_KEY_REPEAT_PRESS)!!
            
public constructor        (cmdListener: CommandListener, name: String, backgroundBasicColor: BasicColor, foregroundBasicColor: BasicColor)                        

                            : super(name, CanvasStrings.getInstance()!!.EMPTY_CHILD_NAME_LIST){

                    var cmdListener = cmdListener


                    var name = name


                    var backgroundBasicColor = backgroundBasicColor


                    var foregroundBasicColor = foregroundBasicColor


                            //For kotlin this is before the body of the constructor.
                    
this.repaintBehavior= RepaintBehavior.getInstance()
this.foregroundBasicColor= foregroundBasicColor
this.backgroundBasicColor= backgroundBasicColor
this.foregroundColor= foregroundBasicColor!!.toInt()
this.backgroundColor= backgroundBasicColor!!.toInt()
this.initCommands(cmdListener)

    
                        if(cmdListener != NullCommandListener.NULL_COMMAND_LISTENER)
                        
                                    {
                                    
        try {
            this.initMenu()
repaintProcessor!!.process()
} catch(e: Exception)
            {


                            throw RuntimeException()
}


                                    }
                                
}

override fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{

                    var eventObject = eventObject
ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}

override fun onDisplayChangeEvent(displayChangeEvent: DisplayChangeEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var displayChangeEvent = displayChangeEvent

        try {
            logUtil!!.put(commonStrings!!.START, this, canvasStrings!!.ON_DISPLAY_CHANGE_EVENT)

    var rectangle: Rectangle = this.createRectangle(this.menuForm!!.size())!!
            

this.menuForm!!.init(rectangle, FormTypeFactory.getInstance()!!.VERTICAL_CENTER_FORM)
this.update()
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, "onResize", e)
}

}


open fun initCommands(cmdListener: CommandListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var cmdListener = cmdListener
this.removeAllCommands()
this.addCommand(GameCommandsFactory.getInstance()!!.CLOSE_AND_SHOW_GAME_CANVAS)
this.setCommandListener(cmdListener)
}


                @Throws(Exception::class)
            
open fun initMenu()
        //nullable = true from not(false or (false and true)) = true
{
    var form: ScrollSelectionForm = this.createForm()!!
            

this.menuForm= form

    
                        if(form != ScrollSelectionFormNoneFactory.getInstance())
                        
                                    {
                                    this.setMenuInputProcessor(ImmediateCommandFormInputProcessor(BasicArrayList(),  -1, this, form))
this.menuPaintable= FormPaintable(form)

                                    }
                                
this.repaintBehavior!!.onChangeRepaint(this)
}


                @Throws(Exception::class)
            
open fun createForm()
        //nullable = true from not(false or (false and true)) = true
: ScrollSelectionForm{
    var items: Array<CustomItem?> = CommandTextItemArrayFactory(AllCommandsVisitor()).
                            getInstance(this.getCommandStack() as Vector<Any>, this.backgroundBasicColor, this.foregroundBasicColor)!!
            


    var rectangle: Rectangle = this.createRectangle(items.size)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CommandCurrentSelectionFormFactory.getInstance(StringUtil.getInstance()!!.EMPTY_STRING, items, rectangle, FormTypeFactory.getInstance()!!.VERTICAL_CENTER_FORM, 15, false, this.backgroundBasicColor, this.foregroundBasicColor)
}


open fun createRectangle(size: Int)
        //nullable = true from not(false or (false and false)) = true
: Rectangle{

                    var size = size

    var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!
            


    var height: Int = size *MyFont.getInstance()!!.DEFAULT_CHAR_HEIGHT


    var startY: Int = (displayInfo!!.getLastHeight() *2 /3) -height


    var rectangle: Rectangle = Rectangle(PointFactory.getInstance()!!.getInstance(30, startY), displayInfo!!.getLastWidth() -30, startY)




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rectangle
}

override fun open()
        //nullable = true from not(false or (false and true)) = true
{logUtil!!.put(commonStrings!!.START, this, "open")
BasicMotionGesturesHandler.getInstance()!!.addListener(this.getMenuInputProcessor())
GameKeyEventHandler.getInstance()!!.addListener(this.getMenuInputProcessor())
DisplayChangeEventHandler.getInstance()!!.addListener(this)
}

override fun close()
        //nullable = true from not(false or (false and true)) = true
{logUtil!!.put(commonStrings!!.START, this, commonStrings!!.CLOSE)
BasicMotionGesturesHandler.getInstance()!!.removeListener(this.getMenuInputProcessor())
GameKeyEventHandler.getInstance()!!.removeListener(this.getMenuInputProcessor())
DisplayChangeEventHandler.getInstance()!!.removeListener(this)
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
                        return id
}

override fun keyPressed(keyCode: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyCode = keyCode
this.keyPressed(keyCode, 0)
}

override fun keyReleased(keyCode: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyCode = keyCode
this.keyReleased(keyCode, 0)
}

override fun keyRepeated(keyCode: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyCode = keyCode
this.keyRepeated(keyCode, 0)
}


open fun keyPressed(keyCode: Int, deviceId: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyCode = keyCode


                    var deviceId = deviceId
logUtil!!.put(StringMaker().
                            append(CommonSeps.getInstance()!!.SPACE)!!.append(keyCode)!!.toString(), this, gameInputStrings!!.KEY_PRESSED)
this.addGameKeyEvent(keyCode, 0, false)
}


open fun keyReleased(keyCode: Int, deviceId: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyCode = keyCode


                    var deviceId = deviceId
this.removeGameKeyEvent(keyCode, deviceId, false)
}


open fun keyRepeated(keyCode: Int, deviceId: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyCode = keyCode


                    var deviceId = deviceId

    
                        if(this.isSingleKeyRepeatableProcessing)
                        
                                    {
                                    this.addGameKeyEvent(keyCode, deviceId, true)

                                    }
                                
}


open fun addGameKeyEvent(keyCode: Int, deviceId: Int, repeated: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyCode = keyCode


                    var deviceId = deviceId


                    var repeated = repeated

        try {
            
    var gameKey: GameKey = this.inputToGameKeyMapping!!.getInstance(this, keyCode)!!
            


    
                        if(gameKey != this.gameKeyFactory!!.NONE)
                        
                                    {
                                    
    var gameKeyEvent: GameKeyEvent = gameKeyEventFactory!!.getInstance(this, gameKey)!!
            

downGameKeyEventHandler!!.fireEvent(gameKeyEvent)
downGameKeyEventHandler!!.getInstance(deviceId)!!.fireEvent(gameKeyEvent)

                                    }
                                
                        else {
                            logUtil!!.put(StringMaker().
                            append(this.gameInputStrings!!.NO_KEY)!!.append(keyCode)!!.toString(), this, this.gameInputStrings!!.ADD_KEY_EVENT)

                        }
                            
} catch(e: Exception)
            {logUtil!!.put("Key Event Error", this, this.gameInputStrings!!.ADD_KEY_EVENT, e)
}

}


open fun removeGameKeyEvent(keyCode: Int, deviceId: Int, repeated: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyCode = keyCode


                    var deviceId = deviceId


                    var repeated = repeated

        try {
            
    var gameKey: GameKey = this.inputToGameKeyMapping!!.getInstance(this, keyCode)!!
            


    
                        if(gameKey != this.gameKeyFactory!!.NONE)
                        
                                    {
                                    
    var gameKeyEvent: GameKeyEvent = gameKeyEventFactory!!.getInstance(this, gameKey)!!
            

upGameKeyEventHandler!!.fireEvent(gameKeyEvent)
upGameKeyEventHandler!!.getInstance(deviceId)!!.fireEvent(gameKeyEvent)

                                    }
                                
                        else {
                            logUtil!!.put(StringMaker().
                            append(this.gameInputStrings!!.NO_KEY)!!.append(keyCode)!!.toString(), this, this.gameInputStrings!!.REMOVE_KEY_EVENT)

                        }
                            
} catch(e: Exception)
            {logUtil!!.put("Key Event Error", this, this.gameInputStrings!!.REMOVE_KEY_EVENT, e)
}

}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
this.menuPaintable!!.paint(graphics)
this.repaintBehavior!!.repaint(this)
}


open fun setMenuInputProcessor(menuInputProcessor: BasicMenuInputProcessor)
        //nullable = true from not(false or (false and false)) = true
{

                    var menuInputProcessor = menuInputProcessor
this.menuInputProcessor= menuInputProcessor
}


open fun getMenuInputProcessor()
        //nullable = true from not(false or (false and true)) = true
: BasicMenuInputProcessor{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return menuInputProcessor
}


}
                
            

