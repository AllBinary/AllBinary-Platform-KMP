
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
        
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Matrix
import javax.microedition.lcdui.Image
import javax.microedition.lcdui.NullCanvas
import org.allbinary.graphics.Anchor
import org.allbinary.image.ImageCache
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

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
            
private constructor        ()
            : super()
        {}


    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var anchor: Int = Anchor.TOP_LEFT

    private val imageBasicArrayList: BasicArrayList = BasicArrayList()

    private val scaledImageBasicArrayList: BasicArrayList = BasicArrayList()

    private val scaleXBasicArrayList: BasicArrayList = BasicArrayList()

    private val scaleYBasicArrayList: BasicArrayList = BasicArrayList()

                @Throws(Exception::class)
            
open fun createImage(imageCache: ImageCache, originalImage: Image, scaleNominatorX: Float, scaleDenominatorX: Float, scaleNominatorY: Float, scaleDenominatorY: Float, cached: Boolean)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var imageCache = imageCache


                    var originalImage = originalImage


                    var scaleNominatorX = scaleNominatorX


                    var scaleDenominatorX = scaleDenominatorX


                    var scaleNominatorY = scaleNominatorY


                    var scaleDenominatorY = scaleDenominatorY


                    var cached = cached



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.createImage(imageCache, originalImage, scaleNominatorX, scaleDenominatorX, scaleNominatorY, scaleDenominatorY, cached, true)
}


                @Throws(Exception::class)
            
open fun createImage(imageCache: ImageCache, originalImage: Image, scaleNominatorX: Float, scaleDenominatorX: Float, scaleNominatorY: Float, scaleDenominatorY: Float, cached: Boolean, mutable: Boolean)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var imageCache = imageCache


                    var originalImage = originalImage


                    var scaleNominatorX = scaleNominatorX


                    var scaleDenominatorX = scaleDenominatorX


                    var scaleNominatorY = scaleNominatorY


                    var scaleDenominatorY = scaleDenominatorY


                    var cached = cached


                    var mutable = mutable

    var scaleX: Float = scaleNominatorX /scaleDenominatorX


    var scaleY: Float = scaleNominatorY /scaleDenominatorY




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.createImage(imageCache, originalImage, scaleX, scaleY, cached)
}


                @Throws(Exception::class)
            
open fun createImage(imageCache: ImageCache, originalImage: Image, scaleX: Float, scaleY: Float, cached: Boolean)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var imageCache = imageCache


                    var originalImage = originalImage


                    var scaleX = scaleX


                    var scaleY = scaleY


                    var cached = cached

    var originalBitmap: Bitmap = originalImage!!.getBitmap()!!
            


    var width: Int = (originalBitmap!!.getWidth() *scaleX).toInt()


    var height: Int = (originalBitmap!!.getHeight() *scaleY).toInt()


    var index: Int = imageBasicArrayList!!.indexOf(originalImage)!!
            


    var alreadyAvailable: Boolean = false


    
                        if(index >= 0)
                        
                                    {
                                    
    var scaleX2Float: Float = this.scaleXBasicArrayList!!.get(index) as Float


    var scaleX2: Float = scaleX2Float!!.toFloat()!!
            


    var scaleY2Float: Float = this.scaleYBasicArrayList!!.get(index) as Float


    var scaleY2: Float = scaleY2Float!!.toFloat()!!
            


    
                        if(scaleX2 == scaleX && scaleY2 == scaleY)
                        
                                    {
                                    alreadyAvailable= true

                                    }
                                

                                    }
                                

    
                        if(alreadyAvailable)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.scaledImageBasicArrayList!!.get(index) as Image

                                    }
                                
                        else {
                            
    var scaledImage: Image = this.getScaledImage(imageCache, originalImage, scaleX, scaleY, width, height, cached)!!
            

imageBasicArrayList!!.add(originalImage)
scaledImageBasicArrayList!!.add(scaledImage)
this.scaleXBasicArrayList!!.add(scaleX)
this.scaleYBasicArrayList!!.add(scaleY)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return scaledImage

                        }
                            
}


                @Throws(Exception::class)
            
open fun getScaledImage(imageCache: ImageCache, originalImage: Image, scaleX: Float, scaleY: Float, width: Int, height: Int, cached: Boolean)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var imageCache = imageCache


                    var originalImage = originalImage


                    var scaleX = scaleX


                    var scaleY = scaleY


                    var width = width


                    var height = height


                    var cached = cached

    var image: Image = NullCanvas.NULL_IMAGE


    
                        if(cached)
                        
                                    {
                                    image= imageCache!!.get(this::class.qualifiedName!!, width, height)

                                    }
                                
                        else {
                            image= imageCache!!.get(commonStrings!!.CREATE_IMAGE, width, height)

                        }
                            

    
                        if(image.isMutable())
                        
                                    {
                                    
    var matrix: Matrix = Matrix()

this.scale(image, matrix, scaleX, scaleY)
image.getGraphics()!!.drawImage(originalImage, 0, 0, anchor)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image

                                    }
                                
                        else {
                            


                            throw Exception(
                            "Not Mutable")

                        }
                            
}


open fun scale(image: Image, matrix: Matrix, scaleX: Float, scaleY: Float)
        //nullable = true from not(false or (false and false)) = true
{

                    var image = image


                    var matrix = matrix


                    var scaleX = scaleX


                    var scaleY = scaleY
matrix.setScale(scaleX, scaleY)

    var canvas: Canvas = image.getCanvas()!!
            

canvas.concat(matrix)
}


}
                
            

