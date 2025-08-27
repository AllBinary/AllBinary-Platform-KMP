
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
        
import org.allbinary.logic.string.StringMaker
import javax.microedition.lcdui.Image
import org.allbinary.game.configuration.feature.Features
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.opengles.OpenGLFeatureFactory
import org.allbinary.image.opengles.ModifierOpenGLESImageProcessor
import org.allbinary.image.opengles.OpenGLESImage
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.PreLogUtil
import org.eclipse.swt.graphics.ImageData
import org.microemu.device.swt.SwtImmutableImage
import org.microemu.device.swt.SwtMutableImage

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
        
    private val imageCopyUtil: ImageCopyUtil = ImageCopyUtil.getInstance()!!

    private val features: Features = Features.getInstance()!!

open fun setBasicColorP(basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{

                    var basicColor = basicColor
}


open fun setColor(unusedOriginalImage: Image, image: Image, imageIndex: Int, basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{

                    var unusedOriginalImage = unusedOriginalImage


                    var image = image


                    var imageIndex = imageIndex


                    var basicColor = basicColor

    var newBufferedImage: org.eclipse.swt.graphics.Image


    
                        if(image.isMutable())
                        
                                    {
                                    
    var swtImage: SwtMutableImage = image as SwtMutableImage

newBufferedImage= swtImage!!.getImage() as org.eclipse.swt.graphics.Image

                                    }
                                
                        else {
                            
    var swtImage: SwtImmutableImage = image as SwtImmutableImage

newBufferedImage= swtImage!!.getImage() as org.eclipse.swt.graphics.Image

                        }
                            

    var r: Short = basicColor!!.red


    var g: Short = basicColor!!.green


    var b: Short = basicColor!!.blue


    var width: Int = image.getWidth()!!


    var height: Int = image.getHeight()!!


    var imageData: ImageData = newBufferedImage!!.getImageData()!!


    
                        if(imageData!!.depth == 24)
                        
                                    {
                                    
    var rx: Int= 0


    var gx: Int= 0


    var bx: Int= 0


    var index3: Int= 0





                        for (index in 0 until width)

        {



                        for (index2 in 0 until height)

        {index3= (index2 *imageData!!.bytesPerLine) +(index *4)
rx= (imageData!!.data[index3] and 0xFF) shl 16
gx= (imageData!!.data[index3 +1] and 0xFF) shl 8
bx= (imageData!!.data[index3 +2] and 0xFF)

    
                        if(rx != 0 || gx != 0 || bx != 0)
                        
                                    {
                                    imageData!!.data[index3]= r as Byte
imageData!!.data[index3 +1]= g as Byte
imageData!!.data[index3 +2]= b as Byte

                                    }
                                
}

}


                                    }
                                
}


open fun changeColor(unusedOriginalImage: Image, image: Image, imageIndex: Int, basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{

                    var unusedOriginalImage = unusedOriginalImage


                    var image = image


                    var imageIndex = imageIndex


                    var basicColor = basicColor

    
                        if(features.isFeature(OpenGLFeatureFactory.getInstance()!!.OPENGL))
                        
                                    {
                                    
    
                        if(image.getType() >= OpenGLESImage.TYPE)
                        
                                    {
                                    
    var openGLESImage: OpenGLESImage = (image as OpenGLESImage)

openGLESImage!!.imageProcessor= ModifierOpenGLESImageProcessor.getInstance()
openGLESImage!!.openGLESImageProperties!!.redf= basicColor!!.getRedComponent()
openGLESImage!!.openGLESImageProperties!!.greenf= basicColor!!.getGreenComponent()
openGLESImage!!.openGLESImageProperties!!.bluef= basicColor!!.getBlueComponent()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

                                    }
                                

    var newBufferedImage: org.eclipse.swt.graphics.Image


    
                        if(image.isMutable())
                        
                                    {
                                    
    var swtImage: SwtMutableImage = image as SwtMutableImage

newBufferedImage= swtImage!!.getImage() as org.eclipse.swt.graphics.Image

                                    }
                                
                        else {
                            
    var swtImage: SwtImmutableImage = image as SwtImmutableImage

newBufferedImage= swtImage!!.getImage() as org.eclipse.swt.graphics.Image

                        }
                            

    var MAX: Float = 255


    var r: Float = (basicColor!!.red.toFloat()) /MAX


    var g: Float = (basicColor!!.green.toFloat()) /MAX


    var b: Float = (basicColor!!.blue.toFloat()) /MAX


    var width: Int = image.getWidth()!!


    var height: Int = image.getHeight()!!


    var rx: Int= 0


    var gx: Int= 0


    var bx: Int= 0


    var imageData: ImageData = newBufferedImage!!.getImageData()!!


    
                        if(imageData!!.depth == 24)
                        
                                    {
                                    
    var index3: Int= 0





                        for (index in 0 until width)

        {



                        for (index2 in 0 until height)

        {index3= (index2 *imageData!!.bytesPerLine) +(index *4)
rx= (imageData!!.data[index3] and 0xFF) shl 16
gx= (imageData!!.data[index3 +1] and 0xFF) shl 8
bx= (imageData!!.data[index3 +2] and 0xFF)
rx *= r
gx *= g
bx *= b
imageData!!.data[index3]= rx as Byte
imageData!!.data[index3 +1]= gx as Byte
imageData!!.data[index3 +2]= bx as Byte
}

}


                                    }
                                
}


open fun setAlpha(unusedOriginalImage: Image, image: Image, imageIndex: Int, alphaInt: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var unusedOriginalImage = unusedOriginalImage


                    var image = image


                    var imageIndex = imageIndex


                    var alphaInt = alphaInt

    
                        if(features.isFeature(OpenGLFeatureFactory.getInstance()!!.OPENGL))
                        
                                    {
                                    
    
                        if(image.getType() >= OpenGLESImage.TYPE)
                        
                                    {
                                    
    var openGLESImage: OpenGLESImage = (image as OpenGLESImage)

openGLESImage!!.imageProcessor= ModifierOpenGLESImageProcessor.getInstance()
openGLESImage!!.openGLESImageProperties!!.alphaf= (alphaInt.toFloat()) /255f



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

                                    }
                                
this.setAlpha(image, alphaInt)
}


open fun setAlpha(image: Image, alphaInt: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var image = image


                    var alphaInt = alphaInt

    var alpha: Byte = alphaInt as Byte


    var newBufferedImage: org.eclipse.swt.graphics.Image


    
                        if(image.isMutable())
                        
                                    {
                                    
    var swtImage: SwtMutableImage = image as SwtMutableImage

newBufferedImage= swtImage!!.getImage() as org.eclipse.swt.graphics.Image

                                    }
                                
                        else {
                            
    var swtImage: SwtImmutableImage = image as SwtImmutableImage

newBufferedImage= swtImage!!.getImage() as org.eclipse.swt.graphics.Image

                        }
                            
newBufferedImage!!.getImageData()!!.alpha= alpha
}


open fun getImageArray(originalImageArray: Array<Image?>)
        //nullable = true from not(false or (false and false)) = true
: Array<Image?>{

                    var originalImageArray = originalImageArray

        try {
            
    var newImageArray: Array<Image?> = arrayOfNulls(originalImageArray!!.size)


    var size: Int = newImageArray!!.size
                


    var originalImage: Image





                        for (index in 0 until size)

        {originalImage= originalImageArray[index]!!

    var image: Image = this.imageCopyUtil!!.createImage(originalImage)!!

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

                    var imageArray = imageArray


                    var index = index


                    var image = image
}


open fun reset()
        //nullable = true from not(false or (false and true)) = true
{}


}
                
            

