
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
        
import org.allbinary.string.CommonStrings

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
            
    private val LOG_SUCCESS: String = "org.allbinary: "
private constructor        ()
            : super()
        {}


open fun put(log: Log)
        //nullable = true from not(false or (false and false)) = true
{

                    var log = log

    
                        if(log == LogFactory.LOG)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    var exception: Any = log.getThrowable()!!
            


    
                        if(exception == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    var specialMessage: String = log.getSpecialMessage()!!
            


    var anyType: Any = log.getObject()!!
            


    var functionName: String = log.getFunctionName()!!
            

put(specialMessage, anyType, functionName, exception)
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

    var className: String = CommonStrings.getInstance()!!.EMPTY


    
                        if(anyType!!::class.qualifiedName!! != 
                                    null
                                )
                        
                                    {
                                    className= anyType!!::class.qualifiedName!!.toCharArray().concatToString()
                                

                                    }
                                

    var message: String = LogFormatUtil.getInstance()!!.get(className, functionName, specialMessage, exception)!!
            

System.out.print(LOG_SUCCESS)
System.out.println(message)
}


}
                
            

