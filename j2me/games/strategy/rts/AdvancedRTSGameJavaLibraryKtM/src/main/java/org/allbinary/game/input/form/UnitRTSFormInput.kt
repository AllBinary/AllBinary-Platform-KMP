
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2002 AllBinary 
                *   
                *  By agreeing to this license you and any business entity you represent are 
                *  legally bound to the AllBinary Open License Version 1 legal agreement. 
                *   
                *  You may obtain the AllBinary Open License Version 1 legal agreement from 
                *  AllBinary or the root directory of AllBinary's AllBinary Platform repository. 
                *    Created By: Travis Berthelot  
        */
        
        /* Generated Code Do Not Modify */
        package org.allbinary.game.input.form



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.game.layer.AdvancedPlayerOwnedRTSLayers
import org.allbinary.game.layer.AdvancedRTSGameLayer
import org.allbinary.game.layer.AdvancedRTSPlayerLayerInterface
import org.allbinary.game.layer.GeographicMapCellPositionArea
import org.allbinary.game.layer.RTSGameStrings
import org.allbinary.game.layer.RTSLayer
import org.allbinary.game.layer.RTSPlayerLayerInterface
import org.allbinary.game.layer.capital.Capital
import org.allbinary.game.layer.unit.UnitLayer
import org.allbinary.game.layer.waypoint.WorkWaypoint
import org.allbinary.graphics.form.item.CustomItem
import org.allbinary.media.audio.BuildingSound
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.java.bool.BooleanFactory
import org.allbinary.game.identification.Group
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.game.layer.hud.event.GameNotificationEvent
import org.allbinary.game.layer.hud.event.GameNotificationEventHandler
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.layer.Layer
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.media.audio.ErrorSound
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.GeographicMapCompositeInterface

open public class UnitRTSFormInput : RTSFormInput {
        

