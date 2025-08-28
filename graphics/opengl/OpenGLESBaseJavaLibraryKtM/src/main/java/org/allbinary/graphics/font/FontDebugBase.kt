
        /*
                *  
                *  Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license  Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template  
        */
        
        /* Generated Code Do Not Modify */
        package org.allbinary.graphics.font




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Font
import org.allbinary.logic.string.StringMaker

open public class FontDebugBase
            : Object
         {
        

        companion object {
            
    private val instance: FontDebugBase = FontDebugBase()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: FontDebugBase

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val SET_FONT: String = "setFont"

open fun debugMetrics(currentFont: Font, convertedTextSize: Float, displayMetrics: Any, stringBuffer: StringMaker)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var currentFont = currentFont
    //var convertedTextSize = convertedTextSize
    //var displayMetrics = displayMetrics
    //var stringBuffer = stringBuffer
}


open fun debugDpi(densityDpi: Int, stringBuffer: StringMaker)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var densityDpi = densityDpi
    //var stringBuffer = stringBuffer
}


open fun debugDimension(currentFont: Font, convertedTextSize: Float, longestDimensionTotalPixels: Int, stringBuffer: StringMaker)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var currentFont = currentFont
    //var convertedTextSize = convertedTextSize
    //var longestDimensionTotalPixels = longestDimensionTotalPixels
    //var stringBuffer = stringBuffer
}


}
                
            

