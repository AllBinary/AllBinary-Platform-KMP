
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.GeographicMapCellHistory
import org.allbinary.util.BasicArrayList

open public class PathGenerator
            : Object
         {
        

        companion object {
            
    private val SINGLETON: PathGenerator = PathGenerator()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PathGenerator{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            private constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun init(geographicMapInterface: BasicGeographicMap, totalPaths: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var geographicMapInterface = geographicMapInterface


                    var totalPaths = totalPaths
}


                @Throws(Exception::class)
            
open fun getInstanceNoCache(geographicMapInterface: BasicGeographicMap, pathFindingInfo: PathFindingInfo, totalPaths: Int)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var geographicMapInterface = geographicMapInterface


                    var pathFindingInfo = pathFindingInfo


                    var totalPaths = totalPaths

    var geographicMapCellPositionBasicArrayList: BasicArrayList = this.create(geographicMapInterface, pathFindingInfo, totalPaths)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellPositionBasicArrayList
}


                @Throws(Exception::class)
            
open fun getInstance(geographicMapInterface: BasicGeographicMap, geographicMapCellHistory: GeographicMapCellHistory, pathFindingInfo: PathFindingInfo, totalPaths: Int)
        //nullable =  from not(true or (false and false)) = 
: BasicArrayList{

                    var geographicMapInterface = geographicMapInterface


                    var geographicMapCellHistory = geographicMapCellHistory


                    var pathFindingInfo = pathFindingInfo


                    var totalPaths = totalPaths



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
open fun create(geographicMapInterface: BasicGeographicMap, pathFindingInfo: PathFindingInfo, totalPaths: Int)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var geographicMapInterface = geographicMapInterface


                    var pathFindingInfo = pathFindingInfo


                    var totalPaths = totalPaths

    var startPathFindingNodeList: BasicArrayList = pathFindingInfo!!.getStartPathFindingNodeList()!!
            


    var endPathFindingNodeList: BasicArrayList = pathFindingInfo!!.getEndPathFindingNodeList()!!
            


    var geographicPathFinderInterface: GeographicPathFinderBase = pathFindingInfo!!.getPathFinder()!!
            


    var geographicMapCellPositionBasicArrayList: BasicArrayList = geographicPathFinderInterface!!.search(startPathFindingNodeList, endPathFindingNodeList, totalPaths)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellPositionBasicArrayList
}


                @Throws(Exception::class)
            
open fun createN(geographicMapInterface: BasicGeographicMap, pathFindingInfo: PathFindingInfo, totalPaths: Int, multipassState: MultipassState)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var geographicMapInterface = geographicMapInterface


                    var pathFindingInfo = pathFindingInfo


                    var totalPaths = totalPaths


                    var multipassState = multipassState

    var startPathFindingNodeList: BasicArrayList = pathFindingInfo!!.getStartPathFindingNodeList()!!
            


    var endPathFindingNodeList: BasicArrayList = pathFindingInfo!!.getEndPathFindingNodeList()!!
            


    var geographicPathFinderInterface: GeographicPathFinderBase = pathFindingInfo!!.getPathFinder()!!
            


    var geographicMapCellPositionBasicArrayList: BasicArrayList = geographicPathFinderInterface!!.searchN(startPathFindingNodeList, endPathFindingNodeList, totalPaths, multipassState)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellPositionBasicArrayList
}


                @Throws(Exception::class)
            
open fun isValid(pathList: BasicArrayList, geographicMapCellHistory: GeographicMapCellHistory)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var pathList = pathList


                    var geographicMapCellHistory = geographicMapCellHistory



                            throw RuntimeException()
}


}
                
            

