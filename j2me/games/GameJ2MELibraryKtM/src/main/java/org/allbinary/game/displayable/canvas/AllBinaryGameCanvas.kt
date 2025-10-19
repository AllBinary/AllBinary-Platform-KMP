
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
        
        import java.lang.Integer
        
        import java.lang.System
        
        import java.lang.Runnable
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import java.util.Vector
import javax.microedition.lcdui.ChoiceGroup
import javax.microedition.lcdui.CommandListener
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.Item
import javax.microedition.lcdui.NullCommandListener
import org.allbinary.AndroidUtil
import org.allbinary.business.advertisement.GameAdStateFactory
import org.allbinary.canvas.BaseGameStatistics
import org.allbinary.canvas.GameStatisticsFactory
import org.allbinary.canvas.Processor
import org.allbinary.canvas.RunnableCanvas
import org.allbinary.debug.DebugFactory
import org.allbinary.debug.NoDebug
import org.allbinary.game.GameAdState
import org.allbinary.game.GameInfo
import org.allbinary.game.GameStrings
import org.allbinary.game.GameTypeFactory
import org.allbinary.game.Intermission
import org.allbinary.game.IntermissionCompositeInterface
import org.allbinary.game.IntermissionEnableListenerInterface
import org.allbinary.game.IntermissionInterface
import org.allbinary.game.commands.GameCommandsFactory
import org.allbinary.game.configuration.InGameFeatures
import org.allbinary.game.configuration.InGameOptionsForm
import org.allbinary.game.configuration.event.ChangedGameFeatureListener
import org.allbinary.game.configuration.event.GameInitializedEvent
import org.allbinary.game.configuration.event.GameInitializedEventHandler
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.GameFeatureFactory
import org.allbinary.game.configuration.feature.GameFeatureUtil
import org.allbinary.game.configuration.feature.HTMLFeatureFactory
import org.allbinary.game.configuration.feature.InputFeatureFactory
import org.allbinary.game.configuration.feature.MainFeatureFactory
import org.allbinary.game.configuration.feature.SensorFeatureFactory
import org.allbinary.game.configuration.feature.TouchFeatureFactory
import org.allbinary.game.displayable.GameLevelDisplayChangeEventListenersFactory
import org.allbinary.game.init.BasicBuildGameInitializerFactory
import org.allbinary.game.init.GameInitializationUtil
import org.allbinary.game.input.GameInputStrings
import org.allbinary.game.input.InputProcessor
import org.allbinary.game.input.NoPlayerGameInput
import org.allbinary.game.input.PlayerGameInput
import org.allbinary.game.input.event.GameKeyEventHandler
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.game.layer.SWTUtil
import org.allbinary.game.paint.ColorFillBasePaintable
import org.allbinary.game.paint.ColorFillPaintableFactory
import org.allbinary.game.resource.ResourceLoadingLevel
import org.allbinary.game.resource.ResourceLoadingLevelFactory
import org.allbinary.game.score.HighScore
import org.allbinary.game.score.HighScoresFactoryInterface
import org.allbinary.game.score.HighScoresHelperBase
import org.allbinary.game.score.HighScoresPaintable
import org.allbinary.game.score.NoHighScoresFactory
import org.allbinary.game.score.NullHighScoresSingletonFactory
import org.allbinary.game.score.displayable.HighScoreTextBox
import org.allbinary.game.state.GameState
import org.allbinary.game.state.GameStateFactory
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.ScreenCapture
import org.allbinary.graphics.ScreenCaptureFactory
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvas
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvasFactory
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.color.BasicColorSetUtil
import org.allbinary.graphics.displayable.CanvasStrings
import org.allbinary.graphics.displayable.GameTickDisplayInfoSingleton
import org.allbinary.graphics.displayable.command.MyCommandsFactory
import org.allbinary.graphics.displayable.event.DisplayChangeEvent
import org.allbinary.graphics.displayable.event.DisplayChangeEventHandler
import org.allbinary.graphics.displayable.event.DisplayChangeEventListener
import org.allbinary.graphics.form.CommandCurrentSelectionFormFactory
import org.allbinary.graphics.form.FormPaintable
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
import org.allbinary.graphics.paint.NullInitUpdatePaintable
import org.allbinary.graphics.paint.NullPaintable
import org.allbinary.graphics.paint.Paintable
import org.allbinary.graphics.paint.PaintableInterface
import org.allbinary.image.opengles.OpenGLImageSpecificFactory
import org.allbinary.input.gyro.SensorGameUpdateProcessor
import org.allbinary.input.gyro.SingleSensorGameUpdateProcessor
import org.allbinary.input.motion.button.BaseTouchInput
import org.allbinary.input.motion.button.NoButtonsTouchInputFactory
import org.allbinary.input.motion.button.TouchButtonFactory
import org.allbinary.input.motion.button.TouchButtonsPaintableFactory
import org.allbinary.input.motion.button.TouchScreenFactory
import org.allbinary.input.motion.gesture.observer.BasicMotionGesturesHandler
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.system.os.OperatingSystemFactory
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.media.audio.AllBinaryMediaManager
import org.allbinary.media.audio.PlayerQueue
import org.allbinary.media.audio.PrimaryPlayerQueueFactory
import org.allbinary.media.audio.SecondaryPlayerQueueFactory
import org.allbinary.media.audio.SelectSound
import org.allbinary.string.CommonSeps
import org.allbinary.thread.SecondaryThreadPool
import org.allbinary.time.GameTickTimeDelayHelper
import org.allbinary.time.GameTickTimeDelayHelperFactory
import org.allbinary.time.TimeDelayHelper
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListUtil

