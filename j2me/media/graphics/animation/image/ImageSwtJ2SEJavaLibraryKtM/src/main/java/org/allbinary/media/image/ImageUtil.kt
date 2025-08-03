
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
        
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.Canvas
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.graphics.GC
import org.eclipse.swt.graphics.ImageData
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonLabels
import org.eclipse.swt.events.PaintEvent
import org.eclipse.swt.events.PaintListener
import org.eclipse.swt.graphics.Transform
import org.eclipse.swt.widgets.Display
import org.microemu.app.BareMain

open public class ImageUtil
            : Object
         {
        

        companion object {


    private val instance: ImageUtil = ImageUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ImageUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val commonSeps: CommonSeps = CommonSeps.getInstance()!!
            

    private var IIOIMAGE_POOL_NAME: String = "IIOIMAGE_POOL_NAME"

    private val CREATE_BUFFERED_IMAGE: String = "createBufferedImage"
private constructor        ()
            : super()
        {
        try {
            logUtil!!.put(commonStrings!!.START, this, commonStrings!!.CONSTRUCTOR)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CONSTRUCTOR, e)
}

}


open fun create(width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var width = width


                    var height = height

    var display: Display = BareMain.shell!!.getDisplay()!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Image(display, width, height)
}


                @Throws(Exception::class)
            
open fun createBufferedImage(bufferedImageArray: Array<Image?>, percent: Int, scale: Boolean)
        //nullable = true from not(false or (false and false)) = true
: Array<Image?>{

                    var bufferedImageArray = bufferedImageArray


                    var percent = percent


                    var scale = scale

    var size: Int = bufferedImageArray!!.size
                


    var scaledBufferedImageArray: Array<Image?> = arrayOfNulls(size)


    var bufferedImage: Image


    var imageData: ImageData





                        for (index in 0 until size)


        {bufferedImage= bufferedImageArray[index]!!
imageData= bufferedImage!!.getImageData()

    var newWidth: Int = (imageData!!.width *percent /100).toInt()


    var newHeight: Int = (imageData!!.height *percent /100).toInt()

scaledBufferedImageArray[index]= this.createBufferedImage(bufferedImage, newWidth, newHeight, scale)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return scaledBufferedImageArray
}


                @Throws(Exception::class)
            
open fun createBufferedImage(bufferedImageArray: Array<Image?>, percent: Float, scale: Boolean)
        //nullable = true from not(false or (false and false)) = true
: Array<Image?>{

                    var bufferedImageArray = bufferedImageArray


                    var percent = percent


                    var scale = scale

    var size: Int = bufferedImageArray!!.size
                


    var scaledBufferedImageArray: Array<Image?> = arrayOfNulls(size)


    var bufferedImage: Image


    var imageData: ImageData





                        for (index in 0 until size)


        {bufferedImage= bufferedImageArray[index]!!
imageData= bufferedImage!!.getImageData()

    var newWidth: Int = (imageData!!.width *percent).toInt()


    var newHeight: Int = (imageData!!.height *percent).toInt()

scaledBufferedImageArray[index]= this.createBufferedImage(bufferedImage, newWidth, newHeight, scale)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return scaledBufferedImageArray
}


                @Throws(Exception::class)
            
open fun createBufferedImage(bufferedImageArray: Array<Image?>, width: Int, height: Int, scale: Boolean)
        //nullable = true from not(false or (false and false)) = true
: Array<Image?>{

                    var bufferedImageArray = bufferedImageArray


                    var width = width


                    var height = height


                    var scale = scale

    var size: Int = bufferedImageArray!!.size
                


    var scaledBufferedImageArray: Array<Image?> = arrayOfNulls(size)





                        for (index in 0 until size)


        {scaledBufferedImageArray[index]= this.createBufferedImage(bufferedImageArray[index]!!, width, height, scale)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return scaledBufferedImageArray
}


                @Throws(Exception::class)
            
open fun createBufferedImage(bufferedImage: Image, newWidth: Int, newHeight: Int)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var bufferedImage = bufferedImage


                    var newWidth = newWidth


                    var newHeight = newHeight



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.createBufferedImage(bufferedImage, newWidth, newHeight, true)
}


                @Throws(Exception::class)
            
open fun createBufferedImage(bufferedImage: Image, newWidth: Int, newHeight: Int, scale: Boolean)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var bufferedImage = bufferedImage


                    var newWidth = newWidth


                    var newHeight = newHeight


                    var scale = scale



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.createBufferedImage(bufferedImage, newWidth, newHeight, scale, false)
}


                @Throws(Exception::class)
            
open fun createBufferedImage(bufferedImage: Image, newWidth: Int, newHeight: Int, scale: Boolean, allowTranslate: Boolean)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var bufferedImage = bufferedImage


                    var newWidth = newWidth


                    var newHeight = newHeight


                    var scale = scale


                    var allowTranslate = allowTranslate

    var imageData: ImageData = bufferedImage!!.getImageData()!!
            


    var width: Float = imageData!!.width


    var height: Float = imageData!!.height


    var d_newWidth: Float = newWidth


    var d_newHeight: Float = newHeight


    var widthRatio: Float = d_newWidth /width


    var heightRatio: Float = d_newHeight /height


    var ratioX: Float = 1.0f


    var ratioY: Float = 1.0f


    
                        if(scale)
                        
                                    {
                                    ratioX= widthRatio
ratioY= heightRatio

                                    }
                                
logUtil!!.put(StringMaker().
                            append(width)!!.append(this.commonSeps!!.FORWARD_SLASH)!!.append(height)!!.append(this.commonSeps!!.COLON)!!.append(newWidth)!!.append(this.commonSeps!!.FORWARD_SLASH)!!.append(newHeight)!!.append(this.commonSeps!!.COLON)!!.append(widthRatio)!!.append(this.commonSeps!!.FORWARD_SLASH)!!.append(heightRatio)!!.toString(), this, CREATE_BUFFERED_IMAGE)

    var dx: Float = 0


    var dy: Float = 0


    
                        if(!scale && allowTranslate)
                        
                                    {
                                    dx= (newWidth -width) /2
dy= (newHeight -height) /2
logUtil!!.put(StringMaker().
                            append(
                            "Translate dx: ")!!.append(dx)!!.append(
                            " dy: ")!!.append(dy)!!.toString(), this, CREATE_BUFFERED_IMAGE)

                                    }
                                

    var newBufferedImage: Image = Image(BareMain.shell!!.getDisplay(), newWidth, newHeight)


    var gc: GC = GC(newBufferedImage)


    var affineTransform: Transform = Transform(gc!!.getDevice())

affineTransform!!.scale(ratioX, ratioY)
affineTransform!!.translate(dx, dy)
gc!!.setTransform(affineTransform)
gc!!.setAntialias(SWT.ON)
gc!!.setInterpolation(SWT.HIGH)
gc!!.drawImage(bufferedImage, 0, 0, bufferedImage!!.getBounds()!!.width, bufferedImage!!.getBounds()!!.height, 0, 0, newWidth, newHeight)
gc!!.dispose()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newBufferedImage
}


open fun drawTransformedImage(image: Image, parent: Composite, dx: Int, dy: Int, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
: Canvas{

                    var image = image


                    var parent = parent


                    var dx = dx


                    var dy = dy


                    var width = width


                    var height = height

    var imageCanvas: Canvas = Canvas(parent, SWT.NONE)

imageCanvas!!.addPaintListener(object: PaintListener()
                                {
                                
open override fun paintControl(event: PaintEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var event = event

    var gc: GC = event!!.gc


    var affineTransform: Transform = Transform(gc!!.getDevice())

affineTransform!!.translate(dx, dy)
gc!!.setAntialias(SWT.ON)
gc!!.setInterpolation(SWT.HIGH)
gc!!.drawImage(image, 0, 0, image!!.getBounds()!!.width, image!!.getBounds()!!.height, 0, 0, width, height)
}

                                }
                            )



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return imageCanvas
}


open fun toString(bufferedImage: Image)
        //nullable = true from not(false or (true and false)) = true
: String{

                    var bufferedImage = bufferedImage

    var commonLabels: CommonLabels = CommonLabels.getInstance()!!
            


    var stringBuffer: StringMaker = StringMaker()


    var imageData: ImageData = bufferedImage!!.getImageData()!!
            

stringBuffer!!.append(
                            " org.eclipse.swt.graphics.Image: ")
stringBuffer!!.append(commonLabels!!.WIDTH_LABEL)
stringBuffer!!.append(imageData!!.width)
stringBuffer!!.append(commonLabels!!.HEIGHT_LABEL)
stringBuffer!!.append(imageData!!.height)
stringBuffer!!.append(
                            " Type: ")
stringBuffer!!.append(imageData!!.type)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

