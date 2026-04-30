
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
                        return BasicColorFactory.instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    open fun createInstance(value: Int)
        //nullable = true from not(false or (false and false)) = true
: BasicColor{
    //var value = value



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BasicColor(BasicColorUtil.getInstance()!!.ALPHA, value, StringUtil.getInstance()!!.EMPTY_STRING)
}


    open fun createInstanceA(alphaValue: Int, value: Int)
        //nullable = true from not(false or (false and false)) = true
: BasicColor{
    //var alphaValue = alphaValue
    //var value = value



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BasicColor(alphaValue, value, StringUtil.getInstance()!!.EMPTY_STRING)
}


    open fun createInstanceAN(alphaValue: Int, value: Int, name: String)
        //nullable = true from not(false or (false and false)) = true
: BasicColor{
    //var alphaValue = alphaValue
    //var value = value
    //var name = name



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BasicColor(alphaValue, value, name)
}


    open fun createInstanceARGB(alphaValue: Int, r: Int, g: Int, b: Int, name: String)
        //nullable = true from not(false or (false and false)) = true
: BasicColor{
    //var alphaValue = alphaValue
    //var r = r
    //var g = g
    //var b = b
    //var name = name

    var ALPHA_MASK: Int = 0xFF000000.toInt()




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BasicColor(alphaValue, ((alphaValue shl 24) and ALPHA_MASK) +((r shl 16) and 0x00FF0000) +((g shl 8) and 0x0000FF00) +(b and 0x000000FF), StringUtil.getInstance()!!.EMPTY_STRING)
}


    val NULL_COLOR: BasicColor = this.createInstanceARGB(255, 255, 255, 255, "null color")!!

    val TAN: BasicColor = this.createInstance(0xE9D8B5)!!

    val SKIN_PINK: BasicColor = this.createInstance(0xFDCECE)!!

    val RED: BasicColor = this.createInstanceAN(BasicColorUtil.getInstance()!!.ALPHA, 0xFF0000, "red")!!

    val LIGHT_RED: BasicColor = this.createInstanceAN(BasicColorUtil.getInstance()!!.ALPHA, 0xFFA0A0, "light red")!!

    val DARK_GREEN: BasicColor = this.createInstance(0x00FF00)!!

    val GREEN: BasicColor = this.createInstanceAN(BasicColorUtil.getInstance()!!.ALPHA, 0x00DD00, "green")!!

    val LIGHT_GREEN: BasicColor = this.createInstance(0x007700)!!

    val PURPLE: BasicColor = this.createInstanceAN(BasicColorUtil.getInstance()!!.ALPHA, 0x400040, "purple")!!

    val BLUE: BasicColor = this.createInstanceAN(BasicColorUtil.getInstance()!!.ALPHA, 0x0000FF, "blue")!!

    val LIGHT_BLUE: BasicColor = this.createInstance(0x00aaff)!!

    val VERY_LIGHT_BLUE: BasicColor = this.createInstance(0x000033)!!

    val PUCE: BasicColor = this.createInstance(0xFF00AA)!!

    val AQUA: BasicColor = this.createInstance(0x00FFFF)!!

    val YELLOW: BasicColor = this.createInstanceAN(BasicColorUtil.getInstance()!!.ALPHA, 0xFFFF00, "yellow")!!

    val PINK: BasicColor = this.createInstance(0xFF00FF)!!

    val BLACK: BasicColor = this.createInstanceAN(BasicColorUtil.getInstance()!!.ALPHA, 0x000000, "black")!!

    val GREY: BasicColor = this.createInstanceAN(BasicColorUtil.getInstance()!!.ALPHA, 0xAAAAAA, "grey")!!

    val LIGHT_GREY: BasicColor = this.createInstance(0xC0C0C0)!!

    val DARK_GREY: BasicColor = this.createInstance(0x404040)!!

    val ORANGE: BasicColor = this.createInstance(0xe07718)!!

    val BROWN: BasicColor = this.createInstance(0x956B00)!!

    val WHITE: BasicColor = this.createInstance(0xFFFFFF)!!

    val TRANSPARENT_COLOR: BasicColor = this.createInstanceAN(0x00000000, 0x000000, StringUtil.getInstance()!!.EMPTY_STRING)!!

    val TRANSPARENT_GREY: BasicColor = this.createInstanceAN(0x52000000, 0xECECEC, StringUtil.getInstance()!!.EMPTY_STRING)!!

    val TRANSPARENT_BLACK: BasicColor = this.createInstanceAN(0x52000000, 0x000000, StringUtil.getInstance()!!.EMPTY_STRING)!!

    val TRANSPARENT_RED: BasicColor = this.createInstanceAN(0x52000000, 0xFF0000, StringUtil.getInstance()!!.EMPTY_STRING)!!

    val CLEAR_COLOR: BasicColor = this.BLACK

    val BORDER_COLOR: BasicColor = this.WHITE

}
                
            

