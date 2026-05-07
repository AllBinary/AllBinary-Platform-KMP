
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2025 AllBinary 
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
        package org.allbinary




        import java.lang.Object        
        
        import java.lang.InterruptedException
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class TsUtil
            : Object
         {
        
companion object {
            
    private val instance: TsUtil = TsUtil()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TsUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TsUtil.instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    open fun hashCode(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Int{
var anyType = anyType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return anyType!!.hashCode()
}


                @Throws(InterruptedException::class)
            
    open fun waitFor(any: Any, timeoutMillis: Long)
        //nullable = true from not(false or (false and false)) = true
{
var any = any
    //var timeoutMillis = timeoutMillis

    var anyType: Object = any as Object

anyType!!.wait(timeoutMillis)
}


}
                
            

