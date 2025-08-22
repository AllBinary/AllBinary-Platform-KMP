
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
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.util.BasicArrayList
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.racetrack.RaceTrackGeographicMapInterfaceFactoryInterface
import org.allbinary.media.graphics.geography.map.racetrack.RaceTrackRoadsGeographicMapCellHistoryFactory
import org.allbinary.media.graphics.geography.map.racetrack.RaceTracksPathPrinter
import org.allbinary.media.graphics.geography.pathfinding.PathFindingInfo
import org.allbinary.media.graphics.geography.pathfinding.PathGenerator

open public class DynamicRaceTracksPathPrinter : RaceTracksPathPrinter {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

open fun printAllPaths(raceTrackGeographicMapInterfaceFactoryInterface: RaceTrackGeographicMapInterfaceFactoryInterface, pathFindingInfo: PathFindingInfo, size: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var raceTrackGeographicMapInterfaceFactoryInterface = raceTrackGeographicMapInterfaceFactoryInterface


                    var pathFindingInfo = pathFindingInfo


                    var size = size

        try {
            



                        for (index in 0 until size)


        {
    var geographicMapInterface: BasicGeographicMap = raceTrackGeographicMapInterfaceFactoryInterface!!.getTrackInstance(SmallIntegerSingletonFactory.getInstance()!!.getInstance(index))!!


    var list: BasicArrayList = PathGenerator.getInstance()!!.getInstance(geographicMapInterface, RaceTrackRoadsGeographicMapCellHistoryFactory.getInstance(), pathFindingInfo, 10)!!

System.out.println("Track " +index)
this.printPaths(list)
}

} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.PROCESS, e)
}

}


}
                
            

