
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
        package org.allbinary.game.layer.waypoint




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.game.layer.PathFindingLayerInterface
import org.allbinary.game.layer.RTSLayerEvent
import org.allbinary.game.layer.building.event.BuildingEventListenerInterface
import org.allbinary.game.layer.special.CollidableDestroyableDamageableLayer
import org.allbinary.game.layer.unit.UnitWaypointBehavior
import org.allbinary.game.media.graphics.geography.map.racetrack.PathFindingInfoFactory
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.media.audio.Sound
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.GeographicMapCellTypeFactory
import org.allbinary.media.graphics.geography.map.GeographicMapCompositeInterface
import org.allbinary.media.graphics.geography.map.racetrack.CustomMapGenerator
import org.allbinary.media.graphics.geography.map.racetrack.RaceTrackGeographicMap
import org.allbinary.media.graphics.geography.pathfinding.BasicGeographicMapExtractedPathsCacheFactory
import org.allbinary.media.graphics.geography.pathfinding.PathFindingInfo
import org.allbinary.media.graphics.geography.pathfinding.PathGenerator
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListUtil

open public class Waypoint : WaypointBase
                , BuildingEventListenerInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val ownerLayer: PathFindingLayerInterface

    private var endList: BasicArrayList

    private var paths: Array<Array<BasicArrayList?>?>
public constructor        (ownerLayer: PathFindingLayerInterface, sound: Sound)                        

                            : super(sound){
    //var ownerLayer = ownerLayer
    //var sound = sound


                            //For kotlin this is before the body of the constructor.
                    
this.ownerLayer= ownerLayer
}


                @Throws(Exception::class)
            
open fun setAllBinaryGameLayerManager(allBinaryGameLayerManager: AllBinaryGameLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
    //var allBinaryGameLayerManager = allBinaryGameLayerManager
super.setAllBinaryGameLayerManager(allBinaryGameLayerManager)

    var geographicMapCompositeInterface: GeographicMapCompositeInterface = allBinaryGameLayerManager as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!


    var tiledLayer: AllBinaryTiledLayer = geographicMapInterface!!.getAllBinaryTiledLayer()!!


    
                        if(paths != 
                                    null
                                )
                        
                                    {
                                    


                            throw RuntimeException()

                                    }
                                
this.endList= this.ownerLayer!!.getEndGeographicMapCellPositionList()
this.paths= Array(tiledLayer!!.getColumns()) { arrayOfNulls<BasicArrayList?>(tiledLayer!!.getRows()) }
                                                            
}


