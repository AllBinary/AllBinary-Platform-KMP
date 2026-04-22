
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
import org.allbinary.util.BasicArrayListD
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.tokens.Tokenizer
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.game.configuration.feature.Features
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

    private var initialized: Boolean = false

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

    val GL_EXT_GPU_SHADER_100: String = "GL_ARB_shading_language_100"

    val GL_EXT_GPU_SHADER4: String = "GL_EXT_gpu_shader4"

    private var glVersion: String = this.glVersionString

    var glInstanceVersion: String = VERSION_UNK

    private var glExtensionDrawTexture: Boolean= false

    private var glThreedDrawTexture: Boolean= false

    private var glExtensionGPUShader4: Boolean= false

    private var glExtensionGPUShader100: Boolean= false

    private var vertexBufferObjectSupport: Boolean= false
private constructor ()
            : super()
        {
}


    open fun isInitialized()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return initialized
}


    open fun requireInitialization()
        //nullable = true from not(false or (false and true)) = true
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

this.glVersionString= gl.glGetString(GL10.GL_VERSION)

    var GL_SHADING_LANGUAGE_VERSION: Int = 0x8b8c

this.glShaderVersionString= gl.glGetString(GL_SHADING_LANGUAGE_VERSION)

    
                        if(this.glShaderVersionString == 
                                    null
                                )
                        
                                    {
                                    this.glShaderVersionString= this.stringUtil!!.EMPTY_STRING

                                    }
                                

        try {
            
    
                        if(this.glShaderVersionString != 
                                    null
                                 && this.glShaderVersionString!!.indexOf('.') >= 0)
                        
                                    {
                                    
    var startIndex: Int = this.glShaderVersionString!!.lastIndexOf(' ')!!


    
                        if(startIndex >= 0)
                        
                                    {
                                    this.glShaderVersionString= this.glShaderVersionString!!.substring(startIndex +1)

                                    }
                                
this.shaderVersion= Integer.parseInt(this.glShaderVersionString!!.replace(CommonSeps.getInstance()!!.PERIOD, StringUtil.getInstance()!!.EMPTY_STRING))

                                    }
                                
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

this.logUtil!!.put(commonStrings!!.EXCEPTION, this, METHOD_NAME, e)
}

this.glRenderer= gl.glGetString(GL10.GL_RENDERER)
this.glVendor= gl.glGetString(GL10.GL_VENDOR)
this.glExtensions= gl.glGetString(GL10.GL_EXTENSIONS)

    
                        if(this.glExtensions!!.indexOf(this.GL_EXT_GPU_SHADER_100) >= 0)
                        
                                    {
                                    this.glExtensionGPUShader100= true

                                    }
                                
                        else {
                            this.glExtensionGPUShader100= false

                        }
                            

    
                        if(this.glExtensions!!.indexOf(this.GL_EXT_GPU_SHADER4) >= 0)
                        
                                    {
                                    this.glExtensionGPUShader4= true

                                    }
                                
                        else {
                            this.glExtensionGPUShader4= false

                        }
                            

    
                        if(this.glRenderer == 
                                    null
                                )
                        
                                    {
                                    this.glRenderer= this.stringUtil!!.EMPTY_STRING

                                    }
                                

    
                        if(this.glRenderer!!.lowercase()!!.indexOf("pixelflinger") >= 0)
                        
                                    {
                                    this.acceleratedString= "Probably Not for " +this.glRenderer
this.possiblyAccelerated= false

                                    }
                                
                        else {
                            this.acceleratedString= "Probably for " +this.glRenderer

                    //Otherwise - statement - EmptyStmt

this.possiblyAccelerated= true

                        }
                            
