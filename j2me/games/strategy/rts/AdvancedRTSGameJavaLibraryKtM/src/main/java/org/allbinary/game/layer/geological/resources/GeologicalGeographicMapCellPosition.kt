
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
        package org.allbinary.game.layer.geological.resources




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition

open public class GeologicalGeographicMapCellPosition : GeographicMapCellPosition {
        

    private val geologicalResource: GeologicalResource
public constructor        (column: Int, row: Int, columns: Int, rows: Int, width: Int, height: Int, geologicalResource: GeologicalResource)                        

                            : super(column, row, columns, rows, width, height){
    //var column = column
    //var row = row
    //var columns = columns
    //var rows = rows
    //var width = width
    //var height = height
    //var geologicalResource = geologicalResource


                            //For kotlin this is before the body of the constructor.
                    
this.geologicalResource= geologicalResource
}


open fun getGeologicalResource()
        //nullable = true from not(false or (false and true)) = true
: GeologicalResource{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geologicalResource
}


}
                
            

