
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
        package org.allbinary.game.midlet




        import java.lang.Object        
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Enumeration
import java.util.Hashtable
import javax.microedition.lcdui.Canvas
import javax.microedition.lcdui.Command
import javax.microedition.lcdui.CommandListener
import javax.microedition.lcdui.Displayable
import org.allbinary.business.advertisement.GameAdStateFactory
import org.allbinary.canvas.FullScreenUtil
import org.allbinary.canvas.GameStatisticsFactory
import org.allbinary.debug.DebugFactory
import org.allbinary.debug.DebugInterface
import org.allbinary.game.GameAdState
import org.allbinary.game.GameInfo
import org.allbinary.game.GameMode
import org.allbinary.game.GameStrings
import org.allbinary.game.GameTypeFactory
import org.allbinary.game.commands.GameCommandsFactory
import org.allbinary.game.configuration.GameOptionsForm
import org.allbinary.game.configuration.GameOptionsFormFactory
import org.allbinary.game.configuration.InGameFeatures
import org.allbinary.game.configuration.InGameOptionsForm
import org.allbinary.game.configuration.InGameOptionsFormFactory
import org.allbinary.game.configuration.LoadGameForm
import org.allbinary.game.configuration.event.ChangedGameFeatureListener
import org.allbinary.game.configuration.event.GameFeatureEventHandler
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.GameFeatureFormUtil
import org.allbinary.game.configuration.feature.HTMLFeatureFactory
import org.allbinary.game.configuration.feature.MainFeatureFactory
import org.allbinary.game.configuration.persistance.GamePersistanceSingleton
import org.allbinary.game.configuration.persistance.KeyValuePersistance
import org.allbinary.game.displayable.canvas.AllBinaryGameCanvas
import org.allbinary.game.displayable.canvas.BasicPaintablesCanvas
import org.allbinary.game.displayable.canvas.DemoCanvas
import org.allbinary.game.displayable.canvas.GameCanvasRunnableInterface
import org.allbinary.game.displayable.canvas.GameEventHandlerUtil
import org.allbinary.game.displayable.canvas.GameInputMappingCanvas
import org.allbinary.game.displayable.canvas.GameInputMappingInstructionsCanvas
import org.allbinary.game.displayable.canvas.MenuListener
import org.allbinary.game.displayable.canvas.NullGameCanvasRunnable
import org.allbinary.game.input.TextNotificationUtil
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.game.layer.hud.event.GameNotificationEventHandler
import org.allbinary.game.paint.help.HelpPaintable
import org.allbinary.game.score.HighScoreCommands
import org.allbinary.game.score.HighScoreCommandsFactory
import org.allbinary.game.score.displayable.HighScoreTextBox
import org.allbinary.game.score.displayable.HighScoreUtil
import org.allbinary.game.score.displayable.HighScoresCanvas
import org.allbinary.game.state.GameState
import org.allbinary.graphics.ResizableListenerHandler
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvas
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvasFactory
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.color.ColorChangeEventHandler
import org.allbinary.graphics.displayable.CanvasStrings
import org.allbinary.graphics.displayable.MyCanvas
import org.allbinary.graphics.displayable.command.MyCommandsFactory
import org.allbinary.graphics.displayable.screen.AboutCommandProcessor
import org.allbinary.graphics.displayable.screen.AboutPaintableFactory
import org.allbinary.graphics.displayable.screen.CommandForm
import org.allbinary.graphics.displayable.screen.WebCommandProcessor
import org.allbinary.input.AllBinarySensorManager
import org.allbinary.input.event.VirtualKeyboardEventHandler
import org.allbinary.input.motion.gesture.observer.BasicMotionGesturesHandler
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.security.licensing.ClientInformationFactory
import org.allbinary.logic.system.security.licensing.InApplicationPurchaseFactory
import org.allbinary.logic.system.security.licensing.LockableFeature
import org.allbinary.logic.system.security.licensing.LockableFeatureFactory
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.media.audio.AllBinaryMediaManager
import org.allbinary.midlet.MidletStrings
import org.allbinary.midlet.ProgressMidlet
import org.allbinary.thread.NullThread
import org.allbinary.thread.ThreadFactoryUtil
import org.allbinary.thread.ThreadUtil
import org.allbinary.time.TimeDelayHelper
import org.allbinary.util.BasicArrayList

