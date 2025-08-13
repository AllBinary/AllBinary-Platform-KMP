
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
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.util.BasicArrayList

open public class Waypoint2LogHelper
            : Object
         {
        

        companion object {
            
    private val instance: Waypoint2LogHelper = Waypoint2LogHelper()

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
        
open fun initRange(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, closeRange: Int, sensorRange: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var closeRange = closeRange


                    var sensorRange = sensorRange
}


open fun processPossibleTarget(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, unitWaypointBehavior2: WaypointBehaviorBase, layerInterface: PathFindingLayerInterface, anotherTargetDistance: Int, isShorterThanCurrentTargetDistance: Boolean, isCurrentTargetDestroyed: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var unitWaypointBehavior2 = unitWaypointBehavior2


                    var layerInterface = layerInterface


                    var anotherTargetDistance = anotherTargetDistance


                    var isShorterThanCurrentTargetDistance = isShorterThanCurrentTargetDistance


                    var isCurrentTargetDestroyed = isCurrentTargetDestroyed
}


open fun processPossibleTarget(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, unitWaypointBehavior2: WaypointBehaviorBase, layerInterface: PathFindingLayerInterface, anotherTargetDistance: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var unitWaypointBehavior2 = unitWaypointBehavior2


                    var layerInterface = layerInterface


                    var anotherTargetDistance = anotherTargetDistance
}


open fun processPossibleTargetCloser(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, unitWaypointBehavior2: WaypointBehaviorBase, layerInterface: PathFindingLayerInterface, anotherTargetDistance: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var unitWaypointBehavior2 = unitWaypointBehavior2


                    var layerInterface = layerInterface


                    var anotherTargetDistance = anotherTargetDistance
}


open fun setTarget(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, unitWaypointBehavior2: WaypointBehaviorBase, layerInterface: PathFindingLayerInterface, anotherTargetDistance: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var unitWaypointBehavior2 = unitWaypointBehavior2


                    var layerInterface = layerInterface


                    var anotherTargetDistance = anotherTargetDistance
}


open fun setTargetPath(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
}


open fun setTargetPath(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, unitWaypointBehavior2: WaypointBehaviorBase)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var unitWaypointBehavior2 = unitWaypointBehavior2
}


open fun processWaypoint(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, unitWaypointBehavior2: WaypointBehaviorBase, targetLayer: PathFindingLayerInterface, size: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var unitWaypointBehavior2 = unitWaypointBehavior2


                    var targetLayer = targetLayer


                    var size = size
}


open fun processWaypointTracked(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, unitWaypointBehavior2: WaypointBehaviorBase)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var unitWaypointBehavior2 = unitWaypointBehavior2
}


open fun processWaypointTracked(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var geographicMapCellPosition = geographicMapCellPosition
}


open fun processWaypointTrackedWithoutProgress(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, reason: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var reason = reason
}


open fun wander(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
}


open fun targetDestroyed(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
}


open fun processTargeting(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var dx = dx


                    var dy = dy
}


open fun processTargetingNonWayPoint(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var dx = dx


                    var dy = dy
}


open fun removeWaypoint(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, unitWaypointBehavior2: WaypointBehaviorBase, waypointLayer: PathFindingLayerInterface, reason: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var unitWaypointBehavior2 = unitWaypointBehavior2


                    var waypointLayer = waypointLayer


                    var reason = reason
}


open fun removeWaypoint(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, unitWaypointBehavior2: WaypointBehaviorBase, list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var unitWaypointBehavior2 = unitWaypointBehavior2


                    var list = list
}


open fun removeWaypointClear(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
}


open fun clearTarget(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
}


open fun addWaypointFromUser(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, advancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer


                    var advancedRTSGameLayer = advancedRTSGameLayer
}


open fun targetMovedSoRetarget(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
}


}
                
            

