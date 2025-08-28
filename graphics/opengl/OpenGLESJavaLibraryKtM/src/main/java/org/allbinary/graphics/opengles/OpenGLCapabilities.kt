
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
        package org.allbinary.graphics.opengles




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.khronos.opengles.GL10
import javax.microedition.khronos.opengles.GL11
import org.allbinary.AndroidUtil
import org.allbinary.image.opengles.OpenGLESGL10ImageFactory
import org.allbinary.image.opengles.OpenGLESGL11VBOImageFactory
import org.allbinary.image.opengles.OpenGLImageSpecificFactory
import org.allbinary.util.BasicArrayList
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.tokens.Tokenizer
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.game.configuration.feature.Features
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil

open public class OpenGLCapabilities
            : Object
         {
        

        companion object {
            
    private val instance: OpenGLCapabilities = OpenGLCapabilities()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: OpenGLCapabilities{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val CUSTOM_GL_SURFACE_VIEW: Boolean = true

    private val stringUtil: StringUtil = StringUtil.getInstance()!!

    private var glVersionString: String = stringUtil!!.EMPTY_STRING

    private var glShaderVersionString: String = stringUtil!!.EMPTY_STRING

    var shaderVersion: Int = 0

    private var glRenderer: String = stringUtil!!.EMPTY_STRING

    private var glVendor: String = stringUtil!!.EMPTY_STRING

    private var glExtensions: String = stringUtil!!.EMPTY_STRING

    private var possiblyAccelerated: Boolean= false

    private var acceleratedString: String = stringUtil!!.EMPTY_STRING

    var maxTextureSize: Int = 64

    val VERSION_1_0: String = "1.0"

    val VERSION_1_1: String = "1.1"

    val VERSION_2_0: String = "2.0"

    val VERSION_3_0: String = "3.0"

    val VERSION_3_1: String = "3.1"

    val VERSION_3_2: String = "3.2"

    val VERSION_HIGHER_THAN_EXISTS: String = "999.999"

    val VERSION_UNK: String = "Unk"

    val GL_EXT_GPU_SHADER4: String = "GL_EXT_gpu_shader4"

    private var glVersion: String = this.glVersionString

    var glInstanceVersion: String = VERSION_UNK

    private var glExtensionDrawTexture: Boolean= false

    private var glThreedDrawTexture: Boolean= false

    private var glExtensionGPUShader4: Boolean= false

    private var vertexBufferObjectSupport: Boolean= false
private constructor        ()
            : super()
        {
}


open fun initCapabilities(gl: GL10)
        //nullable = true from not(false or (false and false)) = true
{
var gl = gl

    var METHOD_NAME: String = "initGLCapabilities"


        try {
            
    var features: Features = Features.getInstance()!!


    var openGLFeatureFactory: OpenGLFeatureFactory = OpenGLFeatureFactory.getInstance()!!


    var openGLImageSpecificFactory: OpenGLImageSpecificFactory = OpenGLImageSpecificFactory.getInstance()!!


    var stringBuffer: StringMaker = StringMaker()

glVersionString= gl.glGetString(GL10.GL_VERSION)

    var GL_SHADING_LANGUAGE_VERSION: Int = 0x8b8c

glShaderVersionString= gl.glGetString(GL_SHADING_LANGUAGE_VERSION)

    
                        if(glShaderVersionString == 
                                    null
                                )
                        
                                    {
                                    glShaderVersionString= stringUtil!!.EMPTY_STRING

                                    }
                                

        try {
            
    
                        if(glShaderVersionString != 
                                    null
                                 && glShaderVersionString!!.indexOf('.') >= 0)
                        
                                    {
                                    
    var startIndex: Int = glShaderVersionString!!.lastIndexOf(' ')!!


    
                        if(startIndex >= 0)
                        
                                    {
                                    glShaderVersionString= glShaderVersionString!!.substring(startIndex +1)

                                    }
                                
shaderVersion= Integer.parseInt(glShaderVersionString!!.replace(CommonSeps.getInstance()!!.PERIOD, StringUtil.getInstance()!!.EMPTY_STRING))

                                    }
                                
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, METHOD_NAME, e)
}

glRenderer= gl.glGetString(GL10.GL_RENDERER)
glVendor= gl.glGetString(GL10.GL_VENDOR)
glExtensions= gl.glGetString(GL10.GL_EXTENSIONS)

    
                        if(glExtensions!!.indexOf(this.GL_EXT_GPU_SHADER4) >= 0)
                        
                                    {
                                    glExtensionGPUShader4= true

                                    }
                                
                        else {
                            glExtensionGPUShader4= false

                        }
                            

    
                        if(glRenderer == 
                                    null
                                )
                        
                                    {
                                    glRenderer= stringUtil!!.EMPTY_STRING

                                    }
                                

    
                        if(glRenderer!!.lowercase()!!.indexOf("pixelflinger") >= 0)
                        
                                    {
                                    acceleratedString= "Probably Not for " +glRenderer
possiblyAccelerated= false

                                    }
                                
                        else {
                            acceleratedString= "Probably for " +glRenderer

                    //Otherwise - statement - EmptyStmt

possiblyAccelerated= true

                        }
                            
this.glExtensionDrawTexture= false

    
                        if(this.glVersionString == 
                                    null
                                )
                        
                                    {
                                    this.glVersionString= stringUtil!!.EMPTY_STRING
this.glVersion= this.VERSION_UNK

                                    }
                                
                             else 
    
                        if(this.glVersionString!!.indexOf(" 1.0") >= 0)
                        
                                    {
                                    this.glVersion= this.VERSION_1_0

                                    }
                                
                             else 
    
                        if(this.glVersionString!!.indexOf(" 1.1") >= 0)
                        
                                    {
                                    this.glVersion= this.VERSION_1_1

                                    }
                                
                        else {
                            this.glVersion= this.VERSION_UNK

                        }
                            

    
                        if(gl is GL11)
                        
                                    {
                                    this.glInstanceVersion= this.VERSION_1_1

                                    }
                                
                             else 
    
                        if(gl is GL10)
                        
                                    {
                                    this.glInstanceVersion= this.VERSION_1_0

                                    }
                                

    
                        if(glVendor == 
                                    null
                                )
                        
                                    {
                                    glVendor= stringUtil!!.EMPTY_STRING

                                    }
                                

    
                        if(glExtensions == 
                                    null
                                )
                        
                                    {
                                    glExtensions= stringUtil!!.EMPTY_STRING

                                    }
                                

    
                        if(possiblyAccelerated)
                        
                                    {
                                    PreLogUtil.put(StringMaker().
                            append("VBO:?")!!.append((this.glInstanceVersion == this.VERSION_1_1))!!.append("||")!!.append(this.isExtension(openGLFeatureFactory!!.OPENGL_VERTEX_BUFFER_OBJECT))!!.toString(), this, METHOD_NAME)

    
                        if((this.glInstanceVersion == this.VERSION_1_1 || this.isExtension(openGLFeatureFactory!!.OPENGL_VERTEX_BUFFER_OBJECT)))
                        
                                    {
                                    
    
                        if(AndroidUtil.isAndroid())
                        
                                    {
                                    PreLogUtil.put("VBO implementation was detected, but disabled by default for Android", this, METHOD_NAME)

                                    }
                                
                        else {
                            PreLogUtil.put("VBO implementation was detected, but disabled for now", this, METHOD_NAME)

                        }
                            

                                    }
                                

                                    }
                                

    var stringUtil: StringUtil = StringUtil.getInstance()!!


    
                        if(features.isDefault(openGLFeatureFactory!!.OPENGL_AUTO_SELECT))
                        
                                    {
                                    
    
                        if(this.isVertexBufferObjectSupport())
                        
                                    {
                                    openGLImageSpecificFactory!!.setImageFactory(OpenGLESGL11VBOImageFactory())

                                    }
                                
                        else {
                            stringBuffer!!.append("OpenGL is on but ")
stringBuffer!!.append(stringUtil!!.toString(openGLFeatureFactory!!.OPENGL_DRAW_TEXTURE))
stringBuffer!!.append(" was not available")
PreLogUtil.put(stringBuffer!!.toString(), this, METHOD_NAME)
openGLImageSpecificFactory!!.setImageFactory(OpenGLESGL10ImageFactory())

                        }
                            

                                    }
                                
                        else {
                            stringBuffer!!.append(stringUtil!!.toString(openGLFeatureFactory!!.OPENGL_AUTO_SELECT))
stringBuffer!!.append(" is not on")
PreLogUtil.put(stringBuffer!!.toString(), this, METHOD_NAME)
openGLImageSpecificFactory!!.setImageFactory(OpenGLESGL10ImageFactory())

                        }
                            

    var maxTextureSizeArray: IntArray = IntArray(1)

gl.glGetIntegerv(GL10.GL_MAX_TEXTURE_SIZE, maxTextureSizeArray, 0)
this.maxTextureSize= maxTextureSizeArray[0]!!
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, METHOD_NAME, e)
}

}


open fun isExtension(gameFeature: OpenGLFeature)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var gameFeature = gameFeature

    var index: Int = glExtensions!!.indexOf(gameFeature!!.getName())!!


    
                        if(index >= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var commonSeps: CommonSeps = CommonSeps.getInstance()!!


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("GL_VERSION: ")
stringBuffer!!.append(glVersionString)
stringBuffer!!.append(" GL_SHADING_LANGUAGE_VERSION: ")
stringBuffer!!.append(this.glShaderVersionString)
stringBuffer!!.append(" GL_RENDERER: ")
stringBuffer!!.append(glRenderer)
stringBuffer!!.append(" GL_VENDOR: ")
stringBuffer!!.append(glVendor)
stringBuffer!!.append(commonSeps!!.NEW_LINE)
stringBuffer!!.append(" Is Accelerated: ")
stringBuffer!!.append(acceleratedString)
stringBuffer!!.append(commonSeps!!.NEW_LINE)
stringBuffer!!.append(" VBO Support: ")
stringBuffer!!.append(this.isVertexBufferObjectSupport())
stringBuffer!!.append(commonSeps!!.NEW_LINE)
stringBuffer!!.append(" Max Texture Size: ")
stringBuffer!!.append(this.maxTextureSize)
stringBuffer!!.append(commonSeps!!.NEW_LINE)
stringBuffer!!.append(" GL_EXTENSIONS: ")

        try {
            
    var tokenizer: Tokenizer = Tokenizer(commonSeps!!.SPACE)


    var list: BasicArrayList = tokenizer.getTokens(glExtensions, BasicArrayList())!!


    var size: Int = list.size()!!





                        for (index in 0 until size)

        {
stringBuffer!!.append(commonSeps!!.NEW_LINE)
stringBuffer!!.append(stringUtil!!.toString(list.objectArray[index]!!))
}

} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

PreLogUtil.put(commonStrings!!.EXCEPTION, this, commonStrings!!.TOSTRING, e)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun isGlExtensionDrawTexture()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return glExtensionDrawTexture
}


open fun isGlExtensionGPUShader4()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return glExtensionGPUShader4
}


open fun getGlVersion()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return glVersion
}


open fun getGlVersionString()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return glVersionString
}


open fun getGlShaderVersion()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return glShaderVersionString
}


open fun isGlThreedDrawTexture()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return glThreedDrawTexture
}


open fun getGlRenderer()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return glRenderer
}


open fun isVertexBufferObjectSupport()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return vertexBufferObjectSupport
}


open fun isTextureSizeValid(widthAndHeight: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var widthAndHeight = widthAndHeight

    
                        if(this.maxTextureSize >= widthAndHeight)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

