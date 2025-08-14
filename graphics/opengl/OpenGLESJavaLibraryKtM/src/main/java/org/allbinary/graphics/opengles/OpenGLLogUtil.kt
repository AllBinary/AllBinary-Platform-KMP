
        /* Generated Code Do Not Modify */
        package org.allbinary.graphics.opengles




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.khronos.opengles.GL10
import javax.microedition.lcdui.Image
import org.allbinary.image.opengles.OpenGLStrings
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.communication.log.PreLogUtil

open public class OpenGLLogUtil
            : Object
         {
        

        companion object {
            
    private val instance: OpenGLLogUtil = OpenGLLogUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: OpenGLLogUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val MAX_TEXTURE: String = " Max Texture Size: "

open fun logError(gl: GL10)
        //nullable = true from not(false or (false and false)) = true
{

                    var gl = gl

    var error: Int = gl.glGetError()!!
            


    
                        if(error != GL10.GL_NO_ERROR)
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(OpenGLStrings.getInstance()!!.GL_ERROR_LABEL)
stringBuffer!!.append(error)

    
                        if(error == 1281)
                        
                                    {
                                    stringBuffer!!.append(MAX_TEXTURE)

    var maxTextureSize: IntArray = IntArray(1)

gl.glGetIntegerv(GL10.GL_MAX_TEXTURE_SIZE, maxTextureSize, 0)
stringBuffer!!.append(maxTextureSize[0]!!)

                                    }
                                

    
                        if(error == 1280)
                        
                                    {
                                    PreLogUtil.put(stringBuffer!!.toString(), this, OpenGLStrings.getInstance()!!.SET)

                                    }
                                
                        else {
                            ForcedLogUtil.log(stringBuffer!!.toString(), this)

                        }
                            

                                    }
                                
}


    private val LOG_ERROR: String = "logError"

    private val IMAGE: String = " Image: "

open fun logError(gl: GL10, image: Image)
        //nullable = true from not(false or (false and false)) = true
{

                    var gl = gl


                    var image = image

    var error: Int = gl.glGetError()!!
            


    
                        if(error != GL10.GL_NO_ERROR)
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(OpenGLStrings.getInstance()!!.GL_ERROR_LABEL)
stringBuffer!!.append(error)

    
                        if(error == 1281)
                        
                                    {
                                    stringBuffer!!.append(MAX_TEXTURE)

    var maxTextureSize: IntArray = IntArray(1)

gl.glGetIntegerv(GL10.GL_MAX_TEXTURE_SIZE, maxTextureSize, 0)
stringBuffer!!.append(maxTextureSize[0]!!)

                                    }
                                
stringBuffer!!.append(IMAGE)
stringBuffer!!.append(image.toString())
PreLogUtil.put(stringBuffer!!.toString(), this, LOG_ERROR)

                                    }
                                
}


}
                
            

