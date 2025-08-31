
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
        
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import playn.core.PlayN

/*actual*/ open public class PreLogUtil
            : Object
         {
        
/*actual*/ companion object {
            
    /*actual*/ open fun put(specialMessage: String, anyType: Any, functionName: String)
        //nullable = true from not(false or (false and false)) = true
{
    //var specialMessage = specialMessage
    //var anyType = anyType
    //var functionName = functionName

    var className: String = PreLogUtil.getClassName(anyType)!!


    
                        if(className == 
                                    null
                                )
                        
                                    {
                                    className= CommonStrings.getInstance()!!.EMPTY

                                    }
                                
className= StringMaker().
                            append(className)!!.append(CommonSeps.getInstance()!!.FORWARD_SLASH)!!.append(StringUtil.getInstance()!!.toString(anyType))!!.toString()

    var message: String = LogFormatUtil.getInstance()!!.get(className, functionName, specialMessage)!!

PlayN.log()!!.debug(LOG_SUCCESS +message)
}


    private val LOG_SUCCESS: String = "org.allbinary: "

    /*actual*/ open fun put(specialMessage: String, anyType: Any, functionName: String, exception: Any)
        //nullable = true from not(false or (false and false)) = true
{
    //var specialMessage = specialMessage
    //var anyType = anyType
    //var functionName = functionName
    //var exception = exception

    var className: String = PreLogUtil.getClassName(anyType)!!


    
                        if(className == 
                                    null
                                )
                        
                                    {
                                    className= CommonStrings.getInstance()!!.EMPTY

                                    }
                                
className= StringMaker().
                            append(className)!!.append(CommonSeps.getInstance()!!.FORWARD_SLASH)!!.append(StringUtil.getInstance()!!.toString(anyType))!!.toString()

    var message: String = LogFormatUtil.getInstance()!!.get(className, functionName, specialMessage, exception)!!

PlayN.log()!!.error(LOG_SUCCESS +message, exception as Throwable)
}


    /*actual*/ open fun put(specialMessage: String, className: String, functionName: String)
        //nullable = true from not(false or (false and false)) = true
{
    //var specialMessage = specialMessage
    //var className = className
    //var functionName = functionName

    var message: String = LogFormatUtil.getInstance()!!.get(className, functionName, specialMessage)!!

PlayN.log()!!.debug(LOG_SUCCESS +message)
}


    /*actual*/ open fun put(specialMessage: String, className: String, functionName: String, exception: Any)
        //nullable = true from not(false or (false and false)) = true
{
    //var specialMessage = specialMessage
    //var className = className
    //var functionName = functionName
    //var exception = exception

    var message: String = LogFormatUtil.getInstance()!!.get(className, functionName, specialMessage, exception)!!

PlayN.log()!!.error(LOG_SUCCESS +message, exception as Throwable)
}


    /*actual*/ open fun getClassName(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: String
                //native - START
                {
                    
                }



                //native - END
                

        }
            public constructor ()
            : super()
        {
}


}
                
            

