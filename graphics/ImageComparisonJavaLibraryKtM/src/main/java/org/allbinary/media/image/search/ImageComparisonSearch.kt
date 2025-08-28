
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
        package org.allbinary.media.image.search




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt.image.BufferedImage
import java.util.Vector
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.media.image.ImageUtil
import org.allbinary.media.image.comparison.pixel.PixelDelta
import org.allbinary.string.CommonStrings

open public class ImageComparisonSearch
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    var isSameHeight: Boolean= false

    var isSameWidth: Boolean= false

    var pixelsThatMatch: Int= 0

    var pixelsIgnored: Int= 0

    var imageHeight: Int

    var imageWidth: Int

    private var tolerance: Int= 0

    private var nonMatchingPixelVector: Vector

    private var bufferedImages: Array<BufferedImage?>

    private var matchingPercent: Float =  -1
public constructor        (bufferedImage: BufferedImage, bufferedImage2: BufferedImage, tolerance: Int)
            : super()
        {
var bufferedImage = bufferedImage
var bufferedImage2 = bufferedImage2
var tolerance = tolerance
this.nonMatchingPixelVector= Vector()
this.setBufferedImages(arrayOfNulls(2))
this.getBufferedImages()[0]= bufferedImage
this.getBufferedImages()[1]= bufferedImage2
this.imageHeight= bufferedImage!!.getHeight()
this.imageWidth= bufferedImage!!.getWidth()

    
                        if(bufferedImage!!.getHeight() != bufferedImage2!!.getHeight())
                        
                                    {
                                    isSameHeight= false

    
                        if(imageHeight > bufferedImage2!!.getHeight())
                        
                                    {
                                    this.imageHeight= bufferedImage2!!.getHeight()

                                    }
                                

                                    }
                                
                        else {
                            isSameHeight= true

                        }
                            

    
                        if(bufferedImage!!.getWidth() != bufferedImage2!!.getWidth())
                        
                                    {
                                    isSameWidth= false

    
                        if(imageWidth > bufferedImage2!!.getWidth())
                        
                                    {
                                    this.imageWidth= bufferedImage2!!.getWidth()

                                    }
                                

                                    }
                                
                        else {
                            isSameWidth= true

                        }
                            

    
                        if(!isSameWidth || !isSameHeight)
                        
                                    {
                                    
    var imageUtil: ImageUtil = ImageUtil.getInstance()!!

logUtil!!.put("Images were not the same size? Most likely a resolution change.", this, this.commonStrings!!.CONSTRUCTOR)
logUtil!!.put("1: " +imageUtil!!.toString(bufferedImage), this, this.commonStrings!!.CONSTRUCTOR)
logUtil!!.put("2: " +imageUtil!!.toString(bufferedImage2), this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
}


open fun getMatchingPercent()
        //nullable = true from not(false or (false and true)) = true
: Float{

    
                        if(this.matchingPercent ==  -1)
                        
                                    {
                                    this.matchingPercent= pixelsThatMatch.toFloat() /(this.imageWidth *this.imageHeight)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.matchingPercent
}


open fun add(pixel: PixelDelta)
        //nullable = true from not(false or (false and false)) = true
{
var pixel = pixel
this.nonMatchingPixelVector!!.add(pixel)
}


open fun getNonMatchingPixelVector()
        //nullable = true from not(false or (false and true)) = true
: Vector{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.nonMatchingPixelVector
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "ImageComparisonInfo: " +" Number Of Matching Pixels: " +this.pixelsThatMatch +"\nNumber Of Non-Matching Pixels: " +this.getNonMatchingPixelVector()!!.size() +"\nNumber Of Pixels Ignored: " +this.pixelsIgnored +"\nMatching Percentage: " +this.getMatchingPercent()
}


open fun getBufferedImages()
        //nullable = true from not(false or (false and true)) = true
: Array<BufferedImage?>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return bufferedImages
}


open fun setBufferedImages(bufferedImages: Array<BufferedImage?>)
        //nullable = true from not(false or (false and false)) = true
{
var bufferedImages = bufferedImages
this.bufferedImages= bufferedImages
}


open fun getTolerance()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return tolerance
}


open fun setTolerance(tolerance: Int)
        //nullable = true from not(false or (false and false)) = true
{
var tolerance = tolerance
this.tolerance= tolerance
}


}
                
            

