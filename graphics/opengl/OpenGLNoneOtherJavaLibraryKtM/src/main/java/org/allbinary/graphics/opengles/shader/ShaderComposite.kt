
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2025 AllBinary 
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
        package org.allbinary.graphics.opengles.shader




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.khronos.opengles.GL10
import org.allbinary.graphics.opengles.NullOpenGLProcessorFactory
import org.allbinary.graphics.opengles.OpenGLProcessor
import org.allbinary.logic.string.StringUtil

open public class ShaderComposite
            : Object
         {
        

    val disableProgramShaderOpenGLProcessor: OpenGLProcessor

    val requiresOpenGLVersion: String

    val shaderArray: Array<Shader?>

    val shaderInitializer: ShaderInitializer

    val compositeShaderUpdater: CompositeShaderUpdater

    val modelViewProjection: ModelViewProjection

    val colorOpenGLProcessor: OpenGLProcessor

    val vertexOpenGLProcessor: OpenGLProcessor

    var useProgramShaderOpenGLProcessor: OpenGLProcessor = NullOpenGLProcessorFactory.getInstance()!!

    var shaderMatrixOpenGLProcessor: OpenGLProcessor = NullOpenGLProcessorFactory.getInstance()!!

    var colorEnableVertexAttribArrayOpenGLProcessor: OpenGLProcessor = NullOpenGLProcessorFactory.getInstance()!!

    var normalEnableVertexAttribArrayOpenGLProcessor: OpenGLProcessor = NullOpenGLProcessorFactory.getInstance()!!

    var vertexEnableVertexAttribArrayOpenGLProcessor: OpenGLProcessor = NullOpenGLProcessorFactory.getInstance()!!

    var textureEnableVertexAttribArrayOpenGLProcessor: OpenGLProcessor = NullOpenGLProcessorFactory.getInstance()!!

    var colorDisableVertexAttribArrayOpenGLProcessor: OpenGLProcessor = NullOpenGLProcessorFactory.getInstance()!!

    var normalDisableVertexAttribArrayOpenGLProcessor: OpenGLProcessor = NullOpenGLProcessorFactory.getInstance()!!

    var vertexDisableVertexAttribArrayOpenGLProcessor: OpenGLProcessor = NullOpenGLProcessorFactory.getInstance()!!

    var textureDisableVertexAttribArrayOpenGLProcessor: OpenGLProcessor = NullOpenGLProcessorFactory.getInstance()!!

    var uniformTextureUnitOpenGLProcessor: OpenGLTextureProcessor = NullOpenGLTextureProcessor.getInstance()!!

    var programHandle: Int= 0
public constructor        (requiresOpenGLVersion: String, shaderArray: Array<Shader?>, compositeShaderUpdater: CompositeShaderUpdater, shaderInitializer: ShaderInitializer, modelViewProjection: ModelViewProjection, colorOpenGLProcessor: OpenGLProcessor, vertexOpenGLProcessor: OpenGLProcessor, disableProgramShaderOpenGLProcessor: OpenGLProcessor)
            : super()
        {
    //var requiresOpenGLVersion = requiresOpenGLVersion
    //var shaderArray = shaderArray
    //var compositeShaderUpdater = compositeShaderUpdater
    //var shaderInitializer = shaderInitializer
    //var modelViewProjection = modelViewProjection
    //var colorOpenGLProcessor = colorOpenGLProcessor
    //var vertexOpenGLProcessor = vertexOpenGLProcessor
    //var disableProgramShaderOpenGLProcessor = disableProgramShaderOpenGLProcessor
this.requiresOpenGLVersion= requiresOpenGLVersion
this.shaderArray= shaderArray
this.shaderInitializer= shaderInitializer
this.compositeShaderUpdater= compositeShaderUpdater
this.modelViewProjection= modelViewProjection
this.colorOpenGLProcessor= colorOpenGLProcessor
this.vertexOpenGLProcessor= vertexOpenGLProcessor
this.disableProgramShaderOpenGLProcessor= disableProgramShaderOpenGLProcessor
}


open fun init(gl: GL10)
        //nullable = true from not(false or (false and false)) = true
{
var gl = gl
this.programHandle= this.shaderInitializer!!.init(gl, this.shaderArray, StringUtil.getInstance()!!.getArrayInstance())
}


}
                
            

