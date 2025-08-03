
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        package org.allbinary.game.layer.waypoint



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.PathFindingLayerInterface
import org.allbinary.game.layer.WaypointBehaviorBase
import org.allbinary.game.layer.special.CollidableDestroyableDamageableLayer
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonSeps
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.math.PositionStrings
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.util.BasicArrayList

open public class Waypoint2SelectedLogHelper : Waypoint2LogHelper {
        

        companion object {


    private val instance: Waypoint2SelectedLogHelper = Waypoint2SelectedLogHelper()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: Waypoint2LogHelper{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonSeps: CommonSeps = CommonSeps.getInstance()!!
            

    private val positionStrings: PositionStrings = PositionStrings.getInstance()!!
            

    private val stringUtil: StringUtil = StringUtil.getInstance()!!
            

    private val ENEMY_POSSIBLE_TARGET: String = " Enemy Possible Target: "

    private val CLOSE_RANGE: String = "closeRange: "

    private val SENSOR_RANGE: String = " sensorRange: "

    private val ONLY_TARGETS: String = " Only Targets: "

    private val SHORTER_THAN_CURRENT_TARGET_DISTANCE: String = " isShorterThanCurrentTargetDistance: "

    private val CURRENT_TARGET_DESTROYED: String = " isCurrentTargetDestroyed: "

    private val CURRENT_TARGET_NOT_AVAILABLE: String = " isCurrentTargetNotAvailable: "

    private val PROCESS_POSSIBLE_TARGET: String = "selected: processPossibleTarget1"

open fun initRange(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, closeRange: Int, sensorRange: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var closeRange = closeRange


                    var sensorRange = sensorRange

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(associatedAdvancedRTSGameLayer!!.getName())
stringBuffer!!.append(CLOSE_RANGE)
stringBuffer!!.append(closeRange)
stringBuffer!!.append(SENSOR_RANGE)
stringBuffer!!.append(sensorRange)
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "selected: initRange")
}


open fun processPossibleTarget(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, waypointBehaviorBase: WaypointBehaviorBase, layerInterface: PathFindingLayerInterface, anotherTargetDistance: Int, isShorterThanCurrentTargetDistance: Boolean, isCurrentTargetDestroyed: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var waypointBehaviorBase = waypointBehaviorBase


                    var layerInterface = layerInterface


                    var anotherTargetDistance = anotherTargetDistance


                    var isShorterThanCurrentTargetDistance = isShorterThanCurrentTargetDistance


                    var isCurrentTargetDestroyed = isCurrentTargetDestroyed

    
                        if(waypointBehaviorBase!!.isWaypointListEmptyOrOnlyTargets() && waypointBehaviorBase!!.isInSensorRange(layerInterface as CollidableDestroyableDamageableLayer, anotherTargetDistance))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(associatedAdvancedRTSGameLayer!!.getName())
stringBuffer!!.append(ONLY_TARGETS)
stringBuffer!!.append(waypointBehaviorBase!!.isWaypointListEmptyOrOnlyTargets())
stringBuffer!!.append(SHORTER_THAN_CURRENT_TARGET_DISTANCE)
stringBuffer!!.append(isShorterThanCurrentTargetDistance)
stringBuffer!!.append(CURRENT_TARGET_DESTROYED)
stringBuffer!!.append(isCurrentTargetDestroyed)
stringBuffer!!.append(CURRENT_TARGET_NOT_AVAILABLE)
stringBuffer!!.append((waypointBehaviorBase!!.getCurrentTargetLayerInterface() == 
                                    null
                                ))
logUtil!!.put(stringBuffer!!.toString(), this, PROCESS_POSSIBLE_TARGET)

                                    }
                                
}


open fun processPossibleTarget(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, waypointBehaviorBase: WaypointBehaviorBase, layerInterface: PathFindingLayerInterface, anotherTargetDistance: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var waypointBehaviorBase = waypointBehaviorBase


                    var layerInterface = layerInterface


                    var anotherTargetDistance = anotherTargetDistance

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(associatedAdvancedRTSGameLayer!!.getName())
stringBuffer!!.append(this.commonSeps!!.SPACE)
stringBuffer!!.append(waypointBehaviorBase!!.getCurrentTargetingStateString())
stringBuffer!!.append(ENEMY_POSSIBLE_TARGET)
stringBuffer!!.append(layerInterface!!.getName())
stringBuffer!!.append(
                            " anotherTargetDistance: ")
stringBuffer!!.append(anotherTargetDistance)
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "selected: processPossibleTarget2")
}


