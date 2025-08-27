
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
        package org.allbinary.game.input.form




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.RTSPlayerGameInput
import org.allbinary.game.layer.DemoLockedWithCostLayerInterfaceFactoryInterface
import org.allbinary.game.layer.GeographicMapCellPositionArea
import org.allbinary.game.layer.RTSGameStrings
import org.allbinary.game.layer.RTSLayer
import org.allbinary.game.layer.RTSPlayerLayerInterface
import org.allbinary.game.layer.capital.Capital
import org.allbinary.game.layer.item.LayerInterfaceFactoryImageItem
import org.allbinary.graphics.form.item.CustomItem
import org.allbinary.media.audio.BuildingSound
import org.allbinary.util.BasicArrayList
import org.allbinary.string.CommonStrings
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.java.bool.BooleanFactory
import org.allbinary.logic.system.security.licensing.LockedFeatureNotificationUtil
import org.allbinary.logic.system.security.licensing.LockedUtil
import org.allbinary.game.identification.Group
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.game.layer.hud.event.GameNotificationEvent
import org.allbinary.game.layer.hud.event.GameNotificationEventHandler
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.logic.string.StringUtil
import org.allbinary.media.audio.ErrorSound
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.GeographicMapCellType
import org.allbinary.media.graphics.geography.map.GeographicMapCompositeInterface
import org.allbinary.media.graphics.geography.map.drop.DropCellPositionHistory
import org.allbinary.media.graphics.geography.map.racetrack.RaceTrackGeographicMapCellTypeFactory

open public class BuildingRTSFormInput : RTSFormInput {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var isUnitProducer: Boolean

    private val buildOnPathGameNotificationEvent: GameNotificationEvent

    private val spotTakenGameNotificationEvent: GameNotificationEvent

    private val selectBuildSpotGameNotificationEvent: GameNotificationEvent

    private val roadCollisionGameNotificationEvent: GameNotificationEvent

    private val noMoneyGameNotificationEvent: GameNotificationEvent

    private val buildingCollisionGameNotificationEvent: GameNotificationEvent

    private val structureToCloseCollisionGameNotificationEvent: GameNotificationEvent

    private val buildingGameNotificationEvent: GameNotificationEvent

    private val mapEdgeGameNotificationEvent: GameNotificationEvent

    private val dropCellPositionHistory: DropCellPositionHistory = DropCellPositionHistory.getInstance()!!
public constructor        (groupInterface: Array<Group?>, isUnitProducer: Boolean)                        

                            : super(groupInterface){

                    var groupInterface = groupInterface


                    var isUnitProducer = isUnitProducer


                            //For kotlin this is before the body of the constructor.
                    
this.isUnitProducer= isUnitProducer

    var smallIntegerSingletonFactory: SmallIntegerSingletonFactory = SmallIntegerSingletonFactory.getInstance()!!


    var basicColorFactory: BasicColorFactory = BasicColorFactory.getInstance()!!

this.buildOnPathGameNotificationEvent= GameNotificationEvent(this, RTSGameStrings.getInstance()!!.BUILD_ON_PATH, smallIntegerSingletonFactory!!.getInstance(2), basicColorFactory!!.PINK, BooleanFactory.getInstance()!!.FALSE)
this.spotTakenGameNotificationEvent= GameNotificationEvent(this, RTSGameStrings.getInstance()!!.SPOT_TAKEN, smallIntegerSingletonFactory!!.getInstance(2), basicColorFactory!!.PINK, BooleanFactory.getInstance()!!.FALSE)
this.selectBuildSpotGameNotificationEvent= GameNotificationEvent(this, RTSGameStrings.getInstance()!!.SELECT_BUILD_SPOT, smallIntegerSingletonFactory!!.getInstance(2), basicColorFactory!!.PINK, BooleanFactory.getInstance()!!.FALSE)
this.roadCollisionGameNotificationEvent= GameNotificationEvent(this, RTSGameStrings.getInstance()!!.ROAD_COLLISION, smallIntegerSingletonFactory!!.getInstance(2), basicColorFactory!!.PINK, BooleanFactory.getInstance()!!.FALSE)
this.noMoneyGameNotificationEvent= GameNotificationEvent(this, RTSGameStrings.getInstance()!!.NO_MONEY, smallIntegerSingletonFactory!!.getInstance(2), basicColorFactory!!.PINK, BooleanFactory.getInstance()!!.FALSE)
this.buildingCollisionGameNotificationEvent= GameNotificationEvent(this, RTSGameStrings.getInstance()!!.BUILDING_COLLISION, smallIntegerSingletonFactory!!.getInstance(2), basicColorFactory!!.PINK, BooleanFactory.getInstance()!!.FALSE)
this.structureToCloseCollisionGameNotificationEvent= GameNotificationEvent(this, RTSGameStrings.getInstance()!!.STRUCTURE_TO_CLOSE, smallIntegerSingletonFactory!!.getInstance(2), basicColorFactory!!.PINK, BooleanFactory.getInstance()!!.FALSE)
this.buildingGameNotificationEvent= GameNotificationEvent(this, RTSGameStrings.getInstance()!!.BUILDING, smallIntegerSingletonFactory!!.getInstance(2), basicColorFactory!!.PINK, BooleanFactory.getInstance()!!.FALSE)
this.mapEdgeGameNotificationEvent= GameNotificationEvent(this, RTSGameStrings.getInstance()!!.MAP_EDGE, smallIntegerSingletonFactory!!.getInstance(2), basicColorFactory!!.PINK, BooleanFactory.getInstance()!!.FALSE)
}


