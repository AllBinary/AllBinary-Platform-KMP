
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
        
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.communication.log.Log

open public class LogFactory
            : Object
         {
        

        companion object {


open fun getInstance(specialMessage: String, anyType: Any, exception: Any)
        //nullable =  from not(true or (false and false)) = 
: Log{

                    var specialMessage = specialMessage


                    var anyType = anyType


                    var exception = exception



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Log(specialMessage, anyType, StringUtil.getInstance()!!.EMPTY_STRING, exception)
}


open fun getInstance(specialMessage: String, anyType: Any, functionName: String, exception: Any)
        //nullable =  from not(true or (false and false)) = 
: Log{

                    var specialMessage = specialMessage


                    var anyType = anyType


                    var functionName = functionName


                    var exception = exception



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Log(specialMessage, anyType, functionName, exception)
}


open fun getInstance(specialMessage: String, anyType: Any, functionName: String)
        //nullable =  from not(true or (false and false)) = 
: Log{

                    var specialMessage = specialMessage


                    var anyType = anyType


                    var functionName = functionName



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Log(specialMessage, anyType, functionName)
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

