
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
        package org.allbinary.platform.graphics




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Image
import javax.microedition.lcdui.NullCanvas
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory

open public class PlatformBitmapBase
            : Object
         {
        
companion object {
            
    val NULL_PLATFORM_BITMAP_BASE: PlatformBitmapBase = PlatformBitmapBase()

        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    var alpha: Int = 255

    var basicColor: BasicColor = BasicColorFactory.getInstance()!!.NULL_COLOR

    open fun getImage()
        //nullable = true from not(false or (false and true)) = true
: Image{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullCanvas.NULL_IMAGE
}


}
                
            

