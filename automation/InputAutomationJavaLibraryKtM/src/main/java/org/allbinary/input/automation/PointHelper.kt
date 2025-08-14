
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
        package org.allbinary.input.automation




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt

open public class PointHelper
            : Object
         {
        

        companion object {
            
    private val two: Double = 2

open fun getCenterPoint(rectangle: Rectangle)
        //nullable = true from not(false or (false and false)) = true
: Point{

                    var rectangle = rectangle

    var x: Double = rectangle.getX() +rectangle.getWidth() /two


    var y: Double = rectangle.getY() +rectangle.getHeight() /two




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PointFactory.getInstance(x.toInt(), y.toInt())
}


        }
            public constructor        ()
            : super()
        {}


}
                
            

