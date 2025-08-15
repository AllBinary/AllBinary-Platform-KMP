
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2006 AllBinary 
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
        package org.allbinary.game.input.form




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.game.input.RTSPlayerGameInput
import org.allbinary.game.layer.AdvancedRTSGameLayer
import org.allbinary.game.layer.AdvancedRTSPlayerLayerInterface
import org.allbinary.game.layer.GeographicMapCellPositionArea
import org.allbinary.game.layer.RTSGameStrings
import org.allbinary.game.layer.RTSLayer
import org.allbinary.game.layer.RTSLayerEvent
import org.allbinary.game.layer.RTSLayerUtil
import org.allbinary.game.layer.RTSPlayerLayerInterface
import org.allbinary.game.layer.capital.Capital
import org.allbinary.game.layer.waypoint.WaypointCellPositionHistory
import org.allbinary.game.layer.waypoint.WaypointLayer
import org.allbinary.game.layer.waypoint.event.WaypointEventHandlerFactory
import org.allbinary.graphics.form.item.CustomItem
import org.allbinary.util.BasicArrayList
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.java.bool.BooleanFactory
import org.allbinary.game.identification.Group
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.game.layer.AllBinaryTiledLayer
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
import org.allbinary.media.graphics.geography.map.GeographicMapCellType
import org.allbinary.media.graphics.geography.map.GeographicMapCompositeInterface
import org.allbinary.media.graphics.geography.map.drop.DropCellPositionHistory
import org.allbinary.media.graphics.geography.map.racetrack.RaceTrackGeographicMapCellTypeFactory

open public class WaypointRTSFormInput : RTSFormInput {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var isPrimaryWaypointCreator: Boolean

    val dragToSpotGameNotificationEvent: GameNotificationEvent

    val spotTakenGameNotificationEvent: GameNotificationEvent

    val buildingCollisionGameNotificationEvent: GameNotificationEvent

    val roadCollisionGameNotificationEvent: GameNotificationEvent

    val newWaypointGameNotificationEvent: GameNotificationEvent

    val noMoneyGameNotificationEvent: GameNotificationEvent
public constructor        (groupInterface: Array<Group?>, isPrimaryWaypointCreator: Boolean)                        

                            : super(groupInterface){

                    var groupInterface = groupInterface


                    var isPrimaryWaypointCreator = isPrimaryWaypointCreator


                            //For kotlin this is before the body of the constructor.
                    
this.isPrimaryWaypointCreator= isPrimaryWaypointCreator

    var smallIntegerSingletonFactory: SmallIntegerSingletonFactory = SmallIntegerSingletonFactory.getInstance()!!
            


    var basicColorFactory: BasicColorFactory = BasicColorFactory.getInstance()!!
            

this.dragToSpotGameNotificationEvent= GameNotificationEvent(this, RTSGameStrings.getInstance()!!.DRAG_TO_SPOT, smallIntegerSingletonFactory!!.getInstance(2), basicColorFactory!!.WHITE, BooleanFactory.getInstance()!!.FALSE)
this.spotTakenGameNotificationEvent= GameNotificationEvent(this, RTSGameStrings.getInstance()!!.SPOT_TAKEN, smallIntegerSingletonFactory!!.getInstance(2), basicColorFactory!!.WHITE, BooleanFactory.getInstance()!!.FALSE)
this.buildingCollisionGameNotificationEvent= GameNotificationEvent(this, RTSGameStrings.getInstance()!!.BUILDING_COLLISION, smallIntegerSingletonFactory!!.getInstance(2), basicColorFactory!!.WHITE, BooleanFactory.getInstance()!!.FALSE)
this.roadCollisionGameNotificationEvent= GameNotificationEvent(this, RTSGameStrings.getInstance()!!.ROAD_COLLISION, smallIntegerSingletonFactory!!.getInstance(2), basicColorFactory!!.WHITE, BooleanFactory.getInstance()!!.FALSE)
this.newWaypointGameNotificationEvent= GameNotificationEvent(this, RTSGameStrings.getInstance()!!.NEW_WAYPOINT, smallIntegerSingletonFactory!!.getInstance(2), basicColorFactory!!.WHITE, BooleanFactory.getInstance()!!.FALSE)
this.noMoneyGameNotificationEvent= GameNotificationEvent(this, RTSGameStrings.getInstance()!!.NO_MONEY, smallIntegerSingletonFactory!!.getInstance(2), basicColorFactory!!.WHITE, BooleanFactory.getInstance()!!.FALSE)
}


