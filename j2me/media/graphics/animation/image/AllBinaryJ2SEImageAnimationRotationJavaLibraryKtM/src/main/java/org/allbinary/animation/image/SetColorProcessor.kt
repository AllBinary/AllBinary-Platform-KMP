
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
import org.allbinary.graphics.color.BasicColor
import org.allbinary.media.image.ImageModifierUtil

open public class SetColorProcessor : ModifierBaseProcessor {
        

        companion object {
            
    private val instance: SetColorProcessor = SetColorProcessor()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: SetColorProcessor{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        override fun update(imageModifierUtil: ImageModifierUtil, originalImage: Image, imageToShow: Image, index: Int, basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{

                    var imageModifierUtil = imageModifierUtil


                    var originalImage = originalImage


                    var imageToShow = imageToShow


                    var index = index


                    var basicColor = basicColor
imageModifierUtil!!.setColor(originalImage, imageToShow, index, basicColor)
}


}
                
            

