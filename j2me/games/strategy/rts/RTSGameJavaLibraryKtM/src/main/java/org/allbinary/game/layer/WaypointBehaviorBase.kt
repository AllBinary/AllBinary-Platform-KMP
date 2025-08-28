
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




        import java.lang.Object        
        
        
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
        

        Updates for KMP build        
        {
this.ownedWaypointList= BasicArrayList(1)
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this::class.toString()!!
}


open fun isRunning()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            
open fun processTick(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var allBinaryLayerManager = allBinaryLayerManager
}


open fun getOwnedWaypointList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ownedWaypointList
}


open fun getWaypoint()
        //nullable = true from not(false or (false and true)) = true
: WaypointBase

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return waypoint
}


open fun setWaypoint(waypoint: WaypointBase)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var waypoint = waypoint
this.waypoint= waypoint
}


open fun getSteeringVisitorList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return steeringVisitorList
}


open fun getMovementLogicAsString()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                            throw RuntimeException()
}


open fun isWaypointListEmptyOrOnlyTargets()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                            throw RuntimeException()
}


open fun isInSensorRange(layerInterface: CollidableDestroyableDamageableLayer, targetDistance: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
    //var layerInterface = layerInterface
    //var targetDistance = targetDistance



                            throw RuntimeException()
}


open fun getCurrentTargetLayerInterface()
        //nullable = true from not(false or (false and true)) = true
: CollidableDestroyableDamageableLayer

        Updates for KMP build        
        {



                            throw RuntimeException()
}


open fun getCurrentTargetingStateString()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                            throw RuntimeException()
}


open fun isTrackingWaypoint()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                            throw RuntimeException()
}


open fun getCurrentPathGeographicMapCellPosition()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellPosition

        Updates for KMP build        
        {



                            throw RuntimeException()
}


open fun getCurrentGeographicMapCellHistory()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellHistory

        Updates for KMP build        
        {



                            throw RuntimeException()
}


open fun isWaypointOverridesAttacking()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return waypointOverridesAttacking
}


open fun getNextUnvisitedPathGeographicMapCellPosition()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellPosition

        Updates for KMP build        
        {



                            throw RuntimeException()
}


open fun needToMove()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                            throw RuntimeException()
}


open fun setWaypointPathsList(waypointPathsList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var waypointPathsList = waypointPathsList



                            throw RuntimeException()
}


open fun getWaypointPathsList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList

        Updates for KMP build        
        {



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
open fun setTarget(layerInterface: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var layerInterface = layerInterface



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
open fun setTarget(layerInterface: PathFindingLayerInterface, anotherTargetDistance: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var layerInterface = layerInterface
    //var anotherTargetDistance = anotherTargetDistance



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
open fun clearTarget()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
open fun updatePathOnTargetMove(reason: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var reason = reason
}


    private val steeringVisitorList: BasicArrayList = BasicArrayList()

}
                
            

