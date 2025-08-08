
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
import org.allbinary.layer.Layer
import org.allbinary.logic.math.MathUtil
import org.allbinary.util.BasicArrayList

open public class BasicGeographicMap : SimpleGeographicMap
                , GeographicMapInterface {
        

    private val mathUtil: MathUtil = MathUtil.getInstance()!!
            

    private val geographicMapCellPositionFactory: BasicGeographicMapCellPositionFactory

    private val geographicMapCellPositionFactoryInterface: GeographicMapCellPositionFactoryInterface

    private val geographicMapCellTypeFactory: GeographicMapCellTypeFactory
public constructor        (id: Integer, name: String, cellTypeIdToGeographicMapCellType: IntArray, tiledLayer: AllBinaryTiledLayer, foregroundBasicColor: BasicColor, backgroundBasicColor: BasicColor, geographicMapCellPositionFactoryInterface: GeographicMapCellPositionFactoryInterface, geographicMapCellPositionBaseFactory: GeographicMapCellPositionBaseFactory, geographicMapCellTypeFactory: GeographicMapCellTypeFactory)                        

                            : super(id, name, cellTypeIdToGeographicMapCellType, tiledLayer, foregroundBasicColor, backgroundBasicColor){

                    var id = id


                    var name = name


                    var cellTypeIdToGeographicMapCellType = cellTypeIdToGeographicMapCellType


                    var tiledLayer = tiledLayer


                    var foregroundBasicColor = foregroundBasicColor


                    var backgroundBasicColor = backgroundBasicColor


                    var geographicMapCellPositionFactoryInterface = geographicMapCellPositionFactoryInterface


                    var geographicMapCellPositionBaseFactory = geographicMapCellPositionBaseFactory


                    var geographicMapCellTypeFactory = geographicMapCellTypeFactory


                            //For kotlin this is before the body of the constructor.
                    
this.geographicMapCellPositionFactoryInterface= geographicMapCellPositionFactoryInterface
this.geographicMapCellPositionFactory= geographicMapCellPositionBaseFactory!!.getInstance(this)
this.geographicMapCellTypeFactory= geographicMapCellTypeFactory
}


                @Throws(Exception::class)
            
open fun getCellPosition(direction: Int, oldGeographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: GeographicMapCellPosition{

                    var direction = direction


                    var oldGeographicMapCellPosition = oldGeographicMapCellPosition


        when (direction) {
            0 -> {


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellPositionFactory!!.getInstance(oldGeographicMapCellPosition!!.getColumn() -1, oldGeographicMapCellPosition!!.getRow())
}
1 -> {


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellPositionFactory!!.getInstance(oldGeographicMapCellPosition!!.getColumn() +1, oldGeographicMapCellPosition!!.getRow())
}
2 -> {


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellPositionFactory!!.getInstance(oldGeographicMapCellPosition!!.getColumn(), oldGeographicMapCellPosition!!.getRow() -1)
}
3 -> {


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellPositionFactory!!.getInstance(oldGeographicMapCellPosition!!.getColumn(), oldGeographicMapCellPosition!!.getRow() +1)
}
else -> {


                            throw Exception(
                            "Only Four Directions")
}

        }       
        
    
}


                @Throws(Exception::class)
            
open fun getCellPositionNoThrow(direction: Int, oldGeographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: GeographicMapCellPosition{

                    var direction = direction


                    var oldGeographicMapCellPosition = oldGeographicMapCellPosition


        when (direction) {
            0 -> {
    
                        if(oldGeographicMapCellPosition!!.getColumn() -1 >= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellPositionFactory!!.getInstance(oldGeographicMapCellPosition!!.getColumn() -1, oldGeographicMapCellPosition!!.getRow())

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                        }
                            
}
1 -> {
    
                        if(oldGeographicMapCellPosition!!.getColumn() +1 < this.getAllBinaryTiledLayer()!!.getColumns())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellPositionFactory!!.getInstance(oldGeographicMapCellPosition!!.getColumn() +1, oldGeographicMapCellPosition!!.getRow())

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                        }
                            
}
2 -> {
    
                        if(oldGeographicMapCellPosition!!.getRow() -1 >= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellPositionFactory!!.getInstance(oldGeographicMapCellPosition!!.getColumn(), oldGeographicMapCellPosition!!.getRow() -1)

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                        }
                            
}
3 -> {
    
                        if(oldGeographicMapCellPosition!!.getRow() +1 < this.getAllBinaryTiledLayer()!!.getRows())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellPositionFactory!!.getInstance(oldGeographicMapCellPosition!!.getColumn(), oldGeographicMapCellPosition!!.getRow() +1)

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                        }
                            
}
else -> {


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

        }       
        
    
}


                @Throws(Exception::class)
            
open fun isOfFourDirections(oldGeographicMapCellPosition: GeographicMapCellPosition, newGeographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var oldGeographicMapCellPosition = oldGeographicMapCellPosition


                    var newGeographicMapCellPosition = newGeographicMapCellPosition




                        for (index in 0 until 4)


        {
    
                        if(newGeographicMapCellPosition == this.getCellPositionNoThrow(index, oldGeographicMapCellPosition))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            
open fun getCellPositionAt(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: GeographicMapCellPosition{

                    var x = x


                    var y = y

    var allBinaryTiledLayer: AllBinaryTiledLayer = this.getAllBinaryTiledLayer()!!
            


    var i_column: Int = mathUtil!!.abs(x /allBinaryTiledLayer!!.getCellHeight())!!
            


    var i_row: Int = mathUtil!!.abs(y /allBinaryTiledLayer!!.getCellWidth())!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellPositionFactory!!.getInstance(i_column, i_row)
}


                @Throws(Exception::class)
            
open fun getCellPositionAtNoThrow(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: GeographicMapCellPosition{

                    var x = x


                    var y = y

    var allBinaryTiledLayer: AllBinaryTiledLayer = this.getAllBinaryTiledLayer()!!
            


    var i_column: Int = mathUtil!!.abs(x /allBinaryTiledLayer!!.getCellHeight())!!
            


    var i_row: Int = mathUtil!!.abs(y /allBinaryTiledLayer!!.getCellWidth())!!
            


    
                        if(allBinaryTiledLayer!!.getColumns() > i_column && allBinaryTiledLayer!!.getRows() > i_row)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellPositionFactory!!.getInstance(i_column, i_row)

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                        }
                            
}


                @Throws(Exception::class)
            
open fun isOnMap(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var geographicMapCellPosition = geographicMapCellPosition

    var allBinaryTiledLayer: AllBinaryTiledLayer = this.getAllBinaryTiledLayer()!!
            


    var i_column: Int = geographicMapCellPosition!!.getColumn()!!
            


    var i_row: Int = geographicMapCellPosition!!.getRow()!!
            


    
                        if(allBinaryTiledLayer!!.getColumns() > i_column && allBinaryTiledLayer!!.getRows() > i_row)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


                @Throws(Exception::class)
            
open fun getCellPositionAtNoThrow(x: Int, y: Int, x2: Int, y2: Int, geographicMapCellPositionList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var x = x


                    var y = y


                    var x2 = x2


                    var y2 = y2


                    var geographicMapCellPositionList = geographicMapCellPositionList
geographicMapCellPositionList!!.clear()

    var allBinaryTiledLayer: AllBinaryTiledLayer = this.getAllBinaryTiledLayer()!!
            


    var i_columnMin: Int = mathUtil!!.abs(x /allBinaryTiledLayer!!.getCellHeight())!!
            


    var i_rowMin: Int = mathUtil!!.abs(y /allBinaryTiledLayer!!.getCellWidth())!!
            


    var i_columnMax: Int = mathUtil!!.abs(x2 /allBinaryTiledLayer!!.getCellHeight()) +1


    var i_rowMax: Int = mathUtil!!.abs(y2 /allBinaryTiledLayer!!.getCellWidth()) +1





                        for (columnIndex in i_columnMin until i_columnMax)


        {



                        for (rowIndex in i_rowMin until i_rowMax)


        {
    
                        if(allBinaryTiledLayer!!.getColumns() > columnIndex && allBinaryTiledLayer!!.getRows() > rowIndex)
                        
                                    {
                                    geographicMapCellPositionList!!.add(geographicMapCellPositionFactory!!.getInstance(columnIndex, rowIndex))

                                    }
                                
}

}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellPositionList
}


                @Throws(Exception::class)
            
open fun getCellPositionsAt(layer: Layer, currentCellPositionArray: Array<Array<GeographicMapCellPosition?>?>, cellPositionArray: Array<Array<GeographicMapCellPosition?>?>)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var layer = layer


                    var currentCellPositionArray = currentCellPositionArray


                    var cellPositionArray = cellPositionArray

    var hasChanged: Boolean = false


    var size: Int = cellPositionArray!!.size
                


    var size2: Int = cellPositionArray[0]!!.size
                


    var xPortion: Int = layer.getXP() /(size -1)


    var yPortion: Int = layer.getYP() /(size -1)





                        for (index in 0 until size)


        {



                        for (index2 in 0 until size2)


        {
    var x: Int = xPortion *index


    var y: Int = yPortion *index

cellPositionArray[index]!![index2]= this.getCellPositionAt(x, y)

    
                        if(currentCellPositionArray[index]!![index2] != cellPositionArray[index]!![index2])
                        
                                    {
                                    hasChanged= true

                                    }
                                
}

}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hasChanged
}


                @Throws(Exception::class)
            
open fun getCellTypeAt(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: GeographicMapCellType{

                    var x = x


                    var y = y

    var cellPosition: GeographicMapCellPosition = this.getCellPositionAt(x, y)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getCellTypeAt(cellPosition)
}


open fun getGeographicMapCellPositionFactory()
        //nullable = true from not(false or (false and true)) = true
: BasicGeographicMapCellPositionFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellPositionFactory
}


open fun getGeographicMapCellPositionFactoryInterface()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellPositionFactoryInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellPositionFactoryInterface
}


open fun getGeographicMapCellTypeFactory()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellTypeFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.geographicMapCellTypeFactory
}


}
                
            

