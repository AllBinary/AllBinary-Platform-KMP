
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        package org.allbinary.game.behavior.topview




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.GeographicMapCellType
interface TopViewCharacterInterface {
        

open fun terrainMove(geographicMapInterfaceArray: Array<BasicGeographicMap?>, geographicMapCellTypeArray: Array<GeographicMapCellType?>, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
open fun terrainEvent(x: Int, y: Int, geographicMapInterfaceArray: Array<BasicGeographicMap?>, geographicMapCellTypeArray: Array<GeographicMapCellType?>, geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true


open fun move()
        //nullable = true from not(false or (false and true)) = true


open fun upp()
        //nullable = true from not(false or (false and true)) = true


open fun leftp()
        //nullable = true from not(false or (false and true)) = true


open fun rightp()
        //nullable = true from not(false or (false and true)) = true


                @Throws(Exception::class)
            
open fun reset()
        //nullable = true from not(false or (false and true)) = true


}
                
            

