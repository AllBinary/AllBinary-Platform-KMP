
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
        
import java.awt.image.BufferedImage
import java.util.Vector
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.media.image.ImageUtil
import org.allbinary.media.image.comparison.pixel.PixelDelta
import org.allbinary.string.CommonStrings

open public class ImageComparisonResult
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val bufferedImages: Array<BufferedImage?> = arrayOfNulls(2)

    val name: String

    val isSameHeight: Boolean= false

    val isSameWidth: Boolean= false

    val imageHeight: Int

    val imageWidth: Int

    private val nonMatchingPixelVector: Vector

    private val frameOne: Long

    private val frameTwo: Long

    var pixelsThatMatch: Int= 0

    var pixelsIgnored: Int= 0

    private var tolerance: Int= 0

    private var matchingPercent: Float =  -1
public constructor        (name: String, bufferedImage: BufferedImage, bufferedImage2: BufferedImage, frameOne: Long, frameTwo: Long, tolerance: Int)
            : super()
        {
    //var name = name
    //var bufferedImage = bufferedImage
    //var bufferedImage2 = bufferedImage2
    //var frameOne = frameOne
    //var frameTwo = frameTwo
    //var tolerance = tolerance
this.name= name
this.nonMatchingPixelVector= Vector()
this.bufferedImages[0]= bufferedImage
this.bufferedImages[1]= bufferedImage2
this.frameOne= frameOne
this.frameTwo= frameTwo
this.setTolerance(0)

    var imageHeight: Int = bufferedImage!!.getHeight()!!


    var imageWidth: Int = bufferedImage!!.getWidth()!!


    
                        if(bufferedImage!!.getHeight() != bufferedImage2!!.getHeight())
                        
                                    {
                                    isSameHeight= false

    
                        if(imageHeight > bufferedImage2!!.getHeight())
                        
                                    {
                                    imageHeight= bufferedImage2!!.getHeight()

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
                                    imageWidth= bufferedImage2!!.getWidth()

                                    }
                                

                                    }
                                
                        else {
                            isSameWidth= true

                        }
                            
this.imageWidth= imageWidth
this.imageHeight= imageHeight

    
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
                        return StringMaker().
                            append("ImageComparisonInfo: ")!!.append(this.name)!!.append(" Number Of Matching Pixels: ")!!.append(this.pixelsThatMatch)!!.append("\nNumber Of Non-Matching Pixels: ")!!.append(this.getNonMatchingPixelVector()!!.size())!!.append("\nNumber Of Pixels Ignored: ")!!.append(this.pixelsIgnored)!!.append("\nMatching Percentage: ")!!.append(this.getMatchingPercent())!!.toString()
}


open fun getBufferedImages()
        //nullable = true from not(false or (false and true)) = true
: Array<BufferedImage?>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return bufferedImages
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


open fun getFrameOne()
        //nullable = true from not(false or (false and true)) = true
: Long{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return frameOne
}


open fun getFrameTwo()
        //nullable = true from not(false or (false and true)) = true
: Long{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return frameTwo
}


}
                
            

