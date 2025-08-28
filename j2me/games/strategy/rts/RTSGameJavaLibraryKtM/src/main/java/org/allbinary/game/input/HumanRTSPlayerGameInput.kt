
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2003 AllBinary 
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
        package org.allbinary.game.input




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.game.input.form.RTSFormInput
import org.allbinary.game.layer.MultiSelectPaintable
import org.allbinary.game.layer.RTSGameStrings
import org.allbinary.game.layer.RTSLayer
import org.allbinary.game.layer.RTSLayerInfoPaintable
import org.allbinary.game.layer.RTSPlayerLayerInterface
import org.allbinary.input.motion.button.EndLevelNoBuildingSelectedTouchButtonsBuilder
import org.allbinary.input.motion.button.EndLevelTouchButtonsBuilder
import org.allbinary.input.motion.button.NoBuildingSelectedTouchButtonsBuilder
import org.allbinary.input.motion.button.RTSTouchButtonsBuilder
import org.allbinary.media.audio.SelectBuildingSound
import org.allbinary.util.BasicArrayList
import org.allbinary.string.CommonSeps
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.java.bool.BooleanFactory
import org.allbinary.game.displayable.canvas.AllBinaryGameCanvas
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.game.layer.hud.event.GameNotificationEvent
import org.allbinary.game.layer.hud.event.GameNotificationEventHandler
import org.allbinary.game.state.GameState
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.form.ScrollSelectionForm
import org.allbinary.graphics.paint.NullInitUpdatePaintable
import org.allbinary.input.motion.button.TouchButtonsBuilderFactory
import org.allbinary.input.motion.gesture.MotionGestureInput
import org.allbinary.input.motion.gesture.TouchMotionGestureFactory
import org.allbinary.input.motion.gesture.observer.BaseMotionGestureEventListener
import org.allbinary.input.motion.gesture.observer.BasicMotionGesturesHandler
import org.allbinary.input.motion.gesture.observer.MotionGestureEvent
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.string.CommonLabels
import org.allbinary.logic.string.StringUtil
import org.allbinary.math.RectangleCollisionUtil
import org.allbinary.media.audio.ErrorSound
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.GeographicMapCompositeInterface

