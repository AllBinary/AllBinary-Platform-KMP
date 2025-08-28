
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
        package org.allbinary.game.media.graphics.geography.map.racetrack




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.BasicGeographicMapCellPositionFactory
import org.allbinary.media.graphics.geography.map.BasicGeographicMapUtil
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.GeographicMapCellType
import org.allbinary.media.graphics.geography.map.GeographicMapCellTypeFactory
import org.allbinary.media.graphics.geography.map.racetrack.BasePathFindingInfoFactory
import org.allbinary.media.graphics.geography.map.racetrack.RaceTrackGeographicMapCellType
import org.allbinary.media.graphics.geography.map.racetrack.RaceTrackRoadsGeographicMapCellHistoryFactory
import org.allbinary.media.graphics.geography.pathfinding.PathFindingNodeCostInfoFactoryBase
import org.allbinary.media.graphics.geography.pathfinding.BasicGeographicMapGraph
import org.allbinary.media.graphics.geography.pathfinding.BasicGeographicMapPathFinder
import org.allbinary.media.graphics.geography.pathfinding.PathFinderGraphVisitorFactoryBase
import org.allbinary.media.graphics.geography.pathfinding.PathFindingInfo
import org.allbinary.media.graphics.geography.pathfinding.PathFindingNodeCostInfoFactory

open public class PathFindingInfoFactory : BasePathFindingInfoFactory {
        

        companion object {
            
    private var instance: PathFindingInfoFactory

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PathFindingInfoFactory

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


open fun init(max: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var max = max
instance= PathFindingInfoFactory(SimplePathFinderGraphVisitorFactory(1, 1, Integer.MAX_VALUE), max)
}


        }
            
    private val MAX_DIRECTIONS: Int = 4

    private val pathFindingInfo: PathFindingInfo

    private val basicGeographicMapGraph: BasicGeographicMapGraph

    private val basicGeographicMapPathFinder: BasicGeographicMapPathFinder

    private val pathFinderGraphVisitorFactoryInterface: PathFinderGraphVisitorFactoryBase
private constructor        (pathFinderGraphVisitorFactoryInterface: PathFinderGraphVisitorFactoryBase, max: Int)

        Updates for KMP build        
        {
    //var pathFinderGraphVisitorFactoryInterface = pathFinderGraphVisitorFactoryInterface
    //var max = max

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

PreLogUtil.put("Using Dynamic Path Finding", this, commonStrings!!.GET_INSTANCE)
this.basicGeographicMapPathFinder= BasicGeographicMapPathFinder(max)
this.pathFindingInfo= PathFindingInfo(PathFindingNodeCostInfoFactory(max))
this.basicGeographicMapGraph= BasicGeographicMapGraph(pathFindingInfo!!.getPathFindingNodeCostInfoFactoryInterface() as PathFindingNodeCostInfoFactory)
this.pathFinderGraphVisitorFactoryInterface= pathFinderGraphVisitorFactoryInterface
}


                @Throws(Exception::class)
            
open fun getInstance(geographicMapInterface: BasicGeographicMap, mapArray: Array<IntArray?>)
        //nullable =  from not(true or (false and false)) = 
: PathFindingInfo

        Updates for KMP build        
        {
    //var geographicMapInterface = geographicMapInterface
    //var mapArray = mapArray

    var pathFindingInfo: PathFindingInfo = PathFindingInfo(this.pathFindingInfo!!.getPathFindingNodeCostInfoFactoryInterface())

RaceTrackRoadsGeographicMapCellHistoryFactory.getInstance()!!.init()
this.init(geographicMapInterface, pathFindingInfo, mapArray)
this.basicGeographicMapPathFinder!!.init(geographicMapInterface, basicGeographicMapGraph, pathFinderGraphVisitorFactoryInterface!!.getInstance(geographicMapInterface))
pathFindingInfo!!.setPathFinder(basicGeographicMapPathFinder)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return pathFindingInfo
}


