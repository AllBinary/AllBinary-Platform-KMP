
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.string.CommonStrings
import org.allbinary.media.graphics.geography.pathfinding.PathFindingNodeCostInfoData

open public class NormalRaceTrackGeographicMapCellTypeFactory : RaceTrackGeographicMapCellTypeFactory {
        

        companion object {


    private val instance: NormalRaceTrackGeographicMapCellTypeFactory = NormalRaceTrackGeographicMapCellTypeFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: NormalRaceTrackGeographicMapCellTypeFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            private constructor        (){this.EMPTY_CELL_TYPE= EmptyRaceRaceTrackGeographicMapCellTypeFactory.getInstance()!!.EMPTY_CELL_TYPE
this.EASY_CELL_TYPE= this.EMPTY_CELL_TYPE
this.FINISH_LINE_ROAD_CELL_TYPE= this.DEFAULT_FINISH_LINE_ROAD_CELL_TYPE
}


}
                
            