open public class GameMidlet : ProgressMidlet
                , CommandListener {
        

    val basicColorFactory: BasicColorFactory = BasicColorFactory.getInstance()!!
            

    val features: Features = Features.getInstance()!!
            

    val htmlFeatureFactory: HTMLFeatureFactory = HTMLFeatureFactory.getInstance()!!
            

    val midletStrings: MidletStrings = MidletStrings.getInstance()!!
            

    val myCommandsFactory: MyCommandsFactory = MyCommandsFactory.getInstance()!!
            

    val gameStrings: GameStrings = GameStrings.getInstance()!!
            

    val gameAdStateFactory: GameAdStateFactory = GameAdStateFactory.getInstance()!!
            

    private val DISPLAYABLE: String = " Displayable: "

    private val COMMAND_NAME: String = "command Name/Label: "

    private val NO_COMMAND: String = "No Command"

    private val NO_DISPLAYABLE: String = "No Displayable"

    private val COMMAND_ACTION: String = StringMaker().
                            append(
                            "GameMidlet::")!!.append(midletStrings!!.COMMAND_ACTION)!!.toString()!!
            

    private val PAUSE_APP_BACKGROUND: String = "pauseAppBackground"

    private val UN_PAUSE_APP_BACKGROUND: String = "unPauseAppBackground"

    private val aboutCommandProcessor: AboutCommandProcessor = AboutCommandProcessor.getInstance()!!
            

    private val webCommandProcessor: WebCommandProcessor = WebCommandProcessor.getInstance()!!
            

    private val gameMidletStateFactory: GameMidletStateFactory = GameMidletStateFactory.getInstance()!!
            

    val gameStartTimeHelper: TimeDelayHelper = TimeDelayHelper(240)

    private val fullScreenUtil: FullScreenUtil = FullScreenUtil.getInstance()!!
            

    private val debugInterface: DebugInterface

    private var allbinaryGameCanvasRunnableInterface: GameCanvasRunnableInterface = NullGameCanvasRunnable.NULL_GAME_CANVAS_RUNNABLE

    private var thread: Thread = NullThread.NULL_THREAD

    private var loadGameForm: CommandForm = CommandForm.NULL_COMMAND_FORM

    private var isFullScreen: Boolean= false

    private var resized: Boolean= false
public constructor        (clientInformationFactory: ClientInformationFactory)                        

                            : super(clientInformationFactory){

                    var clientInformationFactory = clientInformationFactory


                            //For kotlin this is before the body of the constructor.
                    
SmallIntegerSingletonFactory.getInstance()!!.init(0x291, 6)

    var progressCanvas: ProgressCanvas = ProgressCanvasFactory.getInstance()!!
            

progressCanvas!!.init(this)
GameFeatureEventHandler.getInstance()!!.addListener(ChangedGameFeatureListener.getInstance())
GamePersistanceSingleton.getInstance()!!.clear()
this.debugInterface= DebugFactory.getInstance()
this.init()
}


open fun init()
        //nullable = true from not(false or (false and true)) = true
{}


                @Throws(Exception::class)
            
open fun setDemo()
        //nullable = true from not(false or (false and true)) = true
{


                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


                @Throws(Exception::class)
            
open fun createGame()
        //nullable = true from not(false or (false and true)) = true
{


                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


                @Throws(Exception::class)
            
open fun mediaShutdown()
        //nullable = true from not(false or (false and true)) = true
{


                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


open fun stopAll()
        //nullable = true from not(false or (false and true)) = true
{}

override fun pauseApp()
        //nullable = true from not(false or (false and true)) = true
{this.pauseAppBackground(true)

    var gameAdState: GameAdState = gameAdStateFactory!!.getCurrentInstance()!!
            

gameAdState!!.getAdvertisements()!!.stopAll()
}


open fun pauseAppBackground(background: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var background = background
logUtil!!.put(commonStrings!!.START, this, PAUSE_APP_BACKGROUND)

    
                        if(allbinaryGameCanvasRunnableInterface != NullGameCanvasRunnable.NULL_GAME_CANVAS_RUNNABLE)
                        
                                    {
                                    allbinaryGameCanvasRunnableInterface!!.pause()

                                    }
                                
                        else {
                            logUtil!!.put(
                            "<<<<<< Null", this, PAUSE_APP_BACKGROUND)

                        }
                            
AllBinarySensorManager.getInstance()!!.shutdown()
}


open fun unPauseApp()
        //nullable = true from not(false or (false and true)) = true
{this.unPauseAppBackground(true)

    var gameAdState: GameAdState = gameAdStateFactory!!.getCurrentInstance()!!
            

gameAdState!!.getAdvertisements()!!.startAll()
}


open fun unPauseAppBackground(background: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var background = background
logUtil!!.put(commonStrings!!.START, this, UN_PAUSE_APP_BACKGROUND)
AllBinarySensorManager.getInstance()!!.init()

    var gameCanvasRunnableInterface: GameCanvasRunnableInterface = this.allbinaryGameCanvasRunnableInterface


    
                        if(gameCanvasRunnableInterface != NullGameCanvasRunnable.NULL_GAME_CANVAS_RUNNABLE)
                        
                                    {
                                    gameCanvasRunnableInterface!!.unPause()

                                    }
                                
                        else {
                            logUtil!!.put(
                            "<<<<<< Null", this, UN_PAUSE_APP_BACKGROUND)

                        }
                            
}

override fun destroyApp(unconditional: Boolean, isProgress: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var unconditional = unconditional


                    var isProgress = isProgress

    var progressCanvas: ProgressCanvas = ProgressCanvasFactory.getInstance()!!
            


    
                        if(isProgress)
                        
                                    {
                                    progressCanvas!!.start()
this.commandAction(myCommandsFactory!!.SET_DISPLAYABLE, progressCanvas)

                                    }
                                
this.destroyApp(unconditional)

    
                        if(isProgress)
                        
                                    {
                                    progressCanvas!!.end()

                                    }
                                
}

override fun destroyApp(unconditional: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var unconditional = unconditional

    var METHOD_NAME: String = "GameMidlet::destroyApp"


        try {
            PreLogUtil.put(GameStatisticsFactory.getInstance()!!.toString(), this, METHOD_NAME)

    var gameAdState: GameAdState = gameAdStateFactory!!.getCurrentInstance()!!
            

gameAdState!!.getAdvertisements()!!.stopAll()

    
                        if(!this.isDestroyed())
                        
                                    {
                                    this.stopGameCanvasRunnableInterface()
this.setGameCanvasRunnableInterface(NullGameCanvasRunnable.NULL_GAME_CANVAS_RUNNABLE)
this.mediaShutdown()

                                    }
                                
                        else {
                            logUtil!!.put(
                            "Midlet Managment Error: Midlet Should Only Be Destroyed Once", this, METHOD_NAME)

                        }
                            
super.destroyApp(true)
PreLogUtil.put(commonStrings!!.END, this, METHOD_NAME)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, METHOD_NAME, e)
}

logUtil!!.put(commonStrings!!.END, this, METHOD_NAME)
}

override fun startApp()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    var gameAdState: GameAdState = gameAdStateFactory!!.getCurrentInstance()!!
            

gameAdState!!.getAdvertisements()!!.startAll()

    var START_APP: String = "startApp"

logUtil!!.put(commonStrings!!.START, this, START_APP)

    var gameCanvasRunnableInterface: GameCanvasRunnableInterface = this.allbinaryGameCanvasRunnableInterface


    
                        if(gameCanvasRunnableInterface == NullGameCanvasRunnable.NULL_GAME_CANVAS_RUNNABLE)
                        
                                    {
                                    gameMidletStateFactory!!.setCurrentGameState(GameState.NO_GAME_STATE)
this.setDemo()

                                    }
                                
                        else {
                            logUtil!!.put(
                            "GameCanvasRunnableInterface is available", this, START_APP)

    
                        if(gameCanvasRunnableInterface == this.getCurrentDisplayable())
                        
                                    {
                                    this.unPauseAppBackground(false)

                                    }
                                
                        else {
                            logUtil!!.put(
                            "GameCanvasRunnableInterface is not current displayable", this, START_APP)

                        }
                            

                        }
                            
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "startApp", e)
destroyApp(false)
notifyDestroyed()
}

}

