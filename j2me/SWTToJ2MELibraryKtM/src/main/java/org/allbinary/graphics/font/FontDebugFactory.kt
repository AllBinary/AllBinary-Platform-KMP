
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
        package org.allbinary.graphics.font




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Font
import javax.microedition.lcdui.Graphics

open public class FontDebugFactory
            : Object
         {
        

        companion object {
            
    private val instance: FontDebugFactory = FontDebugFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: FontDebugFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun setFont(font: Font, graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var font = font


                    var graphics = graphics
graphics.setFont(font)
}


}
                
            

