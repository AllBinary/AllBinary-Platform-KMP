
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.NullUtil

open public class PreLogUtil
            : Object
         {
        

        companion object {
            
open fun put(specialMessage: String, anyType: Any, functionName: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var specialMessage = specialMessage


                    var anyType = anyType


                    var functionName = functionName
put(specialMessage, anyType, functionName, NullUtil.getInstance()!!.NULL_OBJECT)
}


    private val LABEL: String = "org.allbinary"

open fun put(specialMessage: String, anyType: Any, functionName: String, exception: Any)
        //nullable = true from not(false or (false and false)) = true
{

                    var specialMessage = specialMessage


                    var anyType = anyType


                    var functionName = functionName


                    var exception = exception

    var className: String = LABEL


    var actualClassName: String = anyType!!::class.toString()!!!!


    
                        if(actualClassName != 
                                    null
                                )
                        
                                    {
                                    className= actualClassName

                                    }
                                

    var message: String = LogFormatUtil.getInstance()!!.get(className, functionName, specialMessage, exception)!!

android.util.Log.i(LABEL, message)
}


open fun put(specialMessage: String, className: String, functionName: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var specialMessage = specialMessage


                    var className = className


                    var functionName = functionName
put(specialMessage, className, functionName, NullUtil.getInstance()!!.NULL_OBJECT)
}


open fun put(specialMessage: String, className: String, functionName: String, exception: Any)
        //nullable = true from not(false or (false and false)) = true
{

                    var specialMessage = specialMessage


                    var className = className


                    var functionName = functionName


                    var exception = exception

    var message: String = LogFormatUtil.getInstance()!!.get(className, functionName, specialMessage, exception)!!

android.util.Log.i(className, message)
}


        }
            public constructor        ()
            : super()
        {}


}
                
            

