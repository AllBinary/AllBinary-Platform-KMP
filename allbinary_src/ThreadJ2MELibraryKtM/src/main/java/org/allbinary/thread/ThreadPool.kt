
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
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListD
import org.allbinary.util.BasicArrayListUtil

open public class ThreadPool
            : Object
         {
        
companion object {
            
    private val ROOT_NAME: String = "-PooledThread-"

    val NORMAL_PRIORITY: Int = Thread.NORM_PRIORITY

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    val NULL_RUNNABLE: NullRunnable = NullRunnable.getInstance()!!

    val threadPoolStrings: ThreadPoolStrings = ThreadPoolStrings.getInstance()!!

    val threadObjectUtil: ThreadObjectUtil = ThreadObjectUtil.getInstance()!!

    private val poolName: String

    private val priority: Int

    private var isAlive: Boolean = false

    private var taskQueue: BasicArrayList = BasicArrayListUtil.getInstance()!!.getImmutableInstance()!!

    private var threadID: Int= 0

    private var numThreads: Int

    var runningTask: Boolean= false
public constructor (poolName: String, numThreads: Int, priority: Int)
            : super()
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
{

    
                        if(!this.isAlive)
                        
                                    {
                                    this.isAlive= true
this.taskQueue= BasicArrayListD()

    var pooledThread: PooledThread





                        for (i in 0 until this.numThreads)

        {
pooledThread= PooledThread(this)
pooledThread!!.setPriority(this.priority)
pooledThread!!.start()
}


                                    }
                                
}


                @Throws(Exception::class)
            
    open fun runAPriorityTask()
        //nullable = true from not(false or (false and true)) = true
{



                            throw RuntimeException()
}


    open fun runTaskWithPriority(task: PriorityRunnable)
        //nullable = true from not(false or (false and false)) = true
{
    //var task = task

        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(this) 

        //mutex.withLock
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


    var lowerPriorityRunnable: PriorityRunnable = this.threadObjectUtil!!.NULL_PRIORITY_RUNNABLE





                        for (index in 0 until size)

        {
runnable= this.taskQueue!!.get(index) as PriorityRunnable

    
                        if(runnable.getPriority() > task.getPriority())
                        
                                    {
                                    lowerPriorityRunnable= runnable
break;

                    

                                    }
                                
}


    
                        if(lowerPriorityRunnable == this.threadObjectUtil!!.NULL_PRIORITY_RUNNABLE || lowerPriorityRunnable == this.NULL_RUNNABLE)
                        
                                    {
                                    this.taskQueue!!.add(task)

                                    }
                                
                        else {
                            
    var index: Int = this.taskQueue!!.indexOf(lowerPriorityRunnable)!!

this.taskQueue!!.addAt(index, task)

                        }
                            
this.notify()

                                    }
                                
}

}


    open fun runTask(task: Runnable)
        //nullable = true from not(false or (false and false)) = true
{
    //var task = task

        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(this) 

        //mutex.withLock
        {

    
                        if(!this.isAlive)
                        
                                    {
                                    this.init()

                                    }
                                

    
                        if(task != 
                                    null
                                )
                        
                                    {
                                    this.taskQueue!!.add(task)
this.notify()

                                    }
                                
}

}


                @Throws(InterruptedException::class)
            
    open fun getTask()
        //nullable = true from not(false or (false and true)) = true
: Runnable{

        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(this) 

        //mutex.withLock
        {

        while(this.taskQueue!!.size() == 0)
        {

    
                        if(!this.isAlive)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.NULL_RUNNABLE

                                    }
                                
this.wait()
}


    var runnable: Runnable = this.taskQueue!!.removeAt(0) as Runnable




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return runnable
}

}


    open fun clear()
        //nullable = true from not(false or (false and true)) = true
{

        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(this) 

        //mutex.withLock
        {

    
                        if(this.isAlive)
                        
                                    {
                                    this.taskQueue!!.clear()

                                    }
                                
}

}


    open fun close()
        //nullable = true from not(false or (false and true)) = true
{

        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(this) 

        //mutex.withLock
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
{

        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(this) 

        //mutex.withLock
        {
this.isAlive= false
this.taskQueue!!.clear()
this.notifyAll()
}

}


    open fun isBusy()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

    
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
{
}


    open fun threadStopped()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(this.numThreads == 1)
                        
                                    {
                                    this.isAlive= false
this.taskQueue!!.clear()

                                    }
                                
}


    open fun startTask(task: Runnable)
        //nullable = true from not(false or (false and false)) = true
{
    //var task = task
}


    open fun completedTask(task: Runnable)
        //nullable = true from not(false or (false and false)) = true
{
    //var task = task
}


    open fun createName()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringMaker().
                            append(this.poolName)!!.append(ThreadPool.ROOT_NAME)!!.appendint(this.threadID++)!!.toString()
}


}
                
            

