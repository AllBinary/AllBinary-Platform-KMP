
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2002 AllBinary 
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
        package org.allbinary.data.tables.generator



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class IdGeneratorEntityFactory
            : Object
         {
        

        companion object {


open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: IdGeneratorEntityInterface{
        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return IdGeneratorEntity() as IdGeneratorEntityInterface
} catch(e: Exception)
            {
    var logUtil: LogUtil = LogUtil.getInstance()!!
            


    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, 
                            "ServerLicenseRequestEntityFactory", commonStrings!!.GET_INSTANCE, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}



        }
            private constructor        ()
            : super()
        {}


}
                
            

