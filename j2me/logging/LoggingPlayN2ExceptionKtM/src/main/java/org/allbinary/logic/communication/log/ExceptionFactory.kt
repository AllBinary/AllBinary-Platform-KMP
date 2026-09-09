
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2026 AllBinary 
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
        package org.allbinary.logic.communication.log




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import jsinterop.annotations.JsType

open public class ExceptionFactory
            : Object
         {
        
companion object {
            
    open fun createThrowable(message: String)
        //nullable = true from not(false or (false and false)) = true
: Throwable{
var message = message



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Throwable(message)
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

