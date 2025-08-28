
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
        package org.allbinary.input.automation.module




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import java.awt.image.BufferedImage
import java.util.Vector
import org.allbinary.collision.RectangleCollisionUtil
import org.allbinary.graphics.GPoint
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.media.image.comparison.ImageComparatorConstraintsInterface

open public class ImageComparatorConstraints
            : Object
        
                , ImageComparatorConstraintsInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var avoidVector: Vector

    private var maxNonMatchingPixelDeltas: Int= 0

    private var doImageComparisonEveryNthFrame: Int
public constructor        (doImageComparisonEveryNthFrame: Int)
            : super()
        

        Updates for KMP build        
        {
var doImageComparisonEveryNthFrame = doImageComparisonEveryNthFrame
this.doImageComparisonEveryNthFrame= doImageComparisonEveryNthFrame
this.setAvoidVector(Vector())
}


open fun getAvoidVector()
        //nullable = true from not(false or (false and true)) = true
: Vector

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return avoidVector
}


open fun isColorAllowed(frame: Int, point: GPoint, color: Color)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
var frame = frame
var point = point
var color = color



                            throw RuntimeException()
}


open fun isCollisionWithAvoidRectangles(rectangle: Rectangle)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
var rectangle = rectangle

    var isCollsionWithAvoidRectangles: Boolean = false


    var avoidVector: Vector = this.getAvoidVector()!!


    var size: Int = avoidVector!!.size!!





                        for (index in 0 until size)

        

        Updates for KMP build        
        {

    var avoidRectangle: Rectangle = avoidVector!!.get(index) as Rectangle


    
                        if(RectangleCollisionUtil.isCollision(avoidRectangle, rectangle))
                        
                                    {
                                    isCollsionWithAvoidRectangles= true

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return isCollsionWithAvoidRectangles
}


open fun isCollisionWithAvoidRectangles(point: GPoint)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
var point = point

    var isCollsionWithAvoidRectangles: Boolean = false


    var avoidVector: Vector = this.getAvoidVector()!!


    var size: Int = avoidVector!!.size!!





                        for (index in 0 until size)

        

        Updates for KMP build        
        {

    var avoidRectangle: Rectangle = avoidVector!!.get(index) as Rectangle


    
                        if(RectangleCollisionUtil.isCollision(avoidRectangle, point))
                        
                                    {
                                    isCollsionWithAvoidRectangles= true
break;

                    

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return isCollsionWithAvoidRectangles
}


open fun setAvoidVector(avoidVector: Vector)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var avoidVector = avoidVector
this.avoidVector= avoidVector
}


open fun getMaxNonMatchingPixelDeltas()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return maxNonMatchingPixelDeltas
}


open fun setMaxNonMatchingPixelDeltas(maxNonMatchingPixelDeltas: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var maxNonMatchingPixelDeltas = maxNonMatchingPixelDeltas
this.maxNonMatchingPixelDeltas= maxNonMatchingPixelDeltas
}


open fun isFrameAllowed(frame: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
var frame = frame

    var remainder: Int = ((frame +1) % this.doImageComparisonEveryNthFrame)

logUtil!!.put(" Frame: " +frame +" remainder: " +remainder +" this.doImageComparisonEveryNthFrame: " +this.doImageComparisonEveryNthFrame, this, "isCollisionWithAvoidRectangles")

    
                        if(remainder == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


                @Throws(Exception::class)
            
open fun isImageValid(bufferedImage: BufferedImage)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
var bufferedImage = bufferedImage



                            throw RuntimeException()
}


open fun log()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    var avoidVector: Vector = this.getAvoidVector()!!


    var size: Int = avoidVector!!.size!!





                        for (index in 0 until size)

        

        Updates for KMP build        
        {

    var avoidRectangle: Rectangle = avoidVector!!.get(index) as Rectangle

logUtil!!.put("Avoid Rectangle: " +avoidRectangle, this, "log")
}

}


}
                
            

