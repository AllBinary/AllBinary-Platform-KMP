
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
        
import java.io.IOException
import java.util.Hashtable
import org.apache.xmlrpc.XmlRpcException
import org.allbinary.string.CommonSeps
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.canvas.SpecialMessageUtil
import org.allbinary.string.CommonStrings
import org.allbinary.time.TimeDelayHelper

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
            
    private var isFirstException: Boolean = true

    private var timeDelayHelper: TimeDelayHelper = TimeDelayHelper(200000)

    var abeClientInformation: AbeClientInformationInterface
private constructor        ()
            : super()
        {}


    private val stringBuffer: StringMaker = StringMaker()

open fun put(log: Log)
        //nullable = true from not(false or (false and false)) = true
{

                    var log = log

    
                        if(log == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

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
}


open fun put(specialMessage: String, anyType: Any, functionName: String, exception: Any)
        //nullable = true from not(false or (false and false)) = true
{

                    var specialMessage = specialMessage


                    var anyType = anyType


                    var functionName = functionName


                    var exception = exception

    
                        if(exception != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(exception::class.
                                            qualifiedName!!.compareTo(XmlRpcException::classgetName()) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    
                        if(exception::class.
                                            qualifiedName!!.compareTo(IOException::classgetName()) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    
                        if(this.isFirstException || this.timeDelayHelper!!.isTime())
                        
                                    {
                                    
    var className: String = CommonStrings.getInstance()!!.EMPTY

this.isFirstException= false

    
                        if(anyType != 
                                    null
                                 && anyType!!::class.qualifiedName!! != 
                                    null
                                )
                        
                                    {
                                    className= anyType!!::class.qualifiedName!!.toCharArray().concatToString()
                                

                                    }
                                

    var message: String = LogFormatUtil.getInstance()!!.get(className, functionName, specialMessage, exception)!!
            


        try {
            System.out.println(
                            "Eeeek")

    
                        if(abeClientInformation == 
                                    null
                                )
                        
                                    {
                                    


                            throw RuntimeException()

                                    }
                                

    var hashtable: Hashtable<Any, Any> = abeClientInformation!!.toHashtable()!!
            

stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(message)
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(SpecialMessageUtil.getInstance()!!.get())
hashtable.put(
                            "message", stringBuffer!!.toString())
XmlRpcRemoteLogClient(abeClientInformation).
                            get(hashtable)
} catch(e: Throwable)
            {System.out.println(
                            "Exception")
e.printStackTrace()
}


                                    }
                                

                                    }
                                
}


}
                
            

