
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
        package org.allbinary.media.image




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt.Graphics2D
import java.awt.geom.AffineTransform
import java.awt.image.BufferedImage
import javax.microedition.lcdui.Image
import org.allbinary.image.ImageCache

open public class ImageScaleUtil
            : Object
         {
        
companion object {
            
    private val instance: ImageScaleUtil = ImageScaleUtil()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ImageScaleUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private val imageUtil: ImageUtil = ImageUtil.getInstance()!!

    private val imageJ2SEUtil: ImageJ2SEUtil = ImageJ2SEUtil.getInstance()!!

    private val imageCreationUtil: ImageCreationUtil = ImageCreationUtil.getInstance()!!
private constructor ()
            : super()
        {
}


                @Throws(Exception::class)
            
    open fun createImage(imageCache: ImageCache, originalImage: Image, scaleNominatorX: Float, scaleDenominatorX: Float, scaleNominatorY: Float, scaleDenominatorY: Float, cached: Boolean)
        //nullable = true from not(false or (false and false)) = true
: Image{
    //var imageCache = imageCache
    //var originalImage = originalImage
    //var scaleNominatorX = scaleNominatorX
    //var scaleDenominatorX = scaleDenominatorX
    //var scaleNominatorY = scaleNominatorY
    //var scaleDenominatorY = scaleDenominatorY
    //var cached = cached



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.createImage(imageCache, originalImage, scaleNominatorX, scaleDenominatorX, scaleNominatorY, scaleDenominatorY, cached, true)
}


                @Throws(Exception::class)
            
    open fun createImage(imageCache: ImageCache, originalImage: Image, scaleNominatorX: Float, scaleDenominatorX: Float, scaleNominatorY: Float, scaleDenominatorY: Float, cached: Boolean, mutable: Boolean)
        //nullable = true from not(false or (false and false)) = true
: Image{
    //var imageCache = imageCache
    //var originalImage = originalImage
    //var scaleNominatorX = scaleNominatorX
    //var scaleDenominatorX = scaleDenominatorX
    //var scaleNominatorY = scaleNominatorY
    //var scaleDenominatorY = scaleDenominatorY
    //var cached = cached
    //var mutable = mutable

    var width: Int = originalImage!!.getWidth()!!


    var height: Int = originalImage!!.getHeight()!!


    var scaleX: Float = scaleNominatorX /scaleDenominatorX


    var scaleY: Float = scaleNominatorY /scaleDenominatorY


    var image: Image


    
                        if(cached)
                        
                                    {
                                    image= imageCache!!.get(this::class.toString()!!, (width *scaleX).toInt(), (height *scaleY).toInt())

                                    }
                                
                        else {
                            image= imageCache!!.get("createImage", (width *scaleX).toInt(), (height *scaleY).toInt())

                        }
                            
this.scale(originalImage, image, scaleX, scaleY, true)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}


                @Throws(Exception::class)
            
    open fun scale(originalImage: Image, originalImageArray: Array<Image?>, ximageToShowArray: Array<Image?>, unused: Int, scaleX: Float, scaleY: Float, maxScaleX: Float, maxScaleY: Float)
        //nullable = true from not(false or (false and false)) = true
{
    //var originalImage = originalImage
    //var originalImageArray = originalImageArray
    //var ximageToShowArray = ximageToShowArray
    //var unused = unused
    //var scaleX = scaleX
    //var scaleY = scaleY
    //var maxScaleX = maxScaleX
    //var maxScaleY = maxScaleY

    
                        if(maxScaleX *originalImage!!.getWidth() > originalImageArray[0]!!.getWidth() || maxScaleY *originalImage!!.getHeight() > originalImageArray[0]!!.getHeight())
                        
                                    {
                                    originalImageArray[0]= this.imageCreationUtil!!.createImage(originalImage!!.getWidth(), originalImage!!.getHeight(), maxScaleX, maxScaleY)

                                    }
                                
this.scale(originalImage, originalImageArray[0]!!, scaleX, scaleY, false)
}


    open fun scale(originalImage: Image, newMaxSizeImage: Image, scaleX: Float, scaleY: Float, clear: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
    //var originalImage = originalImage
    //var newMaxSizeImage = newMaxSizeImage
    //var scaleX = scaleX
    //var scaleY = scaleY
    //var clear = clear

    var bufferedImage: BufferedImage = this.imageUtil!!.getBufferedImage(originalImage)!!


    var newBufferedImage: BufferedImage = this.imageUtil!!.getBufferedImage(newMaxSizeImage)!!


    var at: AffineTransform = AffineTransform.getScaleInstance(scaleX, scaleY)!!


    var g: Graphics2D = newBufferedImage!!.createGraphics()!!


    
                        if(clear)
                        
                                    {
                                    g.setBackground(imageJ2SEUtil!!.TRANSPARENT_COLOR)
g.clearRect(0, 0, newBufferedImage!!.getWidth(), newBufferedImage!!.getHeight())

                                    }
                                
g.drawRenderedImage(bufferedImage, at)
g.dispose()
}


}
                
            

