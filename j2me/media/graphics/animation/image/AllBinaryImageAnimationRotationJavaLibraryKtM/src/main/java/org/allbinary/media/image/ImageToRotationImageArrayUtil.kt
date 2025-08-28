
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

open public class ImageToRotationImageArrayUtil
            : Object
         {
        

        companion object {
            
    private val instance: ImageToRotationImageArrayUtil = ImageToRotationImageArrayUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ImageToRotationImageArrayUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        {
}


                @Throws(Exception::class)
            
open fun generate(image: Image, angleIncrement: Int, totalAngle: Int)
        //nullable = true from not(false or (false and false)) = true
: Array<Image?>{
var image = image
var angleIncrement = angleIncrement
var totalAngle = totalAngle

    var imageRotationUtil: ImageRotationUtil = ImageRotationUtil.getInstance()!!


    var totalFrames: Int = totalAngle /angleIncrement


    var imageArray: Array<Image?> = arrayOfNulls(totalFrames)

imageArray[0]= image




                        for (index in 1 until totalFrames)

        {
imageArray[index]= imageRotationUtil!!.createRotatedImage(image, index *angleIncrement)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return imageArray
}


}
                
            

