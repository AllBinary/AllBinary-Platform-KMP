
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
        package org.allbinary.game.layer



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.graphics.paint.PaintableInterface
import org.allbinary.layer.Layer
import org.allbinary.layer.NamedInterface
import org.allbinary.string.CommonStrings

open public class AllBinaryTiledLayer : Layer
                , NamedInterface
                , PaintableInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var cellWidth: Int

    private var cellHeight: Int

    private val halfWidth: Int

    private val halfHeight: Int

    private val halfCellWidth: Int

    private val halfCellHeight: Int

    private val dataId: Integer
public constructor        (dataId: Integer, width: Int, height: Int, cellWidth: Int, cellHeight: Int)                        

                            : super(0, 0){

                    var dataId = dataId


                    var width = width


                    var height = height


                    var cellWidth = cellWidth


                    var cellHeight = cellHeight


                            //For kotlin this is before the body of the constructor.
                    
this.dataId= dataId
this.setLayerWidth(width)
this.setLayerHeight(height)
super.setPosition(0, 0, 0)
this.cellWidth= cellWidth
this.cellHeight= cellHeight
this.halfWidth= (this.getWidth() shr 1)
this.halfHeight= (this.getHeight() shr 1)
this.halfCellWidth= (cellWidth shr 1)
this.halfCellHeight= (cellHeight shr 1)
}


open fun setCells(mapTwoDArray: Array<IntArray?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var mapTwoDArray = mapTwoDArray

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "Start: r: ")
stringBuffer!!.append(mapTwoDArray!!.size)
stringBuffer!!.append(
                            " c: ")
stringBuffer!!.append(mapTwoDArray[0]!!.length)
stringBuffer!!.append(
                            " rows: ")
stringBuffer!!.append(this.getRows())
stringBuffer!!.append(
                            " columns: ")
stringBuffer!!.append(this.getColumns())
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "setCells")

    var rows: Int = this.getRows()!!
            


    var columns: Int = this.getColumns()!!
            





                        for (col in 0 until columns)


        {



                        for (row in 0 until rows)


        {this.setCell(col, row, mapTwoDArray[row]!![col]!!)
}

}

}


open fun updateCells(mapTwoDArray: Array<IntArray?>, fromTileId: Int, toTileId: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var mapTwoDArray = mapTwoDArray


                    var fromTileId = fromTileId


                    var toTileId = toTileId

    var rows: Int = this.getRows()!!
            


    var columns: Int = this.getColumns()!!
            





                        for (col in 0 until columns)


        {



                        for (row in 0 until rows)


        {
    
                        if(fromTileId == mapTwoDArray[row]!![col])
                        
                                    {
                                    mapTwoDArray[row]!![col]= toTileId
this.setCell(col, row, mapTwoDArray[row]!![col]!!)

                                    }
                                
}

}

}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this::class.qualifiedName!!
}


open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
}


open fun paintThreed(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
}


open fun getX2()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.x +this.getWidth()
}


open fun getY2()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.y +this.getHeight()
}


open fun getZ2()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return (this.z +this.getDepth()).toInt()
}


open fun getCellWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cellWidth
}


open fun getCellHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cellHeight
}


open fun getCell(col: Int, row: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var col = col


                    var row = row



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}


open fun getColumns()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}


open fun getRows()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}


open fun setCell(col: Int, row: Int, tileIndex: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var col = col


                    var row = row


                    var tileIndex = tileIndex
}


open fun getHalfWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return halfWidth
}


open fun getHalfHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return halfHeight
}


open fun getDataId()
        //nullable = true from not(false or (false and true)) = true
: Integer{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return dataId
}


open fun getHalfCellWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return halfCellWidth
}


open fun getHalfCellHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return halfCellHeight
}


open fun isOnTileLayer(column: Int, row: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var column = column


                    var row = row

    
                        if(this.getColumns() > column && this.getRows() > row && row >= 0 && column >= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


open fun getAnimatedTile(animationTileIndex: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var animationTileIndex = animationTileIndex



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return animationTileIndex
}


}
                
            

