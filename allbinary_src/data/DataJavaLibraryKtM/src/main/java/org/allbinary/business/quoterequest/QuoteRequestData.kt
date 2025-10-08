
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
        package org.allbinary.business.quoterequest




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class QuoteRequestData
            : Object
         {
        
companion object {
            
    private val instance: QuoteRequestData = QuoteRequestData()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: QuoteRequestData{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor ()
            : super()
        {
}


    val ID: String = "QUOTEREQUEST_ID"

    val PROJECT_INFO: String = "QUOTEREQUEST_PROJECT_INFO"

    val CUSTOMER_COMMENTS: String = "QUOTEREQUEST_CUSTOMER_COMMENTS"

    val BUDGET: String = "QUOTEREQUEST_BUDGET"

    val TIMEFRAME: String = "QUOTEREQUEST_TIMEFRAME"

    val COMMENTS: String = "QUOTEREQUEST_COMMENTS"

}
                
            