                @Throws(Exception::class)
            
open fun setAllBinaryGameLayerManager(allBinaryGameLayerManager: AllBinaryGameLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryGameLayerManager = allBinaryGameLayerManager
super.setAllBinaryGameLayerManager(allBinaryGameLayerManager)

    var geographicMapCompositeInterface: GeographicMapCompositeInterface = allBinaryGameLayerManager as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!

this.buildOnPathGameNotificationEvent!!.setBasicColorP(geographicMapInterface!!.getForegroundBasicColor())
this.spotTakenGameNotificationEvent!!.setBasicColorP(geographicMapInterface!!.getForegroundBasicColor())
this.selectBuildSpotGameNotificationEvent!!.setBasicColorP(geographicMapInterface!!.getForegroundBasicColor())
this.roadCollisionGameNotificationEvent!!.setBasicColorP(geographicMapInterface!!.getForegroundBasicColor())
this.noMoneyGameNotificationEvent!!.setBasicColorP(geographicMapInterface!!.getForegroundBasicColor())
this.buildingCollisionGameNotificationEvent!!.setBasicColorP(geographicMapInterface!!.getForegroundBasicColor())
this.structureToCloseCollisionGameNotificationEvent!!.setBasicColorP(geographicMapInterface!!.getForegroundBasicColor())
this.buildingGameNotificationEvent!!.setBasicColorP(geographicMapInterface!!.getForegroundBasicColor())
this.mapEdgeGameNotificationEvent!!.setBasicColorP(geographicMapInterface!!.getForegroundBasicColor())
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
this.buildFromMotionInput(rtsPlayerLayerInterface, layerManager, item, itemIndex)
}


open fun isPositionBlocked()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return dropCellPositionHistory!!.isCellPositionWithDrop(this.getSelectedGeographicCellPosition())
}


open fun isDemoLocked(item: CustomItem)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var item = item

    var factoryItem: LayerInterfaceFactoryImageItem = item as LayerInterfaceFactoryImageItem


    var layerInterfaceFactoryInterface: DemoLockedWithCostLayerInterfaceFactoryInterface = factoryItem!!.getLayerInterfaceFactoryInterface() as DemoLockedWithCostLayerInterfaceFactoryInterface


    
                        if(LockedUtil.getInstance()!!.isLockedFeature() && layerInterfaceFactoryInterface!!.isDemoLocked())
                        
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
            
