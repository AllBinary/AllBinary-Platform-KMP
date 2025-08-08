
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
        package org.allbinary.media.image



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import android.graphics.Paint
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import javax.microedition.lcdui.Image
import org.allbinary.graphics.color.BasicColor

open public class ImageModifierUtil
            : Object
         {
        

        companion object {


open fun getInstanceOrCreate()
        //nullable = true from not(false or (false and true)) = true
: ImageModifierUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ImageModifierUtil()
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val paint: Paint = Paint(Paint.ANTI_ALIAS_FLAG)

open fun setColor(unusedOriginalImage: Image, image: Image, imageIndex: Int, basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{

                    var unusedOriginalImage = unusedOriginalImage


                    var image = image


                    var imageIndex = imageIndex


                    var basicColor = basicColor
paint.setColorFilter(PorterDuffColorFilter(basicColor!!.toInt(), PorterDuff.Mode.SRC_IN))
}


open fun changeColor(unusedOriginalImage: Image, image: Image, imageIndex: Int, basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{

                    var unusedOriginalImage = unusedOriginalImage


                    var image = image


                    var imageIndex = imageIndex


                    var basicColor = basicColor
}


open fun setAlpha(originalImage: Image, image: Image, imageIndex: Int, alphaInt: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var originalImage = originalImage


                    var image = image


                    var imageIndex = imageIndex


                    var alphaInt = alphaInt

    
                        if(alphaInt != paint.getAlpha())
                        
                                    {
                                    paint.setAlpha(alphaInt)

                                    }
                                
}


open fun getImageArray(originalImageArray: Array<Image?>)
        //nullable = true from not(false or (false and false)) = true
: Array<Image?>{

                    var originalImageArray = originalImageArray



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return originalImageArray
}


open fun handleImage(imageArray: Array<Image?>, index: Int, image: Image)
        //nullable = true from not(false or (false and false)) = true
{

                    var imageArray = imageArray


                    var index = index


                    var image = image
}


open fun reset()
        //nullable = true from not(false or (false and true)) = true
{}


}
                
            

