
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
        
        import java.lang.Runnable
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil

open public class PathFindingThreadPool : ThreadPool {
        

        companion object {
            
    private val instance: ThreadPool = PathFindingThreadPool("PathFinding", 1, 1)

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ThreadPool

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            public constructor        (poolName: String, numThreads: Int, priority: Int)                        

                            : super(poolName, numThreads)

        Updates for KMP build        
        {
    //var poolName = poolName
    //var numThreads = numThreads
    //var priority = priority


                            //For kotlin this is before the body of the constructor.
                    
}

override fun runTaskWithPriority(task: PriorityRunnable)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var task = task
super.runTaskWithPriority(task)
}

override fun runTask(task: Runnable)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var task = task
super.runTask(task)
}

override fun startTask(task: Runnable)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var task = task
}

override fun completedTask(task: Runnable)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var task = task
}


}
                
            

