
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
        
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date

open public class TimeStampUtil
            : Object
         {
        

        companion object {
            
    private val instance: TimeStampUtil = TimeStampUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TimeStampUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private val simpleDataFormat: SimpleDateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")
private constructor        ()
            : super()
        {}


open fun getAsString()
        //nullable = true from not(false or (false and true)) = true
: String{
    var calendar: Calendar = Calendar.getInstance()!!


    var date: Date = calendar.getTime()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return simpleDataFormat!!.format(date)
}


}
                
            

