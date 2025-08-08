
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import java.util.Vector
import javax.microedition.lcdui.Command
import javax.microedition.lcdui.CommandListener
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.Item
import org.allbinary.animation.Animation
import org.allbinary.animation.IndexedAnimationBehavior
import org.allbinary.animation.special.SpecialAnimation
import org.allbinary.business.advertisement.GameAdStateFactory
import org.allbinary.canvas.BaseGameStatistics
import org.allbinary.canvas.CustomGameMenuUtil
import org.allbinary.canvas.FullScreenUtil
import org.allbinary.canvas.GameStatisticsFactory
import org.allbinary.canvas.RunnableCanvas
import org.allbinary.game.GameAdState
import org.allbinary.game.GameInfo
import org.allbinary.game.commands.GameCommandsFactory
import org.allbinary.game.configuration.event.ChangedGameFeatureListener
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.GameFeatureFactory
import org.allbinary.game.configuration.feature.HTMLFeatureFactory
import org.allbinary.game.configuration.feature.InputFeatureFactory
import org.allbinary.game.configuration.feature.MainFeatureFactory
import org.allbinary.game.init.BasicBuildGameInitializerFactory
import org.allbinary.game.init.GameInitializationUtil
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
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.game.layer.SWTUtil
import org.allbinary.game.midlet.DemoGameMidlet
import org.allbinary.game.score.HighScoreCommands
import org.allbinary.game.score.HighScores
import org.allbinary.game.score.HighScoresFactoryInterface
import org.allbinary.game.score.HighScoresHelper
import org.allbinary.game.score.HighScoresHelperBase
import org.allbinary.game.score.HighScoresPaintable
import org.allbinary.game.score.NullHighScoresSingletonFactory
import org.allbinary.game.state.GameState
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.ResizableListenerHandler
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvas
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvasFactory
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.displayable.command.MyCommandsFactory
import org.allbinary.graphics.displayable.event.DisplayChangeEvent
import org.allbinary.graphics.displayable.event.DisplayChangeEventHandler
import org.allbinary.graphics.displayable.event.DisplayChangeEventListener
import org.allbinary.graphics.displayable.screen.FullScreenPaintableFactory
import org.allbinary.graphics.font.MyFont
import org.allbinary.graphics.form.CommandCurrentSelectionFormFactory
import org.allbinary.graphics.form.FormType
import org.allbinary.graphics.form.FormTypeFactory
import org.allbinary.graphics.form.ScrollSelectionForm
import org.allbinary.graphics.form.ScrollSelectionFormNoneFactory
import org.allbinary.graphics.form.item.CommandTextItemArrayFactory
import org.allbinary.graphics.form.item.CustomItem
import org.allbinary.graphics.opengles.CurrentDisplayableFactory
import org.allbinary.graphics.opengles.OpenGLFeatureFactory
import org.allbinary.graphics.opengles.OpenGLFeatureUtil
import org.allbinary.graphics.opengles.OpenGLThreadUtil
import org.allbinary.graphics.paint.InitUpdatePaintable
import org.allbinary.graphics.paint.NullPaintable
import org.allbinary.graphics.paint.Paintable
import org.allbinary.graphics.paint.PaintableInterface
import org.allbinary.graphics.paint.StatePaintable
import org.allbinary.graphics.paint.StatePaintableFactory
import org.allbinary.input.motion.gesture.observer.BasicMotionGesturesHandler
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.system.os.OperatingSystemFactory
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.InApplicationPurchaseFactory
import org.allbinary.logic.system.security.licensing.LockableFeature
import org.allbinary.logic.system.security.licensing.LockableFeatureFactory
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.media.audio.AllBinaryMediaManager
import org.allbinary.media.audio.EarlySoundsFactory
import org.allbinary.media.audio.PrimaryPlayerQueueFactory
import org.allbinary.media.audio.SecondaryPlayerQueueFactory
import org.allbinary.string.CommonSeps
import org.allbinary.thread.NullThread
import org.allbinary.thread.ThreadFactoryUtil
import org.allbinary.thread.ThreadUtil
import org.allbinary.time.TimeDelayHelper
import org.allbinary.util.BasicArrayList