                @Throws(Exception::class)
            
open fun setAllBinaryGameLayerManager(allBinaryGameLayerManager: AllBinaryGameLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryGameLayerManager = allBinaryGameLayerManager
super.setAllBinaryGameLayerManager(allBinaryGameLayerManager)

    var geographicMapCompositeInterface: GeographicMapCompositeInterface = allBinaryGameLayerManager as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!

this.dragToSpotGameNotificationEvent!!.setBasicColorP(geographicMapInterface!!.getForegroundBasicColor())
this.spotTakenGameNotificationEvent!!.setBasicColorP(geographicMapInterface!!.getForegroundBasicColor())
this.buildingCollisionGameNotificationEvent!!.setBasicColorP(geographicMapInterface!!.getForegroundBasicColor())
this.roadCollisionGameNotificationEvent!!.setBasicColorP(geographicMapInterface!!.getForegroundBasicColor())
this.newWaypointGameNotificationEvent!!.setBasicColorP(geographicMapInterface!!.getForegroundBasicColor())
this.noMoneyGameNotificationEvent!!.setBasicColorP(geographicMapInterface!!.getForegroundBasicColor())
}


                @Throws(Exception::class)
            
open fun process(associatedRtsLayer: RTSLayer, rtsPlayerLayerInterface: RTSPlayerLayerInterface, layerManager: AllBinaryLayerManager, point: GPoint)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedRtsLayer = associatedRtsLayer


                    var rtsPlayerLayerInterface = rtsPlayerLayerInterface


                    var layerManager = layerManager


                    var point = point
super.process(layerManager)

    
                        if(this.isStickyItemSelected() || associatedRtsLayer == 
                                    null
                                )
                        
                                    {
                                    
    
                        if(this.isStickyItemSelected() && associatedRtsLayer == 
                                    null
                                )
                        
                                    {
                                    
    var geographicMapCompositeInterface: GeographicMapCompositeInterface = layerManager as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!


    var allBinaryTiledLayer: AllBinaryTiledLayer = geographicMapInterface!!.getAllBinaryTiledLayer()!!
            


    var x: Int = point.getX() +allBinaryTiledLayer!!.getXP()


    var y: Int = point.getY() +allBinaryTiledLayer!!.getYP()


    var geographicMapCellPosition: GeographicMapCellPosition = geographicMapInterface!!.getCellPositionAt(x, y)!!
            

this.process(rtsPlayerLayerInterface, layerManager, geographicMapCellPosition)

                                    }
                                
                        else {
                            
    
                        if(!rtsPlayerLayerInterface!!.implmentsArtificialIntelligenceCompositeInterface())
                        
                                    {
                                    GameNotificationEventHandler.getInstance()!!.fireEvent(dragToSpotGameNotificationEvent)

                                    }
                                

                        }
                            

                                    }
                                
                        else {
                            
    
                        if(!rtsPlayerLayerInterface!!.implmentsArtificialIntelligenceCompositeInterface())
                        
                                    {
                                    GameNotificationEventHandler.getInstance()!!.fireEvent(spotTakenGameNotificationEvent)

                                    }
                                

                        }
                            
}


                @Throws(Exception::class)
            
