
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
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val NO_DESCRIPTION: String = "No Description"

    val FILE: LogConfigType = LogConfigType("File", NO_DESCRIPTION)

    val FILEERROR: LogConfigType = LogConfigType("File Error", NO_DESCRIPTION)

    val IDLOGGING: LogConfigType = LogConfigType("ID Logging", NO_DESCRIPTION)

    val REPLACE: LogConfigType = LogConfigType("Replace", NO_DESCRIPTION)

    val REPLACE_INFO: LogConfigType = LogConfigType("Replace Info", NO_DESCRIPTION)

    val REPLACEERROR: LogConfigType = LogConfigType("Replace Error", NO_DESCRIPTION)

}
                
            