open public class DemoCanvas : RunnableCanvas
                , GameCanvasRunnableInterface
                , MenuListener
                , DisplayChangeEventListener
                , DemoPaintableInterface {
        

        companion object {


    private val id: Int = 0

    private val BOT_GAME_STATS: String = "Bot Game Statistics: "

    val TYPE: Int = 3


        }
            
    val basicColorFactory: BasicColorFactory = BasicColorFactory.getInstance()!!
            

    val myCommandsFactory: MyCommandsFactory = MyCommandsFactory.getInstance()!!
            

    val gameAdStateFactory: GameAdStateFactory = GameAdStateFactory.getInstance()!!
            

    val gameInputStrings: GameInputStrings = GameInputStrings.getInstance()!!
            

    private val threadFactoryUtil: ThreadFactoryUtil = ThreadFactoryUtil.getInstance()!!
            

    var fullscreenPaintable: Paintable = FullScreenPaintableFactory.getInstance()!!.paintable

    private var basicGameDemoPaintable: StatePaintable = StatePaintableFactory.getInstance()!!
            

    private var specialAnimationInterface: SpecialAnimation = SpecialAnimation.getInstance()!!
            

    private var paintedSpecialAnimationInterface: Animation = SpecialAnimation.getInstance()!!
            

    private val fullScreenUtil: FullScreenUtil = FullScreenUtil.getInstance()!!
            

    private var gameCanvas: AllBinaryGameCanvas = NullGameCanvas.getInstance()!!
            

    private val highScoresHelper: HighScoresHelperBase = HighScoresHelper()

    private val realHighScoresPaintable: HighScoresPaintable = HighScoresPaintable()

    private var highScoresPaintable: Paintable = NullPaintable.getInstance()!!
            

    private var state: Int = 0

    private var canvasThread: Thread = NullThread.NULL_THREAD

    private val timeDelayHelper: TimeDelayHelper = TimeDelayHelper(6000)

    private var basicColor: BasicColor = basicColorFactory!!.RED

    val abeClientInformation: AbeClientInformationInterface

    private val highScoresFactoryInterface: HighScoresFactoryInterface

    private var menuInputProcessor: BasicMenuInputProcessor = NoMenuInputProcessor.getInstance()!!
            

    private var menuForm: ScrollSelectionForm = ScrollSelectionForm.NULL_SCROLL_SELECTION_FORM

    private val gameInitializationInterfaceFactoryInterface: BasicBuildGameInitializerFactory

    private var initialized: Boolean= false

    private val demoGameRunnable: DemoGameStartupRunnable

    private var defaultPaintableInterface: Paintable = NullPaintable.getInstance()!!
            

    private var paintableInterface: PaintableInterface = NullPaintable.getInstance()!!
            

    private val overlayPaintable: InitUpdatePaintable

    private val progressPaintable: PaintableInterface = ProgressCanvasFactory.getLazyInstance()!!
            

    private var tempWait: Int = NullWaitGameRunnable.getInstance()!!.WAIT

    private val inputToGameKeyMapping: InputToGameKeyMapping = PlatformInputMappingFactory.getInstance()!!.getPersistentInputMappingInstance()!!.getInputMapping()!!
            

    private var gameRunnable: GameRunnable = NullWaitGameRunnable.getInstance()!!
            
public constructor        (abeClientInformation: AbeClientInformationInterface, commandListener: CommandListener, highScoresFactoryInterface: HighScoresFactoryInterface, paintable: Paintable, overlayPaintable: InitUpdatePaintable, gameInitializationInterfaceFactoryInterface: BasicBuildGameInitializerFactory, isContinue: Boolean)                        

                            : super(commandListener, CurrentDisplayableFactory.getInstance()!!.DEFAULT_CHILD_NAME_LIST){

                    var abeClientInformation = abeClientInformation


                    var commandListener = commandListener


                    var highScoresFactoryInterface = highScoresFactoryInterface


                    var paintable = paintable


                    var overlayPaintable = overlayPaintable


                    var gameInitializationInterfaceFactoryInterface = gameInitializationInterfaceFactoryInterface


                    var isContinue = isContinue


                            //For kotlin this is before the body of the constructor.
                    
this.abeClientInformation= abeClientInformation
this.setWait(NullWaitGameRunnable.getInstance()!!.WAIT)
this.gameInitializationInterfaceFactoryInterface= gameInitializationInterfaceFactoryInterface
GameInitializationUtil.getInstance()!!.initDemo(abeClientInformation, this, gameInitializationInterfaceFactoryInterface)
ResizableListenerHandler.getInstance()!!.fireEvent(false)
this.overlayPaintable= overlayPaintable
this.highScoresFactoryInterface= highScoresFactoryInterface
this.setDefaultPaintableInterface(paintable)
this.setPaintableInterface(this.getDefaultPaintableInterface())

    
                        if(isContinue)
                        
                                    {
                                    this.addCommand(GameCommandsFactory.getInstance()!!.CONTINUE_COMMAND)

                                    }
                                

    
                        if(ChangedGameFeatureListener.getInstance()!!.isChanged(GameFeatureFactory.getInstance()!!.SOUND))
                        
                                    {
                                    this.mediaInit()

                                    }
                                
this.demoGameRunnable= DemoGameStartupRunnable(this)
DisplayChangeEventHandler.getInstance()!!.addListener(this)
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
            logUtil!!.put(StringMaker().
                            append(commonLabels!!.START_LABEL)!!.append(displayInfoSingleton!!.toString())!!.append(MyFont.getInstance()!!.toString())!!.toString(), this, this.canvasStrings!!.ON_DISPLAY_CHANGE_EVENT)

    var scrollSelectionForm: ScrollSelectionForm = this.getMenuForm()!!
            


    
                        if(scrollSelectionForm != 
                                    null
                                )
                        
                                    {
                                    
    var formType: FormType = FormTypeFactory.getInstance()!!.getFormType()!!
            


    var rectangle: Rectangle = FormUtil.getInstance()!!.createFormRectangle()!!
            

scrollSelectionForm!!.init(rectangle, formType)

                                    }
                                
this.overlayPaintable!!.init()
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, this.canvasStrings!!.ON_DISPLAY_CHANGE_EVENT, e)
}

}


