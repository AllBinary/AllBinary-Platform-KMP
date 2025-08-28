
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
        
import javax.microedition.lcdui.Image
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.GameFeatureFactory
import org.allbinary.image.ImageCache
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.GC
import org.eclipse.swt.graphics.Transform
import org.microemu.device.swt.SwtImmutableImage
import org.microemu.device.swt.SwtMutableImage

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
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val imageCopyUtil: ImageCopyUtil = ImageCopyUtil.getInstance()!!

    private val gameFeatureFactory: GameFeatureFactory = GameFeatureFactory.getInstance()!!

    private val features: Features = Features.getInstance()!!

    private val NO_COPY: String = "SWT should not copy images after initial loading as the alpha is not honored"
private constructor        ()
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

    
                        if(!features.isFeature(gameFeatureFactory!!.POST_IMAGE_LOADING_MODIFICATION))
                        
                                    {
                                    logUtil!!.put(NO_COPY, this, commonStrings!!.CONSTRUCTOR)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return originalImage

                                    }
                                

    var width: Int = originalImage!!.getWidth()!!


    var height: Int = originalImage!!.getHeight()!!


    var scaleX: Float = scaleNominatorX /scaleDenominatorX


    var scaleY: Float = scaleNominatorY /scaleDenominatorY


    var scaledImage: Image = this.imageCopyUtil!!.createImage(originalImage, (scaleX *width).toInt(), (scaleY *height).toInt(), mutable)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return scaledImage
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
this.scale(originalImage, originalImageArray, ximageToShowArray, unused, scaleX, scaleY, maxScaleX, maxScaleY, true)
}


                @Throws(Exception::class)
            
open fun scale(originalImage: Image, originalImageArray: Array<Image?>, ximageToShowArray: Array<Image?>, unused: Int, scaleX: Float, scaleY: Float, maxScaleX: Float, maxScaleY: Float, mutable: Boolean)
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
    //var mutable = mutable

    var width: Int = originalImage!!.getWidth()!!


    var height: Int = originalImage!!.getHeight()!!


    var scaledImage: Image = this.imageCopyUtil!!.createImage(originalImage, (scaleX *width).toInt(), (scaleY *height).toInt(), mutable)!!

originalImageArray[0]= scaledImage
}


}
                
            

