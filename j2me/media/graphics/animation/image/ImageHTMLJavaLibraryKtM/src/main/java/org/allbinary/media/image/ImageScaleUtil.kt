
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
import org.allbinary.graphics.Anchor
import org.allbinary.image.ImageCache
import org.allbinary.logic.communication.log.PreLogUtil
import org.microemu.device.playn.PlaynImmutableImage
import org.microemu.device.playn.PlaynMutableImage
import playn.core.CanvasImage
import playn.core.CanvasSurface

open public class ImageScaleUtil
            : Object
         {
        

        companion object {
            
    private val instance: ImageScaleUtil = ImageScaleUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ImageScaleUtil

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


                @Throws(Exception::class)
            
open fun createImage(imageCache: ImageCache, originalImage: Image, scaleNominatorX: Float, scaleDenominatorX: Float, scaleNominatorY: Float, scaleDenominatorY: Float, cached: Boolean)
        //nullable = true from not(false or (false and false)) = true
: Image

        Updates for KMP build        
        {
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
: Image

        Updates for KMP build        
        {
    //var imageCache = imageCache
    //var originalImage = originalImage
    //var scaleNominatorX = scaleNominatorX
    //var scaleDenominatorX = scaleDenominatorX
    //var scaleNominatorY = scaleNominatorY
    //var scaleDenominatorY = scaleDenominatorY
    //var cached = cached
    //var mutable = mutable

    var scaleX: Float = scaleNominatorX /scaleDenominatorX


    var scaleY: Float = scaleNominatorY /scaleDenominatorY




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.createImage(imageCache, originalImage, scaleX, scaleY, cached)
}


                @Throws(Exception::class)
            
open fun createImage(imageCache: ImageCache, originalImage: Image, scaleX: Float, scaleY: Float, cached: Boolean)
        //nullable = true from not(false or (false and false)) = true
: Image

        Updates for KMP build        
        {
var imageCache = imageCache
var originalImage = originalImage
var scaleX = scaleX
var scaleY = scaleY
var cached = cached



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.createImage(originalImage, scaleX, scaleY)
}


                @Throws(Exception::class)
            
open fun createImage(originalImage: Image, scaleX: Float, scaleY: Float)
        //nullable = true from not(false or (false and false)) = true
: Image

        Updates for KMP build        
        {
var originalImage = originalImage
var scaleX = scaleX
var scaleY = scaleY

    var image: Image = ImageCreationUtil.getInstance()!!.getInstance((originalImage!!.getWidth() *scaleX).toInt(), (originalImage!!.getHeight() *scaleY).toInt())!!


    
                        if(image.isMutable())
                        
                                    {
                                    
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
                            

    var htmlImage: PlaynMutableImage = image as PlaynMutableImage


    var canvasImage: CanvasImage = htmlImage!!.getImage() as CanvasImage


    var canvasSurface: CanvasSurface = htmlImage!!.getCanvasSurface(canvasImage)!!

canvasSurface!!.drawImage(originalPlayNImage, 0, 0, image.getWidth(), image.getHeight(), 0, 0, originalPlayNImage!!.width(), originalPlayNImage!!.height())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image

                                    }
                                
                        else {
                            


                            throw Exception("Not Mutable")

                        }
                            
}


}
                
            

