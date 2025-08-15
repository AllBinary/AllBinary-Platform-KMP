
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
        package org.allbinary.media.image.comparison




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt.image.BufferedImage
import org.allbinary.input.automation.ImageOutputData
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.java.number.LongUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.util.cache.AutomaticCacheInterface
import org.allbinary.logic.visual.media.MediaDataFactory
import org.allbinary.media.image.ImagePersistanceUtil
import org.allbinary.media.image.cache.BufferedImageCacheable
import org.allbinary.media.image.io.ImageIOInterface
import org.allbinary.string.CommonStrings

open public class ComparisonImageInputOutput
            : Object
        
                , ImageIOInterface {
        

        companion object {
            
    private val ROOT_NAME: String = "_Changed_"

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            
public constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun save(frame: Long)
        //nullable = true from not(false or (false and false)) = true
{

                    var frame = frame

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            


    
                        if(frame > 0)
                        
                                    {
                                    
    var imageComparisonResultFrameCacheable: ImageComparisonResultFrameCacheable = 
                                    (getInstance as AutomaticCacheInterface).get(frame) as ImageComparisonResultFrameCacheable


    
                        if(imageComparisonResultFrameCacheable != 
                                    null
                                )
                        
                                    {
                                    
    var imageComparisonResult: ImageComparisonResult = imageComparisonResultFrameCacheable!!.getImageComparisonResult()!!
            

this.save(imageComparisonResult, imageComparisonResultFrameCacheable!!.getFrame())

                                    }
                                
                        else {
                            logUtil!!.put("Comparison Results Not Available for Output: " +frame, this, commonStrings!!.SAVE)

                        }
                            

                                    }
                                
                        else {
                            logUtil!!.put("No Comparison Results: for first frame: " +frame, this, commonStrings!!.SAVE)

                        }
                            
}


                @Throws(Exception::class)
            
open fun save(imageComparisonResult: ImageComparisonResult, frame: Long)
        //nullable = true from not(false or (false and false)) = true
{

                    var imageComparisonResult = imageComparisonResult


                    var frame = frame

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            


    var filePathStringBuffer: StringMaker = StringMaker()

filePathStringBuffer!!.append(ImageOutputData.SAVE_PATH)
filePathStringBuffer!!.append(LongUtil.fillIn(frame.toString()))
filePathStringBuffer!!.append(ROOT_NAME)

    var filePathStringBuffer1: StringMaker = StringMaker()

filePathStringBuffer1!!.append(filePathStringBuffer!!.toString())
filePathStringBuffer1!!.append("_1")
filePathStringBuffer1!!.append(MediaDataFactory.getInstance()!!.JPG.getExtension())

    var filePath1: String = filePathStringBuffer1!!.toString()!!
            


    var filePathStringBuffer2: StringMaker = StringMaker()

filePathStringBuffer2!!.append(filePathStringBuffer!!.toString())
filePathStringBuffer2!!.append("_2")
filePathStringBuffer2!!.append(MediaDataFactory.getInstance()!!.JPG.getExtension())

    var filePath2: String = filePathStringBuffer2!!.toString()!!
            


    var bufferedImageCacheables: Array<BufferedImageCacheable?> = ChangedPixelsUtil.generateBufferedImageChacheables(imageComparisonResult)!!
            

logUtil!!.put("Comparison Image File Path 1: " +filePath1, this, commonStrings!!.SAVE)
logUtil!!.put("Comparison Image File Path 2: " +filePath2, this, commonStrings!!.SAVE)

    var bufferedImageArray: Array<BufferedImage?> = arrayOfNulls(2)

bufferedImageArray[0]= bufferedImageCacheables[0]!!.getBufferedImage()
bufferedImageArray[1]= bufferedImageCacheables[1]!!.getBufferedImage()

    var imagePersistanceUtil: ImagePersistanceUtil = ImagePersistanceUtil.getInstance()!!
            

imagePersistanceUtil!!.saveWithImageIO(filePath1, bufferedImageArray[0]!!)
imagePersistanceUtil!!.saveWithImageIO(filePath2, bufferedImageArray[1]!!)
}


}
                
            

