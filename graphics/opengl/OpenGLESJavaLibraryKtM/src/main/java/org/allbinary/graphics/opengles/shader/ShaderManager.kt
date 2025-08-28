
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
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class ShaderManager
            : Object
         {
        

        companion object {
            
    private val instance: ShaderManager = ShaderManager( -1,  -1)

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ShaderManager

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    val LOAD_SHADER: String = "loadShader"

    val __VERSION__: String = "__VERSION__"

    val GL_VERTEX_SHADER: Int

    val GL_FRAGMENT_SHADER: Int
public constructor        (GL_VERTEX_SHADER: Int, GL_FRAGMENT_SHADER: Int)
            : super()
        

        Updates for KMP build        
        {
    //var GL_VERTEX_SHADER = GL_VERTEX_SHADER
    //var GL_FRAGMENT_SHADER = GL_FRAGMENT_SHADER
this.GL_VERTEX_SHADER= GL_VERTEX_SHADER
this.GL_FRAGMENT_SHADER= GL_FRAGMENT_SHADER
}


open fun load(gl: GL10, resource: String, shaderAsStringArray: Array<String?>, shaderType: Int)
        //nullable = true from not(false or (false and false)) = true
: Int

        Updates for KMP build        
        {
    //var gl = gl
    //var resource = resource
    //var shaderAsStringArray = shaderAsStringArray
    //var shaderType = shaderType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}


open fun loadShader(gl: GL10, resource: String, stringList: BasicArrayList, shaderType: Int)
        //nullable = true from not(false or (false and false)) = true
: Int

        Updates for KMP build        
        {
    //var gl = gl
    //var resource = resource
    //var stringList = stringList
    //var shaderType = shaderType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}


}
                
            

