
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.game.layer.PathFindingLayerInterface
import org.allbinary.game.layer.RTSLayerEvent
import org.allbinary.game.layer.building.event.BuildingEventListenerInterface
import org.allbinary.game.layer.special.CollidableDestroyableDamageableLayer
import org.allbinary.game.layer.unit.UnitWaypointBehavior
import org.allbinary.game.media.graphics.geography.map.racetrack.PathFindingInfoFactory
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.media.audio.Sound
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.GeographicMapCellTypeFactory
import org.allbinary.media.graphics.geography.map.GeographicMapCompositeInterface
import org.allbinary.media.graphics.geography.map.racetrack.CustomMapGenerator
import org.allbinary.media.graphics.geography.map.racetrack.RaceTrackGeographicMap
import org.allbinary.media.graphics.geography.pathfinding.MultipassState
import org.allbinary.media.graphics.geography.pathfinding.PathFindingInfo
import org.allbinary.media.graphics.geography.pathfinding.PathGenerator
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListUtil

open public class MultipassNoCacheWaypoint : WaypointBase
                , BuildingEventListenerInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val ownerLayer: PathFindingLayerInterface
public constructor        (ownerLayer: PathFindingLayerInterface, sound: Sound)                        

                            : super(sound){

                    var ownerLayer = ownerLayer


                    var sound = sound


                            //For kotlin this is before the body of the constructor.
                    
this.ownerLayer= ownerLayer
}


                @Throws(Exception::class)
            
open fun setAllBinaryGameLayerManager(allBinaryGameLayerManager: AllBinaryGameLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryGameLayerManager = allBinaryGameLayerManager
super.setAllBinaryGameLayerManager(allBinaryGameLayerManager)
}


open fun releaseCachedPaths()
        //nullable = true from not(false or (false and true)) = true
{}


                @Throws(Exception::class)
            override fun getPathFindingInfo(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: PathFindingInfo{

                    var geographicMapCellPosition = geographicMapCellPosition

    var startGeographicMapCellPosition: GeographicMapCellPosition = geographicMapCellPosition


    var endGeographicMapCellPosition: GeographicMapCellPosition = this.getEndGeographicMapCellPosition(startGeographicMapCellPosition)!!
            


    
                        if(endGeographicMapCellPosition == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                                    }
                                

    
                        if(startGeographicMapCellPosition == endGeographicMapCellPosition)
                        
                                    {
                                    
    
                        if(this.ownerLayer!!.shouldHandleStartSameAsEnd())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                                    }
                                
                        else {
                            


                            throw Exception("Start should not be End: " +endGeographicMapCellPosition)

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
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return pathFindingInfo
}


                @Throws(Exception::class)
            override fun getPathsList(geographicMapCellPosition: GeographicMapCellPosition, pathFindingInfo: PathFindingInfo, multipassState: MultipassState)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var geographicMapCellPosition = geographicMapCellPosition


                    var pathFindingInfo = pathFindingInfo


                    var multipassState = multipassState

        try {
            
    
                        if(pathFindingInfo == 
                                    null
                                )
                        
                                    {
                                    logUtil!!.put("pathFindingInfo: " +pathFindingInfo, this, 
                            "getPathsList")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BasicArrayListUtil.getInstance()!!.getImmutableInstance()

                                    }
                                

    var geographicMapCompositeInterface: GeographicMapCompositeInterface = this.allBinaryGameLayerManager as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!


    var list: BasicArrayList = PathGenerator.getInstance()!!.createN(geographicMapInterface, pathFindingInfo, 2, multipassState)!!
            


    
                        if(list != 
                                    null
                                 && list != BasicArrayListUtil.getInstance()!!.getImmutableInstance())
                        
                                    {
                                    
    
                        if(list.size() < 1)
                        
                                    {
                                    


                            throw Exception(
                            "Path may have been cleared by clearing caching")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "getPathsList", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BasicArrayListUtil.getInstance()!!.getImmutableInstance()
}

}


                @Throws(Exception::class)
            
open fun getEndGeographicMapCellPosition(startGeographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: GeographicMapCellPosition{

                    var startGeographicMapCellPosition = startGeographicMapCellPosition

    var endList: BasicArrayList = this.ownerLayer!!.getEndGeographicMapCellPositionList()!!
            


    var endGeographicMapCellPosition: GeographicMapCellPosition = BasicArrayListUtil.getInstance()!!.getRandom(endList) as GeographicMapCellPosition


    
                        if(startGeographicMapCellPosition == endGeographicMapCellPosition)
                        
                                    {
                                    



                        for (index in endList!!.size() -1 downTo 0)


        {endGeographicMapCellPosition= endList!!.get(index) as GeographicMapCellPosition

    
                        if(startGeographicMapCellPosition != endGeographicMapCellPosition)
                        
                                    {
                                    break;

                    

                                    }
                                
}


                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return endGeographicMapCellPosition
}


open fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{

                    var eventObject = eventObject
ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}


                @Throws(Exception::class)
            
open fun onBuildingEvent(event: RTSLayerEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var event = event
}


open fun reset()
        //nullable = true from not(false or (false and true)) = true
{this.getConnectedWaypointList()!!.clear()
}


                @Throws(Exception::class)
            
open fun visit(unitLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var unitLayer = unitLayer

    
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
                
            

