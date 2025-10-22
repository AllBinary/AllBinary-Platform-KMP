
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
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Image
import javax.microedition.lcdui.NullCanvas
import org.allbinary.graphics.CellPosition
import org.allbinary.logic.NullUtil

open public class RaceTrackData
            : Object
         {
        

    private var tileSetImage: Image = NullCanvas.NULL_IMAGE

    private var miniTileSetImage: Image = NullCanvas.NULL_IMAGE

    private var cellWidth: Int = 0

    private var cellHeight: Int = 0

    private var miniCellWidth: Int = 0

    private var miniCellHeight: Int = 0

    private var mapArray: Array<IntArray?> = NullUtil.getInstance()!!.NULL_INT_ARRAY_ARRAY

    private var cellTypeIdToGeographicMapCellTypeArray: IntArray = NullUtil.getInstance()!!.NULL_INT_ARRAY

    private var NO_OVER_PASSES_ARRAY: Array<CellPosition?> = arrayOfNulls(0)

    private var overPassGeographicMapCellPositionArray: Array<CellPosition?> = NO_OVER_PASSES_ARRAY

    private var id: Integer
public constructor (id: Integer, cellWidth: Int, cellHeight: Int, miniCellWidth: Int, miniCellHeight: Int)                        

                            : this(id, cellWidth, cellHeight, miniCellWidth, miniCellHeight, NullUtil.getInstance()!!.NULL_INT_ARRAY, NullUtil.getInstance()!!.NULL_INT_ARRAY_ARRAY){
    //var id = id
    //var cellWidth = cellWidth
    //var cellHeight = cellHeight
    //var miniCellWidth = miniCellWidth
    //var miniCellHeight = miniCellHeight


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor (id: Integer, cellWidth: Int, cellHeight: Int, miniCellWidth: Int, miniCellHeight: Int, cellTypeIdToGeographicMapCellTypeArray: IntArray, mapArray: Array<IntArray?>)
            : super()
        {
    //var id = id
    //var cellWidth = cellWidth
    //var cellHeight = cellHeight
    //var miniCellWidth = miniCellWidth
    //var miniCellHeight = miniCellHeight
    //var cellTypeIdToGeographicMapCellTypeArray = cellTypeIdToGeographicMapCellTypeArray
    //var mapArray = mapArray
this.id= id
this.cellWidth= cellWidth
this.cellHeight= cellHeight
this.miniCellWidth= miniCellWidth
this.miniCellHeight= miniCellHeight
this.mapArray= mapArray
this.cellTypeIdToGeographicMapCellTypeArray= cellTypeIdToGeographicMapCellTypeArray
}


    open fun setMapArray(mapArray: Array<IntArray?>)
        //nullable = true from not(false or (false and false)) = true
{
var mapArray = mapArray
this.mapArray= mapArray
}


    open fun getMapArray()
        //nullable = true from not(false or (false and true)) = true
: Array<IntArray?>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return mapArray
}


    open fun setCellTypeIdToGeographicMapCellTypeArray(cellTypeIdToGeographicMapCellTypeArray: IntArray)
        //nullable = true from not(false or (false and false)) = true
{
var cellTypeIdToGeographicMapCellTypeArray = cellTypeIdToGeographicMapCellTypeArray
this.cellTypeIdToGeographicMapCellTypeArray= cellTypeIdToGeographicMapCellTypeArray
}


    open fun getCellTypeIdToGeographicMapCellTypeArray()
        //nullable = true from not(false or (false and true)) = true
: IntArray{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cellTypeIdToGeographicMapCellTypeArray
}


    open fun setCellWidth(cellWidth: Int)
        //nullable = true from not(false or (false and false)) = true
{
var cellWidth = cellWidth
this.cellWidth= cellWidth
}


    open fun getCellWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cellWidth
}


    open fun setCellHeight(cellHeight: Int)
        //nullable = true from not(false or (false and false)) = true
{
var cellHeight = cellHeight
this.cellHeight= cellHeight
}


    open fun getCellHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cellHeight
}


    open fun getOverPassGeographicMapCellPositionArray()
        //nullable = true from not(false or (false and true)) = true
: Array<CellPosition?>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return overPassGeographicMapCellPositionArray
}


    open fun setOverPassGeographicMapCellPositionArray(overPassGeographicMapCellPositionArray: Array<CellPosition?>)
        //nullable = true from not(false or (false and false)) = true
{
var overPassGeographicMapCellPositionArray = overPassGeographicMapCellPositionArray
this.overPassGeographicMapCellPositionArray= overPassGeographicMapCellPositionArray
}


    open fun getTileSetImage()
        //nullable = true from not(false or (false and true)) = true
: Image{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return tileSetImage
}


    open fun setTileSetImage(tileSetImage: Image)
        //nullable = true from not(false or (false and false)) = true
{
var tileSetImage = tileSetImage
this.tileSetImage= tileSetImage
}


    open fun getMiniTileSetImage()
        //nullable = true from not(false or (false and true)) = true
: Image{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return miniTileSetImage
}


    open fun setMiniTileSetImage(miniTileSetImage: Image)
        //nullable = true from not(false or (false and false)) = true
{
var miniTileSetImage = miniTileSetImage
this.miniTileSetImage= miniTileSetImage
}


    open fun getMiniCellWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return miniCellWidth
}


    open fun setMiniCellWidth(miniCellWidth: Int)
        //nullable = true from not(false or (false and false)) = true
{
var miniCellWidth = miniCellWidth
this.miniCellWidth= miniCellWidth
}


    open fun getMiniCellHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return miniCellHeight
}


    open fun setMiniCellHeight(miniCellHeight: Int)
        //nullable = true from not(false or (false and false)) = true
{
var miniCellHeight = miniCellHeight
this.miniCellHeight= miniCellHeight
}


    open fun setId(id: Integer)
        //nullable = true from not(false or (false and false)) = true
{
var id = id
this.id= id
}


    open fun getId()
        //nullable = true from not(false or (false and true)) = true
: Integer{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return id
}


}
                
            

