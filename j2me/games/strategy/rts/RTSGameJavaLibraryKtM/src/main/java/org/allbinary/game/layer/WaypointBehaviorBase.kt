
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
        package org.allbinary.game.layer



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.special.CollidableDestroyableDamageableLayer
import org.allbinary.game.layer.waypoint.WaypointBase
import org.allbinary.util.BasicArrayList
import org.allbinary.game.tick.TickableInterface
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.media.graphics.geography.map.GeographicMapCellHistory
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition

open public class WaypointBehaviorBase
            : Object
        
                , TickableInterface {
        

    private val ownedWaypointList: BasicArrayList

    var waypointOverridesAttacking: Boolean = true

    private var waypoint: WaypointBase
public constructor        ()
            : super()
        {this.ownedWaypointList= BasicArrayList(1)
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this::class.qualifiedName!!
}


open fun isRunning()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            
open fun processTick(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryLayerManager = allBinaryLayerManager
}


open fun getOwnedWaypointList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ownedWaypointList
}


open fun getWaypoint()
        //nullable = true from not(false or (false and true)) = true
: WaypointBase{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return waypoint
}


open fun setWaypoint(waypoint: WaypointBase)
        //nullable = true from not(false or (false and false)) = true
{

                    var waypoint = waypoint
this.waypoint= waypoint
}


open fun getSteeringVisitorList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return steeringVisitorList
}


open fun getMovementLogicAsString()
        //nullable = true from not(false or (false and true)) = true
: String{


                            throw RuntimeException()
}


open fun isWaypointListEmptyOrOnlyTargets()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                            throw RuntimeException()
}


open fun isInSensorRange(layerInterface: CollidableDestroyableDamageableLayer, targetDistance: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var layerInterface = layerInterface


                    var targetDistance = targetDistance



                            throw RuntimeException()
}


open fun getCurrentTargetLayerInterface()
        //nullable = true from not(false or (false and true)) = true
: CollidableDestroyableDamageableLayer{


                            throw RuntimeException()
}


open fun getCurrentTargetingStateString()
        //nullable = true from not(false or (false and true)) = true
: String{


                            throw RuntimeException()
}


open fun isTrackingWaypoint()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                            throw RuntimeException()
}


open fun getCurrentPathGeographicMapCellPosition()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellPosition{


                            throw RuntimeException()
}


open fun getCurrentGeographicMapCellHistory()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellHistory{


                            throw RuntimeException()
}


open fun isWaypointOverridesAttacking()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return waypointOverridesAttacking
}


open fun getNextUnvisitedPathGeographicMapCellPosition()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellPosition{


                            throw RuntimeException()
}


open fun needToMove()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                            throw RuntimeException()
}


open fun setWaypointPathsList(waypointPathsList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var waypointPathsList = waypointPathsList



                            throw RuntimeException()
}


open fun getWaypointPathsList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                            throw RuntimeException()
}


                @Throws(Exception::class)
            
open fun setTarget(layerInterface: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var layerInterface = layerInterface



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
open fun setTarget(layerInterface: PathFindingLayerInterface, anotherTargetDistance: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var layerInterface = layerInterface


                    var anotherTargetDistance = anotherTargetDistance



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
open fun clearTarget()
        //nullable = true from not(false or (false and true)) = true
{


                            throw RuntimeException()
}


                @Throws(Exception::class)
            
open fun updatePathOnTargetMove(reason: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var reason = reason
}


    private val steeringVisitorList: BasicArrayList = BasicArrayList()

}
                
            

