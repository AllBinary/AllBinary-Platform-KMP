
        /* Generated Code Do Not Modify */
        package org.platform.graphics




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.IOException
import java.io.InputStream
import org.allbinary.graphics.OpenGLBitmap
import org.allbinary.graphics.color.BasicColor

open public class OpenGLImageUtil
            : Object
         {
        
companion object {
            
    private val instance: OpenGLImageUtil = OpenGLImageUtil()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: OpenGLImageUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


                @Throws(IOException::class)
            
    open fun createImage(inputStream: InputStream)
        //nullable = true from not(false or (false and false)) = true
: OpenGLBitmap{
    //var inputStream = inputStream



                            throw RuntimeException()
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    open fun paint(alphaBitmap: OpenGLBitmap, originalBitmap: OpenGLBitmap, index: Int)
        //nullable = true from not(false or (false and false)) = true
: OpenGLBitmap{
    //var alphaBitmap = alphaBitmap
    //var originalBitmap = originalBitmap
    //var index = index



                            throw RuntimeException()
}


    open fun paint(colorBitmap: OpenGLBitmap, originalBitmap: OpenGLBitmap, alpha: Int, basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
: OpenGLBitmap{
    //var colorBitmap = colorBitmap
    //var originalBitmap = originalBitmap
    //var alpha = alpha
    //var basicColor = basicColor



                            throw RuntimeException()
}


                @Throws(IOException::class)
            
    open fun createImage(name: String)
        //nullable = true from not(false or (false and false)) = true
: OpenGLBitmap{
    //var name = name



                            throw RuntimeException()
}


}
                
            

