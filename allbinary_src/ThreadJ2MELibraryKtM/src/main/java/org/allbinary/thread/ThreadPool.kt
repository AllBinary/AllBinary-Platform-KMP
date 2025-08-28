
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
        
        import java.lang.Thread
        
        import java.lang.InterruptedException
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListUtil

open public class ThreadPool
            : Object
         {
        

        companion object {
            
    private val ROOT_NAME: String = "-PooledThread-"

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    val threadPoolStrings: ThreadPoolStrings = ThreadPoolStrings.getInstance()!!

    private val poolName: String

    private val priority: Int

    private var isAlive: Boolean = false

    private var taskQueue: BasicArrayList = BasicArrayListUtil.getInstance()!!.getImmutableInstance()!!

    private var threadID: Int= 0

    private var numThreads: Int
public constructor        (poolName: String, numThreads: Int)                        

                            : this(poolName, numThreads, Thread.NORM_PRIORITY)

        Updates for KMP build        
        {
    //var poolName = poolName
    //var numThreads = numThreads


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (poolName: String, numThreads: Int, priority: Int)
            : super()
        

        Updates for KMP build        
        {
    //var poolName = poolName
    //var numThreads = numThreads
    //var priority = priority
this.poolName= poolName
this.priority= priority
this.numThreads= numThreads
}


open fun init()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    
                        if(!this.isAlive)
                        
                                    {
                                    this.isAlive= true
this.taskQueue= BasicArrayList()

    var pooledThread: PooledThread





                        for (i in 0 until this.numThreads)

        

        Updates for KMP build        
        {
pooledThread= PooledThread()
pooledThread!!.setPriority(priority)
pooledThread!!.start()
}


                                    }
                                
}


                @Throws(Exception::class)
            
open fun runAPriorityTask()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {



                            throw RuntimeException()
}


open fun runTaskWithPriority(task: PriorityRunnable)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var task = task

        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(this) 

        //mutex.withLock
        

        Updates for KMP build        
        {

    
                        if(!this.isAlive)
                        
                                    {
                                    this.init()

                                    }
                                

    
                        if(task != 
                                    null
                                )
                        
                                    {
                                    
    var size: Int = this.taskQueue!!.size()!!


    var runnable: PriorityRunnable


    var lowerPriorityRunnable: PriorityRunnable = ThreadObjectUtil.getInstance()!!.NULL_PRIORITY_RUNNABLE





                        for (index in 0 until size)

        

        Updates for KMP build        
        {
runnable= this.taskQueue!!.get(index) as PriorityRunnable

    
                        if(runnable.getPriority() > task.getPriority())
                        
                                    {
                                    lowerPriorityRunnable= runnable
break;

                    

                                    }
                                
}


    
                        if(lowerPriorityRunnable == 
                                    null
                                 || lowerPriorityRunnable == NullRunnable.getInstance())
                        
                                    {
                                    this.taskQueue!!.add(task)

                                    }
                                
                        else {
                            
    var index: Int = this.taskQueue!!.indexOf(lowerPriorityRunnable)!!

this.taskQueue!!.add(index, task)

                        }
                            
notify()

                                    }
                                
}

}


open fun runTask(task: Runnable)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var task = task

        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(this) 

        //mutex.withLock
        

        Updates for KMP build        
        {

    
                        if(!isAlive)
                        
                                    {
                                    this.init()

                                    }
                                

    
                        if(task != 
                                    null
                                )
                        
                                    {
                                    this.taskQueue!!.add(task)
notify()

                                    }
                                
}

}


                @Throws(InterruptedException::class)
            
open fun getTask()
        //nullable = true from not(false or (false and true)) = true
: Runnable

        Updates for KMP build        
        {

        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(this) 

        //mutex.withLock
        

        Updates for KMP build        
        {

        while(this.taskQueue!!.size() == 0)
        

        Updates for KMP build        
        {

    
                        if(!this.isAlive)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullRunnable.getInstance()

                                    }
                                
this.wait()
}


    var runnable: Runnable = this.taskQueue!!.remove(0) as Runnable




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return runnable
}

}


open fun clear()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(this) 

        //mutex.withLock
        

        Updates for KMP build        
        {

    
                        if(this.isAlive)
                        
                                    {
                                    this.taskQueue!!.clear()

                                    }
                                
}

}


open fun close()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(this) 

        //mutex.withLock
        

        Updates for KMP build        
        {

    
                        if(this.isAlive)
                        
                                    {
                                    this.isAlive= false
this.taskQueue!!.clear()

                                    }
                                
}

}


open fun join()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(this) 

        //mutex.withLock
        

        Updates for KMP build        
        {
this.isAlive= false
this.taskQueue!!.clear()
notifyAll()
}

}


open fun isBusy()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {

    
                        if(!this.isAlive)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                

    
                        if(this.taskQueue!!.size() > 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                

    
                        if(this.runningTask)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun threadStarted()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


open fun threadStopped()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    
                        if(this.numThreads == 1)
                        
                                    {
                                    this.isAlive= false
taskQueue!!.clear()

                                    }
                                
}


open fun startTask(task: Runnable)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var task = task
}


open fun completedTask(task: Runnable)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var task = task
}


    private var runningTask: Boolean= false

open public inner class PooledThread : Thread {
        
/*Static stuff is not allowed for Kotlin inner classes
        companion object {
            *//*
        }
            */

public constructor        ()                        

                            : super(StringMaker().
                            append(poolName)!!.append(ROOT_NAME)!!.append(threadID++)!!.toString())

        Updates for KMP build        
        {


                            //For kotlin this is before the body of the constructor.
                    
logUtil!!.put(commonStrings!!.CONSTRUCTOR, this, commonStrings!!.CONSTRUCTOR)
}


    private val INTERRUPT_EXCEPTION: String = "Exit InterruptedException"
override fun run()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
threadStarted()

    var threadObjectUtil: ThreadObjectUtil = ThreadObjectUtil.getInstance()!!


        while(true)
        

        Updates for KMP build        
        {

    var task2: Runnable = threadObjectUtil!!.NULL_PRIORITY_RUNNABLE


        try {
            task2= getTask()
runningTask= true
startTask(task2)
} catch(ex: InterruptedException)
            

        Updates for KMP build        
        {
logUtil!!.put(INTERRUPT_EXCEPTION, this, commonStrings!!.RUN)
break;

                    
}


    
                        if(task2 == threadObjectUtil!!.NULL_PRIORITY_RUNNABLE)
                        
                                    {
                                    break;

                    

                                    }
                                

        try {
            task2.run()
completedTask(task2)
runningTask= false
} catch(e: Exception)
            

        Updates for KMP build        
        {
logUtil!!.put(StringMaker().
                            append(commonStrings!!.EXCEPTION_LABEL)!!.append(StringUtil.getInstance()!!.toString(task2))!!.toString(), this, commonStrings!!.RUN, e)
}

}

threadStopped()
}


}
                
            
}
                
            

