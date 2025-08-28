
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
        
        import java.lang.Integer
        
        import java.lang.Math
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import java.awt.image.BufferedImage
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.color.ColorCacheFactory
import org.allbinary.graphics.color.ColorCacheable
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.util.cache.AutomaticCacheInterface
import org.allbinary.media.image.comparison.pixel.PixelDeltaFactory

open public class ImageComparator
            : Object
         {
        

    private val imageComparatorConstraintsInterface: ImageComparatorConstraintsInterface
public constructor        (imageComparatorConstraintsInterface: ImageComparatorConstraintsInterface)
            : super()
        

        Updates for KMP build        
        {
    //var imageComparatorConstraintsInterface = imageComparatorConstraintsInterface
this.imageComparatorConstraintsInterface= imageComparatorConstraintsInterface
}


                @Throws(Exception::class)
            
open fun process(imageComparisonInfo: ImageComparisonResult, point: GPoint)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var imageComparisonInfo = imageComparisonInfo
    //var point = point

    var isCollsionWithAvoidRectangles: Boolean = this.imageComparatorConstraintsInterface!!.isCollisionWithAvoidRectangles(point)!!


    
                        if(!isCollsionWithAvoidRectangles)
                        
                                    {
                                    
    var rgb1: Int = imageComparisonInfo!!.getBufferedImages()[0]!!.getRGB(point.getX(), point.getY())!!


    var rgb2: Int = imageComparisonInfo!!.getBufferedImages()[1]!!.getRGB(point.getX(), point.getY())!!


    var automaticCacheInterface: AutomaticCacheInterface = ColorCacheFactory.getInstance()!!


    var colorInteger: Integer = Integer(Integer.valueOf(rgb1))!!


    var colorCacheable: ColorCacheable = automaticCacheInterface!!.get(colorInteger) as ColorCacheable


    var color: Color = colorCacheable!!.getColor()!!


    var colorInteger2: Integer = Integer(Integer.valueOf(rgb2))!!


    var colorCacheable2: ColorCacheable = automaticCacheInterface!!.get(colorInteger) as ColorCacheable


    var color2: Color = colorCacheable!!.getColor()!!


    
                        if(this.imageComparatorConstraintsInterface!!.isColorAllowed(0, point, color) || this.imageComparatorConstraintsInterface!!.isColorAllowed(1, point, color2))
                        
                                    {
                                    
    
                        if(Math.abs(rgb1 -rgb2) <= imageComparisonInfo!!.getTolerance())
                        
                                    {
                                    imageComparisonInfo!!.pixelsThatMatch++

                                    }
                                
                        else {
                            imageComparisonInfo!!.add(PixelDeltaFactory.getInstance(point.getX(), point.getY(), rgb1, rgb2))

                        }
                            

                                    }
                                

                                    }
                                
                        else {
                            imageComparisonInfo!!.pixelsIgnored++

                        }
                            
}


                @Throws(Exception::class)
            
open fun compare(bufferedImage1: BufferedImage, bufferedImage2: BufferedImage, frameOne: Long, frameTwo: Long, tolerance: Int)
        //nullable = true from not(false or (false and false)) = true
: ImageComparisonResult

        Updates for KMP build        
        {
    //var bufferedImage1 = bufferedImage1
    //var bufferedImage2 = bufferedImage2
    //var frameOne = frameOne
    //var frameTwo = frameTwo
    //var tolerance = tolerance



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.compare(bufferedImage1, bufferedImage2, frameOne, frameTwo, tolerance, StringUtil.getInstance()!!.EMPTY_STRING)
}


                @Throws(Exception::class)
            
open fun compare(bufferedImage1: BufferedImage, bufferedImage2: BufferedImage, frameOne: Long, frameTwo: Long, tolerance: Int, name: String)
        //nullable = true from not(false or (false and false)) = true
: ImageComparisonResult

        Updates for KMP build        
        {
    //var bufferedImage1 = bufferedImage1
    //var bufferedImage2 = bufferedImage2
    //var frameOne = frameOne
    //var frameTwo = frameTwo
    //var tolerance = tolerance
    //var name = name

    
                        if(bufferedImage1 == 
                                    null
                                 || bufferedImage2 == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception("Input images must not be null.")

                                    }
                                

    var imageComparisonInfo: ImageComparisonResult = ImageComparisonResult(name, bufferedImage1, bufferedImage2, frameOne, frameTwo, tolerance)





                        for (indexY in 0 until imageComparisonInfo!!.imageHeight)

        

        Updates for KMP build        
        {




                        for (indexX in 0 until imageComparisonInfo!!.imageWidth)

        

        Updates for KMP build        
        {
this.process(imageComparisonInfo, PointFactory.getInstance()!!.getInstance(indexX, indexY))

    
                        if(imageComparisonInfo!!.getNonMatchingPixelVector()!!.size() > this.imageComparatorConstraintsInterface!!.getMaxNonMatchingPixelDeltas())
                        
                                    {
                                    break;

                    

                                    }
                                
}

}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return imageComparisonInfo
}


}
                
            

