
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
        package org.allbinary.canvas




        import java.lang.Object        
        
        import java.lang.System
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.CommandListener
import javax.microedition.lcdui.NullCommandListener
import org.allbinary.game.displayable.canvas.NullWaitGameRunnable
import org.allbinary.graphics.displayable.CanvasStrings
import org.allbinary.graphics.displayable.MyCanvas
import org.allbinary.logic.NullUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStrings
import org.allbinary.thread.NullThread
import org.allbinary.thread.RunnableInterface
import org.allbinary.thread.ThreadObjectUtil
import org.allbinary.time.TimeDelayHelper
import org.allbinary.util.BasicArrayList

open public class RunnableCanvas : MyCanvas
                , RunnableInterface {
        

    val nullUtil: NullUtil = NullUtil.getInstance()!!
            

    private var thread: Thread = NullThread.NULL_THREAD

    private var currentThread: Thread = NullThread.NULL_THREAD

    private var running: Boolean= false

    val loopTimeHelper: TimeDelayHelper = TimeDelayHelper(NullWaitGameRunnable.getInstance()!!.WAIT)

    var runnableCanvasRefreshHelper: Processor = Processor.getInstance()!!
            

    val commonLabels: CommonLabels = CommonLabels.getInstance()!!
            

    val threadObjectUtil: ThreadObjectUtil = ThreadObjectUtil.getInstance()!!
            
public constructor        (commandListener: CommandListener, childNameList: BasicArrayList, hasParam: Boolean)                        

                            : super(CommonStrings.getInstance()!!.UNKNOWN, childNameList){

                    var commandListener = commandListener


                    var childNameList = childNameList


                    var hasParam = hasParam


                            //For kotlin this is before the body of the constructor.
                    
logUtil!!.put(StringMaker().
                            append("delay: ")!!.append(this.loopTimeHelper!!.delay)!!.toString(), this, this.commonStrings!!.CONSTRUCTOR)
this.runnableCanvasRefreshHelper= RunnableCanvasRefreshHelper(this)

    
                        if(commandListener != 
                                    null
                                )
                        
                                    {
                                    this.initCommands(commandListener)

                                    }
                                
                             else 
    
                        if(hasParam)
                        
                                    {
                                    logUtil!!.put("commandListener was null", this, "initCommands")

                                    }
                                
}

public constructor        (commandListener: CommandListener, childNameList: BasicArrayList)                        

                            : this(commandListener, childNameList, true){

                    var commandListener = commandListener


                    var childNameList = childNameList


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        ()                        

                            : this(NullCommandListener.NULL_COMMAND_LISTENER, CanvasStrings.getInstance()!!.EMPTY_CHILD_NAME_LIST, false){

                            //For kotlin this is before the body of the constructor.
                    
}


open fun initCommands(cmdListener: CommandListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var cmdListener = cmdListener
logUtil!!.put(commonStrings!!.NOT_IMPLEMENTED, this, "initCommands")
}


open fun isMainCanvas()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
                        if(this.getCustomCommandListener() != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}

override fun setThread(thread: Thread)
        //nullable = true from not(false or (false and false)) = true
{

                    var thread = thread
this.thread= thread
}

override fun setRunning(running: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var running = running
this.running= running

    
                        if(!this.running)
                        
                                    {
                                    this.thread= NullThread.NULL_THREAD

        
        //synchronized(this) 
        //mutex.withLock
        threadObjectUtil!!.notifyObject(this)



                                    }
                                
logUtil!!.put(StringMaker().
                            append(IS_RUNNING)!!.append(this.running)!!.toString(), this, SET_RUNNING)
}


    val SET_RUNNING: String = "setRunning"

    private val IS_RUNNING: String = "isRunning"

    private val THREAD: String = "Thread: "

    private val NOT_EQUAL: String = " != "
override fun isRunning()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
                        if(this.thread == this.currentThread)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return running

                                    }
                                
                        else {
                            
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(THREAD)

    
                        if(this.thread != 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.append(this.thread.toString())

                                    }
                                
stringBuffer!!.append(NOT_EQUAL)

    
                        if(this.currentThread != 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.append(StringUtil.getInstance()!!.toString(this.currentThread))

                                    }
                                
logUtil!!.put(stringBuffer!!.toString(), this, IS_RUNNING)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


open fun getLoopTimeHelperP()
        //nullable = true from not(false or (false and true)) = true
: TimeDelayHelper{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return loopTimeHelper
}


    private var pauseWait: Long = 0

open fun setWait(wait: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var wait = wait
loopTimeHelper!!.delay= wait
this.pauseWait= wait.toLong() *3
logUtil!!.put(StringMaker().
                            append("setWait - delay: ")!!.append(this.loopTimeHelper!!.delay)!!.toString(), this, this.commonStrings!!.CONSTRUCTOR)
}


open fun getWait()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.loopTimeHelper!!.delay
}


open fun setCurrentThread()
        //nullable = true from not(false or (false and true)) = true
{this.currentThread= Thread.currentThread()
}


open fun setCurrentThreadFake()
        //nullable = true from not(false or (false and true)) = true
{this.currentThread= thread
}

override fun showNotify()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            this.stopWaiting()
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, "showNotify", e)
}

}


    private var notified: Boolean = false

                @Throws(Exception::class)
            
