
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
        package org.allbinary.game.displayable.canvas




        import java.lang.Object        
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import javax.microedition.lcdui.CommandListener
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.Item
import org.allbinary.game.state.GameState
import org.allbinary.logic.NullUtil
import org.allbinary.logic.string.StringUtil

open public class NullGameCanvasRunnable
            : Object
        
                , GameCanvasRunnableInterface {
        

        companion object {
            
    val NULL_GAME_CANVAS_RUNNABLE: NullGameCanvasRunnable = NullGameCanvasRunnable()

        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        override fun getTitle()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING
}

override fun isInitialized()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

override fun isPaused()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

override fun unPause()
        //nullable = true from not(false or (false and true)) = true
{
}

override fun pause()
        //nullable = true from not(false or (false and true)) = true
{
}

override fun isHighScoreSubmitted()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            override fun setHighScoreSubmitted(highScoreSubmitted: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var highScoreSubmitted = highScoreSubmitted
}


                @Throws(Exception::class)
            override fun setGameOver()
        //nullable = true from not(false or (false and true)) = true
{
}

override fun isGameOver()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

override fun initCommands(cmdListener: CommandListener)
        //nullable = true from not(false or (false and false)) = true
{
var cmdListener = cmdListener
}


                @Throws(Exception::class)
            override fun getCurrentStateHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullUtil.getInstance()!!.NULL_TABLE
}


                @Throws(Exception::class)
            override fun getLoadStateHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullUtil.getInstance()!!.NULL_TABLE
}


                @Throws(Exception::class)
            override fun setLoadStateHashtable(hashtable: Hashtable<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{
var hashtable = hashtable
}

override fun getType()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}


                @Throws(Exception::class)
            override fun setGameState(gameState: GameState)
        //nullable = true from not(false or (false and false)) = true
{
var gameState = gameState
}

override fun getGameState()
        //nullable = true from not(false or (false and true)) = true
: GameState{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GameState.NO_GAME_STATE
}

override fun itemStateChanged(item: Item)
        //nullable = true from not(false or (false and false)) = true
{
var item = item
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
}

override fun paintThreed(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
}

override fun isRunning()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

override fun setRunning(isRunning: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var isRunning = isRunning
}


                @Throws(Exception::class)
            override fun setThread(thread: Thread)
        //nullable = true from not(false or (false and false)) = true
{
var thread = thread
}

override fun run()
        //nullable = true from not(false or (false and true)) = true
{
}


}
                
            

