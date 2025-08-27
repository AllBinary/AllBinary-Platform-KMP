
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.BasicGeographicMapCellPositionFactory
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.racetrack.BasePathFindingInfoFactory
import org.allbinary.media.graphics.geography.map.racetrack.RaceTrackRoadsGeographicMapCellHistoryFactory
import org.allbinary.media.graphics.geography.pathfinding.PathFinder
import org.allbinary.media.graphics.geography.pathfinding.PathFindingInfo
import org.allbinary.media.graphics.geography.pathfinding.PathFindingNodeCostInfoFactory

open public class PathFindingInfoFactory : BasePathFindingInfoFactory {
        

        companion object {
            
    private val instance: PathFindingInfoFactory = PathFindingInfoFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PathFindingInfoFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


    private var MAX: Int = 32768

open fun init(max: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var max = max
PathFindingInfoFactory.MAX= max
}


        }
            
    private val pathFindingInfo: PathFindingInfo

    private val pathFinder: PathFinder
private constructor        (){this.pathFindingInfo= PathFindingInfo(PathFindingNodeCostInfoFactory(MAX))
this.pathFinder= PathFinder()
}


                @Throws(Exception::class)
            
open fun getInstance(geographicMapInterface: BasicGeographicMap, mapArray: Array<IntArray?>)
        //nullable =  from not(true or (false and false)) = 
: PathFindingInfo{

                    var geographicMapInterface = geographicMapInterface


                    var mapArray = mapArray

    var pathFindingInfo: PathFindingInfo = PathFindingInfo(this.pathFindingInfo!!.getPathFindingNodeCostInfoFactoryInterface())

RaceTrackRoadsGeographicMapCellHistoryFactory.getInstance()!!.init()
this.init(geographicMapInterface, pathFindingInfo, mapArray)
this.pathFinder!!.init(geographicMapInterface)
pathFindingInfo!!.setPathFinder(pathFinder)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return pathFindingInfo
}


                @Throws(Exception::class)
            
open fun init(geographicMapInterface: BasicGeographicMap, pathFindingInfo: PathFindingInfo, mapArray: Array<IntArray?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var geographicMapInterface = geographicMapInterface


                    var pathFindingInfo = pathFindingInfo


                    var mapArray = mapArray
super.init(geographicMapInterface, pathFindingInfo, mapArray)
this.buildPathFindingNodes(geographicMapInterface, pathFindingInfo, mapArray)
}


                @Throws(Exception::class)
            
open fun buildPathFindingNodes(geographicMapInterface: BasicGeographicMap, pathFindingInfo: PathFindingInfo, mapArray: Array<IntArray?>, cellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
{

                    var geographicMapInterface = geographicMapInterface


                    var pathFindingInfo = pathFindingInfo


                    var mapArray = mapArray


                    var cellPosition = cellPosition
}


                @Throws(Exception::class)
            
open fun buildPathFindingNodes(geographicMapInterface: BasicGeographicMap, pathFindingInfo: PathFindingInfo, mapArray: Array<IntArray?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var geographicMapInterface = geographicMapInterface


                    var pathFindingInfo = pathFindingInfo


                    var mapArray = mapArray

    var geographicMapCellPositionFactory: BasicGeographicMapCellPositionFactory = geographicMapInterface!!.getGeographicMapCellPositionFactory()!!


    var allBinaryTiledLayer: AllBinaryTiledLayer = geographicMapInterface!!.getAllBinaryTiledLayer()!!


    var totalColumns: Int = allBinaryTiledLayer!!.getColumns()!!


    var totalRows: Int = allBinaryTiledLayer!!.getRows()!!





                        for (column in 0 until totalColumns)

        {



                        for (row in 0 until totalRows)

        {this.buildPathFindingNodes(geographicMapInterface, pathFindingInfo, mapArray, geographicMapCellPositionFactory!!.getInstance(column, row))
}

}

}


}
                
            