override fun commandAction(command: Command, displayable: Displayable)
        //nullable = true from not(false or (false and false)) = true
{

                    var command = command


                    var displayable = displayable

        try {
            
    var displayableAsString: String = NO_DISPLAYABLE


    
                        if(displayable != 
                                    null
                                )
                        
                                    {
                                    displayableAsString= displayable.toString()

                                    }
                                

    var label: String = NO_COMMAND


    
                        if(command != 
                                    null
                                )
                        
                                    {
                                    label= command.getLabel()

                                    }
                                
PreLogUtil.put(StringMaker().
                            append(COMMAND_NAME)!!.append(label)!!.append(DISPLAYABLE)!!.append(displayableAsString)!!.toString(), this, this.COMMAND_ACTION)

    var gameCommandsFactory: GameCommandsFactory = GameCommandsFactory.getInstance()!!
            


    
                        if(command == gameCommandsFactory!!.SHOW_GAME_CANVAS)
                        
                                    {
                                    
    
                        if(this.getDisplay()!!.getCurrent() != this.allbinaryGameCanvasRunnableInterface && this.allbinaryGameCanvasRunnableInterface!!.getType() != NullGameCanvasRunnable.NULL_GAME_CANVAS_RUNNABLE.getType())
                        
                                    {
                                    this.setDisplay(this.allbinaryGameCanvasRunnableInterface as Displayable)

                                    }
                                
this.unPauseAppBackground(false)

                                    }
                                
                             else 
    
                        if(command == gameCommandsFactory!!.CLOSE_AND_SHOW_GAME_CANVAS)
                        
                                    {
                                    
    var menuListener: MenuListener = displayable as MenuListener

menuListener!!.close()
this.setDisplay(this.allbinaryGameCanvasRunnableInterface as Displayable)
this.unPauseAppBackground(false)

                                    }
                                
                             else 
    
                        if(command == gameCommandsFactory!!.EXIT_COMMAND)
                        
                                    {
                                    
    
                        if(GameMidletEventHandler.getInstance()!!.getEventListenerInterfaceListP()!!.size() == 0)
                        
                                    {
                                    this.exit(true)

                                    }
                                
GameMidletEventHandler.getInstance()!!.fireEvent(DemoGameMidletEvent(this, DemoGameMidletStateFactory.getInstance()!!.NONE))

                                    }
                                
                             else 
    
                        if(command == gameCommandsFactory!!.EXIT_WITHOUT_PROGRESS_COMMAND)
                        
                                    {
                                    this.exit(false)

                                    }
                                
                             else 
    
                        if(command == gameCommandsFactory!!.START_COMMAND || command == gameCommandsFactory!!.RESTART_COMMAND || command == gameCommandsFactory!!.CONTINUE_COMMAND)
                        
                                    {
                                    
    
                        if(gameMidletStateFactory!!.getCurrentGameState() != GameState.PLAYING_GAME_STATE || command == gameCommandsFactory!!.RESTART_COMMAND)
                        
                                    {
                                    
    
                        if(this.gameStartTimeHelper!!.isTime())
                        
                                    {
                                    
    
                        if(command == gameCommandsFactory!!.START_COMMAND && this.isDemoLoading())
                        
                                    {
                                    logUtil!!.put(
                            "Trying to Start Game Before Loading Complete", this, midletStrings!!.COMMAND_ACTION)

                                    }
                                
                        else {
                            this.startedBefore= true
this.createGame()
gameMidletStateFactory!!.setCurrentGameState(GameState.PLAYING_GAME_STATE)

                        }
                            

                                    }
                                
                        else {
                            logUtil!!.put(
                            "Starting Game Too Often", this, midletStrings!!.COMMAND_ACTION)

                        }
                            

                                    }
                                
                        else {
                            logUtil!!.put(
                            "Already in playing state", this, COMMAND_ACTION)

                        }
                            

                                    }
                                
                             else 
    
                        if(command == gameCommandsFactory!!.BUY_COMMAND)
                        
                                    {
                                    
    var inApplicationPurchaseFactory: InApplicationPurchaseFactory = InApplicationPurchaseFactory.getInstance()!!
            


    var list: BasicArrayList = LockableFeatureFactory.getInstance()!!.getList()!!
            


    var lockableFeature: LockableFeature = list.get(0) as LockableFeature


    
                        if(list.size() > 0 && !inApplicationPurchaseFactory!!.isPurchased(lockableFeature))
                        
                                    {
                                    inApplicationPurchaseFactory!!.purchase(lockableFeature)

                                    }
                                
                        else {
                            TextNotificationUtil.getInstance()!!.fireSuccess(
                            "Already Purchased")

                        }
                            

                                    }
                                
                             else 
    
                        if(command == gameCommandsFactory!!.QUIT_COMMAND)
                        
                                    {
                                    
    
                        if(this.gameStartTimeHelper!!.isTime())
                        
                                    {
                                    
    
                        if(displayable is HighScoreTextBox)
                        
                                    {
                                    
    var menuListener: MenuListener = displayable as MenuListener

menuListener!!.close()

                                    }
                                
this.stopGameCanvasRunnableInterface()
gameMidletStateFactory!!.setCurrentGameState(GameState.NO_GAME_STATE)
this.setDemo()

                                    }
                                

                                    }
                                
                             else 
    
                        if(command == myCommandsFactory!!.RESUME_COMMAND)
                        
                                    {
                                    this.unPauseAppBackground(false)

                                    }
                                
                             else 
    
                        if(command == myCommandsFactory!!.PAUSE_COMMAND)
                        
                                    {
                                    this.pauseAppBackground(false)

                                    }
                                
                             else 
    
                        if(command == myCommandsFactory!!.SET_DISPLAYABLE)
                        
                                    {
                                    this.pauseAppBackground(false)
this.setDisplay(displayable)

                                    }
                                
                             else 
    
                        if(command == gameCommandsFactory!!.SET_MENU_DISPLAYABLE)
                        
                                    {
                                    this.pauseAppBackground(false)

    var menuListener: MenuListener = displayable as MenuListener

menuListener!!.open()
this.setDisplay(displayable)

                                    }
                                
                             else 
    
                        if(command == gameCommandsFactory!!.START_TRACE)
                        
                                    {
                                    this.debugInterface!!.start()

    var gameCanvas: AllBinaryGameCanvas = this.allbinaryGameCanvasRunnableInterface as AllBinaryGameCanvas

gameCanvas!!.addCommand(gameCommandsFactory!!.STOP_TRACE)
gameCanvas!!.removeCommand(gameCommandsFactory!!.START_TRACE)

                                    }
                                
                             else 
    
                        if(command == gameCommandsFactory!!.STOP_TRACE)
                        
                                    {
                                    this.pauseAppBackground(false)
this.debugInterface!!.stop()
this.unPauseAppBackground(false)

    var gameCanvas: AllBinaryGameCanvas = this.allbinaryGameCanvasRunnableInterface as AllBinaryGameCanvas

gameCanvas!!.addCommand(gameCommandsFactory!!.START_TRACE)
gameCanvas!!.removeCommand(gameCommandsFactory!!.STOP_TRACE)

                                    }
                                
                             else 
    
                        if(command == gameCommandsFactory!!.DEFAULT_OPTIONS)
                        
                                    {
                                    
    var tempDisplayable: Displayable = displayable


    
                        if(tempDisplayable is GameOptionsForm)
                        
                                    {
                                    GameFeatureFormUtil.getInstance()!!.setDefault(tempDisplayable as CommandForm)

                                    }
                                

                                    }
                                
                             else 
    
                        if(command == GameInputMappingInstructionsCanvas.DISPLAY)
                        
                                    {
                                    
    var tempDisplayable: Displayable = displayable


    
                        if(tempDisplayable is GameInputMappingCanvas)
                        
                                    {
                                    
    var gameInputMappingCanvas: GameInputMappingCanvas = tempDisplayable as GameInputMappingCanvas

gameInputMappingCanvas!!.update()

                                    }
                                
this.commandAction(gameCommandsFactory!!.SET_MENU_DISPLAYABLE, this.getInputMappingInstructionsCanvas())

                                    }
                                
                             else 
    
                        if(HighScoreCommandsFactory.getInstance()!!.isHighScoreCommand(command))
                        
                                    {
                                    
    var tempDisplayable: Displayable = displayable


    
                        if(tempDisplayable is HighScoresCanvas)
                        
                                    {
                                    
    var highScoresCanvas: HighScoresCanvas = tempDisplayable as HighScoresCanvas

highScoresCanvas!!.updateCommand(command)

                                    }
                                

                                    }
                                
                             else 
    
                        if(command == HighScoreCommands.getInstance()!!.DISPLAY)
                        
                                    {
                                    this.commandAction(gameCommandsFactory!!.SET_MENU_DISPLAYABLE, this.createHighScoresCanvas())

                                    }
                                
                             else 
    
                        if(command == GameInputMappingInstructionsCanvas.CLOSE)
                        
                                    {
                                    
    var menuListener: MenuListener = displayable as MenuListener

menuListener!!.close()
this.commandAction(GameInputMappingCanvas.DISPLAY, MyCanvas.NULL_MY_CANVAS)

                                    }
                                
                             else 
    
                        if(command == GameInputMappingCanvas.DISPLAY)
                        
                                    {
                                    
    
                        if(features.isDefault(htmlFeatureFactory!!.HTML))
                        
                                    {
                                    this.pauseAppBackground(false)

                                    }
                                
this.commandAction(gameCommandsFactory!!.SET_MENU_DISPLAYABLE, this.getInputMappingCanvas())

                                    }
                                
                             else 
    
                        if(command == GameInputMappingCanvas.DEFAULT)
                        
                                    {
                                    
    var tempDisplayable: Displayable = displayable


    
                        if(tempDisplayable is GameInputMappingCanvas)
                        
                                    {
                                    
    var gameInputMappingCanvas: GameInputMappingCanvas = tempDisplayable as GameInputMappingCanvas

gameInputMappingCanvas!!.setDefault()

                                    }
                                

                                    }
                                
                             else 
    
                        if(command == InGameOptionsForm.DISPLAY)
                        
                                    {
                                    this.pauseAppBackground(false)

    var progressCanvas: ProgressCanvas = ProgressCanvasFactory.getInstance()!!
            

progressCanvas!!.addPortion(50, 
                            "In Game Options")

    var layerManager: AllBinaryGameLayerManager = this.createGameLayerManager()!!
            

InGameOptionsFormFactory.getInstance()!!.init(this, InGameFeatures(), 
                            "Options In Game", layerManager!!.getBackgroundBasicColor(), layerManager!!.getForegroundBasicColor())

    var inGameOptionsForm: InGameOptionsForm = InGameOptionsFormFactory.getInstance()!!.get() as InGameOptionsForm

inGameOptionsForm!!.setItemStateListener(this.allbinaryGameCanvasRunnableInterface)
this.commandAction(gameCommandsFactory!!.SET_MENU_DISPLAYABLE, inGameOptionsForm)

                                    }
                                
                             else 
    
                        if(command == InGameOptionsForm.DEFAULT)
                        
                                    {
                                    
    var inGameOptionsForm: InGameOptionsForm = InGameOptionsFormFactory.getInstance()!!.get() as InGameOptionsForm

GameFeatureFormUtil.getInstance()!!.setDefault(inGameOptionsForm)

                                    }
                                
                             else 
    
                        if(command == gameCommandsFactory!!.DISPLAY_OPTIONS)
                        
                                    {
                                    AllBinaryMediaManager.setMuted(true)
this.stopAll()

    var mainFeatureFactory: MainFeatureFactory = MainFeatureFactory.getInstance()!!
            

isFullScreen= features.isFeature(mainFeatureFactory!!.FULL_SCREEN)
ResizableListenerHandler.getInstance()!!.fireEvent(true)
this.setResized(false)
this.commandAction(gameCommandsFactory!!.SET_MENU_DISPLAYABLE, this.getGameOptionsForm())

                                    }
                                
                             else 
    
                        if(command == gameCommandsFactory!!.CLOSE_OPTIONS)
                        
                                    {
                                    ResizableListenerHandler.getInstance()!!.fireEvent(false)
this.commandAction(gameCommandsFactory!!.CLOSE_AND_SHOW_GAME_CANVAS, displayable)

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "Close isFullScreen/change: ")
stringBuffer!!.append(isFullScreen)
stringBuffer!!.append(fullScreenUtil!!.isScreenChange(isFullScreen))
stringBuffer!!.append(
                            " isResized: ")
stringBuffer!!.append(this.isResized())
PreLogUtil.put(stringBuffer!!.toString(), this, COMMAND_ACTION)

    
                        if(this.isResized() || fullScreenUtil!!.isScreenChange(isFullScreen))
                        
                                    {
                                    this.updateFullScreen()

                                    }
                                
AllBinaryMediaManager.setMuted(false)

                                    }
                                
                             else 
    
                        if(command == gameCommandsFactory!!.DISPLAY_LOAD_FORM)
                        
                                    {
                                    this.pauseAppBackground(false)

    var keyValuePersistance: KeyValuePersistance = GamePersistanceSingleton.getInstance()!!
            

keyValuePersistance!!.clear()
keyValuePersistance!!.loadAll(abeClientInformation)

    
                        if(this.getLoadGameForm() == CommandForm.NULL_COMMAND_FORM)
                        
                                    {
                                    
    var layerManager: AllBinaryGameLayerManager = this.createGameLayerManager()!!
            

this.setLoadGameForm(LoadGameForm(this, 
                            "Load Game", layerManager!!.getBackgroundBasicColor(), layerManager!!.getForegroundBasicColor()))

                                    }
                                
                        else {
                            this.getLoadGameForm()!!.update()

                        }
                            
this.commandAction(gameCommandsFactory!!.SET_MENU_DISPLAYABLE, this.getLoadGameForm())

                                    }
                                
                             else 
    
                        if(command == gameCommandsFactory!!.LOAD_FILE)
                        
                                    {
                                    
    var index: Int = this.getLoadGameForm()!!.getSelectedId()!!
            


    
                        if(index !=  -1)
                        
                                    {
                                    
    var keyValuePersistance: KeyValuePersistance = GamePersistanceSingleton.getInstance()!!
            

this.setStartStateHashtable(keyValuePersistance!!.get(index))

    var menuListener: MenuListener = this.getLoadGameForm()!!
            

menuListener!!.close()
PreLogUtil.put(BasicMotionGesturesHandler.getInstance()!!.toString(), this, COMMAND_ACTION)
this.commandAction(gameCommandsFactory!!.START_COMMAND, MyCanvas.NULL_MY_CANVAS)
PreLogUtil.put(BasicMotionGesturesHandler.getInstance()!!.toString(), this, COMMAND_ACTION)

                                    }
                                

                                    }
                                
                             else 
    
                        if(command == gameCommandsFactory!!.DELETE_FILE)
                        
                                    {
                                    
    var index: Int = this.getLoadGameForm()!!.getSelectedText()!!
            


    
                        if(index !=  -1)
                        
                                    {
                                    
    var keyValuePersistance: KeyValuePersistance = GamePersistanceSingleton.getInstance()!!
            

keyValuePersistance!!.delete(abeClientInformation, index)
keyValuePersistance!!.clear()
keyValuePersistance!!.loadAll(abeClientInformation, 1)
this.getLoadGameForm()!!.update()

                                    }
                                

                                    }
                                
                             else 
    
                        if(command == gameCommandsFactory!!.SAVE)
                        
                                    {
                                    
    var keyValuePersistance: KeyValuePersistance = GamePersistanceSingleton.getInstance()!!
            

this.pauseAppBackground(false)
keyValuePersistance!!.save(abeClientInformation, this.getCurrentStateHashtable())
this.unPauseAppBackground(false)

                                    }
                                
                             else 
    
                        if(command == HighScoreUtil.SUBMIT_TEXTBOX_COMMAND)
                        
                                    {
                                    logUtil!!.put(
                            "Submitted Score", this, COMMAND_ACTION)

    
                        if(displayable is HighScoreTextBox)
                        
                                    {
                                    
    var menuListener: HighScoreTextBox = displayable as HighScoreTextBox

menuListener!!.submitted= true

                                    }
                                
this.allbinaryGameCanvasRunnableInterface!!.setHighScoreSubmitted(true)
this.commandAction(gameCommandsFactory!!.CLOSE_AND_SHOW_GAME_CANVAS, displayable)

                                    }
                                
                             else 
    
                        if(command == gameCommandsFactory!!.DISPLAY_ABOUT)
                        
                                    {
                                    this.aboutCommandProcessor!!.process(this, gameCommandsFactory!!.SET_MENU_DISPLAYABLE, this.getAboutCanvas())

                                    }
                                
                             else 
    
                        if(command == gameCommandsFactory!!.OPEN_WEB_URL)
                        
                                    {
                                    this.webCommandProcessor!!.process(this, gameCommandsFactory!!.OPEN_WEB_URL, MyCanvas.NULL_MY_CANVAS)

                                    }
                                
                             else 
    
                        if(command == gameCommandsFactory!!.TOGGLE_KEYBOARD)
                        
                                    {
                                    
    var virtualKeyboardEventHandler: VirtualKeyboardEventHandler = VirtualKeyboardEventHandler.getInstance()!!
            

virtualKeyboardEventHandler!!.fireEvent(virtualKeyboardEventHandler!!.SHOW_EVENT)

                                    }
                                
                             else 
    
                        if(command.getLabel()!!.compareTo(gameCommandsFactory!!.TOGGLE_FULLSCREEN.getLabel()) == 0)
                        
                                    {
                                    
    var mainFeatureFactory: MainFeatureFactory = MainFeatureFactory.getInstance()!!
            


    var isFullScreen: Boolean = features.isFeature(mainFeatureFactory!!.FULL_SCREEN)!!
            


    
                        if(isFullScreen)
                        
                                    {
                                    features.removeDefault(mainFeatureFactory!!.FULL_SCREEN)

                                    }
                                
                        else {
                            features.addDefault(mainFeatureFactory!!.FULL_SCREEN)

                        }
                            
this.updateFullScreen()

                                    }
                                
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, midletStrings!!.COMMAND_ACTION, e)

    
                        if(command != GameCommandsFactory.getInstance()!!.EXIT_COMMAND)
                        
                                    {
                                    this.exit(false)

                                    }
                                
}

}


