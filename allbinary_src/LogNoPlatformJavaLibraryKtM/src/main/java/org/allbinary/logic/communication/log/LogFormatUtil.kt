
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
import org.allbinary.logic.java.exception.ExceptionUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonSeps
import org.allbinary.time.TimeStampUtil

expect open public class LogFormatUtil
            : Object
         {
        
companion object {
            
    //private val instance: LogFormatUtil
    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: LogFormatUtil

        }
            

    open fun get(className: String, functionName: String, specialMessage: String, exception: Any)
        //nullable = true from not(false or (false and false)) = true
: String

    open fun get(className: String, functionName: String, specialMessage: String)
        //nullable = true from not(false or (false and false)) = true
: String

    open fun get(className: String, functionName: String)
        //nullable = true from not(false or (false and false)) = true
: StringMaker

    open fun get(exception: Any)
        //nullable = true from not(false or (false and false)) = true
: String

}
                
            

