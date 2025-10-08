
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
        package org.allbinary.input.media.image.capture




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
import org.allbinary.media.image.ImageUtil
import org.allbinary.media.image.cache.BufferedImageFrameCacheable
import org.allbinary.media.image.io.ImageIOInterface
import org.allbinary.string.CommonStrings

open public class CapturedImageInputOutput
            : Object
        
                , ImageIOInterface {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

                @Throws(Exception::class)
            
    open fun save(frame: Long)
        //nullable = true from not(false or (false and false)) = true
{
var frame = frame

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


    var capturedBufferedImageCacheable: BufferedImageFrameCacheable = (
                                    (getInstance as AutomaticCacheInterface).get(frame) as Object as BufferedImageFrameCacheable)

logUtil!!.put(("Saving: " +capturedBufferedImageCacheable!!.toString()), this, commonStrings!!.SAVE)
save(capturedBufferedImageCacheable!!.getBufferedImage(), frame)
}


    open fun save(bufferedImage: BufferedImage, frame: Long)
        //nullable = true from not(false or (false and false)) = true
{
var bufferedImage = bufferedImage
var frame = frame

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


    var imageUtil: ImageUtil = ImageUtil.getInstance()!!


    var filePathStringBuffer: StringMaker = StringMaker()

filePathStringBuffer!!.append(ImageOutputData.SAVE_PATH)
filePathStringBuffer!!.append(LongUtil.fillIn(frame.toString()))
filePathStringBuffer!!.append(MediaDataFactory.getInstance()!!.JPG.getExtension())

    var filePath: String = filePathStringBuffer!!.toString()!!

logUtil!!.put(("Image File Path: " +filePath +imageUtil!!.toString(bufferedImage)), this, commonStrings!!.SAVE)

    var imagePersistanceUtil: ImagePersistanceUtil = ImagePersistanceUtil.getInstance()!!

imagePersistanceUtil!!.saveWithImageIO(filePath, bufferedImage)
}


}
                
            

