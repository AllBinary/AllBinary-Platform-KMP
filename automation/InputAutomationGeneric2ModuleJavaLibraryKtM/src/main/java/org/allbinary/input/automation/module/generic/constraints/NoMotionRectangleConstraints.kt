
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
        package org.allbinary.input.automation.module.generic.constraints




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import java.awt.image.BufferedImage
import org.allbinary.input.automation.module.MotionRectangleConstraints

open public class NoMotionRectangleConstraints : MotionRectangleConstraints {
        
public constructor        ()

        Updates for KMP build        
        {
this.setMinDimension(Dimension(0, 0))
this.setMinArea(0)
this.setMaxDimension(Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE))
this.setMaxMotionRectangles(.MAX_VALUE())
}


open fun isValid(frame: Long, bufferedImage: BufferedImage, rectangle: Rectangle)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
var frame = frame
var bufferedImage = bufferedImage
var rectangle = rectangle



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


}
                
            

