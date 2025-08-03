
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringUtil
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.pathfinding.PathFinderGraphVisitorBase
import org.allbinary.media.graphics.geography.pathfinding.PathFindingNode
import org.allbinary.util.BasicArrayList

open public class BasePathFinderGraphVisitor : PathFinderGraphVisitorBase {
        

    var geographicMapInterface: BasicGeographicMap

    val edgeMinimum: Int

    val minPathWeight: Int

    val maxPathWeight: Int
public constructor        (geographicMapInterface: BasicGeographicMap, edgeMinimum: Int, minPathWeight: Int, maxPathWeight: Int){

                    var geographicMapInterface = geographicMapInterface


                    var edgeMinimum = edgeMinimum


                    var minPathWeight = minPathWeight


                    var maxPathWeight = maxPathWeight
this.geographicMapInterface= geographicMapInterface
this.edgeMinimum= edgeMinimum
this.minPathWeight= minPathWeight
this.maxPathWeight= maxPathWeight
}


                @Throws(Exception::class)
            
open fun visit(graph: Any, startPathFindingNodeList: BasicArrayList, endPathFindingNodeList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var graph = graph


                    var startPathFindingNodeList = startPathFindingNodeList


                    var endPathFindingNodeList = endPathFindingNodeList
}


                @Throws(Exception::class)
            
open fun fixPath(startPathFindingNodeList: BasicArrayList, endPathFindingNodeList: BasicArrayList, pathList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var startPathFindingNodeList = startPathFindingNodeList


                    var endPathFindingNodeList = endPathFindingNodeList


                    var pathList = pathList

    var startPathFindingNode: PathFindingNode





                        for (index in startPathFindingNodeList!!.size() -1 downTo 0)


        {startPathFindingNode= startPathFindingNodeList!!.get(index) as PathFindingNode
pathList!!.remove(startPathFindingNode!!.geographicMapCellPosition)
pathList!!.add(0, startPathFindingNode!!.geographicMapCellPosition)
}

}


open fun isValid(graphPath: Any)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var graphPath = graphPath



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun getInvalidReason(graphPath: Any)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var graphPath = graphPath



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING
}


}
                
            

