
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
        package org.allbinary.graphics.color



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt

open public class ColorUtil
            : Object
         {
        

        companion object {


    private val instance: ColorUtil = ColorUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ColorUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun isGreyishOrWhiteLike(color: Color)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var color = color

    
                        if(Math.abs(color!!.getRed() -color!!.getGreen()) > 20 || Math.abs(color!!.getRed() -color!!.getBlue()) > 20 || Math.abs(color!!.getGreen() -color!!.getBlue()) > 20)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


open fun isDark(color: Color)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var color = color

    
                        if(color!!.getRed() < 0x77 && color!!.getRed() < 0x77 && color!!.getRed() < 0x77)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

