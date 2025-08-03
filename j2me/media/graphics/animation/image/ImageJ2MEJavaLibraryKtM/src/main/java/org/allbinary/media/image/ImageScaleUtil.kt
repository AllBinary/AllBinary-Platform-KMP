
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
        
import javax.microedition.lcdui.Image
import org.allbinary.image.ImageCache

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
            private constructor        ()
            : super()
        {}


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



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return originalImage
}


}
                
            

