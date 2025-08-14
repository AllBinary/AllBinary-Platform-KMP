
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
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt.image.BufferedImage
import java.util.Vector
import org.allbinary.logic.util.cache.PoolInterface
import org.allbinary.media.image.cache.BufferedImageCacheable
import org.allbinary.media.image.cache.BufferedImageInfo
import org.allbinary.media.image.cache.BufferedImageInfoFactory
import org.allbinary.media.image.cache.BufferedImagePoolSingleton
import org.allbinary.media.image.comparison.pixel.PixelDelta

open public class ChangedPixelsUtil
            : Object
         {
        

        companion object {
            
    private val START_X: Int = 0

    private val START_Y: Int = 0

    private val OFFSET: Int = 0

    private val SCAN_SIZE: Int = 0

    private val CLEAR_INT_ARRAY: IntArray = IntArray(1800 *1600)

                @Throws(Exception::class)
            
open fun generateBufferedImageChacheables(imageComparisonInfo: ImageComparisonResult)
        //nullable = true from not(false or (false and false)) = true
: Array<BufferedImageCacheable?>{

                    var imageComparisonInfo = imageComparisonInfo

    var bufferedImageCacheables: Array<BufferedImageCacheable?>


    var originalBufferedImage: BufferedImage = imageComparisonInfo!!.getBufferedImages()[0]!!

bufferedImageCacheables= arrayOfNulls(2)

    var bufferedImageInfo: BufferedImageInfo = BufferedImageInfoFactory.getInstance(imageComparisonInfo!!.imageWidth, imageComparisonInfo!!.imageHeight, originalBufferedImage!!.getType())!!
            


    var poolInterface: PoolInterface = BufferedImagePoolSingleton.getInstance()!!
            





                        for (index in 0 until bufferedImageCacheables!!.size)


        {
    var bufferedImageCacheable: BufferedImageCacheable = poolInterface!!.remove(bufferedImageInfo) as BufferedImageCacheable

bufferedImageCacheables[index]= bufferedImageCacheable
bufferedImageCacheables[index]!!.getBufferedImage()!!.setRGB(START_X, START_Y, bufferedImageInfo!!.getWidth(), bufferedImageInfo!!.getHeight(), CLEAR_INT_ARRAY, OFFSET, SCAN_SIZE)
}


    var vector: Vector = imageComparisonInfo!!.getNonMatchingPixelVector()!!
            


    var size: Int = vector.size!!
            





                        for (index in 0 until size)


        {
    var pixelDelta: PixelDelta = vector.get(index) as PixelDelta


    
                        if(pixelDelta!!.getColorDelta() == 
                                    null
                                )
                        
                                    {
                                    System.out.print(
                            "ColorDelta")
System.exit(0)

                                    }
                                
bufferedImageCacheables[0]!!.getBufferedImage()!!.setRGB(pixelDelta!!.getPoint()!!.getX(), pixelDelta!!.getPoint()!!.getY(), pixelDelta!!.getColorDelta()!!.getRgb1())
bufferedImageCacheables[1]!!.getBufferedImage()!!.setRGB(pixelDelta!!.getPoint()!!.getX(), pixelDelta!!.getPoint()!!.getY(), pixelDelta!!.getColorDelta()!!.getRgb2())
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return bufferedImageCacheables
}


        }
            private constructor        ()
            : super()
        {}


}
                
            

