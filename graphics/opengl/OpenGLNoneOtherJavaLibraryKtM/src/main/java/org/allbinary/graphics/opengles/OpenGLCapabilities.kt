
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringUtil

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
            
    val VERSION_1_0: String = "1.0"

    val VERSION_1_1: String = "1.1"

    val VERSION_2_0: String = "2.0"

    val VERSION_3_0: String = "3.0"

    val VERSION_3_1: String = "3.1"

    val VERSION_3_2: String = "3.2"

    val VERSION_HIGHER_THAN_EXISTS: String = "999.999"

    private var glVersion: String = StringUtil.getInstance()!!.EMPTY_STRING

    var shaderVersion: Int = 0

    var glInstanceVersion: String = StringUtil.getInstance()!!.EMPTY_STRING

    var maxTextureSize: Int = 64
private constructor        ()
            : super()
        {
}


open fun initCapabilities(gl: Any)
        //nullable = true from not(false or (false and false)) = true
{
var gl = gl
}


open fun isGlExtensionDrawTexture()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun getGlVersion()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return glVersion
}


open fun isVertexBufferObjectSupport()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun isTextureSizeValid(widthAndHeight: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var widthAndHeight = widthAndHeight



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


}
                
            

