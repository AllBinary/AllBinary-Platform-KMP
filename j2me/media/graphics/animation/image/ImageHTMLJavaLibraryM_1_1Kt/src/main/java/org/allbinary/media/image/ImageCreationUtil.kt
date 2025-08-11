
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
import org.allbinary.image.GameFeatureImageCacheFactory

open public class ImageCreationUtil
            : Object
         {
        

        companion object {


    private val instance: ImageCreationUtil = ImageCreationUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ImageCreationUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            private constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun getInstance(width: Int, height: Int)
        //nullable =  from not(true or (false and false)) = 
: Image{

                    var width = width


                    var height = height

    var image: Image = GameFeatureImageCacheFactory.getInstance()!!.get(this::class.qualifiedName!!, width, height)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}


                @Throws(Exception::class)
            
open fun createImage(width: Int, height: Int, maxScaleX: Float, maxScaleY: Float)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var width = width


                    var height = height


                    var maxScaleX = maxScaleX


                    var maxScaleY = maxScaleY

    var image: Image = GameFeatureImageCacheFactory.getInstance()!!.get(this::class.qualifiedName!!, (width *maxScaleX).toInt() +1, (height *maxScaleY).toInt() +1)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}


}
                
            

