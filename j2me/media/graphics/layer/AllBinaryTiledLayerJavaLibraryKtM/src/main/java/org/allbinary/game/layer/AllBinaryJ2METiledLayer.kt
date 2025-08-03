
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
        
import javax.microedition.lcdui.Font
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.game.TiledLayer
import org.allbinary.string.CommonSeps
import org.allbinary.logic.string.StringMaker

open public class AllBinaryJ2METiledLayer : AllBinaryTiledLayer {
        

    val tiledLayer: TiledLayer

    val debugColor: Int
public constructor        (dataId: Integer, tiledLayer: TiledLayer, mapTwoDArray: Array<IntArray?>, debugColor: Int)                        

                            : super(dataId, tiledLayer!!.getWidth(), tiledLayer!!.getHeight(), tiledLayer!!.getCellWidth(), tiledLayer!!.getCellHeight()){

                    var dataId = dataId


                    var tiledLayer = tiledLayer


                    var mapTwoDArray = mapTwoDArray


                    var debugColor = debugColor


                            //For kotlin this is before the body of the constructor.
                    
this.tiledLayer= tiledLayer
this.debugColor= debugColor
this.setCells(mapTwoDArray)
}


open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
this.tiledLayer!!.paint(graphics)
}


    val font2: Font = Font.getFont(Font.FACE_SYSTEM, Font.STYLE_PLAIN, 4)!!
            

open fun paintDebug(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics

    var font: Font = graphics!!.getFont()!!
            

graphics!!.setFont(font2)
graphics!!.setColor(debugColor)

    var x: Int = this.tiledLayer!!.getX()!!
            


    var y: Int = this.tiledLayer!!.getY()!!
            


    var firstColumn: Int = 0


    var firstRow: Int = 0


    var totalColumns: Int = this.tiledLayer!!.getColumns()!!
            


    var totalRows: Int = this.tiledLayer!!.getRows()!!
            


    var x0: Int = x


    var tile: Int = 0


    var tileHeight: Int = this.tiledLayer!!.getCellHeight()!!
            


    var tileWidth: Int = this.tiledLayer!!.getCellWidth()!!
            


    var commonSeps: CommonSeps = CommonSeps.getInstance()!!
            


    var stringMaker: StringMaker = StringMaker()





                        for (rowIndex in firstRow until totalRows)


        {x= x0




                        for (columnIndex in firstColumn until totalColumns)


        {tile= this.tiledLayer!!.getCell(columnIndex, rowIndex)

    
                        if(tile < 0)
                        
                                    {
                                    tile= this.tiledLayer!!.getAnimatedTile(tile)

                                    }
                                

    
                        if(tile == 0)
                        
                                    {
                                    

                        continue
                    

                                    }
                                
tile--
stringMaker!!.delete(0, stringMaker!!.length())
graphics!!.drawString(stringMaker!!.append(columnIndex)!!.append(commonSeps!!.COMMA)!!.append(rowIndex)!!.append(commonSeps!!.COLON)!!.append(tile)!!.toString(), x +5, y +10, 0)
}

}

graphics!!.setFont(font)
}


open fun move(dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var dx = dx


                    var dy = dy
this.tiledLayer!!.move(dx, dy)
super.move( -dx,  -dy)
}


open fun setPosition(x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var x = x


                    var y = y


                    var z = z
this.tiledLayer!!.setPosition(x, y)
super.setPosition( -x,  -y, z)
}


open fun getTiledLayer()
        //nullable = true from not(false or (false and true)) = true
: TiledLayer{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return tiledLayer
}


open fun getCellWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.tiledLayer!!.getCellWidth()
}


open fun getCellHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.tiledLayer!!.getCellHeight()
}


open fun getCell(col: Int, row: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var col = col


                    var row = row



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.tiledLayer!!.getCell(col, row)
}


open fun getColumns()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.tiledLayer!!.getColumns()
}


open fun getRows()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.tiledLayer!!.getRows()
}


open fun setCell(col: Int, row: Int, index: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var col = col


                    var row = row


                    var index = index
this.tiledLayer!!.setCell(col, row, index)
}


open fun getAnimatedTile(animationTileIndex: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var animationTileIndex = animationTileIndex



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.tiledLayer!!.getAnimatedTile(animationTileIndex)
}


}
                
            

