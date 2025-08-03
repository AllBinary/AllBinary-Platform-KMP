
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
        package org.allbinary.thread



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        import java.lang.Runnable
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
interface RunnableInterface : Runnable {
        

open fun isRunning()
        //nullable = true from not(false or (false and true)) = true
: Boolean

open fun setRunning(isRunning: Boolean)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
open fun setThread(thread: Thread)
        //nullable = true from not(false or (false and false)) = true


}
                
            

