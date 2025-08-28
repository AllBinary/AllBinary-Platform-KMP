
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
        package org.allbinary.game.layer.geological.resources




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.GeographicMapCellPositionFactoryInitVisitorInterface

open public class GeologicalGeographicMapCellPositionFactoryInitVisitor
            : Object
        
                , GeographicMapCellPositionFactoryInitVisitorInterface {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            
open fun visit(tiledLayer: AllBinaryTiledLayer, cellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var tiledLayer = tiledLayer
var cellPosition = cellPosition
cellPosition = cellPositioncellPosition as GeologicalGeographicMapCellPosition
cellPosition.
                    getGeologicalResource()!!.init()
}


}
                
            

