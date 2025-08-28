
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
        package org.allbinary.logic.control.workflow




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.lang.reflect.Method
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class WorkFlowWrapper
            : Object
        
                , WorkFlowInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var anyType: Any
public constructor        (anyType: Any)
            : super()
        

        Updates for KMP build        
        {
var anyType = anyType
this.anyType= anyType
}


open fun getWorkFlowObject()
        //nullable = true from not(false or (false and true)) = true
: Any

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.anyType
}


                @Throws(Exception::class)
            
open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var helperClass: KClass<*> = anyType!!::class!!


    var method: Method = helperClass!!.getMethod("getName", 
                            null)!!


    var result: String = method.invoke(this.anyType, 
                            null) as String




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var error: String = "Reflection Exception"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "getName()", e)

                                    }
                                



                            throw Exception(error)
}

}


                @Throws(Exception::class)
            
open fun getStoreName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var helperClass: KClass<*> = anyType!!::class!!


    var method: Method = helperClass!!.getMethod("getStoreName", 
                            null)!!


    var result: String = method.invoke(this.anyType, 
                            null) as String




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var error: String = "Reflection Exception"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "getStoreName()", e)

                                    }
                                



                            throw Exception(error)
}

}


                @Throws(Exception::class)
            
open fun process()
        //nullable = true from not(false or (false and true)) = true
: Integer

        Updates for KMP build        
        {

        try {
            
    var helperClass: KClass<*> = anyType!!::class!!


    var method: Method = helperClass!!.getMethod(commonStrings!!.PROCESS, 
                            null)!!


    var result: Integer = method.invoke(this.anyType, 
                            null) as Integer




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var error: String = "Reflection Exception"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.PROCESS, e)

                                    }
                                



                            throw Exception(error)
}

}


}
                
            

