
        /* Generated Code Do Not Modify */
        package org.platform.opengl




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.khronos.opengles.GL10
import javax.microedition.lcdui.Image
import org.allbinary.platform.opengles.PlatformTextureBaseFactory

open public class OpenGLTextureFactory : PlatformTextureBaseFactory {
        

        companion object {
            
    private val instance: OpenGLTextureFactory = OpenGLTextureFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: OpenGLTextureFactory

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private val gluUtils: OpenGLGLUUtils = OpenGLGLUUtils.getInstance()!!
private constructor        ()

        Updates for KMP build        
        {
}

override fun load(gl: GL10, target: Int, level: Int, image: Image, border: Int, flip: Boolean)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var gl = gl
    //var target = target
    //var level = level
    //var image = image
    //var border = border
    //var flip = flip



                            throw RuntimeException()
}


}
                
            