open fun stopWaiting()
        //nullable = true from not(false or (false and true)) = true
{this.notified= true
ThreadObjectUtil.getInstance()!!.notifyObject(this)
this.repaint()
}


                @Throws(Exception::class)
            
open fun waitOnNotify(wait: Long)
        //nullable = true from not(false or (false and false)) = true
{

                    var wait = wait

    
                        if(!this.notified)
                        
                                    {
                                    
    
                        if(wait > 0)
                        
                                    {
                                    threadObjectUtil!!.waitObject(this, wait.toLong())

                                    }
                                
                        else {
                            threadObjectUtil!!.waitObject(this)

                        }
                            

                                    }
                                
}


    private val PAUSE_SLEEP: String = "pause sleep"

                @Throws(Exception::class)
            
open fun processSleep()
        //nullable = true from not(false or (false and true)) = true
{Thread.sleep(pauseWait)
}


open fun isPausable()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            
open fun processGameSleep(sleep: Long)
        //nullable = true from not(false or (false and false)) = true
{

                    var sleep = sleep
Thread.sleep(sleep)
}


    private val START_PAUSE: String = "start pause - game thread sleep at: "

    private val END_PAUSE: String = "end pause - game thread sleep at: "

    private val PROCESS_LOOP_SLEEP: String = "processLoopSleep"

                @Throws(Exception::class)
            
open fun processLoopSleep()
        //nullable = true from not(false or (false and true)) = true
{this.runnableCanvasRefreshHelper!!.process()

    
                        if(this.isPaused() && this.isRunning() && !this.isSingleThread())
                        
                                    {
                                    
    var stringMaker: StringMaker = StringMaker()

logUtil!!.put(stringMaker!!.append(START_PAUSE)!!.append(System.currentTimeMillis())!!.append(PAUSE_SLEEP)!!.append(this.pauseWait)!!.toString(), this, PROCESS_LOOP_SLEEP)

        while(this.isPaused() && this.isRunning() && !this.isSingleThread())
        {this.processSleep()

    
                        if(!this.isPausable())
                        
                                    {
                                    stringMaker!!.delete(0, stringMaker!!.length())
logUtil!!.put(stringMaker!!.append(END_PAUSE)!!.append(System.currentTimeMillis())!!.toString(), this, PROCESS_LOOP_SLEEP)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                
}


                                    }
                                

    var elapsedTime: Long = this.loopTimeHelper!!.getElapsed()!!
            


    var wait: Long = this.loopTimeHelper!!.delay.toLong()


    
                        if(elapsedTime > wait)
                        
                                    {
                                    elapsedTime= wait

                                    }
                                
                        else {
                            processGameSleep(wait -elapsedTime)

                        }
                            
}


open fun isSingleThread()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

override fun run()
        //nullable = true from not(false or (false and true)) = true
{this.setCurrentThread()
}


                @Throws(Exception::class)
            
open fun end2()
        //nullable = true from not(false or (false and true)) = true
{}


open fun getType()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}


}
                
            

