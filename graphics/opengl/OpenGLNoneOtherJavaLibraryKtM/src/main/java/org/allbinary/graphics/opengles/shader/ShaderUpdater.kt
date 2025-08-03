
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
        
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10
import org.allbinary.graphics.opengles.renderer.RendererStrings
import org.allbinary.string.CommonStrings

open public class ShaderUpdater
            : Object
         {
        

        companion object {


    private val instance: ShaderUpdater = ShaderUpdater()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ShaderUpdater{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    val rendererStrings: RendererStrings = RendererStrings.getInstance()!!
            

open fun onSurfaceCreated(gl: GL10, eglConfig: EGLConfig)
        //nullable = true from not(false or (false and false)) = true
{

                    var gl = gl


                    var eglConfig = eglConfig
}


}
                
            

