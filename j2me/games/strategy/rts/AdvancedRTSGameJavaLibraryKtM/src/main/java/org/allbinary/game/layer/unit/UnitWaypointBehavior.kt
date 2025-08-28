
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
        package org.allbinary.game.layer.unit




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.SensorAction
import org.allbinary.game.layer.SensorActionFactory
import org.allbinary.logic.string.StringMaker
import org.allbinary.game.input.form.PrimaryWaypointHelper
import org.allbinary.game.layer.AdvancedRTSGameLayer
import org.allbinary.game.layer.RTSLayerEvent
import org.allbinary.game.layer.WaypointBehaviorBase
import org.allbinary.game.layer.building.BuildingLayer
import org.allbinary.game.layer.special.CollidableDestroyableDamageableLayer
import org.allbinary.game.layer.waypoint.event.WaypointEventListenerInterface
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListUtil
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.string.CommonSeps
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.media.graphics.geography.map.GeographicMapCellHistory
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.time.TimeDelayHelper

open public class UnitWaypointBehavior : WaypointBehaviorBase
                , WaypointEventListenerInterface {
        

        companion object {
            
    private val PATHING: String = "Pathing"

        }
            
    var commonSeps: CommonSeps = CommonSeps.getInstance()!!

    private var longWeaponRange: Int = 0

    private var sensorAction: SensorAction = SensorActionFactory.getInstance()!!.ATTACK

    private val completeTimeDelayHelper: TimeDelayHelper

    var currentGeographicMapCellHistory: GeographicMapCellHistory

    private var lastPathGeographicMapCellPosition: GeographicMapCellPosition

    private var currentPathGeographicMapCellPosition: GeographicMapCellPosition

    private val FAKE_WAYPOINT_LAYER: CollidableDestroyableDamageableLayer

    val targetList: BasicArrayList

    private var moving: Boolean = false

    private var movingFromStopped: Boolean = false

    var waypointPathsList: BasicArrayList

    private val possibleTargetList: BasicArrayList

    private var currentTargetDistance: Int = Integer.MAX_VALUE

    var currentTargetLayerInterface: CollidableDestroyableDamageableLayer

    private var trackingWaypoint: Boolean= false

    val associatedAdvancedRTSGameLayer: UnitLayer
protected constructor        (associatedAdvancedRTSGameLayer: UnitLayer, fakeWaypoint: CollidableDestroyableDamageableLayer)

        Updates for KMP build        
        {
var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
var fakeWaypoint = fakeWaypoint
this.associatedAdvancedRTSGameLayer= associatedAdvancedRTSGameLayer
this.completeTimeDelayHelper= TimeDelayHelper(30000)
this.targetList= BasicArrayList()
this.possibleTargetList= BasicArrayList()
this.setWaypointPathsList(BasicArrayListUtil.getInstance()!!.getImmutableInstance())
this.setCurrentGeographicMapCellHistory(GeographicMapCellHistory())
this.FAKE_WAYPOINT_LAYER= fakeWaypoint
}


open fun initRange(weaponRange: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var weaponRange = weaponRange
this.longWeaponRange= weaponRange /2
}


open fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var eventObject = eventObject
ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}


                @Throws(Exception::class)
            
open fun onWaypointEvent(event: RTSLayerEvent)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var event = event

    var advancedRTSGameLayer: AdvancedRTSGameLayer = event.getRtsLayer() as AdvancedRTSGameLayer

this.associatedAdvancedRTSGameLayer!!.waypointLogHelper!!.onWaypointEvent(this.associatedAdvancedRTSGameLayer, advancedRTSGameLayer)

    
                        if(this.associatedAdvancedRTSGameLayer!!.isSelected())
                        
                                    {
                                    this.addWaypointFromUser(advancedRTSGameLayer)

                                    }
                                
                             else 
    
                        if(advancedRTSGameLayer!!.shouldAddWaypointFromBuilding())
                        
                                    {
                                    this.addWaypointFromBuilding(advancedRTSGameLayer)

                                    }
                                
}


                @Throws(Exception::class)
            
open fun addWaypointFromUser(advancedRTSGameLayer: AdvancedRTSGameLayer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var advancedRTSGameLayer = advancedRTSGameLayer
}


                @Throws(Exception::class)
            
open fun addWaypointFromBuilding(advancedRTSGameLayer: AdvancedRTSGameLayer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var advancedRTSGameLayer = advancedRTSGameLayer

    
                        if(advancedRTSGameLayer == PrimaryWaypointHelper.getInstance()!!.getWaypointLayer() || advancedRTSGameLayer!!.getParentLayer() == associatedAdvancedRTSGameLayer!!.getParentLayer())
                        
                                    {
                                    
    
                        if(!this.targetList!!.contains(advancedRTSGameLayer))
                        
                                    {
                                    this.associatedAdvancedRTSGameLayer!!.waypointLogHelper!!.addWaypointFromBuilding(this.associatedAdvancedRTSGameLayer, advancedRTSGameLayer)

    
                        if(advancedRTSGameLayer!!.isDestroyed())
                        
                                    {
                                    


                            throw Exception("Trying to add a dead: " +advancedRTSGameLayer)

                                    }
                                
this.targetList!!.add(advancedRTSGameLayer)
this.associatedAdvancedRTSGameLayer!!.waypointLogHelper!!.addWaypointFromBuilding(this.associatedAdvancedRTSGameLayer, advancedRTSGameLayer, this.targetList)

                                    }
                                

                                    }
                                
}


