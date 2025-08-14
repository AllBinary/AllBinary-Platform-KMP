
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
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings

open public class Log
            : Object
         {
        

    private val nullUtil: NullUtil = NullUtil.getInstance()!!
            

    private val logFormatUtil: LogFormatUtil = LogFormatUtil.getInstance()!!
            

    private val specialMessage: String

    private val anyType: Any

    private val functionName: String

    private val exception: Any
public constructor        ()
            : super()
        {
    var stringUtil: StringUtil = StringUtil.getInstance()!!
            

this.specialMessage= stringUtil!!.EMPTY_STRING
this.anyType= nullUtil!!.NULL_OBJECT
this.functionName= stringUtil!!.EMPTY_STRING
this.exception= nullUtil!!.NULL_OBJECT
}

public constructor        (specialMessage: String, anyType: Any, functionName: String, exception: Any)
            : super()
        {

                    var specialMessage = specialMessage


                    var anyType = anyType


                    var functionName = functionName


                    var exception = exception
this.specialMessage= specialMessage
this.anyType= anyType
this.functionName= functionName
this.exception= exception
}

public constructor        (specialMessage: String, anyType: Any, functionName: String)
            : super()
        {

                    var specialMessage = specialMessage


                    var anyType = anyType


                    var functionName = functionName
this.specialMessage= specialMessage
this.anyType= anyType
this.functionName= functionName
this.exception= nullUtil!!.NULL_OBJECT
}


open fun getSpecialMessage()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return specialMessage
}


open fun getObject()
        //nullable = true from not(false or (false and true)) = true
: Any{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return anyType
}


open fun getFunctionName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return functionName
}


open fun getThrowable()
        //nullable = true from not(false or (false and true)) = true
: Any{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return exception
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var className: String = CommonStrings.getInstance()!!.EMPTY


    var clazz: KClass<*> = anyType!!::class!!
            


    
                        if(clazz.qualifiedName!! != 
                                    null
                                )
                        
                                    {
                                    className= clazz.qualifiedName!!

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return logFormatUtil!!.get(className, this.functionName, this.specialMessage, this.exception)
}


}
                
            

