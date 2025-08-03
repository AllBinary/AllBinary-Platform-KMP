
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
import org.allbinary.graphics.Anchor

open public class ImageRotationUtil
            : Object
         {
        

        companion object {


    private val instance: ImageRotationUtil = ImageRotationUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ImageRotationUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            private constructor        ()
            : super()
        {}


    private var anchor: Int = Anchor.TOP_LEFT

                @Throws(Exception::class)
            
open fun createRotatedImage(originalImage: Image, rotationInDegrees: Int)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var originalImage = originalImage


                    var rotationInDegrees = rotationInDegrees



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return originalImage
}


}
                
            