open fun isWaypointListEmptyOrOnlyTargets()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            
open fun insertWaypoint(index: Int, rtsLayer: CollidableDestroyableDamageableLayer)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
    //var index = index
    //var rtsLayer = rtsLayer

    
                        if(this.canInsertWaypoint(index, rtsLayer))
                        
                                    {
                                    this.associatedAdvancedRTSGameLayer!!.waypointLogHelper!!.insertWaypoint(this.associatedAdvancedRTSGameLayer, index, rtsLayer, this.getName())

    
                        if(rtsLayer!!.isDestroyed())
                        
                                    {
                                    


                            throw Exception("Trying to add a dead: " +rtsLayer)

                                    }
                                
this.targetList!!.add(index, rtsLayer)
this.associatedAdvancedRTSGameLayer!!.waypointLogHelper!!.insertWaypoint(this.associatedAdvancedRTSGameLayer, index, rtsLayer, this.getName(), this.targetList)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun move()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    
                        if(this.isMoving())
                        
                                    {
                                    this.setMovingFromStopped(false)

                                    }
                                
                        else {
                            this.setMovingFromStopped(true)

                        }
                            
this.setMoving(false)
}


                @Throws(Exception::class)
            
open fun setRandomGeographicMapCellHistory(pathsList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var pathsList = pathsList

    var size: Int = pathsList!!.size()!!

this.associatedAdvancedRTSGameLayer!!.waypointLogHelper!!.setRandomGeographicMapCellHistory(this.associatedAdvancedRTSGameLayer, pathsList)

    
                        if(size > 0)
                        
                                    {
                                    
    var geographicMapCellPositionBasicArrayList: BasicArrayList = BasicArrayListUtil.getInstance()!!.getRandom(pathsList) as BasicArrayList

this.setGeographicMapCellHistoryPath(geographicMapCellPositionBasicArrayList)

                                    }
                                
}


                @Throws(Exception::class)
            
open fun setGeographicMapCellHistoryPath(geographicMapCellPositionBasicArrayList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var geographicMapCellPositionBasicArrayList = geographicMapCellPositionBasicArrayList
this.lastPathGeographicMapCellPosition= 
                                        null
                                    

    
                        if(this.associatedAdvancedRTSGameLayer!!.showMoreCaptionStates)
                        
                                    {
                                    this.associatedAdvancedRTSGameLayer!!.getCaptionAnimationHelper()!!.update(PATHING, BasicColorFactory.getInstance()!!.GREEN)

                                    }
                                
this.currentGeographicMapCellHistory!!.init()
this.associatedAdvancedRTSGameLayer!!.init(this.currentGeographicMapCellHistory, geographicMapCellPositionBasicArrayList)
this.setTrackingWaypoint(true)
this.getCompleteTimeDelayHelper()!!.setStartTime()
}


