
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
        
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.Image
import org.allbinary.graphics.Anchor
import org.allbinary.graphics.color.BasicColor
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.microemu.device.playn.PlaynImage
import org.microemu.device.ResourceCallbackStrings
import playn.core.Canvas
import playn.core.CanvasImage
import playn.core.ResourceCallback

open public class ImageModifierUtil
            : Object
         {
        
companion object {
            
    open fun getInstanceOrCreate()
        //nullable = true from not(false or (false and true)) = true
: ImageModifierUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ImageModifierUtil()
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val resourceCallbackStrings: ResourceCallbackStrings = ResourceCallbackStrings.getInstance()!!

    private var alphaArray: BooleanArray

    open fun setColor(unusedOriginalImage: Image, image: Image, imageIndex: Int, basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{
    //var unusedOriginalImage = unusedOriginalImage
    //var image = image
    //var imageIndex = imageIndex
    //var basicColor = basicColor
}


    open fun changeColor(unusedOriginalImage: Image, image: Image, imageIndex: Int, basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{
    //var unusedOriginalImage = unusedOriginalImage
    //var image = image
    //var imageIndex = imageIndex
    //var basicColor = basicColor
}


    open fun setAlpha(originalImage: Image, image: Image, imageIndex: Int, alpha: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var originalImage = originalImage
    //var image = image
    //var imageIndex = imageIndex
    //var alpha = alpha

    var alphaF: Float = alpha


    var alphaFloat: Float = alphaF /255

this.setAlpha(originalImage, image, imageIndex, alphaFloat)
}


    open fun setAlpha(originalImage: Image, image: Image, imageIndex: Int, alpha: Float)
        //nullable = true from not(false or (false and false)) = true
{
    //var originalImage = originalImage
    //var image = image
    //var imageIndex = imageIndex
    //var alpha = alpha

    
                        if(this.alphaArray[imageIndex])
                        
                                    {
                                    this.alphaArray[imageIndex]= false
this.setAlpha2(originalImage, image, imageIndex, alpha)

                                    }
                                
}


    open fun setAlpha2(originalImage: Image, image: Image, imageIndex: Int, alpha: Float)
        //nullable = true from not(false or (false and false)) = true
{
    //var originalImage = originalImage
    //var image = image
    //var imageIndex = imageIndex
    //var alpha = alpha

    var htmlImage: PlaynImage = image as PlaynImage


    var canvasImage: CanvasImage = htmlImage!!.getImage() as CanvasImage


    var originalPlaynImage: playn.core.Image = 
                                    (originalImage as PlaynImage).getImage() as playn.core.Image


    var canvas: Canvas = canvasImage!!.canvas()!!

canvas.clear()
canvas.setAlpha(alpha)
canvas.drawImage(originalPlaynImage, 0, 0)
}


    open fun setAlpha3(image: Image, alpha: Float)
        //nullable = true from not(false or (false and false)) = true
{
    //var image = image
    //var alpha = alpha

    var alphaF: Float = alpha


    var alphaFloat: Float = alphaF /255


    var htmlImage: PlaynImage = image as PlaynImage


    var canvasImage: CanvasImage = htmlImage!!.getImage() as CanvasImage


    var canvas: Canvas = canvasImage!!.canvas()!!

canvas.setAlpha(alphaFloat)
}


    open fun getImageArray(originalImageArray: Array<Image?>)
        //nullable = true from not(false or (false and false)) = true
: Array<Image?>{
    //var originalImageArray = originalImageArray

    var size: Int = originalImageArray!!.size
                

this.alphaArray= BooleanArray(size)

    var imageArray: Array<Image?> = arrayOfNulls(size)





                        for (index in 0 until size)

        {
imageArray[index]= originalImageArray[index]!!
this.handleImage(imageArray, index, originalImageArray[index]!!)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return imageArray
}


    open fun handleImage(imageArray: Array<Image?>, index: Int, image: Image)
        //nullable = true from not(false or (false and false)) = true
{
    //var imageArray = imageArray
    //var index = index
    //var image = image

    var image3: playn.core.Image = 
                                    (image as PlaynImage).getImage() as playn.core.Image


    
                        if(image3 != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(image3.isReady() || image3.width() +image3.height() <= 0 || image.getName() == resourceCallbackStrings!!.FROM_DATA)
                        
                                    {
                                    copy(imageArray, index, image, image3)

                                    }
                                
                        else {
                            
    var callback: ResourceCallback = object: ResourceCallback()
                                {
                                
    override fun done(resource: Any)
        //nullable = true from not(false or (false and false)) = true
{
var resource = resource
logUtil!!.put(resourceCallbackStrings!!.DONE +image.getName(), this, resourceCallbackStrings!!.HANDLE_IMAGE)
copy(imageArray, index, image, image3)
}

    override fun error(e: Throwable)
        //nullable = true from not(false or (false and false)) = true
{
var e = e
logUtil!!.put(StringMaker().
                            append(commonStrings!!.EXCEPTION_LABEL)!!.append(resourceCallbackStrings!!.ERROR)!!.append(image.getName())!!.toString(), this, resourceCallbackStrings!!.HANDLE_IMAGE)
}

                                }
                            

image3.addCallback(callback)

                        }
                            

                                    }
                                
                        else {
                            logUtil!!.put(resourceCallbackStrings!!.NULL +image.isMutable(), this, resourceCallbackStrings!!.HANDLE_IMAGE)

                        }
                            
}


    open fun copy(imageArray: Array<Image?>, index: Int, image: Image, image3: playn.core.Image)
        //nullable = true from not(false or (false and false)) = true
{
    //var imageArray = imageArray
    //var index = index
    //var image = image
    //var image3 = image3

        try {
            
    var image2: Image = Image.createImage(image3.width(), image3.height())!!


    var graphics: Graphics = image2.getGraphics()!!

graphics.drawImage(image, 0, 0, Anchor.TOP_LEFT)
imageArray[index]= image2
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION_LABEL +resourceCallbackStrings!!.DONE, this, resourceCallbackStrings!!.HANDLE_IMAGE)
}

}


    open fun reset()
        //nullable = true from not(false or (false and true)) = true
{

    var size: Int = this.alphaArray!!.size
                





                        for (index in 0 until size)

        {
this.alphaArray[index]= true
}

}


}
                
            

