
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
        package org.allbinary.emulator.swt



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        import java.lang.Runnable
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.eclipse.swt.widgets.Display
import org.allbinary.thread.NullRunnable

open public class SWTProcessor
            : Object
         {
        

        companion object {
            
    private val instance: SWTProcessor = SWTProcessor()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: SWTProcessor{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    var runnable: Runnable = NullRunnable.getInstance()!!
            

open fun process(display: Display)
        //nullable = true from not(false or (false and false)) = true
{

                    var display = display
display.sleep()
}


}
                
            

