
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
        package org.allbinary.graphics.opengles



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.opengles.shader.ShaderComposite

open public class OpenGLVersionValidator
            : Object
         {
        

        companion object {
            
    private val instance: OpenGLVersionValidator = OpenGLVersionValidator()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: OpenGLVersionValidator{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun isAvailable(glVersionRequired: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var glVersionRequired = glVersionRequired



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun setShaderComposite(shaderComposite: ShaderComposite, anyType: Any)
        //nullable = true from not(false or (false and false)) = true
{

                    var shaderComposite = shaderComposite


                    var anyType = anyType
}


    var EGL_CONTEXT_CLIENT_VERSION_VALUE: Int =  -1

}
                
            

