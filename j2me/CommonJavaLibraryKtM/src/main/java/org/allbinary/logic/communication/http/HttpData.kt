
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
        package org.allbinary.logic.communication.http




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.string.CommonSeps

open public class HttpData
            : Object
         {
        

        companion object {
            
    private val instance: HttpData = HttpData()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: HttpData

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


    val EQUALS: String = CommonSeps.getInstance()!!.EQUALS

    val PARAM_SEP: String = CommonSeps.getInstance()!!.AMP

    val URL_PARAM_SEP: String = CommonSeps.getInstance()!!.QUESTION

    val URL_LABEL: String = "Url: "

}
                
            

