
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
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.opengles.OpenGLFeatureFactory
import org.allbinary.graphics.opengles.OpenGLUtil
import org.allbinary.image.opengles.OpenGLESDeviceImageTranslate
import org.allbinary.image.opengles.OpenGLESImage
import org.allbinary.image.opengles.OpenGLESImageExclusionUtil
import org.allbinary.image.opengles.OpenGLESImageProperties
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonStrings
import org.eclipse.swt.graphics.ImageData
import org.microemu.app.ui.swt.SwtDeviceComponent
import org.microemu.device.swt.PostLoadSwtImmutableImageProcessor
import org.microemu.device.swt.PostLoadSwtMutableImageProcessor
import org.microemu.device.swt.SwtImmutableImage
import org.microemu.device.swt.SwtMutableImage

open public class ImageCopyUtil
            : Object
         {
        

        companion object {
            
    private val instance: ImageCopyUtil = ImageCopyUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ImageCopyUtil

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
private constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val gameFeatureFactory: GameFeatureFactory = GameFeatureFactory.getInstance()!!

    private val features: Features = Features.getInstance()!!

    private val openGLFeatureFactory: OpenGLFeatureFactory = OpenGLFeatureFactory.getInstance()!!

    private val openGLUtil: OpenGLUtil = OpenGLUtil.getInstance()!!

    private val openGLESImageExclusionUtil: OpenGLESImageExclusionUtil = OpenGLESImageExclusionUtil.getInstance()!!

    private val NO_COPY: String = "SWT should not copy images after initial loading as the alpha is not honored"

                @Throws(Exception::class)
            
open fun createImageForRotation(originalImage: Image)
        //nullable = true from not(false or (false and false)) = true
: Image

        Updates for KMP build        
        {
    //var originalImage = originalImage

    
                        if(features.isFeature(openGLFeatureFactory!!.OPENGL))
                        
                                    {
                                    
    var image: Image = originalImage

image= openGLUtil!!.add(image)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.createImage(originalImage)

                        }
                            
}


                @Throws(Exception::class)
            
open fun createImage(originalImage: Image)
        //nullable = true from not(false or (false and false)) = true
: Image

        Updates for KMP build        
        {
    //var originalImage = originalImage

    
                        if(!features.isFeature(gameFeatureFactory!!.POST_IMAGE_LOADING_MODIFICATION))
                        
                                    {
                                    logUtil!!.put(NO_COPY, this, commonStrings!!.CONSTRUCTOR)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return originalImage

                                    }
                                

    var originalImage2: Image = originalImage


    
                        if(features.isFeature(openGLFeatureFactory!!.OPENGL))
                        
                                    {
                                    
    
                        if(originalImage!!.getType() >= OpenGLESImage.TYPE)
                        
                                    {
                                    
    var openGLESImage: OpenGLESImage = (originalImage as OpenGLESImage)

originalImage2= openGLESImage!!.openGLBitmap!!.getImage()

                                    }
                                

                                    }
                                

    var image: Image = 
                null
            


    
                        if(originalImage2!!.isMutable())
                        
                                    {
                                    
    var originalMutableImage: SwtMutableImage = originalImage2 as SwtMutableImage

image= SwtMutableImage(SwtDeviceComponent.createImage(originalMutableImage!!.image.getImageData()))

                                    }
                                
                        else {
                            
    var originalImmutableImage: SwtImmutableImage = originalImage2 as SwtImmutableImage

image= SwtMutableImage(SwtDeviceComponent.createImage(originalImmutableImage!!.image.getImageData()))

                        }
                            
image= openGLUtil!!.add(image)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}


                @Throws(Exception::class)
            
open fun createImage(originalImage: Image, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
: Image

        Updates for KMP build        
        {
    //var originalImage = originalImage
    //var width = width
    //var height = height



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.createImage(originalImage, width, height, true)
}


                @Throws(Exception::class)
            
open fun createImage(originalImage: Image, width: Int, height: Int, mutable: Boolean)
        //nullable = true from not(false or (false and false)) = true
: Image

        Updates for KMP build        
        {
    //var originalImage = originalImage
    //var width = width
    //var height = height
    //var mutable = mutable

    var originalImage2: Image = originalImage


    
                        if(!features.isFeature(gameFeatureFactory!!.POST_IMAGE_LOADING_MODIFICATION))
                        
                                    {
                                    logUtil!!.put(NO_COPY, this, commonStrings!!.CONSTRUCTOR)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return originalImage

                                    }
                                

    
                        if(features.isFeature(openGLFeatureFactory!!.OPENGL))
                        
                                    {
                                    
    
                        if(openGLESImageExclusionUtil!!.isCustomScaling(originalImage))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.createImage2(originalImage, width, height, mutable)

                                    }
                                

    
                        if(originalImage!!.getType() >= OpenGLESImage.TYPE)
                        
                                    {
                                    
    var openGLESImage: OpenGLESImage = (originalImage as OpenGLESImage)

originalImage2= openGLESImage!!.openGLBitmap!!.getImage()

                                    }
                                

                                    }
                                

    var image: Image = 
                null
            


    
                        if(originalImage2!!.isMutable() && mutable)
                        
                                    {
                                    
    var originalMutableImage: SwtMutableImage = originalImage2 as SwtMutableImage


    
                        if(originalMutableImage!!.getImage() != 
                                    null
                                )
                        
                                    {
                                    
    var imageData: ImageData = originalMutableImage!!.image.getImageData()!!.scaledTo(width, height)!!

image= SwtMutableImage(SwtDeviceComponent.createImage(imageData))

                                    }
                                
                        else {
                            image= SwtMutableImage(originalMutableImage!!.getName(), PostLoadSwtMutableImageProcessor(originalMutableImage))

                        }
                            

                                    }
                                
                        else {
                            
    var originalImmutableImage: SwtImmutableImage = originalImage2 as SwtImmutableImage


    
                        if(originalImmutableImage!!.getImage() != 
                                    null
                                )
                        
                                    {
                                    
    var imageData: ImageData = originalImmutableImage!!.image.getImageData()!!.scaledTo(width, height)!!

image= SwtImmutableImage(originalImage!!.getName(), SwtDeviceComponent.createImage(imageData))

                                    }
                                
                        else {
                            image= SwtImmutableImage(originalImmutableImage!!.getName(), PostLoadSwtImmutableImageProcessor(originalImmutableImage))

                        }
                            

                        }
                            
image= openGLUtil!!.add(image)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}


    private val INFORMATION: String = "about_"

    private val LEADERBOARD: String = "leaderboard"

                @Throws(Exception::class)
            
open fun createImage2(originalImage: Image, width: Int, height: Int, mutable: Boolean)
        //nullable = true from not(false or (false and false)) = true
: Image

        Updates for KMP build        
        {
    //var originalImage = originalImage
    //var width = width
    //var height = height
    //var mutable = mutable

    var originalImage2: Image = originalImage


    
                        if(!features.isFeature(gameFeatureFactory!!.POST_IMAGE_LOADING_MODIFICATION))
                        
                                    {
                                    logUtil!!.put(NO_COPY, this, commonStrings!!.CONSTRUCTOR)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return originalImage

                                    }
                                

    var image: Image = 
                null
            


    
                        if(features.isFeature(openGLFeatureFactory!!.OPENGL))
                        
                                    {
                                    
    var displayInfoSingleton: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!


    
                        if(originalImage!!.getType() >= OpenGLESImage.TYPE)
                        
                                    {
                                    
    var width2: Int = originalImage!!.getWidth()!!


    var height2: Int = originalImage!!.getHeight()!!


    var openGLESImage: OpenGLESImage = (originalImage as OpenGLESImage)


    var openGLESImageProperties: OpenGLESImageProperties = openGLESImage!!.openGLESImageProperties

openGLESImageProperties!!.scaleX= openGLESImageProperties!!.scaleX2= ((width.toFloat()) /openGLESImage!!.getWidth()).toFloat()
openGLESImageProperties!!.scaleY= openGLESImageProperties!!.scaleY2= ((height.toFloat()) /openGLESImage!!.getHeight()).toFloat()
openGLESImageProperties!!.scaleX= openGLESImageProperties!!.scaleX *0.75f
openGLESImageProperties!!.scaleY= openGLESImageProperties!!.scaleY *0.75f

    
                        if(originalImage!!.getHeight() % 2 != 0)
                        
                                    {
                                    openGLESImageProperties!!.scaleX2 += 1 /(width2.toFloat())
openGLESImageProperties!!.scaleY2 += 1 /(height2.toFloat())

                                    }
                                
image= openGLESImage

                                    }
                                
                        else {
                            image= originalImage

    var openGLESImage: OpenGLESImage = openGLUtil!!.add(image) as OpenGLESImage


    var openGLESImageProperties: OpenGLESImageProperties = openGLESImage!!.openGLESImageProperties

openGLESImageProperties!!.scaleX= openGLESImageProperties!!.scaleX2= ((width.toFloat()) /openGLESImage!!.getWidth()).toFloat()
openGLESImageProperties!!.scaleY= openGLESImageProperties!!.scaleY2= ((height.toFloat()) /openGLESImage!!.getHeight()).toFloat()

    
                        if(image.getName()!!.startsWith(INFORMATION))
                        
                                    {
                                    openGLESImage!!.openGLESImageTranslate= OpenGLESDeviceImageTranslate()

    var openGLESDeviceImageTranslate: OpenGLESDeviceImageTranslate = openGLESImage!!.openGLESImageTranslate as OpenGLESDeviceImageTranslate

openGLESDeviceImageTranslate!!.translateX= displayInfoSingleton!!.getLastWidth() /1.4f /openGLESImageProperties!!.scaleX
openGLESDeviceImageTranslate!!.translateY= displayInfoSingleton!!.getLastHeight() /4 /openGLESImageProperties!!.scaleY
openGLESImageProperties!!.scaleX= openGLESImageProperties!!.scaleX *0.25f
openGLESImageProperties!!.scaleY= openGLESImageProperties!!.scaleY *0.25f

                                    }
                                
                        else {
                            openGLESImageProperties!!.scaleX= openGLESImageProperties!!.scaleX *0.75f
openGLESImageProperties!!.scaleY= openGLESImageProperties!!.scaleY *0.75f

    
                        if(image.getName()!!.startsWith(LEADERBOARD))
                        
                                    {
                                    openGLESImage!!.openGLESImageTranslate= OpenGLESDeviceImageTranslate()

    var openGLESDeviceImageTranslate: OpenGLESDeviceImageTranslate = openGLESImage!!.openGLESImageTranslate as OpenGLESDeviceImageTranslate

openGLESDeviceImageTranslate!!.translateX=  -displayInfoSingleton!!.getLastWidth() /40 /openGLESImageProperties!!.scaleX

                                    }
                                

    
                        if(image.getName()!!.startsWith(LEADERBOARD))
                        
                                    {
                                    
                                    }
                                
                        else {
                            openGLESImageProperties!!.scaleX= 1.0f
openGLESImageProperties!!.scaleY= 1.0f

                        }
                            

                        }
                            
image= openGLESImage

                        }
                            

                                    }
                                
                        else {
                            
    
                        if(originalImage2!!.isMutable() && mutable)
                        
                                    {
                                    
    var originalMutableImage: SwtMutableImage = originalImage2 as SwtMutableImage


    
                        if(originalMutableImage!!.getImage() != 
                                    null
                                )
                        
                                    {
                                    
    var imageData: ImageData = originalMutableImage!!.image.getImageData()!!.scaledTo(width, height)!!

image= SwtMutableImage(SwtDeviceComponent.createImage(imageData))

                                    }
                                
                        else {
                            image= SwtMutableImage(originalMutableImage!!.getName(), PostLoadSwtMutableImageProcessor(originalMutableImage))

                        }
                            

                                    }
                                
                        else {
                            
    var originalImmutableImage: SwtImmutableImage = originalImage2 as SwtImmutableImage


    
                        if(originalImmutableImage!!.getImage() != 
                                    null
                                )
                        
                                    {
                                    
    var imageData: ImageData = originalImmutableImage!!.image.getImageData()!!.scaledTo(width, height)!!

image= SwtImmutableImage(originalImage!!.getName(), SwtDeviceComponent.createImage(imageData))

                                    }
                                
                        else {
                            image= SwtImmutableImage(originalImmutableImage!!.getName(), PostLoadSwtImmutableImageProcessor(originalImmutableImage))

                        }
                            

                        }
                            
image= openGLUtil!!.add(image)

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}


                @Throws(Exception::class)
            
open fun createImage(originalImage: Image, canvasScale: Float, resize: Boolean)
        //nullable = true from not(false or (false and false)) = true
: Image

        Updates for KMP build        
        {
    //var originalImage = originalImage
    //var canvasScale = canvasScale
    //var resize = resize

    
                        if(!features.isFeature(gameFeatureFactory!!.POST_IMAGE_LOADING_MODIFICATION))
                        
                                    {
                                    logUtil!!.put(NO_COPY, this, commonStrings!!.CONSTRUCTOR)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return originalImage

                                    }
                                

    var newWidth: Int = (originalImage!!.getWidth() *canvasScale).toInt()


    var newHeight: Int = (originalImage!!.getHeight() *canvasScale).toInt()


    
                        if(resize)
                        
                                    {
                                    
    
                        if(newWidth < newHeight)
                        
                                    {
                                    newWidth= newHeight

                                    }
                                

    
                        if(newHeight < newWidth)
                        
                                    {
                                    newHeight= newWidth

                                    }
                                

                                    }
                                

    var image: Image = this.createImage(originalImage, newWidth, newHeight)!!


    
                        if(image.isMutable())
                        
                                    {
                                    
    var originalImageData: ImageData = 
                                    (getImage as Image).getImageData()!!


    var mutableImage2: SwtMutableImage = image as SwtMutableImage


    var halfWidthDelta: Int = (newWidth -originalImage!!.getWidth()) /2


    var halfHeightDelta: Int = (newHeight -originalImage!!.getHeight()) /2


    var originalPixelArray: IntArray = IntArray(originalImage!!.getWidth() *originalImage!!.getHeight())


    var newPixelArray: IntArray = IntArray(image.getWidth() *image.getHeight())


    var width: Int = originalImage!!.getWidth()!!


    var height: Int = originalImage!!.getHeight()!!





                        for (i in 0 until height)

        

        Updates for KMP build        
        {
originalImageData!!.getPixels(0, i, width, originalPixelArray, (i *width))
}





                        for (index in halfWidthDelta until width)

        

        Updates for KMP build        
        {




                        for (index2 in halfHeightDelta until height)

        

        Updates for KMP build        
        {
newPixelArray[index +(index2 *width)]= originalPixelArray[(index -halfWidthDelta) +((index2 -halfHeightDelta) *width)]!!
}

}

getImage = mutableImage2!!.getImage()getImage as org.eclipse.swt.graphics.Image
getImage.
                    getImageData()!!.setPixels(0, 0, image.getWidth(), newPixelArray, 0)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image

                                    }
                                
                        else {
                            


                            throw Exception("Not Mutable")

                        }
                            
}


}
                
            