open public class AllBinaryGameCanvas : RunnableCanvas
                , AllBinaryGameCanvasInterface
                , GameCanvasRunnableInterface
                , MenuListener
                , IntermissionCompositeInterface
                , IntermissionEnableListenerInterface
                , PopupMenuInterface
                , DisplayChangeEventListener {
        
companion object {
            
    private val id: Int = 0

    val SHOW_END_RESULT_GAME_STATE: GameState = GameStateFactory.getInstance("SHOW_END_RESULT_GAME_STATE")!!

    val SHOW_HIGH_SCORE_GAME_STATE: GameState = GameStateFactory.getInstance("SHOW_HIGH_SCORE_GAME_STATE")!!

    val TYPE: Int = 2

        }
            
    val basicColorFactory: BasicColorFactory = BasicColorFactory.getInstance()!!

    val basicSetColorUtil: BasicColorSetUtil = BasicColorSetUtil.getInstance()!!

    val touchFeatureFactory: TouchFeatureFactory = TouchFeatureFactory.getInstance()!!

    val openGLFeatureFactory: OpenGLFeatureFactory = OpenGLFeatureFactory.getInstance()!!

    val touchButtonFactory: TouchButtonFactory = TouchButtonFactory.getInstance()!!

    val gameAdStateFactory: GameAdStateFactory = GameAdStateFactory.getInstance()!!

    val gameStrings: GameStrings = GameStrings.getInstance()!!

    val gameInputStrings: GameInputStrings = GameInputStrings.getInstance()!!

    private val gameTickTimeDelayHelper: GameTickTimeDelayHelper = GameTickTimeDelayHelperFactory.getInstance()!!

    private val gameTickDisplayInfoSingleton: GameTickDisplayInfoSingleton = GameTickDisplayInfoSingleton.getInstance()!!

    val gameRunnable: GameCanvasRunnable = GameCanvasRunnable(this)

    val gamePauseRunnable: GameCanvasPauseRunnable = GameCanvasPauseRunnable(this)

    var gameSpecificPaintable: Paintable = NullPaintable.getInstance()!!

    private val sensorGameUpdateProcessor: SensorGameUpdateProcessor = SingleSensorGameUpdateProcessor()

    var endGameInfo: EndGameInfo = EndGameInfo()

    private val startIntermissionInterface: IntermissionInterface = Intermission()

    private val endLevelIntermissionInterface: IntermissionInterface = Intermission()

    var gameLayerManager: AllBinaryGameLayerManager = AllBinaryGameLayerManager.NULL_ALLBINARY_LAYER_MANAGER

    private var gameState: GameState = GameState.NO_GAME_STATE

    private var gameOver: Boolean= false

    private var initialized: Boolean= false

    private val gameStateTimeHelper: TimeDelayHelper = TimeDelayHelper(0)

    val highScoresHelper: HighScoresHelperBase

    private var highScoreSubmitted: Boolean= false

    private val realHighScoresPaintable: HighScoresPaintable = HighScoresPaintable()

    private var highScoresPaintable: Paintable = NullPaintable.getInstance()!!

    private var localPlayerGameInputList: BasicArrayList = BasicArrayList()

    private var isCheating: Boolean= false

    private var hashtable: Hashtable<Any, Any> = this.nullUtil!!.NULL_TABLE

    private var isSingleKeyRepeatableProcessing: Boolean= false

    private var gameInitializationInterfaceFactoryInterface: BasicBuildGameInitializerFactory = BasicBuildGameInitializerFactory.NULL_BASE_BUILD_GMAE_INITIALIZER_FACTORY

    private var touchButtonsPaintable: Paintable = NullPaintable.getInstance()!!

    var touchPaintable: Paintable = NullPaintable.getInstance()!!

    private var cheatProcessor: PlayerGameInput = NoPlayerGameInput.getInstance()!!

    private var gameInputProcessor: Processor = Processor.getInstance()!!

    private var endGameProcessor: Processor = Processor.getInstance()!!

    private var realEndGameProcessor: Processor = Processor.getInstance()!!

    private var startIntermissionProcessor: Processor = Processor.getInstance()!!

    private var realStartIntermissionProcessor: Processor = Processor.getInstance()!!

    private var endGamePaintable: Paintable = NullPaintable.getInstance()!!

    private var endGameStatePaintable: Paintable = NullPaintable.getInstance()!!

    var nonBotPaintable: Paintable = NullPaintable.getInstance()!!

    private var intermissionPaintable: Paintable = NullPaintable.getInstance()!!

    private var startIntermissionPaintable: InitUpdatePaintable = NullInitUpdatePaintable.getInstance()!!

    private var mainStateProcessor: Processor = Processor.getInstance()!!

    private var processGameProcessor: Processor = Processor.getInstance()!!

    private val highScoresFactoryInterface: HighScoresFactoryInterface

    private var startLevel: Int= 0

    private var mainMenuInputProcessor: BasicMenuInputProcessor = NoMenuInputProcessor.getInstance()!!

    private var popupMenuInputProcessor: BasicMenuInputProcessor = NoMenuInputProcessor.getInstance()!!

    private var menuInputProcessor: BasicMenuInputProcessor = NoMenuInputProcessor.getInstance()!!

    private var menuForm: ScrollSelectionForm = ScrollSelectionForm.NULL_SCROLL_SELECTION_FORM

    private var formPaintable: Paintable = NullPaintable.getInstance()!!

    private var openMenuPaintable: Paintable = NullPaintable.getInstance()!!

    private var menuPaintable: Paintable = NullPaintable.getInstance()!!

    private var currentTouchInputFactory: BaseTouchInput = NoButtonsTouchInputFactory.getInstance()!!

    var colorFillPaintable: ColorFillBasePaintable = ColorFillPaintableFactory.getInstance()!!.getInstance(basicColorFactory!!.BLACK, true)!!

    private val baseGameStatistics: BaseGameStatistics = GameStatisticsFactory.getInstance()!!

    private val primaryPlayerQueue: PlayerQueue = PrimaryPlayerQueueFactory.getInstance()!!

    private val secondaryPlayerQueue: PlayerQueue = SecondaryPlayerQueueFactory.getInstance()!!

    val BUILD_GAME: String = "buildGame"

    val gameTypeFactory: GameTypeFactory = GameTypeFactory.getInstance()!!

    val screenCapture: ScreenCapture = ScreenCaptureFactory.getInstance()!!

    private val basicMotionGesturesHandler: BasicMotionGesturesHandler = BasicMotionGesturesHandler.getInstance()!!

    private val gameKeyEventHandler: GameKeyEventHandler = GameKeyEventHandler.getInstance()!!

    private val gameBehavior: DemoGameBehavior

    private val menuBehavior: BaseMenuBehavior

    private var progressPaintable: PaintableInterface = ProgressCanvasFactory.getLazyInstance()!!
public constructor (commandListener: CommandListener, gameLayerManager: AllBinaryGameLayerManager, highScoresFactoryInterface: HighScoresFactoryInterface, gameInitializationInterfaceFactoryInterface: BasicBuildGameInitializerFactory, buffered: Boolean)                        

                            : super(commandListener, CanvasStrings.getInstance()!!.EMPTY_CHILD_NAME_LIST){
    //var commandListener = commandListener
    //var gameLayerManager = gameLayerManager
    //var highScoresFactoryInterface = highScoresFactoryInterface
    //var gameInitializationInterfaceFactoryInterface = gameInitializationInterfaceFactoryInterface
    //var buffered = buffered


                            //For kotlin this is before the body of the constructor.
                    
this.highScoresHelper= highScoresFactoryInterface!!.createHighScoresHelper()
this.gameInitializationInterfaceFactoryInterface= gameInitializationInterfaceFactoryInterface
this.init(gameLayerManager, buffered)
this.highScoresFactoryInterface= highScoresFactoryInterface

    
                        if(this.gameLayerManager!!.getGameInfo()!!.getGameType() == gameTypeFactory!!.BOT)
                        
                                    {
                                    this.gameBehavior= DemoGameBehavior.getInstance()
this.menuBehavior= BaseMenuBehavior.getInstance()

                                    }
                                
                        else {
                            this.gameBehavior= BaseGameBehavior.getInstance()
this.menuBehavior= this.getInGameMenuBehavior()

                        }
                            
this.initSpecialPaint()
this.initPopupMenu()
this.initMenu()
DisplayChangeEventHandler.getInstance()!!.addListener(this)
}

public constructor (gameLayerManager: AllBinaryGameLayerManager){
    //var gameLayerManager = gameLayerManager
this.highScoresHelper= NoHighScoresFactory.getInstance()!!.createHighScoresHelper()

    
                        if(this.gameLayerManager!!.getGameInfo()!!.getGameType() == gameTypeFactory!!.BOT)
                        
                                    {
                                    this.gameBehavior= DemoGameBehavior.getInstance()
this.menuBehavior= BaseMenuBehavior.getInstance()

                                    }
                                
                        else {
                            this.gameBehavior= BaseGameBehavior.getInstance()
this.menuBehavior= this.getInGameMenuBehavior()

                        }
                            
this.gameLayerManager= gameLayerManager
this.highScoresFactoryInterface= NoHighScoresFactory.getInstance()
}

public constructor (){
this.highScoresHelper= NoHighScoresFactory.getInstance()!!.createHighScoresHelper()
this.gameBehavior= DemoGameBehavior.getInstance()
this.menuBehavior= BaseMenuBehavior.getInstance()
this.highScoresFactoryInterface= NoHighScoresFactory.getInstance()
}


    open fun getInGameMenuBehavior()
        //nullable = true from not(false or (false and true)) = true
: BaseMenuBehavior{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return InGameMenuBehavior.getInstance()
}


    override fun setCurrentThread()
        //nullable = true from not(false or (false and true)) = true
{

    var features: Features = Features.getInstance()!!


    var htmlFeatureFactory: HTMLFeatureFactory = HTMLFeatureFactory.getInstance()!!


    
                        if(features.isDefault(htmlFeatureFactory!!.HTML))
                        
                                    {
                                    super.setCurrentThreadFake()

                                    }
                                
                        else {
                            super.setCurrentThread()

                        }
                            
}


    override fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{
    //var eventObject = eventObject
ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}


    override fun onDisplayChangeEvent(displayChangeEvent: DisplayChangeEvent)
        //nullable = true from not(false or (false and false)) = true
{
    //var displayChangeEvent = displayChangeEvent

        try {
            this.menuBehavior!!.onDisplayChangeEvent(this, displayChangeEvent)
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, this.canvasStrings!!.ON_DISPLAY_CHANGE_EVENT, e)
}

}


                @Throws(Exception::class)
            
    open fun updateMenu(displayChangeEvent: DisplayChangeEvent)
        //nullable = true from not(false or (false and false)) = true
{
    //var displayChangeEvent = displayChangeEvent

    var formUtil: FormUtil = FormUtil.getInstance()!!


    var popupMenuRectangle: Rectangle = formUtil!!.createPopupMenuRectangle()!!


    var basicPopupMenuPaintable: BasicPopupMenuPaintable = (this.getOpenMenuPaintable() as BasicPopupMenuPaintable)

basicPopupMenuPaintable!!.init(popupMenuRectangle)

    
                        if(this.getPopupMenuInputProcessor() != NoMenuInputProcessor.getInstance())
                        
                                    {
                                    
    var popupMenuInputProcessor: PopupMenuInputProcessor = (this.getPopupMenuInputProcessor() as PopupMenuInputProcessor)

popupMenuInputProcessor!!.init(popupMenuRectangle)

                                    }
                                

    var formType: FormType = FormTypeFactory.getInstance()!!.getFormType()!!


    var rectangle: Rectangle = formUtil!!.createFormRectangle()!!

this.menuForm!!.init(rectangle, formType)

    
                        if(this.currentTouchInputFactory != NoButtonsTouchInputFactory.getInstance())
                        
                                    {
                                    touchButtonFactory!!.toggle(this.isPaused(), this.currentTouchInputFactory!!.getList())

                                    }
                                
}


                @Throws(Exception::class)
            
    override fun processSleep()
        //nullable = true from not(false or (false and true)) = true
{
super.processSleep()

    
                        if(AllBinaryMediaManager.update())
                        
                                    {
                                    
    
                        if(!primaryPlayerQueue!!.process())
                        
                                    {
                                    secondaryPlayerQueue!!.process()

                                    }
                                

                                    }
                                

    
                        if(this.menuInputProcessor!!.processInput() !=  -1)
                        
                                    {
                                    this.runnableCanvasRefreshHelper!!.process()

                                    }
                                
}


                @Throws(Exception::class)
            
    open fun initPopupMenu()
        //nullable = true from not(false or (false and true)) = true
{

    var features: Features = Features.getInstance()!!


    var popupMenuRectangle: Rectangle = FormUtil.getInstance()!!.createPopupMenuRectangle()!!


    
                        if(features.isFeature(touchFeatureFactory!!.TOUCH_ENABLED))
                        
                                    {
                                    this.setOpenMenuPaintable(BasicPopupMenuPaintable(popupMenuRectangle, this.gameLayerManager!!.getBackgroundBasicColor(), this.gameLayerManager!!.getForegroundBasicColor()))
this.setPopupMenuInputProcessor(PopupMenuInputProcessor(BasicArrayList(),  -1, this, popupMenuRectangle))

                                    }
                                
}


    open fun initMenu()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            this.menuBehavior!!.initMenu(this)
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "initMenu", e)
}

}


                @Throws(Exception::class)
            
    open fun initMenu2()
        //nullable = true from not(false or (false and true)) = true
{
this.closeMenu()

    var formUtil: FormUtil = FormUtil.getInstance()!!


    var formType: FormType = FormTypeFactory.getInstance()!!.getFormType()!!


    var gameLimitedCommandTextItemArrayFactory: GameLimitedCommandTextItemArrayFactory = GameLimitedCommandTextItemArrayFactory.getInstance()!!


    var commandTextItemArrayFactory: CommandTextItemArrayFactory = gameLimitedCommandTextItemArrayFactory!!.getCommandTextItemArrayFactory()!!


    var items: Array<CustomItem?> = commandTextItemArrayFactory!!.getInstance(this.getCommandStack() as Vector<Any>, this.gameLayerManager!!.getBackgroundBasicColor(), this.gameLayerManager!!.getForegroundBasicColor())!!


    var rectangle: Rectangle = formUtil!!.createFormRectangle()!!

this.setMenuForm(CommandCurrentSelectionFormFactory.getInstance(StringUtil.getInstance()!!.EMPTY_STRING, items, rectangle, formType, 25, false, this.gameLayerManager!!.getBackgroundBasicColor(), this.gameLayerManager!!.getForegroundBasicColor()))

    var scrollSelectionForm: ScrollSelectionForm = this.getMenuForm()!!


    var features: Features = Features.getInstance()!!


    
                        if(features.isFeature(touchFeatureFactory!!.TOUCH_ENABLED))
                        
                                    {
                                    this.mainMenuInputProcessor= PopupCommandFormInputProcessor(BasicArrayList(),  -1, this, scrollSelectionForm, this.getPopupMenuInputProcessor() as PopupMenuInputProcessor)

                                    }
                                
                        else {
                            
                        }
                            
this.setMenuInputProcessor(this.getPopupMenuInputProcessor())

    
                        if(scrollSelectionForm != ScrollSelectionFormNoneFactory.getInstance())
                        
                                    {
                                    this.setFormPaintable(FormPaintable(scrollSelectionForm))

                                    }
                                
                        else {
                            
                        }
                            
this.closeMenu()
}


    open fun updateMenu()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            this.menuBehavior!!.updateMenu(this)
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "initMenu", e)
}

}


                @Throws(Exception::class)
            
    open fun updateMenu2()
        //nullable = true from not(false or (false and true)) = true
{

    var scrollSelectionForm: ScrollSelectionForm = this.getMenuForm()!!

scrollSelectionForm!!.deleteAll()

    var gameLimitedCommandTextItemArrayFactory: GameLimitedCommandTextItemArrayFactory = GameLimitedCommandTextItemArrayFactory.getInstance()!!


    var commandTextItemArrayFactory: CommandTextItemArrayFactory = gameLimitedCommandTextItemArrayFactory!!.getCommandTextItemArrayFactory()!!


    var items: Array<CustomItem?> = commandTextItemArrayFactory!!.getInstance(this.getCommandStack() as Vector<Any>, this.gameLayerManager!!.getBackgroundBasicColor(), this.gameLayerManager!!.getForegroundBasicColor())!!


    var size: Int = items.size
                





                        for (index in 0 until size)

        {
scrollSelectionForm!!.append(items[index]!!)
}


    var formUtil: FormUtil = FormUtil.getInstance()!!


    var formType: FormType = FormTypeFactory.getInstance()!!.getFormType()!!


    var rectangle: Rectangle = formUtil!!.createFormRectangle()!!

scrollSelectionForm!!.init(rectangle, formType)
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    override fun pause()
        //nullable = true from not(false or (false and true)) = true
{
this.gameBehavior!!.pause(this)
this.closeMenu()
super.pause()
touchButtonFactory!!.toggle(this.isPaused(), BasicArrayListUtil.getInstance()!!.getImmutableInstance())
System.gc()
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    override fun unPause()
        //nullable = true from not(false or (false and true)) = true
{
logUtil!!.put(commonStrings!!.START, this, gameStrings!!.UNPAUSE)
this.closeMenu()
System.gc()
super.unPause()
touchButtonFactory!!.toggle(this.isPaused(), BasicArrayListUtil.getInstance()!!.getImmutableInstance())
this.gameBehavior!!.unPause(this)
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


                @Throws(Exception::class)
            
    override fun popupMenu()
        //nullable = true from not(false or (false and true)) = true
{
this.menuBehavior!!.popupMenu(this)
}


                @Throws(Exception::class)
            
    open fun popupMenu2()
        //nullable = true from not(false or (false and true)) = true
{
primaryPlayerQueue!!.add(SelectSound.getInstance())
this.setMenuPaintable(this.getFormPaintable())
this.setMenuInputProcessor(this.mainMenuInputProcessor)
this.basicMotionGesturesHandler!!.addListener(this.mainMenuInputProcessor)
this.gameKeyEventHandler!!.addListener(this.mainMenuInputProcessor)
}


                @Throws(Exception::class)
            
    override fun toggleMenu()
        //nullable = true from not(false or (false and true)) = true
{
logUtil!!.put(commonStrings!!.START, this, this.gameStrings!!.TOGGLE_MENU)

    
                        if(this.getMenuPaintable() == this.getOpenMenuPaintable())
                        
                                    {
                                    this.pause()
this.updateMenu()
this.popupMenu()

                                    }
                                
                             else 
    
                        if(this.getMenuPaintable() == this.getFormPaintable())
                        
                                    {
                                    primaryPlayerQueue!!.add(SelectSound.getInstance())
this.unPause()

                                    }
                                
}


    override fun closeMenu()
        //nullable = true from not(false or (false and true)) = true
{
this.menuBehavior!!.closeMenu(this)
}


    open fun closeMenu2()
        //nullable = true from not(false or (false and true)) = true
{
this.setMenuPaintable(this.getOpenMenuPaintable())
this.basicMotionGesturesHandler!!.removeListener(this.mainMenuInputProcessor)
this.gameKeyEventHandler!!.removeListener(this.mainMenuInputProcessor)
this.setMenuInputProcessor(this.getPopupMenuInputProcessor())
}


    override fun open()
        //nullable = true from not(false or (false and true)) = true
{
this.basicMotionGesturesHandler!!.addListener(this.menuInputProcessor)
this.gameKeyEventHandler!!.addListener(this.menuInputProcessor)
}


    override fun close()
        //nullable = true from not(false or (false and true)) = true
{
this.basicMotionGesturesHandler!!.removeListener(this.menuInputProcessor)
this.gameKeyEventHandler!!.removeListener(this.menuInputProcessor)
primaryPlayerQueue!!.clear()
secondaryPlayerQueue!!.clear()
}


                @Throws(Exception::class)
            
    open fun processorInit()
        //nullable = true from not(false or (false and true)) = true
{
this.setMainStateProcessor(Processor.getInstance())
this.setProcessGameProcessor(GameProcessor(this))
}


    open fun initSpecialPaint()
        //nullable = true from not(false or (false and true)) = true
{
this.menuBehavior!!.initSpecialPaint(this)
}


                @Throws(Exception::class)
            
    open fun init(gameLayerManager: AllBinaryGameLayerManager, buffered: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var gameLayerManager = gameLayerManager
var buffered = buffered
this.gameStateTimeHelper!!.setStartTime()
this.setHighScoreSubmitted(false)
this.setLayerManager(gameLayerManager)

    
                        if(!buffered)
                        
                                    {
                                    
    var BUFF_MESSAGE: String = "XXX Not Buffering Causes Concurrency Issues XXX"

logUtil!!.put(BUFF_MESSAGE, this, commonStrings!!.CONSTRUCTOR)

                                    }
                                
                        else {
                            


                            throw Exception("Buffering is disabled")

                        }
                            
this.setGameInputProcessor(Processor.getInstance())

    var features: Features = Features.getInstance()!!


    
                        if(features.isFeature(GameFeatureFactory.getInstance()!!.CHEATING))
                        
                                    {
                                    this.isCheating= true
this.cheatProcessor= CheatGameInputProcessor(this)
this.gameKeyEventHandler!!.addListener(this.cheatProcessor)

                                    }
                                
                        else {
                            this.isCheating= false
this.cheatProcessor= NoPlayerGameInput.getInstance()

                        }
                            
this.realEndGameProcessor= EndGameProcessor(this)
this.setEndGameProcessor(Processor.getInstance())
this.realStartIntermissionProcessor= StartIntermissionProcessor(this)
this.startIntermissionProcessor= Processor.getInstance()
this.setEndGameStatePaintable(EndGamePaintable(this))
this.setEndGamePaintable(NullPaintable.getInstance())
this.setIntermissionPaintable(NullPaintable.getInstance())
this.getStartIntermissionInterface()!!.setListener(this)
}


    override fun notifyIntermission(enable: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var enable = enable

    
                        if(enable)
                        
                                    {
                                    this.startIntermissionProcessor= this.realStartIntermissionProcessor

                                    }
                                
                        else {
                            this.startIntermissionProcessor= Processor.getInstance()

                        }
                            

    
                        if(enable)
                        
                                    {
                                    this.setIntermissionPaintable(this.getStartIntermissionPaintable())

                                    }
                                
                        else {
                            this.setIntermissionPaintable(NullPaintable.getInstance())

                        }
                            
}


                @Throws(Exception::class)
            
    open fun mediaInit()
        //nullable = true from not(false or (false and true)) = true
{
ForcedLogUtil.log(commonStrings!!.NOT_IMPLEMENTED, this)
}


                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun initConfigurable(abeClientInformation: AbeClientInformationInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var abeClientInformation = abeClientInformation

    var progressCanvas: ProgressCanvas = ProgressCanvasFactory.getInstance()!!

progressCanvas!!.addPortion(50, "Setting Configurables")
GameInitializationUtil.getInstance()!!.initGame(abeClientInformation, this, gameInitializationInterfaceFactoryInterface)

    var gameFeatureFactory: GameFeatureFactory = GameFeatureFactory.getInstance()!!


    var changedGameFeatureListener: ChangedGameFeatureListener = ChangedGameFeatureListener.getInstance()!!


    
                        if(changedGameFeatureListener!!.isChanged(gameFeatureFactory!!.SOUND))
                        
                                    {
                                    
    var features: Features = Features.getInstance()!!

logUtil!!.put(StringMaker().
                            append("Sound Changing To: ")!!.append(features.isFeature(gameFeatureFactory!!.SOUND))!!.toString(), this, "initConfigurable")
this.mediaInit()
changedGameFeatureListener!!.remove(gameFeatureFactory!!.SOUND)

                                    }
                                

    var sensorFeatureFactory: SensorFeatureFactory = SensorFeatureFactory.getInstance()!!


    
                        if(changedGameFeatureListener!!.isChanged(sensorFeatureFactory!!.ORIENTATION_SENSORS) || changedGameFeatureListener!!.isChanged(sensorFeatureFactory!!.NO_ORIENTATION) || changedGameFeatureListener!!.isChanged(sensorFeatureFactory!!.SIMULATED_ORIENTATION_SENSORS))
                        
                                    {
                                    changedGameFeatureListener!!.remove(sensorFeatureFactory!!.NO_ORIENTATION)
changedGameFeatureListener!!.remove(sensorFeatureFactory!!.ORIENTATION_SENSORS)
changedGameFeatureListener!!.remove(sensorFeatureFactory!!.SIMULATED_ORIENTATION_SENSORS)

                                    }
                                

    var resourceLoadingLevelFactory: ResourceLoadingLevelFactory = ResourceLoadingLevelFactory.getInstance()!!

this.loadResources(resourceLoadingLevelFactory!!.LOAD_GAME)
}


                @Throws(Exception::class)
            
    open fun init(abeClientInformation: AbeClientInformationInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var abeClientInformation = abeClientInformation
this.initConfigurable(abeClientInformation)
this.processorInit()
this.sensorGameUpdateProcessor!!.process(this.gameLayerManager)
this.sensorGameUpdateProcessor!!.sendNotifications(this.gameLayerManager)
this.initTouch()
}


                @Throws(Exception::class)
            
    open fun initTouch()
        //nullable = true from not(false or (false and true)) = true
{

    var gameInitializedEvent: GameInitializedEvent = GameInitializationUtil.getInstance()!!.EVENT


    var resourceLoadingLevelFactory: ResourceLoadingLevelFactory = ResourceLoadingLevelFactory.getInstance()!!

gameInitializedEvent!!.setResourceLoadingLevel(resourceLoadingLevelFactory!!.LOAD_TOUCH)
GameInitializedEventHandler.getInstance()!!.fireEvent(gameInitializedEvent)
touchButtonFactory!!.defaultList()
this.updateTouch()
this.postInitTouch()
}


                @Throws(Exception::class)
            
    open fun updateCurrentTouchInputFactory(nextTouchInput: BaseTouchInput)
        //nullable = true from not(false or (false and false)) = true
{
    //var nextTouchInput = nextTouchInput

    
                        if(nextTouchInput != this.currentTouchInputFactory)
                        
                                    {
                                    this.currentTouchInputFactory= nextTouchInput
PreLogUtil.put(this.currentTouchInputFactory!!.toString(), this, this.gameInputStrings!!.UDPATE_CURRENT_TOUCH_INPUT_FACTORY)
touchButtonFactory!!.toggle(this.isPaused(), this.currentTouchInputFactory!!.getList())

                                    }
                                
}


                @Throws(Exception::class)
            
    open fun updateTouch()
        //nullable = true from not(false or (false and true)) = true
{
this.gameBehavior!!.updateTouch(this)
}


                @Throws(Exception::class)
            
    open fun updateTouch2()
        //nullable = true from not(false or (false and true)) = true
{

    var features: Features = Features.getInstance()!!


    
                        if(features.isFeature(touchFeatureFactory!!.AUTO_HIDE_SHOW_SCREEN_BUTTONS))
                        
                                    {
                                    
    
                        if(this.gameLayerManager!!.getGameInfo()!!.getCurrentLevel() -getStartLevel() == 1)
                        
                                    {
                                    this.setTouchPaintableP(NullPaintable.getInstance())

                                    }
                                

                                    }
                                
}


                @Throws(Exception::class)
            
    open fun postInitTouch()
        //nullable = true from not(false or (false and true)) = true
{
this.setTouchButtonsPaintable(TouchButtonsPaintableFactory.getInstance(this.gameLayerManager!!.getForegroundBasicColor()))
this.updateScreenButtonPaintable()
}


    override fun initCommands(cmdListener: CommandListener)
        //nullable = true from not(false or (false and false)) = true
{
var cmdListener = cmdListener
this.removeAllCommands()
this.addCommands()
this.setCommandListener(cmdListener)
}


    open fun addCommands()
        //nullable = true from not(false or (false and true)) = true
{

    var gameCommandsFactory: GameCommandsFactory = GameCommandsFactory.getInstance()!!


    var myCommandsFactory: MyCommandsFactory = MyCommandsFactory.getInstance()!!


    var htmlFeatureFactory: HTMLFeatureFactory = HTMLFeatureFactory.getInstance()!!


    
                        if(DebugFactory.getInstance() != NoDebug.getInstance())
                        
                                    {
                                    this.addCommand(gameCommandsFactory!!.START_TRACE)

                                    }
                                
this.addCommand(gameCommandsFactory!!.RESTART_COMMAND)
this.addCommand(myCommandsFactory!!.PAUSE_COMMAND)
this.addCommand(gameCommandsFactory!!.QUIT_COMMAND)

    var isOverScan: Boolean = OperatingSystemFactory.getInstance()!!.getOperatingSystemInstance()!!.isOverScan()!!


    var features: Features = Features.getInstance()!!


    
                        if(features.isDefault(htmlFeatureFactory!!.HTML))
                        
                                    {
                                    
                                    }
                                
                             else 
    
                        if(SWTUtil.isSWT)
                        
                                    {
                                    
                                    }
                                
                             else 
    
                        if(!isOverScan)
                        
                                    {
                                    
    
                        if(TouchScreenFactory.getInstance()!!.isTouch() && InGameFeatures().
                            isAny())
                        
                                    {
                                    this.addCommand(InGameOptionsForm.DISPLAY)

                                    }
                                
this.addCommand(gameCommandsFactory!!.SAVE)
this.addCommand(gameCommandsFactory!!.DISPLAY_LOAD_FORM)

                                    }
                                
}


    override fun itemStateChanged(item: Item)
        //nullable = true from not(false or (false and false)) = true
{
var item = item

        try {
            
    var itemLabel: String = item.getLabel()!!

logUtil!!.put(StringMaker().
                            append(commonLabels!!.ITEM_LABEL)!!.append(itemLabel)!!.toString(), this, "itemStateChanged")

    
                        if(item is ChoiceGroup)
                        
                                    {
                                    
    var gameFeatureUtil: GameFeatureUtil = GameFeatureUtil.getInstance()!!


    
                        if(gameFeatureUtil!!.isExclusive(itemLabel))
                        
                                    {
                                    gameFeatureUtil!!.updateExclusive(item as ChoiceGroup)

                                    }
                                
                        else {
                            gameFeatureUtil!!.updateMultiple(item as ChoiceGroup)

                        }
                            

                                    }
                                
this.sensorGameUpdateProcessor!!.process(this.gameLayerManager)
this.updateTouch()
this.updateScreenButtonPaintable()
this.sensorGameUpdateProcessor!!.sendNotifications(this.gameLayerManager)
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "itemStateChanged", e)
}

}


                @Throws(Exception::class)
            
    open fun updateScreenButtonPaintable()
        //nullable = true from not(false or (false and true)) = true
{
this.gameBehavior!!.updateScreenButtonPaintable(this)
}


    open fun updateScreenButtonPaintable2()
        //nullable = true from not(false or (false and true)) = true
{

    var features: Features = Features.getInstance()!!


    
                        if(features.isFeature(touchFeatureFactory!!.AUTO_HIDE_SHOW_SCREEN_BUTTONS))
                        
                                    {
                                    this.setTouchPaintableP(this.getTouchButtonsPaintable())
this.setStartLevel(this.gameLayerManager!!.getGameInfo()!!.getCurrentLevel())

                                    }
                                
                             else 
    
                        if(features.isFeature(touchFeatureFactory!!.SHOW_SCREEN_BUTTONS))
                        
                                    {
                                    this.setTouchPaintableP(this.getTouchButtonsPaintable())

                                    }
                                
                             else 
    
                        if(features.isFeature(touchFeatureFactory!!.HIDE_SCREEN_BUTTONS))
                        
                                    {
                                    this.setTouchPaintableP(NullPaintable.getInstance())

                                    }
                                
                        else {
                            this.setTouchPaintableP(NullPaintable.getInstance())

                        }
                            
}


    override fun getLayerManager()
        //nullable = true from not(false or (false and true)) = true
: AllBinaryGameLayerManager{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameLayerManager
}


    open fun setLayerManager(layerManager: AllBinaryGameLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
var layerManager = layerManager
this.gameLayerManager= layerManager
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    override fun isGameOver()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.gameOver
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun setGameOver(gameOver: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var gameOver = gameOver
this.gameOver= gameOver
}


                @Throws(Exception::class)
            
    override fun setGameOver()
        //nullable = true from not(false or (false and true)) = true
{
PreLogUtil.put(commonStrings!!.START, this, this.gameStrings!!.SET_GAME_OVER)
this.setGameOver(true)
removePauseCommand()
this.setGameState(SHOW_END_RESULT_GAME_STATE)
this.setEndGamePaintable(getEndGameStatePaintable())
}


    override fun isHighScoreSubmitted()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return highScoreSubmitted
}


                @Throws(Exception::class)
            
    override fun setHighScoreSubmitted(highScoreSubmitted: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var highScoreSubmitted = highScoreSubmitted
this.highScoreSubmitted= highScoreSubmitted

    
                        if(highScoreSubmitted)
                        
                                    {
                                    this.highScoresHelper!!.setSelectedHighScores(NullHighScoresSingletonFactory.getInstance())

                                    }
                                
logUtil!!.put(StringMaker().
                            append("isHighScoreSubmitted: ")!!.append(highScoreSubmitted)!!.toString(), this, "setHighScoreSubmitted")
}


    override fun getGameState()
        //nullable = true from not(false or (false and true)) = true
: GameState{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameState
}


                @Throws(Exception::class)
            
    override fun setGameState(gameState: GameState)
        //nullable = true from not(false or (false and false)) = true
{
    //var gameState = gameState
logUtil!!.put(StringMaker().
                            append(this.gameStrings!!.GAME_STATE)!!.append(this.stringUtil!!.toString(gameState))!!.toString(), this, this.gameStrings!!.SET_GAME_STATE)
this.gameState= gameState
this.gameStateTimeHelper!!.setStartTime()
this.updateEndGameProcessor()
this.updateGameKeyEventProcessor()
this.gameBehavior!!.setGameState(this)
}


                @Throws(Exception::class)
            
    open fun setGameState()
        //nullable = true from not(false or (false and true)) = true
{

    var gameAdState: GameAdState = gameAdStateFactory!!.getCurrentInstance()!!

gameAdState!!.processAdState(this.gameState, this.gameLayerManager!!.getGameInfo()!!.getGameType())

    
                        if(this.gameState != GameState.PLAYING_GAME_STATE)
                        
                                    {
                                    gameAdState!!.processPageAdState()

                                    }
                                
}


    open fun updateGameKeyEventProcessor()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(this.getGameState() != GameState.PLAYING_GAME_STATE || this.isCheating)
                        
                                    {
                                    
                                    }
                                
                        else {
                            
                        }
                            
}


    open fun removeAllGameKeyInputListenersOnBuild()
        //nullable = true from not(false or (false and true)) = true
{
this.removeAllGameKeyInputListeners()
}


    open fun removeAllGameKeyInputListeners()
        //nullable = true from not(false or (false and true)) = true
{
this.gameBehavior!!.removeAllGameKeyInputListeners(this)
}


    open fun removeAllGameKeyInputListeners2()
        //nullable = true from not(false or (false and true)) = true
{
logUtil!!.put("Remove PlayerInput Listeners", this, "removeAllGameKeyInputListeners")




                        for (index in this.localPlayerGameInputList!!.size() -1 downTo 0)

        {

    var playerGameInput: PlayerGameInput = this.localPlayerGameInputList!!.get(index) as PlayerGameInput

this.removeKeyInputListener(playerGameInput)
playerGameInput!!.removeNonAIInputGameKeyEvents()
}

}


    open fun removeKeyInputListener(playerGameInput: PlayerGameInput)
        //nullable = true from not(false or (false and false)) = true
{
    //var playerGameInput = playerGameInput
this.gameKeyEventHandler!!.removeListener(playerGameInput)
}


                @Throws(Exception::class)
            
    open fun updateEndGameProcessor()
        //nullable = true from not(false or (false and true)) = true
{
this.gameBehavior!!.updateEndGameProcessor(this)
}


                @Throws(Exception::class)
            
    open fun updateEndGameProcessor2()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(this.getGameState() == SHOW_END_RESULT_GAME_STATE || this.getGameState() == SHOW_HIGH_SCORE_GAME_STATE)
                        
                                    {
                                    this.setEndGameProcessor(this.realEndGameProcessor)

                                    }
                                
                        else {
                            this.setEndGameProcessor(Processor.getInstance())

                        }
                            
}


                @Throws(Exception::class)
            
    open fun buildGame(isPortion: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
    //var isPortion = isPortion
}


                @Throws(Exception::class)
            
    open fun cleanupGame()
        //nullable = true from not(false or (false and true)) = true
{
logUtil!!.put(commonStrings!!.START, this, this.commonStrings!!.CLEANUP)

    var progressCanvas: ProgressCanvas = ProgressCanvasFactory.getInstance()!!

progressCanvas!!.addPortion(10, "Cleaning Up")
primaryPlayerQueue!!.clear()
secondaryPlayerQueue!!.clear()
GameLevelDisplayChangeEventListenersFactory.getInstance()!!.clear()
}


                @Throws(Exception::class)
            
    open fun loadResources(resourceLoadingLevel: ResourceLoadingLevel)
        //nullable = true from not(false or (false and false)) = true
{
    //var resourceLoadingLevel = resourceLoadingLevel

    var gameInitializedEvent: GameInitializedEvent = GameInitializationUtil.getInstance()!!.EVENT

gameInitializedEvent!!.setResourceLoadingLevel(resourceLoadingLevel)
GameInitializedEventHandler.getInstance()!!.fireEvent(gameInitializedEvent)
}


                @Throws(Exception::class)
            
    open fun loadResources(level: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var level = level

    var gameInitializedEvent: GameInitializedEvent = GameInitializationUtil.getInstance()!!.EVENT

gameInitializedEvent!!.setLevel(level)
GameInitializedEventHandler.getInstance()!!.fireEvent(gameInitializedEvent)
}


                @Throws(Exception::class)
            
    open fun updateColor()
        //nullable = true from not(false or (false and true)) = true
{
}


                @Throws(Exception::class)
            
    open fun buildGame(portion: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var portion = portion
screenCapture!!.endRecording()
screenCapture!!.startRecording()

    var progressCanvas: ProgressCanvas = ProgressCanvasFactory.getInstance()!!


    var features: Features = Features.getInstance()!!

progressCanvas!!.addPortion(portion, "Generic Build")
this.removeAllGameKeyInputListenersOnBuild()
this.updateTouch()
progressCanvas!!.addPortion(portion, "High Scores")
this.highScoresFactoryInterface!!.fetchHighScores(this.gameLayerManager!!.getGameInfo(), this.highScoresHelper)
this.setHighScoresPaintable(NullPaintable.getInstance())
progressCanvas!!.addPortion(portion, "Finishing.")
this.getEndGameInfoP()!!.update(this.getLayerManager()!!.getGameInfo(), this)
this.isSingleKeyRepeatableProcessing= features.isFeature(InputFeatureFactory.getInstance()!!.SINGLE_KEY_REPEAT_PRESS)
this.setGameOver(false)
progressCanvas!!.addPortion(portion, "Finishing..")
this.updateColor()
this.getStartIntermissionPaintable()!!.update()

    
                        if(!this.isRunningInAnotherThread())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                
progressCanvas!!.addPortion(portion, "Finishing...")

    
                        if(this.isMainCanvas() || !this.isInitialized())
                        
                                    {
                                    
    
                        if(features.isFeature(MainFeatureFactory.getInstance()!!.LOAD_ONDEMAND))
                        
                                    {
                                    
    
                        if(this.getCustomCommandListener() != 
                                    null
                                )
                        
                                    {
                                    progressCanvas!!.end()

                                    }
                                

                                    }
                                
                        else {
                            progressCanvas!!.end()

                        }
                            
this.setInitialized(true)

                                    }
                                

    
                        if(this.getCustomCommandListener() == NullCommandListener.NULL_COMMAND_LISTENER)
                        
                                    {
                                    logUtil!!.put("Show Game Paintable in DemoCanvas Thread", this, BUILD_GAME)
this.gameCanvasStartListener!!.showGamePaintable()

                                    }
                                
                        else {
                            logUtil!!.put("No GameCanvasStartListener", this, BUILD_GAME)

                        }
                            
this.colorFillPaintable!!.setBasicColorP(this.gameLayerManager!!.getBackgroundBasicColor())
this.gameBehavior!!.buildGame(this)
}


    open fun buildGame2()
        //nullable = true from not(false or (false and true)) = true
{
PreLogUtil.put(StringMaker().
                            append(this.gameInputStrings!!.ENABLE_PLAYER_GAME_INPUTS)!!.append(this.localPlayerGameInputList!!.size())!!.toString(), this, BUILD_GAME)

    var playerGameInput: PlayerGameInput





                        for (index in this.localPlayerGameInputList!!.size() -1 downTo 0)

        {
playerGameInput= this.localPlayerGameInputList!!.get(index) as PlayerGameInput
PreLogUtil.put(StringMaker().
                            append(this.gameInputStrings!!.ENABLE_PLAYER_GAME_INPUT)!!.append(playerGameInput!!.toString())!!.toString(), this, BUILD_GAME)
playerGameInput!!.removeNonAIInputGameKeyEvents()
this.addKeyInputListener(playerGameInput)
}

}


    open fun addKeyInputListener(playerGameInput: PlayerGameInput)
        //nullable = true from not(false or (false and false)) = true
{
    //var playerGameInput = playerGameInput
GameKeyEventHandler.getInstance()!!.addListener(playerGameInput, playerGameInput!!.getPlayerInputId())
}


    private var gameCanvasStartListener: DemoPaintableInterface = NullDemoPaintable.NULL_DEMO_PAINTABLE

    open fun setGameCanvasStartListener(gameCanvasStartListener: DemoPaintableInterface)
        //nullable = true from not(false or (false and false)) = true
{
var gameCanvasStartListener = gameCanvasStartListener
this.gameCanvasStartListener= gameCanvasStartListener
}


                @Throws(Exception::class)
            
    open fun loadState()
        //nullable = true from not(false or (false and true)) = true
{
logUtil!!.put(commonStrings!!.START, this, commonStrings!!.LOAD)

    var hashtable: Hashtable<Any, Any> = getLoadStateHashtable()!!


    
                        if(hashtable != 
                                    null
                                 && hashtable.size > 0)
                        
                                    {
                                    
    var levelAsString: String = hashtable.get(GameInfo.LEVEL_NAME as Object) as String


    var level: Int = Integer.valueOf(levelAsString)!!.toInt()!!


    var gameInfo: GameInfo = this.gameLayerManager!!.getGameInfo()!!

gameInfo!!.setCurrentLevel(level)

                                    }
                                
}


                @Throws(Exception::class)
            
    override fun getLoadStateHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>{
logUtil!!.put(StringMaker().
                            append(commonLabels!!.START_LABEL)!!.append(this.stringUtil!!.toString(this.hashtable))!!.toString(), this, "getLoadStateHashtable")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.hashtable
}


    override fun setLoadStateHashtable(hashtable: Hashtable<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{
    //var hashtable = hashtable
logUtil!!.put(StringMaker().
                            append(commonLabels!!.START_LABEL)!!.append(this.stringUtil!!.toString(hashtable))!!.toString(), this, "setLoadStateHashtable")
this.hashtable= hashtable
}


    override fun getCurrentStateHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>{

    var hashtable: Hashtable<Any, Any> = Hashtable<Any, Any>()


    var level: Int = this.gameLayerManager!!.getGameInfo()!!.getCurrentLevel()!!

hashtable.put(GameInfo.LEVEL_NAME.toString(), level.toString())
logUtil!!.put(StringMaker().
                            append("End: ")!!.append(this.stringUtil!!.toString(hashtable))!!.toString(), this, "getCurrentStateHashtable")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashtable
}


    open fun paintGameOver(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
ForcedLogUtil.log(commonStrings!!.NOT_IMPLEMENTED, this)
}


    override fun draw(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
this.colorFillPaintable!!.paint(graphics)
this.basicSetColorUtil!!.setBasicColorP(graphics, this.gameLayerManager!!.getForegroundBasicColor())
this.gameSpecificPaintable!!.paint(graphics)
}


    open fun clear(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
this.colorFillPaintable!!.paint(graphics)
}


    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
baseGameStatistics!!.nextRefresh()
this.draw(graphics)
menuPaintable!!.paint(graphics)
this.progressPaintable!!.paint(graphics)
}


    override fun paintThreed(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
}


                @Throws(Exception::class)
            
    open fun processEndLevelIntermissionGameState()
        //nullable = true from not(false or (false and true)) = true
{
}


    open fun nonBotPaint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
