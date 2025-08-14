
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
        package org.allbinary.image.opengles




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.khronos.opengles.GL10

open public class OpenGLESImageProcessor
            : Object
         {
        

        companion object {
            
    private val instance: OpenGLESImageProcessor = OpenGLESImageProcessor()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: OpenGLESImageProcessor{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun translate(gl: GL10, translateX: Float, translateY: Float)
        //nullable = true from not(false or (false and false)) = true
{

                    var gl = gl


                    var translateX = translateX


                    var translateY = translateY
}


open fun rotate(gl: GL10, angle: Float)
        //nullable = true from not(false or (false and false)) = true
{

                    var gl = gl


                    var angle = angle
}


open fun scale(gl: GL10, scaleX: Float, scaleY: Float)
        //nullable = true from not(false or (false and false)) = true
{

                    var gl = gl


                    var scaleX = scaleX


                    var scaleY = scaleY
}


open fun colorMask(gl: GL10, red: Float, green: Float, blue: Float, alpha: Float)
        //nullable = true from not(false or (false and false)) = true
{

                    var gl = gl


                    var red = red


                    var green = green


                    var blue = blue


                    var alpha = alpha
}


}
                
            

