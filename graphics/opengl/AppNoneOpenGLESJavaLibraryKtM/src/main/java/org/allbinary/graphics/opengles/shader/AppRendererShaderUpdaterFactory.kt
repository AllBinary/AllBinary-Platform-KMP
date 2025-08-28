
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
        

open public class AppRendererShaderUpdaterFactory : ShaderUpdater {
        

        companion object {
            
    private val instance: AppRendererShaderUpdaterFactory = AppRendererShaderUpdaterFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AppRendererShaderUpdaterFactory

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val NULL_SHADER_COMPOSITE_ARRAY: Array<ShaderComposite?> = arrayOfNulls(0)

    val shaderCompositeArray: Array<ShaderComposite?> = NULL_SHADER_COMPOSITE_ARRAY

    private val shaderOpenGLProcessorArray: Array<ShaderOpenGLProcessor?> = arrayOfNulls(0)

open fun getTestShaders()
        //nullable = true from not(false or (false and true)) = true
: Array<ShaderOpenGLProcessor?>

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return shaderOpenGLProcessorArray
}


}
                
            

