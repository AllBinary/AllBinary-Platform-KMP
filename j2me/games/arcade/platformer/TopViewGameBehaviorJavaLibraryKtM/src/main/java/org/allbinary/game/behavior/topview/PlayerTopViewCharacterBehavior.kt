
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
        
import org.allbinary.direction.Direction
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.game.tracking.TrackingEventCircularStaticPool
import org.allbinary.game.tracking.TrackingEventHandler
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.string.CommonSeps
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.BasicGeographicMapUtil
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.view.ViewPosition

open public class PlayerTopViewCharacterBehavior : TopViewCharacterBehavior {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

                @Throws(Exception::class)
            
open fun terrainEvent(layer: AllBinaryLayer, direction: Direction, x: Int, y: Int, geographicMapInterfaceArray: Array<BasicGeographicMap?>, geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
{
    //var layer = layer
    //var direction = direction
    //var x = x
    //var y = y
    //var geographicMapInterfaceArray = geographicMapInterfaceArray
    //var geographicMapCellPosition = geographicMapCellPosition
TrackingEventHandler.getInstance()!!.fireEvent(TrackingEventCircularStaticPool.getInstance()!!.getInstance(layer))
}


open fun terrainMove(layer: AllBinaryLayer, geographicMapInterfaceArray: Array<BasicGeographicMap?>, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var layer = layer
    //var geographicMapInterfaceArray = geographicMapInterfaceArray
    //var x = x
    //var y = y

    var basicGeographicMapUtil: BasicGeographicMapUtil = BasicGeographicMapUtil.getInstance()!!

basicGeographicMapUtil!!.setPosition(geographicMapInterfaceArray, x, y)
}


open fun moveIfOnScreen(layer: AllBinaryLayer, ax: Int, ay: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var layer = layer
    //var ax = ax
    //var ay = ay
}


open fun isTiledLayerMoveable(terrainTiledLayer: AllBinaryTiledLayer, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var terrainTiledLayer = terrainTiledLayer
    //var x = x
    //var y = y



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return (terrainTiledLayer!!.getXP() +DisplayInfoSingleton.getInstance()!!.getLastWidth() < terrainTiledLayer!!.getWidth() || x < 0) && (terrainTiledLayer!!.getXP() > 0 || x > 0)
}


}
                
            

