
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
        package org.allbinary.thread




        import java.lang.Object        
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class ABRunnable
            : Object
        
                , RunnableInterface {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private var running: Boolean = false
override fun setThread(thread: Thread)
        //nullable = true from not(false or (false and false)) = true
{
var thread = thread
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
override fun isRunning()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return running
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
override fun setRunning(running: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var running = running
this.running= running
}

override fun run()
        //nullable = true from not(false or (false and true)) = true
{
}


open fun getType()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}


}
                
            

