
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
        package org.allbinary.media.image.comparison.motion




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import java.awt.image.BufferedImage
interface MotionRectangleConstraintsInterface {
        

open fun getMaxMotionRectangles()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        

open fun getMinDimension()
        //nullable = true from not(false or (false and true)) = true
: Dimension

        Updates for KMP build        
        

open fun getMinArea()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        

open fun getMaxDimension()
        //nullable = true from not(false or (false and true)) = true
: Dimension

        Updates for KMP build        
        

open fun isTooSmall(rectangle: Rectangle)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        

open fun isAreaTooSmall(rectangle: Rectangle)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        

open fun isTooBig(rectangle: Rectangle)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun isValid(frame: Long, bufferedImage: BufferedImage, rectangle: Rectangle)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        

}
                
            

