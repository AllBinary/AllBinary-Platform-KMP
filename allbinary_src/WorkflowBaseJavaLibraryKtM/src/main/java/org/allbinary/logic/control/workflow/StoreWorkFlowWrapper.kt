
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.lang.reflect.Method
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class StoreWorkFlowWrapper : WorkFlowWrapper {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            
public constructor        (anyType: Any)                        

                            : super(anyType){

                    var anyType = anyType


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
open fun getStoreName()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var helperClass: KClass<*> = this.getWorkFlowObject()!!.::class!!
            


    var method: Method = helperClass!!.getMethod("getStoreName", 
                            null)!!
            


    var result: String = method.invoke(this.getWorkFlowObject(), 
                            null) as String




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            {
    var error: String = "Reflection Exception"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, "getStoreName()", e)

                                    }
                                



                            throw Exception(error)
}

}


}
                
            

