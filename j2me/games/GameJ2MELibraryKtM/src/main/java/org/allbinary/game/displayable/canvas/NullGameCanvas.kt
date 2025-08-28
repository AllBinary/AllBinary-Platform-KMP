
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
        package org.allbinary.game.displayable.canvas




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.CommandListener
import javax.microedition.lcdui.Graphics
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.logic.communication.log.LogUtil

open public class NullGameCanvas : AllBinaryGameCanvas {
        

        companion object {
            
    private val SINGLETON: NullGameCanvas = NullGameCanvas()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: NullGameCanvas

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


open fun getInstance(gameLayerManager: AllBinaryGameLayerManager)
        //nullable =  from not(true or (false and false)) = 
: NullGameCanvas

        Updates for KMP build        
        {
    //var gameLayerManager = gameLayerManager

    var nullGameCanvas: NullGameCanvas = NullGameCanvas(gameLayerManager)

nullGameCanvas!!.setInitialized(true)
nullGameCanvas!!.setTitle(NO_GAME)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return nullGameCanvas
}


    val NO_GAME: String = "No Background Game"

    val TYPE: Int = 1

        }
            protected constructor        (gameLayerManager: AllBinaryGameLayerManager)                        

                            : super(gameLayerManager)

        Updates for KMP build        
        {
    //var gameLayerManager = gameLayerManager


                            //For kotlin this is before the body of the constructor.
                    
super.setWait(1200)
}

private constructor        ()

        Updates for KMP build        
        {
super.setWait(1200)
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
override fun isGameOver()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    private var running: Boolean = true
override fun setRunning(running: Boolean)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var running = running
this.running= running
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
override fun isRunning()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return running
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
override fun pause()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.setPaused(true)
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
override fun unPause()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.setPaused(false)
}

override fun initCommands(cmdListener: CommandListener)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var cmdListener = cmdListener
this.removeAllCommands()
this.setCommandListener(cmdListener)
}


                @Throws(Exception::class)
            override fun buildGame(isProgress: Boolean)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var isProgress = isProgress
}

override fun draw(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var graphics = graphics
}

override fun run()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

        try {
            logUtil!!.put(commonStrings!!.START_RUNNABLE, this, commonStrings!!.RUN)
logUtil!!.put(commonStrings!!.END_RUNNABLE, this, commonStrings!!.RUN)
} catch(e: Exception)
            

        Updates for KMP build        
        {
logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}

override fun getType()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TYPE
}


}
                
            