        companion object {
            
    val DECAL_ID: Integer = SmallIntegerSingletonFactory.getInstance()!!.getInstance(23)!!
            

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val noMoneyGameNotificationEvent: GameNotificationEvent

    val newUnitGameNotificationEvent: GameNotificationEvent
public constructor        (groupInterface: Array<Group?>)                        

                            : super(groupInterface){

                    var groupInterface = groupInterface


                            //For kotlin this is before the body of the constructor.
                    

    var smallIntegerSingletonFactory: SmallIntegerSingletonFactory = SmallIntegerSingletonFactory.getInstance()!!
            


    var basicColorFactory: BasicColorFactory = BasicColorFactory.getInstance()!!
            

this.noMoneyGameNotificationEvent= GameNotificationEvent(this, RTSGameStrings.getInstance()!!.NO_MONEY, smallIntegerSingletonFactory!!.getInstance(2), basicColorFactory!!.WHITE, BooleanFactory.getInstance()!!.FALSE)
this.newUnitGameNotificationEvent= GameNotificationEvent(this, RTSGameStrings.getInstance()!!.NEW_UNIT, smallIntegerSingletonFactory!!.getInstance(2), basicColorFactory!!.WHITE, BooleanFactory.getInstance()!!.FALSE)
this.getHashtable()!!.put(WorkWaypoint.ID, smallIntegerSingletonFactory!!.getInstance(50))
}


                @Throws(Exception::class)
            
open fun setAllBinaryGameLayerManager(allBinaryGameLayerManager: AllBinaryGameLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryGameLayerManager = allBinaryGameLayerManager
super.setAllBinaryGameLayerManager(allBinaryGameLayerManager)

    var geographicMapCompositeInterface: GeographicMapCompositeInterface = allBinaryGameLayerManager as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!

this.noMoneyGameNotificationEvent!!.setBasicColorP(geographicMapInterface!!.getForegroundBasicColor())
this.newUnitGameNotificationEvent!!.setBasicColorP(geographicMapInterface!!.getForegroundBasicColor())
}


                @Throws(Exception::class)
            
open fun process(associatedRtsLayer: RTSLayer, rtsPlayerLayerInterface: RTSPlayerLayerInterface, layerManager: AllBinaryLayerManager, item: CustomItem, itemIndex: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedRtsLayer = associatedRtsLayer


                    var rtsPlayerLayerInterface = rtsPlayerLayerInterface


                    var layerManager = layerManager


                    var item = item


                    var itemIndex = itemIndex
super.process(layerManager)

    var geographicMapCellPositionArea: GeographicMapCellPositionArea = associatedRtsLayer!!.geographicMapCellPositionArea


    var geographicMapCellPosition: GeographicMapCellPosition = geographicMapCellPositionArea!!.getNextSurroundingGeographicMapCellPosition()!!
            

this.getHashtable()!!.put(Layer.ID, associatedRtsLayer)
this.getHashtable()!!.put(UnitRTSFormInput.DECAL_ID, 
                                    (rtsPlayerLayerInterface as AdvancedRTSPlayerLayerInterface).getDecalBasicColor())

    
                        if(this.newUnconstructedRTSLayerInterfaceArray[itemIndex] == 
                                    null
                                )
                        
                                    {
                                    this.newUnconstructedRTSLayerInterfaceArray[itemIndex]= this.getInstance(layerManager, item, geographicMapCellPosition)

                                    }
                                
                        else {
                            
    var cellPoint: GPoint = geographicMapCellPosition!!.getPoint()!!
            

this.newUnconstructedRTSLayerInterfaceArray[itemIndex]!!.setPosition(cellPoint!!.getX(), cellPoint!!.getY(), this.newUnconstructedRTSLayerInterfaceArray[itemIndex]!!.getZP())

    var geographicMapCompositeInterface: GeographicMapCompositeInterface = this.newUnconstructedRTSLayerInterfaceArray[itemIndex]!!.allBinaryGameLayerManagerP as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!

this.newUnconstructedRTSLayerInterfaceArray[itemIndex]!!.geographicMapCellPositionArea!!.update(geographicMapInterface)

                        }
                            

    var cellPoint: GPoint = geographicMapCellPosition!!.getMidPoint()!!
            

this.newUnconstructedRTSLayerInterfaceArray[itemIndex]!!.setPosition(cellPoint!!.getX() -this.newUnconstructedRTSLayerInterfaceArray[itemIndex]!!.getHalfWidth(), cellPoint!!.getY() -this.newUnconstructedRTSLayerInterfaceArray[itemIndex]!!.getHalfHeight(), this.newUnconstructedRTSLayerInterfaceArray[itemIndex]!!.getZP())
this.attemptBuild(associatedRtsLayer, rtsPlayerLayerInterface, layerManager, this.newUnconstructedRTSLayerInterfaceArray[itemIndex]!!, itemIndex)
}


                @Throws(Exception::class)
            
open fun attemptBuild(associatedRtsLayer: RTSLayer, rtsPlayerLayerInterface: RTSPlayerLayerInterface, layerManager: AllBinaryLayerManager, layerInterface: RTSLayer, itemIndex: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedRtsLayer = associatedRtsLayer


                    var rtsPlayerLayerInterface = rtsPlayerLayerInterface


                    var layerManager = layerManager


                    var layerInterface = layerInterface


                    var itemIndex = itemIndex

    var cost: Int = layerInterface!!.getCost()!!
            


    var capital: Capital = rtsPlayerLayerInterface!!.getCapital()!!
            


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "Trying to Build: ")
stringBuffer!!.append(layerInterface!!.getName())
stringBuffer!!.append(
                            " for: $")
stringBuffer!!.append(cost)
stringBuffer!!.append(
                            " with ")
stringBuffer!!.append(capital.getTotalMoney())
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "attemptBuild")

    
                        if(cost <= capital.getTotalMoney())
                        
                                    {
                                    layerInterface!!.construct(rtsPlayerLayerInterface)
this.newUnconstructedRTSLayerInterfaceArray[itemIndex]= 
                                        null
                                    
rtsPlayerLayerInterface!!.add(BuildingSound.getInstance())
capital.removeMoney(cost)
AssignWaypointsUtil.getInstance()!!.set(layerInterface as UnitLayer, associatedRtsLayer as AdvancedRTSGameLayer)
layerManager!!.append(layerInterface, PlayersSingletonFactory.total)

    var advancedRTSPlayerLayerInterface: AdvancedRTSPlayerLayerInterface = rtsPlayerLayerInterface as AdvancedRTSPlayerLayerInterface


    var advancedPlayerOwnedRTSLayers: AdvancedPlayerOwnedRTSLayers = advancedRTSPlayerLayerInterface!!.getAdvancedPlayerOwnedRTSLayers()!!
            

advancedPlayerOwnedRTSLayers!!.addUnit(layerInterface)

    
                        if(!rtsPlayerLayerInterface!!.implmentsArtificialIntelligenceCompositeInterface())
                        
                                    {
                                    GameNotificationEventHandler.getInstance()!!.fireEvent(newUnitGameNotificationEvent)

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
                
            