open fun processPossibleTargetCloser(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, waypointBehaviorBase: WaypointBehaviorBase, layerInterface: PathFindingLayerInterface, anotherTargetDistance: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var waypointBehaviorBase = waypointBehaviorBase


                    var layerInterface = layerInterface


                    var anotherTargetDistance = anotherTargetDistance

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(associatedAdvancedRTSGameLayer!!.getName())
stringBuffer!!.append(this.commonSeps!!.SPACE)
stringBuffer!!.append(waypointBehaviorBase!!.getCurrentTargetingStateString())
stringBuffer!!.append(ENEMY_POSSIBLE_TARGET)
stringBuffer!!.append(layerInterface!!.getName())
stringBuffer!!.append(
                            " anotherTargetDistance: ")
stringBuffer!!.append(anotherTargetDistance)
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "selected: processPossibleTarget3")
}


open fun setTarget(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, waypointBehaviorBase: WaypointBehaviorBase, layerInterface: PathFindingLayerInterface, anotherTargetDistance: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var waypointBehaviorBase = waypointBehaviorBase


                    var layerInterface = layerInterface


                    var anotherTargetDistance = anotherTargetDistance

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(associatedAdvancedRTSGameLayer!!.getName())
stringBuffer!!.append(this.commonSeps!!.SPACE)
stringBuffer!!.append(waypointBehaviorBase!!.getName())
stringBuffer!!.append(
                            " targeting: ")
stringBuffer!!.append(layerInterface!!.getName())
stringBuffer!!.append(
                            " at: ")
stringBuffer!!.append(anotherTargetDistance)
stringBuffer!!.append(
                            " instead of: ")
stringBuffer!!.append(waypointBehaviorBase!!.getCurrentTargetingStateString())
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "selected: setTarget")
}


open fun setTargetPath(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
logUtil!!.put(
                            "Target Destroyed", this, 
                            "selected: setTargetPath")
}


open fun setTargetPath(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, waypointBehaviorBase: WaypointBehaviorBase)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var waypointBehaviorBase = waypointBehaviorBase

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(associatedAdvancedRTSGameLayer!!.getName())
stringBuffer!!.append(
                            " Set Path To Target: ")
stringBuffer!!.append(waypointBehaviorBase!!.getCurrentTargetLayerInterface()!!.getName())
stringBuffer!!.append(commonSeps!!.SPACE)
stringBuffer!!.append(stringUtil!!.toString(waypointBehaviorBase!!.getCurrentTargetLayerInterface()))
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "selected: setTargetPath")
}


open fun processWaypoint(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, waypointBehaviorBase: WaypointBehaviorBase, targetLayer: PathFindingLayerInterface, size: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var waypointBehaviorBase = waypointBehaviorBase


                    var targetLayer = targetLayer


                    var size = size

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(associatedAdvancedRTSGameLayer!!.getName())
stringBuffer!!.append(
                            " Size: ")
stringBuffer!!.append(size)
stringBuffer!!.append(
                            " Waypoint: ")
stringBuffer!!.append(targetLayer!!.getName())
stringBuffer!!.append(
                            " Target: ")
stringBuffer!!.append(stringUtil!!.toString(waypointBehaviorBase!!.getCurrentTargetLayerInterface()))
stringBuffer!!.append(
                            " isTrackingWaypoint: ")
stringBuffer!!.append(waypointBehaviorBase!!.isTrackingWaypoint())
stringBuffer!!.append(
                            " WaypointOverridesAttacking: ")
stringBuffer!!.append(waypointBehaviorBase!!.isWaypointOverridesAttacking())
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "selected: processWaypoint")
}


open fun processWaypointTracked(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, waypointBehaviorBase: WaypointBehaviorBase)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var waypointBehaviorBase = waypointBehaviorBase

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(associatedAdvancedRTSGameLayer!!.getName())
stringBuffer!!.append(
                            " currentPathGeographicMapCellPosition: ")
stringBuffer!!.append(stringUtil!!.toString(waypointBehaviorBase!!.getCurrentPathGeographicMapCellPosition()))
stringBuffer!!.append(
                            " nextUnvisitedPathGeographicMapCellPosition: ")
stringBuffer!!.append(stringUtil!!.toString(waypointBehaviorBase!!.getNextUnvisitedPathGeographicMapCellPosition()))
stringBuffer!!.append(
                            " Tracked: ")
stringBuffer!!.append(stringUtil!!.toString(waypointBehaviorBase!!.getCurrentGeographicMapCellHistory()!!.getTracked()))
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "selected: processWaypoint")
}


