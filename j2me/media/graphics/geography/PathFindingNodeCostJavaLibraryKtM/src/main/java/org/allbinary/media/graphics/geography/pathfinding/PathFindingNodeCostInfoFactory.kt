
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
        package org.allbinary.media.graphics.geography.pathfinding




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition

open public class PathFindingNodeCostInfoFactory : PathFindingNodeCostInfoFactoryBase {
        

    private val pathFindingNodeCostInfoAdjacencyList: Array<Array<PathFindingNodeCostInfo?>?>
public constructor        (max: Int){
var max = max
this.pathFindingNodeCostInfoAdjacencyList= Array(max) { arrayOfNulls<PathFindingNodeCostInfo?>(max) }
                                                            
}


                @Throws(Exception::class)
            
open fun create(geographicMapInterface: BasicGeographicMap, goingToGeographicMapCellPosition: GeographicMapCellPosition, geographicMapCellPosition: GeographicMapCellPosition, costFromStart: Long, costToEnd: Long)
        //nullable = true from not(false or (false and false)) = true
{
    //var geographicMapInterface = geographicMapInterface
    //var goingToGeographicMapCellPosition = goingToGeographicMapCellPosition
    //var geographicMapCellPosition = geographicMapCellPosition
    //var costFromStart = costFromStart
    //var costToEnd = costToEnd
this.getInstance(goingToGeographicMapCellPosition, geographicMapCellPosition, costFromStart, costToEnd)
}


                @Throws(Exception::class)
            
open fun getInstance(goingToGeographicMapCellPosition: GeographicMapCellPosition, geographicMapCellPosition: GeographicMapCellPosition, costFromStart: Long, costToEnd: Long)
        //nullable =  from not(true or (false and false)) = 
: PathFindingNodeCostInfo{
    //var goingToGeographicMapCellPosition = goingToGeographicMapCellPosition
    //var geographicMapCellPosition = geographicMapCellPosition
    //var costFromStart = costFromStart
    //var costToEnd = costToEnd

    var pathFindingNodeCostInfo: PathFindingNodeCostInfo = this.getInstance(goingToGeographicMapCellPosition, geographicMapCellPosition)!!


    
                        if(pathFindingNodeCostInfo == 
                                    null
                                )
                        
                                    {
                                    pathFindingNodeCostInfo= PathFindingNodeCostInfo(costFromStart, costToEnd)
pathFindingNodeCostInfo!!.setTotalCost()
this.pathFindingNodeCostInfoAdjacencyList[geographicMapCellPosition!!.getId()]!![goingToGeographicMapCellPosition!!.getId()]= pathFindingNodeCostInfo

                                    }
                                
                        else {
                            pathFindingNodeCostInfo!!.setCostFromStart(costFromStart)
pathFindingNodeCostInfo!!.setCostToEnd(costToEnd)
pathFindingNodeCostInfo!!.setTotalCost()

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return pathFindingNodeCostInfo
}


open fun getInstance(goingToFromGeographicMapCellPosition: GeographicMapCellPosition, geographicMapCellPosition: GeographicMapCellPosition)
        //nullable =  from not(true or (false and false)) = 
: PathFindingNodeCostInfo{
    //var goingToFromGeographicMapCellPosition = goingToFromGeographicMapCellPosition
    //var geographicMapCellPosition = geographicMapCellPosition



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.pathFindingNodeCostInfoAdjacencyList[geographicMapCellPosition!!.getId()]!![goingToFromGeographicMapCellPosition!!.getId()]!!
}


open fun getTotalCost(geographicMapInterface: BasicGeographicMap, comingFromGeographicMapCellPosition: GeographicMapCellPosition, geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: Long{
    //var geographicMapInterface = geographicMapInterface
    //var comingFromGeographicMapCellPosition = comingFromGeographicMapCellPosition
    //var geographicMapCellPosition = geographicMapCellPosition



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getInstance(comingFromGeographicMapCellPosition, geographicMapCellPosition)!!.totalCost
}


}
                
            

