
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2025 AllBinary 
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

open public class PooledThread : Thread {
        

    private val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val threadObjectUtil: ThreadObjectUtil = ThreadObjectUtil.getInstance()!!

    private val threadPool: ThreadPool
public constructor (threadPool: ThreadPool)                        

                            : super(threadPool!!.createName()){
    //var threadPool = threadPool


                            //For kotlin this is before the body of the constructor.
                    
this.logUtil!!.putF(this.commonStrings!!.CONSTRUCTOR, this, this.commonStrings!!.CONSTRUCTOR)
this.threadPool= threadPool
}


    private val INTERRUPT_EXCEPTION: String = "Exit InterruptedException"

    override fun run()
        //nullable = true from not(false or (false and true)) = true
{
this.threadPool!!.threadStarted()

        while(true)
        {

    var task2: Runnable = this.threadObjectUtil!!.NULL_PRIORITY_RUNNABLE


        try {
            task2= this.threadPool!!.getTask()
this.threadPool!!.runningTask= true
this.threadPool!!.startTask(task2)
} catch(ex: InterruptedException)
            {

    var logUtil: LogUtil = LogUtil.getInstance()!!

logUtil!!.putF(this.INTERRUPT_EXCEPTION, this, this.commonStrings!!.RUN)
break;

                    
}


    
                        if(task2 == this.threadObjectUtil!!.NULL_PRIORITY_RUNNABLE)
                        
                                    {
                                    break;

                    

                                    }
                                

        try {
            task2.run()
this.threadPool!!.completedTask(task2)
this.threadPool!!.runningTask= false
} catch(e: Exception)
            {

    var logUtil: LogUtil = LogUtil.getInstance()!!

logUtil!!.put(StringMaker().
                            append(this.commonStrings!!.EXCEPTION_LABEL)!!.append(StringUtil.getInstance()!!.toString(task2))!!.toString(), this, this.commonStrings!!.RUN, e)
}

}

this.threadPool!!.threadStopped()
}


}
                
            

