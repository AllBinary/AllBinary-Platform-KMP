
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
        package org.allbinary.media.graphics.geography.pathfinding




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashSet
import java.util.PriorityQueue
import java.util.Set
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.math.MathUtil
import org.allbinary.string.CommonStrings
import org.allbinary.logic.string.StringMaker
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.BasicGeographicMapCellPositionFactory
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.GeographicMapCellType
import org.allbinary.media.graphics.geography.map.racetrack.RaceTrackGeographicMapCellType
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListUtil

open public class PathFinder : GeographicPathFinderBase {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val basicArrayListUtil: BasicArrayListUtil = BasicArrayListUtil.getInstance()!!
            

    private val mathUtil: MathUtil = MathUtil.getInstance()!!
            

    private val openPriorityQueue: PriorityQueue<PathFindingNodeCost> = PriorityQueue<>()

    private val closedSet: Set<PathFindingNodeCost> = HashSet<>()

    private var geographicMapInterface: BasicGeographicMap

    private var costArray: Array<Array<PathFindingNodeCost?>?>

                @Throws(Exception::class)
            
open fun init(geographicMapInterface: BasicGeographicMap)
        //nullable = true from not(false or (false and false)) = true
{

                    var geographicMapInterface = geographicMapInterface
this.geographicMapInterface= geographicMapInterface

    var tiledLayer: AllBinaryTiledLayer = this.geographicMapInterface!!.getAllBinaryTiledLayer()!!
            

this.costArray= arrayOfNulls(tiledLayer!!.getColumns())

    var basicGeographicMapCellPositionFactory: BasicGeographicMapCellPositionFactory = geographicMapInterface!!.getGeographicMapCellPositionFactory()!!
            


    var node: PathFindingNodeCost


    var sizeX: Int = costArray!!.size
                


    var sizeY: Int = costArray[0]!!.size
                





                        for (column in 0 until sizeX)


        {



                        for (row in 0 until sizeY)


        {
    var geographicMapCellType: GeographicMapCellType = this.geographicMapInterface!!.getCellTypeAt(basicGeographicMapCellPositionFactory!!.getInstance(column, row))!!
            


    var raceTrackGeographicMapCellType: RaceTrackGeographicMapCellType = geographicMapCellType as RaceTrackGeographicMapCellType

node= PathFindingNodeCost(
                            null, basicGeographicMapCellPositionFactory!!.getInstance(column, row), PathFindingNodeCostInfo(raceTrackGeographicMapCellType!!.getTravelCost(),  -1))
costArray[column]!![row]= node
}

}

}


open fun search(startPathFindingNodeList: BasicArrayList, endPathFindingNodeList: BasicArrayList, totalPaths: Int)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var startPathFindingNodeList = startPathFindingNodeList


                    var endPathFindingNodeList = endPathFindingNodeList


                    var totalPaths = totalPaths

        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.search(startPathFindingNodeList!!.get(0) as PathFindingNode, endPathFindingNodeList!!.get(0) as PathFindingNode)
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, "search", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


                @Throws(Exception::class)
            
open fun searchN(startPathFindingNodeList: BasicArrayList, endPathFindingNodeList: BasicArrayList, totalPaths: Int, multipassState: MultipassState)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var startPathFindingNodeList = startPathFindingNodeList


                    var endPathFindingNodeList = endPathFindingNodeList


                    var totalPaths = totalPaths


                    var multipassState = multipassState

    
                        if(multipassState!!.step == 0)
                        
                                    {
                                    multipassState!!.step++

                                    }
                                
                             else 
    
                        if(multipassState!!.step == 1)
                        
                                    {
                                    this.searchStart(startPathFindingNodeList!!.get(0) as PathFindingNode, endPathFindingNodeList!!.get(0) as PathFindingNode, multipassState)

                                    }
                                
                             else 
    
                        if(multipassState!!.step == 2)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.searchN(startPathFindingNodeList!!.get(0) as PathFindingNode, endPathFindingNodeList!!.get(0) as PathFindingNode, multipassState)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


                @Throws(Exception::class)
            
open fun search(startPathFindingNode: PathFindingNode, endPathFindingNode: PathFindingNode)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var startPathFindingNode = startPathFindingNode


                    var endPathFindingNode = endPathFindingNode

    var list: BasicArrayList = this.findPath(startPathFindingNode!!.geographicMapCellPosition, endPathFindingNode!!.geographicMapCellPosition)!!
            


    var pathList: BasicArrayList = BasicArrayList()

pathList!!.add(list)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return pathList
}


                @Throws(Exception::class)
            
