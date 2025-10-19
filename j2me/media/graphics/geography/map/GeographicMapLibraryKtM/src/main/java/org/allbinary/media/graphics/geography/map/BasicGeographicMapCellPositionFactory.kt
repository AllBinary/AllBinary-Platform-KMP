
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
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.logic.string.StringMaker

open public class BasicGeographicMapCellPositionFactory
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val geographicMapCellPositionArray: Array<Array<GeographicMapCellPosition?>?>

    val geographicMapInterface: BasicGeographicMap

    val geographicMapCellPositionFactoryInterface: GeographicMapCellPositionFactoryInterface

    private val columns: Int

    private val rows: Int

    private val tiledLayer: AllBinaryTiledLayer
public constructor (geographicMapInterface: BasicGeographicMap)
            : super()
        {
    //var geographicMapInterface = geographicMapInterface
this.geographicMapInterface= geographicMapInterface
this.geographicMapCellPositionFactoryInterface= this.geographicMapInterface!!.getGeographicMapCellPositionFactoryInterface()
this.tiledLayer= this.geographicMapInterface!!.getAllBinaryTiledLayer()
this.columns= this.tiledLayer!!.getColumns()
this.rows= this.tiledLayer!!.getRows()
this.geographicMapCellPositionArray= Array(rows) { arrayOfNulls<GeographicMapCellPosition?>(columns) }
                                                            
this.init()
}


                @Throws(Exception::class)
            
    open fun init()
        //nullable = true from not(false or (false and true)) = true
{

    var tiledLayer: AllBinaryTiledLayer = this.tiledLayer


    var columns: Int = this.getColumns()!!


    var rows: Int = this.getRows()!!


    var width: Int = tiledLayer!!.getCellWidth()!!


    var height: Int = tiledLayer!!.getCellHeight()!!





                        for (column in 0 until columns)

        {




                        for (row in 0 until rows)

        {
this.createInstance(column, row, width, height)
}

}

}


                @Throws(Exception::class)
            
    open fun visit(geographicMapCelPositionFactoryInitVisitorInterface: GeographicMapCellPositionFactoryInitVisitorInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var geographicMapCelPositionFactoryInitVisitorInterface = geographicMapCelPositionFactoryInitVisitorInterface

    var tiledLayer: AllBinaryTiledLayer = this.tiledLayer


    var columns: Int = this.getColumns()!!


    var rows: Int = this.getRows()!!


        try {
            
    var cellPosition: GeographicMapCellPosition





                        for (column in 0 until columns)

        {




                        for (row in 0 until rows)

        {
cellPosition= this.getInstance(column, row)
geographicMapCelPositionFactoryInitVisitorInterface!!.visit(tiledLayer, cellPosition)
}

}

} catch(e: Exception)
            {
logUtil!!.put(StringMaker().
                            append("[")!!.append(rows)!!.append("][")!!.append(columns)!!.append("]")!!.toString(), this, "visit", e)



                            throw e
}

}


                @Throws(Exception::class)
            
    open fun getInstance(i_column: Int, i_row: Int)
        //nullable =  from not(true or (false and false)) = 
: GeographicMapCellPosition{
    //var i_column = i_column
    //var i_row = i_row



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellPositionArray[i_row]!![i_column]!!
}


                @Throws(Exception::class)
            
    open fun getInstance(anotherMapGeographicMapCellPosition: GeographicMapCellPosition)
        //nullable =  from not(true or (false and false)) = 
: GeographicMapCellPosition{
    //var anotherMapGeographicMapCellPosition = anotherMapGeographicMapCellPosition



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getInstance(anotherMapGeographicMapCellPosition!!.getColumn(), anotherMapGeographicMapCellPosition!!.getRow())
}


                @Throws(Exception::class)
            
    open fun createInstance(i_column: Int, i_row: Int, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
: GeographicMapCellPosition{
    //var i_column = i_column
    //var i_row = i_row
    //var width = width
    //var height = height

    var cellPositionCanBeNull: Any? = geographicMapCellPositionArray[i_row]!![i_column]


    
                        if(cellPositionCanBeNull == 
                                    null
                                )
                        
                                    {
                                    cellPositionCanBeNull= this.geographicMapCellPositionFactoryInterface!!.getInstance(this.geographicMapInterface, i_column, i_row, columns, rows, width, height)
geographicMapCellPositionArray[i_row]!![i_column]= cellPositionCanBeNull as GeographicMapCellPosition

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cellPositionCanBeNull as GeographicMapCellPosition
}


    open fun getColumns()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return columns
}


    open fun getRows()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rows
}


}
                
            

