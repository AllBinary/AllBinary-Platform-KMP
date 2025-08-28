
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
        package org.allbinary.image




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.khronos.opengles.GL
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.Image

open public class PreResourceImageUtil
            : Object
         {
        

        companion object {
            
    private val instance: PreResourceImageUtil = PreResourceImageUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PreResourceImageUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun encapsulate(image: Image)
        //nullable = true from not(false or (false and false)) = true
: Image{
var image = image



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}


open fun update(gl: GL, image: Image)
        //nullable = true from not(false or (false and false)) = true
{
var gl = gl
var image = image
}


open fun update(graphics: Graphics, image: Image)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
var image = image
}


}
                
            

