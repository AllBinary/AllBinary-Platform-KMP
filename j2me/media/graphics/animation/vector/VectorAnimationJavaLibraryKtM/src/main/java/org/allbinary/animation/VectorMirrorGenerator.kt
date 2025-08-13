
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.pipeline.BasicGraphicsPipeline
import org.allbinary.logic.NullUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class VectorMirrorGenerator
            : Object
         {
        

        companion object {
            
    private val instance: VectorMirrorGenerator = VectorMirrorGenerator()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: VectorMirrorGenerator{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val vectorAnimationUtil: VectorAnimationUtil = VectorAnimationUtil.getInstance()!!
            
private constructor        ()
            : super()
        {}


open fun getInstance(points: Array<Array<IntArray?>?>, width: Int)
        //nullable =  from not(true or (false and false)) = 
: Array<Array<IntArray?>?>{

                    var points = points


                    var width = width

        try {
            
    var pointFactory: PointFactory = PointFactory.getInstance()!!
            


    var pointBasicArrayList: BasicArrayList


    var nextPoints: Array<IntArray?>


    var size2: Int= 0


    var size: Int = points.size
                


    var pointsBasicArrayList: BasicArrayList = BasicArrayList(size)





                        for (frame in 0 until size)


        {nextPoints= points[frame]!!
size2= nextPoints!!.size
pointBasicArrayList= BasicArrayList(size2)




                        for (index in 0 until size2)


        {pointBasicArrayList!!.add(pointFactory!!.getInstance(nextPoints[index]!![0]!!, nextPoints[index]!![1]!!))
}

pointsBasicArrayList!!.add(pointBasicArrayList)
}





                        for (index in 0 until points.size)


        {pointsBasicArrayList!!.add(getInstance(pointsBasicArrayList!!.objectArray[index]!! as BasicArrayList, width))
}


    var newPoints: Array<Array<IntArray?>?> = vectorAnimationUtil!!.toAnimationArrayFromBasicArrayListOfPointBasicArrayList(pointsBasicArrayList)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newPoints
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.GET_INSTANCE, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullUtil.getInstance()!!.NULL_INT_ARRAY_ARRAY_ARRAY
}

}


                @Throws(Exception::class)
            
open fun getInstance(pointBasicArrayList: BasicArrayList, width: Int)
        //nullable =  from not(true or (false and false)) = 
: BasicArrayList{

                    var pointBasicArrayList = pointBasicArrayList


                    var width = width

    var graphicsPipe: BasicGraphicsPipeline = BasicGraphicsPipeline(pointBasicArrayList)

graphicsPipe!!.createMatrix()
graphicsPipe!!.mirror(width)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return graphicsPipe!!.getMatrix()
}


}
                
            

