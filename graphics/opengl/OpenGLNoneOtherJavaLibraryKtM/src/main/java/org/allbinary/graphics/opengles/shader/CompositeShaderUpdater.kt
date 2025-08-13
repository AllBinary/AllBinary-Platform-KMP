
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
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonSeps

open public class CompositeShaderUpdater : ShaderUpdater {
        

        companion object {
            
    private val instance: CompositeShaderUpdater = CompositeShaderUpdater(StringUtil.getInstance()!!.getArrayInstance(), StringUtil.getInstance()!!.getArrayInstance(), StringUtil.getInstance()!!.getArrayInstance())

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CompositeShaderUpdater{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val commonSeps: CommonSeps = CommonSeps.getInstance()!!
            
public constructor        (uniformBlockArray: Array<String?>, uniformArray: Array<String?>, attributeArray: Array<String?>)                        

                            : this(uniformBlockArray, uniformArray, attributeArray, IntArray(attributeArray!!.size)){

                    var uniformBlockArray = uniformBlockArray


                    var uniformArray = uniformArray


                    var attributeArray = attributeArray


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (uniformBlockArray: Array<String?>, uniformArray: Array<String?>, attributeArray: Array<String?>, attributeHandleArray: IntArray){

                    var uniformBlockArray = uniformBlockArray


                    var uniformArray = uniformArray


                    var attributeArray = attributeArray


                    var attributeHandleArray = attributeHandleArray
}


open fun onSurfaceCreated(gl: GL10, eglConfig: EGLConfig, programHandle: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var gl = gl


                    var eglConfig = eglConfig


                    var programHandle = programHandle
}


open fun onSurfaceDestroyed(gl: GL10)
        //nullable = true from not(false or (false and false)) = true
{

                    var gl = gl
}


}
                
            

