
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
        
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.pipeline.BasicGraphicsPipeline
import org.allbinary.logic.NullUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.math.Angle
import org.allbinary.math.AngleFactory
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList
import org.allbinary.vector.VectorInfo

open public class VectorRotationGenerator
            : Object
         {
        
companion object {
            
    private val instance: VectorRotationGenerator = VectorRotationGenerator()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: VectorRotationGenerator{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val vectorAnimationUtil: VectorAnimationUtil = VectorAnimationUtil.getInstance()!!
private constructor ()
            : super()
        {
}


    open fun getInstance(vectorRotationInfo: VectorInfo)
        //nullable =  from not(true or (false and false)) = 
: Array<Array<IntArray?>?>{
var vectorRotationInfo = vectorRotationInfo



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return getInstance(vectorRotationInfo!!.getWidth(), vectorRotationInfo!!.getHeight(), vectorRotationInfo!!.getPoints(), vectorRotationInfo!!.getTotalFrames())
}


    private val angleFactory: AngleFactory = AngleFactory.getInstance()!!

    open fun getInstance(width: Int, height: Int, points: Array<IntArray?>, frames: Int)
        //nullable =  from not(true or (false and false)) = 
: Array<Array<IntArray?>?>{
var width = width
var height = height
var points = points
var frames = frames

        try {
            
    var totalAngle: Short = this.angleFactory!!.TOTAL_ANGLE


    var angleIncrement: Int = totalAngle /frames


    var pointsBasicArrayList: BasicArrayList = BasicArrayList(totalAngle /angleIncrement)


    var pointBasicArrayList: BasicArrayList = BasicArrayList(points.size)


    var pointFactory: PointFactory = PointFactory.getInstance()!!


    var size: Int = points.size
                





                        for (index in 0 until size)

        {
pointBasicArrayList!!.add(pointFactory!!.getInstance(points[index]!![0]!!, points[index]!![1]!!))
}





                        for (index in 0 until totalAngle)

        {
pointsBasicArrayList!!.add(getInstance(width, height, pointBasicArrayList, this.angleFactory!!.getInstance(index)))
}


    var newPoints: Array<Array<IntArray?>?> = vectorAnimationUtil!!.toAnimationArrayFromBasicArrayListOfPointBasicArrayList(pointsBasicArrayList, pointBasicArrayList!!.size())!!




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
            
    open fun getInstance(width: Int, height: Int, pointBasicArrayList: BasicArrayList, angle: Angle)
        //nullable =  from not(true or (false and false)) = 
: BasicArrayList{
var width = width
var height = height
var pointBasicArrayList = pointBasicArrayList
var angle = angle

    var graphicsPipe: BasicGraphicsPipeline = BasicGraphicsPipeline(pointBasicArrayList)

graphicsPipe!!.createMatrix()
graphicsPipe!!.translate( -(width shr 1),  -(height shr 1))
graphicsPipe!!.rotate(angle)
graphicsPipe!!.translate((width shr 1), (height shr 1))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return graphicsPipe!!.getMatrix()
}


}
                
            

