
        /* Generated Code Do Not Modify */
        package org.allbinary.graphics



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import android.graphics.Bitmap
import org.allbinary.platform.graphics.PlatformBitmapBase

open public class OpenGLBitmap : PlatformBitmapBase {
        

    val bitmap: Bitmap
public constructor        (bitmap: Any){

                    var bitmap = bitmap
this.bitmap= bitmap as Bitmap
}


open fun getPixels(pixels: IntArray, offset: Int, stride: Int, x: Int, y: Int, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var pixels = pixels


                    var offset = offset


                    var stride = stride


                    var x = x


                    var y = y


                    var width = width


                    var height = height
this.bitmap.getPixels(pixels, offset, stride, x, y, width, height)
}


open fun setPixels(pixels: IntArray, offset: Int, stride: Int, x: Int, y: Int, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var pixels = pixels


                    var offset = offset


                    var stride = stride


                    var x = x


                    var y = y


                    var width = width


                    var height = height
this.bitmap.setPixels(pixels, offset, stride, x, y, width, height)
}


open fun getWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.bitmap.getWidth()
}


open fun getHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.bitmap.getHeight()
}


open fun recycle()
        //nullable = true from not(false or (false and true)) = true
{this.bitmap.recycle()
}


}
                
            

