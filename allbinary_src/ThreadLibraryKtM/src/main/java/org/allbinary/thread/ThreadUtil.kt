
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




        import java.lang.Object        
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil

open public class ThreadUtil
            : Object
         {
        
companion object {
            
    private val instance: ThreadUtil = ThreadUtil()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ThreadUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val JOIN: String = "join"

    open fun isRunning(thread: Thread)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var thread = thread

    
                        if(thread != 
                                    null
                                 && thread.isAlive())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


                @Throws(Exception::class)
            
    open fun join(thread: Thread)
        //nullable = true from not(false or (false and false)) = true
{
var thread = thread

    
                        if(ThreadUtil.getInstance()!!.isRunning(thread))
                        
                                    {
                                    logUtil!!.put("Waiting for Thread To Join/End", this, JOIN)
thread.join()

                                    }
                                
}


}
                
            

