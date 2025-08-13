
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
        package org.allbinary.logic.java.exception



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.NullUtil

open public class ExceptionUtil
            : Object
         {
        

        companion object {
            
    private val instance: ExceptionUtil = ExceptionUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ExceptionUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


    val PRETEND_EXCEPTION: Exception = Exception(
                            "Not Really An Exception")

        }
            private constructor        ()
            : super()
        {}


    private val NONE: String = "No Stack Trace"

open fun getStackTrace(e: Throwable)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var e = e
e.printStackTrace()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NONE
}


}
                
            

