
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
        
import org.jgrapht.GraphPath
import org.jgrapht.graph.DefaultWeightedEdge
import org.jgrapht.graph.SimpleWeightedGraph
import org.allbinary.util.BasicArrayList
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.graphics.CellPosition
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.BasicGeographicMapCellPositionFactory
import org.allbinary.media.graphics.geography.map.BasicGeographicMapUtil
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.racetrack.RaceTrackGeographicMap
import org.allbinary.media.graphics.geography.pathfinding.PathFindingNode

open public class PathFinderGraphHackVisitor : BasePathFinderGraphVisitor<V, E> {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
public constructor        (geographicMapInterface: BasicGeographicMap, edgeMinimum: Int, minPathWeight: Int, maxPathWeight: Int)                        

                            : super(geographicMapInterface, edgeMinimum, minPathWeight, maxPathWeight)

        Updates for KMP build        
        {
    //var geographicMapInterface = geographicMapInterface
var edgeMinimum = edgeMinimum
var minPathWeight = minPathWeight
var maxPathWeight = maxPathWeight


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
open fun visit(graph: SimpleWeightedGraph, startPathFindingNodeList: BasicArrayList, endPathFindingNodeList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graph = graph
var startPathFindingNodeList = startPathFindingNodeList
var endPathFindingNodeList = endPathFindingNodeList
this.fixStart(graph, startPathFindingNodeList)
this.fixEnd(graph, endPathFindingNodeList)
this.fixOverPassEdges(graph)
}


                @Throws(Exception::class)
            
open fun fixStart(graph: SimpleWeightedGraph<CellPosition, DefaultWeightedEdge>, startPathFindingNodeList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graph = graph
var startPathFindingNodeList = startPathFindingNodeList

    var geographicMapCellPositionFactory: BasicGeographicMapCellPositionFactory = this.geographicMapInterface!!.getGeographicMapCellPositionFactory()!!


    var tiledLayer: AllBinaryTiledLayer = this.geographicMapInterface!!.getAllBinaryTiledLayer()!!





                        for (index in startPathFindingNodeList!!.size() -1 downTo 0)

        

        Updates for KMP build        
        {

    var startPathFindingNode: PathFindingNode = startPathFindingNodeList!!.get(index) as PathFindingNode


    var geographicMapCellPosition: GeographicMapCellPosition = startPathFindingNode!!.geographicMapCellPosition


    var column: Int = geographicMapCellPosition!!.getColumn()!!


    var row: Int = geographicMapCellPosition!!.getRow()!!


    var nextRow: Int = row +1


    
                        if(tiledLayer!!.isOnTileLayer(column, nextRow))
                        
                                    {
                                    
    var geographicMapCellPositionNeighbor: GeographicMapCellPosition = geographicMapCellPositionFactory!!.getInstance(column, nextRow)!!

graph.removeEdge(geographicMapCellPosition, geographicMapCellPositionNeighbor)

                                    }
                                
}

}


                @Throws(Exception::class)
            
open fun fixEnd(graph: SimpleWeightedGraph<CellPosition, DefaultWeightedEdge>, endPathFindingNodeList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graph = graph
var endPathFindingNodeList = endPathFindingNodeList

    var geographicMapCellPositionFactory: BasicGeographicMapCellPositionFactory = this.geographicMapInterface!!.getGeographicMapCellPositionFactory()!!


    var tiledLayer: AllBinaryTiledLayer = this.geographicMapInterface!!.getAllBinaryTiledLayer()!!





                        for (index in endPathFindingNodeList!!.size() -1 downTo 0)

        

        Updates for KMP build        
        {

    var endPathFindingNode: PathFindingNode = endPathFindingNodeList!!.get(index) as PathFindingNode


    var geographicMapCellPosition: GeographicMapCellPosition = endPathFindingNode!!.geographicMapCellPosition

graph.addVertex(geographicMapCellPosition)

    var column: Int = geographicMapCellPosition!!.getColumn()!!


    var row: Int = geographicMapCellPosition!!.getRow()!!


    var nextRow: Int = row +1


    
                        if(tiledLayer!!.isOnTileLayer(column, nextRow))
                        
                                    {
                                    
    var geographicMapCellPositionNeighbor: GeographicMapCellPosition = geographicMapCellPositionFactory!!.getInstance(column, nextRow)!!

graph.addEdge(geographicMapCellPosition, geographicMapCellPositionNeighbor)

                                    }
                                
}

}


                @Throws(Exception::class)
            
open fun fixOverPassEdges(graph: SimpleWeightedGraph<CellPosition, DefaultWeightedEdge>)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graph = graph

    var geographicMapCellPositionFactory: BasicGeographicMapCellPositionFactory = this.geographicMapInterface!!.getGeographicMapCellPositionFactory()!!


    var raceTrackGeographicMap: RaceTrackGeographicMap = this.geographicMapInterface as RaceTrackGeographicMap


    var CellPositionArray: Array<CellPosition?> = raceTrackGeographicMap!!.getRaceTrackData()!!.getOverPassGeographicMapCellPositionArray()!!





                        for (index in CellPositionArray.size -1 downTo 0)

        

        Updates for KMP build        
        {

    var overPassGeographicMapCellPosition: CellPosition = CellPositionArray[index]!!

logUtil!!.put("Fixing Over Pass: " +overPassGeographicMapCellPosition!!.getColumn() +", " +overPassGeographicMapCellPosition!!.getRow(), this, "fixOverPassEdges")

    var underPassGeographicMapCellPosition: GeographicMapCellPosition = geographicMapCellPositionFactory!!.getInstance(overPassGeographicMapCellPosition!!.getColumn(), overPassGeographicMapCellPosition!!.getRow())!!


    var rightUnderPassGeographicMapCellPosition: GeographicMapCellPosition = geographicMapCellPositionFactory!!.getInstance(overPassGeographicMapCellPosition!!.getColumn() +1, overPassGeographicMapCellPosition!!.getRow())!!


    var leftUnderPassGeographicMapCellPosition: GeographicMapCellPosition = geographicMapCellPositionFactory!!.getInstance(overPassGeographicMapCellPosition!!.getColumn() -1, overPassGeographicMapCellPosition!!.getRow())!!

graph.removeEdge(underPassGeographicMapCellPosition, rightUnderPassGeographicMapCellPosition)
graph.removeEdge(underPassGeographicMapCellPosition, leftUnderPassGeographicMapCellPosition)
graph.addVertex(overPassGeographicMapCellPosition)
graph.addEdge(overPassGeographicMapCellPosition, rightUnderPassGeographicMapCellPosition)
graph.addEdge(overPassGeographicMapCellPosition, leftUnderPassGeographicMapCellPosition)
}

}


