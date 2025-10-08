
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
        
import java.util.logging.Level
import java.util.logging.Logger
import org.allbinary.logic.NullUtil
import org.allbinary.string.CommonStrings

/*actual*/ open public class LogUtil
            : Object
         {
        
/*actual*/ companion object {
            
    private val instance: LogUtil = LogUtil()

    /*actual*/ open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: LogUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private val logger: Logger = Logger.getLogger(LogUtil::class.toString()!!)!!
private constructor ()
            : super()
        {
}


    /*actual*/ open fun put(log: Log)
        //nullable = true from not(false or (false and false)) = true
{
    //var log = log

    var specialMessage: String = log.getSpecialMessage()!!


    var anyType: Any = log.getObject()!!


    var functionName: String = log.getFunctionName()!!


    var exception: Any = log.getThrowable()!!

this.put(specialMessage, anyType, functionName, exception)
}


    /*actual*/ open fun put(specialMessage: String, anyType: Any, functionName: String)
        //nullable = true from not(false or (false and false)) = true
{
    //var specialMessage = specialMessage
    //var anyType = anyType
    //var functionName = functionName
this.put(specialMessage, anyType, functionName, NullUtil.getInstance()!!.NULL_OBJECT)
}


    /*actual*/ open fun put(specialMessage: String, anyType: Any, functionName: String, exception: Any)
        //nullable = true from not(false or (false and false)) = true
{
    //var specialMessage = specialMessage
    //var anyType = anyType
    //var functionName = functionName
    //var exception = exception

        try {
            
    var className: String = CommonStrings.getInstance()!!.EMPTY


    var clazz: KClass<*> = anyType!!::class!!


    
                        if(clazz.toString()!! != 
                                    null
                                )
                        
                                    {
                                    className= clazz.toString()!!

                                    }
                                

    var message: String = LogFormatUtil.getInstance()!!.get(className, functionName, specialMessage)!!


    
                        if(exception != 
                                    null
                                )
                        
                                    {
                                    logger.log(Level.SEVERE, message, exception)

                                    }
                                
                        else {
                            logger.log(Level.INFO, message)

                        }
                            
} catch(e: Exception)
            {
}

}


}
                
            

