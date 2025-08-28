
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




        import java.lang.Object        
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.NullUtil
import org.allbinary.string.CommonStrings

open public class PreLogUtil
            : Object
         {
        

        companion object {
            
open fun put(specialMessage: String, anyType: Any, functionName: String)
        //nullable = true from not(false or (false and false)) = true
{
    //var specialMessage = specialMessage
    //var anyType = anyType
    //var functionName = functionName
put(specialMessage, anyType, functionName, NullUtil.getInstance()!!.NULL_OBJECT)
}


    private val LOG_SUCCESS: String = "org.allbinary: "

open fun put(specialMessage: String, anyType: Any, functionName: String, exception: Any)
        //nullable = true from not(false or (false and false)) = true
{
    //var specialMessage = specialMessage
    //var anyType = anyType
    //var functionName = functionName
    //var exception = exception

    var className: String = CommonStrings.getInstance()!!.EMPTY


    
                        if(anyType!!::class.toString()!! != 
                                    null
                                )
                        
                                    {
                                    className= anyType!!::class.toString()!!.toCharArray().concatToString()
                                

                                    }
                                

    var message: String = LogFormatUtil.getInstance()!!.get(className, functionName, specialMessage, exception)!!

System.out.print(LOG_SUCCESS)
System.out.println(message)
}


open fun put(specialMessage: String, className: String, functionName: String, exception: Any)
        //nullable = true from not(false or (false and false)) = true
{
var specialMessage = specialMessage
var className = className
var functionName = functionName
var exception = exception

    var message: String = LogFormatUtil.getInstance()!!.get(className, functionName, specialMessage, exception)!!

System.out.print(LOG_SUCCESS)
System.out.println(message)
}


        }
            public constructor        ()
            : super()
        {
}


}
                
            

