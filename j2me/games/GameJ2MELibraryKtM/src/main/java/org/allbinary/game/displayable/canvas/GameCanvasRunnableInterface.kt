
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import javax.microedition.lcdui.CommandListener
import javax.microedition.lcdui.ItemStateListener
import org.allbinary.game.state.GameStateCompositeInterface
import org.allbinary.graphics.paint.PaintableInterface
import org.allbinary.thread.RunnableInterface
interface GameCanvasRunnableInterface : RunnableInterface, PaintableInterface, ItemStateListener, GameStateCompositeInterface {
        

open fun getTitle()
        //nullable = true from not(false or (false and true)) = true
: String

open fun isInitialized()
        //nullable = true from not(false or (false and true)) = true
: Boolean

open fun isPaused()
        //nullable = true from not(false or (false and true)) = true
: Boolean

open fun unPause()
        //nullable = true from not(false or (false and true)) = true


open fun pause()
        //nullable = true from not(false or (false and true)) = true


open fun isHighScoreSubmitted()
        //nullable = true from not(false or (false and true)) = true
: Boolean

                @Throws(Exception::class)
            
open fun setHighScoreSubmitted(highScoreSubmitted: Boolean)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
open fun setGameOver()
        //nullable = true from not(false or (false and true)) = true


open fun isGameOver()
        //nullable = true from not(false or (false and true)) = true
: Boolean

open fun initCommands(cmdListener: CommandListener)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
open fun getCurrentStateHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>

                @Throws(Exception::class)
            
open fun getLoadStateHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>

                @Throws(Exception::class)
            
open fun setLoadStateHashtable(hashtable: Hashtable<Any, Any>)
        //nullable = true from not(false or (false and false)) = true


open fun getType()
        //nullable = true from not(false or (false and true)) = true
: Int

}
                
            

