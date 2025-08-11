
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
        
import org.allbinary.logic.string.StringMaker
import java.util.logging.Logger
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
            
    private val logger: Logger = Logger.getLogger(LogUtil::classgetName())!!
            
private constructor        ()
            : super()
        {}


open fun init()
        //nullable = true from not(false or (false and true)) = true
{PreLogUtil.put(
                            "Loggin Initialized", 
                            "LogUtil", 
                            "init()")
}


open fun put(log: Log)
        //nullable = true from not(false or (false and false)) = true
{

                    var log = log

    var exception: Any = log.getThrowable()!!
            


        try {
            
    
                        if(exception != 
                                    null
                                )
                        
                                    {
                                    
    var specialMessage: String = log.getSpecialMessage()!!
            


    var anyType: Any = log.getObject()!!
            


    var functionName: String = log.getFunctionName()!!
            


    var className: String = CommonStrings.getInstance()!!.EMPTY


    var clazz: KClass<*> = anyType!!::class!!
            


    
                        if(clazz.qualifiedName!! != 
                                    null
                                )
                        
                                    {
                                    className= clazz.qualifiedName!!

                                    }
                                

    var message: String = LogFormatUtil.getInstance()!!.get(className, functionName, specialMessage, exception)!!
            

logger.severe(message)

                                    }
                                
} catch(e: Exception)
            {}

}


}
                
            

