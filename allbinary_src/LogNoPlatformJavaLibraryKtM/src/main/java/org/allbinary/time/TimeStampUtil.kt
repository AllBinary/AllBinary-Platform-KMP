
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
        package org.allbinary.time




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Calendar
import java.util.Date

expect open public class TimeStampUtil
            : Object
         {
        
companion object {
            
    //private val instance: TimeStampUtil
    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TimeStampUtil

        }
            

    open fun getAsString()
        //nullable = true from not(false or (false and true)) = true
: String

}
                
            

