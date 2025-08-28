
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
        package org.allbinary.image.opengles




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.khronos.opengles.GL10

open public class OpenGLESDeviceImageTranslate : OpenGLESImageTranslate {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    var translateX: Float = 0

    var translateY: Float = 0

    var translateX2: Float = 0

    var translateY2: Float = 0
override fun translate(gl: GL10, openGLESImage: OpenGLESImage, x: Float, y: Float)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var gl = gl
    //var openGLESImage = openGLESImage
    //var x = x
    //var y = y
openGLESImage!!.imageProcessor!!.translate(gl, translateX +(openGLESImage!!.openGLESImageProperties!!.scaleX *x), translateY +(openGLESImage!!.openGLESImageProperties!!.scaleY *y))
}

override fun translate2(gl: GL10, openGLESImage: OpenGLESImage)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var gl = gl
    //var openGLESImage = openGLESImage
openGLESImage!!.imageProcessor!!.translate(gl, translateX2, translateY2)
}


}
                
            