this.endGamePaintable!!.paint(graphics)
this.intermissionPaintable!!.paint(graphics)
this.paintIntermission(graphics)
this.touchPaintable!!.paint(graphics)
}


    open fun paintIntermission(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
}


    private val rawGameInputProcessor: InputProcessor = GameCanvasInputProcessor(this)

    private val rawInputProcessor: InputProcessor = FormInputProcessor(this)

    private var inputProcessor: InputProcessor = getRawGameInputProcessor()!!

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


    override fun keyPressed(keyCode: Int, deviceId: Int)
        //nullable = true from not(false or (false and false)) = true
{
var keyCode = keyCode
var deviceId = deviceId
this.inputProcessor!!.keyPressed(keyCode, deviceId)
}


    override fun keyRepeated(keyCode: Int, deviceId: Int)
        //nullable = true from not(false or (false and false)) = true
{
var keyCode = keyCode
var deviceId = deviceId

    
                        if(this.isSingleKeyRepeatableProcessing)
                        
                                    {
                                    this.inputProcessor!!.keyPressed(keyCode, deviceId)

                                    }
                                
}


    override fun keyReleased(keyCode: Int, deviceId: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var keyCode = keyCode
    //var deviceId = deviceId
this.inputProcessor!!.keyReleased(this, keyCode, deviceId)
}


                @Throws(Exception::class)
            
    open fun handleRawKey(keyCode: Int, deviceId: Int, repeated: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
    //var keyCode = keyCode
    //var deviceId = deviceId
    //var repeated = repeated
}


    open fun endProgress(isProgress: Boolean)
        //nullable = true from not(false or (false and false)) = true