open fun getCustomCommands()
        //nullable = true from not(false or (false and true)) = true
: Array<Command?>{
    var features: Features = Features.getInstance()!!
            


    var gameCommandsFactory: GameCommandsFactory = GameCommandsFactory.getInstance()!!
            


    var htmlFeatureFactory: HTMLFeatureFactory = HTMLFeatureFactory.getInstance()!!
            


    
                        if(features.isDefault(htmlFeatureFactory!!.HTML))
                        
                                    {
                                    
    var commandArray: Array<Command?> = arrayOf(gameCommandsFactory!!.START_COMMAND,HighScoreCommands.getInstance()!!.DISPLAY,GameInputMappingCanvas.DISPLAY,gameCommandsFactory!!.DISPLAY_ABOUT)




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return commandArray

                                    }
                                
                        else {
                            
    var commandList: BasicArrayList = BasicArrayList()

commandList!!.add(gameCommandsFactory!!.START_COMMAND)

    var inApplicationPurchaseFactory: InApplicationPurchaseFactory = InApplicationPurchaseFactory.getInstance()!!
            


    
                        if(inApplicationPurchaseFactory!!.isEnabled())
                        
                                    {
                                    
    var list: BasicArrayList = LockableFeatureFactory.getInstance()!!.getList()!!
            


    
                        if(list.size() > 0 && !inApplicationPurchaseFactory!!.isPurchased(list.get(0) as LockableFeature))
                        
                                    {
                                    commandList!!.add(gameCommandsFactory!!.BUY_COMMAND)

                                    }
                                

                                    }
                                
commandList!!.add(HighScoreCommands.getInstance()!!.DISPLAY)

        try {
            
    var isOverScan: Boolean = OperatingSystemFactory.getInstance()!!.getOperatingSystemInstance()!!.isOverScan()!!
            


    
                        if(SWTUtil.isSWT)
                        
                                    {
                                    commandList!!.add(GameInputMappingCanvas.DISPLAY)

                                    }
                                
                             else 
    
                        if(!isOverScan)
                        
                                    {
                                    commandList!!.add(gameCommandsFactory!!.DISPLAY_OPTIONS)
commandList!!.add(gameCommandsFactory!!.DISPLAY_LOAD_FORM)
commandList!!.add(GameInputMappingCanvas.DISPLAY)

                                    }
                                
} catch(e: Exception)
            {}

commandList!!.add(gameCommandsFactory!!.DISPLAY_ABOUT)

    var commandArray: Array<Command?> = commandList!!.toArray(arrayOfNulls(commandList!!.size())) as Array<Command?>




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return commandArray

                        }
                            
}

override fun initCommands(cmdListener: CommandListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var cmdListener = cmdListener
this.removeAllCommands()

    var commandArray: Array<Command?> = getCustomCommands()!!
            


    var size: Int = commandArray!!.size
                





                        for (index in 0 until size)


        {this.addCommand(commandArray[index]!!)
}

CustomGameMenuUtil.add(this)
this.setCommandListener(cmdListener)
}


                @Throws(Exception::class)
            
open fun initPostPaint()
        //nullable = true from not(false or (false and true)) = true
{}


                @Throws(Exception::class)
            
open fun mediaInit()
        //nullable = true from not(false or (false and true)) = true
{AllBinaryMediaManager.init(EarlySoundsFactory.getInstance())
}

override fun itemStateChanged(item: Item)
        //nullable = true from not(false or (false and false)) = true
{

                    var item = item
ForcedLogUtil.log(commonStrings!!.NOT_IMPLEMENTED, this)
}


                @Throws(Exception::class)
            
open fun initMenu()
        //nullable = true from not(false or (false and true)) = true
{this.close()

    var commandTextItemArrayFactory: CommandTextItemArrayFactory = DemoLimitedCommandTextItemArrayFactory.getInstance()!!.getCommandTextItemArrayFactory()!!
            


    var items: Array<CustomItem?> = commandTextItemArrayFactory!!.getInstance(this.getCommandStack() as Vector<Any>, basicColorFactory!!.BLACK, basicColorFactory!!.WHITE)!!
            


    var formType: FormType = FormTypeFactory.getInstance()!!.getFormType()!!
            


    var rectangle: Rectangle = FormUtil.getInstance()!!.createFormRectangle()!!
            

PreLogUtil.put(StringMaker().
                            append(commonLabels!!.START_LABEL)!!.append(displayInfoSingleton!!.toString())!!.toString(), this, 
                            "initMenu")

    var scrollSelectionForm: ScrollSelectionForm = CommandCurrentSelectionFormFactory.getInstance(StringUtil.getInstance()!!.EMPTY_STRING, items, rectangle, formType, 15, true, basicColorFactory!!.BLACK, basicColorFactory!!.WHITE)!!
            

this.setMenuForm(scrollSelectionForm)

    var formType2: FormType = FormTypeFactory.getInstance()!!.getFormType()!!
            


    var rectangle2: Rectangle = FormUtil.getInstance()!!.createFormRectangle()!!
            

scrollSelectionForm!!.init(rectangle2, formType2)

    
                        if(this.getMenuForm() != ScrollSelectionFormNoneFactory.getInstance())
                        
                                    {
                                    this.setMenuInputProcessor(CommandFormInputProcessor(BasicArrayList(),  -1, this, this.getMenuForm()))

                                    }
                                
this.open()
}

