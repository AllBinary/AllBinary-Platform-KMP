
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
        package org.allbinary.debug



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import android.os.Debug

open public class AndroidDebug
            : Object
        
                , DebugInterface {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private var startTime: Long = Long.MAX_VALUE

    private var running: Boolean = false

    private var bufferSize: Int = 32 *1024 *1024
override fun start()
        //nullable = true from not(false or (false and true)) = true
{this.setStartTime(System.currentTimeMillis())
Debug.startMethodTracing(
                            "trace", bufferSize)
setRunning(true)
}

override fun stop()
        //nullable = true from not(false or (false and true)) = true
{startTime= Long.MAX_VALUE
Debug.stopMethodTracing()
setRunning(false)
}

override fun getMaxTime()
        //nullable = true from not(false or (false and true)) = true
: Long{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 120000
}


open fun setStartTime(startTime: Long)
        //nullable = true from not(false or (false and false)) = true
{

                    var startTime = startTime
this.startTime= startTime
}

override fun getStartTime()
        //nullable = true from not(false or (false and true)) = true
: Long{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return startTime
}


open fun setRunning(running: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var running = running
this.running= running
}

override fun isRunning()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return running
}


}
                
            

