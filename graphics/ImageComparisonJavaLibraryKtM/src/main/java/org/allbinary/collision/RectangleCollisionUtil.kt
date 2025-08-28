
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
        package org.allbinary.collision




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import org.allbinary.graphics.GPoint

open public class RectangleCollisionUtil
            : Object
         {
        

        companion object {
            
open fun isCollision(rectangle: Rectangle, point: GPoint)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var rectangle = rectangle
var point = point

    
                        if(point.getX() > (rectangle.x.toInt() +rectangle.getWidth()) || point.getY() > (rectangle.y.toInt() +rectangle.getHeight()) || point.getX() < rectangle.x || point.getY() < rectangle.y)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                        }
                            
}


open fun isCollision(rectangle1: Rectangle, rectangle2: Rectangle)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var rectangle1 = rectangle1
var rectangle2 = rectangle2



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return isCollision(rectangle1.x, rectangle1.y, rectangle1.x +rectangle1.width, rectangle1.y +rectangle1.height, rectangle2.x, rectangle2.y, rectangle2.x +rectangle2.width, rectangle2.y +rectangle2.height)
}


open fun isCollision(rectX1: Int, rectY1: Int, rectX2: Int, rectY2: Int, rect2X1: Int, rect2Y1: Int, rect2X2: Int, rect2Y2: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var rectX1 = rectX1
var rectY1 = rectY1
var rectX2 = rectX2
var rectY2 = rectY2
var rect2X1 = rect2X1
var rect2Y1 = rect2Y1
var rect2X2 = rect2X2
var rect2Y2 = rect2Y2

    
                        if(rect2X1 >= rectX2 || rect2Y1 >= rectY2 || rect2X2 <= rectX1 || rect2Y2 <= rectY1)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                        }
                            
}


        }
            private constructor        ()
            : super()
        {
}


}
                
            

