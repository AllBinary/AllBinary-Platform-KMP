
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
        
import javax.microedition.lcdui.Canvas
import javax.microedition.lcdui.Graphics
import org.allbinary.game.input.form.RTSFormInput
import org.allbinary.game.layer.RTSLayer
import org.allbinary.game.layer.RTSLayerInfoPaintable
import org.allbinary.game.layer.RTSPlayerLayerInterface
import org.allbinary.util.BasicArrayList
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.InputFeatureFactory
import org.allbinary.game.displayable.canvas.AllBinaryGameCanvas
import org.allbinary.game.input.event.GameKeyEvent
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.displayable.event.DisplayChangeEvent
import org.allbinary.input.motion.gesture.observer.MotionGestureEvent
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.media.audio.SecondaryPlayerQueueFactory
import org.allbinary.media.audio.SelectSound
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.GeographicMapCompositeInterface
import org.allbinary.string.CommonLabels

open public class RTSPlayerGameInput : PlayerGameInput {
        

    val inputProcessorArray: Array<GameInputProcessor?> = arrayOfNulls(InputFactory.getInstance()!!.MAX)

    val removeInputProcessorArray: Array<GameInputProcessor?> = arrayOfNulls(InputFactory.getInstance()!!.MAX)

    private val inputList: BasicArrayList

    private val isSingleKeyProcessing: Boolean = Features.getInstance()!!.isFeature(InputFeatureFactory.getInstance()!!.SINGLE_KEY_REPEAT_PRESS) || Features.getInstance()!!.isFeature(InputFeatureFactory.getInstance()!!.SINGLE_KEY_PRESS)

    private val gameCanvas: AllBinaryGameCanvas

    private val motionGestureInputList: BasicArrayList = BasicArrayList()

    private val scrollPlayerGameInput: ScrollMapPlayerGameInput

    private val selectedRTSLayerPlayerGameInput: SelectedRTSLayersPlayerGameInput

    private val towerInfoPaintable: RTSLayerInfoPaintable

    private val rtsPlayerLayerInterface: RTSPlayerLayerInterface

    private var selectedRtsFormInput: RTSFormInput

    private val layerPositionFinderInterface: LayerPositionFinderInterface
public constructor        (gameCanvas: AllBinaryGameCanvas, inputList: BasicArrayList, playerInputId: Int, towerInfoPaintable: RTSLayerInfoPaintable, rtsPlayerLayerInterface: RTSPlayerLayerInterface, layerPositionFinderInterface: LayerPositionFinderInterface, selectRTSLayerVisitorFactoryInterface: SelectRTSLayerVisitorFactoryInterface)                        

                            : super(inputList, playerInputId){

                    var gameCanvas = gameCanvas


                    var inputList = inputList


                    var playerInputId = playerInputId


                    var towerInfoPaintable = towerInfoPaintable


                    var rtsPlayerLayerInterface = rtsPlayerLayerInterface


                    var layerPositionFinderInterface = layerPositionFinderInterface


                    var selectRTSLayerVisitorFactoryInterface = selectRTSLayerVisitorFactoryInterface


                            //For kotlin this is before the body of the constructor.
                    
this.initInputProcessors()
this.gameCanvas= gameCanvas
this.inputList= inputList
this.towerInfoPaintable= towerInfoPaintable
this.rtsPlayerLayerInterface= rtsPlayerLayerInterface
this.selectedRTSLayerPlayerGameInput= SelectedRTSLayersPlayerGameInput(this.getRTSLayerInfoPaintable(), this.getRtsPlayerLayerInterface(), this.inputList, playerInputId, selectRTSLayerVisitorFactoryInterface)

    
                        if(this.rtsPlayerLayerInterface != 
                                    null
                                )
                        
                                    {
                                    this.setSelectedRtsFormInput(this.rtsPlayerLayerInterface!!.getRTSFormInput())

                                    }
                                

    var geographicMapCompositeInterface: GeographicMapCompositeInterface = gameCanvas!!.getLayerManager() as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!

this.scrollPlayerGameInput= ScrollMapPlayerGameInput(geographicMapInterface, this.inputList, playerInputId)
this.layerPositionFinderInterface= layerPositionFinderInterface
}


                @Throws(Exception::class)
            
open fun setAllBinaryGameLayerManager(allBinaryGameLayerManager: AllBinaryGameLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryGameLayerManager = allBinaryGameLayerManager
this.selectedRTSLayerPlayerGameInput!!.setAllBinaryGameLayerManager(allBinaryGameLayerManager)

    
                        if(this.selectedRtsFormInput != 
                                    null
                                )
                        
                                    {
                                    this.selectedRtsFormInput!!.setAllBinaryGameLayerManager(allBinaryGameLayerManager)

                                    }
                                
}


open fun onDisplayChangeEvent(displayChangeEvent: DisplayChangeEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var displayChangeEvent = displayChangeEvent

        try {
            logUtil!!.put(commonStrings!!.START, this, "onDisplayChangeEvent")
this.getRTSLayerInfoPaintable()!!.update()
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, "onDisplayChangeEvent", e)
}

}


                @Throws(Exception::class)
            
