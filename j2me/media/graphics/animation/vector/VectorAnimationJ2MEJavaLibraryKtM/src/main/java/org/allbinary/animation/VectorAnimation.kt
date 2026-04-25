
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
        
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.color.BasicColor
import org.allbinary.logic.NullUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.math.PrimitiveIntUtil
import org.allbinary.util.CircularIndexUtil

open public class VectorAnimation : IndexedAnimation
                , VectorAnimationInterface {
        
companion object {
            
    open fun create(currentPoints2: Array<IntArray?>, basicColor: BasicColor, animationBehavior: AnimationBehavior)
        //nullable = true from not(false or (false and false)) = true
: VectorAnimation{
    //var currentPoints2 = currentPoints2
    //var basicColor = basicColor
    //var animationBehavior = animationBehavior

    var currentPoints: Array<Array<IntArray?>?> = Array(1) { Array(currentPoints2!!.size) { IntArray(2) } }


    var size: Int = currentPoints2!!.size
                





                        for (index in 0 until size)

        {
currentPoints[0]!![index]!![0]= currentPoints2[index]!![0]!!
currentPoints[0]!![index]!![1]= currentPoints2[index]!![1]!!
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return VectorAnimation(currentPoints, basicColor, animationBehavior)
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var currentPoints: Array<Array<IntArray?>?> = NullUtil.getInstance()!!.NULL_INT_ARRAY_ARRAY_ARRAY

    private var circularIndexUtil: CircularIndexUtil = CircularIndexUtil.getInstance(0)!!
public constructor (currentPoints: Array<Array<IntArray?>?>, basicColor: BasicColor, animationBehavior: AnimationBehavior)                        

                            : super(animationBehavior){
    //var currentPoints = currentPoints
    //var basicColor = basicColor
    //var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.setPoints(currentPoints)
this.setBasicColorP(basicColor)
}


                @Throws(Exception::class)
            
    override fun getAnimationSize()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getSize()
}


    override fun getSize()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.currentPoints!!.size
}


    override fun setSequence(sequence: IntArray)
        //nullable = true from not(false or (false and false)) = true
{
    //var sequence = sequence
}


    override fun getSequence()
        //nullable = true from not(false or (false and true)) = true
: IntArray{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PrimitiveIntUtil.getArrayInstance()
}


    override fun nextFrame()
        //nullable = true from not(false or (false and true)) = true
{
this.circularIndexUtil!!.next()
}


    override fun previousFrame()
        //nullable = true from not(false or (false and true)) = true
{
this.circularIndexUtil!!.previous()
}


    open fun paintVectors(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
    //var x = x
    //var y = y

        try {
            
    var nextPointX: Int = 0


    var nextPointY: Int = 0


    var nextPoint: IntArray


    var point: IntArray


    var currentPointsFrame: Array<IntArray?> = this.currentPoints[this.circularIndexUtil!!.getIndex()]!!


    var size: Int = currentPointsFrame!!.size
                


    var index: Int = size -2


        while(--index >= 0)
        {
nextPoint= currentPointsFrame[index]!!
point= currentPointsFrame[index +1]!!
nextPointX= nextPoint[0]!!
nextPointY= nextPoint[1]!!

    
                        if(nextPointX != 1000)
                        
                                    {
                                    graphics.drawLine(point[0] +x, point[1] +y, nextPointX +x, nextPointY +y)

                                    }
                                
                        else {
                            index--

                        }
                            
}

} catch(e: Exception)
            {
this.logUtil!!.put(commonStrings!!.EXCEPTION, this, "paintVectors", e)
}

}


    override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
var x = x
var y = y
this.basicSetColorUtil!!.setBasicColorP(graphics, basicColor)
this.paintVectors(graphics, x, y)
}


    override fun getFrame()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.circularIndexUtil!!.getIndex()
}


    override fun setFrame(index: Int)
        //nullable = true from not(false or (false and false)) = true
{
var index = index
this.circularIndexUtil!!.setIndex(index)
}


    override fun getPoints(frame: Int)
        //nullable = true from not(false or (false and false)) = true
: Array<IntArray?>{
var frame = frame



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return currentPoints[frame]!!
}


    open fun setPoints(currentPoints: Array<Array<IntArray?>?>)
        //nullable = true from not(false or (false and false)) = true
{
var currentPoints = currentPoints
this.currentPoints= currentPoints
this.circularIndexUtil= CircularIndexUtil.getInstance(currentPoints!!.size)
}


}
                
            