                @Throws(Exception::class)
            
open fun init(geographicMapInterface: BasicGeographicMap, pathFindingInfo: PathFindingInfo, mapArray: Array<IntArray?>)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var geographicMapInterface = geographicMapInterface
    //var pathFindingInfo = pathFindingInfo
    //var mapArray = mapArray
super.init(geographicMapInterface, pathFindingInfo, mapArray)
this.buildPathFindingNodes(geographicMapInterface, pathFindingInfo, mapArray)
}


                @Throws(Exception::class)
            
open fun buildPathFindingNodes(geographicMapInterface: BasicGeographicMap, pathFindingInfo: PathFindingInfo, mapArray: Array<IntArray?>, cellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var geographicMapInterface = geographicMapInterface
    //var pathFindingInfo = pathFindingInfo
    //var mapArray = mapArray
    //var cellPosition = cellPosition

    var geographicMapCellPositionFactory: BasicGeographicMapCellPositionFactory = geographicMapInterface!!.getGeographicMapCellPositionFactory()!!


    var cellTypeId: Int = mapArray[cellPosition!!.getRow()]!![cellPosition!!.getColumn()]!!


    var geographicMapCellType: GeographicMapCellType = GeographicMapCellTypeFactory.getInstance()!!.getInstance(geographicMapInterface!!.getCellTypeFromMapCellTypeInt(cellTypeId))!!


    var raceTrackGeographicMapCellType: RaceTrackGeographicMapCellType = geographicMapCellType as RaceTrackGeographicMapCellType


    var allBinaryTiledLayer: AllBinaryTiledLayer = geographicMapInterface!!.getAllBinaryTiledLayer()!!


    var pathFindingNodeCostInfoFactoryInterface: PathFindingNodeCostInfoFactoryBase = pathFindingInfo!!.getPathFindingNodeCostInfoFactoryInterface()!!


    var basicGeographicMapUtil: BasicGeographicMapUtil = BasicGeographicMapUtil.getInstance()!!


    var row: Int= 0


    var column: Int= 0


    var goingToGeographicMapCellPosition: GeographicMapCellPosition


    var costFromStart: Int= 0


    var costToEnd: Int= 0





                        for (index in 0 until MAX_DIRECTIONS)

        

        Updates for KMP build        
        {
row= basicGeographicMapUtil!!.getBorderingRow(index, cellPosition)
column= basicGeographicMapUtil!!.getBorderingColumn(index, cellPosition)

    
                        if(row < allBinaryTiledLayer!!.getRows() && column < allBinaryTiledLayer!!.getColumns() && row >= 0 && column >= 0)
                        
                                    {
                                    goingToGeographicMapCellPosition= geographicMapCellPositionFactory!!.getInstance(column, row)
costFromStart= raceTrackGeographicMapCellType!!.getTravelCost()
costToEnd= costFromStart
pathFindingNodeCostInfoFactoryInterface!!.create(geographicMapInterface, goingToGeographicMapCellPosition, cellPosition, costFromStart, costToEnd)

                                    }
                                
}

}


                @Throws(Exception::class)
            
open fun buildPathFindingNodes(geographicMapInterface: BasicGeographicMap, pathFindingInfo: PathFindingInfo, mapArray: Array<IntArray?>)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var geographicMapInterface = geographicMapInterface
    //var pathFindingInfo = pathFindingInfo
    //var mapArray = mapArray

    var geographicMapCellPositionFactory: BasicGeographicMapCellPositionFactory = geographicMapInterface!!.getGeographicMapCellPositionFactory()!!


    var allBinaryTiledLayer: AllBinaryTiledLayer = geographicMapInterface!!.getAllBinaryTiledLayer()!!


    var totalColumns: Int = allBinaryTiledLayer!!.getColumns()!!


    var totalRows: Int = allBinaryTiledLayer!!.getRows()!!





                        for (column in 0 until totalColumns)

        

        Updates for KMP build        
        {




                        for (row in 0 until totalRows)

        

        Updates for KMP build        
        {
this.buildPathFindingNodes(geographicMapInterface, pathFindingInfo, mapArray, geographicMapCellPositionFactory!!.getInstance(column, row))
}

}

}


}
                
            

