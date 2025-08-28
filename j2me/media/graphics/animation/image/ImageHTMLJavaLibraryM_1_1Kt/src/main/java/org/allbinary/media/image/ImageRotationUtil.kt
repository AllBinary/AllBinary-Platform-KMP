
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
        
        import java.lang.Math
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Image
import org.microemu.device.playn.PlaynImmutableImage
import org.microemu.device.playn.PlaynMutableImage
import playn.core.CanvasImage
import playn.core.CanvasSurface

open public class ImageRotationUtil
            : Object
         {
        

        companion object {
            
    private val instance: ImageRotationUtil = ImageRotationUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ImageRotationUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        {
}


open fun rotateImage(originalImage: Image, image: Image, totalAngle: Int)
        //nullable = true from not(false or (false and false)) = true
: Image{
    //var originalImage = originalImage
    //var image = image
    //var totalAngle = totalAngle

    
                        if(image.isMutable())
                        
                                    {
                                    
    var htmlImage: PlaynMutableImage = image as PlaynMutableImage


    var canvasImage: CanvasImage = htmlImage!!.getImage() as CanvasImage


    var canvasSurface: CanvasSurface = htmlImage!!.getCanvasSurface(canvasImage)!!

canvasSurface!!.translate(originalImage!!.getWidth() /2, originalImage!!.getHeight() /2)

    var image2: Image = this.rotateImage(originalImage, image, canvasSurface, totalAngle)!!

this.drawImage(originalImage, image, canvasSurface)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image2

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                        }
                            
}


open fun rotateImageClear(originalImage: Image, image: Image, canvasSurface: CanvasSurface, totalAngle: Int)
        //nullable = true from not(false or (false and false)) = true
: Image{
    //var originalImage = originalImage
    //var image = image
    //var canvasSurface = canvasSurface
    //var totalAngle = totalAngle

    
                        if(image.isMutable())
                        
                                    {
                                    canvasSurface!!.translate( -originalImage!!.getWidth() /2,  -originalImage!!.getHeight() /2)
canvasSurface!!.clear()
canvasSurface!!.translate(originalImage!!.getWidth() /2, originalImage!!.getHeight() /2)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.rotateImage(originalImage, image, canvasSurface, totalAngle)

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                        }
                            
}


open fun rotateImage(originalImage: Image, image: Image, canvasSurface: CanvasSurface, totalAngle: Int)
        //nullable = true from not(false or (false and false)) = true
: Image{
    //var originalImage = originalImage
    //var image = image
    //var canvasSurface = canvasSurface
    //var totalAngle = totalAngle

    
                        if(image.isMutable())
                        
                                    {
                                    canvasSurface!!.rotate(Math.toRadians(totalAngle).toFloat())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                        }
                            
}


open fun drawImage(originalImage: Image, image: Image, canvasSurface: CanvasSurface)
        //nullable = true from not(false or (false and false)) = true
{
    //var originalImage = originalImage
    //var image = image
    //var canvasSurface = canvasSurface

    var originalPlayNImage: playn.core.Image = 
                null
            


    
                        if(originalImage!!.isMutable())
                        
                                    {
                                    
    var originalHTMLImage: PlaynMutableImage = originalImage as PlaynMutableImage

originalPlayNImage= originalHTMLImage!!.getImage() as playn.core.Image

                                    }
                                
                        else {
                            
    var originalHTMLImage: PlaynImmutableImage = originalImage as PlaynImmutableImage

originalPlayNImage= originalHTMLImage!!.getImage() as playn.core.Image

                        }
                            
canvasSurface!!.drawImage(originalPlayNImage,  -originalImage!!.getWidth() /2,  -originalImage!!.getHeight() /2)
}


                @Throws(Exception::class)
            
open fun createRotatedImage(originalImage: Image, rotationInDegrees: Int)
        //nullable = true from not(false or (false and false)) = true
: Image{
    //var originalImage = originalImage
    //var rotationInDegrees = rotationInDegrees

    var image: Image = ImageCreationUtil.getInstance()!!.getInstance(originalImage!!.getWidth(), originalImage!!.getHeight())!!


    var rotatedImage: Image = this.rotateImage(originalImage, image, rotationInDegrees)!!


    
                        if(rotatedImage == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception("Not Mutable")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rotatedImage
}


}
                
            

