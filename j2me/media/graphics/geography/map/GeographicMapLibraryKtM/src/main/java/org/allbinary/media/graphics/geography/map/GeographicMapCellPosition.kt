
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
        
import org.allbinary.graphics.CellPosition
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.PointFactory

open public class GeographicMapCellPosition : CellPosition {
        

    private var point: GPoint

    private var midPoint: GPoint
public constructor        (column: Int, row: Int, columns: Int, rows: Int, width: Int, height: Int)                        

                            : super(column, row, columns, rows)

        Updates for KMP build        
        {
var column = column
var row = row
var columns = columns
var rows = rows
var width = width
var height = height


                            //For kotlin this is before the body of the constructor.
                    

    var x: Int = this.getColumn() *width


    var y: Int = this.getRow() *height


    var pointFactory: PointFactory = PointFactory.getInstance()!!

this.point= pointFactory!!.getInstance(x, y)
this.midPoint= pointFactory!!.getInstance(x +(width shr 1), y +(height shr 1))
}


open fun getPoint()
        //nullable = true from not(false or (false and true)) = true
: GPoint

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return point
}


open fun getMidPoint()
        //nullable = true from not(false or (false and true)) = true
: GPoint

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return midPoint
}


open fun setMidPoint(midPoint: GPoint)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var midPoint = midPoint
this.midPoint= midPoint
}


}
                
            

