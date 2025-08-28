
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
        package org.allbinary.image.opengles




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Image
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.string.CommonStrings
import org.allbinary.platform.graphics.PlatformBitmapBaseFactory
import org.allbinary.platform.opengles.PlatformTextureBaseFactory

open public class OpenGLESGL10ImageFactory : OpenGLImageFactory {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        override fun getInstance(image: Image, bitmapFactory: PlatformBitmapBaseFactory, textureFactory: PlatformTextureBaseFactory)
        //nullable =  from not(true or (false and false)) = 
: Image{
    //var image = image
    //var bitmapFactory = bitmapFactory
    //var textureFactory = textureFactory



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return OpenGLESGL10Image(image, bitmapFactory, textureFactory)
}


}
                
            

