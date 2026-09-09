
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        package min3d.core




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10

interface Renderer {
        

    open fun onSurfaceCreated(gl: GL10, config: EGLConfig)
        //nullable = true from not(false or (false and false)) = true


    open fun onSurfaceChanged(gl: GL10, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true


    open fun onDrawFrame(gl: GL10)
        //nullable = true from not(false or (false and false)) = true


}
                
            