this.glExtensionDrawTexture= false

    
                        if(this.glVersionString == 
                                    null
                                )
                        
                                    {
                                    this.glVersionString= this.stringUtil!!.EMPTY_STRING
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
                                

    
                        if(this.glVendor == 
                                    null
                                )
                        
                                    {
                                    this.glVendor= this.stringUtil!!.EMPTY_STRING

                                    }
                                

    
                        if(this.glExtensions == 
                                    null
                                )
                        
                                    {
                                    this.glExtensions= this.stringUtil!!.EMPTY_STRING

                                    }
                                

    
                        if(this.possiblyAccelerated)
                        
                                    {
                                    PreLogUtil.put(StringMaker().
                            append("VBO:?")!!.appendboolean((this.glInstanceVersion == this.VERSION_1_1))!!.append("||")!!.appendboolean(this.isExtension(openGLFeatureFactory!!.OPENGL_VERTEX_BUFFER_OBJECT))!!.toString(), this, METHOD_NAME)

    
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
                                    
    
                        if(this.vertexBufferObjectSupport)
                        
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
this.initialized= true
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

this.logUtil!!.put(commonStrings!!.EXCEPTION, this, METHOD_NAME, e)
}

}


    open fun isExtension(gameFeature: OpenGLFeature)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var gameFeature = gameFeature

    var index: Int = this.glExtensions!!.indexOf(gameFeature!!.getName())!!


    
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


    open fun isGlExtensionDrawTexture()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
this.requireInitialization()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.glExtensionDrawTexture
}


    open fun isGlExtensionGPUShader100()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.glExtensionGPUShader100
}


    open fun isGlExtensionGPUShader4()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
this.requireInitialization()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.glExtensionGPUShader4
}


    open fun getGlVersion()
        //nullable = true from not(false or (false and true)) = true
: String{
this.requireInitialization()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.glVersion
}


    open fun getGlVersionString()
        //nullable = true from not(false or (false and true)) = true
: String{
this.requireInitialization()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.glVersionString
}


    open fun getGlShaderVersion()
        //nullable = true from not(false or (false and true)) = true
: String{
this.requireInitialization()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.glShaderVersionString
}


    open fun isGlThreedDrawTexture()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
this.requireInitialization()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.glThreedDrawTexture
}


    open fun getGlRenderer()
        //nullable = true from not(false or (false and true)) = true
: String{
this.requireInitialization()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.glRenderer
}


    open fun isVertexBufferObjectSupport()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
this.requireInitialization()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.vertexBufferObjectSupport
}


    open fun isTextureSizeValid(widthAndHeight: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var widthAndHeight = widthAndHeight
this.requireInitialization()

    
                        if(this.maxTextureSize >= widthAndHeight)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var commonSeps: CommonSeps = CommonSeps.getInstance()!!


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("GL_VERSION: ")
stringBuffer!!.append(this.glVersionString)
stringBuffer!!.append(" GL_SHADING_LANGUAGE_VERSION: ")
stringBuffer!!.append(this.glShaderVersionString)
stringBuffer!!.append(" GL_RENDERER: ")
stringBuffer!!.append(this.glRenderer)
stringBuffer!!.append(" GL_VENDOR: ")
stringBuffer!!.append(this.glVendor)
stringBuffer!!.append(commonSeps!!.NEW_LINE)
stringBuffer!!.append(" Is Accelerated: ")
stringBuffer!!.append(this.acceleratedString)
stringBuffer!!.append(commonSeps!!.NEW_LINE)
stringBuffer!!.append(" VBO Support: ")
stringBuffer!!.appendboolean(this.isVertexBufferObjectSupport())
stringBuffer!!.append(commonSeps!!.NEW_LINE)
stringBuffer!!.append(" Max Texture Size: ")
stringBuffer!!.appendint(this.maxTextureSize)
stringBuffer!!.append(commonSeps!!.NEW_LINE)
stringBuffer!!.append(" GL_EXTENSIONS: ")

        try {
            
    var tokenizer: Tokenizer = Tokenizer(commonSeps!!.SPACE)


    var list: BasicArrayList = tokenizer.getTokens(this.glExtensions, BasicArrayListD())!!


    var size: Int = list.size()!!





                        for (index in 0 until size)

        {
stringBuffer!!.append(commonSeps!!.NEW_LINE)
stringBuffer!!.append(this.stringUtil!!.toString(list.objectArray[index]!!))
}

} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

PreLogUtil.putOE(commonStrings!!.EXCEPTION, this, commonStrings!!.TOSTRING, e)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

