
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        package org.allbinary.media.image




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt.image.BufferedImage
import java.awt.image.ColorModel
import java.awt.image.WritableRaster
import javax.microedition.lcdui.Image
import org.allbinary.graphics.Anchor
import org.allbinary.graphics.color.BasicColor
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.string.CommonStrings
import org.microemu.device.j2se.J2SEImmutableImage
import org.microemu.device.j2se.J2SEMutableImage

open public class ImageModifierUtil
            : Object
         {
        
companion object {
            
    private val instance: ImageModifierUtil = ImageModifierUtil()

    open fun getInstanceOrCreate()
        //nullable = true from not(false or (false and true)) = true
: ImageModifierUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val imageUtil: ImageUtil = ImageUtil.getInstance()!!

    open fun setBasicColorP(basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{
    //var basicColor = basicColor
}


    private val colorArray: IntArray = IntArray(1)

    open fun setColor(unusedOriginalImage: Image, image: Image, imageIndex: Int, basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{
    //var unusedOriginalImage = unusedOriginalImage
    //var image = image
    //var imageIndex = imageIndex
    //var basicColor = basicColor

    var newBufferedImage: BufferedImage = this.imageUtil!!.getBufferedImage(image)!!


    var r: Short = basicColor!!.red


    var g: Short = basicColor!!.green


    var b: Short = basicColor!!.blue


    var width: Int = image.getWidth()!!


    var height: Int = image.getHeight()!!


    var colorModel: ColorModel


    var dataElements: Any


    var ax: Int= 0


    var rx: Int= 0


    var gx: Int= 0


    var bx: Int= 0





                        for (index in 0 until width)

        {




                        for (index2 in 0 until height)

        {
colorModel= newBufferedImage!!.getColorModel()
dataElements= newBufferedImage!!.getRaster()!!.getDataElements(index, index2, 
                            null)
ax= colorModel!!.getAlpha(dataElements)
rx= colorModel!!.getRed(dataElements)
gx= colorModel!!.getGreen(dataElements)
bx= colorModel!!.getBlue(dataElements)

    
                        if(rx != 0 || gx != 0 || bx != 0)
                        
                                    {
                                    newBufferedImage!!.setRGB(index, index2, (ax shl 24) or (r shl 16) or (g shl 8) or (b))

                                    }
                                
}

}

}


    open fun changeColor(unusedOriginalImage: Image, image: Image, imageIndex: Int, basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{
    //var unusedOriginalImage = unusedOriginalImage
    //var image = image
    //var imageIndex = imageIndex
    //var basicColor = basicColor

    var newBufferedImage: BufferedImage = this.imageUtil!!.getBufferedImage(image)!!


    var MAX: Float = 255


    var r: Float = (basicColor!!.red.toFloat()) /MAX


    var g: Float = (basicColor!!.green.toFloat()) /MAX


    var b: Float = (basicColor!!.blue.toFloat()) /MAX


    var width: Int = image.getWidth()!!


    var height: Int = image.getHeight()!!


    var colorModel: ColorModel


    var dataElements: Any


    var ax: Int= 0


    var rx: Int= 0


    var gx: Int= 0


    var bx: Int= 0





                        for (index in 0 until width)

        {




                        for (index2 in 0 until height)

        {
colorModel= newBufferedImage!!.getColorModel()
dataElements= newBufferedImage!!.getRaster()!!.getDataElements(index, index2, 
                            null)
ax= colorModel!!.getAlpha(dataElements)
rx= colorModel!!.getRed(dataElements)
gx= colorModel!!.getGreen(dataElements)
bx= colorModel!!.getBlue(dataElements)
rx *= r
gx *= g
bx *= b
newBufferedImage!!.setRGB(index, index2, (ax shl 24) or (rx shl 16) or (gx shl 8) or (bx))
}

}

}


    open fun setAlpha(unusedOriginalImage: Image, image: Image, imageIndex: Int, alphaInt: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var unusedOriginalImage = unusedOriginalImage
    //var image = image
    //var imageIndex = imageIndex
    //var alphaInt = alphaInt

    var alpha: Byte = alphaInt.toByte()


    var newBufferedImage: BufferedImage = this.imageUtil!!.getBufferedImage(image)!!


    var width: Int = image.getWidth()!!


    var height: Int = image.getHeight()!!


    var raster: WritableRaster = newBufferedImage!!.getAlphaRaster()!!





                        for (index in 0 until width)

        {




                        for (index2 in 0 until height)

        {
raster.getPixel(index, index2, colorArray)
colorArray[0]= alpha and colorArray[0]
raster.setPixel(index, index2, colorArray)
}

}

}


    open fun getImageArray(originalImageArray: Array<Image?>)
        //nullable = true from not(false or (false and false)) = true
: Array<Image?>{
    //var originalImageArray = originalImageArray

        try {
            
    var newImageArray: Array<Image?> = arrayOfNulls(originalImageArray!!.size)


    var size: Int = newImageArray!!.size
                


    var originalImage: Image





                        for (index in 0 until size)

        {
originalImage= originalImageArray[index]!!

    var image: Image = ImageCreationUtil.getInstance()!!.getInstance(originalImage!!.getWidth(), originalImage!!.getHeight())!!

image.getGraphics()!!.drawImage(originalImage, 0, 0, Anchor.TOP_LEFT)
newImageArray[index]= image
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newImageArray
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

PreLogUtil.put(commonStrings!!.EXCEPTION, this, "getImageArray", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return originalImageArray
}

}


    open fun handleImage(imageArray: Array<Image?>, index: Int, image: Image)
        //nullable = true from not(false or (false and false)) = true
{
    //var imageArray = imageArray
    //var index = index
    //var image = image
}


    open fun reset()
        //nullable = true from not(false or (false and true)) = true
{
}


}
                
            

