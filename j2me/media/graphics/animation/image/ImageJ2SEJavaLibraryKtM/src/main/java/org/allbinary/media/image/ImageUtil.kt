
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
        
import java.awt
import java.awt.geom.AffineTransform
import java.awt.image.BufferedImage
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings

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


open fun getDefaultConfiguration()
        //nullable = true from not(false or (false and true)) = true
: GraphicsConfiguration{
    var ge: GraphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment()!!
            


    var gd: GraphicsDevice = ge.getDefaultScreenDevice()!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gd.getDefaultConfiguration()
}


open fun create(width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
: BufferedImage{

                    var width = width


                    var height = height

    var graphicsConfiguration: GraphicsConfiguration = this.getDefaultConfiguration()!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return graphicsConfiguration!!.createCompatibleImage(width, height, Transparency.TRANSLUCENT)
}


                @Throws(Exception::class)
            
open fun createBufferedImage(bufferedImageArray: Array<BufferedImage?>, percent: Int, scale: Boolean)
        //nullable = true from not(false or (false and false)) = true
: Array<BufferedImage?>{

                    var bufferedImageArray = bufferedImageArray


                    var percent = percent


                    var scale = scale

    var size: Int = bufferedImageArray!!.size
                


    var scaledBufferedImageArray: Array<BufferedImage?> = arrayOfNulls(size)


    var bufferedImage: BufferedImage





                        for (index in 0 until size)


        {bufferedImage= bufferedImageArray[index]!!

    var newWidth: Int = (bufferedImage!!.getWidth() *percent /100).toInt()


    var newHeight: Int = (bufferedImage!!.getHeight() *percent /100).toInt()

scaledBufferedImageArray[index]= this.createBufferedImage(bufferedImage, newWidth, newHeight, scale)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return scaledBufferedImageArray
}


                @Throws(Exception::class)
            
open fun createBufferedImage(bufferedImageArray: Array<BufferedImage?>, percent: Float, scale: Boolean)
        //nullable = true from not(false or (false and false)) = true
: Array<BufferedImage?>{

                    var bufferedImageArray = bufferedImageArray


                    var percent = percent


                    var scale = scale

    var size: Int = bufferedImageArray!!.size
                


    var scaledBufferedImageArray: Array<BufferedImage?> = arrayOfNulls(size)


    var bufferedImage: BufferedImage





                        for (index in 0 until size)


        {bufferedImage= bufferedImageArray[index]!!

    var newWidth: Int = (bufferedImage!!.getWidth() *percent).toInt()


    var newHeight: Int = (bufferedImage!!.getHeight() *percent).toInt()

scaledBufferedImageArray[index]= this.createBufferedImage(bufferedImage, newWidth, newHeight, scale)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return scaledBufferedImageArray
}


                @Throws(Exception::class)
            
open fun createBufferedImage(bufferedImageArray: Array<BufferedImage?>, width: Int, height: Int, scale: Boolean)
        //nullable = true from not(false or (false and false)) = true
: Array<BufferedImage?>{

                    var bufferedImageArray = bufferedImageArray


                    var width = width


                    var height = height


                    var scale = scale

    var size: Int = bufferedImageArray!!.size
                


    var scaledBufferedImageArray: Array<BufferedImage?> = arrayOfNulls(size)





                        for (index in 0 until size)


        {scaledBufferedImageArray[index]= this.createBufferedImage(bufferedImageArray[index]!!, width, height, scale)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return scaledBufferedImageArray
}


                @Throws(Exception::class)
            
open fun createBufferedImage(bufferedImage: BufferedImage, newWidth: Int, newHeight: Int)
        //nullable = true from not(false or (false and false)) = true
: BufferedImage{

                    var bufferedImage = bufferedImage


                    var newWidth = newWidth


                    var newHeight = newHeight



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.createBufferedImage(bufferedImage, newWidth, newHeight, true)
}


                @Throws(Exception::class)
            
open fun createBufferedImage(bufferedImage: BufferedImage, newWidth: Int, newHeight: Int, scale: Boolean)
        //nullable = true from not(false or (false and false)) = true
: BufferedImage{

                    var bufferedImage = bufferedImage


                    var newWidth = newWidth


                    var newHeight = newHeight


                    var scale = scale



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.createBufferedImage(bufferedImage, newWidth, newHeight, scale, false)
}


                @Throws(Exception::class)
            
open fun createBufferedImage(bufferedImage: BufferedImage, newWidth: Int, newHeight: Int, scale: Boolean, allowTranslate: Boolean)
        //nullable = true from not(false or (false and false)) = true
: BufferedImage{

                    var bufferedImage = bufferedImage


                    var newWidth = newWidth


                    var newHeight = newHeight


                    var scale = scale


                    var allowTranslate = allowTranslate

    var width: Double = bufferedImage!!.getWidth()!!
            


    var height: Double = bufferedImage!!.getHeight()!!
            


    var d_newWidth: Double = newWidth


    var d_newHeight: Double = newHeight


    var widthRatio: Double = d_newWidth /width


    var heightRatio: Double = d_newHeight /height


    var ratioX: Double = 1.0


    var ratioY: Double = 1.0


    
                        if(scale)
                        
                                    {
                                    ratioX= widthRatio
ratioY= heightRatio

                                    }
                                

    var affineTransform: AffineTransform = AffineTransform.getScaleInstance(ratioX, ratioY)!!
            

logUtil!!.put(StringMaker().
                            append(width.toFloat())!!.append(this.commonSeps!!.FORWARD_SLASH)!!.append(height.toFloat())!!.append(this.commonSeps!!.COLON)!!.append(newWidth)!!.append(this.commonSeps!!.FORWARD_SLASH)!!.append(newHeight)!!.append(this.commonSeps!!.COLON)!!.append(widthRatio.toFloat())!!.append(this.commonSeps!!.FORWARD_SLASH)!!.append(heightRatio.toFloat())!!.toString(), this, CREATE_BUFFERED_IMAGE)

    
                        if(!scale && allowTranslate)
                        
                                    {
                                    
    var dx: Double = (newWidth -width) /2


    var dy: Double = (newHeight -height) /2

logUtil!!.put(StringMaker().
                            append(
                            "Translate dx: ")!!.append(dx.toFloat())!!.append(
                            " dy: ")!!.append(dy.toFloat())!!.toString(), this, CREATE_BUFFERED_IMAGE)
affineTransform!!.translate(dx, dy)

                                    }
                                

    var newBufferedImage: BufferedImage = BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB_PRE)


    var graphics: Graphics2D = newBufferedImage!!.createGraphics()!!
            

graphics.drawRenderedImage(bufferedImage, affineTransform)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newBufferedImage
}


open fun toString(bufferedImage: BufferedImage)
        //nullable = true from not(false or (true and false)) = true
: String{

                    var bufferedImage = bufferedImage

    var commonLabels: CommonLabels = CommonLabels.getInstance()!!
            


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            " BufferedImage -")
stringBuffer!!.append(commonLabels!!.WIDTH_LABEL)
stringBuffer!!.append(bufferedImage!!.getWidth())
stringBuffer!!.append(commonLabels!!.HEIGHT_LABEL)
stringBuffer!!.append(bufferedImage!!.getHeight())
stringBuffer!!.append(
                            " Type: ")
stringBuffer!!.append(bufferedImage!!.getType())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

