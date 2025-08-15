
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        package org.allbinary.logic.communication.log.config.type




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class LogConfigTypeFactory
            : Object
         {
        

        companion object {
            
    private val instance: LogConfigTypeFactory = LogConfigTypeFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: LogConfigTypeFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private val NO_DESCRIPTION: String = "No Description"

    val OS: LogConfigType = LogConfigType("Operating System", NO_DESCRIPTION)

    val FACTORYERROR: LogConfigType = LogConfigType("Factory Error", NO_DESCRIPTION)
private constructor        ()
            : super()
        {LogConfigTypes.LOGGING.add(OS)
LogConfigTypes.LOGGING.add(FACTORYERROR)
}


}
                
            

