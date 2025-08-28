
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
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonStrings

open public class CellPositionFactory
            : Object
         {
        

        companion object {
            
    private var SINGLETON: CellPositionFactory = CellPositionFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CellPositionFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val NONE: CellPosition = CellPosition( -1,  -1,  -1,  -1)

    private var cellPositionArray: Array<Array<CellPosition?>?> = Array(0) { arrayOfNulls<CellPosition?>(0) }
                                                            

    private var columns: Int= 0

    private var rows: Int= 0
private constructor        ()
            : super()
        {
}


open fun init(columns: Int, rows: Int)
        //nullable = true from not(false or (false and false)) = true
{
var columns = columns
var rows = rows
this.cellPositionArray= Array(columns) { arrayOfNulls<CellPosition?>(rows) }
                                                            
this.columns= columns
this.rows= rows

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Init: columns: ")
stringBuffer!!.append(columns)
stringBuffer!!.append(" rows: ")
stringBuffer!!.append(rows)
logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.INIT)




                        for (column in 0 until columns)

        {




                        for (row in 0 until rows)

        {
this.createInstance(column, row)
}

}

}


open fun getInstance(i_column: Int, i_row: Int)
        //nullable =  from not(true or (false and false)) = 
: CellPosition{
var i_column = i_column
var i_row = i_row

        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cellPositionArray[i_column]!![i_row]!!
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(StringMaker().
                            append("columns: ")!!.append(this.getColumns())!!.append(" rows: ")!!.append(this.getRows())!!.append(" col: ")!!.append(i_column)!!.append(" row: ")!!.append(i_row)!!.toString(), this, commonStrings!!.GET_INSTANCE, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NONE
}

}


open fun createInstance(i_column: Int, i_row: Int)
        //nullable = true from not(false or (false and false)) = true
: CellPosition{
var i_column = i_column
var i_row = i_row

    var cellPositionCanBeNull: CellPosition? = cellPositionArray[i_column]!![i_row]


    
                        if(cellPositionCanBeNull == 
                                    null
                                )
                        
                                    {
                                    cellPositionCanBeNull= CellPosition(i_column, i_row, this.columns, this.rows)
cellPositionArray[i_column]!![i_row]= cellPositionCanBeNull

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cellPositionCanBeNull
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
                
            