: Int{
var isProgress = isProgress

    var portion: Int = 30


    
                        if(isProgress && this.isMainCanvas())
                        
                                    {
                                    
    var myCommandsFactory: MyCommandsFactory = MyCommandsFactory.getInstance()!!


    var progressCanvas: ProgressCanvas = ProgressCanvasFactory.getInstance()!!

progressCanvas!!.start()
this.getCustomCommandListener()!!.commandAction(myCommandsFactory!!.SET_DISPLAYABLE, progressCanvas)
portion= 4

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return portion
}


                @Throws(Exception::class)
            
    open fun processPlayingGame()
        //nullable = true from not(false or (false and true)) = true
{
cheatProcessor!!.update()
sensorGameUpdateProcessor!!.getInputSensor()!!.update()
gameInputProcessor!!.process()
gameLayerManager!!.process()
startIntermissionProcessor!!.process()
}


                @Throws(Exception::class)
            
    open fun threadInit()
        //nullable = true from not(false or (false and true)) = true
{
}


                @Throws(Exception::class)
            
    open fun processGame()
        //nullable = true from not(false or (false and true)) = true
{
super.process()

    
                        if(AllBinaryMediaManager.update())
                        
                                    {
                                    
    
                        if(!primaryPlayerQueue!!.process())
                        
                                    {
                                    secondaryPlayerQueue!!.process()

                                    }
                                

                                    }
                                
mainStateProcessor!!.process()
menuInputProcessor!!.processInput()
endGameProcessor!!.process()
baseGameStatistics!!.nextFrame()
}


    open fun notifyDonePainting()
        //nullable = true from not(false or (false and true)) = true
{

        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(this) 

        //mutex.withLock
        {
this.threadObjectUtil!!.notifyObject(this)
}

}


    private val YIELD_SLEEP: Long = 100

                @Throws(Exception::class)
            
    open fun shouldWait()
        //nullable = true from not(false or (false and true)) = true
{

    var features: Features = Features.getInstance()!!


    
                        if(AndroidUtil.isAndroid())
                        
                                    {
                                    
                                    }
                                
                             else 
    
                        if(features.isFeature(openGLFeatureFactory!!.OPENGL_2D))
                        
                                    {
                                    
                                    }
                                
                        else {
                            
    
                        if(features.isDefault(openGLFeatureFactory!!.OPENGL))
                        
                                    {
                                    
    var openGLImageSpecificFactory: OpenGLImageSpecificFactory = OpenGLImageSpecificFactory.getInstance()!!


        while(openGLImageSpecificFactory!!.updating)
        {
Thread.sleep(YIELD_SLEEP)
}


                                    }
                                

                        }
                            
}


    override fun run()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            logUtil!!.put(commonStrings!!.START_RUNNABLE, this, commonStrings!!.RUN)

    var progressCanvas: ProgressCanvas = ProgressCanvasFactory.getInstance()!!

progressCanvas!!.addPortion(50, "Game Thread")
this.setCurrentThread()
this.setRunning(true)

    
                        if(this.getCustomCommandListener() == NullCommandListener.NULL_COMMAND_LISTENER)
                        
                                    {
                                    Thread.sleep(YIELD_SLEEP)

                                    }
                                
this.shouldWait()
this.threadInit()

    
                        if(this.getCustomCommandListener() == NullCommandListener.NULL_COMMAND_LISTENER)
                        
                                    {
                                    Thread.sleep(YIELD_SLEEP)

                                    }
                                
this.open()

    var gameAdState: GameAdState = gameAdStateFactory!!.getCurrentInstance()!!

gameAdState!!.init()
gameAdState!!.setGameIsReady(true)
this.gameBehavior!!.run(this)
logUtil!!.put(commonStrings!!.END_RUNNABLE, this, commonStrings!!.RUN)
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}


                @Throws(Exception::class)
            
    open fun run2()
        //nullable = true from not(false or (false and true)) = true
{

    var features: Features = Features.getInstance()!!


    var htmlFeatureFactory: HTMLFeatureFactory = HTMLFeatureFactory.getInstance()!!


    
                        if(features.isDefault(openGLFeatureFactory!!.OPENGL_AS_GAME_THREAD) || features.isDefault(htmlFeatureFactory!!.HTML))
                        
                                    {
                                    
    
                        if(features.isDefault(openGLFeatureFactory!!.OPENGL_AS_GAME_THREAD))
                        
                                    {
                                    logUtil!!.put(openGLFeatureFactory!!.OPENGL_AS_GAME_THREAD.getName(), this, commonStrings!!.RUN)

                                    }
                                

    
                        if(features.isDefault(htmlFeatureFactory!!.HTML))
                        
                                    {
                                    logUtil!!.put(htmlFeatureFactory!!.HTML.getName(), this, commonStrings!!.RUN)

                                    }
                                

    var currentDisplayableFactory: CurrentDisplayableFactory = CurrentDisplayableFactory.getInstance()!!

currentDisplayableFactory!!.setRunnable(gameRunnable)
currentDisplayableFactory!!.setDisplayable(this)
OpenGLThreadUtil.getInstance()!!.onResume()

                                    }
                                
                             else 
    
                        if(features.isDefault(openGLFeatureFactory!!.OPENGL_AND_GAME_HAVE_DIFFERENT_THREADS))
                        
                                    {
                                    logUtil!!.put(openGLFeatureFactory!!.OPENGL_AND_GAME_HAVE_DIFFERENT_THREADS.getName(), this, commonStrings!!.RUN)
OpenGLThreadUtil.getInstance()!!.onResume()

        while(this.isRunning())
        {
this.run3()
}

this.end()

                                    }
                                
                        else {
                            logUtil!!.put("this thread", this, commonStrings!!.RUN)

        while(this.isRunning())
        {
this.run3()
}

this.end()

                        }
                            
}


                @Throws(Exception::class)
            
    open fun run3()
        //nullable = true from not(false or (false and true)) = true
{
this.loopTimeHelper!!.setStartTime(gameTickTimeDelayHelper!!.setStartTime())
gameTickDisplayInfoSingleton!!.update()
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


    
                        if(running)
                        
                                    {
                                    
                                    }
                                
                        else {
                            
    
                        if(features.isDefault(openGLFeatureFactory!!.OPENGL) || SWTUtil.isSWT)
                        
                                    {
                                    
    
                        if(this.gameLayerManager!!.getGameInfo()!!.getGameType() != gameTypeFactory!!.BOT)
                        
                                    {
                                    
    var currentDisplayableFactory: CurrentDisplayableFactory = CurrentDisplayableFactory.getInstance()!!

currentDisplayableFactory!!.clearRunnable()

                                    }
                                
this.end()

                                    }
                                

                        }
                            
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, SET_RUNNING, e)
}

}


                @Throws(Exception::class)
            
    open fun end()
        //nullable = true from not(false or (false and true)) = true
{
screenCapture!!.endRecording()
baseGameStatistics!!.add(StringMaker().
                            append(baseGameStatistics!!.toString())!!.append(CommonSeps.getInstance()!!.NEW_LINE)!!.toString())
baseGameStatistics!!.init()
this.gameKeyEventHandler!!.removeListener(this.cheatProcessor)
this.close()
this.removeAllGameKeyInputListeners()
this.endGameThread()
}


                @Throws(Exception::class)
            
    open fun endGameThread()
        //nullable = true from not(false or (false and true)) = true
{
DisplayChangeEventHandler.getInstance()!!.removeListener(this)
GameLevelDisplayChangeEventListenersFactory.getInstance()!!.clear()

    var gameAdState: GameAdState = gameAdStateFactory!!.getCurrentInstance()!!

gameAdState!!.notPlayingAdState()
}


    open fun createHighScore(score: Long)
        //nullable = true from not(false or (false and false)) = true
