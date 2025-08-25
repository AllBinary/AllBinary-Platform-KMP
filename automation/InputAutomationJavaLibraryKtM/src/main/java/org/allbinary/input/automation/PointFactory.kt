
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

open public class PointFactory
            : Object
         {
        

        companion object {
            
    private var pointArray: Array<Array<Point?>?> = Array(3000) { Array(3000) { null } }

open fun getInstance(x: Int, y: Int)
        //nullable =  from not(true or (false and false)) = 
: Point{

                    var x = x


                    var y = y

    var point: Point = pointArray[x]!![y]!!


    
                        if(point == 
                                    null
                                )
                        
                                    {
                                    point= pointArray[x]!![y]= Point(x, y)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return point
}


        }
            private constructor        ()
            : super()
        {}


}
                
            

