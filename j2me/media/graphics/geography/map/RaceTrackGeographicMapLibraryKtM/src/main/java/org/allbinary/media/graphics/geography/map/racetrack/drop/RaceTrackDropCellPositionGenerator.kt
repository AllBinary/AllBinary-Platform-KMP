
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
        package org.allbinary.media.graphics.geography.map.racetrack.drop




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListUtil
import org.allbinary.string.CommonStrings
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.GeographicMapCellHistory
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.drop.BaseDropCellPositionGenerator
import org.allbinary.media.graphics.geography.map.racetrack.BaseRaceTrackGeographicMap
import org.allbinary.media.graphics.geography.map.racetrack.RaceTrackGeographicMapCellType
import org.allbinary.media.graphics.geography.map.racetrack.RaceTrackGeographicMapCellTypeFactory
import org.allbinary.media.graphics.geography.map.racetrack.RaceTrackRoadsGeographicMapCellHistoryFactory
import org.allbinary.time.GameTickTimeDelayHelperFactory
import org.allbinary.time.TimeDelayHelper

open public class RaceTrackDropCellPositionGenerator : BaseDropCellPositionGenerator {
        

    val list: BasicArrayList = BasicArrayList()

    private val timeDelayHelper: TimeDelayHelper

    private val STRAIGHTAWAY: Int = 4

    var raceTrackGeographicMap: BaseRaceTrackGeographicMap

    var raceTrackGeographicMapCellTypeFactory: RaceTrackGeographicMapCellTypeFactory
protected constructor        (){timeDelayHelper= TimeDelayHelper(10000)
}


open fun init()
        //nullable = true from not(false or (false and true)) = true
{this.list.clear()
}


                @Throws(Exception::class)
            
open fun isDropAllowedAt(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var geographicMapCellPosition = geographicMapCellPosition

    var raceTrackGeographicMapCellType: RaceTrackGeographicMapCellType = raceTrackGeographicMap!!.getCellTypeAt(geographicMapCellPosition) as RaceTrackGeographicMapCellType


    
                        if(raceTrackGeographicMapCellType == raceTrackGeographicMapCellTypeFactory!!.HORIZONTAL_STRAIGHT_ROAD_CELL_TYPE || raceTrackGeographicMapCellType == raceTrackGeographicMapCellTypeFactory!!.VERTICAL_STRAIGHT_ROAD_CELL_TYPE)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            
open fun update(allBinaryGameLayerManager: AllBinaryGameLayerManager, geographicMapInterface: BasicGeographicMap)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryGameLayerManager = allBinaryGameLayerManager


                    var geographicMapInterface = geographicMapInterface
this.init()
this.raceTrackGeographicMap= geographicMapInterface as BaseRaceTrackGeographicMap
this.raceTrackGeographicMapCellTypeFactory= this.raceTrackGeographicMap!!.getGeographicMapCellTypeFactory() as RaceTrackGeographicMapCellTypeFactory

    var roadGeographicMapCellHistory: GeographicMapCellHistory = RaceTrackRoadsGeographicMapCellHistoryFactory.getInstance()!!


    var trackedList: BasicArrayList = roadGeographicMapCellHistory!!.getTracked()!!


    var geographicMapCellPosition: GeographicMapCellPosition


    var lastIndex: Int = trackedList!!.size() -1


    var total: Int= 0


    var ahead: Int= 0





                        for (index in lastIndex downTo 0)


        {geographicMapCellPosition= trackedList!!.get(index) as GeographicMapCellPosition
total= 0
ahead= index

        while(this.isDropAllowedAt(trackedList!!.get(ahead) as GeographicMapCellPosition))
        {total++

    
                        if(total > STRAIGHTAWAY)
                        
                                    {
                                    this.list.add(geographicMapCellPosition)
break;

                    

                                    }
                                
ahead++

    
                        if(ahead > lastIndex)
                        
                                    {
                                    break;

                    

                                    }
                                
}

}


    var size: Int = this.list.size()!!





                        for (index in size -1 downTo 0)


        {this.drop(allBinaryGameLayerManager, index)
}

}


    private val basicArrayListUtil: BasicArrayListUtil = BasicArrayListUtil.getInstance()!!

                @Throws(Exception::class)
            
open fun processTick(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryLayerManager = allBinaryLayerManager

    
                        if(timeDelayHelper!!.isTime(GameTickTimeDelayHelperFactory.getInstance()!!.startTime))
                        
                                    {
                                    
    var index: Int = basicArrayListUtil!!.getRandomIndex(this.list)!!

this.drop(allBinaryLayerManager, index)

                                    }
                                
}


                @Throws(Exception::class)
            
open fun drop(allBinaryLayerManager: AllBinaryLayerManager, index: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryLayerManager = allBinaryLayerManager


                    var index = index



                            throw Exception(CommonStrings.getInstance()!!.NOT_IMPLEMENTED)
}


}
                
            