: HighScore{
var score = score

    var gameInfo: GameInfo = this.gameLayerManager!!.getGameInfo()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return HighScore(0, "NONE", GameInfo(gameInfo!!.getGameType(), gameInfo!!.getGameMode(), 0, 0), score)
}


                @Throws(Exception::class)
            
    open fun setHighScore(abeClientInformation: AbeClientInformationInterface, name: String, score: Long, autoSubmit: Boolean, isLast: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
    //var abeClientInformation = abeClientInformation
    //var name = name
    //var score = score
    //var autoSubmit = autoSubmit
    //var isLast = isLast
this.gameBehavior!!.setHighScore(abeClientInformation, this, name, score, autoSubmit, isLast)
}


                @Throws(Exception::class)
            
    open fun setHighScore2(abeClientInformation: AbeClientInformationInterface, name: String, score: Long, autoSubmit: Boolean, isLast: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
    //var abeClientInformation = abeClientInformation
    //var name = name
    //var score = score
    //var autoSubmit = autoSubmit
    //var isLast = isLast

    var highScore: HighScore = this.createHighScore(score)!!


    var textBox: HighScoreTextBox = HighScoreTextBox(this.highScoresFactoryInterface, highScoresHelper, abeClientInformation, this.gameLayerManager!!.getGameInfo(), this.getCustomCommandListener(), name, highScore, this.gameLayerManager!!.getBackgroundBasicColor(), this.gameLayerManager!!.getForegroundBasicColor())


    
                        if(isLast)
                        
                                    {
                                    this.getCustomCommandListener()!!.commandAction(GameCommandsFactory.getInstance()!!.SET_MENU_DISPLAYABLE, textBox)

                                    }
                                

    
                        if(autoSubmit)
                        
                                    {
                                    
open class SaveHighScoreRunnable
            : Object
        
                , Runnable {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val progressCanvas: ProgressCanvas = ProgressCanvasFactory.getInstance()!!

    override fun run()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            
    
                        if(isLast)
                        
                                    {
                                    textBox!!.submit()

                                    }
                                
                        else {
                            textBox!!.saveHighScore()

                        }
                            
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "run", e)
progressCanvas!!.end()
}

}


}
                
            
SecondaryThreadPool.getInstance()!!.runTask(SaveHighScoreRunnable())

                                    }
                                
}


    open fun getGameStateTimeHelper()
        //nullable = true from not(false or (false and true)) = true
