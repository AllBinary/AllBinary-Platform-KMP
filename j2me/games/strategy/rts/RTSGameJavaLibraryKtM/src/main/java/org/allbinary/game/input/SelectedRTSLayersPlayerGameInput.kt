
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
import org.allbinary.game.layer.RTSGameStrings
import org.allbinary.game.layer.RTSLayer
import org.allbinary.game.layer.RTSLayerInfoPaintable
import org.allbinary.game.layer.RTSPlayerLayerInterface
import org.allbinary.game.layer.capital.Capital
import org.allbinary.media.audio.DowngradeSound
import org.allbinary.media.audio.UpgradeSound
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListUtil
import org.allbinary.string.CommonStrings
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.java.bool.BooleanFactory
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.InputFeatureFactory
import org.allbinary.game.input.event.GameKeyEvent
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.game.layer.hud.event.GameNotificationEvent
import org.allbinary.game.layer.hud.event.GameNotificationEventHandler
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.logic.util.visitor.Visitor
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.media.audio.ErrorSound
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.GeographicMapCompositeInterface

open public class SelectedRTSLayersPlayerGameInput : PlayerGameInput {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val inputProcessorArray: Array<GameInputProcessor?> = arrayOfNulls(InputFactory.getInstance()!!.MAX)

    private val list: BasicArrayList

    val isSingleKeyProcessing: Boolean = Features.getInstance()!!.isFeature(InputFeatureFactory.getInstance()!!.SINGLE_KEY_REPEAT_PRESS) || Features.getInstance()!!.isFeature(InputFeatureFactory.getInstance()!!.SINGLE_KEY_PRESS)

    private var selectedRTSLayersList: BasicArrayList = BasicArrayList()

    private var preSelectedRTSLayersList: BasicArrayList = BasicArrayList()

    private var paintSelectedRTSLayersList: BasicArrayList = BasicArrayListUtil.getInstance()!!.getImmutableInstance()!!

    private var rtsPlayerLayerInterface: RTSPlayerLayerInterface

    private val selectRTSLayerVisitorInterface: Visitor

    private val upgradeGameNotificationEvent: GameNotificationEvent

    private val noMoneyGameNotificationEvent: GameNotificationEvent

    private val downgradeGameNotificationEvent: GameNotificationEvent
public constructor        (towerInfoPaintable: RTSLayerInfoPaintable, rtsPlayerLayerInterface: RTSPlayerLayerInterface, list: BasicArrayList, playerInputId: Int, selectRTSLayerVisitorFactoryInterface: SelectRTSLayerVisitorFactoryInterface)                        

                            : super(list, playerInputId){
var towerInfoPaintable = towerInfoPaintable
var rtsPlayerLayerInterface = rtsPlayerLayerInterface
var list = list
var playerInputId = playerInputId
var selectRTSLayerVisitorFactoryInterface = selectRTSLayerVisitorFactoryInterface


                            //For kotlin this is before the body of the constructor.
                    
this.initInputProcessors()
this.rtsPlayerLayerInterface= rtsPlayerLayerInterface
this.list= list
this.selectRTSLayerVisitorInterface= selectRTSLayerVisitorFactoryInterface!!.getInstance(this)

    var smallIntegerSingletonFactory: SmallIntegerSingletonFactory = SmallIntegerSingletonFactory.getInstance()!!


    var basicColorFactory: BasicColorFactory = BasicColorFactory.getInstance()!!

this.upgradeGameNotificationEvent= GameNotificationEvent(this, RTSGameStrings.getInstance()!!.UPGRADE, smallIntegerSingletonFactory!!.getInstance(2), basicColorFactory!!.PINK, BooleanFactory.getInstance()!!.FALSE)
this.noMoneyGameNotificationEvent= GameNotificationEvent(this, RTSGameStrings.getInstance()!!.NO_MONEY, smallIntegerSingletonFactory!!.getInstance(2), basicColorFactory!!.PINK, BooleanFactory.getInstance()!!.FALSE)
this.downgradeGameNotificationEvent= GameNotificationEvent(this, RTSGameStrings.getInstance()!!.DOWNGRADE, smallIntegerSingletonFactory!!.getInstance(2), basicColorFactory!!.PINK, BooleanFactory.getInstance()!!.FALSE)
}


