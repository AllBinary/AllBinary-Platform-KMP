
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
        package org.allbinary.game.layer.geographic.map



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.util.BasicArrayList
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.CellPositionsUtil
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition

open public class LayerCoveringCellPositionsUtil
            : Object
         {
        

        companion object {
            
    private val instance: LayerCoveringCellPositionsUtil = LayerCoveringCellPositionsUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: LayerCoveringCellPositionsUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val cellPositionsUtil: CellPositionsUtil = CellPositionsUtil.getInstance()!!
            

                @Throws(Exception::class)
            
open fun getAll(geographicMapInterface: BasicGeographicMap, layerInterface: AllBinaryLayer, x: Int, y: Int, reusableList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var geographicMapInterface = geographicMapInterface


                    var layerInterface = layerInterface


                    var x = x


                    var y = y


                    var reusableList = reusableList

    var topLeftGeographicMapCellPosition: GeographicMapCellPosition = geographicMapInterface!!.getCellPositionAt(x, y)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getAll(geographicMapInterface, topLeftGeographicMapCellPosition, layerInterface, reusableList)
}


                @Throws(Exception::class)
            
open fun getAll(geographicMapInterface: BasicGeographicMap, topLeftGeographicMapCellPosition: GeographicMapCellPosition, layerInterface: AllBinaryLayer, reusableList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var geographicMapInterface = geographicMapInterface


                    var topLeftGeographicMapCellPosition = topLeftGeographicMapCellPosition


                    var layerInterface = layerInterface


                    var reusableList = reusableList
reusableList!!.clear()

    var columns: Int = layerInterface!!.getWidth() /geographicMapInterface!!.getAllBinaryTiledLayer()!!.getCellWidth()


    var rows: Int = layerInterface!!.getHeight() /geographicMapInterface!!.getAllBinaryTiledLayer()!!.getCellHeight()


    
                        if(columns == 0)
                        columns= 1

    
                        if(rows == 0)
                        rows= 1



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cellPositionsUtil!!.getAll(geographicMapInterface, topLeftGeographicMapCellPosition, columns, rows, reusableList)
}


}
                
            

