
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.khronos.opengles.GL10
import org.allbinary.graphics.opengles.NullOpenGLProcessorFactory
import org.allbinary.graphics.opengles.OpenGLCapabilities
import org.allbinary.graphics.opengles.OpenGLProcessor

open public class NullShaderComposite : ShaderComposite {
        

        companion object {
            
    private val instance: NullShaderComposite = object: NullShaderComposite(OpenGLCapabilities.getInstance()!!.VERSION_2_0, arrayOf(Shader(),Shader()), CompositeShaderUpdater.getInstance(), ShaderInitializer.getInstance(), ModelViewProjection.getInstance(), 
                            null, 
                            null, NullOpenGLProcessorFactory.getInstance())
                                {
                                
open override fun init(gl: GL10)
        //nullable = true from not(false or (false and false)) = true
{

                    var gl = gl
}

                                }
                            

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ShaderComposite{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            public constructor        (requiresOpenGLVersion: String, shaderArray: Array<Shader?>, compositeShaderUpdater: CompositeShaderUpdater, shaderInitializer: ShaderInitializer, modelViewProjection: ModelViewProjection, colorOpenGLProcessor: OpenGLProcessor, vertexOpenGLProcessor: OpenGLProcessor, disableProgramShaderOpenGLProcessor: OpenGLProcessor)                        

                            : super(requiresOpenGLVersion, shaderArray, compositeShaderUpdater, shaderInitializer, modelViewProjection, colorOpenGLProcessor, vertexOpenGLProcessor, disableProgramShaderOpenGLProcessor){

                    var requiresOpenGLVersion = requiresOpenGLVersion


                    var shaderArray = shaderArray


                    var compositeShaderUpdater = compositeShaderUpdater


                    var shaderInitializer = shaderInitializer


                    var modelViewProjection = modelViewProjection


                    var colorOpenGLProcessor = colorOpenGLProcessor


                    var vertexOpenGLProcessor = vertexOpenGLProcessor


                    var disableProgramShaderOpenGLProcessor = disableProgramShaderOpenGLProcessor


                            //For kotlin this is before the body of the constructor.
                    
this.useProgramShaderOpenGLProcessor= NullOpenGLProcessorFactory.getInstance()
}


}
                
            

