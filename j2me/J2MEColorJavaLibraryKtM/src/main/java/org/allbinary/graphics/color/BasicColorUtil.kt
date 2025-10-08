
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
        

open public class BasicColorUtil
            : Object
         {
        
companion object {
            
    private val instance: BasicColorUtil = BasicColorUtil()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BasicColorUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val ZERO_ARRAY: Array<BasicColor?> = arrayOfNulls(0)

    val ALPHA: Int = 0xFF000000.toInt()

    val isAlpha: Boolean = true

    val ffOpaque: Boolean = true

    open fun get(red: Int, green: Int, blue: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
var red = red
var green = green
var blue = blue

    var value: Int= 0


    
                        if(isAlpha)
                        
                                    {
                                    
    
                        if(ffOpaque)
                        
                                    {
                                    value= ALPHA

                                    }
                                

                                    }
                                
value= (red shl 16) or value
value= (green shl 8) or value
value= blue or value



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return value
}


    open fun get(alphaValue: Int, r: Int, g: Int, b: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var alphaValue = alphaValue
    //var r = r
    //var g = g
    //var b = b



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ((alphaValue shl 24) and ALPHA) +((r shl 16) and 0x00FF0000) +((g shl 8) and 0x0000FF00) +(b and 0x000000FF)
}


    open fun get(alphaValue: Int, color: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var alphaValue = alphaValue
    //var color = color



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ((alphaValue shl 24) and ALPHA) +color
}


    open fun invert(color: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var color = color



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return (0xFFFFFF -color) or ALPHA
}


}
                
            

