
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
        package org.allbinary.animation.image




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.Image
import org.allbinary.animation.AnimationBehavior
import org.allbinary.math.AngleInfo
import org.allbinary.graphics.color.BasicColor
import org.allbinary.media.image.ImageCopyUtil
import org.allbinary.media.image.ImageCreationUtil
import org.allbinary.media.image.ImageModifierUtil
import org.allbinary.media.image.ImageRotationUtil
import org.microemu.device.playn.PlaynMutableImage
import playn.core.CanvasImage
import playn.core.CanvasSurface

open public class AllBinaryHTMLImageRotationAnimation : ImageBaseRotationAnimation {
        

    private val imageRotationUtil: ImageRotationUtil = ImageRotationUtil.getInstance()!!

    private val imageModifierUtil: ImageModifierUtil = ImageModifierUtil.getInstanceOrCreate()!!

    private val originalImage: Image

    private val twoImages: Array<Image?> = arrayOfNulls(2)

    private val canvasSurfaceArray: Array<CanvasSurface?> = arrayOfNulls(2)

    private var imageToShow: Image

    private var bufferedImageIndex: Int= 0

    private var alphaProcessor: AlphaBaseProcessor = AlphaBaseProcessor.getInstance()!!
protected constructor        (originalImage: Image, image: Image, angleInfo: AngleInfo, totalAngle: Short, animationBehavior: AnimationBehavior)                        

                            : super(image, angleInfo, totalAngle, animationBehavior)

        Updates for KMP build        
        {
    //var originalImage = originalImage
    //var image = image
    //var angleInfo = angleInfo
    //var totalAngle = totalAngle
    //var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.originalImage= originalImage
this.imageToShow= image
this.twoImages[0]= image
this.twoImages[1]= ImageCopyUtil.getInstance()!!.createImage(image)
this.canvasSurfaceArray[0]= this.getCanvasSurface(this.twoImages[0]!!)
this.canvasSurfaceArray[1]= this.getCanvasSurface(this.twoImages[1]!!)
}


open fun getCanvasSurface(image: Image)
        //nullable = true from not(false or (false and false)) = true
: CanvasSurface

        Updates for KMP build        
        {
    //var image = image

    var htmlImage: PlaynMutableImage = image as PlaynMutableImage


    var canvasImage: CanvasImage = htmlImage!!.getImage() as CanvasImage


    var canvasSurface: CanvasSurface = htmlImage!!.getCanvasSurface(canvasImage)!!

canvasSurface!!.translate(originalImage!!.getWidth() /2, originalImage!!.getHeight() /2)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return canvasSurface
}


open fun setBasicColorP(basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var basicColor = basicColor

    var changed: Boolean = false


    
                        if(this.getBasicColorP() == 
                                    null
                                 || this.getBasicColorP()!!.toInt() != basicColor!!.toInt())
                        
                                    {
                                    changed= true

                                    }
                                
super.setBasicColorP(basicColor)

    
                        if(changed)
                        
                                    {
                                    this.updateImage()

                                    }
                                
}


open fun setAlpha(alpha: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var alpha = alpha

    var changed: Boolean = false


    
                        if(this.alphaP != alpha)
                        
                                    {
                                    changed= true

                                    }
                                
super.setAlpha(alpha)

    
                        if(changed)
                        
                                    {
                                    this.alphaProcessor= AlphaProcessor.getInstance()
this.updateImage()

                                    }
                                
}


open fun nextRotation()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
super.nextRotation()
this.updateImage()
}


open fun previousRotation()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
super.previousRotation()
this.updateImage()
}


open fun updateImage()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    var canvasSurface: CanvasSurface = this.canvasSurfaceArray[this.bufferedImageIndex]!!

canvasSurface!!.save()
this.imageRotationUtil!!.rotateImageClear(originalImage, this.twoImages[this.bufferedImageIndex]!!, canvasSurface, this.angleInfo!!.getAngle() +90)
this.alphaProcessor!!.setAlpha(imageModifierUtil, this.originalImage, this.twoImages[this.bufferedImageIndex]!!, this.alphaP)
this.imageRotationUtil!!.drawImage(originalImage, imageToShow, canvasSurface)
canvasSurface!!.restore()
this.swap()
}


open fun setFrame(index: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var index = index
super.setFrame(index)
this.updateImage()
}


open fun swap()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.imageToShow= this.twoImages[this.bufferedImageIndex]!!

    
                        if(this.bufferedImageIndex == 0)
                        
                                    {
                                    this.bufferedImageIndex= 1

                                    }
                                
                        else {
                            this.bufferedImageIndex= 0

                        }
                            
}


open fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graphics = graphics
var x = x
var y = y
graphics.drawImage(this.imageToShow, x, y, anchor)
}


}
                
            

