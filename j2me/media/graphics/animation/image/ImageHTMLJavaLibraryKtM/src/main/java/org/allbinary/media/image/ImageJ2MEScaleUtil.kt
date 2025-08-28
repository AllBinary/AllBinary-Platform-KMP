
        /*
                * 
                *  AllBinary Open License Version 1
                *  Copyright (c) 2023 AllBinary
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

open public class ImageJ2MEScaleUtil
            : Object
         {
        

        companion object {
            
    private val instance: ImageJ2MEScaleUtil = ImageJ2MEScaleUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ImageJ2MEScaleUtil

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


                @Throws(Exception::class)
            
open fun scale(images: Array<Image?>, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
: Array<Image?>

        Updates for KMP build        
        {
var images = images
var width = width
var height = height

    var scaledImages: Array<Image?> = arrayOfNulls(images.size)





                        for (index in images.size  - 1  downTo 0)

        

        Updates for KMP build        
        {
scaledImages[index]= this.scale(images[index]!!, width, height)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return scaledImages
}


                @Throws(Exception::class)
            
open fun scale(image: Image, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
: Image

        Updates for KMP build        
        {
var image = image
var width = width
var height = height



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}


}
                
            