open fun left()
        //nullable = true from not(false or (false and true)) = true
{this.rtsPlayerLayerInterface!!.getCurrentScrollSelectionForm()!!.processInput(Canvas.LEFT)
}


                @Throws(Exception::class)
            
open fun right()
        //nullable = true from not(false or (false and true)) = true
{this.rtsPlayerLayerInterface!!.getCurrentScrollSelectionForm()!!.processInput(Canvas.RIGHT)
}


open fun initInputProcessors()
        //nullable = true from not(false or (false and true)) = true
{this.inputProcessorArray[Canvas.LEFT]= RTSPlayerLeftGameInputProcessor(this)
this.inputProcessorArray[Canvas.KEY_NUM0]= this.inputProcessorArray[Canvas.LEFT]!!
this.inputProcessorArray[Canvas.RIGHT]= RTSPlayerRightGameInputProcessor(this)
this.inputProcessorArray[Canvas.KEY_POUND]= this.inputProcessorArray[Canvas.RIGHT]!!
this.removeInputProcessorArray[Canvas.KEY_NUM1]= RTSPlayerFireGameInputProcessor(this)
this.removeInputProcessorArray[Canvas.KEY_NUM3]= this.removeInputProcessorArray[Canvas.KEY_NUM1]!!
this.removeInputProcessorArray[Canvas.KEY_NUM3]= this.removeInputProcessorArray[Canvas.KEY_NUM1]!!
this.removeInputProcessorArray[Canvas.LEFT]= this.removeInputProcessorArray[Canvas.KEY_NUM1]!!
this.removeInputProcessorArray[Canvas.RIGHT]= this.removeInputProcessorArray[Canvas.KEY_NUM1]!!
this.removeInputProcessorArray[Canvas.KEY_NUM0]= this.removeInputProcessorArray[Canvas.KEY_NUM1]!!
this.removeInputProcessorArray[Canvas.KEY_POUND]= this.removeInputProcessorArray[Canvas.KEY_NUM1]!!
GameInputProcessorUtil.init(this.inputProcessorArray)
GameInputProcessorUtil.init(this.removeInputProcessorArray)
}


                @Throws(Exception::class)
            
open fun processInput(layerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var layerManager = layerManager

        try {
            this.processMotionInput(layerManager)

    var size: Int = inputList!!.size()!!


    var key: Int = 0





                        for (index in 0 until size)


        {
    var gameKeyEvent: GameKeyEvent = inputList!!.get(index) as GameKeyEvent

key= gameKeyEvent!!.getKey()
this.getScrollPlayerGameInput()!!.processInput(key)
this.getSelectedBuildingPlayerGameInput()!!.processInput(key)
this.inputProcessorArray[key]!!.process(layerManager, gameKeyEvent)
this.removeInputProcessorArray[key]!!.process(layerManager, gameKeyEvent)
}


    
                        if(isIsSingleKeyProcessing())
                        
                                    {
                                    this.clear()

                                    }
                                
                        else {
                            this.update()

                        }
                            
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, gameInputStrings!!.PROCESS_INPUT, e)
}

}


                @Throws(Exception::class)
            
open fun processMotionInput(layerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var layerManager = layerManager
}


                @Throws(Exception::class)
            
open fun select(motionGestureEvent: MotionGestureEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var motionGestureEvent = motionGestureEvent

    var point: GPoint = motionGestureEvent!!.getCurrentPoint()!!


    var geographicMapCompositeInterface: GeographicMapCompositeInterface = gameCanvas!!.getLayerManager() as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!


    var allBinaryTiledLayer: AllBinaryTiledLayer = geographicMapInterface!!.getAllBinaryTiledLayer()!!


    var x: Int = point.getX() +allBinaryTiledLayer!!.getXP()


    var y: Int = point.getY() +allBinaryTiledLayer!!.getYP()


    var geographicMapCellPosition: GeographicMapCellPosition = geographicMapInterface!!.getCellPositionAtNoThrow(x, y)!!


    
                        if(geographicMapCellPosition != 
                                    null
                                )
                        
                                    {
                                    SecondaryPlayerQueueFactory.getInstance()!!.add(SelectSound.getInstance())

    var foundRTSLayer: RTSLayer = this.layerPositionFinderInterface!!.getLayerInterface(geographicMapCellPosition) as RTSLayer


    
                        if(foundRTSLayer == 
                                    null
                                )
                        
                                    {
                                    
                                    }
                                
                        else {
                            geographicMapCellPosition= geographicMapInterface!!.getCellPositionAt(foundRTSLayer!!.getXP(), foundRTSLayer!!.getYP())

                        }
                            
this.setSelectedRTSLayer(foundRTSLayer, geographicMapCellPosition)

                                    }
                                
                        else {
                            
    var commonLabels: CommonLabels = CommonLabels.getInstance()!!

logUtil!!.put(StringMaker().
                            append("Off Of Map -")!!.append(commonLabels!!.WIDTH_LABEL)!!.append(allBinaryTiledLayer!!.getWidth())!!.append(commonLabels!!.HEIGHT_LABEL)!!.append(allBinaryTiledLayer!!.getHeight())!!.toString(), this, "select")

                        }
                            
}


                @Throws(Exception::class)
            
