
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
        

open public class SimpleGeographicMapCellPositionFactory
            : Object
        
                , GeographicMapCellPositionFactoryInterface {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            
open fun getInstance(geographicMapInterface: BasicGeographicMap, i_column: Int, i_row: Int, columns: Int, rows: Int, width: Int, height: Int)
        //nullable =  from not(true or (false and false)) = 
: GeographicMapCellPosition{

                    var geographicMapInterface = geographicMapInterface


                    var i_column = i_column


                    var i_row = i_row


                    var columns = columns


                    var rows = rows


                    var width = width


                    var height = height



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GeographicMapCellPosition(i_column, i_row, columns, rows, width, height)
}


}
                
            

