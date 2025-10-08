
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
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.util.BasicArrayList
import org.allbinary.game.layer.AllBinaryTiledLayer

open public class CellPositionsUtil
            : Object
         {
        
companion object {
            
    private val instance: CellPositionsUtil = CellPositionsUtil()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CellPositionsUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            
    open fun getAll(geographicMapInterface: BasicGeographicMap, topRightGeographicMapCellPosition: GeographicMapCellPosition, columns: Int, rows: Int, reusableList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{
    //var geographicMapInterface = geographicMapInterface
    //var topRightGeographicMapCellPosition = topRightGeographicMapCellPosition
    //var columns = columns
    //var rows = rows
    //var reusableList = reusableList
reusableList!!.clear()

    var geographicMapCellPositionFactory: BasicGeographicMapCellPositionFactory = geographicMapInterface!!.getGeographicMapCellPositionFactory()!!


    var lastColumn: Int = topRightGeographicMapCellPosition!!.getColumn() +columns


    var lastRow: Int = topRightGeographicMapCellPosition!!.getRow() +rows


    
                        if((columns > 1 && lastColumn > geographicMapInterface!!.getAllBinaryTiledLayer()!!.getColumns()) || (rows > 1 && lastRow > geographicMapInterface!!.getAllBinaryTiledLayer()!!.getRows()))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return reusableList

                                    }
                                




                        for (rowIndex in 0 until rows)

        {




                        for (columnIndex in 0 until columns)

        {

    var geographicMapCellPosition: GeographicMapCellPosition = geographicMapCellPositionFactory!!.getInstance(topRightGeographicMapCellPosition!!.getColumn() +columnIndex, topRightGeographicMapCellPosition!!.getRow() +rowIndex)!!

reusableList!!.add(geographicMapCellPosition)
}

}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return reusableList
}


    private val reusableSingleThreadedSurroundingList: BasicArrayList = BasicArrayList(8)

                @Throws(Exception::class)
            
    open fun getAllSurrounding(geographicMapInterface: BasicGeographicMap, occupyList: BasicArrayList, reusableList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{
    //var geographicMapInterface = geographicMapInterface
    //var occupyList = occupyList
    //var reusableList = reusableList
reusableList!!.clear()




                        for (index in occupyList!!.size() -1 downTo 0)

        {

    var layerGeographicMapCellPosition: GeographicMapCellPosition = occupyList!!.get(index) as GeographicMapCellPosition


    var surroundingGeographicMapCellPositionList: BasicArrayList = getAllSurrounding(geographicMapInterface, layerGeographicMapCellPosition, reusableSingleThreadedSurroundingList)!!





                        for (index2 in surroundingGeographicMapCellPositionList!!.size() -1 downTo 0)

        {

    var geographicMapCellPosition: GeographicMapCellPosition = surroundingGeographicMapCellPositionList!!.get(index2) as GeographicMapCellPosition


    
                        if(!reusableList!!.contains(geographicMapCellPosition) && !occupyList!!.contains(geographicMapCellPosition))
                        
                                    {
                                    reusableList!!.add(geographicMapCellPosition)

                                    }
                                
}

}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return reusableList
}


    private val surroundArray: Array<IntArray?> = arrayOf(arrayOf( -1, -1),intArrayOf(0, -1)
,intArrayOf(1, -1)
,intArrayOf( -1,1)
,intArrayOf(0,1)
,intArrayOf(1,1)
,intArrayOf(1,0)
,intArrayOf( -1,0)
)

                @Throws(Exception::class)
            
    open fun getAllSurrounding(geographicMapInterface: BasicGeographicMap, layerGeographicMapCellPosition: GeographicMapCellPosition, reusableSurroundingList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{
    //var geographicMapInterface = geographicMapInterface
    //var layerGeographicMapCellPosition = layerGeographicMapCellPosition
    //var reusableSurroundingList = reusableSurroundingList
reusableSurroundingList!!.clear()

    var geographicMapCellPositionFactory: BasicGeographicMapCellPositionFactory = geographicMapInterface!!.getGeographicMapCellPositionFactory()!!


    var tiledLayer: AllBinaryTiledLayer = geographicMapInterface!!.getAllBinaryTiledLayer()!!


    var row: Int= 0


    var column: Int= 0





                        for (index in 0 until 8)

        {
column= layerGeographicMapCellPosition!!.getColumn() +surroundArray[index]!![0]
row= layerGeographicMapCellPosition!!.getRow() +surroundArray[index]!![1]

    
                        if(tiledLayer!!.isOnTileLayer(column, row))
                        
                                    {
                                    
    var geographicMapCellPosition: GeographicMapCellPosition = geographicMapCellPositionFactory!!.getInstance(column, row)!!

reusableSurroundingList!!.add(geographicMapCellPosition)

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return reusableSurroundingList
}


}
                
            

