
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
        

expect open public class LogFactory
            : Object
         {
        
companion object {
            
    open fun getInstanceNoF(specialMessage: String, anyType: Any, exception: Any)
        //nullable = true from not(false or (false and false)) = true
: Log

    open fun getInstance(specialMessage: String, anyType: Any, functionName: String, exception: Any)
        //nullable =  from not(true or (false and false)) = 
: Log

    open fun getInstanceF(specialMessage: String, anyType: Any, functionName: String)
        //nullable = true from not(false or (false and false)) = true
: Log

        }
            
}
                
            

