
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
        package org.allbinary.media.image.comparison.motion




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import java.awt.image.BufferedImage
import java.util.Vector
import org.allbinary.input.automation.ImageOutputData
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.java.number.LongUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.util.cache.AutomaticCacheInterface
import org.allbinary.logic.util.cache.PoolInterface
import org.allbinary.logic.visual.media.MediaDataFactory
import org.allbinary.media.image.ImagePersistanceUtil
import org.allbinary.media.image.cache.BufferedImageCacheable
import org.allbinary.media.image.cache.BufferedImageInfo
import org.allbinary.media.image.cache.BufferedImageInfoFactory
import org.allbinary.media.image.cache.BufferedImagePoolSingleton
import org.allbinary.media.image.comparison.ImageComparisonResult
import org.allbinary.media.image.io.ImageIOInterface
import org.allbinary.string.CommonStrings

open public class MotionRectanglesImageInputOutput
            : Object
        
                , ImageIOInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val NUMBER_OF_IMAGES: Int = 1
public constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun save(frame: Long)
        //nullable = true from not(false or (false and false)) = true
{

                    var frame = frame

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


    var motionRectanglesResultsFrameCacheable: MotionRectanglesResultsFrameCacheable = 
                                    (getInstance as AutomaticCacheInterface).get(frame) as MotionRectanglesResultsFrameCacheable


    
                        if(motionRectanglesResultsFrameCacheable != 
                                    null
                                )
                        
                                    {
                                    
    var motionRectangles: MotionRectangles = motionRectanglesResultsFrameCacheable!!.getMotionRectangles()!!

this.save(motionRectangles, frame)
motionRectanglesResultsFrameCacheable= 
                                    (getInstance as AutomaticCacheInterface).get(frame) as MotionRectanglesResultsFrameCacheable
motionRectangles= motionRectanglesResultsFrameCacheable!!.getMotionRectangles()
this.save(motionRectangles, frame)
motionRectanglesResultsFrameCacheable= 
                                    (getInstance as AutomaticCacheInterface).get(frame) as MotionRectanglesResultsFrameCacheable
motionRectangles= motionRectanglesResultsFrameCacheable!!.getMotionRectangles()
this.save(motionRectangles, frame)

                                    }
                                
                        else {
                            logUtil!!.put("No Motion Rectangle Results for Frame: " +frame, this, commonStrings!!.SAVE)

                        }
                            
}


                @Throws(Exception::class)
            
open fun save(motionRectangles: MotionRectangles, frame: Long)
        //nullable = true from not(false or (false and false)) = true
{

                    var motionRectangles = motionRectangles


                    var frame = frame

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


    var filePathStringBuffer: StringMaker = StringMaker()

filePathStringBuffer!!.append(ImageOutputData.SAVE_PATH)
filePathStringBuffer!!.append(LongUtil.fillIn(frame.toString()))
filePathStringBuffer!!.append("_")
filePathStringBuffer!!.append(motionRectangles!!.getName())

    var filePathStringBuffer1: StringMaker = StringMaker()

filePathStringBuffer1!!.append(filePathStringBuffer!!.toString())
filePathStringBuffer1!!.append("_1")
filePathStringBuffer1!!.append(MediaDataFactory.getInstance()!!.JPG.getExtension())

    var filePathStringBuffer2: StringMaker = StringMaker()

filePathStringBuffer2!!.append(filePathStringBuffer!!.toString())
filePathStringBuffer2!!.append("_2")
filePathStringBuffer2!!.append(MediaDataFactory.getInstance()!!.JPG.getExtension())

    var filePathStringBuffer3: StringMaker = StringMaker()

filePathStringBuffer3!!.append(filePathStringBuffer!!.toString())
filePathStringBuffer3!!.append(MediaDataFactory.getInstance()!!.JPG.getExtension())
logUtil!!.put("Motion Image File Path 1: " +filePathStringBuffer1!!.toString(), this, commonStrings!!.SAVE)
logUtil!!.put("Motion Image File Path 2: " +filePathStringBuffer2!!.toString(), this, commonStrings!!.SAVE)
logUtil!!.put("Motion Image File Path 2: " +filePathStringBuffer3!!.toString(), this, commonStrings!!.SAVE)

    var bufferedImageCacheables: Array<BufferedImageCacheable?> = arrayOfNulls(NUMBER_OF_IMAGES)


    var imageComparisonInfo: ImageComparisonResult = motionRectangles!!.getImageComparisonResult()!!


    var originalBufferedImage: BufferedImage = imageComparisonInfo!!.getBufferedImages()[0]!!


    var bufferedImageInfo: BufferedImageInfo = BufferedImageInfoFactory.getInstance(imageComparisonInfo!!.imageWidth, imageComparisonInfo!!.imageHeight, originalBufferedImage!!.getType())!!


    var poolInterface: PoolInterface = BufferedImagePoolSingleton.getInstance()!!





                        for (index in 0 until NUMBER_OF_IMAGES)


        {bufferedImageCacheables[index]= poolInterface!!.remove(bufferedImageInfo) as BufferedImageCacheable
}

bufferedImageCacheables[0]!!.getBufferedImage()!!.setData(imageComparisonInfo!!.getBufferedImages()[1]!!.getData())

    
                        if(NUMBER_OF_IMAGES > 1)
                        
                                    {
                                    bufferedImageCacheables[1]!!.getBufferedImage()!!.setData(imageComparisonInfo!!.getBufferedImages()[1]!!.getData())

                                    }
                                

    var bufferedImageGraphicsArray: Array<Graphics?>

bufferedImageGraphicsArray= arrayOfNulls(NUMBER_OF_IMAGES)




                        for (index in 0 until NUMBER_OF_IMAGES)


        {bufferedImageGraphicsArray[index]= bufferedImageCacheables[index]!!.getBufferedImage()!!.getGraphics()
}


    var rectangelList: Vector = motionRectangles!!.getVector()!!


    var size: Int = rectangelList!!.size!!





                        for (index2 in 0 until size)


        {
    var motionRectangle: MotionRectangle = rectangelList!!.get(index2) as MotionRectangle


    var rectangle: Rectangle = motionRectangle!!.getRectangle()!!





                        for (index in 0 until NUMBER_OF_IMAGES)


        {bufferedImageGraphicsArray[index]!!.setColor(Color.ORANGE)
bufferedImageGraphicsArray[index]!!.drawRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height)
}

}


    var imagePersistanceUtil: ImagePersistanceUtil = ImagePersistanceUtil.getInstance()!!


    
                        if(NUMBER_OF_IMAGES > 1)
                        
                                    {
                                    imagePersistanceUtil!!.saveWithImageIO(filePathStringBuffer1!!.toString(), bufferedImageCacheables[1]!!.getBufferedImage())

                                    }
                                
imagePersistanceUtil!!.saveWithImageIO(filePathStringBuffer2!!.toString(), bufferedImageCacheables[0]!!.getBufferedImage())

    
                        if(NUMBER_OF_IMAGES > 2)
                        
                                    {
                                    imagePersistanceUtil!!.saveWithImageIO(filePathStringBuffer3!!.toString(), bufferedImageCacheables[2]!!.getBufferedImage())

                                    }
                                
}


}
                
            

