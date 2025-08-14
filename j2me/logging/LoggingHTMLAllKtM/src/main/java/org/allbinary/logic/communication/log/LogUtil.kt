
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
        
import org.allbinary.string.CommonStrings
import playn.core.PlayN

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

    var specialMessage: String = log.getSpecialMessage()!!
            


    var anyType: Any = log.getObject()!!
            


    var functionName: String = log.getFunctionName()!!
            


    var exception: Any = log.getThrowable()!!
            

this.put(specialMessage, anyType, functionName, exception)
}


open fun put(specialMessage: String, anyType: Any, functionName: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var specialMessage = specialMessage


                    var anyType = anyType


                    var functionName = functionName

    var className: String = PreLogUtil.getClassName(anyType)!!
            


    
                        if(className == 
                                    null
                                )
                        
                                    {
                                    className= CommonStrings.getInstance()!!.EMPTY

                                    }
                                

    var message: String = LogFormatUtil.getInstance()!!.get(className, functionName, specialMessage)!!
            

PlayN.log()!!.debug(LOG_SUCCESS +message)
}


open fun put(specialMessage: String, anyType: Any, functionName: String, exception: Any)
        //nullable = true from not(false or (false and false)) = true
{

                    var specialMessage = specialMessage


                    var anyType = anyType


                    var functionName = functionName


                    var exception = exception

    var className: String = PreLogUtil.getClassName(anyType)!!
            


    
                        if(className == 
                                    null
                                )
                        
                                    {
                                    className= CommonStrings.getInstance()!!.EMPTY

                                    }
                                

    var message: String = LogFormatUtil.getInstance()!!.get(className, functionName, specialMessage, exception)!!
            


    
                        if(exception != 
                                    null
                                )
                        
                                    {
                                    PlayN.log()!!.error(LOG_SUCCESS +message, exception as Throwable)

                                    }
                                
                        else {
                            PlayN.log()!!.debug(LOG_SUCCESS +message)

                        }
                            
}


}
                
            