                @Throws(Exception::class)
            
open fun setAllBinaryGameLayerManager(allBinaryGameLayerManager: AllBinaryGameLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
    //var allBinaryGameLayerManager = allBinaryGameLayerManager

    var geographicMapCompositeInterface: GeographicMapCompositeInterface = allBinaryGameLayerManager as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!

this.upgradeGameNotificationEvent!!.setBasicColorP(geographicMapInterface!!.getForegroundBasicColor())
this.noMoneyGameNotificationEvent!!.setBasicColorP(geographicMapInterface!!.getForegroundBasicColor())
this.downgradeGameNotificationEvent!!.setBasicColorP(geographicMapInterface!!.getForegroundBasicColor())
}


open fun isSelected(rtsLayer: RTSLayer)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var rtsLayer = rtsLayer

    
                        if(this.getSelectedBasicArrayList()!!.contains(rtsLayer))
                        
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
            
open fun upgrade()
        //nullable = true from not(false or (false and true)) = true
{

    var anyChanged: Boolean = false





                        for (index in this.getSelectedBasicArrayList()!!.size() -1 downTo 0)

        {

    var rtsLayer: RTSLayer = this.getSelectedBasicArrayList()!!.get(index) as RTSLayer


    
                        if(rtsLayer!!.isUpgradeable())
                        
                                    {
                                    
    var capital: Capital = this.rtsPlayerLayerInterface!!.getCapital()!!


    var upgradeCost: Int = rtsLayer!!.getUpgradeCost()!!


    
                        if(upgradeCost <= capital.getTotalMoney())
                        
                                    {
                                    anyChanged= true
rtsPlayerLayerInterface!!.add(UpgradeSound.getInstance())
rtsLayer!!.upgrade()
capital.removeMoney(upgradeCost)

    
                        if(!rtsPlayerLayerInterface!!.implmentsArtificialIntelligenceCompositeInterface())
                        
                                    {
                                    GameNotificationEventHandler.getInstance()!!.fireEvent(upgradeGameNotificationEvent)

                                    }
                                

                                    }
                                
                        else {
                            rtsPlayerLayerInterface!!.add(ErrorSound.getInstance())

    
                        if(!rtsPlayerLayerInterface!!.implmentsArtificialIntelligenceCompositeInterface())
                        
                                    {
                                    GameNotificationEventHandler.getInstance()!!.fireEvent(noMoneyGameNotificationEvent)

                                    }
                                

                        }
                            

                                    }
                                
}


    
                        if(anyChanged)
                        
                                    {
                                    getPlayerGameInput = this.rtsPlayerLayerInterface!!.getPlayerGameInput()getPlayerGameInput as RTSPlayerGameInput
getPlayerGameInput.
                    updatePaintable()

                                    }
                                
}


                @Throws(Exception::class)
            
open fun downgrade()
        //nullable = true from not(false or (false and true)) = true
{

    var anyChanged: Boolean = false





                        for (index in this.getSelectedBasicArrayList()!!.size()!!  - 1  downTo 0)

        {

    var rtsLayer: RTSLayer = this.getSelectedBasicArrayList()!!.get(index) as RTSLayer


    
                        if(rtsLayer!!.isDowngradeable())
                        
                                    {
                                    anyChanged= true
rtsPlayerLayerInterface!!.add(DowngradeSound.getInstance())

    var downgradeCost: Int = rtsLayer!!.getDowngradeCost()!!

rtsLayer!!.downgrade()

    var capital: Capital = this.rtsPlayerLayerInterface!!.getCapital()!!

capital.addMoney(downgradeCost)

    
                        if(!rtsPlayerLayerInterface!!.implmentsArtificialIntelligenceCompositeInterface())
                        
                                    {
                                    GameNotificationEventHandler.getInstance()!!.fireEvent(downgradeGameNotificationEvent)

                                    }
                                

                                    }
                                
}


    
                        if(anyChanged)
                        
                                    {
                                    getPlayerGameInput = this.rtsPlayerLayerInterface!!.getPlayerGameInput()getPlayerGameInput as RTSPlayerGameInput
getPlayerGameInput.
                    updatePaintable()

                                    }
                                
}


open fun initInputProcessors()
        //nullable = true from not(false or (false and true)) = true
{
this.inputProcessorArray[Canvas.KEY_NUM1]= SelectedRTSLayersPlayerUpgradeGameInputProcessor(this)
this.inputProcessorArray[Canvas.KEY_NUM3]= SelectedRTSLayersPlayerDowngradeGameInputProcessor(this)
GameInputProcessorUtil.init(this.inputProcessorArray)
}


                @Throws(Exception::class)
            
open fun processInput(key: Int)
        //nullable = true from not(false or (false and false)) = true
{
var key = key

    
                        if(this.getSelectedBasicArrayList() != 
                                    null
                                )
                        
                                    {
                                    this.inputProcessorArray[key]!!.process(
                            null, null as GameKeyEvent)

                                    }
                                
}


