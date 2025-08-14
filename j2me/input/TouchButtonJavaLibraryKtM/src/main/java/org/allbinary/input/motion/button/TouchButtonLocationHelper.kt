
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
        package org.allbinary.input.motion.button




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.logic.string.StringMaker

open public class TouchButtonLocationHelper
            : Object
         {
        

    private val totalColumns: Int

    private val totalRows: Int

    private var columnsRemainder: Int

    private var rowsRemainder: Int

    private var columnsRemainderHalf: Int

    private var rowsRemainderHalf: Int
public constructor        ()
            : super()
        {
    var buttonSize: Int = CommonButtons.getInstance()!!.STANDARD_BUTTON_SIZE


    var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!
            

this.totalColumns= displayInfo!!.getLastWidth() /buttonSize
this.totalRows= displayInfo!!.getLastHeight() /buttonSize
this.columnsRemainder= displayInfo!!.getLastWidth() % buttonSize
this.columnsRemainderHalf= (this.columnsRemainder shr 1)
this.rowsRemainder= displayInfo!!.getLastHeight() % buttonSize
this.rowsRemainderHalf= (this.rowsRemainder shr 1)
}


open fun getTotalColumns()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return totalColumns
}


open fun getTotalRows()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return totalRows
}


open fun getColumnsRemainder()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return columnsRemainder
}


open fun getRowsRemainder()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rowsRemainder
}


open fun getColumnsRemainderHalf()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return columnsRemainderHalf
}


open fun getRowsRemainderHalf()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rowsRemainderHalf
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "totalColumns: ")
stringBuffer!!.append(totalColumns)
stringBuffer!!.append(
                            " totalRows: ")
stringBuffer!!.append(totalRows)
stringBuffer!!.append(
                            " columnsRemainder: ")
stringBuffer!!.append(columnsRemainder)
stringBuffer!!.append(
                            " rowsRemainder: ")
stringBuffer!!.append(rowsRemainder)
stringBuffer!!.append(
                            " columnsRemainderHalf: ")
stringBuffer!!.append(columnsRemainderHalf)
stringBuffer!!.append(
                            " rowsRemainderHalf: ")
stringBuffer!!.append(rowsRemainderHalf)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

