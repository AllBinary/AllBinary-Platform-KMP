
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class OpenGLFeatureFactory
            : Object
         {
        

        companion object {
            
    private val instance: OpenGLFeatureFactory = OpenGLFeatureFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: OpenGLFeatureFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        {}


    val OPENGL_OPTIONS: OpenGLFeature = OpenGLFeature(
                            "OpenGL Options")

    val OPENGL: OpenGLFeature = OpenGLFeature(
                            "OpenGL")

    val OPENGL_SURFACE_VIEW: OpenGLFeature = OpenGLFeature(
                            "GLSurfaceView")

    val OPENGL_2D: OpenGLFeature = OpenGLFeature(
                            "OpenGL 2D")

    val OPENGL_3D: OpenGLFeature = OpenGLFeature(
                            "OpenGL 3D")

    val OPENGL_2D_AND_3D: OpenGLFeature = OpenGLFeature(
                            "OpenGL 2D/3D")

    val OPENGL_AUTO_SELECT: OpenGLFeature = OpenGLFeature(
                            "Auto Select")

    val OPENGL_MINIMUM: OpenGLFeature = OpenGLFeature(
                            "Minimum")

    val OPENGL_AS_GAME_THREAD: OpenGLFeature = OpenGLFeature(
                            "As game thread")

    val OPENGL_AND_GAME_HAVE_DIFFERENT_THREADS: OpenGLFeature = OpenGLFeature(
                            "As different threads")

    val IMAGE_COLOR_DEPTH_4444: OpenGLFeature = OpenGLFeature(
                            "4444")

    val IMAGE_COLOR_DEPTH_8888: OpenGLFeature = OpenGLFeature(
                            "8888")

    val IMAGE_COLOR_DEPTH_565: OpenGLFeature = OpenGLFeature(
                            "565")

    val OPENGL_COLOR_DEPTH_4444: OpenGLFeature = OpenGLFeature(
                            "4444")

    val OPENGL_COLOR_DEPTH_8888: OpenGLFeature = OpenGLFeature(
                            "8888")

    val OPENGL_COLOR_DEPTH_565: OpenGLFeature = OpenGLFeature(
                            "565")

    val OPENGL_DRAW_TEXTURE: OpenGLFeature = OpenGLFeature(
                            "GL_OES_draw_texture")

    val OPENGL_VERTEX_BUFFER_OBJECT: OpenGLFeature = OpenGLFeature(
                            "vertex_buffer_object")

    val OPENGL_SIMPLE_OBJECT3D_PROCESSOR: OpenGLFeature = OpenGLFeature(
                            "Simple Object3d Processor")

    val OPENGL_COMPLEX_OBJECT3D_PROCESSOR: OpenGLFeature = OpenGLFeature(
                            "Complex Object3d Processor")

    val OPENGL_SIMPLE_TEXTURE_PROCESSOR: OpenGLFeature = OpenGLFeature(
                            "Simple Texture Processor")

    val OPENGL_COMPLEX_TEXTURE_PROCESSOR: OpenGLFeature = OpenGLFeature(
                            "Complex Texture Processor")

}
                
            

