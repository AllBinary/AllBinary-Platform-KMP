
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2025 AllBinary 
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
        
import org.allbinary.animation.caption.CaptionAnimationHelperBase
import org.allbinary.game.identification.Group
import org.allbinary.game.layer.waypoint.Waypoint2LogHelper
import org.allbinary.game.layer.waypoint.WaypointLogHelper
import org.allbinary.game.layer.waypoint.WaypointRunnableLogHelper
import org.allbinary.game.tracking.TrackingEvent
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.media.graphics.geography.map.GeographicMapCellHistory
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.util.BasicArrayList

open public class NullPathFindingLayer
            : Object
        
                , PathFindingLayerInterface {
        
companion object {
            
    val NULL_PATH_FINDING_LAYER: NullPathFindingLayer = NullPathFindingLayer()

        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    override fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
    override fun getEndGeographicMapCellPositionList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                            throw RuntimeException()
}


    override fun shouldHandleStartSameAsEnd()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                            throw RuntimeException()
}


    override fun getGeographicMapCellPositionArea()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellPositionAreaBase{



                            throw RuntimeException()
}


    override fun getHudPaintable()
        //nullable = true from not(false or (false and true)) = true
: SelectionHudPaintable{



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
    override fun handleCost(ownerLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{
var ownerLayer = ownerLayer



                            throw RuntimeException()
}


    override fun getParentLayer()
        //nullable = true from not(false or (false and true)) = true
: PathFindingLayerInterface{



                            throw RuntimeException()
}


    override fun getRTSLayer2LogHelper()
        //nullable = true from not(false or (false and true)) = true
: RTSLayer2LogHelper{



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
    override fun setTarget(targetGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var targetGameLayer = targetGameLayer



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
    override fun init(geographicMapCellHistory: GeographicMapCellHistory, geographicMapCellPositionBasicArrayList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{
    //var geographicMapCellHistory = geographicMapCellHistory
    //var geographicMapCellPositionBasicArrayList = geographicMapCellPositionBasicArrayList



                            throw RuntimeException()
}


    override fun getMoveOutOfBuildAreaPath(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{
    //var geographicMapCellPosition = geographicMapCellPosition



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
    override fun setClosestGeographicMapCellHistory(pathsList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{
    //var pathsList = pathsList



                            throw RuntimeException()
}


    override fun teleportTo(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
{
    //var geographicMapCellPosition = geographicMapCellPosition



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
    override fun setLoad(resource: Short)
        //nullable = true from not(false or (false and false)) = true
{
var resource = resource



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
    override fun getSurroundingGeographicMapCellPositionList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                            throw RuntimeException()
}


    override fun isSelected()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                            throw RuntimeException()
}


    override fun shouldAddWaypointFromBuilding()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                            throw RuntimeException()
}


    override fun isShowMoreCaptionStates()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
    override fun trackTo(reason: String)
        //nullable = true from not(false or (false and false)) = true
{
    //var reason = reason



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
    override fun trackTo(dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var dx = dx
    //var dy = dy



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
    override fun buildingChase(allbinaryLayer: AllBinaryLayer, cellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var allbinaryLayer = allbinaryLayer
    //var cellPosition = cellPosition



                            throw RuntimeException()
}


    override fun getTrackingEvent()
        //nullable = true from not(false or (false and true)) = true
: TrackingEvent{



                            throw RuntimeException()
}


    override fun allStop()
        //nullable = true from not(false or (false and true)) = true
{



                            throw RuntimeException()
}


    override fun isWaypointListEmptyOrOnlyTargets()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
    override fun getCurrentGeographicMapCellPosition()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellPosition{



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
    override fun getTopLeftGeographicMapCellPosition()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellPosition{



                            throw RuntimeException()
}


    override fun getCaptionAnimationHelper()
        //nullable = true from not(false or (false and true)) = true
: CaptionAnimationHelperBase{



                            throw RuntimeException()
}


    override fun getWaypointBehavior()
        //nullable = true from not(false or (false and true)) = true
: WaypointBehaviorBase{



                            throw RuntimeException()
}


    override fun getWaypointLogHelper()
        //nullable = true from not(false or (false and true)) = true
: WaypointLogHelper{



                            throw RuntimeException()
}


    override fun getWaypoint2LogHelper()
        //nullable = true from not(false or (false and true)) = true
: Waypoint2LogHelper{



                            throw RuntimeException()
}


    override fun getWaypointRunnableLogHelper()
        //nullable = true from not(false or (false and true)) = true
: WaypointRunnableLogHelper{



                            throw RuntimeException()
}


    override fun getGroupInterface()
        //nullable = true from not(false or (false and true)) = true
: Array<Group?>{



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
    override fun isDestroyed()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                            throw RuntimeException()
}


    override fun getSourceId()
        //nullable = true from not(false or (false and true)) = true
: Int{



                            throw RuntimeException()
}


}
                
            

