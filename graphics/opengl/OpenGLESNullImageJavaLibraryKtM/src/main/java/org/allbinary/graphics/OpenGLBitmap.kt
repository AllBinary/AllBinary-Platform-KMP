
        /* Generated Code Do Not Modify */
        package org.allbinary.graphics




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.platform.graphics.PlatformBitmapBase

open public class OpenGLBitmap : PlatformBitmapBase {
        

    val bitmap: Any
public constructor        (bitmap: Any)

        Updates for KMP build        
        {
    //var bitmap = bitmap
this.bitmap= bitmap
}


open fun getPixels(pixels: IntArray, offset: Int, stride: Int, x: Int, y: Int, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var pixels = pixels
var offset = offset
var stride = stride
var x = x
var y = y
var width = width
var height = height
}


open fun setPixels(pixels: IntArray, offset: Int, stride: Int, x: Int, y: Int, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var pixels = pixels
var offset = offset
var stride = stride
var x = x
var y = y
var width = width
var height = height
}


open fun getWidth()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


open fun getHeight()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


open fun recycle()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


}
                
            

