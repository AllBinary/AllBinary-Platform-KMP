
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
        package org.allbinary.graphics.displayable




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListUtil

open public class CanvasStrings
            : Object
         {
        
companion object {
            
    private val instance: CanvasStrings = CanvasStrings()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CanvasStrings{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val CONSTRUCTOR: String = "MyCanvas::MyCanvas"

    val PAUSE: String = "MyCanvas::pause"

    val UN_PAUSE: String = "MyCanvas::unPause"

    val SET_FULL_SCREEN_MODE: String = "setFullScreenMode"

    val SIZE_CHANGED: String = "sizeChanged"

    val SCALED_IMAGES: String = "scaledImages"

    val PAINT: String = "paint"

    val ON_DISPLAY_CHANGE_EVENT: String = "onDisplayChangeEvent"

    val EMPTY_CHILD_NAME_LIST: BasicArrayList = BasicArrayListUtil.getInstance()!!.getImmutableInstance()!!

    val ABOUT: String = "About"

    val OPTIONS: String = "Options"

    val FONT_ATLAS: String = "/font.png"

    val OBJ_MODEL: String = "_obj"

    val MD2_MODEL: String = "_md2"

    val _PNG: String = ".png"

}
                
            

