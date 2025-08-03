
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.graphics.color.BasicColor
import org.allbinary.string.CommonStrings

open public class SimpleGeographicMap
            : Object
         {
        

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val id: Integer

    private val name: String

    val cellTypeIdToGeographicMapCellType: IntArray

    private val tiledLayer: AllBinaryTiledLayer

    private var foregroundBasicColor: BasicColor

    private var backgroundBasicColor: BasicColor
public constructor        (id: Integer, name: String, cellTypeIdToGeographicMapCellType: IntArray, tiledLayer: AllBinaryTiledLayer, foregroundBasicColor: BasicColor, backgroundBasicColor: BasicColor)
            : super()
        {

                    var id = id


                    var name = name


                    var cellTypeIdToGeographicMapCellType = cellTypeIdToGeographicMapCellType


                    var tiledLayer = tiledLayer


                    var foregroundBasicColor = foregroundBasicColor


                    var backgroundBasicColor = backgroundBasicColor
this.id= id
this.name= name
this.cellTypeIdToGeographicMapCellType= cellTypeIdToGeographicMapCellType
this.tiledLayer= tiledLayer
this.setBackgroundBasicColor(backgroundBasicColor)
this.setForegroundBasicColor(foregroundBasicColor)
}


open fun getId()
        //nullable = true from not(false or (false and true)) = true
: Integer{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return id
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return name
}


open fun reset()
        //nullable = true from not(false or (false and true)) = true
{}


open fun getAllBinaryTiledLayer()
        //nullable = true from not(false or (false and true)) = true
: AllBinaryTiledLayer{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return tiledLayer
}


    private val geographicMapCellTypeFactory: GeographicMapCellTypeFactory = GeographicMapCellTypeFactory.getInstance()!!
            

                @Throws(Exception::class)
            
open fun getCellTypeAt(cellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: GeographicMapCellType{

                    var cellPosition = cellPosition

    var i_column: Int = cellPosition!!.getColumn()!!
            


    var i_row: Int = cellPosition!!.getRow()!!
            


    var cellTypeId: Int = this.tiledLayer!!.getCell(i_column, i_row)!!
            


    
                        if(cellTypeId < 0)
                        
                                    {
                                    cellTypeId= this.tiledLayer!!.getAnimatedTile(cellTypeId)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.geographicMapCellTypeFactory!!.getInstance(this.cellTypeIdToGeographicMapCellType[cellTypeId]!!)
}


open fun getCellTypeFromMapCellTypeInt(cellTypeId: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var cellTypeId = cellTypeId



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.cellTypeIdToGeographicMapCellType[cellTypeId]!!
}


open fun getForegroundBasicColor()
        //nullable = true from not(false or (false and true)) = true
: BasicColor{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return foregroundBasicColor
}


open fun setForegroundBasicColor(foregroundBasicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{

                    var foregroundBasicColor = foregroundBasicColor
this.foregroundBasicColor= foregroundBasicColor
}


open fun getBackgroundBasicColor()
        //nullable = true from not(false or (false and true)) = true
: BasicColor{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return backgroundBasicColor
}


open fun setBackgroundBasicColor(backgroundBasicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{

                    var backgroundBasicColor = backgroundBasicColor
this.backgroundBasicColor= backgroundBasicColor
}


}
                
            

