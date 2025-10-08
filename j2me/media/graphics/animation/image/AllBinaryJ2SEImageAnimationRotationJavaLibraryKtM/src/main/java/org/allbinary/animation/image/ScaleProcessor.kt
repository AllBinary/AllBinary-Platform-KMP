
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
        package org.allbinary.animation.image




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Image
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.media.image.ImageScaleUtil
import org.allbinary.string.CommonStrings

open public class ScaleProcessor : ScaleBaseProcessor {
        
companion object {
            
    private val instance: ScaleProcessor = ScaleProcessor()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ScaleBaseProcessor{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val imageScaleUtil: ImageScaleUtil = ImageScaleUtil.getInstance()!!

    override fun update(originalImage: Image, originalImageArray: Array<Image?>, ximageToShowArray: Array<Image?>, unused: Int, scaleX: Float, scaleY: Float, maxScaleX: Float, maxScaleY: Float)
        //nullable = true from not(false or (false and false)) = true
{
    //var originalImage = originalImage
    //var originalImageArray = originalImageArray
    //var ximageToShowArray = ximageToShowArray
    //var unused = unused
    //var scaleX = scaleX
    //var scaleY = scaleY
    //var maxScaleX = maxScaleX
    //var maxScaleY = maxScaleY

        try {
            imageScaleUtil!!.scale(originalImage, originalImageArray, ximageToShowArray, unused, scaleX, scaleY, maxScaleX, maxScaleY)
} catch(e: Exception)
            {
logUtil!!.put(this.commonStrings!!.EXCEPTION, this, this.commonStrings!!.UPDATE, e)
}

}


}
                
            