override fun open()
        //nullable = true from not(false or (false and true)) = true
{BasicMotionGesturesHandler.getInstance()!!.addListener(this.getMenuInputProcessor())
GameKeyEventHandler.getInstance()!!.addListener(this.getMenuInputProcessor())
}

override fun close()
        //nullable = true from not(false or (false and true)) = true
{BasicMotionGesturesHandler.getInstance()!!.removeListener(this.getMenuInputProcessor())
GameKeyEventHandler.getInstance()!!.removeListener(this.getMenuInputProcessor())
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
this.addGameKeyEvent(keyCode, false)
}


open fun keyReleased(keyCode: Int, deviceId: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyCode = keyCode


                    var deviceId = deviceId
this.removeGameKeyEvent(keyCode, false)
}


    private var isSingleKeyRepeatableProcessing: Boolean = Features.getInstance()!!.isFeature(InputFeatureFactory.getInstance()!!.SINGLE_KEY_REPEAT_PRESS)!!
            

open fun keyRepeated(keyCode: Int, deviceId: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyCode = keyCode


                    var deviceId = deviceId

    
                        if(this.isSingleKeyRepeatableProcessing)
                        
                                    {
                                    this.addGameKeyEvent(keyCode, true)

                                    }
                                
}


    private val NONE: GameKey = GameKeyFactory.getInstance()!!.NONE

    private val gameKeyEventFactory: GameKeyEventFactory = GameKeyEventFactory.getInstance()!!
            

    private var lastKeyNotMapped: Int =  -1

open fun addGameKeyEvent(keyCode: Int, repeated: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyCode = keyCode


                    var repeated = repeated

        try {
            
    var gameKey: GameKey = this.inputToGameKeyMapping!!.getInstance(this, keyCode)!!
            


    
                        if(gameKey != NONE)
                        
                                    {
                                    
    var gameKeyEvent: GameKeyEvent = gameKeyEventFactory!!.getInstance(this, gameKey)!!
            

DownGameKeyEventHandler.getInstance()!!.fireEvent(gameKeyEvent)

                                    }
                                
                        else {
                            
    
                        if(lastKeyNotMapped != keyCode)
                        
                                    {
                                    lastKeyNotMapped= keyCode
logUtil!!.put(StringMaker().
                            append(this.gameInputStrings!!.NO_KEY)!!.append(keyCode)!!.toString(), this, this.gameInputStrings!!.ADD_KEY_EVENT)

                                    }
                                

                        }
                            
} catch(e: Exception)
            {logUtil!!.put(
                            "Key Event Error", this, this.gameInputStrings!!.ADD_KEY_EVENT, e)
}

}


open fun removeGameKeyEvent(keyCode: Int, repeated: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyCode = keyCode


                    var repeated = repeated

        try {
            
    var gameKey: GameKey = this.inputToGameKeyMapping!!.getInstance(this, keyCode)!!
            


    
                        if(gameKey != NONE)
                        
                                    {
                                    
    var gameKeyEvent: GameKeyEvent = gameKeyEventFactory!!.getInstance(this, gameKey)!!
            

UpGameKeyEventHandler.getInstance()!!.fireEvent(gameKeyEvent)

                                    }
                                
                        else {
                            logUtil!!.put(StringMaker().
                            append(this.gameInputStrings!!.NO_KEY)!!.append(keyCode)!!.toString(), this, this.gameInputStrings!!.REMOVE_KEY_EVENT)

                        }
                            
} catch(e: Exception)
            {logUtil!!.put(
                            "Key Event Error", this, this.gameInputStrings!!.REMOVE_KEY_EVENT, e)
}

}

override fun pause()
        //nullable = true from not(false or (false and true)) = true
{this.close()
this.setPaused(true)
this.gameRunnable= NullWaitGameRunnable.getInstance()
this.gameCanvas!!.pause()
}

override fun unPause()
        //nullable = true from not(false or (false and true)) = true
{this.open()
this.gameCanvas!!.unPause()
this.gameRunnable= this.gameCanvas!!.gameRunnable
this.setPaused(false)
}

override fun isPausable()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
                        if(CurrentDisplayableFactory.getInstance()!!.getUsedRunnable() == NullWaitGameRunnable.getInstance())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}

override fun isGameOver()
        //nullable = true from not(false or (false and true)) = true
