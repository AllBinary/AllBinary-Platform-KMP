
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
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.GameFeatureFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.GC
import org.eclipse.swt.graphics.ImageData
import org.eclipse.swt.graphics.Transform
import org.microemu.device.swt.SwtImmutableImage
import org.microemu.device.swt.SwtMutableImage

open public class ImageSwtRotationUtil
            : Object
         {
        
companion object {
            
    private val instance: ImageSwtRotationUtil = ImageSwtRotationUtil()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ImageSwtRotationUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val imageUtil: ImageUtil = ImageUtil.getInstance()!!

    private val gameFeatureFactory: GameFeatureFactory = GameFeatureFactory.getInstance()!!

    private val features: Features = Features.getInstance()!!

    private val NO_COPY: String = "SWT should not copy images after initial loading as the alpha is not honored"
private constructor ()
            : super()
        {
}


    open fun getRotatedImage(bufferedImage: org.eclipse.swt.graphics.Image, totalAngle: Int)
        //nullable = true from not(false or (false and false)) = true
: org.eclipse.swt.graphics.Image{
    //var bufferedImage = bufferedImage
    //var totalAngle = totalAngle

    
                        if(!features.isFeature(gameFeatureFactory!!.POST_IMAGE_LOADING_MODIFICATION))
                        
                                    {
                                    logUtil!!.put(NO_COPY, this, commonStrings!!.CONSTRUCTOR)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return bufferedImage

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return bufferedImage
}


    open fun getRotatedImage2(bufferedImage: org.eclipse.swt.graphics.Image, newBufferedImage: org.eclipse.swt.graphics.Image, gc: GC, angle: Float)
        //nullable = true from not(false or (false and false)) = true
: org.eclipse.swt.graphics.Image{
    //var bufferedImage = bufferedImage
    //var newBufferedImage = newBufferedImage
    //var gc = gc
    //var angle = angle

    
                        if(!features.isFeature(gameFeatureFactory!!.POST_IMAGE_LOADING_MODIFICATION))
                        
                                    {
                                    logUtil!!.put(NO_COPY, this, commonStrings!!.CONSTRUCTOR)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return bufferedImage

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return bufferedImage
}


    open fun rotateImage(originalSwtImage: org.eclipse.swt.graphics.Image, newSwtImage: org.eclipse.swt.graphics.Image, gc: GC, totalAngle: Int)
        //nullable = true from not(false or (false and false)) = true
: org.eclipse.swt.graphics.Image{
    //var originalSwtImage = originalSwtImage
    //var newSwtImage = newSwtImage
    //var gc = gc
    //var totalAngle = totalAngle



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getRotatedImage2(originalSwtImage, newSwtImage, gc, totalAngle)
}


    open fun getRotatedImage(bufferedImage: org.eclipse.swt.graphics.Image, newSwtImage: org.eclipse.swt.graphics.Image, gc: GC, totalAngle: Int)
        //nullable = true from not(false or (false and false)) = true
: org.eclipse.swt.graphics.Image{
    //var bufferedImage = bufferedImage
    //var newSwtImage = newSwtImage
    //var gc = gc
    //var totalAngle = totalAngle



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getRotatedImage2(bufferedImage, newSwtImage, gc, totalAngle)
}


    open fun getRotatedImages(bufferedImage: org.eclipse.swt.graphics.Image, numberOfFrames: Int, totalAngle: Int)
        //nullable = true from not(false or (false and false)) = true
: Array<org.eclipse.swt.graphics.Image?>{
    //var bufferedImage = bufferedImage
    //var numberOfFrames = numberOfFrames
    //var totalAngle = totalAngle

    var bufferedImageArray: Array<org.eclipse.swt.graphics.Image?> = arrayOfNulls(numberOfFrames)


    var angle: Int= 0


    var size: Int = bufferedImageArray!!.size
                





                        for (index in 0 until size)

        {
angle= (totalAngle /size) *index
bufferedImageArray[index]= this.getRotatedImage(bufferedImage, angle)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return bufferedImageArray
}


    open fun createSpriteImage(bufferedImageArray: Array<org.eclipse.swt.graphics.Image?>)
        //nullable = true from not(false or (false and false)) = true
: org.eclipse.swt.graphics.Image{
    //var bufferedImageArray = bufferedImageArray

    var columns: Int = 9


    var rows: Int = 0


    var size: Int = bufferedImageArray!!.size
                


    
                        if(size < columns)
                        
                                    {
                                    columns= size

                                    }
                                
rows= (size /columns)

    
                        if(size % columns != 0)
                        
                                    {
                                    rows++

                                    }
                                

    var firstBufferedImage: org.eclipse.swt.graphics.Image = bufferedImageArray[0]!!


    var imageData: ImageData = firstBufferedImage!!.getImageData()!!


    var bufferedImage: org.eclipse.swt.graphics.Image = this.imageUtil!!.create(imageData!!.width *columns, imageData!!.height *rows)!!


    var gc: GC = GC(bufferedImage)

gc.setAntialias(SWT.ON)
gc.setInterpolation(SWT.HIGH)

    var columnIndex: Int = 0


    var rowIndex: Int = 0


    var nextBufferedImage: org.eclipse.swt.graphics.Image





                        for (index in 0 until size)

        {

    
                        if(index /9 != 0 && index % 9 == 0)
                        
                                    {
                                    rowIndex++
columnIndex= 0

                                    }
                                
nextBufferedImage= bufferedImageArray[index]!!
imageData= nextBufferedImage!!.getImageData()
gc.drawImage(bufferedImage, 0, 0, bufferedImage!!.getBounds()!!.width, bufferedImage!!.getBounds()!!.height, imageData!!.width *columnIndex, imageData!!.height *rowIndex, imageData!!.width, imageData!!.height)
columnIndex++
}

gc.dispose()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return bufferedImage
}


}
                
            

