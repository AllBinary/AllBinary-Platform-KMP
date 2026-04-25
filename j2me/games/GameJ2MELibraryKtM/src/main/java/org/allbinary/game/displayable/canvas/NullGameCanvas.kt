
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
import javax.microedition.lcdui.NullCommandListener
import org.allbinary.game.init.BasicBuildGameInitializerFactory
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.game.score.NoHighScoresFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class NullGameCanvas : AllBinaryGameCanvas {
        
companion object {
            
    open fun create()
        //nullable = true from not(false or (false and true)) = true
: NullGameCanvas{

        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullGameCanvas(AllBinaryGameLayerManager.NULL_ALLBINARY_LAYER_MANAGER)
} catch(e: Exception)
            {
LogUtil.getInstance()!!.put(CommonStrings.getInstance()!!.EXCEPTION, "NullGameCanvas", CommonStrings.getInstance()!!.GET_INSTANCE, e)



                            throw RuntimeException()
}

}


    private val SINGLETON: NullGameCanvas = create()!!

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: NullGameCanvas{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


                @Throws(Exception::class)
            
    open fun getInstance(gameLayerManager: AllBinaryGameLayerManager)
        //nullable =  from not(true or (false and false)) = 
: NullGameCanvas{
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
            protected constructor (gameLayerManager: AllBinaryGameLayerManager)                        

                            : super(NullCommandListener.NULL_COMMAND_LISTENER, gameLayerManager, NoHighScoresFactory.getInstance(), BasicBuildGameInitializerFactory.NULL_BASE_BUILD_GMAE_INITIALIZER_FACTORY, false){
    //var gameLayerManager = gameLayerManager


                            //For kotlin this is before the body of the constructor.
                    
super.setWait(1200)
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    override fun isGameOver()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    private var running: Boolean = true

    override fun setRunning(running: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var running = running
this.running= running
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    override fun isRunning()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return running
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    override fun pause()
        //nullable = true from not(false or (false and true)) = true
{
this.setPaused(true)
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    override fun unPause()
        //nullable = true from not(false or (false and true)) = true
{
this.setPaused(false)
}


    override fun initCommands(cmdListener: CommandListener)
        //nullable = true from not(false or (false and false)) = true
{
    //var cmdListener = cmdListener
this.removeAllCommands()
this.setCommandListener(cmdListener)
}


                @Throws(Exception::class)
            
    override fun buildGame(isProgress: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
    //var isProgress = isProgress
}


    override fun draw(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
}


    override fun run()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            this.logUtil!!.putF(commonStrings!!.START_RUNNABLE, this, commonStrings!!.RUN)
this.logUtil!!.putF(commonStrings!!.END_RUNNABLE, this, commonStrings!!.RUN)
} catch(e: Exception)
            {
this.logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}


    override fun getType()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TYPE
}


}
                
            

