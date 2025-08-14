
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
        package org.allbinary.media.graphics.geography.map.racetrack




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.media.graphics.geography.map.GeographicMapCellType
import org.allbinary.media.graphics.geography.map.GeographicMapCellTypeFactory

open public class RaceTrackGeographicMapCellTypeFactory : GeographicMapCellTypeFactory {
        

        companion object {
            
    private val instance: RaceTrackGeographicMapCellTypeFactory = RaceTrackGeographicMapCellTypeFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: RaceTrackGeographicMapCellTypeFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    var EMPTY_CELL_TYPE: GeographicMapCellType

    var EASY_CELL_TYPE: GeographicMapCellType

    val BOTTOM_LEFT_TURN_ROAD_CELL_TYPE: RaceTrackGeographicMapCellType

    val BOTTOM_RIGHT_TURN_ROAD_CELL_TYPE: RaceTrackGeographicMapCellType

    val TOP_LEFT_TURN_ROAD_CELL_TYPE: RaceTrackGeographicMapCellType

    val TOP_RIGHT_TURN_ROAD_CELL_TYPE: RaceTrackGeographicMapCellType

    val HORIZONTAL_STRAIGHT_ROAD_CELL_TYPE: RaceTrackGeographicMapCellType

    val VERTICAL_STRAIGHT_ROAD_CELL_TYPE: RaceTrackGeographicMapCellType

    val START_LINE_ROAD_CELL_TYPE: RaceTrackGeographicMapCellType

    val DEFAULT_FINISH_LINE_ROAD_CELL_TYPE: RaceTrackGeographicMapCellType

    var FINISH_LINE_ROAD_CELL_TYPE: RaceTrackGeographicMapCellType
public constructor        (){
    var raceTrackGeographicMapCellTypes: RaceTrackGeographicMapCellTypes = RaceTrackGeographicMapCellTypes.getInstance()!!
            

BOTTOM_LEFT_TURN_ROAD_CELL_TYPE= raceTrackGeographicMapCellTypes!!.BOTTOM_LEFT_TURN_ROAD_CELL_TYPE
BOTTOM_RIGHT_TURN_ROAD_CELL_TYPE= raceTrackGeographicMapCellTypes!!.BOTTOM_RIGHT_TURN_ROAD_CELL_TYPE
TOP_LEFT_TURN_ROAD_CELL_TYPE= raceTrackGeographicMapCellTypes!!.TOP_LEFT_TURN_ROAD_CELL_TYPE
TOP_RIGHT_TURN_ROAD_CELL_TYPE= raceTrackGeographicMapCellTypes!!.TOP_RIGHT_TURN_ROAD_CELL_TYPE
HORIZONTAL_STRAIGHT_ROAD_CELL_TYPE= raceTrackGeographicMapCellTypes!!.HORIZONTAL_STRAIGHT_ROAD_CELL_TYPE
VERTICAL_STRAIGHT_ROAD_CELL_TYPE= raceTrackGeographicMapCellTypes!!.VERTICAL_STRAIGHT_ROAD_CELL_TYPE
START_LINE_ROAD_CELL_TYPE= raceTrackGeographicMapCellTypes!!.START_LINE_ROAD_CELL_TYPE
DEFAULT_FINISH_LINE_ROAD_CELL_TYPE= raceTrackGeographicMapCellTypes!!.DEFAULT_FINISH_LINE_ROAD_CELL_TYPE
}


open fun getStartType()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.START_LINE_ROAD_CELL_TYPE.getType()
}


open fun getEndType()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.FINISH_LINE_ROAD_CELL_TYPE.getType()
}


open fun getEmptyType()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.EMPTY_CELL_TYPE.getType()
}


open fun isPath(cellType: GeographicMapCellType)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var cellType = cellType

    
                        if(cellType != this.EMPTY_CELL_TYPE && cellType != this.EASY_CELL_TYPE)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

