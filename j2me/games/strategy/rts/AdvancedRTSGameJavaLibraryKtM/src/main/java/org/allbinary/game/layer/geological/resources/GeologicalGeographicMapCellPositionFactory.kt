
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2002 AllBinary 
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
        package org.allbinary.game.layer.geological.resources




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.game.rand.MyRandomFactory
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.GeographicMapCellPositionFactoryInterface

open public class GeologicalGeographicMapCellPositionFactory
            : Object
        
                , GeographicMapCellPositionFactoryInterface {
        

    private val resourcePerMapCellType: IntArray
public constructor (resourcePerMapCellType: IntArray)
            : super()
        {
var resourcePerMapCellType = resourcePerMapCellType
this.resourcePerMapCellType= resourcePerMapCellType
}


                @Throws(Exception::class)
            
    override fun getInstance(geographicMapInterface: BasicGeographicMap, i_column: Int, i_row: Int, columns: Int, rows: Int, width: Int, height: Int)
        //nullable =  from not(true or (false and false)) = 
: GeographicMapCellPosition{
    //var geographicMapInterface = geographicMapInterface
var i_column = i_column
var i_row = i_row
var columns = columns
var rows = rows
var width = width
var height = height

    var tiledLayer: AllBinaryTiledLayer = geographicMapInterface!!.getAllBinaryTiledLayer()!!


    var resources: Int = this.resourcePerMapCellType[tiledLayer!!.getCell(i_column, i_row)] +MyRandomFactory.getInstance()!!.getAbsoluteNextInt(1000)




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GeologicalGeographicMapCellPosition(i_column, i_row, columns, rows, width, height, GeologicalResource(resources))
}


}
                
            