open fun searchStart(startPathFindingNode: PathFindingNode, endPathFindingNode: PathFindingNode, multipassState: MultipassState)
        //nullable = true from not(false or (false and false)) = true
{

                    var startPathFindingNode = startPathFindingNode


                    var endPathFindingNode = endPathFindingNode


                    var multipassState = multipassState
this.findPathStart(startPathFindingNode!!.geographicMapCellPosition, endPathFindingNode!!.geographicMapCellPosition, multipassState)
}


                @Throws(Exception::class)
            
open fun searchN(startPathFindingNode: PathFindingNode, endPathFindingNode: PathFindingNode, multipassState: MultipassState)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var startPathFindingNode = startPathFindingNode


                    var endPathFindingNode = endPathFindingNode


                    var multipassState = multipassState

    var list: BasicArrayList = this.findPathEnd(startPathFindingNode!!.geographicMapCellPosition, endPathFindingNode!!.geographicMapCellPosition, multipassState)!!
            


    
                        if(list == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                                    }
                                

    var pathList: BasicArrayList = BasicArrayList()

pathList!!.add(list)
multipassState!!.iteration= 0
multipassState!!.step= 0



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return pathList
}


                @Throws(Exception::class)
            
open fun findPath(start: GeographicMapCellPosition, target: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var start = start


                    var target = target
this.openPriorityQueue!!.clear()
this.closedSet!!.clear()

    var discoveryCalculation: Int= 0


    var node: PathFindingNodeCost


    var targetColumn: Int = target.getColumn()!!
            


    var targetRow: Int = target.getRow()!!
            


    var sizeX: Int = costArray!!.size
                


    var sizeY: Int = costArray[0]!!.size
                





                        for (column in 0 until sizeX)


        {



                        for (row in 0 until sizeY)


        {discoveryCalculation= mathUtil!!.abs(column -targetColumn) +mathUtil!!.abs(row -targetRow)
node= costArray[column]!![row]!!
node.pathFindingNodeCostInfo!!.totalCost= 0
node.pathFindingNodeCostInfo!!.costToEnd= discoveryCalculation
}

}


    var startNode: PathFindingNodeCost = costArray[start.getColumn()]!![start.getRow()]!!

openPriorityQueue!!.add(startNode)

    var basicGeographicMapCellPositionFactory: BasicGeographicMapCellPositionFactory = geographicMapInterface!!.getGeographicMapCellPositionFactory()!!
            


    var allBinaryTiledLayer: AllBinaryTiledLayer = this.geographicMapInterface!!.getAllBinaryTiledLayer()!!
            


    var targetNode: PathFindingNodeCost = costArray[target.getColumn()]!![target.getRow()]!!


    var current: PathFindingNodeCost


        do
        {current= openPriorityQueue!!.poll()
closedSet!!.add(current)

    
                        if(current.equals(targetNode))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.extractPath(start, current)

                                    }
                                

    var neighbor: PathFindingNodeCost


    var neighborInfo: PathFindingNodeCostInfo


    var calculatedCost: Long= 0





                        for (column in current.geographicMapCellPosition!!.getColumn() -1 until current.geographicMapCellPosition!!.getColumn() +2)


        {



                        for (row in current.geographicMapCellPosition!!.getRow() -1 until current.geographicMapCellPosition!!.getRow() +2)


        {
    
                        if(column > 0 && row > 0 && column < allBinaryTiledLayer!!.getColumns() && row < allBinaryTiledLayer!!.getRows() && this.geographicMapInterface!!.isOnMap(basicGeographicMapCellPositionFactory!!.getInstance(column, row)))
                        
                                    {
                                    neighbor= costArray[column]!![row]!!

    
                        if(closedSet!!.contains(neighbor))
                        
                                    {
                                    

                        continue
                    

                                    }
                                
neighborInfo= neighbor.pathFindingNodeCostInfo
calculatedCost= neighborInfo!!.costToEnd +neighborInfo!!.costFromStart +current.pathFindingNodeCostInfo!!.totalCost

    
                        if(calculatedCost < neighborInfo!!.totalCost || !openPriorityQueue!!.contains(neighbor))
                        
                                    {
                                    neighborInfo!!.totalCost= calculatedCost
neighbor.parent= current

    
                        if(!openPriorityQueue!!.contains(neighbor))
                        
                                    {
                                    
    
                        if(this.geographicMapInterface!!.isOfFourDirections(current.geographicMapCellPosition, neighbor.geographicMapCellPosition))
                        
                                    {
                                    openPriorityQueue!!.add(neighbor)

                                    }
                                

                                    }
                                

                                    }
                                

                                    }
                                
}

}

}

        while(!openPriorityQueue!!.isEmpty())
    



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
open fun findPathStart(start: GeographicMapCellPosition, target: GeographicMapCellPosition, multipassState: MultipassState)
        //nullable = true from not(false or (false and false)) = true
{

                    var start = start


                    var target = target


                    var multipassState = multipassState
this.openPriorityQueue!!.clear()
this.closedSet!!.clear()

    var discoveryCalculation: Int= 0


    var node: PathFindingNodeCost


    var targetColumn: Int = target.getColumn()!!
            


    var targetRow: Int = target.getRow()!!
            


    var sizeX: Int = costArray!!.size
                


    var sizeY: Int = costArray[0]!!.size
                





                        for (column in 0 until sizeX)


        {



                        for (row in 0 until sizeY)


        {discoveryCalculation= mathUtil!!.abs(column -targetColumn) +mathUtil!!.abs(row -targetRow)
node= costArray[column]!![row]!!
node.pathFindingNodeCostInfo!!.totalCost= 0
node.pathFindingNodeCostInfo!!.costToEnd= discoveryCalculation
}

}


    var startNode: PathFindingNodeCost = costArray[start.getColumn()]!![start.getRow()]!!

openPriorityQueue!!.add(startNode)
multipassState!!.step++
}


                @Throws(Exception::class)
            
