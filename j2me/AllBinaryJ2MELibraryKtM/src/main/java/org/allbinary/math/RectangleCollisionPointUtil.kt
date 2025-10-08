
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
        package org.allbinary.math




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.GPoint
import org.allbinary.util.BasicArrayList

open public class RectangleCollisionPointUtil
            : Object
         {
        
companion object {
            
    open fun allPointsInside(rectX1: Int, rectY1: Int, rectX2: Int, rectY2: Int, list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var rectX1 = rectX1
var rectY1 = rectY1
var rectX2 = rectX2
var rectY2 = rectY2
var list = list

    var rectangleCollisionUtil: RectangleCollisionUtil = RectangleCollisionUtil.getInstance()!!


    var point: GPoint





                        for (index in list.size()!!  - 1  downTo 0)

        {
point= list.objectArray[index]!! as GPoint

    
                        if(!rectangleCollisionUtil!!.isInside(rectX1, rectY1, rectX2, rectY2, point.getX(), point.getY()))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


    open fun allPointsInside(rectX1: Int, rectY1: Int, rectX2: Int, rectY2: Int, list: BasicArrayList, xCellSize: Int, yCellSize: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var rectX1 = rectX1
var rectY1 = rectY1
var rectX2 = rectX2
var rectY2 = rectY2
var list = list
var xCellSize = xCellSize
var yCellSize = yCellSize

    var rectangleCollisionUtil: RectangleCollisionUtil = RectangleCollisionUtil.getInstance()!!


    var point: GPoint





                        for (index in list.size()!!  - 1  downTo 0)

        {
point= list.objectArray[index]!! as GPoint

    
                        if(!rectangleCollisionUtil!!.isInside(rectX1, rectY1, rectX2, rectY2, point.getX() *xCellSize, point.getY() *yCellSize))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


        }
            private constructor ()
            : super()
        {
}


}
                
            

