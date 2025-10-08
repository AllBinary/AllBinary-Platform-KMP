
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
        
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.Image
import org.allbinary.graphics.Anchor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.color.BasicColorSetUtil
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.LogUtil

open public class ImageCopyUtil
            : Object
         {
        
companion object {
            
    private val instance: ImageCopyUtil = ImageCopyUtil()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ImageCopyUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val imageCreationUtil: ImageCreationUtil = ImageCreationUtil.getInstance()!!
private constructor ()
            : super()
        {
}


    private var anchor: Int = Anchor.TOP_LEFT

                @Throws(Exception::class)
            
    open fun createImageForRotation(originalImage: Image)
        //nullable = true from not(false or (false and false)) = true
: Image{
    //var originalImage = originalImage



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.createImage(originalImage)
}


                @Throws(Exception::class)
            
    open fun createImage(originalImage: Image)
        //nullable = true from not(false or (false and false)) = true
: Image{
    //var originalImage = originalImage

    var image: Image = imageCreationUtil!!.getInstance(originalImage!!.getWidth(), originalImage!!.getHeight())!!


    
                        if(image.isMutable())
                        
                                    {
                                    image.getGraphics()!!.drawImage(originalImage, 0, 0, anchor)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image

                                    }
                                
                        else {
                            


                            throw Exception("Not Mutable")

                        }
                            
}


                @Throws(Exception::class)
            
    open fun createImage(originalImage: Image, canvasScale: Float, resize: Boolean)
        //nullable = true from not(false or (false and false)) = true
: Image{
    //var originalImage = originalImage
    //var canvasScale = canvasScale
    //var resize = resize

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
                                

    var image: Image = imageCreationUtil!!.getInstance(newWidth, newHeight)!!


    
                        if(image.isMutable())
                        
                                    {
                                    
    var halfWidthDelta: Int = (newWidth -originalImage!!.getWidth()) /2


    var halfHeightDelta: Int = (newHeight -originalImage!!.getHeight()) /2


    var graphics: Graphics = image.getGraphics()!!

graphics.drawImage(originalImage, halfWidthDelta, halfHeightDelta, anchor)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image

                                    }
                                
                        else {
                            


                            throw Exception("Not Mutable")

                        }
                            
}


}
                
            

