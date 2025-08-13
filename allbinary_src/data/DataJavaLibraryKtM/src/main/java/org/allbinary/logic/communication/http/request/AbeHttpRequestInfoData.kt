
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
        package org.allbinary.logic.communication.http.request



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class AbeHttpRequestInfoData
            : Object
         {
        

        companion object {
            
    private val instance: AbeHttpRequestInfoData = AbeHttpRequestInfoData()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AbeHttpRequestInfoData{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        {}


    val HTTP_USER_AGENT: String = "HTTP_USER_AGENT"

    val REMOTE_ADDRESS: String = "REMOTE_ADDRESS"

    val REMOTE_HOST: String = "REMOTE_HOST"

    val REMOTE_HOST_BY_ADDRESS: String = "REMOTE_HOST_BY_ADDRESS"

    val REMOTE_PORT: String = "REMOTE_PORT"

    val REQUEST_FILE_PATH: String = "REQUEST_FILE_PATH"

}
                
            

