
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
        
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
interface PathFindingNodeCostInfoFactoryBaseInterface {
        

                @Throws(Exception::class)
            
open fun create(geographicMapInterface: BasicGeographicMap, comingFromGeographicMapCellPosition: GeographicMapCellPosition, geographicMapCellPosition: GeographicMapCellPosition, costFromStart: Long, costToEnd: Long)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
open fun getTotalCost(geographicMapInterface: BasicGeographicMap, comingFromGeographicMapCellPosition: GeographicMapCellPosition, geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: Long

}
                
            

