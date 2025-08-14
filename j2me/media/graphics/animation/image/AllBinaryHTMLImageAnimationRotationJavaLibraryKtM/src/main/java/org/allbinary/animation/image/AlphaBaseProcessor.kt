
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
        package org.allbinary.animation.image




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Image
import org.allbinary.media.image.ImageModifierUtil

open public class AlphaBaseProcessor
            : Object
         {
        

        companion object {
            
    private val instance: AlphaBaseProcessor = AlphaBaseProcessor()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AlphaBaseProcessor{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun setAlpha(imageModifierUtil: ImageModifierUtil, originalImage: Image, imageToShow: Image, alpha: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var imageModifierUtil = imageModifierUtil


                    var originalImage = originalImage


                    var imageToShow = imageToShow


                    var alpha = alpha
}


}
                
            