open fun releaseCachedPaths()
        //nullable = true from not(false or (false and true)) = true
{




                        for (columnIndex in paths.size  - 1  downTo 0)

        {




                        for (rowIndex in paths.size  - 1  downTo 0)

        {

    var pathsList: BasicArrayList = this.paths[columnIndex]!![rowIndex]!!


    
                        if(pathsList != 
                                    null
                                )
                        
                                    {
                                    BasicGeographicMapExtractedPathsCacheFactory.getInstance()!!.release(pathsList)

                                    }
                                
}

}

}


                @Throws(Exception::class)
            override fun getPathsListFromCacheOnly(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{
    //var geographicMapCellPosition = geographicMapCellPosition



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.paths[geographicMapCellPosition!!.getColumn()]!![geographicMapCellPosition!!.getRow()]!!
}


                @Throws(Exception::class)
            override fun getPathsList(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{
    //var geographicMapCellPosition = geographicMapCellPosition

    var pathsList: BasicArrayList = this.paths[geographicMapCellPosition!!.getColumn()]!![geographicMapCellPosition!!.getRow()]!!


    
                        if(pathsList == 
                                    null
                                )
                        
                                    {
                                    pathsList= this.createPaths(geographicMapCellPosition)
this.paths[geographicMapCellPosition!!.getColumn()]!![geographicMapCellPosition!!.getRow()]= pathsList

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return pathsList
}


open fun getEndGeographicMapCellPosition(startGeographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: GeographicMapCellPosition{
    //var startGeographicMapCellPosition = startGeographicMapCellPosition

    var endGeographicMapCellPosition: GeographicMapCellPosition = BasicArrayListUtil.getInstance()!!.getRandom(this.endList) as GeographicMapCellPosition


    
                        if(startGeographicMapCellPosition == endGeographicMapCellPosition)
                        
                                    {
                                    



                        for (index in this.endList!!.size() -1 downTo 0)

        {
endGeographicMapCellPosition= this.endList!!.get(index) as GeographicMapCellPosition

    
                        if(startGeographicMapCellPosition != endGeographicMapCellPosition)
                        
                                    {
                                    break;

                    

                                    }
                                
}


                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return endGeographicMapCellPosition
}


                @Throws(Exception::class)
            
open fun createPaths(startGeographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{
    //var startGeographicMapCellPosition = startGeographicMapCellPosition

    
                        if(this.endList!!.size() == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BasicArrayListUtil.getInstance()!!.getImmutableInstance()

                                    }
                                

    var endGeographicMapCellPosition: GeographicMapCellPosition = this.getEndGeographicMapCellPosition(startGeographicMapCellPosition)!!


    
                        if(endGeographicMapCellPosition == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BasicArrayListUtil.getInstance()!!.getImmutableInstance()

                                    }
                                

    
                        if(startGeographicMapCellPosition == endGeographicMapCellPosition)
                        
                                    {
                                    
    
                        if(this.ownerLayer!!.shouldHandleStartSameAsEnd())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BasicArrayListUtil.getInstance()!!.getImmutableInstance()

                                    }
                                
                        else {
                            


                            throw Exception("Start should not be End: " +this.endList!!.size())

                        }
                            

                                    }
                                

    var geographicMapCompositeInterface: GeographicMapCompositeInterface = this.allBinaryGameLayerManager as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!


    var raceTrackGeographicMap: RaceTrackGeographicMap = geographicMapInterface as RaceTrackGeographicMap


    var raceTrackGeographicMapCellTypeFactory: GeographicMapCellTypeFactory = raceTrackGeographicMap!!.getGeographicMapCellTypeFactory()!!


    var customMapGenerator: CustomMapGenerator = raceTrackGeographicMap!!.getCustomMapGenerator() as CustomMapGenerator

customMapGenerator!!.copyMapIntoCustomMap()

    var customMapArray: Array<IntArray?> = customMapGenerator!!.getCustomMapArray()!!

customMapArray[startGeographicMapCellPosition!!.getRow()]!![startGeographicMapCellPosition!!.getColumn()]= raceTrackGeographicMapCellTypeFactory!!.getStartType()
customMapArray[endGeographicMapCellPosition!!.getRow()]!![endGeographicMapCellPosition!!.getColumn()]= raceTrackGeographicMapCellTypeFactory!!.getEndType()

    var pathFindingInfo: PathFindingInfo = PathFindingInfoFactory.getInstance()!!.getInstance(raceTrackGeographicMap, customMapArray)!!


    var list: BasicArrayList = PathGenerator.getInstance()!!.getInstanceNoCache(geographicMapInterface, pathFindingInfo, 2)!!


    
                        if(list.size() < 1)
                        
                                    {
                                    


                            throw Exception("Path may have been cleared by clearing caching")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list
}


open fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{
    //var eventObject = eventObject
ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}


                @Throws(Exception::class)
            
open fun onBuildingEvent(event: RTSLayerEvent)
        //nullable = true from not(false or (false and false)) = true
{
    //var event = event




                        for (columnIndex in paths.size  - 1  downTo 0)

        {




                        for (rowIndex in paths.size  - 1  downTo 0)

        {
this.paths[columnIndex]!![rowIndex]= 
                                        null
                                    
}

}

}


open fun reset()
        //nullable = true from not(false or (false and true)) = true
{
this.getConnectedWaypointList()!!.clear()
this.releaseCachedPaths()
}


                @Throws(Exception::class)
            
open fun visit(unitLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var unitLayer = unitLayer

    
                        if(unitLayer!!.getGroupInterface()[0] != this.ownerLayer!!.getGroupInterface()[0])
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    var size: Int = this.getConnectedWaypointList()!!.size()!!


    
                        if(size > 0)
                        
                                    {
                                    
    var unitWaypointBehavior: UnitWaypointBehavior = unitLayer!!.getWaypointBehavior() as UnitWaypointBehavior


        while(this.getConnectedWaypointList()!!.size() > 0)
        {

    var rtsLayer: CollidableDestroyableDamageableLayer = this.getConnectedWaypointList()!!.get(0) as CollidableDestroyableDamageableLayer


    
                        if(rtsLayer!!.isDestroyed())
                        
                                    {
                                    this.getConnectedWaypointList()!!.remove(rtsLayer)

                                    }
                                
                        else {
                            unitLayer!!.handleCost(this.ownerLayer)
unitWaypointBehavior!!.insertWaypoint(0, rtsLayer)
break;

                    

                        }
                            
}


                                    }
                                
}


}
                
            

