
        /*
                * 
                *  AllBinary Open License Version 1
                *  Copyright (c) 2011 AllBinary
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
        package org.allbinary.media.graphics.geography.map.racetrack




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.util.BasicArrayList
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.PointFactory
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.pathfinding.PathFindingInfo
import org.allbinary.media.graphics.geography.pathfinding.PathFindingNode

open public class RaceTrackStartPointUtil
            : Object
         {
        

        companion object {
            
                @Throws(Exception::class)
            
open fun get(geographicMapInterface: BasicGeographicMap, pathFindingInfo: PathFindingInfo, index: Int)
        //nullable = true from not(false or (false and false)) = true
: GPoint{
    //var geographicMapInterface = geographicMapInterface
    //var pathFindingInfo = pathFindingInfo
    //var index = index

    var list: BasicArrayList = pathFindingInfo!!.getStartPathFindingNodeList()!!


    var startPathFindingNode: PathFindingNode = list.get(index) as PathFindingNode


    var geographicMapCellPosition: GeographicMapCellPosition = startPathFindingNode!!.geographicMapCellPosition


    var point: GPoint = geographicMapCellPosition!!.getPoint()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PointFactory.getInstance()!!.getInstance(point.getX(), point.getY() +geographicMapInterface!!.getAllBinaryTiledLayer()!!.getHalfCellHeight())
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