open fun updateFullScreen()
        //nullable = true from not(false or (false and true)) = true
{
    var mainFeatureFactory: MainFeatureFactory = MainFeatureFactory.getInstance()!!
            


    var isFullScreen: Boolean = features.isFeature(mainFeatureFactory!!.FULL_SCREEN)!!
            


    var displayable: Displayable = this.getDisplay()!!.getCurrent()!!
            


    
                        if(displayable is Canvas)
                        
                                    {
                                    
    var canvas: Canvas = displayable as Canvas

canvas.setFullScreenMode(isFullScreen)

                                    }
                                
}


open fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{

                    var eventObject = eventObject
ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}


                @Throws(Exception::class)
            
open fun getInputMappingInstructionsCanvas()
        //nullable = true from not(false or (false and true)) = true
: MyCanvas{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GameInputMappingInstructionsCanvas(this, this.createGameLayerManager())
}


                @Throws(Exception::class)
            
open fun getInputMappingCanvas()
        //nullable = true from not(false or (false and true)) = true
: MyCanvas{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GameInputMappingCanvas(abeClientInformation, this, this.createGameLayerManager(), this.getHelpPaintable())
}


                @Throws(Exception::class)
            
open fun getAboutCanvas()
        //nullable = true from not(false or (false and true)) = true
