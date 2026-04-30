
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
import org.allbinary.util.BasicArrayListS
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
                        return VectorRotationGenerator.instance
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
    //var vectorRotationInfo = vectorRotationInfo



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getInstanceFrames(vectorRotationInfo!!.getWidth(), vectorRotationInfo!!.getHeight(), vectorRotationInfo!!.getPoints(), vectorRotationInfo!!.getTotalFrames())
}


    private val angleFactory: AngleFactory = AngleFactory.getInstance()!!

    open fun getInstanceFrames(width: Int, height: Int, points: Array<IntArray?>, frames: Int)
        //nullable = true from not(false or (false and false)) = true
: Array<Array<IntArray?>?>{
    //var width = width
    //var height = height
    //var points = points
    //var frames = frames

        try {
            
    var totalAngle: Short = this.angleFactory!!.TOTAL_ANGLE


    var angleIncrement: Int = totalAngle /frames


    var pointsBasicArrayList: BasicArrayList = BasicArrayListS(totalAngle /angleIncrement)


    var pointBasicArrayList: BasicArrayList = BasicArrayListS(points.size)


    var pointFactory: PointFactory = PointFactory.getInstance()!!


    var size: Int = points.size
                





                        for (index in 0 until size)

        {
pointBasicArrayList!!.add(pointFactory!!.createXY(points[index]!![0]!!, points[index]!![1]!!))
}


    var index: Int = 0


        while(index < totalAngle)
        {
pointsBasicArrayList!!.add(getListAtAngle(width, height, pointBasicArrayList, this.angleFactory!!.getAt(index)))
index += angleIncrement
}


    var newPoints: Array<Array<IntArray?>?> = this.vectorAnimationUtil!!.toAnimationArrayFromListOfPointListWithPointsPerFrame(pointsBasicArrayList, pointBasicArrayList!!.size())!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newPoints
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

this.logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.GET_INSTANCE, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullUtil.getInstance()!!.NULL_INT_ARRAY_ARRAY_ARRAY
}

}


                @Throws(Exception::class)
            
    open fun getListAtAngle(width: Int, height: Int, pointBasicArrayList: BasicArrayList, angle: Angle)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{
    //var width = width
    //var height = height
    //var pointBasicArrayList = pointBasicArrayList
    //var angle = angle

    var graphicsPipe: BasicGraphicsPipeline = BasicGraphicsPipeline(pointBasicArrayList)

graphicsPipe!!.createMatrix()
graphicsPipe!!.translate( -(width shr 1),  -(height shr 1))
graphicsPipe!!.rotateToAngle(angle)
graphicsPipe!!.translate((width shr 1), (height shr 1))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return graphicsPipe!!.getMatrix()
}


}
                
            