                @Throws(Exception::class)
            
open fun fixPath(startPathFindingNodeList: BasicArrayList, endPathFindingNodeList: BasicArrayList, pathList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var startPathFindingNodeList = startPathFindingNodeList
var endPathFindingNodeList = endPathFindingNodeList
var pathList = pathList




                        for (index in startPathFindingNodeList!!.size() -1 downTo 0)

        

        Updates for KMP build        
        {

    var endPathFindingNode: PathFindingNode = endPathFindingNodeList!!.get(index) as PathFindingNode


    var startPathFindingNode: PathFindingNode = startPathFindingNodeList!!.get(index) as PathFindingNode


    
                        if(BasicGeographicMapUtil.getInstance()!!.isSameCellPosition(startPathFindingNode!!.geographicMapCellPosition, endPathFindingNode!!.geographicMapCellPosition))
                        
                                    {
                                    
    
                        if(pathList!!.remove(endPathFindingNode!!.geographicMapCellPosition))
                        
                                    {
                                    pathList!!.remove(startPathFindingNode!!.geographicMapCellPosition)
pathList!!.add(0, startPathFindingNode!!.geographicMapCellPosition)

                                    }
                                

                                    }
                                
}

this.removeOverPassEdges(pathList)
}


                @Throws(Exception::class)
            
open fun removeOverPassEdges(pathList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var pathList = pathList

    var geographicMapCellPositionFactory: BasicGeographicMapCellPositionFactory = this.geographicMapInterface!!.getGeographicMapCellPositionFactory()!!


    var raceTrackGeographicMap: RaceTrackGeographicMap = this.geographicMapInterface as RaceTrackGeographicMap


    var CellPositionArray: Array<CellPosition?> = raceTrackGeographicMap!!.getRaceTrackData()!!.getOverPassGeographicMapCellPositionArray()!!





                        for (index in CellPositionArray.size -1 downTo 0)

        

        Updates for KMP build        
        {

    var overPassGeographicMapCellPosition: CellPosition = CellPositionArray[index]!!


    var underPassGeographicMapCellPosition: GeographicMapCellPosition = geographicMapCellPositionFactory!!.getInstance(overPassGeographicMapCellPosition!!.getColumn(), overPassGeographicMapCellPosition!!.getRow())!!


    var indexOf: Int = pathList!!.indexOf(overPassGeographicMapCellPosition)!!


    
                        if(indexOf !=  -1)
                        
                                    {
                                    pathList!!.set(indexOf, underPassGeographicMapCellPosition)

                                    }
                                
}

}


open fun isValid(graphPath: GraphPath)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
var graphPath = graphPath

    
                        if(graphPath!!.getEdgeList()!!.size() > edgeMinimum && graphPath!!.getWeight() < maxPathWeight && graphPath!!.getWeight() > minPathWeight)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


}
                
            

