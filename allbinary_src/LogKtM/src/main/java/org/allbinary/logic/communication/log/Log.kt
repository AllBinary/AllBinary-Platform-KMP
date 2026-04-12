
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
import org.allbinary.logic.communication.log.LogFormatUtil

open public class Log
            : Object
         {
        

    private val logFormatUtil: LogFormatUtil = LogFormatUtil.getInstance()!!

    private val specialMessage: String

    private val anyType: Any

    private val functionName: String

    private val exception: Any
public constructor (specialMessage: String, anyType: Any, functionName: String, exception: Any)
            : super()
        {
    //var specialMessage = specialMessage
    //var anyType = anyType
    //var functionName = functionName
    //var exception = exception
this.specialMessage= specialMessage
this.anyType= anyType
this.functionName= functionName
this.exception= exception
}


    open fun getSpecialMessage()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.specialMessage
}


    open fun getObject()
        //nullable = true from not(false or (false and true)) = true
: Any{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.anyType
}


    open fun getFunctionName()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.functionName
}


    open fun getThrowable()
        //nullable = true from not(false or (false and true)) = true
: Any{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.exception
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var className: String = CommonStrings.getInstance()!!.EMPTY


    var clazz: KClass<*> = this.anyType!!::class!!


    
                        if(clazz.toString()!! != 
                                    null
                                )
                        
                                    {
                                    className= clazz.toString()!!

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.logFormatUtil!!.get(className, this.functionName, this.specialMessage, this.exception)
}


}
                
            

