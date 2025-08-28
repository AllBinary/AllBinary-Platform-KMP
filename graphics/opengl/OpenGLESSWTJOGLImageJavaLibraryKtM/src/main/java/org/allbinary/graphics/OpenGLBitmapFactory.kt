
        /* Generated Code Do Not Modify */
        package org.allbinary.graphics




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.IOException
import java.io.InputStream
import javax.microedition.lcdui.Image
import org.allbinary.platform.graphics.PlatformBitmapBaseFactory
import org.allbinary.platform.graphics.PlatformBitmapBase

open public class OpenGLBitmapFactory : PlatformBitmapBaseFactory {
        

        companion object {
            
    private val instance: OpenGLBitmapFactory = OpenGLBitmapFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: OpenGLBitmapFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open public inner class Config
            : Object
         {
        
/*Static stuff is not allowed for Kotlin inner classes
        companion object {
            *//*
        }
            */


    val bitmapConfig: Any
private constructor        (bitmapConfig: Any)
            : super()
        {
    //var bitmapConfig = bitmapConfig
this.bitmapConfig= bitmapConfig
}


}
                
            
    val ARGB_8888: Config = Config(
                            null)

open fun createBitmap(width: Int, height: Int, config: OpenGLBitmapFactory.Config)
        //nullable = true from not(false or (false and false)) = true
: OpenGLBitmap{
var width = width
var height = height
var config = config



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return OpenGLBitmap(Image.createImage(width, height))
}


                @Throws(IOException::class)
            
open fun decodeStream(inputStream: InputStream)
        //nullable = true from not(false or (false and false)) = true
: OpenGLBitmap{
var inputStream = inputStream



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return OpenGLBitmap(Image.createImage(inputStream))
}


open fun createBitmap(image: Image)
        //nullable = true from not(false or (false and false)) = true
: PlatformBitmapBase{
    //var image = image



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return OpenGLBitmap(image)
}


}
                
            