: TimeDelayHelper{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameStateTimeHelper
}


    open fun setInitialized(initialized: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var initialized = initialized
this.initialized= initialized
}


    override fun isInitialized()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return initialized
}


    override fun getSourceId()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return id
}


    open fun setProgressPaintable(paintable: PaintableInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var paintable = paintable
this.progressPaintable= paintable
}


    override fun getStartIntermissionInterface()
        //nullable = true from not(false or (false and true)) = true
: IntermissionInterface{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.startIntermissionInterface
}


    override fun getEndLevelIntermissionInterface()
        //nullable = true from not(false or (false and true)) = true
: IntermissionInterface{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return endLevelIntermissionInterface
}


    open fun setTouchPaintableP(paintable: Paintable)
        //nullable = true from not(false or (false and false)) = true
{
var paintable = paintable
this.touchPaintable= paintable
}


    open fun getTouchPaintableP()
        //nullable = true from not(false or (false and true)) = true
: Paintable{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return touchPaintable
}


    open fun setEndGamePaintable(endGamePaintable: Paintable)
        //nullable = true from not(false or (false and false)) = true
{
var endGamePaintable = endGamePaintable
this.endGamePaintable= endGamePaintable
}


    open fun getEndGamePaintable()
        //nullable = true from not(false or (false and true)) = true
