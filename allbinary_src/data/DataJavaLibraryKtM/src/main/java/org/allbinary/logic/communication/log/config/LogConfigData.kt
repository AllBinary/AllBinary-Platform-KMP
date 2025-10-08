
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
        package org.allbinary.logic.communication.log.config




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class LogConfigData
            : Object
         {
        
companion object {
            
    private val instance: LogConfigData = LogConfigData()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: LogConfigData{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor ()
            : super()
        {
}


    val NAME: String = "LOG_CONFIG_NAME"

    val DESCRIPTION: String = "LOG_CONFIG_DESCRIPTION"

    val FILE: String = "LOG_CONFIG_FILE"

}
                
            

