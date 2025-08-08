
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
        package org.allbinary.vector



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class PointsUtil
            : Object
         {
        

        companion object {


    private val instance: PointsUtil = PointsUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PointsUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun adjust(points: Array<Array<IntArray?>?>, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: Array<Array<IntArray?>?>{

                    var points = points


                    var x = x


                    var y = y

    var size: Int = points.size
                


    var newPoints: Array<Array<IntArray?>?> = Array(size) { Array(0) { IntArray(0) } }





                        for (index in 0 until size)


        {
    var size2: Int = points[index]!!.size
                

newPoints[index]= Array(size2) { IntArray(2) }




                        for (index2 in 0 until size2)


        {
    
                        if(points[index]!![index2]!![0] != 1000)
                        
                                    {
                                    newPoints[index]!![index2]!![0]= points[index]!![index2]!![0] +x
newPoints[index]!![index2]!![1]= points[index]!![index2]!![1] +y

                                    }
                                
                        else {
                            newPoints[index]!![index2]!![0]= 1000
newPoints[index]!![index2]!![1]= 1000

                        }
                            
}

}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newPoints
}


open fun adjust(points: Array<IntArray?>, both: Int)
        //nullable = true from not(false or (false and false)) = true
: Array<IntArray?>{

                    var points = points


                    var both = both



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return adjust(points, both, both)
}


open fun adjust(points: Array<IntArray?>, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: Array<IntArray?>{

                    var points = points


                    var x = x


                    var y = y

    var newPoints: Array<IntArray?> = Array(points.size) { IntArray(2) }





                        for (index2 in 0 until points.size)


        {
    
                        if(points[index2]!![0] != 1000)
                        
                                    {
                                    newPoints[index2]!![0]= points[index2]!![0] +x
newPoints[index2]!![1]= points[index2]!![1] +y

                                    }
                                
                        else {
                            newPoints[index2]!![0]= 1000
newPoints[index2]!![1]= 1000

                        }
                            
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newPoints
}


}
                
            