open fun process(rtsPlayerLayerInterface: RTSPlayerLayerInterface, layerManager: AllBinaryLayerManager, geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
{

                    var rtsPlayerLayerInterface = rtsPlayerLayerInterface


                    var layerManager = layerManager


                    var geographicMapCellPosition = geographicMapCellPosition

    var itemIndex: Int = this.getSelectedStickyItemIndex()!!
            


    
                        if(this.newUnconstructedRTSLayerInterfaceArray[itemIndex] == 
                                    null
                                )
                        
                                    {
                                    this.newUnconstructedRTSLayerInterfaceArray[itemIndex]= this.getInstance(layerManager, this.getSelectedStickyItem(), geographicMapCellPosition)

                                    }
                                
                        else {
                            
    var cellPoint: GPoint = geographicMapCellPosition!!.getPoint()!!
            

this.newUnconstructedRTSLayerInterfaceArray[itemIndex]!!.setPosition(cellPoint!!.getX(), cellPoint!!.getY(), this.newUnconstructedRTSLayerInterfaceArray[itemIndex]!!.getZP())

    var geographicMapCompositeInterface: GeographicMapCompositeInterface = this.newUnconstructedRTSLayerInterfaceArray[itemIndex]!!.allBinaryGameLayerManagerP as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!

this.newUnconstructedRTSLayerInterfaceArray[itemIndex]!!.geographicMapCellPositionArea!!.update(geographicMapInterface)

                        }
                            
this.attemptBuild(rtsPlayerLayerInterface, layerManager, this.newUnconstructedRTSLayerInterfaceArray[itemIndex]!!, itemIndex)
}


    private var stickyAssociatedRtsLayer: RTSLayer

                @Throws(Exception::class)
            
open fun processSticky(associatedRtsLayer: RTSLayer, rtsPlayerLayerInterface: RTSPlayerLayerInterface, layerManager: AllBinaryLayerManager, item: CustomItem, index: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedRtsLayer = associatedRtsLayer


                    var rtsPlayerLayerInterface = rtsPlayerLayerInterface


                    var layerManager = layerManager


                    var item = item


                    var index = index
logUtil!!.put("Set Sticking Item: " +item, this, "processSticky")
this.setSelectedStickyItem(item)
this.setSelectedStickyItemIndex(index)
this.setStickyItemSelected(true)
this.stickyAssociatedRtsLayer= associatedRtsLayer
this.getHashtable()!!.put(Layer.ID, associatedRtsLayer)
}


                @Throws(Exception::class)
            
open fun attemptBuild(rtsPlayerLayerInterface: RTSPlayerLayerInterface, layerManager: AllBinaryLayerManager, layerInterface: RTSLayer, itemIndex: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var rtsPlayerLayerInterface = rtsPlayerLayerInterface


                    var layerManager = layerManager


                    var layerInterface = layerInterface


                    var itemIndex = itemIndex
logUtil!!.put("Layer: " +layerInterface, this, "attemptBuild")

    
                        if(layerInterface == 
                                    null
                                )
                        
                                    {
                                    logUtil!!.put("Layer was null", this, "attemptBuild", Exception())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                

    var geographicMapCellPositionArea: GeographicMapCellPositionArea = layerInterface!!.geographicMapCellPositionArea


    var list: BasicArrayList = geographicMapCellPositionArea!!.getOccupyingGeographicMapCellPositionList()!!
            


    
                        if(DropCellPositionHistory.getInstance()!!.anyCellPositionWithDrop(list) || WaypointCellPositionHistory.getInstance()!!.anyCellPositionWithDrop(list))
                        
                                    {
                                    rtsPlayerLayerInterface!!.add(ErrorSound.getInstance())

    
                        if(!rtsPlayerLayerInterface!!.implmentsArtificialIntelligenceCompositeInterface())
                        
                                    {
                                    GameNotificationEventHandler.getInstance()!!.fireEvent(buildingCollisionGameNotificationEvent)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                

    var geographicMapCompositeInterface: GeographicMapCompositeInterface = layerManager as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!


    var raceTrackGeographicMapCellTypeFactory: RaceTrackGeographicMapCellTypeFactory = geographicMapInterface!!.getGeographicMapCellTypeFactory() as RaceTrackGeographicMapCellTypeFactory


    var geographicMapCellType: GeographicMapCellType





                        for (index in list.size()!! downTo 0)


        {geographicMapCellType= geographicMapInterface!!.getCellTypeAt(list.get(index) as GeographicMapCellPosition)

    
                        if(raceTrackGeographicMapCellTypeFactory!!.isPath(geographicMapCellType))
                        
                                    {
                                    rtsPlayerLayerInterface!!.add(ErrorSound.getInstance())

    
                        if(!rtsPlayerLayerInterface!!.implmentsArtificialIntelligenceCompositeInterface())
                        
                                    {
                                    GameNotificationEventHandler.getInstance()!!.fireEvent(roadCollisionGameNotificationEvent)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
}


    var cost: Int = layerInterface!!.getCost()!!
            


    var capital: Capital = rtsPlayerLayerInterface!!.getCapital()!!
            


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Trying to Build: ")
stringBuffer!!.append(layerInterface!!.getName())
stringBuffer!!.append(" for: $")
stringBuffer!!.append(cost)
stringBuffer!!.append(" with ")
stringBuffer!!.append(capital.getTotalMoney())
logUtil!!.put(stringBuffer!!.toString(), this, "attemptBuild")

    
                        if(cost <= capital.getTotalMoney())
                        
                                    {
                                    layerInterface!!.construct(rtsPlayerLayerInterface)
newUnconstructedRTSLayerInterfaceArray[itemIndex]= 
                                        null
                                    
capital.removeMoney(cost)
WaypointCellPositionHistory.getInstance()!!.add(list, layerInterface)

    var geographicMapCellPosition: GeographicMapCellPosition = geographicMapInterface!!.getCellPositionAt(layerInterface!!.getXP(), layerInterface!!.getYP())!!
            


    var waypointLayer: WaypointLayer = layerInterface as WaypointLayer

this.addWayPoint(waypointLayer)

    var rtsPlayerGameInput: RTSPlayerGameInput = rtsPlayerLayerInterface!!.getPlayerGameInput() as RTSPlayerGameInput

rtsPlayerGameInput!!.setSelectedRTSLayer(layerInterface, geographicMapCellPosition)

    var advancedRTSPlayerLayerInterface: AdvancedRTSPlayerLayerInterface = rtsPlayerLayerInterface as AdvancedRTSPlayerLayerInterface

advancedRTSPlayerLayerInterface!!.getAdvancedPlayerOwnedRTSLayers()!!.addWaypoint(layerInterface)
layerManager!!.append(layerInterface)
rtsPlayerLayerInterface!!.add(waypointLayer = waypointLayerwaypointLayer as AdvancedRTSGameLayer
waypointLayer.
                    getWaypointBehavior()!!.getWaypoint()!!.getSound())

    
                        if(!rtsPlayerLayerInterface!!.implmentsArtificialIntelligenceCompositeInterface())
                        
                                    {
                                    GameNotificationEventHandler.getInstance()!!.fireEvent(newWaypointGameNotificationEvent)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            rtsPlayerLayerInterface!!.add(ErrorSound.getInstance())

    
                        if(!rtsPlayerLayerInterface!!.implmentsArtificialIntelligenceCompositeInterface())
                        
                                    {
                                    GameNotificationEventHandler.getInstance()!!.fireEvent(noMoneyGameNotificationEvent)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


    private val WAYPOINT_EVENT: RTSLayerEvent = RTSLayerEvent(
                            null)

                @Throws(Exception::class)
            
open fun addWayPoint(layerInterface: WaypointLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var layerInterface = layerInterface

    var list: BasicArrayList = stickyAssociatedRtsLayer = stickyAssociatedRtsLayerstickyAssociatedRtsLayer as AdvancedRTSGameLayer
stickyAssociatedRtsLayer.
                    getWaypointBehavior()!!.getOwnedWaypointList()!!
            

RTSLayerUtil.getInstance()!!.destroyAndClear(list)
list.add(layerInterface)

    
                        if(this.isPrimaryWaypointCreator)
                        
                                    {
                                    PrimaryWaypointHelper.getInstance()!!.setWaypointLayer(layerInterface)

                                    }
                                
this.WAYPOINT_EVENT.setRtsLayer(layerInterface)
WaypointEventHandlerFactory.getInstance(layerInterface!!.getGroupInterface()[0]!!)!!.fireEvent(this.WAYPOINT_EVENT)
}


}
                
            

