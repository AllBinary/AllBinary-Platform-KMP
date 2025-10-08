
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
        package org.allbinary.media.graphics.geography.map




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.graphics.color.BasicColor
import org.allbinary.layer.Layer

interface GeographicMapInterface {
        

    open fun getId()
        //nullable = true from not(false or (false and true)) = true
: Integer

    open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun reset()
        //nullable = true from not(false or (false and true)) = true


    open fun getAllBinaryTiledLayer()
        //nullable = true from not(false or (false and true)) = true
: AllBinaryTiledLayer

                @Throws(Exception::class)
            
    open fun getCellPositionsAt(layer: Layer, currentCellPositionArray: Array<Array<GeographicMapCellPosition?>?>, cellPositionArray: Array<Array<GeographicMapCellPosition?>?>)
        //nullable = true from not(false or (false and false)) = true
: Boolean

                @Throws(Exception::class)
            
    open fun getCellPositionAt(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: GeographicMapCellPosition

                @Throws(Exception::class)
            
    open fun getCellPositionAtNoThrow(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: GeographicMapCellPosition

    open fun getCellTypeFromMapCellTypeInt(cellTypeId: Int)
        //nullable = true from not(false or (false and false)) = true
: Int

                @Throws(Exception::class)
            
    open fun getCellTypeAt(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: GeographicMapCellType

                @Throws(Exception::class)
            
    open fun getCellTypeAt(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: GeographicMapCellType

    open fun getGeographicMapCellPositionFactory()
        //nullable = true from not(false or (false and true)) = true
: BasicGeographicMapCellPositionFactory

    open fun getGeographicMapCellPositionFactoryInterface()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellPositionFactoryInterface

    open fun getForegroundBasicColor()
        //nullable = true from not(false or (false and true)) = true
: BasicColor

    open fun getBackgroundBasicColor()
        //nullable = true from not(false or (false and true)) = true
: BasicColor

}
                
            

