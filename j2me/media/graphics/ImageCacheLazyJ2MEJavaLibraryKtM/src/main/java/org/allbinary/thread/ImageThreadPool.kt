
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
        
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStrings
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.communication.log.LogUtil

open public class ImageThreadPool : ThreadPool {
        
companion object {
            
    private val instance: ThreadPool = ImageThreadPool("ImageLoader", 1)

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ThreadPool{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
public constructor (poolName: String, numThreads: Int)                        

                            : super(poolName, numThreads){
    //var poolName = poolName
    //var numThreads = numThreads


                            //For kotlin this is before the body of the constructor.
                    
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun runTask(task: Runnable)
        //nullable = true from not(false or (false and false)) = true
{
var task = task
super.runTask(task)
}


    open fun startTask(task: Runnable)
        //nullable = true from not(false or (false and false)) = true
{
var task = task
}


    open fun completedTask(task: Runnable)
        //nullable = true from not(false or (false and false)) = true
{
var task = task
}


}
                
            

