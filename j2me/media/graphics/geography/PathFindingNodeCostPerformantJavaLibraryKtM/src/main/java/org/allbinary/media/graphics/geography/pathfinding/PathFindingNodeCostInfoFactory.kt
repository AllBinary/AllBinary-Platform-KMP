
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
import org.allbinary.media.graphics.geography.map.GeographicMapCellType
import org.allbinary.media.graphics.geography.map.racetrack.RaceTrackGeographicMapCellType

open public class PathFindingNodeCostInfoFactory : PathFindingNodeCostInfoFactoryBase {
        
public constructor        (max: Int){

                    var max = max
}


                @Throws(Exception::class)
            override fun create(geographicMapInterface: BasicGeographicMap, goingToGeographicMapCellPosition: GeographicMapCellPosition, geographicMapCellPosition: GeographicMapCellPosition, costFromStart: Long, costToEnd: Long)
        //nullable = true from not(false or (false and false)) = true
{

                    var geographicMapInterface = geographicMapInterface


                    var goingToGeographicMapCellPosition = goingToGeographicMapCellPosition


                    var geographicMapCellPosition = geographicMapCellPosition


                    var costFromStart = costFromStart


                    var costToEnd = costToEnd
}


                @Throws(Exception::class)
            override fun getTotalCost(geographicMapInterface: BasicGeographicMap, comingFromGeographicMapCellPosition: GeographicMapCellPosition, geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: Long{

                    var geographicMapInterface = geographicMapInterface


                    var comingFromGeographicMapCellPosition = comingFromGeographicMapCellPosition


                    var geographicMapCellPosition = geographicMapCellPosition

    var geographicMapCellType: GeographicMapCellType = geographicMapInterface!!.getCellTypeAt(comingFromGeographicMapCellPosition)!!
            


    var geographicMapCellType2: GeographicMapCellType = geographicMapInterface!!.getCellTypeAt(geographicMapCellPosition)!!
            


    var raceTrackGeographicMapCellType: RaceTrackGeographicMapCellType = geographicMapCellType as RaceTrackGeographicMapCellType


    var raceTrackGeographicMapCellType2: RaceTrackGeographicMapCellType = geographicMapCellType2 as RaceTrackGeographicMapCellType




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return raceTrackGeographicMapCellType!!.getTravelCost() +raceTrackGeographicMapCellType2!!.getTravelCost()
}


}
                
            

