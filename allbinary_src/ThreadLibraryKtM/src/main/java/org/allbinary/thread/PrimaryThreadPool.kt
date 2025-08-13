
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil

open public class PrimaryThreadPool : ThreadPool {
        

        companion object {
            
    private val THREAD_POOL: ThreadPool = ThreadPool(
                            "Primary", 1)

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ThreadPool{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return THREAD_POOL
}


        }
            public constructor        (poolName: String, numThreads: Int)                        

                            : super(poolName, numThreads){

                    var poolName = poolName


                    var numThreads = numThreads


                            //For kotlin this is before the body of the constructor.
                    
}

override fun runTask(task: Runnable)
        //nullable = true from not(false or (false and false)) = true
{

                    var task = task
logUtil!!.put(StringMaker().
                            append(StringUtil.getInstance()!!.toString(task))!!.append(System.currentTimeMillis())!!.toString(), this, this.threadPoolStrings!!.ADD_TASK)
super.runTask(task)
}

override fun startTask(task: Runnable)
        //nullable = true from not(false or (false and false)) = true
{

                    var task = task
logUtil!!.put(StringMaker().
                            append(this.threadPoolStrings!!.START_TASK)!!.append(StringUtil.getInstance()!!.toString(task))!!.toString(), this, this.commonStrings!!.RUN)
}

override fun completedTask(task: Runnable)
        //nullable = true from not(false or (false and false)) = true
{

                    var task = task
logUtil!!.put(StringMaker().
                            append(this.threadPoolStrings!!.COMPLETE_TASK)!!.append(StringUtil.getInstance()!!.toString(task))!!.toString(), this, this.commonStrings!!.RUN)
}


}
                
            

