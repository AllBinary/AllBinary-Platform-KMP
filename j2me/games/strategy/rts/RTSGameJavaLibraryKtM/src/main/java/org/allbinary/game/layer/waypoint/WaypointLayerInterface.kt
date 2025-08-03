
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
        
import org.allbinary.animation.caption.CaptionAnimationHelperBase
import org.allbinary.game.layer.WaypointBehaviorBase
import org.allbinary.game.tracking.TrackingEvent
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.media.graphics.geography.map.GeographicMapCellHistory
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.util.BasicArrayList
interface WaypointLayerInterface {
        

                @Throws(Exception::class)
            
open fun init(geographicMapCellHistory: GeographicMapCellHistory, geographicMapCellPositionBasicArrayList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true


open fun getMoveOutOfBuildAreaPath(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList

                @Throws(Exception::class)
            
open fun setClosestGeographicMapCellHistory(pathsList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true


open fun teleportTo(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
open fun setLoad(resource: Short)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
open fun getSurroundingGeographicMapCellPositionList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList

open fun isSelected()
        //nullable = true from not(false or (false and true)) = true
: Boolean

open fun shouldAddWaypointFromBuilding()
        //nullable = true from not(false or (false and true)) = true
: Boolean

open fun isShowMoreCaptionStates()
        //nullable = true from not(false or (false and true)) = true
: Boolean

                @Throws(Exception::class)
            
open fun trackTo(reason: String)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
open fun trackTo(dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
open fun buildingChase(allbinaryLayer: AllBinaryLayer, cellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: Boolean

open fun getTrackingEvent()
        //nullable = true from not(false or (false and true)) = true
: TrackingEvent

open fun allStop()
        //nullable = true from not(false or (false and true)) = true


open fun isWaypointListEmptyOrOnlyTargets()
        //nullable = true from not(false or (false and true)) = true
: Boolean

                @Throws(Exception::class)
            
open fun getCurrentGeographicMapCellPosition()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellPosition

                @Throws(Exception::class)
            
open fun getTopLeftGeographicMapCellPosition()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellPosition

open fun getCaptionAnimationHelper()
        //nullable = true from not(false or (false and true)) = true
: CaptionAnimationHelperBase

open fun getWaypointBehavior()
        //nullable = true from not(false or (false and true)) = true
: WaypointBehaviorBase

open fun getWaypointLogHelper()
        //nullable = true from not(false or (false and true)) = true
: WaypointLogHelper

open fun getWaypoint2LogHelper()
        //nullable = true from not(false or (false and true)) = true
: Waypoint2LogHelper

open fun getWaypointRunnableLogHelper()
        //nullable = true from not(false or (false and true)) = true
: WaypointRunnableLogHelper

}
                
            