: Boolean{logUtil!!.put(StringMaker().
                            append(commonStrings!!.NOT_IMPLEMENTED)!!.append(
                            " since not a game")!!.toString(), this, 
                            "isGameOver")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            override fun setLoadStateHashtable(hashtable: Hashtable<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{

                    var hashtable = hashtable
logUtil!!.put(
                            "Trying to continue a demo lol - only continue a game canvas not the demo", this, 
                            "setLoadStateHashtable")
}


                @Throws(Exception::class)
            override fun getLoadStateHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>{logUtil!!.put(
                            "Trying to continue a demo lol - only continue a game canvas not the demo", this, 
                            "getLoadStateHashtable")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.nullUtil!!.NULL_TABLE
}


                @Throws(Exception::class)
            override fun getCurrentStateHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>{logUtil!!.put(
                            "Trying to save the AI lol", this, 
                            "getCurrentStateHashtable")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.nullUtil!!.NULL_TABLE
}

override fun setHighScoreSubmitted(isNotUsed: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var isNotUsed = isNotUsed
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
this.paintableInterface!!.paint(graphics)
this.paintedSpecialAnimationInterface!!.paint(graphics, 0, 0)
this.highScoresPaintable!!.paint(graphics)
this.getBasicGameDemoPaintable()!!.paint(graphics)
this.overlayPaintable!!.paint(graphics)
this.fullscreenPaintable!!.paint(graphics)
this.progressPaintable!!.paint(graphics)
}

override fun paintThreed(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
this.paintableInterface!!.paintThreed(graphics)
this.paintedSpecialAnimationInterface!!.paintThreed(graphics, 0, 0, 0)
}

override fun setGameOver()
        //nullable = true from not(false or (false and true)) = true
{logUtil!!.put(
                            "Not Implemented since not a game", this, 
                            "setGameOver")
}


open fun demoStateChange()
        //nullable = true from not(false or (false and true)) = true
{
    var newState: Int = this.state +1


    
                        if(newState > 2)
                        
                                    {
                                    newState= 0

                                    }
                                
                             else 
    
                        if(newState == 2)
                        
                                    {
                                    
    
                        if(!this.highScoresHelper!!.isAnyHighScores())
                        
                                    {
                                    newState= 0

                                    }
                                
                        else {
                            
    var highScores: HighScores = this.highScoresHelper!!.getNextHighScores()!!
            


    
                        if(highScores == NullHighScoresSingletonFactory.getInstance())
                        
                                    {
                                    newState= 0

                                    }
                                
                        else {
                            this.getRealHighScoresPaintable()!!.setHighScores(highScores)

                        }
                            

                        }
                            

                                    }
                                
this.setState(newState)
this.setState()
}


    private val SET_STATE: String = "setState"

open fun setState()
        //nullable = true from not(false or (false and true)) = true
{PreLogUtil.put(SmallIntegerSingletonFactory.getInstance()!!.createInstance(this.state)!!.toString(), this, SET_STATE)
this.getBasicGameDemoPaintable()!!.setState(this.state)

    
                        if(this.state == 0)
                        
                                    {
                                    this.highScoresPaintable= NullPaintable.getInstance()
this.paintedSpecialAnimationInterface= this.getSpecialAnimationInterface()

    
                        if(!this.demoGameRunnable!!.isRunning() && gameCanvas!!.isInitialized())
                        
                                    {
                                    this.getSpecialAnimationInterface()!!.reset()

                                    }
                                

                                    }
                                
                             else 
    
                        if(this.state == 1)
                        
                                    {
                                    this.paintedSpecialAnimationInterface= SpecialAnimation.getInstance()

                                    }
                                
                             else 
    
                        if(this.state == 2)
                        
                                    {
                                    this.highScoresPaintable= this.getRealHighScoresPaintable()

                                    }
                                

    var gameAdState: GameAdState = gameAdStateFactory!!.getCurrentInstance()!!
            

gameAdState!!.processPageAdState()
}


                @Throws(Exception::class)
            
open fun getNextRandom()
        //nullable = true from not(false or (false and true)) = true
: Int{


                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


                @Throws(Exception::class)
            
open fun createGameLayerManager(randomValue: Int)
        //nullable = true from not(false or (false and false)) = true
: AllBinaryGameLayerManager{

                    var randomValue = randomValue



                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


                @Throws(Exception::class)
            
open fun createRunnable(randomLevel: Int)
        //nullable = true from not(false or (false and false)) = true
: GameCanvasRunnableInterface{

                    var randomLevel = randomLevel



                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


                @Throws(Exception::class)
            
open fun create()
        //nullable = true from not(false or (false and true)) = true
{PreLogUtil.put(commonStrings!!.START, this, 
                            "create")
this.highScoresPaintable= NullPaintable.getInstance()

    var randomLevel: Int = this.getNextRandom()!!
            

this.gameCanvas= this.createRunnable(randomLevel) as AllBinaryGameCanvas
this.basicColor= this.gameCanvas!!.getLayerManager()!!.getForegroundBasicColor()
this.getRealHighScoresPaintable()!!.setBasicColorP(this.basicColor)
this.gameCanvas!!.setGameCanvasStartListener(this)

    var gameInfo: GameInfo = this.gameCanvas!!.getLayerManager()!!.getGameInfo()!!
            

this.getHighScoresFactoryInterface()!!.fetchHighScores(gameInfo, this.highScoresHelper)
}


                @Throws(Exception::class)
            
open fun start()
        //nullable = true from not(false or (false and true)) = true
{
    var gameCanvas: AllBinaryGameCanvas = this.gameCanvas

PreLogUtil.put(StringMaker().
                            append(
                            "Game Thread in DemoCanvas: ")!!.append(this.stringUtil!!.toString(gameCanvas))!!.toString(), this, commonStrings!!.START)
this.canvasThread= threadFactoryUtil!!.getInstance(gameCanvas)
this.gameCanvas!!.setThread(canvasThread)
this.threadFactoryUtil!!.start(this.canvasThread)

    
                        if(this.getWait() == NullWaitGameRunnable.getInstance()!!.WAIT)
                        
                                    {
                                    this.setWait(this.getTempWait())

                                    }
                                
}


open fun preDemoProcess()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(!gameCanvas!!.isInitialized() || gameCanvas!!.getTitle() == NullGameCanvas.NO_GAME)
                        
                                    {
                                    
    
                        if(AllBinaryMediaManager.update())
                        
                                    {
                                    
    
                        if(!PrimaryPlayerQueueFactory.getInstance()!!.process())
                        
                                    {
                                    SecondaryPlayerQueueFactory.getInstance()!!.process()

                                    }
                                

                                    }
                                

                                    }
                                
this.overlayPaintable!!.update()
}


                @Throws(Exception::class)
            override fun process()
        //nullable = true from not(false or (false and true)) = true
{super.process()
this.getMenuInputProcessor()!!.processInput()
this.preDemoProcess()

    
                        if(this.state == 0)
                        
                                    {
                                    
    var indexedAnimationBehavior: IndexedAnimationBehavior = (this.getSpecialAnimationInterface()!!.getAnimationBehavior() as IndexedAnimationBehavior)


    
                        if(indexedAnimationBehavior!!.loopIndex < 1)
                        
                                    {
                                    timeDelayHelper!!.setStartTime()

                                    }
                                

    var demoGameMidlet: DemoGameMidlet = this.getCustomCommandListener() as DemoGameMidlet


    
                        if(this.gameCanvas != NullGameCanvas.getInstance() && this.gameCanvas!!.isGameOver())
                        
                                    {
                                    this.stopGameDemo()

    var randomLevel: Int = this.getNextRandom()!!
            


    var gameInfo: GameInfo = this.gameCanvas!!.getLayerManager()!!.getGameInfo()!!
            

gameInfo!!.setCurrentLevel(randomLevel)
this.gameCanvas!!.setGameOver(false)
this.start()

                                    }
                                
                             else 
    
                        if(this.gameCanvas == NullGameCanvas.getInstance() && demoGameMidlet!!.isReady())
                        
                                    {
                                    
    
                        if(!demoGameRunnable!!.isRunning())
                        
                                    {
                                    this.startDemoGame()
demoGameRunnable!!.setRunning(true)

    var thread: Thread = threadFactoryUtil!!.getInstance(demoGameRunnable)!!
            

demoGameRunnable!!.setThread(thread)
threadFactoryUtil!!.start(thread)

                                    }
                                

                                    }
                                

                                    }
                                
}


                @Throws(Exception::class)
            
open fun startDemoGame()
        //nullable = true from not(false or (false and true)) = true
{DemoCanvasProgressUtil.showProgress(this)
}


                @Throws(Exception::class)
            
open fun stopGameDemo()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(this.gameCanvas != NullGameCanvas.getInstance())
                        
                                    {
                                    logUtil!!.put(
                            "Set Running False", this, 
                            "stopGameDemo")
this.gameCanvas!!.setRunning(false)

                                    }
                                
ThreadUtil.getInstance()!!.join(this.canvasThread)
}

override fun showGamePaintable()
        //nullable = true from not(false or (false and true)) = true
{
    var METHOD_NAME: String = "showGamePaintable"


    var features: Features = Features.getInstance()!!
            


    var htmlFeatureFactory: HTMLFeatureFactory = HTMLFeatureFactory.getInstance()!!
            

PreLogUtil.put(commonStrings!!.START, this, METHOD_NAME)

    var isDefault: Boolean = features.isDefault(htmlFeatureFactory!!.HTML)!!
            


    
                        if(this.gameCanvas != NullGameCanvas.getInstance() && (this.gameCanvas!!.isRunning() || isDefault || SWTUtil.isSWT) && !(this.gameCanvas!!.getType() == NullGameCanvas.TYPE))
                        
                                    {
                                    this.gameRunnable= this.gameCanvas!!.gameRunnable
PreLogUtil.put(
                            "Showing Game", this, METHOD_NAME)
this.setPaintableInterface(this.gameCanvas)

                                    }
                                
                        else {
                            this.gameRunnable= NullWaitGameRunnable.getInstance()
PreLogUtil.put(
                            "Not Showing Game", this, METHOD_NAME)
this.setPaintableInterface(this.getDefaultPaintableInterface())

                        }
                            
}


open fun isReadyForStateChange()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return !this.demoGameRunnable!!.isRunning() && gameCanvas!!.isInitialized()
}


                @Throws(Exception::class)
            
open fun processGame()
        //nullable = true from not(false or (false and true)) = true
{this.gameRunnable!!.run()

    
                        if(!this.specialAnimationInterface!!.isComplete() && this.isReadyForStateChange())
                        
                                    {
                                    this.specialAnimationInterface!!.nextFrame()

                                    }
                                

    
                        if(timeDelayHelper!!.isTime() && this.isReadyForStateChange())
                        
                                    {
                                    this.demoStateChange()

                                    }
                                
                        else {
                            this.process()

                        }
                            
}

override fun run()
        //nullable = true from not(false or (false and true)) = true
{logUtil!!.put(commonStrings!!.START_RUNNABLE, this, commonStrings!!.RUN)

        try {
            
    var progressCanvas: ProgressCanvas = ProgressCanvasFactory.getInstance()!!
            


    var features: Features = Features.getInstance()!!
            


    var htmlFeatureFactory: HTMLFeatureFactory = HTMLFeatureFactory.getInstance()!!
            


    var openGLFeatureFactory: OpenGLFeatureFactory = OpenGLFeatureFactory.getInstance()!!
            

progressCanvas!!.addPortion(50, 
                            "Demo Thread")
this.setCurrentThread()
this.setRunning(true)

    
                        if(features.isFeature(MainFeatureFactory.getInstance()!!.LOAD_ONDEMAND))
                        
                                    {
                                    progressCanvas!!.end()

                                    }
                                
                        else {
                            progressCanvas!!.addPortion(50, 
                            "Demo Thread Running")

                        }
                            
fullScreenUtil!!.init(this, this.getCustomCommandListener())
this.initMenu()
this.initPostPaint()
this.setState()

    
                        if(features.isDefault(openGLFeatureFactory!!.OPENGL_AS_GAME_THREAD))
                        
                                    {
                                    
        while(gameCanvas == NullGameCanvas.getInstance() || !gameCanvas!!.isInitialized())
        {this.loopTimeHelper!!.setStartTime()
this.processGame()
this.processLoopSleep()
}


    var demoGameRunnable: DemoGameRunnable = DemoGameRunnable(this)


    var currentDisplayableFactory: CurrentDisplayableFactory = CurrentDisplayableFactory.getInstance()!!
            

currentDisplayableFactory!!.setRunnable(demoGameRunnable)
currentDisplayableFactory!!.setMyCanvas(this)
OpenGLThreadUtil.getInstance()!!.onResume()

                                    }
                                

    
                        if(features.isDefault(openGLFeatureFactory!!.OPENGL_AS_GAME_THREAD) || features.isDefault(htmlFeatureFactory!!.HTML))
                        
                                    {
                                    
    var demoGameRunnable: DemoGameRunnable = DemoGameRunnable(this)


    var currentDisplayableFactory: CurrentDisplayableFactory = CurrentDisplayableFactory.getInstance()!!
            

currentDisplayableFactory!!.setRunnable(demoGameRunnable)
currentDisplayableFactory!!.setMyCanvas(this)

                                    }
                                
                        else {
                            
        while(this.isRunning())
        {this.run3()
}

this.end()

                        }
                            
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

logUtil!!.put(commonStrings!!.END_RUNNABLE, this, commonStrings!!.RUN)
}


                @Throws(Exception::class)
            
open fun run3()
        //nullable = true from not(false or (false and true)) = true
{this.loopTimeHelper!!.setStartTime()
this.processGame()
this.processLoopSleep()
}

override fun setRunning(running: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var running = running
super.setRunning(running)

        try {
            
    var features: Features = Features.getInstance()!!
            


    var htmlFeatureFactory: HTMLFeatureFactory = HTMLFeatureFactory.getInstance()!!
            


    var openGLFeatureFactory: OpenGLFeatureFactory = OpenGLFeatureFactory.getInstance()!!
            


    
                        if(running)
                        
                                    {
                                    
                                    }
                                
                        else {
                            
    
                        if((features.isDefault(openGLFeatureFactory!!.OPENGL) || features.isDefault(htmlFeatureFactory!!.HTML)) || SWTUtil.isSWT)
                        
                                    {
                                    
    var currentDisplayableFactory: CurrentDisplayableFactory = CurrentDisplayableFactory.getInstance()!!
            

currentDisplayableFactory!!.clearRunnable()
this.end()

                                    }
                                

                        }
                            
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, SET_RUNNING, e)
}

}


    private val baseGameStatistics: BaseGameStatistics = GameStatisticsFactory.getInstance()!!
            

                @Throws(Exception::class)
            
open fun end()
        //nullable = true from not(false or (false and true)) = true
{
    var progressCanvas: ProgressCanvas = ProgressCanvasFactory.getInstance()!!
            


    var features: Features = Features.getInstance()!!
            

baseGameStatistics!!.add(StringMaker().
                            append(BOT_GAME_STATS)!!.append(baseGameStatistics!!.toString())!!.append(CommonSeps.getInstance()!!.NEW_LINE)!!.toString())
baseGameStatistics!!.init()

    
                        if(features.isFeature(MainFeatureFactory.getInstance()!!.LOAD_ONDEMAND))
                        
                                    {
                                    progressCanvas!!.start()

                                    }
                                
logUtil!!.put(
                            "Demo End", this, commonStrings!!.RUN)
this.close()
DisplayChangeEventHandler.getInstance()!!.removeListener(this)
this.stopGameDemo()
}

override fun setGameState(gameState: GameState)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameState = gameState
}

override fun getGameState()
        //nullable = true from not(false or (false and true)) = true
: GameState{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GameState.PLAYING_GAME_STATE
}


open fun getGameCanvasRunnableInterface()
        //nullable = true from not(false or (false and true)) = true
: AllBinaryGameCanvas{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameCanvas
}


open fun isDemoLoading()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    var gameCanvas: AllBinaryGameCanvas = this.gameCanvas


    
                        if(gameCanvas == NullGameCanvas.getInstance())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                             else 
    
                        if(gameCanvas!!.isInitialized())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


open fun getState()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return state
}


