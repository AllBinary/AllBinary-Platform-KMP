
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
import org.allbinary.media.image.comparison.motion.MotionRectangleConstraintsInterface

open public class MotionRectangleConstraints
            : Object
        
                , MotionRectangleConstraintsInterface {
        

    private var minDimension: Dimension

    private var maxDimension: Dimension

    private var maxMotionRectangles: Int= 0

    private var minArea: Int= 0
public constructor        ()
            : super()
        {
}


open fun getMinDimension()
        //nullable = true from not(false or (false and true)) = true
: Dimension{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.minDimension
}


open fun getMaxDimension()
        //nullable = true from not(false or (false and true)) = true
: Dimension{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.maxDimension
}


open fun isTooSmall(rectangle: Rectangle)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var rectangle = rectangle

    
                        if(rectangle.width < this.getMinDimension()!!.width || rectangle.height < this.getMinDimension()!!.height)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


open fun isAreaTooSmall(rectangle: Rectangle)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var rectangle = rectangle

    
                        if(rectangle.width *rectangle.height < this.getMinArea())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


open fun isTooBig(rectangle: Rectangle)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var rectangle = rectangle

    
                        if(rectangle.width > this.getMaxDimension()!!.width || rectangle.height > this.getMaxDimension()!!.height)
                        
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
            
open fun isValid(frame: Long, bufferedImage: BufferedImage, rectangle: Rectangle)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var frame = frame
var bufferedImage = bufferedImage
var rectangle = rectangle



                            throw RuntimeException()
}


open fun setMinDimension(minDimension: Dimension)
        //nullable = true from not(false or (false and false)) = true
{
var minDimension = minDimension
this.minDimension= minDimension
}


open fun setMaxDimension(maxDimension: Dimension)
        //nullable = true from not(false or (false and false)) = true
{
var maxDimension = maxDimension
this.maxDimension= maxDimension
}


open fun getMaxMotionRectangles()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return maxMotionRectangles
}


open fun setMaxMotionRectangles(maxMotionRectangles: Int)
        //nullable = true from not(false or (false and false)) = true
{
var maxMotionRectangles = maxMotionRectangles
this.maxMotionRectangles= maxMotionRectangles
}


open fun getMinArea()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return minArea
}


open fun setMinArea(minArea: Int)
        //nullable = true from not(false or (false and false)) = true
{
var minArea = minArea
this.minArea= minArea
}


}
                
            