open fun buildFromMotionInput(rtsPlayerLayerInterface: RTSPlayerLayerInterface, layerManager: AllBinaryLayerManager, item: CustomItem, itemIndex: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var rtsPlayerLayerInterface = rtsPlayerLayerInterface


                    var layerManager = layerManager


                    var item = item


                    var itemIndex = itemIndex

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.START, this, "buildFromMotionInput")

    
                        if(layerManager == 
                                    null
                                )
                        
                                    {
                                    


                            throw RuntimeException()

                                    }
                                

    var geographicMapCompositeInterface: GeographicMapCompositeInterface = layerManager as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!


    
                        if(this.isDemoLocked(item))
                        
                                    {
                                    rtsPlayerLayerInterface!!.add(ErrorSound.getInstance())
LockedFeatureNotificationUtil.getInstance()!!.fire(geographicMapInterface!!.getForegroundBasicColor())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    var geographicMapCellPosition: GeographicMapCellPosition = this.getSelectedGeographicCellPosition()!!


    
                        if(geographicMapCellPosition != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(!this.isPositionBlocked())
                        
                                    {
                                    
    var geographicMapCellType: GeographicMapCellType = geographicMapInterface!!.getCellTypeAt(geographicMapCellPosition)!!


    var raceTrackGeographicMapCellTypeFactory: RaceTrackGeographicMapCellTypeFactory = geographicMapInterface!!.getGeographicMapCellTypeFactory() as RaceTrackGeographicMapCellTypeFactory


    
                        if(!raceTrackGeographicMapCellTypeFactory!!.isPath(geographicMapCellType))
                        
                                    {
                                    
    
                        if(this.newUnconstructedRTSLayerInterfaceArray[itemIndex] == 
                                    null
                                )
                        
                                    {
                                    this.newUnconstructedRTSLayerInterfaceArray[itemIndex]= this.getInstance(layerManager, item, geographicMapCellPosition)

                                    }
                                
                        else {
                            
    var cellPoint: GPoint = geographicMapCellPosition!!.getPoint()!!

this.newUnconstructedRTSLayerInterfaceArray[itemIndex]!!.setPosition(cellPoint!!.getX(), cellPoint!!.getY(), cellPoint!!.getZ())
this.newUnconstructedRTSLayerInterfaceArray[itemIndex]!!.geographicMapCellPositionArea!!.update(geographicMapInterface)

                        }
                            
this.attemptBuild(rtsPlayerLayerInterface, layerManager, this.newUnconstructedRTSLayerInterfaceArray[itemIndex]!!, itemIndex)

                                    }
                                
                        else {
                            rtsPlayerLayerInterface!!.add(ErrorSound.getInstance())

    
                        if(!rtsPlayerLayerInterface!!.implmentsArtificialIntelligenceCompositeInterface())
                        
                                    {
                                    GameNotificationEventHandler.getInstance()!!.fireEvent(buildOnPathGameNotificationEvent)

                                    }
                                

                        }
                            

                                    }
                                
                        else {
                            rtsPlayerLayerInterface!!.add(ErrorSound.getInstance())

    
                        if(!rtsPlayerLayerInterface!!.implmentsArtificialIntelligenceCompositeInterface())
                        
                                    {
                                    GameNotificationEventHandler.getInstance()!!.fireEvent(spotTakenGameNotificationEvent)

                                    }
                                

                        }
                            

                                    }
                                
                        else {
                            rtsPlayerLayerInterface!!.add(ErrorSound.getInstance())

    
                        if(!rtsPlayerLayerInterface!!.implmentsArtificialIntelligenceCompositeInterface())
                        
                                    {
                                    GameNotificationEventHandler.getInstance()!!.fireEvent(selectBuildSpotGameNotificationEvent)

                                    }
                                

                        }
                            
}


                @Throws(Exception::class)
            