open fun processWaypointTracked(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var geographicMapCellPosition = geographicMapCellPosition

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(associatedAdvancedRTSGameLayer!!.getName())
stringBuffer!!.append(
                            " Visited: ")
stringBuffer!!.append(stringUtil!!.toString(geographicMapCellPosition))
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "selected: processWaypoint")
}


open fun processWaypointTrackedWithoutProgress(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, reason: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var reason = reason
logUtil!!.put(StringMaker().
                            append(associatedAdvancedRTSGameLayer!!.getName())!!.append(reason)!!.toString(), this, 
                            "turnTo")
}


open fun wander(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
logUtil!!.put(associatedAdvancedRTSGameLayer!!.getName(), this, 
                            "wander")
}


open fun targetDestroyed(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
logUtil!!.put(StringMaker().
                            append(associatedAdvancedRTSGameLayer!!.getName())!!.append(
                            " Target Destroyed")!!.toString(), this, 
                            "selected: processTargeting")
}


open fun processTargeting(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var dx = dx


                    var dy = dy

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(associatedAdvancedRTSGameLayer!!.getName())
stringBuffer!!.append(this.commonSeps!!.SPACE)
stringBuffer!!.append(positionStrings!!.DX_LABEL)
stringBuffer!!.append(dx)
stringBuffer!!.append(commonSeps!!.SPACE)
stringBuffer!!.append(positionStrings!!.DY_LABEL)
stringBuffer!!.append(dy)
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "selected: processTargeting")
}


open fun processTargetingNonWayPoint(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var dx = dx


                    var dy = dy

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(associatedAdvancedRTSGameLayer!!.getName())
stringBuffer!!.append(
                            " Targeting Non Waypoint ")
stringBuffer!!.append(positionStrings!!.DX_LABEL)
stringBuffer!!.append(dx)
stringBuffer!!.append(commonSeps!!.SPACE)
stringBuffer!!.append(positionStrings!!.DY_LABEL)
stringBuffer!!.append(dy)
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "selected: processTargeting")
}


open fun removeWaypoint(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, unitWaypointBehavior2: WaypointBehaviorBase, waypointLayer: PathFindingLayerInterface, reason: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var unitWaypointBehavior2 = unitWaypointBehavior2


                    var waypointLayer = waypointLayer


                    var reason = reason

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(associatedAdvancedRTSGameLayer!!.getName())
stringBuffer!!.append(this.commonSeps!!.SPACE)
stringBuffer!!.append(unitWaypointBehavior2!!.getName())
stringBuffer!!.append(
                            " remove: ")
stringBuffer!!.append(waypointLayer!!.getName())
stringBuffer!!.append(
                            " because: ")
stringBuffer!!.append(reason)
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "selected: removeWaypoint")
}


open fun removeWaypoint(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, unitWaypointBehavior2: WaypointBehaviorBase, list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var unitWaypointBehavior2 = unitWaypointBehavior2


                    var list = list

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(associatedAdvancedRTSGameLayer!!.getName())
stringBuffer!!.append(this.commonSeps!!.SPACE)
stringBuffer!!.append(unitWaypointBehavior2!!.getName())
stringBuffer!!.append(
                            " Waypoints: ")
stringBuffer!!.append(stringUtil!!.toString(list))
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "selected: removeWaypoint")
}


open fun removeWaypointClear(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
logUtil!!.put(StringMaker().
                            append(associatedAdvancedRTSGameLayer!!.getName())!!.append(
                            " Clearing removed waypoint")!!.toString(), this, 
                            "selected: removeWaypoint")
}


open fun clearTarget(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
logUtil!!.put(StringMaker().
                            append(associatedAdvancedRTSGameLayer!!.getName())!!.append(
                            " Cleared Target")!!.toString(), this, 
                            "selected: clearTarget")
}


open fun addWaypointFromUser(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, advancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var advancedRTSGameLayer = advancedRTSGameLayer

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(associatedAdvancedRTSGameLayer!!.getName())
stringBuffer!!.append(
                            " Adding Waypoint to Selected: ")
stringBuffer!!.append(advancedRTSGameLayer!!.getName())

    
                        if(advancedRTSGameLayer!!.getParentLayer() != 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.append(
                            " With Parent: ")
stringBuffer!!.append(advancedRTSGameLayer!!.getParentLayer()!!.getName())

                                    }
                                
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "selected: onWaypointEvent")
}


open fun targetMovedSoRetarget(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
logUtil!!.put(StringMaker().
                            append(associatedAdvancedRTSGameLayer!!.getName())!!.append(
                            " - target moved so retargeting")!!.toString(), this, 
                            "turnTo")
}


}
                
            