open fun setSelectedRTSLayer(rtsLayer: RTSLayer, geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
{

                    var rtsLayer = rtsLayer


                    var geographicMapCellPosition = geographicMapCellPosition
this.getSelectedBuildingPlayerGameInput()!!.setSelectedRTSLayer(rtsLayer)
}


open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics

    var geographicMapCellPosition: GeographicMapCellPosition = this.getSelectedRtsFormInput()!!.getSelectedGeographicCellPosition()!!


    var geographicMapCompositeInterface: GeographicMapCompositeInterface = gameCanvas!!.getLayerManager() as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!


    var allBinaryTiledLayer: AllBinaryTiledLayer = geographicMapInterface!!.getAllBinaryTiledLayer()!!

graphics.setColor(BasicColorFactory.getInstance()!!.GREEN.toInt())

    var list: BasicArrayList = this.getSelectedBuildingPlayerGameInput()!!.getPaintSelectedRTSLayersList()!!


    var width: Int = 0


    var height: Int = 0


    
                        if(list.size() > 0)
                        
                                    {
                                    



                        for (index in list.size() -1 downTo 0)


        {
    var rtsLayer: RTSLayer = list.get(index) as RTSLayer

width= rtsLayer!!.getWidth()
height= rtsLayer!!.getHeight()
graphics.drawRect(rtsLayer!!.getXP() -allBinaryTiledLayer!!.getXP(), rtsLayer!!.getYP() -allBinaryTiledLayer!!.getYP(), width, height)
}


                                    }
                                
                             else 
    
                        if(geographicMapCellPosition != 
                                    null
                                )
                        
                                    {
                                    
    var point: GPoint = geographicMapCellPosition!!.getPoint()!!

width= allBinaryTiledLayer!!.getCellWidth()
height= allBinaryTiledLayer!!.getCellHeight()
graphics.drawRect(point.getX() -allBinaryTiledLayer!!.getXP(), point.getY() -allBinaryTiledLayer!!.getYP(), width, height)

                                    }
                                
}


open fun updatePaintable()
        //nullable = true from not(false or (false and true)) = true
{}


open fun getSelectedBuildingPlayerGameInput()
        //nullable = true from not(false or (false and true)) = true
: SelectedRTSLayersPlayerGameInput{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return selectedRTSLayerPlayerGameInput
}


open fun getSelectedRtsFormInput()
        //nullable = true from not(false or (false and true)) = true
: RTSFormInput{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return selectedRtsFormInput
}


open fun setSelectedRtsFormInput(selectedRtsFormInput: RTSFormInput)
        //nullable = true from not(false or (false and false)) = true
{

                    var selectedRtsFormInput = selectedRtsFormInput
logUtil!!.put(StringMaker().
                            append("RTSFormInput: ")!!.append(StringUtil.getInstance()!!.toString(selectedRtsFormInput))!!.toString(), this, "setSelectedRtsFormInput")
this.selectedRtsFormInput= selectedRtsFormInput
}


open fun getRtsPlayerLayerInterface()
        //nullable = true from not(false or (false and true)) = true
: RTSPlayerLayerInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rtsPlayerLayerInterface
}


open fun getRTSLayerInfoPaintable()
        //nullable = true from not(false or (false and true)) = true
: RTSLayerInfoPaintable{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return towerInfoPaintable
}


open fun getMotionGestureInputList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return motionGestureInputList
}


open fun getGameCanvas()
        //nullable = true from not(false or (false and true)) = true
: AllBinaryGameCanvas{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameCanvas
}


open fun isIsSingleKeyProcessing()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return isSingleKeyProcessing
}


open fun getScrollPlayerGameInput()
        //nullable = true from not(false or (false and true)) = true
: ScrollMapPlayerGameInput{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return scrollPlayerGameInput
}


}
                
            

