
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.PathFindingLayerInterface
import org.allbinary.game.layer.WaypointBehaviorBase
import org.allbinary.game.layer.special.CollidableDestroyableDamageableLayer
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.util.BasicArrayList

open public class WaypointLogHelper
            : Object
         {
        

        companion object {
            
    private val instance: WaypointLogHelper = WaypointLogHelper()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: WaypointLogHelper{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun onWaypointEvent(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, advancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
    //var advancedRTSGameLayer = advancedRTSGameLayer
}


open fun addWaypointFromBuilding(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, advancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
    //var advancedRTSGameLayer = advancedRTSGameLayer
}


open fun addWaypointFromBuilding(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, advancedRTSGameLayer: PathFindingLayerInterface, list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
    //var advancedRTSGameLayer = advancedRTSGameLayer
    //var list = list
}


open fun insertWaypoint(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, index: Int, rtsLayer: CollidableDestroyableDamageableLayer, waypointName: String)
        //nullable = true from not(false or (false and false)) = true
{
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
    //var index = index
    //var rtsLayer = rtsLayer
    //var waypointName = waypointName
}


open fun insertWaypoint(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, index: Int, rtsLayer: CollidableDestroyableDamageableLayer, waypointName: String, list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
    //var index = index
    //var rtsLayer = rtsLayer
    //var waypointName = waypointName
    //var list = list
}


open fun setRandomGeographicMapCellHistory(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, pathsList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
    //var pathsList = pathsList
}


open fun moveAwayFromBuilding(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
}


open fun needToMove(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, unitWaypointBehavior: WaypointBehaviorBase)
        //nullable = true from not(false or (false and false)) = true
{
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
    //var unitWaypointBehavior = unitWaypointBehavior
}


open fun setRandomGeographicMapCellHistory(associatedAdvancedRTSGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
}


open fun setCurrentPathGeographicMapCellPosition(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, existingCurrentPathGeographicMapCellPosition: GeographicMapCellPosition, currentPathGeographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
{
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
    //var existingCurrentPathGeographicMapCellPosition = existingCurrentPathGeographicMapCellPosition
    //var currentPathGeographicMapCellPosition = currentPathGeographicMapCellPosition
}


open fun setNextUnvisitedPathGeographicMapCellPosition(associatedAdvancedRTSGameLayer: PathFindingLayerInterface, existingNextUnvisitedPathGeographicMapCellPosition: GeographicMapCellPosition, nextUnvisitedPathGeographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
{
    //var associatedAdvancedRTSGameLayer = associatedAdvancedRTSGameLayer
    //var existingNextUnvisitedPathGeographicMapCellPosition = existingNextUnvisitedPathGeographicMapCellPosition
    //var nextUnvisitedPathGeographicMapCellPosition = nextUnvisitedPathGeographicMapCellPosition
}


}
                
            

