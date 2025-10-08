
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
        
import org.allbinary.util.BasicArrayList

open public class PathFindingInfo
            : Object
        
                , PathFindingInfoInterface {
        

    private var pathFinder: GeographicPathFinderBase

    private val startPathFindingNodeList: BasicArrayList

    private val endPathFindingNodeList: BasicArrayList

    private val pathFindingNodeCostInfoFactoryInterface: PathFindingNodeCostInfoFactoryBase
public constructor (pathFindingNodeCostInfoFactoryInterface: PathFindingNodeCostInfoFactoryBase)
            : super()
        {
    //var pathFindingNodeCostInfoFactoryInterface = pathFindingNodeCostInfoFactoryInterface
this.pathFindingNodeCostInfoFactoryInterface= pathFindingNodeCostInfoFactoryInterface
this.startPathFindingNodeList= BasicArrayList(1)
this.endPathFindingNodeList= BasicArrayList(1)
}


    open fun getStartPathFindingNodeList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.startPathFindingNodeList
}


    open fun getEndPathFindingNodeList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.endPathFindingNodeList
}


    open fun getPathFinder()
        //nullable = true from not(false or (false and true)) = true
: GeographicPathFinderBase{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.pathFinder
}


    open fun addStartPathFindingNode(startPathFindingNode: PathFindingNode)
        //nullable = true from not(false or (false and false)) = true
{
var startPathFindingNode = startPathFindingNode
this.startPathFindingNodeList!!.add(startPathFindingNode)
}


    open fun addEndPathFindingNode(endPathFindingNode: PathFindingNode)
        //nullable = true from not(false or (false and false)) = true
{
var endPathFindingNode = endPathFindingNode
this.endPathFindingNodeList!!.add(endPathFindingNode)
}


    open fun setPathFinder(pathFinder: GeographicPathFinderBase)
        //nullable = true from not(false or (false and false)) = true
{
var pathFinder = pathFinder
this.pathFinder= pathFinder
}


    open fun getPathFindingNodeCostInfoFactoryInterface()
        //nullable = true from not(false or (false and true)) = true
: PathFindingNodeCostInfoFactoryBase{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return pathFindingNodeCostInfoFactoryInterface
}


}
                
            

