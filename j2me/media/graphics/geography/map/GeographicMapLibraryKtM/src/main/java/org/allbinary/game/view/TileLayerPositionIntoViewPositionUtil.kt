
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
        package org.allbinary.game.view




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.view.TileLayerPositionIntoViewPosition
import org.allbinary.game.displayable.canvas.AllBinaryGameCanvas
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.GeographicMapCompositeInterface

open public class TileLayerPositionIntoViewPositionUtil
            : Object
         {
        
companion object {
            
    open fun init(gameCanvasInterface: AllBinaryGameCanvas, viewPosition: TileLayerPositionIntoViewPosition)
        //nullable = true from not(false or (false and false)) = true
{
    //var gameCanvasInterface = gameCanvasInterface
    //var viewPosition = viewPosition

    var geographicMapCompositeInterface: GeographicMapCompositeInterface = gameCanvasInterface!!.getLayerManager() as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!


    var tiledLayer: AllBinaryTiledLayer = geographicMapInterface!!.getAllBinaryTiledLayer()!!

viewPosition!!.setTiledLayer(tiledLayer)
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

