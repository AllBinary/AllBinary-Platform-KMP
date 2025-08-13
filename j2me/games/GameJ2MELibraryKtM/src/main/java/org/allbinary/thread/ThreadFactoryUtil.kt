
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
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.canvas.RunnableCanvas
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.HTMLFeatureFactory
import org.allbinary.game.displayable.canvas.AllBinaryGameCanvas
import org.allbinary.game.displayable.canvas.DemoCanvas
import org.allbinary.game.displayable.canvas.GameCanvasRunnableInterface
import org.allbinary.game.displayable.canvas.RunnableCanvasSingleThreadStartRunnable
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings

open public class ThreadFactoryUtil
            : Object
         {
        

        companion object {
            
    private val instance: ThreadFactoryUtil = ThreadFactoryUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ThreadFactoryUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

open fun getInstance(runnable: GameCanvasRunnableInterface)
        //nullable =  from not(true or (false and false)) = 
: Thread{

                    var runnable = runnable



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getInstance(runnable, runnable.getType())
}


open fun getInstance(runnable: ABRunnable)
        //nullable =  from not(true or (false and false)) = 
: Thread{

                    var runnable = runnable



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getInstance(runnable, runnable.getType())
}


open fun getInstance(runnable: Runnable, type: Int)
        //nullable =  from not(true or (false and false)) = 
: Thread{

                    var runnable = runnable


                    var type = type

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            


    var features: Features = Features.getInstance()!!
            


    
                        if(features.isDefault(HTMLFeatureFactory.getInstance()!!.HTML))
                        
                                    {
                                    
    
                        if(type == DemoCanvas.TYPE || type == AllBinaryGameCanvas.TYPE)
                        
                                    {
                                    
    var demoGameSingleThreadStartRunnable: RunnableCanvasSingleThreadStartRunnable = RunnableCanvasSingleThreadStartRunnable(runnable as RunnableCanvas)

PreLogUtil.put(StringMaker().
                            append(
                            "Using Pseudo Thread for DemoCanvas/AllBinaryGameCanvas under PlayN/HTML5: ")!!.append(StringUtil.getInstance()!!.toString(runnable))!!.toString(), this, commonStrings!!.CONSTRUCTOR)

    var primaryThreadPool: ThreadPool = PrimaryThreadPool.getInstance()!!
            

primaryThreadPool!!.runTask(demoGameSingleThreadStartRunnable)

                                    }
                                
                        else {
                            PreLogUtil.put(StringMaker().
                            append(
                            "Using Pseudo Thread for Runnable under PlayN/HTML5: ")!!.append(StringUtil.getInstance()!!.toString(runnable))!!.toString(), this, commonStrings!!.CONSTRUCTOR)

    var primaryThreadPool: ThreadPool = PrimaryThreadPool.getInstance()!!
            

primaryThreadPool!!.runTask(runnable)

                        }
                            

                                    }
                                

    var thread: Thread = Thread(runnable, runnable.toString())

logUtil!!.put(thread.toString(), this, commonStrings!!.CONSTRUCTOR)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return thread
}


open fun start(thread: Thread)
        //nullable = true from not(false or (false and false)) = true
{

                    var thread = thread
thread.start()
}


}
                
            

