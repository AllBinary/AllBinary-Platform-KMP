
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Image

open public class OpenGLESImageExclusionUtil
            : Object
         {
        

        companion object {
            
    private val instance: OpenGLESImageExclusionUtil = OpenGLESImageExclusionUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: OpenGLESImageExclusionUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val EXCLUSION: String = "font"

    private val GREEN_BUTTON: String = "green_button"

open fun isCustomScaling(image: Image)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var image = image

    
                        if(image.getName()!!.startsWith(EXCLUSION) || image.getName()!!.startsWith(GREEN_BUTTON))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                        }
                            
}


}
                
            

