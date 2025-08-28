
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

open public class RaceTrackGeographicMapCellTypes
            : Object
         {
        

        companion object {
            
    private val instance: RaceTrackGeographicMapCellTypes = RaceTrackGeographicMapCellTypes()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: RaceTrackGeographicMapCellTypes{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val BOTTOM_LEFT_TURN_ROAD_CELL_TYPE: RaceTrackGeographicMapCellType

    val BOTTOM_RIGHT_TURN_ROAD_CELL_TYPE: RaceTrackGeographicMapCellType

    val TOP_LEFT_TURN_ROAD_CELL_TYPE: RaceTrackGeographicMapCellType

    val TOP_RIGHT_TURN_ROAD_CELL_TYPE: RaceTrackGeographicMapCellType

    val HORIZONTAL_STRAIGHT_ROAD_CELL_TYPE: RaceTrackGeographicMapCellType

    val VERTICAL_STRAIGHT_ROAD_CELL_TYPE: RaceTrackGeographicMapCellType

    val START_LINE_ROAD_CELL_TYPE: RaceTrackGeographicMapCellType

    val DEFAULT_FINISH_LINE_ROAD_CELL_TYPE: RaceTrackGeographicMapCellType
public constructor        ()
            : super()
        {
BOTTOM_LEFT_TURN_ROAD_CELL_TYPE= RaceTrackGeographicMapCellType("Bottom Left Turn", 1, 1)
BOTTOM_RIGHT_TURN_ROAD_CELL_TYPE= RaceTrackGeographicMapCellType("Bottom Right Turn", 2, 1)
TOP_LEFT_TURN_ROAD_CELL_TYPE= RaceTrackGeographicMapCellType("Top Left Turn", 3, 1)
TOP_RIGHT_TURN_ROAD_CELL_TYPE= RaceTrackGeographicMapCellType("Top Right Turne", 4, 1)
HORIZONTAL_STRAIGHT_ROAD_CELL_TYPE= RaceTrackGeographicMapCellType("Horizontal Straight", 5, 1)
VERTICAL_STRAIGHT_ROAD_CELL_TYPE= RaceTrackGeographicMapCellType("Vertical Straight", 6, 1)
START_LINE_ROAD_CELL_TYPE= RaceTrackGeographicMapCellType("Start Line", 7, 1)
DEFAULT_FINISH_LINE_ROAD_CELL_TYPE= RaceTrackGeographicMapCellType("Finish Line", 8, 1)
}


}
                
            