: MyCanvas{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BasicPaintablesCanvas(this, CanvasStrings.getInstance()!!.ABOUT, this.createGameLayerManager(), AboutPaintableFactory.getInstance()!!.paintableArray)
}


                @Throws(Exception::class)
            
open fun getHelpPaintable()
        //nullable = true from not(false or (false and true)) = true
: HelpPaintable{


                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


                @Throws(Exception::class)
            
open fun createHighScoresCanvas()
        //nullable = true from not(false or (false and true)) = true
: HighScoresCanvas{


                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


                @Throws(Exception::class)
            
open fun startGameCanvasRunnableInterface()
        //nullable = true from not(false or (false and true)) = true
{
    var threadFactoryUtil: ThreadFactoryUtil = ThreadFactoryUtil.getInstance()!!
            

thread= threadFactoryUtil!!.getInstance(this.allbinaryGameCanvasRunnableInterface)
logUtil!!.put(StringMaker().
                            append(
                            "Thread Priority: ")!!.append(thread.getPriority())!!.toString(), this, 
                            "startGameCanvasRunnableInterface")
this.allbinaryGameCanvasRunnableInterface!!.setThread(thread)
threadFactoryUtil!!.start(thread)
}


                @Throws(Exception::class)
            
open fun stopGameCanvasRunnableInterface()
        //nullable = true from not(false or (false and true)) = true
{logUtil!!.put(commonStrings!!.START, this, gameStrings!!.STOP_GAME_CANVAS_RUNNABLE_INTERFACE)
GameNotificationEventHandler.getInstance()!!.removeAllListeners()
ColorChangeEventHandler.getInstance()!!.removeAllListeners()
GameEventHandlerUtil.removeAllListeners()

    var gameCanvasRunnableInterface: GameCanvasRunnableInterface = this.allbinaryGameCanvasRunnableInterface


    
                        if(gameCanvasRunnableInterface != NullGameCanvasRunnable.NULL_GAME_CANVAS_RUNNABLE)
                        
                                    {
                                    logUtil!!.put(
                            "Set Running False", this, gameStrings!!.STOP_GAME_CANVAS_RUNNABLE_INTERFACE)
gameCanvasRunnableInterface!!.setRunning(false)

                                    }
                                
                        else {
                            logUtil!!.put(
                            "StopGame - Could Not Stop", this, gameStrings!!.STOP_GAME_CANVAS_RUNNABLE_INTERFACE)

                        }
                            
ThreadUtil.getInstance()!!.join(this.thread)

    var progressCanvas: ProgressCanvas = ProgressCanvasFactory.getInstance()!!
            


    
                        if(features.isFeature(MainFeatureFactory.getInstance()!!.LOAD_ALL))
                        
                                    {
                                    progressCanvas!!.addPortion(50, 
                            "Stopped Game Runnable")

                                    }
                                
                        else {
                            progressCanvas!!.addPortion(50, 
                            "Stopped Main Runnable")

                        }
                            
logUtil!!.put(commonStrings!!.END, this, gameStrings!!.STOP_GAME_CANVAS_RUNNABLE_INTERFACE)
}


open fun getGameCanvasRunnableInterface()
        //nullable = true from not(false or (false and true)) = true
: GameCanvasRunnableInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return allbinaryGameCanvasRunnableInterface
}


open fun setGameCanvasRunnableInterface(gameCanvasRunnableInterface: GameCanvasRunnableInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameCanvasRunnableInterface = gameCanvasRunnableInterface
this.allbinaryGameCanvasRunnableInterface= gameCanvasRunnableInterface
}


open fun createGameLayerManager()
        //nullable = true from not(false or (false and true)) = true
: AllBinaryGameLayerManager{
    var gameInfo: GameInfo = GameInfo(GameTypeFactory.getInstance()!!.SINGLE_PLAYER, GameMode.SERVER, 1, 1)




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AllBinaryGameLayerManager(basicColorFactory!!.BLACK, basicColorFactory!!.WHITE, gameInfo)
}


open fun getGameOptionsForm()
        //nullable = true from not(false or (false and true)) = true
: CommandForm{
    var layerManager: AllBinaryGameLayerManager = this.createGameLayerManager()!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GameOptionsFormFactory.getInstance()!!.init(this, 
                            "Game Options", layerManager!!.getBackgroundBasicColor(), layerManager!!.getForegroundBasicColor())
}


                @Throws(Exception::class)
            
open fun save()
        //nullable = true from not(false or (false and true)) = true
{logUtil!!.put(commonStrings!!.START, this, commonStrings!!.SAVE)

    var hashtable: Hashtable<Any, Any> = this.getCurrentStateHashtable()!!
            

GamePersistanceSingleton.getInstance()!!.save(abeClientInformation, hashtable)
}


                @Throws(Exception::class)
            override fun getCurrentStateHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>{logUtil!!.put(commonStrings!!.START, this, 
                            "getCurrentStateHashtable")

    var hashtable: Hashtable<Any, Any> = Hashtable<Any, Any>()


    
                        if(allbinaryGameCanvasRunnableInterface != NullGameCanvasRunnable.NULL_GAME_CANVAS_RUNNABLE)
                        
                                    {
                                    
    var currentHashtable: Hashtable<Any, Any> = this.allbinaryGameCanvasRunnableInterface!!.getCurrentStateHashtable()!!
            


    var enumeration: Enumeration<Any?> = currentHashtable!!.keys()!!
            


    var key: Any


        while(enumeration.hasMoreElements())
        {key= enumeration.nextElement()!!
hashtable.put(key, currentHashtable!!.get(key as Object?))
}


                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashtable
}


open fun setLoadGameForm(loadGameForm: LoadGameForm)
        //nullable = true from not(false or (false and false)) = true
{

                    var loadGameForm = loadGameForm
this.loadGameForm= loadGameForm
}


open fun getLoadGameForm()
        //nullable = true from not(false or (false and true)) = true
: LoadGameForm{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return loadGameForm as LoadGameForm
}


open fun setResized(resized: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var resized = resized
this.resized= resized
}


open fun isResized()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return resized
}


    private var startedBefore: Boolean = false

open fun isDemoLoading()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
                        if(startedBefore)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                

    var displayable: Displayable = this.getDisplay()!!.getCurrent()!!
            


    
                        if(displayable is DemoCanvas)
                        
                                    {
                                    
    var demoCanvas: DemoCanvas = displayable as DemoCanvas


    
                        if(demoCanvas!!.isDemoLoading())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

