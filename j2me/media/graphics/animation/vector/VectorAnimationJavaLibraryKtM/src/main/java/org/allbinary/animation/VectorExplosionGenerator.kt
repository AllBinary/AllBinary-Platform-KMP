
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
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.pipeline.RandomRotationFactory
import org.allbinary.graphics.pipeline.RandomTranslation
import org.allbinary.util.BasicArrayList

open public class VectorExplosionGenerator
            : Object
         {
        

        companion object {
            
    private val instance: VectorExplosionGenerator = VectorExplosionGenerator()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: VectorExplosionGenerator

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val RANDOM: VectorExplosionType = VectorExplosionType()

    val ROTATION: VectorExplosionType = VectorExplosionType()

    private val vectorAnimationUtil: VectorAnimationUtil = VectorAnimationUtil.getInstance()!!
private constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


                @Throws(Exception::class)
            
open fun getInstance(list: BasicArrayList, howMuch: Int, type: VectorExplosionType)
        //nullable =  from not(true or (false and false)) = 
: BasicArrayList

        Updates for KMP build        
        {
var list = list
var howMuch = howMuch
var type = type

    var size: Int = list.size()!!


    var points: Array<IntArray?> = Array(size) { IntArray(2) }





                        for (index in 0 until size)

        

        Updates for KMP build        
        {

    var point: GPoint = list.objectArray[index]!! as GPoint

points[index]!![0]= point.getX()
points[index]!![1]= point.getY()
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return getInstance(list, points, howMuch, type)
}


                @Throws(Exception::class)
            
open fun getInstance(points: Array<IntArray?>, howMuch: Int, type: VectorExplosionType)
        //nullable =  from not(true or (false and false)) = 
: Array<Array<IntArray?>?>

        Updates for KMP build        
        {
var points = points
var howMuch = howMuch
var type = type

    var pointsBasicArrayList: BasicArrayList = getInstance(points, howMuch, type, true)!!


    var tempBasicArrayList: BasicArrayList = pointsBasicArrayList!!.objectArray[0]!! as BasicArrayList


    var newPoints: Array<Array<IntArray?>?> = vectorAnimationUtil!!.toAnimationArrayFromBasicArrayListOfPointBasicArrayList(pointsBasicArrayList, tempBasicArrayList!!.size())!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newPoints
}


                @Throws(Exception::class)
            
open fun getInstance(points: Array<IntArray?>, howMuch: Int, type: VectorExplosionType, startFrame: Boolean)
        //nullable =  from not(true or (false and false)) = 
: BasicArrayList

        Updates for KMP build        
        {
var points = points
var howMuch = howMuch
var type = type
var startFrame = startFrame

        try {
            
    var pointsBasicArrayList: BasicArrayList = BasicArrayList(howMuch)

pointsBasicArrayList!!.add(createPointsBasicArrayList(points))

    var frameIndex: Int = 0


        while(frameIndex < howMuch)
        

        Updates for KMP build        
        {

    var tempBasicArrayList: BasicArrayList = pointsBasicArrayList!!.objectArray[frameIndex]!! as BasicArrayList


    var pointBasicArrayList: BasicArrayList = getInstance(tempBasicArrayList, points, howMuch, type)!!

pointsBasicArrayList!!.add(pointBasicArrayList)
frameIndex++
}


    
                        if(!startFrame)
                        
                                    {
                                    pointsBasicArrayList!!.remove(0)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return pointsBasicArrayList
} catch(e: Exception)
            

        Updates for KMP build        
        {



                            throw e
}

}


    private val randomRotationFactory: RandomRotationFactory = RandomRotationFactory.getInstance()!!

                @Throws(Exception::class)
            
open fun getInstance(tempBasicArrayList: BasicArrayList, points: Array<IntArray?>, howMuch: Int, type: VectorExplosionType)
        //nullable =  from not(true or (false and false)) = 
: BasicArrayList

        Updates for KMP build        
        {
var tempBasicArrayList = tempBasicArrayList
var points = points
var howMuch = howMuch
var type = type

    var index: Int = 0


    var pointBasicArrayList: BasicArrayList = BasicArrayList()


        while(index < points.size)
        

        Updates for KMP build        
        {

    var sectionBasicArrayList: BasicArrayList = BasicArrayList()


        while(points[index]!![0] != 1000)
        

        Updates for KMP build        
        {
sectionBasicArrayList!!.add(tempBasicArrayList!!.objectArray[index]!!)
index++

    
                        if(index >= points.size)
                        
                                    {
                                    break;

                    

                                    }
                                
}

sectionBasicArrayList= RandomTranslation.getInstance(sectionBasicArrayList, howMuch)

    
                        if(type == ROTATION)
                        
                                    {
                                    sectionBasicArrayList= randomRotationFactory!!.getInstance(sectionBasicArrayList, howMuch)

                                    }
                                

    var size: Int = sectionBasicArrayList!!.size()!!





                        for (index2 in 0 until size)

        

        Updates for KMP build        
        {
pointBasicArrayList!!.add(sectionBasicArrayList!!.objectArray[index2]!!)
}


    
                        if(index >= points.size)
                        
                                    {
                                    break;

                    

                                    }
                                
                             else 
    
                        if(points[index]!![0] == 1000)
                        
                                    {
                                    pointBasicArrayList!!.add(tempBasicArrayList!!.objectArray[index]!!)
index++

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return pointBasicArrayList
}


                @Throws(Exception::class)
            
open fun createPointsBasicArrayList(points: Array<IntArray?>)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList

        Updates for KMP build        
        {
var points = points

    
                        if(points.size == 0)
                        
                                    {
                                    


                            throw Exception("Not Points Provided")

                                    }
                                

    var firstPointBasicArrayList: BasicArrayList = BasicArrayList(points.size)





                        for (index in 0 until points.size)

        

        Updates for KMP build        
        {
firstPointBasicArrayList!!.add(PointFactory.getInstance()!!.getInstance(points[index]!![0]!!, points[index]!![1]!!))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return firstPointBasicArrayList
}


}
                
            

