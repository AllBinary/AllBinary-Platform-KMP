
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
        package org.allbinary.graphics.color




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringUtil

open public class BasicColorFactory
            : Object
         {
        
companion object {
            
    private val instance: BasicColorFactory = BasicColorFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BasicColorFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val NULL_COLOR: BasicColor = BasicColor(255, 255, 255, 255, "null color")

    val TAN: BasicColor = BasicColor(0xE9D8B5)

    val SKIN_PINK: BasicColor = BasicColor(0xFDCECE)

    val RED: BasicColor = BasicColor(0xFF0000, "red")

    val LIGHT_RED: BasicColor = BasicColor(0xFFA0A0, "light red")

    val DARK_GREEN: BasicColor = BasicColor(0x00FF00)

    val GREEN: BasicColor = BasicColor(0x00DD00, "green")

    val LIGHT_GREEN: BasicColor = BasicColor(0x007700)

    val PURPLE: BasicColor = BasicColor(0x400040, "purple")

    val BLUE: BasicColor = BasicColor(0x0000FF, "blue")

    val LIGHT_BLUE: BasicColor = BasicColor(0x00aaff)

    val VERY_LIGHT_BLUE: BasicColor = BasicColor(0x000033)

    val PUCE: BasicColor = BasicColor(0xFF00AA)

    val AQUA: BasicColor = BasicColor(0x00FFFF)

    val YELLOW: BasicColor = BasicColor(0xFFFF00, "yellow")

    val PINK: BasicColor = BasicColor(0xFF00FF)

    val BLACK: BasicColor = BasicColor(0x000000, "black")

    val GREY: BasicColor = BasicColor(0xAAAAAA, "grey")

    val LIGHT_GREY: BasicColor = BasicColor(0xC0C0C0)

    val DARK_GREY: BasicColor = BasicColor(0x404040)

    val ORANGE: BasicColor = BasicColor(0xe07718)

    val BROWN: BasicColor = BasicColor(0x956B00)

    val WHITE: BasicColor = BasicColor(0xFFFFFF)

    val TRANSPARENT_COLOR: BasicColor = BasicColor(0x00000000, 0x000000, StringUtil.getInstance()!!.EMPTY_STRING)

    val TRANSPARENT_GREY: BasicColor = BasicColor(0x52000000, 0xECECEC, StringUtil.getInstance()!!.EMPTY_STRING)

    val TRANSPARENT_BLACK: BasicColor = BasicColor(0x52000000, 0x000000, StringUtil.getInstance()!!.EMPTY_STRING)

    val TRANSPARENT_RED: BasicColor = BasicColor(0x52000000, 0xFF0000, StringUtil.getInstance()!!.EMPTY_STRING)

    val CLEAR_COLOR: BasicColor = BLACK

    val BORDER_COLOR: BasicColor = WHITE

}
                
            