open fun setState(state: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var state = state
this.state= state
}

override fun isHighScoreSubmitted()
        //nullable = true from not(false or (false and true)) = true
: Boolean{logUtil!!.put(
                            "Wow the AI got a high score!", this, 
                            "isHighScoreSubmitted")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun getRealHighScoresPaintable()
        //nullable = true from not(false or (false and true)) = true
: HighScoresPaintable{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return realHighScoresPaintable
}


open fun setSpecialAnimationInterface(specialAnimationInterface: SpecialAnimation)
        //nullable = true from not(false or (false and false)) = true
{

                    var specialAnimationInterface = specialAnimationInterface
specialAnimationInterface!!.setFrame(0)
this.specialAnimationInterface= specialAnimationInterface
}


open fun getSpecialAnimationInterface()
        //nullable = true from not(false or (false and true)) = true
: SpecialAnimation{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return specialAnimationInterface
}


open fun setPaintableInterface(paintableInterface: PaintableInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var paintableInterface = paintableInterface
this.paintableInterface= paintableInterface
}


open fun getPaintableInterface()
        //nullable = true from not(false or (false and true)) = true
: PaintableInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return paintableInterface
}


open fun setDefaultPaintableInterface(defaultPaintableInterface: Paintable)
        //nullable = true from not(false or (false and false)) = true
{

                    var defaultPaintableInterface = defaultPaintableInterface
this.defaultPaintableInterface= defaultPaintableInterface
}