: Paintable{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return endGamePaintable
}


    open fun setIntermissionPaintable(intermissionPaintable: Paintable)
        //nullable = true from not(false or (false and false)) = true
{
var intermissionPaintable = intermissionPaintable
this.intermissionPaintable= intermissionPaintable
}


    open fun getIntermissionPaintable()
        //nullable = true from not(false or (false and true)) = true
: Paintable{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return intermissionPaintable
}


    open fun getEndGameInfoP()
        //nullable = true from not(false or (false and true)) = true
: EndGameInfo{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return endGameInfo
}


    open fun setHighScoresPaintable(highScoresPaintable: Paintable)
        //nullable = true from not(false or (false and false)) = true
{
    //var highScoresPaintable = highScoresPaintable
this.highScoresPaintable= highScoresPaintable
}


    open fun getHighScoresPaintable()
        //nullable = true from not(false or (false and true)) = true
: Paintable{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return highScoresPaintable
}


    open fun getRealHighScoresPaintable()
        //nullable = true from not(false or (false and true)) = true
: HighScoresPaintable{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return realHighScoresPaintable
}


    open fun clearPlayerGameInputList()
        //nullable = true from not(false or (false and true)) = true
{

    var playerGameInput: PlayerGameInput





                        for (index in this.localPlayerGameInputList!!.size() -1 downTo 0)

        {
playerGameInput= this.localPlayerGameInputList!!.get(index) as PlayerGameInput
this.gameKeyEventHandler!!.removeListener(playerGameInput)
}

this.localPlayerGameInputList!!.clear()
}


    open fun addPlayerGameInput(playerGameInput: PlayerGameInput)
        //nullable = true from not(false or (false and false)) = true
{
    //var playerGameInput = playerGameInput
this.localPlayerGameInputList!!.add(playerGameInput)
}


    open fun setMenuInputProcessor(menuInputProcessor: BasicMenuInputProcessor)
        //nullable = true from not(false or (false and false)) = true
{
    //var menuInputProcessor = menuInputProcessor
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
    //var menuForm = menuForm
this.menuForm= menuForm
}


    open fun getStartLevel()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return startLevel
}


    open fun setStartLevel(startLevel: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var startLevel = startLevel
this.startLevel= startLevel
}


    open fun setTouchButtonsPaintable(touchButtonsPaintable: Paintable)
        //nullable = true from not(false or (false and false)) = true
{
    //var touchButtonsPaintable = touchButtonsPaintable
this.touchButtonsPaintable= touchButtonsPaintable
}


    open fun getTouchButtonsPaintable()
        //nullable = true from not(false or (false and true)) = true
