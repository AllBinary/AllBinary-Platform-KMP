
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
        
import org.allbinary.util.BasicArrayList
import org.allbinary.media.graphics.geography.map.BasicGeographicMap

open public class PathFinderGraphHackVisitor : BasePathFinderGraphVisitor {
        
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
            
open fun visit(graph: Any, startPathFindingNodeList: BasicArrayList, endPathFindingNodeList: BasicArrayList)
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
            
open fun fixStart(graph: Any, startPathFindingNodeList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graph = graph
var startPathFindingNodeList = startPathFindingNodeList
}


                @Throws(Exception::class)
            
open fun fixEnd(graph: Any, endPathFindingNodeList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graph = graph
var endPathFindingNodeList = endPathFindingNodeList
}


                @Throws(Exception::class)
            
open fun fixOverPassEdges(graph: Any)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graph = graph
}


                @Throws(Exception::class)
            
open fun fixPath(startPathFindingNodeList: BasicArrayList, endPathFindingNodeList: BasicArrayList, pathList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var startPathFindingNodeList = startPathFindingNodeList
var endPathFindingNodeList = endPathFindingNodeList
var pathList = pathList
}


                @Throws(Exception::class)
            
open fun removeOverPassEdges(pathList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var pathList = pathList
}


open fun isValid(graphPath: Any)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
var graphPath = graphPath



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

