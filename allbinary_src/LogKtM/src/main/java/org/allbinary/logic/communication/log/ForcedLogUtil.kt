
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

open public class ForcedLogUtil
            : Object
         {
        

        companion object {
            
open fun log(message: String, anyType: Any)
        //nullable = true from not(false or (false and false)) = true
{

                    var message = message


                    var anyType = anyType

        try {
            


                            throw Exception(message)
} catch(e: Exception)
            {PreLogUtil.put(CommonStrings.getInstance()!!.EXCEPTION, anyType, 
                            "log", e)
}

}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