                @Throws(Exception::class)
            
open fun processInput(layerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
var layerManager = layerManager

        try {
            
    var size: Int = list.size()!!


    var key: Int = 0





                        for (index in 0 until size)

        {

    var gameKeyEvent: GameKeyEvent = list.get(index) as GameKeyEvent

key= gameKeyEvent!!.getKey()
this.processInput(key)
}


    
                        if(isSingleKeyProcessing)
                        
                                    {
                                    this.clear()

                                    }
                                
                        else {
                            this.update()

                        }
                            
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, gameInputStrings!!.PROCESS_INPUT, e)
}

}


open fun getSelectedBasicArrayList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return selectedRTSLayersList
}


open fun addSelectedRTSLayer(selectedLayer: RTSLayer)
        //nullable = true from not(false or (false and false)) = true
{
var selectedLayer = selectedLayer
this.paintSelectedRTSLayersList= BasicArrayListUtil.getInstance()!!.getImmutableInstance()

    
                        if(selectedLayer == 
                                    null
                                )
                        
                                    {
                                    this.deselectAll()
this.selectedRTSLayersList!!.clear()

                                    }
                                
                        else {
                            
    
                        if(!this.selectedRTSLayersList!!.contains(selectedLayer))
                        
                                    {
                                    this.selectedRTSLayersList!!.add(selectedLayer)

                                    }
                                

                        }
                            
this.paintSelectedRTSLayersList= this.selectedRTSLayersList
}


open fun setSelectedRTSLayer(selectedLayer: RTSLayer)
        //nullable = true from not(false or (false and false)) = true
{
var selectedLayer = selectedLayer

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Selected Layer: ")

    
                        if(selectedLayer != 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.append(selectedLayer!!.getName())

                                    }
                                
logUtil!!.put(stringBuffer!!.toString(), this, "setSelectedRTSLayer")
this.paintSelectedRTSLayersList= BasicArrayListUtil.getInstance()!!.getImmutableInstance()
this.selectRTSLayerVisitorInterface!!.visit(selectedLayer)
this.deselectAll()

    
                        if(this.selectedRTSLayersList!!.size() > 0)
                        
                                    {
                                    this.getPreSelectedRTSLayersList()!!.clear()

    var tempList: BasicArrayList = this.getPreSelectedRTSLayersList()!!

this.preSelectedRTSLayersList= this.selectedRTSLayersList
this.selectedRTSLayersList= tempList
logUtil!!.put(StringMaker().
                            append("Preselected: ")!!.append(this.preSelectedRTSLayersList!!.toString())!!.toString(), this, "setSelectedRTSLayer")

                                    }
                                

    
                        if(selectedLayer != 
                                    null
                                )
                        
                                    {
                                    this.selectedRTSLayersList!!.add(selectedLayer)

                                    }
                                
this.paintSelectedRTSLayersList= this.selectedRTSLayersList
}


open fun getLastSelectedRtsLayer()
        //nullable = true from not(false or (false and true)) = true
: RTSLayer{

    
                        if(this.isAnyRTSLayerSelected())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getSelectedBasicArrayList()!!.get(this.selectedRTSLayersList!!.size() -1) as RTSLayer

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                        }
                            
}


open fun selectAllPreselected()
        //nullable = true from not(false or (false and true)) = true
{

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Select all Preselected: ")
stringBuffer!!.append(this.preSelectedRTSLayersList!!.toString())
logUtil!!.put(stringBuffer!!.toString(), this, "selectAllPreselected")




                        for (index in this.preSelectedRTSLayersList!!.size() -1 downTo 0)

        {

    var rtsLayer: RTSLayer = this.preSelectedRTSLayersList!!.get(index) as RTSLayer

rtsLayer!!.select()
}

}


open fun deselectAllPreselected()
        //nullable = true from not(false or (false and true)) = true
{

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Deselect all Preselected: ")
stringBuffer!!.append(this.preSelectedRTSLayersList!!.toString())
logUtil!!.put(stringBuffer!!.toString(), this, "deselectAllPreselected")




                        for (index in this.preSelectedRTSLayersList!!.size() -1 downTo 0)

        {

    var rtsLayer: RTSLayer = this.preSelectedRTSLayersList!!.get(index) as RTSLayer

rtsLayer!!.deselect()
}

this.preSelectedRTSLayersList!!.clear()
}


open fun deselectAll()
        //nullable = true from not(false or (false and true)) = true
{




                        for (index in this.getSelectedBasicArrayList()!!.size() -1 downTo 0)

        {

    var rtsLayer: RTSLayer = this.getSelectedBasicArrayList()!!.get(index) as RTSLayer

rtsLayer!!.deselect()
}

}


open fun isAnyRTSLayerSelected()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

    
                        if(this.getSelectedBasicArrayList()!!.size() == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


open fun getPaintSelectedRTSLayersList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return paintSelectedRTSLayersList
}


open fun getPreSelectedRTSLayersList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return preSelectedRTSLayersList
}


}
                
            

