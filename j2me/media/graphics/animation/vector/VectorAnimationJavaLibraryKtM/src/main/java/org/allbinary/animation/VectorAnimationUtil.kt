
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
        package org.allbinary.animation




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.GPoint
import org.allbinary.util.BasicArrayList

open public class VectorAnimationUtil
            : Object
         {
        

        companion object {
            
    private val instance: VectorAnimationUtil = VectorAnimationUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: VectorAnimationUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        {
}


open fun toAnimationArrayFromBasicArrayListOfPointBasicArrayList(vector: BasicArrayList, pointsPerFrame: Int)
        //nullable = true from not(false or (false and false)) = true
: Array<Array<IntArray?>?>{
var vector = vector
var pointsPerFrame = pointsPerFrame

    var size: Int = vector.size()!!


    var points: Array<Array<IntArray?>?> = Array(size) { Array(pointsPerFrame) { IntArray(2) } }





                        for (index in 0 until size)

        {

    var nextBasicArrayList: BasicArrayList = vector.objectArray[index]!! as BasicArrayList


    var frame: Array<IntArray?> = toFrameArrayFromPointBasicArrayList(nextBasicArrayList)!!





                        for (pointIndex in 0 until frame.size)

        {
points[index]!![pointIndex]!![0]= frame[pointIndex]!![0]!!
points[index]!![pointIndex]!![1]= frame[pointIndex]!![1]!!
}

}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return points
}


open fun toAnimationArrayFromBasicArrayListOfPointBasicArrayList(vector: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: Array<Array<IntArray?>?>{
var vector = vector

    var size: Int = vector.size()!!


    var points: Array<Array<IntArray?>?> = Array(size) { Array(0) { IntArray(0) } }





                        for (index in 0 until size)

        {

    var nextBasicArrayList: BasicArrayList = vector.objectArray[index]!! as BasicArrayList


    var framePoints: Array<IntArray?> = toFrameArrayFromPointBasicArrayList(nextBasicArrayList)!!

points[index]= Array(framePoints!!.size) { IntArray(2) }




                        for (pointIndex in 0 until framePoints!!.size)

        {
points[index]!![pointIndex]!![0]= framePoints[pointIndex]!![0]!!
points[index]!![pointIndex]!![1]= framePoints[pointIndex]!![1]!!
}

}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return points
}


open fun toFrameArrayFromPointBasicArrayList(list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: Array<IntArray?>{
var list = list

    var points: Array<IntArray?> = Array(list.size()) { IntArray(2) }


    var size: Int = list.size()!!





                        for (index in 0 until size)

        {

    var nextPoint: GPoint = list.objectArray[index]!! as GPoint

points[index]!![0]= nextPoint!!.getX()
points[index]!![1]= nextPoint!!.getY()
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return points
}


}
                
            

