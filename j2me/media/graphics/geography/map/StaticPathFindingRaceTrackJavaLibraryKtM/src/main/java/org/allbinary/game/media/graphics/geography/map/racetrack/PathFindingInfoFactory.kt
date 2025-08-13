
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
        
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.racetrack.BasePathFindingInfoFactory
import org.allbinary.media.graphics.geography.map.racetrack.RaceTrackRoadsGeographicMapCellHistoryFactory
import org.allbinary.media.graphics.geography.pathfinding.PathFindingInfo

open public class PathFindingInfoFactory : BasePathFindingInfoFactory {
        

        companion object {
            
    private val instance: PathFindingInfoFactory = PathFindingInfoFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PathFindingInfoFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        (){}


                @Throws(Exception::class)
            
open fun getInstance(geographicMapInterface: BasicGeographicMap, graphArray: Array<IntArray?>)
        //nullable =  from not(true or (false and false)) = 
: PathFindingInfo{

                    var geographicMapInterface = geographicMapInterface


                    var graphArray = graphArray

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

PreLogUtil.put(commonStrings!!.START, this, commonStrings!!.GET_INSTANCE)

    var pathFindingInfo: PathFindingInfo = PathFindingInfo(
                            null)

RaceTrackRoadsGeographicMapCellHistoryFactory.getInstance()!!.init()
this.init(geographicMapInterface, pathFindingInfo, graphArray)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return pathFindingInfo
}


}
                
            

