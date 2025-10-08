
        /* Generated Code Do Not Modify */
        package org.platform.opengl




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.nio.ByteBuffer
import javax.microedition.khronos.opengles.GL10
import org.allbinary.graphics.OpenGLBitmap
import org.allbinary.image.opengles.OpenGLESImage

open public class OpenGLGLUUtils
            : Object
         {
        
companion object {
            
    private val instance: OpenGLGLUUtils = OpenGLGLUUtils()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: OpenGLGLUUtils{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    open fun makeByteBuffer(bmp: OpenGLBitmap, flip: Boolean)
        //nullable = true from not(false or (false and false)) = true
: ByteBuffer{
    //var bmp = bmp
    //var flip = flip



                            throw RuntimeException()
}


    open fun texImage2D(gl: GL10, glVersion: String, target: Int, level: Int, generateMipMap: Boolean, openGLESImage: OpenGLESImage, border: Int, flip: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
    //var gl = gl
    //var glVersion = glVersion
    //var target = target
    //var level = level
    //var generateMipMap = generateMipMap
    //var openGLESImage = openGLESImage
    //var border = border
    //var flip = flip



                            throw RuntimeException()
}


    open fun texImage2D(gl: GL10, glVersion: String, target: Int, level: Int, generateMipMap: Boolean, bitmap: OpenGLBitmap, border: Int, flip: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
    //var gl = gl
    //var glVersion = glVersion
    //var target = target
    //var level = level
    //var generateMipMap = generateMipMap
    //var bitmap = bitmap
    //var border = border
    //var flip = flip



                            throw RuntimeException()
}


}
                
            