open fun canInsertWaypoint(index: Int, rtsLayer: CollidableDestroyableDamageableLayer)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
    //var index = index
    //var rtsLayer = rtsLayer

    
                        if(this.targetList!!.size() > 4)
                        
                                    {
                                    
                                    }
                                
                             else 
    
                        if(this.targetList!!.contains(rtsLayer))
                        
                                    {
                                    
                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            
open fun addBuildingChase(allbinaryLayer: AllBinaryLayer, cellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var allbinaryLayer = allbinaryLayer
    //var cellPosition = cellPosition
}


                @Throws(Exception::class)
            
open fun moveAwayFromBuilding(buildingLayer: BuildingLayer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var buildingLayer = buildingLayer

    var geographicMapCellPosition: GeographicMapCellPosition = this.associatedAdvancedRTSGameLayer!!.getCurrentGeographicMapCellPosition()!!


    var list: BasicArrayList = buildingLayer!!.geographicMapCellPositionArea!!.getOccupyingGeographicMapCellPositionList()!!


    
                        if(list.contains(geographicMapCellPosition))
                        
                                    {
                                    
    
                        if(this.insertWaypoint(0, this.FAKE_WAYPOINT_LAYER))
                        
                                    {
                                    this.associatedAdvancedRTSGameLayer!!.waypointLogHelper!!.moveAwayFromBuilding(this.associatedAdvancedRTSGameLayer)
this.setCurrentTargetLayerInterface(this.FAKE_WAYPOINT_LAYER as CollidableDestroyableDamageableLayer)

    var pathsList: BasicArrayList = buildingLayer!!.getMoveOutOfBuildAreaPath(geographicMapCellPosition)!!

this.associatedAdvancedRTSGameLayer!!.setClosestGeographicMapCellHistory(pathsList)

                                    }
                                

                                    }
                                
}


    private val repeatedToLong: TimeDelayHelper = TimeDelayHelper(22000)

open fun needToMove()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {
this.associatedAdvancedRTSGameLayer!!.waypointLogHelper!!.needToMove(this.associatedAdvancedRTSGameLayer, this)

    
                        if(this.isTrackingWaypoint() || this.sensorAction == SensorActionFactory.getInstance()!!.EVADE || (this.currentTargetLayerInterface != 
                                    null
                                 && this.getCurrentTargetDistance() >= this.longWeaponRange +this.currentTargetLayerInterface!!.getHalfHeight()))
                        
                                    {
                                    repeatedToLong!!.setStartTime()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                

    
                        if(repeatedToLong!!.isTime())
                        
                                    {
                                    
    var message: String = "Repeating too long: " +this.getMovementLogicAsString()

ForcedLogUtil.log(message, this.associatedAdvancedRTSGameLayer)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun getMovementLogicAsString()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("isTrackingWaypoint: ")
stringBuffer!!.append(this.isTrackingWaypoint())
stringBuffer!!.append(" sensorAction: ")
stringBuffer!!.append(this.sensorAction!!.name)
stringBuffer!!.append(" getCurrentTargetLayerInterface: ")
stringBuffer!!.append(StringUtil.getInstance()!!.toString(this.currentTargetLayerInterface))

    
                        if(this.currentTargetLayerInterface != 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.append(" Target Range: ")
stringBuffer!!.append(this.getCurrentTargetDistance())
stringBuffer!!.append(" >= ")
stringBuffer!!.append(this.longWeaponRange +this.currentTargetLayerInterface!!.getHalfHeight())

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun isMovingFromStopped()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.movingFromStopped
}


open fun setMovingFromStopped(movingFromStopped: Boolean)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var movingFromStopped = movingFromStopped
this.movingFromStopped= movingFromStopped
}


open fun setWaypointPathsList(waypointPathsList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var waypointPathsList = waypointPathsList
this.waypointPathsList= waypointPathsList
}


open fun getWaypointPathsList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return waypointPathsList
}


open fun isMoving()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return moving
}


open fun setMoving(moving: Boolean)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var moving = moving
this.moving= moving
}


open fun isTrackingWaypoint()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return trackingWaypoint
}


open fun getPossibleTargetList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return possibleTargetList
}


open fun setLastPathGeographicMapCellPosition(lastPathGeographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var lastPathGeographicMapCellPosition = lastPathGeographicMapCellPosition
this.lastPathGeographicMapCellPosition= lastPathGeographicMapCellPosition
}


open fun getLastPathGeographicMapCellPosition()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellPosition

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return lastPathGeographicMapCellPosition
}


open fun setCurrentPathGeographicMapCellPosition(currentPathGeographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var currentPathGeographicMapCellPosition = currentPathGeographicMapCellPosition
this.currentPathGeographicMapCellPosition= currentPathGeographicMapCellPosition
}


open fun getCurrentPathGeographicMapCellPosition()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellPosition

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return currentPathGeographicMapCellPosition
}


open fun setSensorAction(sensorAction: SensorAction)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var sensorAction = sensorAction
this.sensorAction= sensorAction
}


open fun getSensorAction()
        //nullable = true from not(false or (false and true)) = true
: SensorAction

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return sensorAction
}


open fun getTargetList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return targetList
}


open fun setCurrentTargetLayerInterface(currentTargetLayerInterface: CollidableDestroyableDamageableLayer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var currentTargetLayerInterface = currentTargetLayerInterface
this.currentTargetLayerInterface= currentTargetLayerInterface
}


open fun getCurrentTargetLayerInterface()
        //nullable = true from not(false or (false and true)) = true
: CollidableDestroyableDamageableLayer

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return currentTargetLayerInterface
}


open fun setCurrentTargetDistance(currentTargetDistance: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var currentTargetDistance = currentTargetDistance
this.currentTargetDistance= currentTargetDistance
}


open fun getCurrentTargetDistance()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return currentTargetDistance
}


open fun getCompleteTimeDelayHelper()
        //nullable = true from not(false or (false and true)) = true
: TimeDelayHelper

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return completeTimeDelayHelper
}


open fun setCurrentGeographicMapCellHistory(currentGeographicMapCellHistory: GeographicMapCellHistory)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var currentGeographicMapCellHistory = currentGeographicMapCellHistory
this.currentGeographicMapCellHistory= currentGeographicMapCellHistory
}


open fun getCurrentGeographicMapCellHistory()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellHistory

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return currentGeographicMapCellHistory
}


open fun setTrackingWaypoint(trackingWaypoint: Boolean)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var trackingWaypoint = trackingWaypoint
this.trackingWaypoint= trackingWaypoint
}


}
                
            

