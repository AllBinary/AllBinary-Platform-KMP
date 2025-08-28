
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
        

open public class NoTimeDelayHelper : TimeDelayHelper {
        

        companion object {
            
    val SINGLETON: NoTimeDelayHelper = NoTimeDelayHelper()

        }
            public constructor        ()                        

                            : super(0){


                            //For kotlin this is before the body of the constructor.
                    
}

override fun isTime()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}

override fun isTimeSince(delay: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var delay = delay



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}

override fun isTime(currentTime: Long)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var currentTime = currentTime



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}

override fun isTimeSince(delay: Int, currentTime: Long)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var delay = delay
var currentTime = currentTime



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


}
                
            

