
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
        
import org.allbinary.logic.NullUtil
import org.allbinary.logic.java.exception.ExceptionUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonSeps
import org.allbinary.time.TimeStampUtil

open public class LogFormatUtil
            : Object
         {
        

        companion object {


    private val instance: LogFormatUtil = LogFormatUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: LogFormatUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
    private val timeStampUtil: TimeStampUtil = TimeStampUtil.getInstance()!!
            

    private val commonSeps: CommonSeps = CommonSeps.getInstance()!!
            

    private val NONE: String = "None"

    private val LOG_ERROR: String = "\nLog-Error: "

    private val EMPTY: String = "Empty"

    private val STACK_TRACE: String = "\nStack Trace: "

    private val TIME: String = "Time: "

    private val CLASS_NAME: String = this.commonSeps!!.SPACE

    private val FUNCTION_CALL: String = CommonLabels.getInstance()!!.COLON_SEP

    private val SPECIAL_MESSAGE: String = "> "
private constructor        ()
            : super()
        {}


open fun get(className: String, functionName: String, specialMessage: String, exception: Any)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var className = className


                    var functionName = functionName


                    var specialMessage = specialMessage


                    var exception = exception

    var stringBuffer: StringMaker = get(className, functionName)!!
            

stringBuffer!!.append(this.get(exception))
stringBuffer!!.append(SPECIAL_MESSAGE)
stringBuffer!!.append(specialMessage)
stringBuffer!!.append(this.commonSeps!!.NEW_LINE)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun get(className: String, functionName: String, specialMessage: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var className = className


                    var functionName = functionName


                    var specialMessage = specialMessage

    var stringBuffer: StringMaker = get(className, functionName)!!
            

stringBuffer!!.append(SPECIAL_MESSAGE)
stringBuffer!!.append(specialMessage)
stringBuffer!!.append(this.commonSeps!!.NEW_LINE)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun get(className: String, functionName: String)
        //nullable = true from not(false or (false and false)) = true
: StringMaker{

                    var className = className


                    var functionName = functionName

    
                        if(functionName == 
                                    null
                                )
                        
                                    {
                                    functionName= NONE

                                    }
                                

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(TIME)
stringBuffer!!.append(timeStampUtil!!.getAsString())
stringBuffer!!.append(CLASS_NAME)
stringBuffer!!.append(className)
stringBuffer!!.append(FUNCTION_CALL)
stringBuffer!!.append(functionName)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer
}


    private val stringUtil: StringUtil = StringUtil.getInstance()!!
            

    private val exceptionUtil: ExceptionUtil = ExceptionUtil.getInstance()!!
            

    private val nullUtil: NullUtil = NullUtil.getInstance()!!
            

open fun get(exception: Any)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var exception = exception

    
                        if(exception != nullUtil!!.NULL_OBJECT)
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(LOG_ERROR)

    var exceptionAsString: String = exception!!.toString()!!
            


    
                        if(exceptionAsString != 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.append(exceptionAsString)

                                    }
                                
                        else {
                            stringBuffer!!.append(EMPTY)

                        }
                            
stringBuffer!!.append(STACK_TRACE)

    
                        if(exception != nullUtil!!.NULL_OBJECT)
                        
                                    {
                                    stringBuffer!!.append(exceptionUtil!!.getStackTrace(exception as Throwable))

                                    }
                                
                        else {
                            stringBuffer!!.append(stringUtil!!.NULL_STRING)

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING

                        }
                            
}


}
                
            

