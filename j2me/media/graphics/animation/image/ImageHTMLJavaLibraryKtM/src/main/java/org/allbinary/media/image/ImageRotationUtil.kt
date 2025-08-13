
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
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
        {}


                @Throws(Exception::class)
            
open fun createRotatedImage(originalImage: Image, rotationInDegrees: Int)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var originalImage = originalImage


                    var rotationInDegrees = rotationInDegrees

    var image: Image = ImageCreationUtil.getInstance()!!.getInstance(originalImage!!.getWidth(), originalImage!!.getHeight())!!
            


    
                        if(image.isMutable())
                        
                                    {
                                    
    var originalPlayNImage: playn.core.Image = 
                null
            


    
                        if(originalImage!!.isMutable())
                        
                                    {
                                    
    var originalHTMLImage: PlaynMutableImage = originalImage as PlaynMutableImage

originalPlayNImage= originalHTMLImage!!.getImage() as Image

                                    }
                                
                        else {
                            
    var originalHTMLImage: PlaynImmutableImage = originalImage as PlaynImmutableImage

originalPlayNImage= originalHTMLImage!!.getImage() as Image

                        }
                            

    var htmlImage: PlaynMutableImage = image as PlaynMutableImage


    var canvasImage: CanvasImage = htmlImage!!.getImage() as CanvasImage


    var canvasSurface: CanvasSurface = htmlImage!!.getCanvasSurface(canvasImage)!!
            

canvasSurface!!.translate(originalPlayNImage!!.width() /2, originalPlayNImage!!.height() /2)
canvasSurface!!.rotate(Math.toRadians(rotationInDegrees).toFloat())
canvasSurface!!.drawImage(originalPlayNImage,  -originalPlayNImage!!.width() /2,  -originalPlayNImage!!.height() /2)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image

                                    }
                                
                        else {
                            


                            throw Exception(
                            "Not Mutable")

                        }
                            
}


}
                
            

