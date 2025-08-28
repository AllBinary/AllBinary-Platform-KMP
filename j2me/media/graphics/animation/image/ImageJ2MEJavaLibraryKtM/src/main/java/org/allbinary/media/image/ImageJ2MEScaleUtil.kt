
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
    //var images = images
    //var width = width
    //var height = height

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
    //var image = image
    //var width = width
    //var height = height

    var sourceWidth: Int = image.getWidth()!!


    var sourceHeight: Int = image.getHeight()!!


    var originalData: IntArray = IntArray(image.getWidth() *image.getHeight())

image.getRGB(originalData, 0, image.getWidth(), 0, 0, image.getWidth(), image.getHeight())

    var scaledData: IntArray = IntArray(width *height)


    var heightRatioFactor: Int = (8 *sourceHeight) /height


    var widthRatioFactor: Int = (8 *sourceWidth) /width


    var scaledIndex: Int = scaledData!!.size -1


    var dx: Int= 0


    var dy: Int= 0





                        for (index in height  - 1  downTo 0)

        

        Updates for KMP build        
        {
dy= (index *heightRatioFactor) shr 3




                        for (index2 in width  - 1  downTo 0)

        

        Updates for KMP build        
        {
dx= (index2 *widthRatioFactor) shr 3
scaledData[scaledIndex--]= originalData[(sourceWidth *dy) +dx]!!
}

}


    var scaledImage: Image = Image.createRGBImage(scaledData, width, height, true)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return scaledImage
}


}
                
            