open fun findPathEnd(start: GeographicMapCellPosition, target: GeographicMapCellPosition, multipassState: MultipassState)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var start = start


                    var target = target


                    var multipassState = multipassState

    var basicGeographicMapCellPositionFactory: BasicGeographicMapCellPositionFactory = geographicMapInterface!!.getGeographicMapCellPositionFactory()!!
            


    var allBinaryTiledLayer: AllBinaryTiledLayer = this.geographicMapInterface!!.getAllBinaryTiledLayer()!!
            


    var targetNode: PathFindingNodeCost = costArray[target.getColumn()]!![target.getRow()]!!


    var current: PathFindingNodeCost


    var total: Int = 0


        do
        {current= openPriorityQueue!!.poll()
closedSet!!.add(current)

    
                        if(current.equals(targetNode))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.extractPath(start, current)

                                    }
                                

    var neighbor: PathFindingNodeCost


    var neighborInfo: PathFindingNodeCostInfo


    var calculatedCost: Long= 0





                        for (column in current.geographicMapCellPosition!!.getColumn() -1 until current.geographicMapCellPosition!!.getColumn() +2)


        {



                        for (row in current.geographicMapCellPosition!!.getRow() -1 until current.geographicMapCellPosition!!.getRow() +2)


        {
    
                        if(column > 0 && row > 0 && column < allBinaryTiledLayer!!.getColumns() && row < allBinaryTiledLayer!!.getRows() && this.geographicMapInterface!!.isOnMap(basicGeographicMapCellPositionFactory!!.getInstance(column, row)))
                        
                                    {
                                    neighbor= costArray[column]!![row]!!

    
                        if(closedSet!!.contains(neighbor))
                        
                                    {
                                    

                        continue
                    

                                    }
                                
neighborInfo= neighbor.pathFindingNodeCostInfo
calculatedCost= neighborInfo!!.costToEnd +neighborInfo!!.costFromStart +current.pathFindingNodeCostInfo!!.totalCost

    
                        if(calculatedCost < neighborInfo!!.totalCost || !openPriorityQueue!!.contains(neighbor))
                        
                                    {
                                    neighborInfo!!.totalCost= calculatedCost
neighbor.parent= current

    
                        if(!openPriorityQueue!!.contains(neighbor))
                        
                                    {
                                    
    
                        if(this.geographicMapInterface!!.isOfFourDirections(current.geographicMapCellPosition, neighbor.geographicMapCellPosition))
                        
                                    {
                                    openPriorityQueue!!.add(neighbor)

                                    }
                                

                                    }
                                

                                    }
                                

                                    }
                                
}

}

total++

    
                        if(total > 10)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                                    }
                                
}

        while(!openPriorityQueue!!.isEmpty())
    



                            throw RuntimeException()
}


open fun extractPath(start: GeographicMapCellPosition, current: PathFindingNodeCost)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var start = start


                    var current = current

    var path: BasicArrayList = BasicArrayList()


        while(current.parent != 
                                    null
                                )
        {path.add(current.geographicMapCellPosition)
current= current.parent as PathFindingNodeCost
}

path.add(start)
basicArrayListUtil!!.reverse(path)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return path
}


}
                
            

