
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.displayable.canvas.AllBinaryGameCanvas
import org.allbinary.game.displayable.canvas.AllBinaryGameCanvasInterface
import org.allbinary.layer.AllBinaryLayer

open public class GeographicMapCellPositionTracking
            : Object
         {
        

    private var currentGeographicMapCellPosition: GeographicMapCellPosition = SimpleGeographicMapCellPositionFactory.NULL_GEOGRAPHIC_MAP_CELL_POSITION

    private var previousGeographicMapCellPosition: GeographicMapCellPosition = SimpleGeographicMapCellPositionFactory.NULL_GEOGRAPHIC_MAP_CELL_POSITION

    private var newGeographicMapCellPosition: GeographicMapCellPosition = SimpleGeographicMapCellPositionFactory.NULL_GEOGRAPHIC_MAP_CELL_POSITION

    private var currentCellType: GeographicMapCellType = GeographicMapCellType.NULL_GEOGRAPHIC_MAP_CELL_TYPE
public constructor ()
            : super()
        {
}


                @Throws(Exception::class)
            
    open fun getCurrentOverCellType(geographicMap: BasicGeographicMap)
        //nullable = true from not(false or (false and false)) = true
: GeographicMapCellType{
    //var geographicMap = geographicMap

    var geographicMapCellPosition: GeographicMapCellPosition = this.currentGeographicMapCellPosition


    
                        if(geographicMapCellPosition != this.previousGeographicMapCellPosition)
                        
                                    {
                                    this.currentCellType= geographicMap!!.getCellTypeAt(geographicMapCellPosition)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.currentCellType
}


                @Throws(Exception::class)
            
    open fun updateStart(gameCanvasInterface: AllBinaryGameCanvasInterface, layer: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var gameCanvasInterface = gameCanvasInterface
    //var layer = layer

    
                        if(gameCanvasInterface != SimpleGeographicMapCellPositionFactory.NULL_GEOGRAPHIC_MAP_CELL_POSITION)
                        
                                    {
                                    
    var geographicMapCompositeInterface: GeographicMapCompositeInterface = gameCanvasInterface!!.getLayerManager() as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!

this.newGeographicMapCellPosition= geographicMapInterface!!.getCellPositionAt(layer.getXP() +layer.getHalfWidth(), layer.getYP() +layer.getHalfHeight())

    
                        if(this.newGeographicMapCellPosition != this.currentGeographicMapCellPosition)
                        
                                    {
                                    this.currentGeographicMapCellPosition= this.newGeographicMapCellPosition



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun updateEnd()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

    
                        if(this.currentGeographicMapCellPosition != this.previousGeographicMapCellPosition)
                        
                                    {
                                    this.previousGeographicMapCellPosition= this.currentGeographicMapCellPosition



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun getPreviousGeographicMapCellPosition()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellPosition{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return previousGeographicMapCellPosition
}


    open fun getCurrentGeographicMapCellPosition()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellPosition{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return currentGeographicMapCellPosition
}


}
                
            