: Paintable{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return touchButtonsPaintable
}


    open fun setGameInputProcessor(gameInputProcessor: Processor)
        //nullable = true from not(false or (false and false)) = true
{
    //var gameInputProcessor = gameInputProcessor
this.gameInputProcessor= gameInputProcessor
}


    open fun getGameInputProcessor()
        //nullable = true from not(false or (false and true)) = true
: Processor{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameInputProcessor
}


    open fun setEndGameProcessor(endGameProcessor: Processor)
        //nullable = true from not(false or (false and false)) = true
{
    //var endGameProcessor = endGameProcessor
this.endGameProcessor= endGameProcessor
}


    open fun getEndGameProcessor()
        //nullable = true from not(false or (false and true)) = true
: Processor{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return endGameProcessor
}


    open fun setEndGameStatePaintable(endGameStatePaintable: Paintable)
        //nullable = true from not(false or (false and false)) = true
{
    //var endGameStatePaintable = endGameStatePaintable
this.endGameStatePaintable= endGameStatePaintable
}


    open fun getEndGameStatePaintable()
        //nullable = true from not(false or (false and true)) = true
: Paintable{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return endGameStatePaintable
}


    open fun setNonBotPaintableP(nonBotPaintable: Paintable)
        //nullable = true from not(false or (false and false)) = true
{
    //var nonBotPaintable = nonBotPaintable
this.nonBotPaintable= nonBotPaintable
}


    open fun getNonBotPaintableP()
        //nullable = true from not(false or (false and true)) = true
: Paintable{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return nonBotPaintable
}


    open fun setStartIntermissionPaintable(startIntermissionPaintable: InitUpdatePaintable)
        //nullable = true from not(false or (false and false)) = true
{
    //var startIntermissionPaintable = startIntermissionPaintable
this.startIntermissionPaintable= startIntermissionPaintable
}


    open fun getStartIntermissionPaintable()
        //nullable = true from not(false or (false and true)) = true
: InitUpdatePaintable{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return startIntermissionPaintable
}


    open fun setMainStateProcessor(mainStateProcessor: Processor)
        //nullable = true from not(false or (false and false)) = true
{
    //var mainStateProcessor = mainStateProcessor
this.mainStateProcessor= mainStateProcessor
}


    open fun getMainStateProcessor()
        //nullable = true from not(false or (false and true)) = true
: Processor{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return mainStateProcessor
}


    open fun setProcessGameProcessor(processGameProcessor: Processor)
        //nullable = true from not(false or (false and false)) = true
{
    //var processGameProcessor = processGameProcessor
this.processGameProcessor= processGameProcessor
}


    open fun getProcessGameProcessor()
        //nullable = true from not(false or (false and true)) = true
: Processor{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return processGameProcessor
}


    open fun setOpenMenuPaintable(openMenuPaintable: Paintable)
        //nullable = true from not(false or (false and false)) = true
{
    //var openMenuPaintable = openMenuPaintable
this.openMenuPaintable= openMenuPaintable
}


    open fun getOpenMenuPaintable()
        //nullable = true from not(false or (false and true)) = true
: Paintable{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return openMenuPaintable
}


    open fun setPopupMenuInputProcessor(popupMenuInputProcessor: BasicMenuInputProcessor)
        //nullable = true from not(false or (false and false)) = true
{
    //var popupMenuInputProcessor = popupMenuInputProcessor
this.popupMenuInputProcessor= popupMenuInputProcessor
}


    open fun getPopupMenuInputProcessor()
        //nullable = true from not(false or (false and true)) = true
: BasicMenuInputProcessor{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return popupMenuInputProcessor
}


    open fun getSensorGameUpdateProcessor()
        //nullable = true from not(false or (false and true)) = true
: SensorGameUpdateProcessor{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return sensorGameUpdateProcessor
}


    open fun getRawGameInputProcessor()
        //nullable = true from not(false or (false and true)) = true
: InputProcessor{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rawGameInputProcessor
}


    open fun getRawInputProcessor()
        //nullable = true from not(false or (false and true)) = true
: InputProcessor{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rawInputProcessor
}


    open fun setInputProcessor(inputProcessor: InputProcessor)
        //nullable = true from not(false or (false and false)) = true
{
    //var inputProcessor = inputProcessor
this.inputProcessor= inputProcessor
}


    open fun getInputProcessor()
        //nullable = true from not(false or (false and true)) = true
: InputProcessor{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputProcessor
}


    open fun setMenuPaintable(menuPaintable: Paintable)
        //nullable = true from not(false or (false and false)) = true
{
    //var menuPaintable = menuPaintable
this.menuPaintable= menuPaintable
}


    open fun getMenuPaintable()
        //nullable = true from not(false or (false and true)) = true
: Paintable{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return menuPaintable
}


    open fun setFormPaintable(formPaintable: Paintable)
        //nullable = true from not(false or (false and false)) = true
{
    //var formPaintable = formPaintable
this.formPaintable= formPaintable
}


    open fun getFormPaintable()
        //nullable = true from not(false or (false and true)) = true
: Paintable{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return formPaintable
}


    open fun setGameSpecificPaintableP(gameSpecificPaintable: Paintable)
        //nullable = true from not(false or (false and false)) = true
{
    //var gameSpecificPaintable = gameSpecificPaintable
this.gameSpecificPaintable= gameSpecificPaintable
}


    open fun getGameSpecificPaintableP()
        //nullable = true from not(false or (false and true)) = true
: Paintable{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameSpecificPaintable
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


    override fun getType()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TYPE
}


}
                
            

