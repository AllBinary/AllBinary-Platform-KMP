
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
        package org.allbinary.logic.communication.log



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class LogUtil
            : Object
         {
        

        companion object {


    private val instance: LogUtil = LogUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: LogUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            private constructor        ()
            : super()
        {}


open fun put(log: Log)
        //nullable = true from not(false or (false and false)) = true
{

                    var log = log
}


open fun put(specialMessage: String, anyType: Any, functionName: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var specialMessage = specialMessage


                    var anyType = anyType


                    var functionName = functionName
}


open fun put(specialMessage: String, anyType: Any, functionName: String, exception: Any)
        //nullable = true from not(false or (false and false)) = true
{

                    var specialMessage = specialMessage


                    var anyType = anyType


                    var functionName = functionName


                    var exception = exception
}


}
                
            

