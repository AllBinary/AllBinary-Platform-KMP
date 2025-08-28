
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
        

open public class CachingGeographicMapCellPositionFactory : BasicGeographicMapCellPositionFactory {
        
protected constructor        (geographicMapInterface: BasicGeographicMap)                        

                            : super(geographicMapInterface)

        Updates for KMP build        
        {
var geographicMapInterface = geographicMapInterface


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
open fun createInstance(i_column: Int, i_row: Int, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
: GeographicMapCellPosition

        Updates for KMP build        
        {
var i_column = i_column
var i_row = i_row
var width = width
var height = height

    var cellPositionKey: String = GeographicMapCellPosition.toString(i_column, i_row)!!


    var cellPosition: GeographicMapCellPosition = GeographicMapCellPositionFactory.getHashtable()!!.get(cellPositionKey as Object) as GeographicMapCellPosition


    
                        if(cellPosition == 
                                    null
                                )
                        
                                    {
                                    cellPosition= this.geographicMapCellPositionFactoryInterface!!.getInstance(this.geographicMapInterface, i_column, i_row, columns, rows, width, height)
geographicMapCellPositionArray[i_row]!![i_column]= cellPosition
GeographicMapCellPositionFactory.getHashtable()!!.put(cellPositionKey, cellPosition)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cellPosition
}


}
                
            

