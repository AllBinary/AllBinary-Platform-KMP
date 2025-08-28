
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
        package org.allbinary.time




        import java.lang.Object        
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class GameTickTimeDelayHelper
            : Object
         {
        

    var timeDelta: Long= 0

    var startTime: Long

    var lastStartTime: Long
public constructor        ()
            : super()
        {
this.startTime= System.currentTimeMillis()
this.lastStartTime= startTime
}

public constructor        (startTime: Long)
            : super()
        {
    //var startTime = startTime
this.startTime= startTime
this.lastStartTime= 0
}


open fun setStartTime()
        //nullable = true from not(false or (false and true)) = true
: Long{
this.startTime= System.currentTimeMillis()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.startTime
}


open fun loop()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(this.lastStartTime == Long.MIN_VALUE)
                        
                                    {
                                    this.timeDelta= 0

                                    }
                                
                        else {
                            this.timeDelta= System.currentTimeMillis() -this.lastStartTime

                        }
                            
}


open fun getTimeFromStart()
        //nullable = true from not(false or (false and true)) = true
: Long{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.startTime -this.lastStartTime
}


}
                
            

