
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
        package org.allbinary.media.image




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class ImageUnifierProperties
            : Object
         {
        

    private var rows: Integer

    private var columns: Integer

    private var imageUnifierCell: ImageUnifierCell
public constructor        ()
            : super()
        {}


open fun getWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getColumns()!!.toInt() *this.getImageUnifierCell()!!.getWidth()!!.toInt()
}


open fun getHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getRows()!!.toInt() *this.getImageUnifierCell()!!.getHeight()!!.toInt()
}


open fun getRows()
        //nullable = true from not(false or (false and true)) = true
: Integer{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rows
}


open fun setRows(rows: Integer)
        //nullable = true from not(false or (false and false)) = true
{

                    var rows = rows
this.rows= rows
}


open fun getColumns()
        //nullable = true from not(false or (false and true)) = true
: Integer{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return columns
}


open fun setColumns(columns: Integer)
        //nullable = true from not(false or (false and false)) = true
{

                    var columns = columns
this.columns= columns
}


open fun getImageUnifierCell()
        //nullable = true from not(false or (false and true)) = true
: ImageUnifierCell{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return imageUnifierCell
}


open fun setImageUnifierCell(imageUnifierCell: ImageUnifierCell)
        //nullable = true from not(false or (false and false)) = true
{

                    var imageUnifierCell = imageUnifierCell
this.imageUnifierCell= imageUnifierCell
}


}
                
            