open fun attemptBuild(rtsPlayerLayerInterface: RTSPlayerLayerInterface, layerManager: AllBinaryLayerManager, layerInterface: RTSLayer, itemIndex: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var rtsPlayerLayerInterface = rtsPlayerLayerInterface


                    var layerManager = layerManager


                    var layerInterface = layerInterface


                    var itemIndex = itemIndex
logUtil!!.put(StringMaker().
                            append("Layer: ")!!.append(StringUtil.getInstance()!!.toString(layerInterface))!!.toString(), this, "attemptBuild")

    var geographicMapCellPositionArea: GeographicMapCellPositionArea = layerInterface!!.geographicMapCellPositionArea


    var occupyList: BasicArrayList = geographicMapCellPositionArea!!.getOccupyingGeographicMapCellPositionList()!!


    
                        if(!this.isBuildAttemptValid(rtsPlayerLayerInterface, layerInterface))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                

    var geographicMapCellType: GeographicMapCellType





                        for (index in occupyList!!.size() -1 downTo 0)

        {
    var geographicMapCompositeInterface: GeographicMapCompositeInterface = layerManager as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!

geographicMapCellType= geographicMapInterface!!.getCellTypeAt(occupyList!!.get(index) as GeographicMapCellPosition)

    var raceTrackGeographicMapCellTypeFactory: RaceTrackGeographicMapCellTypeFactory = geographicMapInterface!!.getGeographicMapCellTypeFactory() as RaceTrackGeographicMapCellTypeFactory


    
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
this.add(rtsPlayerLayerInterface, layerManager, layerInterface)



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


                @Throws(Exception::class)
            
open fun isBuildAttemptValid(rtsPlayerLayerInterface: RTSPlayerLayerInterface, layerInterface: RTSLayer)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var rtsPlayerLayerInterface = rtsPlayerLayerInterface


                    var layerInterface = layerInterface

    var geographicMapCellPositionArea: GeographicMapCellPositionArea = layerInterface!!.geographicMapCellPositionArea


    var occupyList: BasicArrayList = geographicMapCellPositionArea!!.getOccupyingGeographicMapCellPositionList()!!


    
                        if(dropCellPositionHistory!!.anyCellPositionWithDrop(occupyList))
                        
                                    {
                                    rtsPlayerLayerInterface!!.add(ErrorSound.getInstance())

    
                        if(!rtsPlayerLayerInterface!!.implmentsArtificialIntelligenceCompositeInterface())
                        
                                    {
                                    GameNotificationEventHandler.getInstance()!!.fireEvent(buildingCollisionGameNotificationEvent)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                

    
                        if(this.isUnitProducer && this.dropCellPositionHistory!!.anyCellPositionWithDrop(geographicMapCellPositionArea!!.getSurroundingGeographicMapCellPositionList()))
                        
                                    {
                                    rtsPlayerLayerInterface!!.add(ErrorSound.getInstance())

    
                        if(!rtsPlayerLayerInterface!!.implmentsArtificialIntelligenceCompositeInterface())
                        
                                    {
                                    GameNotificationEventHandler.getInstance()!!.fireEvent(structureToCloseCollisionGameNotificationEvent)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
                        else {
                            
    
                        if(this.isSurroundingCellsOffMap(layerInterface))
                        
                                    {
                                    rtsPlayerLayerInterface!!.add(ErrorSound.getInstance())

    
                        if(!rtsPlayerLayerInterface!!.implmentsArtificialIntelligenceCompositeInterface())
                        
                                    {
                                    GameNotificationEventHandler.getInstance()!!.fireEvent(mapEdgeGameNotificationEvent)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


                @Throws(Exception::class)
            
open fun add(rtsPlayerLayerInterface: RTSPlayerLayerInterface, layerManager: AllBinaryLayerManager, layerInterface: RTSLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var rtsPlayerLayerInterface = rtsPlayerLayerInterface


                    var layerManager = layerManager


                    var layerInterface = layerInterface

    var geographicMapCellPositionArea: GeographicMapCellPositionArea = layerInterface!!.geographicMapCellPositionArea


    var occupyList: BasicArrayList = geographicMapCellPositionArea!!.getOccupyingGeographicMapCellPositionList()!!

dropCellPositionHistory!!.add(occupyList, layerInterface)

    var rtsPlayerGameInput: RTSPlayerGameInput = rtsPlayerLayerInterface!!.getPlayerGameInput() as RTSPlayerGameInput

rtsPlayerGameInput!!.setSelectedRTSLayer(layerInterface, this.getSelectedGeographicCellPosition())
layerManager!!.append(layerInterface)
rtsPlayerLayerInterface!!.add(BuildingSound.getInstance())

    
                        if(!rtsPlayerLayerInterface!!.implmentsArtificialIntelligenceCompositeInterface())
                        
                                    {
                                    GameNotificationEventHandler.getInstance()!!.fireEvent(buildingGameNotificationEvent)

                                    }
                                
}


open fun isSurroundingCellsOffMap(layerInterface: RTSLayer)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var layerInterface = layerInterface

    var geographicMapCellPositionArea: GeographicMapCellPositionArea = layerInterface!!.geographicMapCellPositionArea


    var occupyList: BasicArrayList = geographicMapCellPositionArea!!.getOccupyingGeographicMapCellPositionList()!!


    var surroundList: BasicArrayList = geographicMapCellPositionArea!!.getSurroundingGeographicMapCellPositionList()!!


    var occupySize: Int = occupyList!!.size()!!


    var surroundSize: Int = surroundList!!.size()!!


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("occupySize: ")
stringBuffer!!.append(occupySize)
stringBuffer!!.append(" surroundSize: ")
stringBuffer!!.append(surroundSize)
stringBuffer!!.append(" surroundList: ")
stringBuffer!!.append(StringUtil.getInstance()!!.toString(surroundList))
logUtil!!.put(stringBuffer!!.toString(), this, "isSurroundingCellsOffMap")

    var isSurroundOffMap: Boolean = false


    
                        if(occupySize == 1 && surroundSize != 8)
                        
                                    {
                                    isSurroundOffMap= true

                                    }
                                
                             else 
    
                        if(occupySize == 4 && surroundSize != 12)
                        
                                    {
                                    isSurroundOffMap= true

                                    }
                                

    
                        if(occupySize == 0 || isSurroundOffMap)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


}
                
            