open fun getDefaultPaintableInterface()
        //nullable = true from not(false or (false and true)) = true
: Paintable{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return defaultPaintableInterface
}


open fun getHighScoresFactoryInterface()
        //nullable = true from not(false or (false and true)) = true
: HighScoresFactoryInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return highScoresFactoryInterface
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


open fun getMenuForm()
        //nullable = true from not(false or (false and true)) = true
: ScrollSelectionForm{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return menuForm
}


open fun setMenuForm(menuForm: ScrollSelectionForm)
        //nullable = true from not(false or (false and false)) = true
{

                    var menuForm = menuForm
this.menuForm= menuForm
}

override fun isInitialized()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return initialized
}


open fun getOverlayPaintable()
        //nullable = true from not(false or (false and true)) = true
: Paintable{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return overlayPaintable
}


open fun setBasicGameDemoPaintable(basicGameDemoPaintable: StatePaintable)
        //nullable = true from not(false or (false and false)) = true
{

                    var basicGameDemoPaintable = basicGameDemoPaintable
this.basicGameDemoPaintable= basicGameDemoPaintable
}


open fun getBasicGameDemoPaintable()
        //nullable = true from not(false or (false and true)) = true
: StatePaintable{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return basicGameDemoPaintable
}


open fun setTempWait(tempWait: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var tempWait = tempWait
this.tempWait= tempWait
}


open fun getTempWait()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return tempWait
}

override fun isSingleThread()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return OpenGLFeatureUtil.getInstance()!!.isAnyThreed() || SWTUtil.isSWT
}


open fun isRunningInAnotherThread()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    var features: Features = Features.getInstance()!!
            


    var openGLFeatureFactory: OpenGLFeatureFactory = OpenGLFeatureFactory.getInstance()!!
            


    
                        if(features.isDefault(openGLFeatureFactory!!.OPENGL_AS_GAME_THREAD))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.isRunning()

                        }
                            
}


open fun getGameInitializationInterfaceFactoryInterface()
        //nullable = true from not(false or (false and true)) = true
: BasicBuildGameInitializerFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameInitializationInterfaceFactoryInterface
}

override fun getType()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TYPE
}


}
                
            

