
        /* Generated Code Do Not Modify */
        package org.allbinary.device




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.khronos.opengles.GL
import javax.microedition.khronos.opengles.GL10
import javax.microedition.lcdui.Font
import org.allbinary.graphics.font.FontDebugBase
import org.allbinary.image.opengles.OpenGLSurfaceChangedInterface
import org.allbinary.string.CommonStrings

open public class OpenGLESGraphics
            : Object
        
                , OpenGLSurfaceChangedInterface
                , GraphicsInterface {
        

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    var gl: GL10 = NullGL10.NULL_GL10
 constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


open fun update(gl: GL)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var gl = gl
}

override fun set(gl: GL)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var gl = gl
}


                @Throws(Exception::class)
            
open fun init()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


                @Throws(Exception::class)
            
open fun update()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


open fun setOrthoginalMode()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


open fun setCameraMode()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


open fun getGlP()
        //nullable = true from not(false or (false and true)) = true
: GL10

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gl
}

override fun setFont(font: Font, fontDebug: FontDebugBase)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var font = font
    //var fontDebug = fontDebug



                            throw RuntimeException()
}


}
                
            