open public class HumanRTSPlayerGameInput : RTSPlayerGameInput
                , BaseMotionGestureEventListener {
        

    private var isDragging: Boolean = false

    private val rectangleCollisionUtil: RectangleCollisionUtil = RectangleCollisionUtil.getInstance()!!

    private val PRESSED: MotionGestureInput = TouchMotionGestureFactory.getInstance()!!.PRESSED

    private val RELEASED: MotionGestureInput = TouchMotionGestureFactory.getInstance()!!.RELEASED

    private val touchButtonsBuilderFactory: TouchButtonsBuilderFactory

    private val notYoursGameNotificationEvent: GameNotificationEvent
public constructor        (gameCanvas: AllBinaryGameCanvas, geographicMapInterface: BasicGeographicMap, inputList: BasicArrayList, playerInputId: Int, towerInfoPaintable: RTSLayerInfoPaintable, rtsPlayerLayerInterface: RTSPlayerLayerInterface, layerPositionFinderInterface: LayerPositionFinderInterface, selectRTSLayerVisitorFactoryInterface: SelectRTSLayerVisitorFactoryInterface)                        

                            : this(gameCanvas, inputList, playerInputId, towerInfoPaintable, rtsPlayerLayerInterface, layerPositionFinderInterface, selectRTSLayerVisitorFactoryInterface, 
                            null){
    //var gameCanvas = gameCanvas
    //var geographicMapInterface = geographicMapInterface
    //var inputList = inputList
    //var playerInputId = playerInputId
    //var towerInfoPaintable = towerInfoPaintable
    //var rtsPlayerLayerInterface = rtsPlayerLayerInterface
    //var layerPositionFinderInterface = layerPositionFinderInterface
    //var selectRTSLayerVisitorFactoryInterface = selectRTSLayerVisitorFactoryInterface


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (gameCanvas: AllBinaryGameCanvas, inputList: BasicArrayList, playerInputId: Int, towerInfoPaintable: RTSLayerInfoPaintable, rtsPlayerLayerInterface: RTSPlayerLayerInterface, layerPositionFinderInterface: LayerPositionFinderInterface, selectRTSLayerVisitorFactoryInterface: SelectRTSLayerVisitorFactoryInterface, touchButtonsBuilderFactory: TouchButtonsBuilderFactory)                        

                            : super(gameCanvas, inputList, playerInputId, towerInfoPaintable, rtsPlayerLayerInterface, layerPositionFinderInterface, selectRTSLayerVisitorFactoryInterface){
    //var gameCanvas = gameCanvas
    //var inputList = inputList
    //var playerInputId = playerInputId
    //var towerInfoPaintable = towerInfoPaintable
    //var rtsPlayerLayerInterface = rtsPlayerLayerInterface
    //var layerPositionFinderInterface = layerPositionFinderInterface
    //var selectRTSLayerVisitorFactoryInterface = selectRTSLayerVisitorFactoryInterface
    //var touchButtonsBuilderFactory = touchButtonsBuilderFactory


                            //For kotlin this is before the body of the constructor.
                    
this.touchButtonsBuilderFactory= touchButtonsBuilderFactory

    var basicColorFactory: BasicColorFactory = BasicColorFactory.getInstance()!!

this.notYoursGameNotificationEvent= GameNotificationEvent(this, RTSGameStrings.getInstance()!!.NOT_YOURS, SmallIntegerSingletonFactory.getInstance()!!.getInstance(2), basicColorFactory!!.PINK, BooleanFactory.getInstance()!!.FALSE)
BasicMotionGesturesHandler.getInstance()!!.addListener(this)
}


                @Throws(Exception::class)
            
open fun setAllBinaryGameLayerManager(allBinaryGameLayerManager: AllBinaryGameLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
    //var allBinaryGameLayerManager = allBinaryGameLayerManager

    var geographicMapCompositeInterface: GeographicMapCompositeInterface = allBinaryGameLayerManager as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!

this.notYoursGameNotificationEvent!!.setBasicColorP(geographicMapInterface!!.getForegroundBasicColor())
}


                @Throws(Exception::class)
            
open fun processDraggingMotionInput(layerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var layerManager = layerManager

    var motionGestureEvent: MotionGestureEvent = this.getMotionGestureInputList()!!.get(this.getMotionGestureInputList()!!.size() -1) as MotionGestureEvent


    var motionGestureInput: MotionGestureInput = motionGestureEvent!!.getMotionGesture()!!


    
                        if(motionGestureInput == PRESSED)
                        
                                    {
                                    
    var point: GPoint = motionGestureEvent!!.getCurrentPoint()!!


    
                        if(this.getRtsPlayerLayerInterface()!!.getCurrentScrollSelectionForm()!!.isInForm(point))
                        
                                    {
                                    isDragging= this.getSelectedRtsFormInput()!!.processSticky(this.getSelectedRtsLayer(), this.getRtsPlayerLayerInterface(), layerManager, point)

                                    }
                                

                                    }
                                
                             else 
    
                        if(motionGestureInput == RELEASED)
                        
                                    {
                                    
    var point: GPoint = motionGestureEvent!!.getCurrentPoint()!!


    
                        if(this.getRtsPlayerLayerInterface()!!.getCurrentScrollSelectionForm()!!.isInForm(point))
                        
                                    {
                                    this.getSelectedRtsFormInput()!!.process(this.getSelectedRtsLayer(), this.getRtsPlayerLayerInterface(), layerManager, point)

                                    }
                                
                             else 
    
                        if(this.getSelectedRtsFormInput()!!.isStickyItemSelected())
                        
                                    {
                                    
    var previousRtsFormInput: RTSFormInput = this.getSelectedRtsFormInput()!!

this.select(motionGestureEvent)
this.getSelectedBuildingPlayerGameInput()!!.selectAllPreselected()
previousRtsFormInput!!.process(this.getSelectedRtsLayer(), this.getRtsPlayerLayerInterface(), layerManager, point)
this.getSelectedBuildingPlayerGameInput()!!.deselectAllPreselected()

                                    }
                                
                        else {
                            this.select(motionGestureEvent)

                        }
                            
this.getSelectedRtsFormInput()!!.setStickyItemSelected(false)
this.getSelectedRtsFormInput()!!.setSelectedStickyItem(
                            null)
this.getSelectedRtsFormInput()!!.setSelectedStickyItemIndex( -1)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    private var startPoint: GPoint = PointFactory.getInstance()!!.ZERO_ZERO

    private var endPoint: GPoint = PointFactory.getInstance()!!.ZERO_ZERO

    val POSSIBLE: String = "Possible: "

    val AT: String = "At: "

    val METHOD: String = "makeSelection"

    val ADDING: String = "Adding: "

    val SPACE: String = CommonSeps.getInstance()!!.SPACE

open fun makeSelection()
        //nullable = true from not(false or (false and true)) = true
{

    var rtsLayerList: BasicArrayList = this.getRtsPlayerLayerInterface()!!.getPlayerOwnedRTSLayers()!!.rtsLayerList


    var rectX1: Int = this.startPoint!!.getX()!!


    var rectY1: Int = this.startPoint!!.getY()!!


    var rectX2: Int = this.endPoint!!.getX()!!


    var rectY2: Int = this.endPoint!!.getY()!!


    
                        if(rectX1 > rectX2)
                        
                                    {
                                    rectX2= rectX1
rectX1= this.endPoint!!.getX()

                                    }
                                

    
                        if(rectY1 > rectY2)
                        
                                    {
                                    rectY2= rectY1
rectY1= this.endPoint!!.getY()

                                    }
                                

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(AT)
stringBuffer!!.append(rectX1)
stringBuffer!!.append(SPACE)
stringBuffer!!.append(rectY1)
stringBuffer!!.append(SPACE)
stringBuffer!!.append(rectX2)
stringBuffer!!.append(SPACE)
stringBuffer!!.append(rectY2)
logUtil!!.put(stringBuffer!!.toString(), this, METHOD)

    var rtsLayer: RTSLayer





                        for (index in rtsLayerList!!.size() -1 downTo 0)

        {
rtsLayer= rtsLayerList!!.get(index) as RTSLayer
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(POSSIBLE)
stringBuffer!!.append(rtsLayer!!.getName())
stringBuffer!!.append(SPACE)
stringBuffer!!.append(AT)
stringBuffer!!.append((rtsLayer!!.getViewPosition()!!.getX() +rtsLayer!!.getHalfWidth()))
stringBuffer!!.append(SPACE)
stringBuffer!!.append((rtsLayer!!.getViewPosition()!!.getY() +rtsLayer!!.getHalfHeight()))
logUtil!!.put(stringBuffer!!.toString(), this, METHOD)

    
                        if(rectangleCollisionUtil!!.isInside(rectX1, rectY1, rectX2, rectY2, rtsLayer!!.getViewPosition()!!.getX() +rtsLayer!!.getHalfWidth(), rtsLayer!!.getViewPosition()!!.getY() +rtsLayer!!.getHalfHeight()))
                        
                                    {
                                    logUtil!!.put(StringMaker().
                            append(ADDING)!!.append(rtsLayer!!.getName())!!.toString(), this, METHOD)
rtsLayer!!.select()
this.getSelectedBuildingPlayerGameInput()!!.addSelectedRTSLayer(rtsLayer)

                                    }
                                
}


    var lastRTSLayer: RTSLayer = this.getSelectedBuildingPlayerGameInput()!!.getLastSelectedRtsLayer()!!


    
                        if(lastRTSLayer != 
                                    null
                                 && lastRTSLayer!!.getScrollSelectionForm() != 
                                    null
                                )
                        
                                    {
                                    this.updateForm(lastRTSLayer!!.getScrollSelectionForm(), lastRTSLayer!!.getRTSFormInput())
this.setSelectedRtsLayer(lastRTSLayer)

                                    }
                                
this.updatePaintable()
}


                @Throws(Exception::class)
            
open fun processSelectionBoxMotionInput(layerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
var layerManager = layerManager




                        for (index in this.getMotionGestureInputList()!!.size() -1 downTo 0)

        {

    var motionGestureEvent: MotionGestureEvent = this.getMotionGestureInputList()!!.get(index) as MotionGestureEvent


    var motionGestureInput: MotionGestureInput = motionGestureEvent!!.getMotionGesture()!!


    var point: GPoint = motionGestureEvent!!.getCurrentPoint()!!


    
                        if(motionGestureInput == TouchMotionGestureFactory.getInstance()!!.PRESSED)
                        
                                    {
                                    this.startPoint= point
this.endPoint= point

                                    }
                                
                             else 
    
                        if(motionGestureInput == TouchMotionGestureFactory.getInstance()!!.RELEASED)
                        
                                    {
                                    this.endPoint= point
this.makeSelection()
this.startPoint= PointFactory.getInstance()!!.ZERO_ZERO
this.endPoint= PointFactory.getInstance()!!.ZERO_ZERO

                                    }
                                
                        else {
                            this.endPoint= point

                        }
                            
}

}


                @Throws(Exception::class)
            
open fun processMotionInput(layerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
var layerManager = layerManager

    
                        if(this.getMotionGestureInputList()!!.size() > 0)
                        
                                    {
                                    
    var endDrag: Boolean = this.processDraggingMotionInput(layerManager)!!


    
                        if(!isDragging)
                        
                                    {
                                    this.processSelectionBoxMotionInput(layerManager)

                                    }
                                

    
                        if(endDrag)
                        
                                    {
                                    isDragging= false

                                    }
                                

                                    }
                                
getMotionGestureInputList()!!.clear()
}


open fun setSelectedRtsFormInput(selectedRtsFormInput: RTSFormInput)
        //nullable = true from not(false or (false and false)) = true
{
var selectedRtsFormInput = selectedRtsFormInput

    var logUtil: LogUtil = LogUtil.getInstance()!!

logUtil!!.put(StringMaker().
                            append(CommonLabels.getInstance()!!.START)!!.append(StringUtil.getInstance()!!.toString(selectedRtsFormInput))!!.toString(), this, "setSelectedRtsFormInput")
super.setSelectedRtsFormInput(selectedRtsFormInput)
this.setSelectedRtsLayer(
                            null)
}


open fun updateForm(rtsLayer: RTSLayer)
        //nullable = true from not(false or (false and false)) = true
{
var rtsLayer = rtsLayer

    var scrollSelectionForm: ScrollSelectionForm = rtsLayer!!.getScrollSelectionForm()!!


    
                        if(scrollSelectionForm != 
                                    null
                                 && this.getRtsPlayerLayerInterface()!!.getGroupInterface()[0] == rtsLayer!!.getGroupInterface()[0])
                        
                                    {
                                    this.updateForm(scrollSelectionForm, rtsLayer!!.getRTSFormInput())
this.getSelectedBuildingPlayerGameInput()!!.setSelectedRTSLayer(
                            null)
this.setSelectedRtsLayer(rtsLayer)

                                    }
                                
                        else {
                            this.getRtsPlayerLayerInterface()!!.setCurrentScrollSelectionForm(this.getRtsPlayerLayerInterface()!!.getBuildingScrollSelectionForm())
this.setSelectedRtsFormInput(this.getRtsPlayerLayerInterface()!!.getRTSFormInput())
this.getSelectedBuildingPlayerGameInput()!!.setSelectedRTSLayer(
                            null)

                        }
                            
}


open fun updateForm(scrollSelectionForm: ScrollSelectionForm, rtfFormInput: RTSFormInput)
        //nullable = true from not(false or (false and false)) = true
{
var scrollSelectionForm = scrollSelectionForm
var rtfFormInput = rtfFormInput
this.getRtsPlayerLayerInterface()!!.setCurrentScrollSelectionForm(scrollSelectionForm)
this.setSelectedRtsFormInput(rtfFormInput)
}


                @Throws(Exception::class)
            
open fun setSelectedRTSLayer(rtsLayer: RTSLayer, geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
{
var rtsLayer = rtsLayer
var geographicMapCellPosition = geographicMapCellPosition

    
                        if(rtsLayer != 
                                    null
                                 && this.getRtsPlayerLayerInterface()!!.getGroupInterface()[0] != rtsLayer!!.getGroupInterface()[0])
                        
                                    {
                                    this.getRtsPlayerLayerInterface()!!.add(ErrorSound.getInstance())
GameNotificationEventHandler.getInstance()!!.fireEvent(notYoursGameNotificationEvent)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    var gameCanvas: AllBinaryGameCanvas = this.getGameCanvas()!!


    
                        if(rtsLayer != 
                                    null
                                )
                        
                                    {
                                    this.getRtsPlayerLayerInterface()!!.add(SelectBuildingSound.getInstance())
rtsLayer!!.select()
this.updateForm(rtsLayer)

    
                        if(gameCanvas!!.getGameState() == GameState.PLAYING_GAME_STATE)
                        
                                    {
                                    
    
                        if(rtsLayer!!.isSelfUpgradeable())
                        
                                    {
                                    gameCanvas!!.updateCurrentTouchInputFactory(RTSTouchButtonsBuilder())

                                    }
                                
                        else {
                            gameCanvas!!.updateCurrentTouchInputFactory(NoBuildingSelectedTouchButtonsBuilder())

                        }
                            

                                    }
                                
                        else {
                            
    var endLevelTouchButtonsBuilder: EndLevelTouchButtonsBuilder = EndLevelTouchButtonsBuilder()


    
                        if(this.touchButtonsBuilderFactory != 
                                    null
                                )
                        
                                    {
                                    endLevelTouchButtonsBuilder!!.add(this.touchButtonsBuilderFactory!!.getInstance())

                                    }
                                
gameCanvas!!.updateCurrentTouchInputFactory(endLevelTouchButtonsBuilder)

                        }
                            

                                    }
                                
                        else {
                            logUtil!!.put("Set Player Default Form", this, "setSelectedRTSLayer")
this.getRtsPlayerLayerInterface()!!.setCurrentScrollSelectionForm(this.getRtsPlayerLayerInterface()!!.getBuildingScrollSelectionForm())
this.setSelectedRtsFormInput(this.getRtsPlayerLayerInterface()!!.getRTSFormInput())
this.getSelectedBuildingPlayerGameInput()!!.setSelectedRTSLayer(
                            null)

    
                        if(gameCanvas!!.getGameState() == GameState.PLAYING_GAME_STATE)
                        
                                    {
                                    gameCanvas!!.updateCurrentTouchInputFactory(NoBuildingSelectedTouchButtonsBuilder())

                                    }
                                
                        else {
                            
    var endLevelNoBuildingSelectedTouchButtonsBuilder: EndLevelNoBuildingSelectedTouchButtonsBuilder = EndLevelNoBuildingSelectedTouchButtonsBuilder()


    
                        if(this.touchButtonsBuilderFactory != 
                                    null
                                )
                        
                                    {
                                    endLevelNoBuildingSelectedTouchButtonsBuilder!!.add(this.touchButtonsBuilderFactory!!.getInstance())

                                    }
                                
gameCanvas!!.updateCurrentTouchInputFactory(endLevelNoBuildingSelectedTouchButtonsBuilder)

                        }
                            

                        }
                            
this.getSelectedRtsFormInput()!!.setSelectedGeographicCellPosition(geographicMapCellPosition)
this.getSelectedBuildingPlayerGameInput()!!.setSelectedRTSLayer(rtsLayer)
this.updatePaintable()
}


    private val multiSelectPaintable: MultiSelectPaintable = MultiSelectPaintable()

open fun updatePaintable()
        //nullable = true from not(false or (false and true)) = true
{

    var list: BasicArrayList = this.getSelectedBuildingPlayerGameInput()!!.getSelectedBasicArrayList()!!


    
                        if(list.size() > 1)
                        
                                    {
                                    
    var geographicMapCompositeInterface: GeographicMapCompositeInterface = this.getGameCanvas() as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!

multiSelectPaintable!!.setBasicColorP(geographicMapInterface!!.getForegroundBasicColor())
multiSelectPaintable!!.update(list)
this.getRTSLayerInfoPaintable()!!.updateRTSLayerInfo(multiSelectPaintable)

                                    }
                                
                             else 
    
                        if(list.size() == 1)
                        
                                    {
                                    
    var rtsLayer: RTSLayer = list.get(0) as RTSLayer

this.getRTSLayerInfoPaintable()!!.updateRTSLayerInfo(rtsLayer!!.createHudPaintable())

                                    }
                                
                        else {
                            this.getRTSLayerInfoPaintable()!!.updateRTSLayerInfo(NullInitUpdatePaintable.getInstance())

                        }
                            
}


open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
super.paint(graphics)

    
                        if(this.startPoint != PointFactory.getInstance()!!.ZERO_ZERO && this.endPoint != PointFactory.getInstance()!!.ZERO_ZERO)
                        
                                    {
                                    graphics.setColor(BasicColorFactory.getInstance()!!.RED.toInt())

    var rectX1: Int = this.startPoint!!.getX()!!


    var rectY1: Int = this.startPoint!!.getY()!!


    var rectX2: Int = this.endPoint!!.getX()!!


    var rectY2: Int = this.endPoint!!.getY()!!


    
                        if(rectX1 > rectX2)
                        
                                    {
                                    rectX2= rectX1
rectX1= this.endPoint!!.getX()

                                    }
                                

    
                        if(rectY1 > rectY2)
                        
                                    {
                                    rectY2= rectY1
rectY1= this.endPoint!!.getY()

                                    }
                                
graphics.drawRect(rectX1, rectY1, rectX2 -rectX1, rectY2 -rectY1)

                                    }
                                
}


open fun onMotionGestureEvent(motionGestureEvent: MotionGestureEvent)
        //nullable = true from not(false or (false and false)) = true
{
var motionGestureEvent = motionGestureEvent
getMotionGestureInputList()!!.add(motionGestureEvent)
}


    private var selectedRtsLayer: RTSLayer

open fun getSelectedRtsLayer()
        //nullable = true from not(false or (false and true)) = true
: RTSLayer{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return selectedRtsLayer
}


open fun setSelectedRtsLayer(selectedRtsLayer: RTSLayer)
        //nullable = true from not(false or (false and false)) = true
{
var selectedRtsLayer = selectedRtsLayer
this.selectedRtsLayer= selectedRtsLayer
}


}
                
            

