
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
        package org.allbinary.media.image.comparison




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import java.awt.image.BufferedImage
import org.allbinary.graphics.GPoint
interface ImageComparatorConstraintsInterface {
        

open fun getMaxNonMatchingPixelDeltas()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        

open fun isCollisionWithAvoidRectangles(rectangle: Rectangle)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        

open fun isCollisionWithAvoidRectangles(point: GPoint)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        

open fun isColorAllowed(frame: Int, point: GPoint, color: Color)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun isImageValid(bufferedImage: BufferedImage)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        

open fun isFrameAllowed(frame: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        

}
                
            

