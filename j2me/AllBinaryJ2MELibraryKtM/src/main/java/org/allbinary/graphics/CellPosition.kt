
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
        package org.allbinary.graphics




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graph.V
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonSeps

open public class CellPosition : V {
        
companion object {
            
    open fun toString(basicGeographicMapCellPosition: CellPosition)
        //nullable = true from not(false or (true and false)) = true
: String{
var basicGeographicMapCellPosition = basicGeographicMapCellPosition



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return toString(basicGeographicMapCellPosition!!.getColumn(), basicGeographicMapCellPosition!!.getRow())
}


    open fun toString(i_column: Int, i_row: Int)
        //nullable = true from not(false or (true and false)) = true
: String{
var i_column = i_column
var i_row = i_row

    var stringBuffer: StringMaker = StringMaker()


    var commonSeps: CommonSeps = CommonSeps.getInstance()!!

stringBuffer!!.append(commonSeps!!.PARENTHESIS_OPEN)
stringBuffer!!.append(i_column)
stringBuffer!!.append(commonSeps!!.COMMA)
stringBuffer!!.append(i_row)
stringBuffer!!.append(commonSeps!!.PARENTHESIS_CLOSE)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


        }
            
    private val id: Int

    private val column: Int

    private val row: Int
public constructor (column: Int, row: Int, columns: Int, rows: Int){
var column = column
var row = row
var columns = columns
var rows = rows
this.column= column
this.row= row
this.id= (row *columns) +column
}


    open fun getColumn()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return column
}


    open fun getRow()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return row
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CellPosition.toString(this.getColumn(), this.getRow())
}


    override fun getId()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return id
}


}
                
            

