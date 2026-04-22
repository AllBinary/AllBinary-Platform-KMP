
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
        
        import java.lang.InterruptedException
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListD

open public class ThreadPool
            : Object
         {
        
companion object {
            
    var NORMAL_PRIORITY: Int = 5

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    val NULL_RUNNABLE: NullRunnable = NullRunnable.getInstance()!!

    val threadPoolStrings: ThreadPoolStrings = ThreadPoolStrings.getInstance()!!

    val threadObjectUtil: ThreadObjectUtil = ThreadObjectUtil.getInstance()!!

    private var isAlive: Boolean= false

    private var taskQueue: BasicArrayList = BasicArrayListD()

    private var numThreads: Int= 0

    private var runningTask: Boolean= false
public constructor (poolName: String, numThreads: Int, priority: Int)
            : super()
        {
    //var poolName = poolName
    //var numThreads = numThreads
    //var priority = priority
}


    private var currentPriorityRunnable: PriorityRunnable = threadObjectUtil!!.NULL_PRIORITY_RUNNABLE

                @Throws(Exception::class)
            
    open fun runAPriorityTask()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(!this.currentPriorityRunnable!!.isDone())
                        
                                    {
                                    this.currentPriorityRunnable!!.run()

                                    }
                                
                        else {
                            
    var runnable: Runnable = this.getTask()!!


    
                        if(runnable == this.NULL_RUNNABLE)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                
this.currentPriorityRunnable= runnable as PriorityRunnable

    
                        if(!(this.currentPriorityRunnable == this.threadObjectUtil!!.NULL_PRIORITY_RUNNABLE))
                        
                                    {
                                    this.currentPriorityRunnable!!.reset()
this.currentPriorityRunnable!!.run()

                                    }
                                

                        }
                            
}


                @Throws(Exception::class)
            
    open fun runATask()
        //nullable = true from not(false or (false and true)) = true
{

    var runnable: Runnable = this.getTask()!!


    
                        if(runnable != 
                                    null
                                )
                        
                                    {
                                    runnable.run()

                                    }
                                
}


    open fun init()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(!this.isAlive)
                        
                                    {
                                    this.isAlive= true
this.taskQueue= BasicArrayListD()

                                    }
                                
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun runTaskWithPriority(task: PriorityRunnable)
        //nullable = true from not(false or (false and false)) = true
{
    //var task = task

    
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

this.taskQueue!!.add(index, task)

                        }
                            

                                    }
                                
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun runTask(task: Runnable)
        //nullable = true from not(false or (false and false)) = true
{
    //var task = task

    
                        if(!this.isAlive)
                        
                                    {
                                    this.init()

                                    }
                                

    
                        if(task != 
                                    null
                                )
                        
                                    {
                                    this.taskQueue!!.add(task)

                                    }
                                
}


                @Throws(InterruptedException::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun getTask()
        //nullable = true from not(false or (false and true)) = true
: Runnable{

    
                        if(this.taskQueue!!.isEmpty())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NULL_RUNNABLE

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.taskQueue!!.remove(0) as Runnable
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun clear()
        //nullable = true from not(false or (false and true)) = true
{
this.taskQueue!!.clear()
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun close()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(this.isAlive)
                        
                                    {
                                    this.isAlive= false
this.taskQueue!!.clear()
this.currentPriorityRunnable= this.threadObjectUtil!!.NULL_PRIORITY_RUNNABLE

                                    }
                                
}


    open fun join()
        //nullable = true from not(false or (false and true)) = true
{
this.isAlive= false
this.taskQueue!!.clear()
this.currentPriorityRunnable= this.threadObjectUtil!!.NULL_PRIORITY_RUNNABLE
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
this.currentPriorityRunnable= this.threadObjectUtil!!.NULL_PRIORITY_RUNNABLE

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


}
                
            

